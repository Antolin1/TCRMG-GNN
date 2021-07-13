package gg.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;

import gg.core.GraphModel.EdgeJson;






public class Parser {
	
	private IMetaFilter mf;
	
	public Parser(IMetaFilter mf) {
		this.mf = mf;
	}
	
	public GraphModel parse(Resource r, String name) {
		
		Graph<Node, Edge> g = GraphTypeBuilder.<Node, Edge>directed().allowingMultipleEdges(true)
				.allowingSelfLoops(true).edgeClass(Edge.class).buildGraph();
		
		TreeIterator<EObject> it = r.getAllContents();
		List<Node> visited = new ArrayList<Node>();
		while (it.hasNext()) {
			EObject obj = it.next();
			
			if (obj.eIsProxy()) {
				continue;
			}

			if (obj != null && mf.passFilterObject(obj)) {
				Node n1 = new Node(obj);
				g.addVertex(n1);
				visited.add(n1);
				
				for (EStructuralFeature f : obj.eClass().getEAllStructuralFeatures()) {
					if (f.isDerived())
						continue;
					// ignore the structural feature (attribute or reference)
					if (!mf.passFilerStructural(f))
						continue;
					
					if (f instanceof EReference && f.isMany()) {
						Collection<EObject> elements = (Collection<EObject>) obj.eGet(f);
						for (EObject e : elements) {
							// ignore the class
							if (e != null && !mf.passFilterObject(e))
								continue;
							if (e != null && e.eIsProxy())
								continue;

							if (e != null) {
								Node n2 = new Node(e);
								g.addVertex(n2);
								g.addEdge(n1, n2, new Edge(f.getName()));
							}
						}
						continue;
					}
					
					// take the reference
					if (f instanceof EReference && !f.isMany()) {
						EObject element = (EObject) obj.eGet(f);
						// ignore the class
						if (element != null &&!mf.passFilterObject(element))
							continue;
						if (element != null && element.eIsProxy())
							continue;
						if (element != null) {
							Node n2 = new Node(element);
							g.addVertex(n2);
							g.addEdge(n1, n2, new Edge(f.getName()));
							continue;
						}
					}
				}
				
			}
		}
		
		Set<Node> nodesLeft = g.vertexSet().stream().filter(n -> !visited.contains(n)).collect(Collectors.toSet());
		for (Node n: nodesLeft) {
			EObject obj = (EObject) n.getElement();
			if (obj.eIsProxy())
				continue;
			for (EStructuralFeature f : obj.eClass().getEAllStructuralFeatures()) {
				if (f.isDerived())
					continue;
				// ignore the structural feature (attribute or reference)
				if (!mf.passFilerStructural(f))
					continue;
				if (f instanceof EReference && f.isMany()) {
					Collection<EObject> elements = (Collection<EObject>) obj.eGet(f);
					for (EObject e : elements) {
						// ignore the class
						if (e != null && !mf.passFilterObject(e))
							continue;
						if (e != null && e.eIsProxy())
							continue;

						if (e != null) {
							Node n2 = new Node(e);
							g.addVertex(n2);
							g.addEdge(n, n2, new Edge(f.getName()));
						}
					}
					continue;
				}
				// take the reference
				if (f instanceof EReference && !f.isMany()) {
					EObject element = (EObject) obj.eGet(f);
					// ignore the class
					if (element != null &&!mf.passFilterObject(element))
						continue;
					if (element != null && element.eIsProxy())
						continue;
					if (element != null) {
						Node n2 = new Node(element);
						g.addVertex(n2);
						g.addEdge(n, n2, new Edge(f.getName()));
						continue;
					}
				}
			}
		}
		
		if (r.getURI() != null)
			return new GraphModel(g, r.getURI().toFileString());
		return new GraphModel(g, name);
	}
	
	public Resource toEcore(GraphModel gm) {
		
		HashMap<String,EClass> correspondence = new HashMap<String,EClass>();
		correspondence.put("EClass", EcorePackage.Literals.ECLASS);
		correspondence.put("EPackage", EcorePackage.Literals.EPACKAGE);
		correspondence.put("EReference", EcorePackage.Literals.EREFERENCE);
		correspondence.put("EAttribute", EcorePackage.Literals.EATTRIBUTE);
		correspondence.put("EDataType", EcorePackage.Literals.EDATA_TYPE);
		correspondence.put("EEnum", EcorePackage.Literals.EENUM);
		correspondence.put("EOperation", EcorePackage.Literals.EOPERATION);
		correspondence.put("EParameter", EcorePackage.Literals.EPARAMETER);
		correspondence.put("ETypeParameter", EcorePackage.Literals.ETYPE_PARAMETER);
		correspondence.put("EEnumLiteral", EcorePackage.Literals.EENUM_LITERAL);
		
		HashMap<Integer,EObject> nodeCorr = new HashMap<Integer,EObject>();
		for (Entry<Integer,String> entry : gm.getNodeTypes().entrySet()) {
			EObject o = EcoreUtil.create(correspondence.get(entry.getValue()));
			nodeCorr.put(entry.getKey(), o);
			if (o instanceof ENamedElement)
				((ENamedElement)o).setName(o.eClass().getName() + Integer.toString(entry.getKey()));
			if (o instanceof EPackage) {
				((EPackage)o).setNsPrefix("prefix" + Integer.toString(entry.getKey()));
				((EPackage)o).setNsURI("uri" + Integer.toString(entry.getKey()));
			}
			if (o instanceof EDataType) {
				((EDataType)o).setInstanceClassName("instance" + Integer.toString(entry.getKey()));
				((EDataType)o).setInstanceTypeName("type" + Integer.toString(entry.getKey()));
			}
		}
		
		for (EdgeJson edge : gm.getEdges()) {
			String name = edge.getName();
			int source = edge.getSource();
			int target = edge.getTarget();
			EObject eos = nodeCorr.get(source);
			EObject eot = nodeCorr.get(target);
			EReference esf = (EReference) eos.eClass().getEStructuralFeature(name);
			if (!esf.isChangeable())
				continue;
			if (esf.isMany()) {
				Collection<EObject> elements = (Collection<EObject>) eos.eGet(esf);
				elements.add(eot);
			}else {
				eos.eSet(esf, eot);
			}
		}
		
		Resource r = new ResourceImpl();
		r.getContents().addAll((Collection<? extends EObject>) nodeCorr.values().stream().filter(e -> e.eContainer()==null).collect(Collectors.toList()));
		return r;
	}
	
	public boolean hasError(Resource r) {
		for (EObject o : r.getContents()) {
			Diagnostic d = null;
			try {
				d = Diagnostician.INSTANCE.validate(o);
			} catch (Exception e) {
				return true;
			}
			if (d.getSeverity() == Diagnostic.ERROR)
				return true;
		}
		return false;
	}
	
	
	public static class Node {
		
		EObject object;

		public Node(EObject object) {
			super();
			this.object = object;
		}

		public EObject getElement() {
			return object;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((object == null) ? 0 : object.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (object == null) {
				if (other.object != null)
					return false;
			} else if (!object.equals(other.object))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return object.eClass().getName();
		}
		
		
	}
	
	public static class Edge extends DefaultEdge {
		
		String label;

		public Edge(String label) {
			super();
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
		
		
		
		
	}

}
