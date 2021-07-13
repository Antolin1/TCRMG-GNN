/**
 */
package smallEcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link smallEcore.EReference#getEOpposite <em>EOpposite</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEReference()
 * @model
 * @generated
 */
public interface EReference extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see smallEcore.SmallEcorePackage#getEReference_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link smallEcore.EReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOpposite</em>' reference.
	 * @see #setEOpposite(EReference)
	 * @see smallEcore.SmallEcorePackage#getEReference_EOpposite()
	 * @model
	 * @generated
	 */
	EReference getEOpposite();

	/**
	 * Sets the value of the '{@link smallEcore.EReference#getEOpposite <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOpposite</em>' reference.
	 * @see #getEOpposite()
	 * @generated
	 */
	void setEOpposite(EReference value);

} // EReference
