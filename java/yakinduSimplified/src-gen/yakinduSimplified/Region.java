/**
 */
package yakinduSimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yakinduSimplified.Region#getVertices <em>Vertices</em>}</li>
 * </ul>
 *
 * @see yakinduSimplified.YakinduSimplifiedPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link yakinduSimplified.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see yakinduSimplified.YakinduSimplifiedPackage#getRegion_Vertices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertices();

} // Region
