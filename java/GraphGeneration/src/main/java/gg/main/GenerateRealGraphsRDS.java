package gg.main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.Gson;

import gg.core.GraphModel;
import gg.core.MetaFilterNames;
import gg.core.Parser;
import gg.loaders.RdsFull;
import gg.loaders.YakinduFullLoader;

public class GenerateRealGraphsRDS {
	
	public static void main(String[] args) throws IOException {

		if (args.length != 3) {
			System.err.println("The path to models");
			System.err.println("The destination folder is needed");
			System.err.println("Folder selected");
			return;
		}
		String inputFolder = args[0];
		String outFolder = args[1];
		String folderOut = args[2];
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		MetaFilterNames mf = MetaFilterNames.getRDSFilter();
		Parser parser = new Parser(mf);
		Gson gson = new Gson();
		RdsFull sel = new RdsFull();
		
		File folderF = new File(inputFolder);
		
		List<GraphModel> list = new ArrayList<GraphModel>();
		for (File file : folderF.listFiles()) {
			Resource resource = null;
			try {
				resource = sel.load(file);
			} catch (Exception e) {
				System.err.println(file.getName());
				continue;
			}
		    GraphModel gm = parser.parse(resource, file.getAbsolutePath());
		    if (gm.getNodes().size() >= 4) {
		    	list.add(gm);
		    }
		}
		int i = 0;
		list = GenerateRealGraphsEcore.sample(list, 500, new Random(123));
		for (GraphModel gm : list) {
			String output = gson.toJson(gm);
		    PrintWriter out = new PrintWriter(outFolder+Integer.toString(i)+".json");
		    out.println(output);			
	    	out.close();
	    	FileUtils.copyFile(new File(gm.getName()), new File(folderOut+Integer.toString(i)+".xmi"));
	    	i = i + 1;
		}
	}
	
}
