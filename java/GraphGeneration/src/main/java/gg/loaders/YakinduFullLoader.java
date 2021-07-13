package gg.loaders;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class YakinduFullLoader {
	
	private static ResourceSet yakindu = null;

	public Resource load(String xmi) throws IOException {
		initYakindu();
		Resource r = new XMIResourceImpl();
		r.load(new ByteArrayInputStream(xmi.getBytes()), null);
		return r;
	}
	
	public Resource load(File xmi) throws IOException {
		initYakindu();
		Resource r = new XMIResourceImpl();
		// TO DO: deal with it in a more formal manner
		try {
			r.load(new FileInputStream(xmi), null);
		} catch (Exception e) {
			return r;
		}
		
		return r;
	}
	
	public static ResourceSet initYakindu() {
		if (yakindu != null) {
			return yakindu;
		}
		
		ResourceSet rs = new ResourceSetImpl();
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/base.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/Expressions.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/sexec.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/sexec_trace.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/sgen.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/sgraph.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/SText.ecore");
		readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/types.ecore");
		//readResource(rs, "/home/antolin/wakame/RealisticModels/java/GraphGeneration/src/main/resources/models/yakindu_complete/gmf_notation.ecore");

		return rs;
	}

	private static Resource readResource(ResourceSet rs, String name) {
		//URL url = YakinduFullLoader.class.getResource(name);
		//if (url == null)
		//	throw new IllegalStateException("Can't access " + name);
		Resource r = rs.getResource(URI.createFileURI(name), true);
		//r.load(url.openStream(), null);
		r.getAllContents().forEachRemaining(o -> {
			if (o instanceof EPackage) {
				EPackage pkg = (EPackage) o;
				EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
			}
		});
		return r;
	}
}
