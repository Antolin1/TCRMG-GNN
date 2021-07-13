/**
 */
package yakinduSimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yakinduSimplified.CompositeElement#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see yakinduSimplified.YakinduSimplifiedPackage#getCompositeElement()
 * @model abstract="true"
 * @generated
 */
public interface CompositeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link yakinduSimplified.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see yakinduSimplified.YakinduSimplifiedPackage#getCompositeElement_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // CompositeElement
