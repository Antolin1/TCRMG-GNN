/**
 */
package smallEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import smallEcore.EEnum;
import smallEcore.EEnumLiteral;
import smallEcore.SmallEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.impl.EEnumLiteralImpl#getEEnum <em>EEnum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEnumLiteralImpl extends ENamedElementImpl implements EEnumLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallEcorePackage.Literals.EENUM_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnum() {
		if (eContainerFeatureID() != SmallEcorePackage.EENUM_LITERAL__EENUM)
			return null;
		return (EEnum) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEEnum(EEnum newEEnum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEEnum, SmallEcorePackage.EENUM_LITERAL__EENUM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEnum(EEnum newEEnum) {
		if (newEEnum != eInternalContainer()
				|| (eContainerFeatureID() != SmallEcorePackage.EENUM_LITERAL__EENUM && newEEnum != null)) {
			if (EcoreUtil.isAncestor(this, newEEnum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEEnum != null)
				msgs = ((InternalEObject) newEEnum).eInverseAdd(this, SmallEcorePackage.EENUM__ELITERALS, EEnum.class,
						msgs);
			msgs = basicSetEEnum(newEEnum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallEcorePackage.EENUM_LITERAL__EENUM, newEEnum,
					newEEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEEnum((EEnum) otherEnd, msgs);
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
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			return basicSetEEnum(null, msgs);
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
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			return eInternalContainer().eInverseRemove(this, SmallEcorePackage.EENUM__ELITERALS, EEnum.class, msgs);
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
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			return getEEnum();
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
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			setEEnum((EEnum) newValue);
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
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			setEEnum((EEnum) null);
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
		case SmallEcorePackage.EENUM_LITERAL__EENUM:
			return getEEnum() != null;
		}
		return super.eIsSet(featureID);
	}

} //EEnumLiteralImpl
