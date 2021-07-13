package gg.core;

import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import gg.core.IMetaFilter.UniversalSet;

public class MetaFilterNames implements IMetaFilter {

	private HashSet<String> references = new HashSet<String>();
	private HashSet<String> attributes = new HashSet<String>();
	private HashSet<String> classes = new HashSet<String>();
	
	private MetaFilterNames() {

	}
	
	@Override
	public boolean passFilterObject(EObject o) {
		EClass c = o.eClass();
		
		if (classes instanceof UniversalSet)
			return true;
		
		if (classes.contains(c.getName()))
			return true;
		
		List<EClass> supertypes = c.getEAllSuperTypes();
		for (EClass eClass : supertypes) {
			if (classes.contains(eClass.getName()))
				return true;
		}
		
		return false;
	}

	@Override
	public boolean passFilerStructural(EObject o) {
		
		if (o instanceof EReference) {
			EReference eo = (EReference) o;
			String search = eo.getEContainingClass().getName() + ":" + eo.getName();
			if (references.contains(search))
				return true;
		} else if (o instanceof EAttribute) {
			EAttribute ea = (EAttribute) o;
			String search = ea.getEContainingClass().getName() + ":" + ea.getName();
			if (attributes.contains(search))
				return true;
		}
		
		return false;
	}
	
	public static MetaFilterNames getYakinduFilter() {
		MetaFilterNames mf = new MetaFilterNames();
		
		mf.classes.add("Transition");
		mf.classes.add("Pseudostate");
		mf.classes.add("RegularState");
		mf.classes.add("Region");
		mf.classes.add("CompositeElement");
		
		mf.attributes = new UniversalSet<String>();
		
		
		//mf.references = new UniversalSet<String>();
		mf.references.add("Vertex:incomingTransitions");
		mf.references.add("Vertex:outgoingTransitions");
		mf.references.add("Region:vertices");
		mf.references.add("Transition:target");
		mf.references.add("Transition:source");
		mf.references.add("CompositeElement:regions");
		
		return mf;
	}
	
	public static MetaFilterNames getRDSFilter() {
		MetaFilterNames mf = new MetaFilterNames();
		
		mf.classes.add("Database");
		mf.classes.add("Reference");
		mf.classes.add("Column");
		mf.classes.add("Table");
		mf.classes.add("Index");
		mf.classes.add("IndexColumn");
		
		mf.attributes = new UniversalSet<String>();
		
		
		//mf.references = new UniversalSet<String>();
		mf.references.add("Database:elements");
		mf.references.add("Table:columns");
		mf.references.add("Table:indexes");
		mf.references.add("Column:foreignReferences");
		mf.references.add("Column:primaryReferences");
		mf.references.add("Reference:foreignKeyColumns");
		mf.references.add("Reference:primaryKeyColumns");
		mf.references.add("Index:indexColumns");
		mf.references.add("IndexColumn:column");
		return mf;
	}

}
