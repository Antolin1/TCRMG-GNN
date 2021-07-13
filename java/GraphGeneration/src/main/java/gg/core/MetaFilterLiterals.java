package gg.core;

import java.util.HashSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;



public class MetaFilterLiterals implements IMetaFilter{
	
	private HashSet<EReference> ereferences = new HashSet<EReference>();
	private HashSet<EAttribute> eattribute = new HashSet<EAttribute>();
	private HashSet<EClass> eclasses = new HashSet<EClass>();
	
	
	public boolean passFilterObject(EObject o) {
		if (eclasses instanceof UniversalSet)
			return true;
		for (EClass eclass : eclasses) 
			if (eclass.isInstance(o))
				return true;
		return false;
	}
	
	public boolean passFilerStructural(EObject o) {
		if (o instanceof EReference) {
			return ereferences.contains(o);
		} else if ( o instanceof EAttribute) {
			return eattribute.contains(o);
		}
			return false;
	}
	
	public static MetaFilterLiterals getEcoreFilter() {
		//Ecore
		MetaFilterLiterals mf = new MetaFilterLiterals();
		mf.eattribute.add(EcorePackage.Literals.ENAMED_ELEMENT__NAME);
		mf.eclasses.add(EcorePackage.Literals.ECLASSIFIER);
		mf.eclasses.add(EcorePackage.Literals.ESTRUCTURAL_FEATURE);
		mf.eclasses.add(EcorePackage.Literals.EPACKAGE);
		mf.eclasses.add(EcorePackage.Literals.EENUM_LITERAL);
		//mf.ereferences = new UniversalSet<EReference>();
		mf.ereferences.add(EcorePackage.Literals.EENUM_LITERAL__EENUM);
		mf.ereferences.add(EcorePackage.Literals.EENUM__ELITERALS);
		//mf.ereferences.add(EcorePackage.Literals.EPACKAGE__ESUBPACKAGES);
		//mf.ereferences.add(EcorePackage.Literals.EPACKAGE__ESUPER_PACKAGE);
		mf.ereferences.add(EcorePackage.Literals.EPACKAGE__ECLASSIFIERS);
		mf.ereferences.add(EcorePackage.Literals.ETYPED_ELEMENT__ETYPE);
		mf.ereferences.add(EcorePackage.Literals.EREFERENCE__EOPPOSITE);
		mf.ereferences.add(EcorePackage.Literals.ECLASS__ESUPER_TYPES);
		mf.ereferences.add(EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES);
		mf.ereferences.add(EcorePackage.Literals.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		mf.ereferences.add(EcorePackage.Literals.ECLASSIFIER__EPACKAGE);
		return mf;
	}
	
	
	public static MetaFilterLiterals getNoFilter() {
		MetaFilterLiterals mf = new MetaFilterLiterals();
		mf.eattribute = new UniversalSet<EAttribute>();
		mf.eclasses = new UniversalSet<EClass>();
		mf.ereferences = new UniversalSet<EReference>();
		return mf;
	}
	
}
