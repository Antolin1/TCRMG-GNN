/**
 */
package smallEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smallEcore.SmallEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface SmallEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smallEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/smallEcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smallEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmallEcorePackage eINSTANCE = smallEcore.impl.SmallEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link smallEcore.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.ENamedElementImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getENamedElement()
	 * @generated
	 */
	int ENAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EClassifierImpl <em>EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EClassifierImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEClassifier()
	 * @generated
	 */
	int ECLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EPACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EClassImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ABSTRACT = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESTRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.ETypedElementImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getETypedElement()
	 * @generated
	 */
	int ETYPED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__LOWER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UPPER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ETYPE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EStructuralFeatureImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEStructuralFeature()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EReferenceImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINMENT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EOPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_OPERATION_COUNT = ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EAttributeImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EPackageImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EDataTypeImpl <em>EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EDataTypeImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The number of structural features of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EEnumImpl <em>EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EEnumImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEEnum()
	 * @generated
	 */
	int EENUM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__NAME = EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EPACKAGE = EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ELITERALS = EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smallEcore.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smallEcore.impl.EEnumLiteralImpl
	 * @see smallEcore.impl.SmallEcorePackageImpl#getEEnumLiteral()
	 * @generated
	 */
	int EENUM_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EENUM = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link smallEcore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element</em>'.
	 * @see smallEcore.ENamedElement
	 * @generated
	 */
	EClass getENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link smallEcore.ENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smallEcore.ENamedElement#getName()
	 * @see #getENamedElement()
	 * @generated
	 */
	EAttribute getENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link smallEcore.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier</em>'.
	 * @see smallEcore.EClassifier
	 * @generated
	 */
	EClass getEClassifier();

	/**
	 * Returns the meta object for the container reference '{@link smallEcore.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EPackage</em>'.
	 * @see smallEcore.EClassifier#getEPackage()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_EPackage();

	/**
	 * Returns the meta object for class '{@link smallEcore.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see smallEcore.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link smallEcore.EClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see smallEcore.EClass#isAbstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link smallEcore.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
	 * @see smallEcore.EClass#getEStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EStructuralFeatures();

	/**
	 * Returns the meta object for the reference list '{@link smallEcore.EClass#getESuperTypes <em>ESuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESuper Types</em>'.
	 * @see smallEcore.EClass#getESuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_ESuperTypes();

	/**
	 * Returns the meta object for class '{@link smallEcore.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETyped Element</em>'.
	 * @see smallEcore.ETypedElement
	 * @generated
	 */
	EClass getETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link smallEcore.ETypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see smallEcore.ETypedElement#getLowerBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link smallEcore.ETypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see smallEcore.ETypedElement#getUpperBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link smallEcore.ETypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see smallEcore.ETypedElement#getEType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EType();

	/**
	 * Returns the meta object for class '{@link smallEcore.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature</em>'.
	 * @see smallEcore.EStructuralFeature
	 * @generated
	 */
	EClass getEStructuralFeature();

	/**
	 * Returns the meta object for the container reference '{@link smallEcore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see smallEcore.EStructuralFeature#getEContainingClass()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EReference getEStructuralFeature_EContainingClass();

	/**
	 * Returns the meta object for class '{@link smallEcore.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see smallEcore.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link smallEcore.EReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see smallEcore.EReference#isContainment()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Containment();

	/**
	 * Returns the meta object for the reference '{@link smallEcore.EReference#getEOpposite <em>EOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOpposite</em>'.
	 * @see smallEcore.EReference#getEOpposite()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EOpposite();

	/**
	 * Returns the meta object for class '{@link smallEcore.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see smallEcore.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for class '{@link smallEcore.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see smallEcore.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link smallEcore.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
	 * @see smallEcore.EPackage#getEClassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EClassifiers();

	/**
	 * Returns the meta object for class '{@link smallEcore.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type</em>'.
	 * @see smallEcore.EDataType
	 * @generated
	 */
	EClass getEDataType();

	/**
	 * Returns the meta object for class '{@link smallEcore.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum</em>'.
	 * @see smallEcore.EEnum
	 * @generated
	 */
	EClass getEEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link smallEcore.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELiterals</em>'.
	 * @see smallEcore.EEnum#getELiterals()
	 * @see #getEEnum()
	 * @generated
	 */
	EReference getEEnum_ELiterals();

	/**
	 * Returns the meta object for class '{@link smallEcore.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal</em>'.
	 * @see smallEcore.EEnumLiteral
	 * @generated
	 */
	EClass getEEnumLiteral();

	/**
	 * Returns the meta object for the container reference '{@link smallEcore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EEnum</em>'.
	 * @see smallEcore.EEnumLiteral#getEEnum()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EReference getEEnumLiteral_EEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmallEcoreFactory getSmallEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smallEcore.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.ENamedElementImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getENamedElement()
		 * @generated
		 */
		EClass ENAMED_ELEMENT = eINSTANCE.getENamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT__NAME = eINSTANCE.getENamedElement_Name();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EClassifierImpl <em>EClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EClassifierImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEClassifier()
		 * @generated
		 */
		EClass ECLASSIFIER = eINSTANCE.getEClassifier();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__EPACKAGE = eINSTANCE.getEClassifier_EPackage();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EClassImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__ABSTRACT = eINSTANCE.getEClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>EStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESTRUCTURAL_FEATURES = eINSTANCE.getEClass_EStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>ESuper Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESUPER_TYPES = eINSTANCE.getEClass_ESuperTypes();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.ETypedElementImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getETypedElement()
		 * @generated
		 */
		EClass ETYPED_ELEMENT = eINSTANCE.getETypedElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__LOWER_BOUND = eINSTANCE.getETypedElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UPPER_BOUND = eINSTANCE.getETypedElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__ETYPE = eINSTANCE.getETypedElement_EType();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EStructuralFeatureImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEStructuralFeature()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = eINSTANCE.getEStructuralFeature_EContainingClass();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EReferenceImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEReference()
		 * @generated
		 */
		EClass EREFERENCE = eINSTANCE.getEReference();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__CONTAINMENT = eINSTANCE.getEReference_Containment();

		/**
		 * The meta object literal for the '<em><b>EOpposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EOPPOSITE = eINSTANCE.getEReference_EOpposite();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EAttributeImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EPackageImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEPackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEPackage();

		/**
		 * The meta object literal for the '<em><b>EClassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ECLASSIFIERS = eINSTANCE.getEPackage_EClassifiers();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EDataTypeImpl <em>EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EDataTypeImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEDataType()
		 * @generated
		 */
		EClass EDATA_TYPE = eINSTANCE.getEDataType();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EEnumImpl <em>EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EEnumImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEEnum()
		 * @generated
		 */
		EClass EENUM = eINSTANCE.getEEnum();

		/**
		 * The meta object literal for the '<em><b>ELiterals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM__ELITERALS = eINSTANCE.getEEnum_ELiterals();

		/**
		 * The meta object literal for the '{@link smallEcore.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smallEcore.impl.EEnumLiteralImpl
		 * @see smallEcore.impl.SmallEcorePackageImpl#getEEnumLiteral()
		 * @generated
		 */
		EClass EENUM_LITERAL = eINSTANCE.getEEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>EEnum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_LITERAL__EENUM = eINSTANCE.getEEnumLiteral_EEnum();

	}

} //SmallEcorePackage
