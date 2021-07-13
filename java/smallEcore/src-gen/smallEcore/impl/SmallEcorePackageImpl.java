/**
 */
package smallEcore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smallEcore.EClassifier;
import smallEcore.EDataType;
import smallEcore.EEnum;
import smallEcore.EEnumLiteral;
import smallEcore.ENamedElement;
import smallEcore.EStructuralFeature;
import smallEcore.ETypedElement;
import smallEcore.SmallEcoreFactory;
import smallEcore.SmallEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallEcorePackageImpl extends EPackageImpl implements SmallEcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see smallEcore.SmallEcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmallEcorePackageImpl() {
		super(eNS_URI, SmallEcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmallEcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmallEcorePackage init() {
		if (isInited)
			return (SmallEcorePackage) EPackage.Registry.INSTANCE.getEPackage(SmallEcorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmallEcorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmallEcorePackageImpl theSmallEcorePackage = registeredSmallEcorePackage instanceof SmallEcorePackageImpl
				? (SmallEcorePackageImpl) registeredSmallEcorePackage
				: new SmallEcorePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSmallEcorePackage.createPackageContents();

		// Initialize created meta-data
		theSmallEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmallEcorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmallEcorePackage.eNS_URI, theSmallEcorePackage);
		return theSmallEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElement() {
		return eNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElement_Name() {
		return (EAttribute) eNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifier() {
		return eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_EPackage() {
		return (EReference) eClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Abstract() {
		return (EAttribute) eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EStructuralFeatures() {
		return (EReference) eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_ESuperTypes() {
		return (EReference) eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypedElement() {
		return eTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_LowerBound() {
		return (EAttribute) eTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_UpperBound() {
		return (EAttribute) eTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EType() {
		return (EReference) eTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeature() {
		return eStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeature_EContainingClass() {
		return (EReference) eStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReference() {
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Containment() {
		return (EAttribute) eReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EOpposite() {
		return (EReference) eReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackage() {
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EClassifiers() {
		return (EReference) ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataType() {
		return eDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnum() {
		return eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnum_ELiterals() {
		return (EReference) eEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteral() {
		return eEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteral_EEnum() {
		return (EReference) eEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallEcoreFactory getSmallEcoreFactory() {
		return (SmallEcoreFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eNamedElementEClass = createEClass(ENAMED_ELEMENT);
		createEAttribute(eNamedElementEClass, ENAMED_ELEMENT__NAME);

		eClassifierEClass = createEClass(ECLASSIFIER);
		createEReference(eClassifierEClass, ECLASSIFIER__EPACKAGE);

		eClassEClass = createEClass(ECLASS);
		createEAttribute(eClassEClass, ECLASS__ABSTRACT);
		createEReference(eClassEClass, ECLASS__ESTRUCTURAL_FEATURES);
		createEReference(eClassEClass, ECLASS__ESUPER_TYPES);

		eTypedElementEClass = createEClass(ETYPED_ELEMENT);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__LOWER_BOUND);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UPPER_BOUND);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__ETYPE);

		eStructuralFeatureEClass = createEClass(ESTRUCTURAL_FEATURE);
		createEReference(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);

		eReferenceEClass = createEClass(EREFERENCE);
		createEAttribute(eReferenceEClass, EREFERENCE__CONTAINMENT);
		createEReference(eReferenceEClass, EREFERENCE__EOPPOSITE);

		eAttributeEClass = createEClass(EATTRIBUTE);

		ePackageEClass = createEClass(EPACKAGE);
		createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);

		eDataTypeEClass = createEClass(EDATA_TYPE);

		eEnumEClass = createEClass(EENUM);
		createEReference(eEnumEClass, EENUM__ELITERALS);

		eEnumLiteralEClass = createEClass(EENUM_LITERAL);
		createEReference(eEnumLiteralEClass, EENUM_LITERAL__EENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eClassifierEClass.getESuperTypes().add(this.getENamedElement());
		eClassEClass.getESuperTypes().add(this.getEClassifier());
		eTypedElementEClass.getESuperTypes().add(this.getENamedElement());
		eStructuralFeatureEClass.getESuperTypes().add(this.getETypedElement());
		eReferenceEClass.getESuperTypes().add(this.getEStructuralFeature());
		eAttributeEClass.getESuperTypes().add(this.getEStructuralFeature());
		ePackageEClass.getESuperTypes().add(this.getENamedElement());
		eDataTypeEClass.getESuperTypes().add(this.getEClassifier());
		eEnumEClass.getESuperTypes().add(this.getEDataType());
		eEnumLiteralEClass.getESuperTypes().add(this.getENamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(eNamedElementEClass, ENamedElement.class, "ENamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ENamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassifierEClass, EClassifier.class, "EClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassifier_EPackage(), this.getEPackage(), this.getEPackage_EClassifiers(), "ePackage", null,
				0, 1, EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassEClass, smallEcore.EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1,
				smallEcore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EStructuralFeatures(), this.getEStructuralFeature(),
				this.getEStructuralFeature_EContainingClass(), "eStructuralFeatures", null, 0, -1,
				smallEcore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_ESuperTypes(), this.getEClass(), null, "eSuperTypes", null, 0, -1,
				smallEcore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTypedElementEClass, ETypedElement.class, "ETypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETypedElement_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1,
				ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1,
				ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EType(), this.getEClassifier(), null, "eType", null, 0, 1, ETypedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureEClass, EStructuralFeature.class, "EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeature_EContainingClass(), this.getEClass(), this.getEClass_EStructuralFeatures(),
				"eContainingClass", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceEClass, smallEcore.EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReference_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1,
				smallEcore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EOpposite(), this.getEReference(), null, "eOpposite", null, 0, 1,
				smallEcore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAttributeEClass, smallEcore.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePackageEClass, smallEcore.EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPackage_EClassifiers(), this.getEClassifier(), this.getEClassifier_EPackage(),
				"eClassifiers", null, 0, -1, smallEcore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDataTypeEClass, EDataType.class, "EDataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eEnumEClass, EEnum.class, "EEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnum_ELiterals(), this.getEEnumLiteral(), this.getEEnumLiteral_EEnum(), "eLiterals", null, 0,
				-1, EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumLiteralEClass, EEnumLiteral.class, "EEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumLiteral_EEnum(), this.getEEnum(), this.getEEnum_ELiterals(), "eEnum", null, 0, 1,
				EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SmallEcorePackageImpl
