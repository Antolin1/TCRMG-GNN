package gg.main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.Gson;

import gg.core.GraphModel;
import gg.core.MetaFilterLiterals;
import gg.core.Parser;
import gg.loaders.SmallEcoreLoader;
import gg.loaders.YakinduSimplifiedLoader;

public class GenerateSynGraphsYakindu {
	
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("The path to input folder");
			System.err.println("The destination folder is needed");
		}
		String inputFolder = args[0];
		String outFOlder = args[1];

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		Parser parser = new Parser(MetaFilterLiterals.getNoFilter());
		Gson gson = new Gson();
		YakinduSimplifiedLoader sel = new YakinduSimplifiedLoader();
		
		File folderF = new File(inputFolder);
		int i = 0;
		for (File file : folderF.listFiles()) {
			//xmi take care, extension!!!!!!!!!!!!!!!!
			if (file.isDirectory())
				continue;
			if (FilenameUtils.getExtension(file.getAbsolutePath()).equals("sct") || FilenameUtils.getExtension(file.getAbsolutePath()).equals("xmi")) {
			    Resource resource = sel.load(file);
			    GraphModel gm = parser.parse(resource, file.getName());
			    
			    PrintWriter out = new PrintWriter(outFOlder+"/"+Integer.toString(i)+".json");
			    out.println(gson.toJson(gm));			
		    	out.close();
		    	i = i + 1;
		    	}
		}
		
	}
}
