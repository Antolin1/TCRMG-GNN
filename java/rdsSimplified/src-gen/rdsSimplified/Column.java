/**
 */
package rdsSimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.Column#getForeignReferences <em>Foreign References</em>}</li>
 *   <li>{@link rdsSimplified.Column#getPrimaryReferences <em>Primary References</em>}</li>
 * </ul>
 *
 * @see rdsSimplified.RdsSimplifiedPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreign References</b></em>' reference list.
	 * The list contents are of type {@link rdsSimplified.Reference}.
	 * It is bidirectional and its opposite is '{@link rdsSimplified.Reference#getForeignKeyColumns <em>Foreign Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign References</em>' reference list.
	 * @see rdsSimplified.RdsSimplifiedPackage#getColumn_ForeignReferences()
	 * @see rdsSimplified.Reference#getForeignKeyColumns
	 * @model opposite="foreignKeyColumns"
	 * @generated
	 */
	EList<Reference> getForeignReferences();

	/**
	 * Returns the value of the '<em><b>Primary References</b></em>' reference list.
	 * The list contents are of type {@link rdsSimplified.Reference}.
	 * It is bidirectional and its opposite is '{@link rdsSimplified.Reference#getPrimaryKeyColumns <em>Primary Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary References</em>' reference list.
	 * @see rdsSimplified.RdsSimplifiedPackage#getColumn_PrimaryReferences()
	 * @see rdsSimplified.Reference#getPrimaryKeyColumns
	 * @model opposite="primaryKeyColumns"
	 * @generated
	 */
	EList<Reference> getPrimaryReferences();

} // Column
