/**
 */
package yakinduSimplified;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see yakinduSimplified.YakinduSimplifiedFactory
 * @model kind="package"
 * @generated
 */
public interface YakinduSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yakinduSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/yakinduSimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yakinduSimplified";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YakinduSimplifiedPackage eINSTANCE = yakinduSimplified.impl.YakinduSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.VertexImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING_TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING_TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.PseudostateImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.TransitionImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.RegionImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 3;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__VERTICES = 0;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.CompositeElementImpl <em>Composite Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.CompositeElementImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getCompositeElement()
	 * @generated
	 */
	int COMPOSITE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__REGIONS = 0;

	/**
	 * The number of structural features of the '<em>Composite Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Composite Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.StatechartImpl <em>Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.StatechartImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getStatechart()
	 * @generated
	 */
	int STATECHART = 4;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART__REGIONS = COMPOSITE_ELEMENT__REGIONS;

	/**
	 * The number of structural features of the '<em>Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_FEATURE_COUNT = COMPOSITE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_OPERATION_COUNT = COMPOSITE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.EntryImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__INCOMING_TRANSITIONS = PSEUDOSTATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OUTGOING_TRANSITIONS = PSEUDOSTATE__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.SynchronizationImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 7;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__INCOMING_TRANSITIONS = PSEUDOSTATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__OUTGOING_TRANSITIONS = PSEUDOSTATE__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.RegularStateImpl <em>Regular State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.RegularStateImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getRegularState()
	 * @generated
	 */
	int REGULAR_STATE = 8;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_STATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_STATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Regular State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.StateImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getState()
	 * @generated
	 */
	int STATE = 9;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = REGULAR_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = REGULAR_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGIONS = REGULAR_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = REGULAR_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = REGULAR_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.ChoiceImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 10;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__INCOMING_TRANSITIONS = PSEUDOSTATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OUTGOING_TRANSITIONS = PSEUDOSTATE__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.ExitImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 11;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__INCOMING_TRANSITIONS = PSEUDOSTATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__OUTGOING_TRANSITIONS = PSEUDOSTATE__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = PSEUDOSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_OPERATION_COUNT = PSEUDOSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yakinduSimplified.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yakinduSimplified.impl.FinalStateImpl
	 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 12;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING_TRANSITIONS = REGULAR_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING_TRANSITIONS = REGULAR_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = REGULAR_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = REGULAR_STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see yakinduSimplified.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see yakinduSimplified.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link yakinduSimplified.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see yakinduSimplified.Vertex#getIncomingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link yakinduSimplified.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
	 * @see yakinduSimplified.Vertex#getOutgoingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see yakinduSimplified.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link yakinduSimplified.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see yakinduSimplified.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the container reference '{@link yakinduSimplified.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see yakinduSimplified.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see yakinduSimplified.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link yakinduSimplified.Region#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see yakinduSimplified.Region#getVertices()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Vertices();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Statechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statechart</em>'.
	 * @see yakinduSimplified.Statechart
	 * @generated
	 */
	EClass getStatechart();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.CompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Element</em>'.
	 * @see yakinduSimplified.CompositeElement
	 * @generated
	 */
	EClass getCompositeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link yakinduSimplified.CompositeElement#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see yakinduSimplified.CompositeElement#getRegions()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Regions();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see yakinduSimplified.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see yakinduSimplified.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.RegularState <em>Regular State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular State</em>'.
	 * @see yakinduSimplified.RegularState
	 * @generated
	 */
	EClass getRegularState();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see yakinduSimplified.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see yakinduSimplified.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see yakinduSimplified.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for class '{@link yakinduSimplified.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see yakinduSimplified.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YakinduSimplifiedFactory getYakinduSimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.PseudostateImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.VertexImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING_TRANSITIONS = eINSTANCE.getVertex_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING_TRANSITIONS = eINSTANCE.getVertex_OutgoingTransitions();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.TransitionImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.RegionImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__VERTICES = eINSTANCE.getRegion_Vertices();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.StatechartImpl <em>Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.StatechartImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getStatechart()
		 * @generated
		 */
		EClass STATECHART = eINSTANCE.getStatechart();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.CompositeElementImpl <em>Composite Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.CompositeElementImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getCompositeElement()
		 * @generated
		 */
		EClass COMPOSITE_ELEMENT = eINSTANCE.getCompositeElement();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ELEMENT__REGIONS = eINSTANCE.getCompositeElement_Regions();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.EntryImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.SynchronizationImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.RegularStateImpl <em>Regular State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.RegularStateImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getRegularState()
		 * @generated
		 */
		EClass REGULAR_STATE = eINSTANCE.getRegularState();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.StateImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.ChoiceImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.ExitImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getExit()
		 * @generated
		 */
		EClass EXIT = eINSTANCE.getExit();

		/**
		 * The meta object literal for the '{@link yakinduSimplified.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yakinduSimplified.impl.FinalStateImpl
		 * @see yakinduSimplified.impl.YakinduSimplifiedPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //YakinduSimplifiedPackage
