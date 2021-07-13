/**
 */
package smallEcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface EStructuralFeature extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smallEcore.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see #setEContainingClass(EClass)
	 * @see smallEcore.SmallEcorePackage#getEStructuralFeature_EContainingClass()
	 * @see smallEcore.EClass#getEStructuralFeatures
	 * @model opposite="eStructuralFeatures" transient="false"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * Sets the value of the '{@link smallEcore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContaining Class</em>' container reference.
	 * @see #getEContainingClass()
	 * @generated
	 */
	void setEContainingClass(EClass value);

} // EStructuralFeature
