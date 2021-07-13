/**
 */
package rdsSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.IndexColumn#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see rdsSimplified.RdsSimplifiedPackage#getIndexColumn()
 * @model
 * @generated
 */
public interface IndexColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see rdsSimplified.RdsSimplifiedPackage#getIndexColumn_Column()
	 * @model
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link rdsSimplified.IndexColumn#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

} // IndexColumn
