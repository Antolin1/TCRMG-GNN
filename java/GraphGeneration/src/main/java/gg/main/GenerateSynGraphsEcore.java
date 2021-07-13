package gg.main;

import java.io.File;
import java.io.FileNotFoundException;
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
import gg.core.IMetaFilter;
import gg.core.MetaFilterLiterals;
import gg.core.Parser;
import gg.loaders.SmallEcoreLoader;

public class GenerateSynGraphsEcore {
	public static void main(String[] args) throws IOException {
		
		String folderInput = args[0];
		String folderOutput = args[1];
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		IMetaFilter mf = MetaFilterLiterals.getEcoreFilter();
		Parser parser = new Parser(mf);
		Parser parser2 = new Parser(MetaFilterLiterals.getNoFilter());
		Gson gson = new Gson();
		SmallEcoreLoader sel = new SmallEcoreLoader();
		
		File folderF = new File(folderInput);
		int i = 0;
		for (File file : folderF.listFiles()) {
			if (file.isDirectory())
				continue;
			if (FilenameUtils.getExtension(file.getAbsolutePath()).equals("ecore")) {
				ResourceSet rs = new ResourceSetImpl();
				Resource resource = null;
				resource = rs.getResource(URI.createFileURI(file.getAbsolutePath()), true);
				GraphModel gm = parser.parse(resource, file.getName());
				String output = gson.toJson(gm);
			    PrintWriter out = new PrintWriter(folderOutput+Integer.toString(i)+".json");
			    i = i + 1;
			    out.println(output);			
		    	out.close();
			} else {
				Resource resource = sel.load(file);
			    GraphModel gm = parser2.parse(resource, file.getName());
			    PrintWriter out = new PrintWriter(folderOutput+"/"+Integer.toString(i)+".json");
			    out.println(gson.toJson(gm));			
		    	out.close();
		    	i = i + 1;
			}
		}
	}
}
