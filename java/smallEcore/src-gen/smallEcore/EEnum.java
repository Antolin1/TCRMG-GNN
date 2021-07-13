/**
 */
package smallEcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEEnum()
 * @model
 * @generated
 */
public interface EEnum extends EDataType {
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link smallEcore.EEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link smallEcore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see smallEcore.SmallEcorePackage#getEEnum_ELiterals()
	 * @see smallEcore.EEnumLiteral#getEEnum
	 * @model opposite="eEnum" containment="true"
	 * @generated
	 */
	EList<EEnumLiteral> getELiterals();

} // EEnum
