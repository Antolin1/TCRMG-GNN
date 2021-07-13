package gg.main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.Gson;

import gg.core.GraphModel;
import gg.core.MetaFilterLiterals;
import gg.core.MetaFilterNames;
import gg.core.Parser;
import gg.loaders.YakinduFullLoader;
import gg.loaders.YakinduSimplifiedLoader;

public class GenerateRealGraphsYakindu {

	public static void main(String[] args) throws IOException {
		String inputFolder = args[0];
		String outFolder = args[1];

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		MetaFilterNames mf = MetaFilterNames.getYakinduFilter();
		Parser parser = new Parser(mf);
		Gson gson = new Gson();
		//SmallEcoreLoader sel = new SmallEcoreLoader(); //
		YakinduFullLoader sel = new YakinduFullLoader();

		
		File folderF = new File(inputFolder);
		int i = 0;
		for (File file : folderF.listFiles()) {
			Resource resource = sel.load(file);
			System.out.println(file.getName());
		    GraphModel gm = parser.parse(resource, file.getName());
		    if (gm.getNodes().size() >= 4) {
		    	PrintWriter out = new PrintWriter(outFolder+"/"+Integer.toString(i)+".json");
			    out.println(gson.toJson(gm));			
		    	out.close();
		    	i = i + 1;
		    }
		}

	}

}
