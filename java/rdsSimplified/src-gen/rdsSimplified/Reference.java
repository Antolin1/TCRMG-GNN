/**
 */
package rdsSimplified;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.Reference#getForeignKeyColumns <em>Foreign Key Columns</em>}</li>
 *   <li>{@link rdsSimplified.Reference#getPrimaryKeyColumns <em>Primary Key Columns</em>}</li>
 * </ul>
 *
 * @see rdsSimplified.RdsSimplifiedPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Element {
	/**
	 * Returns the value of the '<em><b>Foreign Key Columns</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdsSimplified.Column#getForeignReferences <em>Foreign References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Columns</em>' reference.
	 * @see #setForeignKeyColumns(Column)
	 * @see rdsSimplified.RdsSimplifiedPackage#getReference_ForeignKeyColumns()
	 * @see rdsSimplified.Column#getForeignReferences
	 * @model opposite="foreignReferences" required="true"
	 * @generated
	 */
	Column getForeignKeyColumns();

	/**
	 * Sets the value of the '{@link rdsSimplified.Reference#getForeignKeyColumns <em>Foreign Key Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Columns</em>' reference.
	 * @see #getForeignKeyColumns()
	 * @generated
	 */
	void setForeignKeyColumns(Column value);

	/**
	 * Returns the value of the '<em><b>Primary Key Columns</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdsSimplified.Column#getPrimaryReferences <em>Primary References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Columns</em>' reference.
	 * @see #setPrimaryKeyColumns(Column)
	 * @see rdsSimplified.RdsSimplifiedPackage#getReference_PrimaryKeyColumns()
	 * @see rdsSimplified.Column#getPrimaryReferences
	 * @model opposite="primaryReferences" required="true"
	 * @generated
	 */
	Column getPrimaryKeyColumns();

	/**
	 * Sets the value of the '{@link rdsSimplified.Reference#getPrimaryKeyColumns <em>Primary Key Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Columns</em>' reference.
	 * @see #getPrimaryKeyColumns()
	 * @generated
	 */
	void setPrimaryKeyColumns(Column value);

} // Reference
