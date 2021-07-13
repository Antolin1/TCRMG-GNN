/**
 */
package smallEcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EClassifier#getEPackage <em>EPackage</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EClassifier extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smallEcore.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' container reference.
	 * @see #setEPackage(EPackage)
	 * @see smallEcore.SmallEcorePackage#getEClassifier_EPackage()
	 * @see smallEcore.EPackage#getEClassifiers
	 * @model opposite="eClassifiers" transient="false"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link smallEcore.EClassifier#getEPackage <em>EPackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' container reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

} // EClassifier
