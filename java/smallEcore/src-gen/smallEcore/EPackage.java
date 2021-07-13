/**
 */
package smallEcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smallEcore.EPackage#getEClassifiers <em>EClassifiers</em>}</li>
 * </ul>
 *
 * @see smallEcore.SmallEcorePackage#getEPackage()
 * @model
 * @generated
 */
public interface EPackage extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link smallEcore.EClassifier}.
	 * It is bidirectional and its opposite is '{@link smallEcore.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see smallEcore.SmallEcorePackage#getEPackage_EClassifiers()
	 * @see smallEcore.EClassifier#getEPackage
	 * @model opposite="ePackage" containment="true"
	 * @generated
	 */
	EList<EClassifier> getEClassifiers();

} // EPackage
