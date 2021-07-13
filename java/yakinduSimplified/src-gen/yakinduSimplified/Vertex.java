/**
 */
package yakinduSimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yakinduSimplified.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link yakinduSimplified.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see yakinduSimplified.YakinduSimplifiedPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link yakinduSimplified.Transition}.
	 * It is bidirectional and its opposite is '{@link yakinduSimplified.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see yakinduSimplified.YakinduSimplifiedPackage#getVertex_IncomingTransitions()
	 * @see yakinduSimplified.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link yakinduSimplified.Transition}.
	 * It is bidirectional and its opposite is '{@link yakinduSimplified.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see yakinduSimplified.YakinduSimplifiedPackage#getVertex_OutgoingTransitions()
	 * @see yakinduSimplified.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

} // Vertex
