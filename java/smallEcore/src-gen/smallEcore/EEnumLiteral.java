/**
 */
package smallEcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EEnumLiteral#getEEnum <em>EEnum</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEEnumLiteral()
 * @model
 * @generated
 */
public interface EEnumLiteral extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smallEcore.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' container reference.
	 * @see #setEEnum(EEnum)
	 * @see smallEcore.SmallEcorePackage#getEEnumLiteral_EEnum()
	 * @see smallEcore.EEnum#getELiterals
	 * @model opposite="eLiterals" transient="false"
	 * @generated
	 */
	EEnum getEEnum();

	/**
	 * Sets the value of the '{@link smallEcore.EEnumLiteral#getEEnum <em>EEnum</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnum</em>' container reference.
	 * @see #getEEnum()
	 * @generated
	 */
	void setEEnum(EEnum value);

} // EEnumLiteral
