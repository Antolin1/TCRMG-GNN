/**
 */
package rdsSimplified;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rdsSimplified.RdsSimplifiedFactory
 * @model kind="package"
 * @generated
 */
public interface RdsSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdsSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rdsSimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdsSimplified";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdsSimplifiedPackage eINSTANCE = rdsSimplified.impl.RdsSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.DatabaseImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.ElementImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.ColumnImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Foreign References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FOREIGN_REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Primary References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRIMARY_REFERENCES = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.TableImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEXES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.ReferenceImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Foreign Key Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FOREIGN_KEY_COLUMNS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key Columns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PRIMARY_KEY_COLUMNS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.IndexImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 5;

	/**
	 * The feature id for the '<em><b>Index Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDEX_COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdsSimplified.impl.IndexColumnImpl <em>Index Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdsSimplified.impl.IndexColumnImpl
	 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getIndexColumn()
	 * @generated
	 */
	int INDEX_COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link rdsSimplified.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see rdsSimplified.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link rdsSimplified.Database#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see rdsSimplified.Database#getElements()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Elements();

	/**
	 * Returns the meta object for class '{@link rdsSimplified.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see rdsSimplified.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link rdsSimplified.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see rdsSimplified.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link rdsSimplified.Column#getForeignReferences <em>Foreign References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Foreign References</em>'.
	 * @see rdsSimplified.Column#getForeignReferences()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ForeignReferences();

	/**
	 * Returns the meta object for the reference list '{@link rdsSimplified.Column#getPrimaryReferences <em>Primary References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary References</em>'.
	 * @see rdsSimplified.Column#getPrimaryReferences()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_PrimaryReferences();

	/**
	 * Returns the meta object for class '{@link rdsSimplified.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see rdsSimplified.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link rdsSimplified.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see rdsSimplified.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link rdsSimplified.Table#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see rdsSimplified.Table#getIndexes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Indexes();

	/**
	 * Returns the meta object for class '{@link rdsSimplified.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see rdsSimplified.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link rdsSimplified.Reference#getForeignKeyColumns <em>Foreign Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Key Columns</em>'.
	 * @see rdsSimplified.Reference#getForeignKeyColumns()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ForeignKeyColumns();

	/**
	 * Returns the meta object for the reference '{@link rdsSimplified.Reference#getPrimaryKeyColumns <em>Primary Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key Columns</em>'.
	 * @see rdsSimplified.Reference#getPrimaryKeyColumns()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_PrimaryKeyColumns();

	/**
	 * Returns the meta object for class '{@link rdsSimplified.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see rdsSimplified.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link rdsSimplified.Index#getIndexColumns <em>Index Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Columns</em>'.
	 * @see rdsSimplified.Index#getIndexColumns()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_IndexColumns();

	/**
	 * Returns the meta object for class '{@link rdsSimplified.IndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column</em>'.
	 * @see rdsSimplified.IndexColumn
	 * @generated
	 */
	EClass getIndexColumn();

	/**
	 * Returns the meta object for the reference '{@link rdsSimplified.IndexColumn#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see rdsSimplified.IndexColumn#getColumn()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EReference getIndexColumn_Column();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdsSimplifiedFactory getRdsSimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.DatabaseImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__ELEMENTS = eINSTANCE.getDatabase_Elements();

		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.ElementImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.ColumnImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Foreign References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__FOREIGN_REFERENCES = eINSTANCE.getColumn_ForeignReferences();

		/**
		 * The meta object literal for the '<em><b>Primary References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__PRIMARY_REFERENCES = eINSTANCE.getColumn_PrimaryReferences();

		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.TableImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__INDEXES = eINSTANCE.getTable_Indexes();

		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.ReferenceImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Columns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__FOREIGN_KEY_COLUMNS = eINSTANCE.getReference_ForeignKeyColumns();

		/**
		 * The meta object literal for the '<em><b>Primary Key Columns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__PRIMARY_KEY_COLUMNS = eINSTANCE.getReference_PrimaryKeyColumns();

		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.IndexImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Index Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDEX_COLUMNS = eINSTANCE.getIndex_IndexColumns();

		/**
		 * The meta object literal for the '{@link rdsSimplified.impl.IndexColumnImpl <em>Index Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdsSimplified.impl.IndexColumnImpl
		 * @see rdsSimplified.impl.RdsSimplifiedPackageImpl#getIndexColumn()
		 * @generated
		 */
		EClass INDEX_COLUMN = eINSTANCE.getIndexColumn();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_COLUMN__COLUMN = eINSTANCE.getIndexColumn_Column();

	}

} //RdsSimplifiedPackage
