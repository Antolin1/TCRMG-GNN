/**
 */
package smallEcore.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import smallEcore.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see smallEcore.SmallEcorePackage
 * @generated
 */
public class SmallEcoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmallEcorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallEcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = SmallEcorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SmallEcorePackage.ENAMED_ELEMENT: {
			ENamedElement eNamedElement = (ENamedElement) theEObject;
			T result = caseENamedElement(eNamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.ECLASSIFIER: {
			EClassifier eClassifier = (EClassifier) theEObject;
			T result = caseEClassifier(eClassifier);
			if (result == null)
				result = caseENamedElement(eClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.ECLASS: {
			EClass eClass = (EClass) theEObject;
			T result = caseEClass(eClass);
			if (result == null)
				result = caseEClassifier(eClass);
			if (result == null)
				result = caseENamedElement(eClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.ETYPED_ELEMENT: {
			ETypedElement eTypedElement = (ETypedElement) theEObject;
			T result = caseETypedElement(eTypedElement);
			if (result == null)
				result = caseENamedElement(eTypedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.ESTRUCTURAL_FEATURE: {
			EStructuralFeature eStructuralFeature = (EStructuralFeature) theEObject;
			T result = caseEStructuralFeature(eStructuralFeature);
			if (result == null)
				result = caseETypedElement(eStructuralFeature);
			if (result == null)
				result = caseENamedElement(eStructuralFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.EREFERENCE: {
			EReference eReference = (EReference) theEObject;
			T result = caseEReference(eReference);
			if (result == null)
				result = caseEStructuralFeature(eReference);
			if (result == null)
				result = caseETypedElement(eReference);
			if (result == null)
				result = caseENamedElement(eReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.EATTRIBUTE: {
			EAttribute eAttribute = (EAttribute) theEObject;
			T result = caseEAttribute(eAttribute);
			if (result == null)
				result = caseEStructuralFeature(eAttribute);
			if (result == null)
				result = caseETypedElement(eAttribute);
			if (result == null)
				result = caseENamedElement(eAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.EPACKAGE: {
			smallEcore.EPackage ePackage = (smallEcore.EPackage) theEObject;
			T result = caseEPackage(ePackage);
			if (result == null)
				result = caseENamedElement(ePackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.EDATA_TYPE: {
			EDataType eDataType = (EDataType) theEObject;
			T result = caseEDataType(eDataType);
			if (result == null)
				result = caseEClassifier(eDataType);
			if (result == null)
				result = caseENamedElement(eDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.EENUM: {
			EEnum eEnum = (EEnum) theEObject;
			T result = caseEEnum(eEnum);
			if (result == null)
				result = caseEDataType(eEnum);
			if (result == null)
				result = caseEClassifier(eEnum);
			if (result == null)
				result = caseENamedElement(eEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SmallEcorePackage.EENUM_LITERAL: {
			EEnumLiteral eEnumLiteral = (EEnumLiteral) theEObject;
			T result = caseEEnumLiteral(eEnumLiteral);
			if (result == null)
				result = caseENamedElement(eEnumLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifier(EClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClass(EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypedElement(ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeature(EStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReference(EReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttribute(EAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackage(smallEcore.EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataType(EDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnum(EEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnumLiteral(EEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SmallEcoreSwitch
