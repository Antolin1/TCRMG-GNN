/**
 */
package rdsSimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdsSimplified.Database#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see rdsSimplified.RdsSimplifiedPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link rdsSimplified.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see rdsSimplified.RdsSimplifiedPackage#getDatabase_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Database
