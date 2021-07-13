/**
 */
package smallEcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link smallEcore.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link smallEcore.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEClass()
 * @model
 * @generated
 */
public interface EClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see smallEcore.SmallEcorePackage#getEClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link smallEcore.EClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link smallEcore.EStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link smallEcore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Features</em>' containment reference list.
	 * @see smallEcore.SmallEcorePackage#getEClass_EStructuralFeatures()
	 * @see smallEcore.EStructuralFeature#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link smallEcore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see smallEcore.SmallEcorePackage#getEClass_ESuperTypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getESuperTypes();

} // EClass
