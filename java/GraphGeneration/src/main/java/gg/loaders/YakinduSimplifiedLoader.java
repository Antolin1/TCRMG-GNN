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

public class YakinduSimplifiedLoader {
	private static ResourceSet yakindu = null;

	public Resource load(String xmi) throws IOException {
		initBPMN();
		Resource r = new XMIResourceImpl();
		r.load(new ByteArrayInputStream(xmi.getBytes()), null);
		return r;
	}
	
	public Resource load(File xmi) throws IOException {
		initBPMN();
		Resource r = new XMIResourceImpl();
		r.load(new FileInputStream(xmi), null);
		return r;
	}
	
	public static ResourceSet initBPMN() {
		if (yakindu != null) {
			return yakindu;
		}
		
		ResourceSet rs = new ResourceSetImpl();
		readResource(rs, "/models/yakinduSimplified.ecore");

		return rs;
	}

	private static Resource readResource(ResourceSet rs, String name) {
		URL url = YakinduSimplifiedLoader.class.getResource(name);
		if (url == null)
			throw new IllegalStateException("Can't access " + name);
		try {
			Resource r = rs.createResource(URI.createURI(name));
			r.load(url.openStream(), null);
			r.getAllContents().forEachRemaining(o -> {
				if (o instanceof EPackage) {
					EPackage pkg = (EPackage) o;
					EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
				}
			});
			return r;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
