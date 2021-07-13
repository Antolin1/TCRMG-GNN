/**
 */
package rdsSimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.Index#getIndexColumns <em>Index Columns</em>}</li>
 * </ul>
 *
 * @see rdsSimplified.RdsSimplifiedPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Columns</b></em>' containment reference list.
	 * The list contents are of type {@link rdsSimplified.IndexColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Columns</em>' containment reference list.
	 * @see rdsSimplified.RdsSimplifiedPackage#getIndex_IndexColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexColumn> getIndexColumns();

} // Index
