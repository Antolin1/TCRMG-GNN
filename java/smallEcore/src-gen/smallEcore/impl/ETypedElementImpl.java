/**
 */
package smallEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smallEcore.EClassifier;
import smallEcore.ETypedElement;
import smallEcore.SmallEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.impl.ETypedElementImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link smallEcore.impl.ETypedElementImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link smallEcore.impl.ETypedElementImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ETypedElementImpl extends ENamedElementImpl implements ETypedElement {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallEcorePackage.Literals.ETYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallEcorePackage.ETYPED_ELEMENT__LOWER_BOUND,
					oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallEcorePackage.ETYPED_ELEMENT__UPPER_BOUND,
					oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject) eType;
			eType = (EClassifier) eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallEcorePackage.ETYPED_ELEMENT__ETYPE,
							oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(EClassifier newEType) {
		EClassifier oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallEcorePackage.ETYPED_ELEMENT__ETYPE, oldEType,
					eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmallEcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			return getLowerBound();
		case SmallEcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			return getUpperBound();
		case SmallEcorePackage.ETYPED_ELEMENT__ETYPE:
			if (resolve)
				return getEType();
			return basicGetEType();
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
		case SmallEcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			setLowerBound((Integer) newValue);
			return;
		case SmallEcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			setUpperBound((Integer) newValue);
			return;
		case SmallEcorePackage.ETYPED_ELEMENT__ETYPE:
			setEType((EClassifier) newValue);
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
		case SmallEcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case SmallEcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
			return;
		case SmallEcorePackage.ETYPED_ELEMENT__ETYPE:
			setEType((EClassifier) null);
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
		case SmallEcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			return lowerBound != LOWER_BOUND_EDEFAULT;
		case SmallEcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			return upperBound != UPPER_BOUND_EDEFAULT;
		case SmallEcorePackage.ETYPED_ELEMENT__ETYPE:
			return eType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //ETypedElementImpl
