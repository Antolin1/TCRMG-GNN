/**
 */
package smallEcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.ETypedElement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link smallEcore.ETypedElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link smallEcore.ETypedElement#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getETypedElement()
 * @model abstract="true"
 * @generated
 */
public interface ETypedElement extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see smallEcore.SmallEcorePackage#getETypedElement_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link smallEcore.ETypedElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see smallEcore.SmallEcorePackage#getETypedElement_UpperBound()
	 * @model
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link smallEcore.ETypedElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EClassifier)
	 * @see smallEcore.SmallEcorePackage#getETypedElement_EType()
	 * @model
	 * @generated
	 */
	EClassifier getEType();

	/**
	 * Sets the value of the '{@link smallEcore.ETypedElement#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EClassifier value);

} // ETypedElement
