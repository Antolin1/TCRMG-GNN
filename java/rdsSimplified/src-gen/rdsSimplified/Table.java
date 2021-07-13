/**
 */
package rdsSimplified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdsSimplified.Table#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @see rdsSimplified.RdsSimplifiedPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Element {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link rdsSimplified.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see rdsSimplified.RdsSimplifiedPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link rdsSimplified.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see rdsSimplified.RdsSimplifiedPackage#getTable_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

} // Table
