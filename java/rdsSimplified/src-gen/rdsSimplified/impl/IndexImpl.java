/**
 */
package rdsSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdsSimplified.Index;
import rdsSimplified.IndexColumn;
import rdsSimplified.RdsSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.impl.IndexImpl#getIndexColumns <em>Index Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends MinimalEObjectImpl.Container implements Index {
	/**
	 * The cached value of the '{@link #getIndexColumns() <em>Index Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexColumn> indexColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdsSimplifiedPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexColumn> getIndexColumns() {
		if (indexColumns == null) {
			indexColumns = new EObjectContainmentEList<IndexColumn>(IndexColumn.class, this,
					RdsSimplifiedPackage.INDEX__INDEX_COLUMNS);
		}
		return indexColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RdsSimplifiedPackage.INDEX__INDEX_COLUMNS:
			return ((InternalEList<?>) getIndexColumns()).basicRemove(otherEnd, msgs);
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
		case RdsSimplifiedPackage.INDEX__INDEX_COLUMNS:
			return getIndexColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RdsSimplifiedPackage.INDEX__INDEX_COLUMNS:
			getIndexColumns().clear();
			getIndexColumns().addAll((Collection<? extends IndexColumn>) newValue);
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
		case RdsSimplifiedPackage.INDEX__INDEX_COLUMNS:
			getIndexColumns().clear();
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
		case RdsSimplifiedPackage.INDEX__INDEX_COLUMNS:
			return indexColumns != null && !indexColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndexImpl
