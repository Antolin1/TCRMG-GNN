/**
 */
package rdsSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdsSimplified.Column;
import rdsSimplified.RdsSimplifiedPackage;
import rdsSimplified.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.impl.ReferenceImpl#getForeignKeyColumns <em>Foreign Key Columns</em>}</li>
 *   <li>{@link rdsSimplified.impl.ReferenceImpl#getPrimaryKeyColumns <em>Primary Key Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends ElementImpl implements Reference {
	/**
	 * The cached value of the '{@link #getForeignKeyColumns() <em>Foreign Key Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected Column foreignKeyColumns;

	/**
	 * The cached value of the '{@link #getPrimaryKeyColumns() <em>Primary Key Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected Column primaryKeyColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdsSimplifiedPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getForeignKeyColumns() {
		if (foreignKeyColumns != null && foreignKeyColumns.eIsProxy()) {
			InternalEObject oldForeignKeyColumns = (InternalEObject) foreignKeyColumns;
			foreignKeyColumns = (Column) eResolveProxy(oldForeignKeyColumns);
			if (foreignKeyColumns != oldForeignKeyColumns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS, oldForeignKeyColumns,
							foreignKeyColumns));
			}
		}
		return foreignKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetForeignKeyColumns() {
		return foreignKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKeyColumns(Column newForeignKeyColumns, NotificationChain msgs) {
		Column oldForeignKeyColumns = foreignKeyColumns;
		foreignKeyColumns = newForeignKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS, oldForeignKeyColumns, newForeignKeyColumns);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyColumns(Column newForeignKeyColumns) {
		if (newForeignKeyColumns != foreignKeyColumns) {
			NotificationChain msgs = null;
			if (foreignKeyColumns != null)
				msgs = ((InternalEObject) foreignKeyColumns).eInverseRemove(this,
						RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES, Column.class, msgs);
			if (newForeignKeyColumns != null)
				msgs = ((InternalEObject) newForeignKeyColumns).eInverseAdd(this,
						RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES, Column.class, msgs);
			msgs = basicSetForeignKeyColumns(newForeignKeyColumns, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS,
					newForeignKeyColumns, newForeignKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getPrimaryKeyColumns() {
		if (primaryKeyColumns != null && primaryKeyColumns.eIsProxy()) {
			InternalEObject oldPrimaryKeyColumns = (InternalEObject) primaryKeyColumns;
			primaryKeyColumns = (Column) eResolveProxy(oldPrimaryKeyColumns);
			if (primaryKeyColumns != oldPrimaryKeyColumns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS, oldPrimaryKeyColumns,
							primaryKeyColumns));
			}
		}
		return primaryKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetPrimaryKeyColumns() {
		return primaryKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKeyColumns(Column newPrimaryKeyColumns, NotificationChain msgs) {
		Column oldPrimaryKeyColumns = primaryKeyColumns;
		primaryKeyColumns = newPrimaryKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS, oldPrimaryKeyColumns, newPrimaryKeyColumns);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyColumns(Column newPrimaryKeyColumns) {
		if (newPrimaryKeyColumns != primaryKeyColumns) {
			NotificationChain msgs = null;
			if (primaryKeyColumns != null)
				msgs = ((InternalEObject) primaryKeyColumns).eInverseRemove(this,
						RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES, Column.class, msgs);
			if (newPrimaryKeyColumns != null)
				msgs = ((InternalEObject) newPrimaryKeyColumns).eInverseAdd(this,
						RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES, Column.class, msgs);
			msgs = basicSetPrimaryKeyColumns(newPrimaryKeyColumns, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS,
					newPrimaryKeyColumns, newPrimaryKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS:
			if (foreignKeyColumns != null)
				msgs = ((InternalEObject) foreignKeyColumns).eInverseRemove(this,
						RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES, Column.class, msgs);
			return basicSetForeignKeyColumns((Column) otherEnd, msgs);
		case RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS:
			if (primaryKeyColumns != null)
				msgs = ((InternalEObject) primaryKeyColumns).eInverseRemove(this,
						RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES, Column.class, msgs);
			return basicSetPrimaryKeyColumns((Column) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS:
			return basicSetForeignKeyColumns(null, msgs);
		case RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS:
			return basicSetPrimaryKeyColumns(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS:
			if (resolve)
				return getForeignKeyColumns();
			return basicGetForeignKeyColumns();
		case RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS:
			if (resolve)
				return getPrimaryKeyColumns();
			return basicGetPrimaryKeyColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS:
			setForeignKeyColumns((Column) newValue);
			return;
		case RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS:
			setPrimaryKeyColumns((Column) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS:
			setForeignKeyColumns((Column) null);
			return;
		case RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS:
			setPrimaryKeyColumns((Column) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS:
			return foreignKeyColumns != null;
		case RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS:
			return primaryKeyColumns != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
