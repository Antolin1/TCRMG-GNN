/**
 */
package smallEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import smallEcore.EStructuralFeature;
import smallEcore.SmallEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.impl.EStructuralFeatureImpl#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EStructuralFeatureImpl extends ETypedElementImpl implements EStructuralFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallEcorePackage.Literals.ESTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smallEcore.EClass getEContainingClass() {
		if (eContainerFeatureID() != SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)
			return null;
		return (smallEcore.EClass) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainingClass(smallEcore.EClass newEContainingClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEContainingClass,
				SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainingClass(smallEcore.EClass newEContainingClass) {
		if (newEContainingClass != eInternalContainer()
				|| (eContainerFeatureID() != SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS
						&& newEContainingClass != null)) {
			if (EcoreUtil.isAncestor(this, newEContainingClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainingClass != null)
				msgs = ((InternalEObject) newEContainingClass).eInverseAdd(this,
						SmallEcorePackage.ECLASS__ESTRUCTURAL_FEATURES, smallEcore.EClass.class, msgs);
			msgs = basicSetEContainingClass(newEContainingClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, newEContainingClass,
					newEContainingClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEContainingClass((smallEcore.EClass) otherEnd, msgs);
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
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return basicSetEContainingClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return eInternalContainer().eInverseRemove(this, SmallEcorePackage.ECLASS__ESTRUCTURAL_FEATURES,
					smallEcore.EClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return getEContainingClass();
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
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			setEContainingClass((smallEcore.EClass) newValue);
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
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			setEContainingClass((smallEcore.EClass) null);
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
		case SmallEcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return getEContainingClass() != null;
		}
		return super.eIsSet(featureID);
	}

} //EStructuralFeatureImpl
