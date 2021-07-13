/**
 */
package smallEcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see smallEcore.SmallEcorePackage
 * @generated
 */
public interface SmallEcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmallEcoreFactory eINSTANCE = smallEcore.impl.SmallEcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass</em>'.
	 * @generated
	 */
	EClass createEClass();

	/**
	 * Returns a new object of class '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference</em>'.
	 * @generated
	 */
	EReference createEReference();

	/**
	 * Returns a new object of class '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute</em>'.
	 * @generated
	 */
	EAttribute createEAttribute();

	/**
	 * Returns a new object of class '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPackage</em>'.
	 * @generated
	 */
	EPackage createEPackage();

	/**
	 * Returns a new object of class '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EData Type</em>'.
	 * @generated
	 */
	EDataType createEDataType();

	/**
	 * Returns a new object of class '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum</em>'.
	 * @generated
	 */
	EEnum createEEnum();

	/**
	 * Returns a new object of class '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Literal</em>'.
	 * @generated
	 */
	EEnumLiteral createEEnumLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmallEcorePackage getSmallEcorePackage();

} //SmallEcoreFactory
