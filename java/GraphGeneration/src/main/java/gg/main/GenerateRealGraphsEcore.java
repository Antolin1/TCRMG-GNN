package gg.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import gg.core.GraphModel;
import gg.core.IMetaFilter;
import gg.core.MetaFilterLiterals;
import gg.core.Parser;
import com.google.gson.Gson;



public class GenerateRealGraphsEcore {

	public static void main(String[] args) throws CsvValidationException, IOException {
		
		if (args.length != 4) {
			System.err.println("The path to stats");
			System.err.println("The destination folder is needed");
			System.err.println("Prefix is needed");
			System.err.println("Folder selected ecore");
			return;
		}
		String stats = args[0];
		String folderOut = args[1];
		String prefix = args[2];
		String folderOutEcore = args[3];
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		IMetaFilter mf = MetaFilterLiterals.getEcoreFilter();
		Parser parser = new Parser(mf);
		Random random = new Random();
		Gson gson = new Gson();
		random.setSeed(123);
		
		LinkedList<String> files = new LinkedList<String>();
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader(stats));
	        String[] line;
	        while ((line = reader.readNext()) != null) {        
	        	if (!line[0].equals("id"))
	        		files.add(line[0]);		
	           }
	    } catch (IOException e) {
	            e.printStackTrace();
	    }
		
		//filter errors in parse .ecore, contains proxies, subpackages, and just one root
		List<Resource> resources = files.stream().map(file -> {
			File f = new File(prefix+file);
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = null;
			try {
				resource = rs.getResource(URI.createFileURI(f.getAbsolutePath()), true);
			} catch (Exception e) {
				return null;
			}
			
		    return resource;
		}).filter(r -> r!=null).filter(r -> !containsProxy(r)).
				filter(r -> !containsSubpackages(r)).
				filter(r -> onlyOneRoot(r)).
				filter(r -> !containsSpecialAttributes(r)).
				collect(Collectors.toList());
		
		System.out.println(resources.size());
		
		//select and save the models
		
		//to graphs <----
		List<GraphModel> graphModels = resources.stream().map(r -> {
		    return parser.parse(r,r.getURI().toFileString());
		}).filter(gm -> (!containsMoreThanOnePackage(gm)) && gm.getNodes().size()>=4).collect(Collectors.toList());
		
		graphModels = sample(graphModels, 500, random);

		//save graphs
		int i = 0;
		for (GraphModel gm : graphModels) {
//			if (containsMoreThanOnePackage(gm))
//				continue;
//			if (gm.getNodes().size()<4)
//				continue;
		    String output = gson.toJson(gm);
		    PrintWriter out = new PrintWriter(folderOut+Integer.toString(i)+".json");
		    i = i + 1;
		    out.println(output);			
	    	out.close();
	    	FileUtils.copyFile(new File(gm.getName()), new File(folderOutEcore+Integer.toString(i)+".ecore"));
		}
	}
	
	public static boolean containsMoreThanOnePackage(GraphModel gm) {
		return gm.getNodeTypes().values().stream().filter(p -> p.equals("EPackage")).count() > 1;
	}
	
	public static <E> List<E> pickNRandomElements(List<E> list, int n, Random r) {
	    int length = list.size();
	    if (length < n) return null;
	    for (int i = length - 1; i >= length - n; --i)
	    {
	        Collections.swap(list, i , r.nextInt(i + 1));
	    }
	    return list.subList(length - n, length);
	}

	public static <E> List<E> pickNRandomElements(List<E> list, int n) {
	    return pickNRandomElements(list, n, ThreadLocalRandom.current());
	}
	
	public static <E> List<E> sample(List<E> list, int n, Random r){
		Collections.shuffle(list, r);
		if (n > list.size())
			return list;
		return list.subList(0, n);
	}
	
	public static boolean containsProxy(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj.eIsProxy()) {
				return true;
			}
			for (EStructuralFeature f : obj.eClass().getEAllStructuralFeatures()) {
				if (f instanceof EReference && f.isMany()) {
					Collection<EObject> elements = (Collection<EObject>) obj.eGet(f);
					for (EObject e : elements) {
						if ((e != null && e.eIsProxy()))
							return true;
					}
				}
				if (f instanceof EReference && !f.isMany()) {
					EObject element = (EObject) obj.eGet(f);
					if ((element != null && element.eIsProxy()))
						return true;
				}
			}
		}
		return false;
	}
	
	public static boolean containsSubpackages(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof EPackage) {
				EPackage objp = (EPackage) obj;
				if (!objp.getESubpackages().isEmpty())
					return true;
				if (objp.getESuperPackage()!=null) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean onlyOneRoot(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		int pack = 0;
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof EPackage) {
				pack = pack + 1;
			}
		}
		return pack == 1;
	}
	
	public static int numberOfElements(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		int cont = 0;
		while (it.hasNext()) {
			EObject obj = it.next();
			cont = cont + 1;
		}
		return cont;
	}
	
	public static boolean containsSpecialAttributes(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof EAttribute) {
				EAttribute ea = (EAttribute) obj;
				EDataType edt = ea.getEAttributeType();
				if (EcorePackage.eINSTANCE.getEClassifiers().stream().filter(c -> c instanceof EDataType).collect(Collectors.toList()).contains(edt))
					return true;
			}
		}
		return false;
	}


}
