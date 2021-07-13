/**
 */
package rdsSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdsSimplified.Column;
import rdsSimplified.RdsSimplifiedPackage;
import rdsSimplified.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.impl.ColumnImpl#getForeignReferences <em>Foreign References</em>}</li>
 *   <li>{@link rdsSimplified.impl.ColumnImpl#getPrimaryReferences <em>Primary References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The cached value of the '{@link #getForeignReferences() <em>Foreign References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> foreignReferences;

	/**
	 * The cached value of the '{@link #getPrimaryReferences() <em>Primary References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> primaryReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdsSimplifiedPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getForeignReferences() {
		if (foreignReferences == null) {
			foreignReferences = new EObjectWithInverseResolvingEList<Reference>(Reference.class, this,
					RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES,
					RdsSimplifiedPackage.REFERENCE__FOREIGN_KEY_COLUMNS);
		}
		return foreignReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPrimaryReferences() {
		if (primaryReferences == null) {
			primaryReferences = new EObjectWithInverseResolvingEList<Reference>(Reference.class, this,
					RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES,
					RdsSimplifiedPackage.REFERENCE__PRIMARY_KEY_COLUMNS);
		}
		return primaryReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getForeignReferences()).basicAdd(otherEnd,
					msgs);
		case RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrimaryReferences()).basicAdd(otherEnd,
					msgs);
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
		case RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES:
			return ((InternalEList<?>) getForeignReferences()).basicRemove(otherEnd, msgs);
		case RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES:
			return ((InternalEList<?>) getPrimaryReferences()).basicRemove(otherEnd, msgs);
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
		case RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES:
			return getForeignReferences();
		case RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES:
			return getPrimaryReferences();
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
		case RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES:
			getForeignReferences().clear();
			getForeignReferences().addAll((Collection<? extends Reference>) newValue);
			return;
		case RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES:
			getPrimaryReferences().clear();
			getPrimaryReferences().addAll((Collection<? extends Reference>) newValue);
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
		case RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES:
			getForeignReferences().clear();
			return;
		case RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES:
			getPrimaryReferences().clear();
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
		case RdsSimplifiedPackage.COLUMN__FOREIGN_REFERENCES:
			return foreignReferences != null && !foreignReferences.isEmpty();
		case RdsSimplifiedPackage.COLUMN__PRIMARY_REFERENCES:
			return primaryReferences != null && !primaryReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColumnImpl
