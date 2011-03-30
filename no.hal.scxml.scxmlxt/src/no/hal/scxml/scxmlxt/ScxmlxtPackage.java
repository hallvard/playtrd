/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.scxml.scxmlxt.ScxmlxtFactory
 * @model kind="package"
 * @generated
 */
public interface ScxmlxtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scxmlxt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://no.hal/scxml/scxmlxt.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scxmlxt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScxmlxtPackage eINSTANCE = no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.AbstractStateImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.StateMachineImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = ABSTRACT_STATE__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = ABSTRACT_STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__VARIABLES = ABSTRACT_STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IMPORTS = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CURRENT_STATES = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.StateImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATES = ABSTRACT_STATE__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = ABSTRACT_STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLES = ABSTRACT_STATE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Initial Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL_TRANSITION = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.InitialTransitionImpl <em>Initial Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.InitialTransitionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getInitialTransition()
	 * @generated
	 */
	int INITIAL_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Initial Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.AbstractTransitionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractTransition()
	 * @generated
	 */
	int ABSTRACT_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.TransitionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = ABSTRACT_TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = ABSTRACT_TRANSITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = ABSTRACT_TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.InternalTransitionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__EVENT = ABSTRACT_TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__CONDITION = ABSTRACT_TRANSITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ACTION = ABSTRACT_TRANSITION__ACTION;

	/**
	 * The number of structural features of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.SymbolicEventImpl <em>Symbolic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.SymbolicEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getSymbolicEvent()
	 * @generated
	 */
	int SYMBOLIC_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_EVENT__NAME = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbolic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.AbstractTransitionEventImpl <em>Abstract Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.AbstractTransitionEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractTransitionEvent()
	 * @generated
	 */
	int ABSTRACT_TRANSITION_EVENT = 9;

	/**
	 * The number of structural features of the '<em>Abstract Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.TransitionEventImpl <em>Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.TransitionEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTransitionEvent()
	 * @generated
	 */
	int TRANSITION_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__SOURCE = ABSTRACT_TRANSITION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__TARGET = ABSTRACT_TRANSITION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_FEATURE_COUNT = ABSTRACT_TRANSITION_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EnterEventImpl <em>Enter Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EnterEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEnterEvent()
	 * @generated
	 */
	int ENTER_EVENT = 11;

	/**
	 * The number of structural features of the '<em>Enter Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_EVENT_FEATURE_COUNT = ABSTRACT_TRANSITION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ExitEventImpl <em>Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ExitEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getExitEvent()
	 * @generated
	 */
	int EXIT_EVENT = 12;

	/**
	 * The number of structural features of the '<em>Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EVENT_FEATURE_COUNT = ABSTRACT_TRANSITION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ScriptEventImpl <em>Script Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ScriptEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getScriptEvent()
	 * @generated
	 */
	int SCRIPT_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVENT__SCRIPT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.TimerEventImpl <em>Timer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.TimerEventImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTimerEvent()
	 * @generated
	 */
	int TIMER_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT__EVENT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT__DELAY = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ConditionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SCRIPT = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ActionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 16;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.SymbolicActionImpl <em>Symbolic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.SymbolicActionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getSymbolicAction()
	 * @generated
	 */
	int SYMBOLIC_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACTION__NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACTION__DELAY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbolic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ScriptActionImpl <em>Script Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ScriptActionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getScriptAction()
	 * @generated
	 */
	int SCRIPT_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ACTION__SCRIPT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.TypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.TypedImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 19;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__ETYPE = 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__MANY = 1;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.VarDefImpl <em>Var Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.VarDefImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getVarDef()
	 * @generated
	 */
	int VAR_DEF = 20;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__ETYPE = TYPED__ETYPE;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__MANY = TYPED__MANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__NAME = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__INIT = TYPED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.AssignmentActionImpl <em>Assignment Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.AssignmentActionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAssignmentAction()
	 * @generated
	 */
	int ASSIGNMENT_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__VAR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ExpressionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.LiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 27;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.BooleanLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 28;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.IntLiteralImpl <em>Int Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.IntLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getIntLiteral()
	 * @generated
	 */
	int INT_LITERAL = 29;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.FloatLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getFloatLiteral()
	 * @generated
	 */
	int FLOAT_LITERAL = 30;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.StringLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 31;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ScriptExpressionImpl <em>Script Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ScriptExpressionImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getScriptExpression()
	 * @generated
	 */
	int SCRIPT_EXPRESSION = 32;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.AbstractUriLiteralImpl <em>Abstract Uri Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.AbstractUriLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractUriLiteral()
	 * @generated
	 */
	int ABSTRACT_URI_LITERAL = 33;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.UriLiteralImpl <em>Uri Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.UriLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getUriLiteral()
	 * @generated
	 */
	int URI_LITERAL = 34;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EObjectUriLiteralImpl <em>EObject Uri Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EObjectUriLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEObjectUriLiteral()
	 * @generated
	 */
	int EOBJECT_URI_LITERAL = 36;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ResourceUriLiteralImpl <em>Resource Uri Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ResourceUriLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getResourceUriLiteral()
	 * @generated
	 */
	int RESOURCE_URI_LITERAL = 35;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.DelayLiteralImpl <em>Delay Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.DelayLiteralImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getDelayLiteral()
	 * @generated
	 */
	int DELAY_LITERAL = 38;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.ResourceImportImpl <em>Resource Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.ResourceImportImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getResourceImport()
	 * @generated
	 */
	int RESOURCE_IMPORT = 39;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.DomainModelImportImpl <em>Domain Model Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.DomainModelImportImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getDomainModelImport()
	 * @generated
	 */
	int DOMAIN_MODEL_IMPORT = 40;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.DomainDataImportImpl <em>Domain Data Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.DomainDataImportImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getDomainDataImport()
	 * @generated
	 */
	int DOMAIN_DATA_IMPORT = 41;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.VarRefImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 23;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__VAR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EPathImpl <em>EPath</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EPathImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEPath()
	 * @generated
	 */
	int EPATH = 24;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATH__VAR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATH__STEPS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EPath</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EStepImpl <em>EStep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EStepImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEStep()
	 * @generated
	 */
	int ESTEP = 25;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__FEATURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__FILTER = 1;

	/**
	 * The number of structural features of the '<em>EStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EStepFilterImpl <em>EStep Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EStepFilterImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEStepFilter()
	 * @generated
	 */
	int ESTEP_FILTER = 26;

	/**
	 * The feature id for the '<em><b>Free Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_FILTER__FREE_VAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_FILTER__SCRIPT = 1;

	/**
	 * The number of structural features of the '<em>EStep Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__BOOLEAN_VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL__INT_VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Float Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_LITERAL__FLOAT_VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__STRING_VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EXPRESSION__SCRIPT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_URI_LITERAL__URI = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Uri Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_URI_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LITERAL__URI = ABSTRACT_URI_LITERAL__URI;

	/**
	 * The feature id for the '<em><b>Uri Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LITERAL__URI_VALUE = ABSTRACT_URI_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LITERAL_FEATURE_COUNT = ABSTRACT_URI_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_URI_LITERAL__URI = ABSTRACT_URI_LITERAL__URI;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_URI_LITERAL__RESOURCE_URI = ABSTRACT_URI_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Uri Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_URI_LITERAL_FEATURE_COUNT = ABSTRACT_URI_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_URI_LITERAL__URI = RESOURCE_URI_LITERAL__URI;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_URI_LITERAL__RESOURCE_URI = RESOURCE_URI_LITERAL__RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_URI_LITERAL__URI_FRAGMENT = RESOURCE_URI_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Uri Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_URI_LITERAL_FEATURE_COUNT = RESOURCE_URI_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.impl.EObjectReferenceImpl <em>EObject Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.impl.EObjectReferenceImpl
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEObjectReference()
	 * @generated
	 */
	int EOBJECT_REFERENCE = 37;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE__EOBJECT = 0;

	/**
	 * The number of structural features of the '<em>EObject Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_LITERAL__INT_VALUE = INT_LITERAL__INT_VALUE;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_LITERAL__TIME_UNIT = INT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_LITERAL_FEATURE_COUNT = INT_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Resource Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_IMPORT__IMPORT_URI = RESOURCE_IMPORT__IMPORT_URI;

	/**
	 * The number of structural features of the '<em>Domain Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_IMPORT_FEATURE_COUNT = RESOURCE_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DATA_IMPORT__IMPORT_URI = RESOURCE_IMPORT__IMPORT_URI;

	/**
	 * The number of structural features of the '<em>Domain Data Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DATA_IMPORT_FEATURE_COUNT = RESOURCE_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.scxml.scxmlxt.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.scxml.scxmlxt.TimeUnit
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 42;

	/**
	 * The meta object id for the '<em>EURI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEURI()
	 * @generated
	 */
	int EURI = 43;


	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see no.hal.scxml.scxmlxt.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.scxml.scxmlxt.StateMachine#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see no.hal.scxml.scxmlxt.StateMachine#getImports()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Imports();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.scxml.scxmlxt.StateMachine#getCurrentStates <em>Current States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current States</em>'.
	 * @see no.hal.scxml.scxmlxt.StateMachine#getCurrentStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_CurrentStates();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see no.hal.scxml.scxmlxt.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.State#getInitialTransition <em>Initial Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Transition</em>'.
	 * @see no.hal.scxml.scxmlxt.State#getInitialTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InitialTransition();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.scxml.scxmlxt.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.InitialTransition <em>Initial Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Transition</em>'.
	 * @see no.hal.scxml.scxmlxt.InitialTransition
	 * @generated
	 */
	EClass getInitialTransition();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.InitialTransition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see no.hal.scxml.scxmlxt.InitialTransition#getAction()
	 * @see #getInitialTransition()
	 * @generated
	 */
	EReference getInitialTransition_Action();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.scxml.scxmlxt.AbstractState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractState#getStates()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_States();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.scxml.scxmlxt.AbstractState#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractState#getTransitions()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.scxml.scxmlxt.AbstractState#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractState#getVariables()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Variables();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractTransition
	 * @generated
	 */
	EClass getAbstractTransition();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.AbstractTransition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractTransition#getEvent()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Event();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.AbstractTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractTransition#getCondition()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.AbstractTransition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractTransition#getAction()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Action();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see no.hal.scxml.scxmlxt.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see no.hal.scxml.scxmlxt.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Transition</em>'.
	 * @see no.hal.scxml.scxmlxt.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see no.hal.scxml.scxmlxt.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.SymbolicEvent <em>Symbolic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Event</em>'.
	 * @see no.hal.scxml.scxmlxt.SymbolicEvent
	 * @generated
	 */
	EClass getSymbolicEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.SymbolicEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.scxml.scxmlxt.SymbolicEvent#getName()
	 * @see #getSymbolicEvent()
	 * @generated
	 */
	EAttribute getSymbolicEvent_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.AbstractTransitionEvent <em>Abstract Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition Event</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractTransitionEvent
	 * @generated
	 */
	EClass getAbstractTransitionEvent();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Event</em>'.
	 * @see no.hal.scxml.scxmlxt.TransitionEvent
	 * @generated
	 */
	EClass getTransitionEvent();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.TransitionEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see no.hal.scxml.scxmlxt.TransitionEvent#getSource()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_Source();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.TransitionEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see no.hal.scxml.scxmlxt.TransitionEvent#getTarget()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_Target();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.EnterEvent <em>Enter Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enter Event</em>'.
	 * @see no.hal.scxml.scxmlxt.EnterEvent
	 * @generated
	 */
	EClass getEnterEvent();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.ExitEvent <em>Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Event</em>'.
	 * @see no.hal.scxml.scxmlxt.ExitEvent
	 * @generated
	 */
	EClass getExitEvent();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.ScriptEvent <em>Script Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Event</em>'.
	 * @see no.hal.scxml.scxmlxt.ScriptEvent
	 * @generated
	 */
	EClass getScriptEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.ScriptEvent#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see no.hal.scxml.scxmlxt.ScriptEvent#getScript()
	 * @see #getScriptEvent()
	 * @generated
	 */
	EAttribute getScriptEvent_Script();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.TimerEvent <em>Timer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Event</em>'.
	 * @see no.hal.scxml.scxmlxt.TimerEvent
	 * @generated
	 */
	EClass getTimerEvent();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.TimerEvent#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see no.hal.scxml.scxmlxt.TimerEvent#getDelay()
	 * @see #getTimerEvent()
	 * @generated
	 */
	EReference getTimerEvent_Delay();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.TimerEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see no.hal.scxml.scxmlxt.TimerEvent#getEvent()
	 * @see #getTimerEvent()
	 * @generated
	 */
	EReference getTimerEvent_Event();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see no.hal.scxml.scxmlxt.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.Condition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see no.hal.scxml.scxmlxt.Condition#getScript()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Script();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see no.hal.scxml.scxmlxt.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.SymbolicAction <em>Symbolic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Action</em>'.
	 * @see no.hal.scxml.scxmlxt.SymbolicAction
	 * @generated
	 */
	EClass getSymbolicAction();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.SymbolicAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.scxml.scxmlxt.SymbolicAction#getName()
	 * @see #getSymbolicAction()
	 * @generated
	 */
	EAttribute getSymbolicAction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.SymbolicAction#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see no.hal.scxml.scxmlxt.SymbolicAction#getDelay()
	 * @see #getSymbolicAction()
	 * @generated
	 */
	EReference getSymbolicAction_Delay();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.ScriptAction <em>Script Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Action</em>'.
	 * @see no.hal.scxml.scxmlxt.ScriptAction
	 * @generated
	 */
	EClass getScriptAction();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.ScriptAction#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see no.hal.scxml.scxmlxt.ScriptAction#getScript()
	 * @see #getScriptAction()
	 * @generated
	 */
	EAttribute getScriptAction_Script();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see no.hal.scxml.scxmlxt.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.Typed#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see no.hal.scxml.scxmlxt.Typed#getEType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_EType();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.Typed#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see no.hal.scxml.scxmlxt.Typed#isMany()
	 * @see #getTyped()
	 * @generated
	 */
	EAttribute getTyped_Many();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.VarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Def</em>'.
	 * @see no.hal.scxml.scxmlxt.VarDef
	 * @generated
	 */
	EClass getVarDef();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.VarDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.scxml.scxmlxt.VarDef#getName()
	 * @see #getVarDef()
	 * @generated
	 */
	EAttribute getVarDef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.VarDef#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see no.hal.scxml.scxmlxt.VarDef#getInit()
	 * @see #getVarDef()
	 * @generated
	 */
	EReference getVarDef_Init();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.AssignmentAction <em>Assignment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Action</em>'.
	 * @see no.hal.scxml.scxmlxt.AssignmentAction
	 * @generated
	 */
	EClass getAssignmentAction();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.AssignmentAction#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see no.hal.scxml.scxmlxt.AssignmentAction#getVar()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EReference getAssignmentAction_Var();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.AssignmentAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see no.hal.scxml.scxmlxt.AssignmentAction#getValue()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EReference getAssignmentAction_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see no.hal.scxml.scxmlxt.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see no.hal.scxml.scxmlxt.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.VarRef#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see no.hal.scxml.scxmlxt.VarRef#getVar()
	 * @see #getVarRef()
	 * @generated
	 */
	EReference getVarRef_Var();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.EPath <em>EPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPath</em>'.
	 * @see no.hal.scxml.scxmlxt.EPath
	 * @generated
	 */
	EClass getEPath();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.EPath#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see no.hal.scxml.scxmlxt.EPath#getVar()
	 * @see #getEPath()
	 * @generated
	 */
	EReference getEPath_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.scxml.scxmlxt.EPath#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see no.hal.scxml.scxmlxt.EPath#getSteps()
	 * @see #getEPath()
	 * @generated
	 */
	EReference getEPath_Steps();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStep</em>'.
	 * @see no.hal.scxml.scxmlxt.EStep
	 * @generated
	 */
	EClass getEStep();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.EStep#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see no.hal.scxml.scxmlxt.EStep#getFeatureName()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_FeatureName();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.EStep#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see no.hal.scxml.scxmlxt.EStep#getFilter()
	 * @see #getEStep()
	 * @generated
	 */
	EReference getEStep_Filter();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.EStepFilter <em>EStep Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStep Filter</em>'.
	 * @see no.hal.scxml.scxmlxt.EStepFilter
	 * @generated
	 */
	EClass getEStepFilter();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.EStepFilter#getFreeVarName <em>Free Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Var Name</em>'.
	 * @see no.hal.scxml.scxmlxt.EStepFilter#getFreeVarName()
	 * @see #getEStepFilter()
	 * @generated
	 */
	EAttribute getEStepFilter_FreeVarName();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.scxml.scxmlxt.EStepFilter#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see no.hal.scxml.scxmlxt.EStepFilter#getScript()
	 * @see #getEStepFilter()
	 * @generated
	 */
	EReference getEStepFilter_Script();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.BooleanLiteral#isBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see no.hal.scxml.scxmlxt.BooleanLiteral#isBooleanValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_BooleanValue();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.IntLiteral <em>Int Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.IntLiteral
	 * @generated
	 */
	EClass getIntLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.IntLiteral#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see no.hal.scxml.scxmlxt.IntLiteral#getIntValue()
	 * @see #getIntLiteral()
	 * @generated
	 */
	EAttribute getIntLiteral_IntValue();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.FloatLiteral <em>Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.FloatLiteral
	 * @generated
	 */
	EClass getFloatLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.FloatLiteral#getFloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Value</em>'.
	 * @see no.hal.scxml.scxmlxt.FloatLiteral#getFloatValue()
	 * @see #getFloatLiteral()
	 * @generated
	 */
	EAttribute getFloatLiteral_FloatValue();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.StringLiteral#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see no.hal.scxml.scxmlxt.StringLiteral#getStringValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_StringValue();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.ScriptExpression <em>Script Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Expression</em>'.
	 * @see no.hal.scxml.scxmlxt.ScriptExpression
	 * @generated
	 */
	EClass getScriptExpression();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.ScriptExpression#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see no.hal.scxml.scxmlxt.ScriptExpression#getScript()
	 * @see #getScriptExpression()
	 * @generated
	 */
	EAttribute getScriptExpression_Script();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.UriLiteral <em>Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.UriLiteral
	 * @generated
	 */
	EClass getUriLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.UriLiteral#getUriValue <em>Uri Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Value</em>'.
	 * @see no.hal.scxml.scxmlxt.UriLiteral#getUriValue()
	 * @see #getUriLiteral()
	 * @generated
	 */
	EAttribute getUriLiteral_UriValue();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.EObjectUriLiteral <em>EObject Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Uri Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.EObjectUriLiteral
	 * @generated
	 */
	EClass getEObjectUriLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.EObjectUriLiteral#getUriFragment <em>Uri Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Fragment</em>'.
	 * @see no.hal.scxml.scxmlxt.EObjectUriLiteral#getUriFragment()
	 * @see #getEObjectUriLiteral()
	 * @generated
	 */
	EAttribute getEObjectUriLiteral_UriFragment();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.EObjectReference <em>EObject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Reference</em>'.
	 * @see no.hal.scxml.scxmlxt.EObjectReference
	 * @generated
	 */
	EClass getEObjectReference();

	/**
	 * Returns the meta object for the reference '{@link no.hal.scxml.scxmlxt.EObjectReference#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EObject</em>'.
	 * @see no.hal.scxml.scxmlxt.EObjectReference#getEObject()
	 * @see #getEObjectReference()
	 * @generated
	 */
	EReference getEObjectReference_EObject();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.DelayLiteral <em>Delay Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.DelayLiteral
	 * @generated
	 */
	EClass getDelayLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.DelayLiteral#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see no.hal.scxml.scxmlxt.DelayLiteral#getTimeUnit()
	 * @see #getDelayLiteral()
	 * @generated
	 */
	EAttribute getDelayLiteral_TimeUnit();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.ResourceImport <em>Resource Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Import</em>'.
	 * @see no.hal.scxml.scxmlxt.ResourceImport
	 * @generated
	 */
	EClass getResourceImport();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.ResourceImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see no.hal.scxml.scxmlxt.ResourceImport#getImportURI()
	 * @see #getResourceImport()
	 * @generated
	 */
	EAttribute getResourceImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.DomainModelImport <em>Domain Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model Import</em>'.
	 * @see no.hal.scxml.scxmlxt.DomainModelImport
	 * @generated
	 */
	EClass getDomainModelImport();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.DomainDataImport <em>Domain Data Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Data Import</em>'.
	 * @see no.hal.scxml.scxmlxt.DomainDataImport
	 * @generated
	 */
	EClass getDomainDataImport();

	/**
	 * Returns the meta object for enum '{@link no.hal.scxml.scxmlxt.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see no.hal.scxml.scxmlxt.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.ResourceUriLiteral <em>Resource Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Uri Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.ResourceUriLiteral
	 * @generated
	 */
	EClass getResourceUriLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.ResourceUriLiteral#getResourceUri <em>Resource Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Uri</em>'.
	 * @see no.hal.scxml.scxmlxt.ResourceUriLiteral#getResourceUri()
	 * @see #getResourceUriLiteral()
	 * @generated
	 */
	EAttribute getResourceUriLiteral_ResourceUri();

	/**
	 * Returns the meta object for class '{@link no.hal.scxml.scxmlxt.AbstractUriLiteral <em>Abstract Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Uri Literal</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractUriLiteral
	 * @generated
	 */
	EClass getAbstractUriLiteral();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.scxml.scxmlxt.AbstractUriLiteral#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see no.hal.scxml.scxmlxt.AbstractUriLiteral#getUri()
	 * @see #getAbstractUriLiteral()
	 * @generated
	 */
	EAttribute getAbstractUriLiteral_Uri();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>EURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EURI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getEURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScxmlxtFactory getScxmlxtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.StateMachineImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__IMPORTS = eINSTANCE.getStateMachine_Imports();

		/**
		 * The meta object literal for the '<em><b>Current States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CURRENT_STATES = eINSTANCE.getStateMachine_CurrentStates();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.StateImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Initial Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INITIAL_TRANSITION = eINSTANCE.getState_InitialTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.InitialTransitionImpl <em>Initial Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.InitialTransitionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getInitialTransition()
		 * @generated
		 */
		EClass INITIAL_TRANSITION = eINSTANCE.getInitialTransition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_TRANSITION__ACTION = eINSTANCE.getInitialTransition_Action();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.AbstractStateImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__STATES = eINSTANCE.getAbstractState_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__TRANSITIONS = eINSTANCE.getAbstractState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__VARIABLES = eINSTANCE.getAbstractState_Variables();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.AbstractTransitionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractTransition()
		 * @generated
		 */
		EClass ABSTRACT_TRANSITION = eINSTANCE.getAbstractTransition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__EVENT = eINSTANCE.getAbstractTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__CONDITION = eINSTANCE.getAbstractTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__ACTION = eINSTANCE.getAbstractTransition_Action();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.TransitionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.InternalTransitionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.SymbolicEventImpl <em>Symbolic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.SymbolicEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getSymbolicEvent()
		 * @generated
		 */
		EClass SYMBOLIC_EVENT = eINSTANCE.getSymbolicEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOLIC_EVENT__NAME = eINSTANCE.getSymbolicEvent_Name();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.AbstractTransitionEventImpl <em>Abstract Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.AbstractTransitionEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractTransitionEvent()
		 * @generated
		 */
		EClass ABSTRACT_TRANSITION_EVENT = eINSTANCE.getAbstractTransitionEvent();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.TransitionEventImpl <em>Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.TransitionEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTransitionEvent()
		 * @generated
		 */
		EClass TRANSITION_EVENT = eINSTANCE.getTransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__SOURCE = eINSTANCE.getTransitionEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__TARGET = eINSTANCE.getTransitionEvent_Target();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EnterEventImpl <em>Enter Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EnterEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEnterEvent()
		 * @generated
		 */
		EClass ENTER_EVENT = eINSTANCE.getEnterEvent();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ExitEventImpl <em>Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ExitEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getExitEvent()
		 * @generated
		 */
		EClass EXIT_EVENT = eINSTANCE.getExitEvent();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ScriptEventImpl <em>Script Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ScriptEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getScriptEvent()
		 * @generated
		 */
		EClass SCRIPT_EVENT = eINSTANCE.getScriptEvent();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_EVENT__SCRIPT = eINSTANCE.getScriptEvent_Script();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.TimerEventImpl <em>Timer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.TimerEventImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTimerEvent()
		 * @generated
		 */
		EClass TIMER_EVENT = eINSTANCE.getTimerEvent();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT__DELAY = eINSTANCE.getTimerEvent_Delay();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT__EVENT = eINSTANCE.getTimerEvent_Event();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ConditionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__SCRIPT = eINSTANCE.getCondition_Script();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ActionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.SymbolicActionImpl <em>Symbolic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.SymbolicActionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getSymbolicAction()
		 * @generated
		 */
		EClass SYMBOLIC_ACTION = eINSTANCE.getSymbolicAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOLIC_ACTION__NAME = eINSTANCE.getSymbolicAction_Name();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_ACTION__DELAY = eINSTANCE.getSymbolicAction_Delay();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ScriptActionImpl <em>Script Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ScriptActionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getScriptAction()
		 * @generated
		 */
		EClass SCRIPT_ACTION = eINSTANCE.getScriptAction();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_ACTION__SCRIPT = eINSTANCE.getScriptAction_Script();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.TypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.TypedImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__ETYPE = eINSTANCE.getTyped_EType();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED__MANY = eINSTANCE.getTyped_Many();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.VarDefImpl <em>Var Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.VarDefImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getVarDef()
		 * @generated
		 */
		EClass VAR_DEF = eINSTANCE.getVarDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DEF__NAME = eINSTANCE.getVarDef_Name();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DEF__INIT = eINSTANCE.getVarDef_Init();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.AssignmentActionImpl <em>Assignment Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.AssignmentActionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAssignmentAction()
		 * @generated
		 */
		EClass ASSIGNMENT_ACTION = eINSTANCE.getAssignmentAction();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ACTION__VAR = eINSTANCE.getAssignmentAction_Var();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ACTION__VALUE = eINSTANCE.getAssignmentAction_Value();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ExpressionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.VarRefImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_REF__VAR = eINSTANCE.getVarRef_Var();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EPathImpl <em>EPath</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EPathImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEPath()
		 * @generated
		 */
		EClass EPATH = eINSTANCE.getEPath();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATH__VAR = eINSTANCE.getEPath_Var();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATH__STEPS = eINSTANCE.getEPath_Steps();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EStepImpl <em>EStep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EStepImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEStep()
		 * @generated
		 */
		EClass ESTEP = eINSTANCE.getEStep();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__FEATURE_NAME = eINSTANCE.getEStep_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTEP__FILTER = eINSTANCE.getEStep_Filter();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EStepFilterImpl <em>EStep Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EStepFilterImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEStepFilter()
		 * @generated
		 */
		EClass ESTEP_FILTER = eINSTANCE.getEStepFilter();

		/**
		 * The meta object literal for the '<em><b>Free Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP_FILTER__FREE_VAR_NAME = eINSTANCE.getEStepFilter_FreeVarName();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTEP_FILTER__SCRIPT = eINSTANCE.getEStepFilter_Script();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.LiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.BooleanLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__BOOLEAN_VALUE = eINSTANCE.getBooleanLiteral_BooleanValue();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.IntLiteralImpl <em>Int Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.IntLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getIntLiteral()
		 * @generated
		 */
		EClass INT_LITERAL = eINSTANCE.getIntLiteral();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_LITERAL__INT_VALUE = eINSTANCE.getIntLiteral_IntValue();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.FloatLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getFloatLiteral()
		 * @generated
		 */
		EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

		/**
		 * The meta object literal for the '<em><b>Float Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_LITERAL__FLOAT_VALUE = eINSTANCE.getFloatLiteral_FloatValue();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.StringLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__STRING_VALUE = eINSTANCE.getStringLiteral_StringValue();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ScriptExpressionImpl <em>Script Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ScriptExpressionImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getScriptExpression()
		 * @generated
		 */
		EClass SCRIPT_EXPRESSION = eINSTANCE.getScriptExpression();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_EXPRESSION__SCRIPT = eINSTANCE.getScriptExpression_Script();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.UriLiteralImpl <em>Uri Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.UriLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getUriLiteral()
		 * @generated
		 */
		EClass URI_LITERAL = eINSTANCE.getUriLiteral();

		/**
		 * The meta object literal for the '<em><b>Uri Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_LITERAL__URI_VALUE = eINSTANCE.getUriLiteral_UriValue();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EObjectUriLiteralImpl <em>EObject Uri Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EObjectUriLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEObjectUriLiteral()
		 * @generated
		 */
		EClass EOBJECT_URI_LITERAL = eINSTANCE.getEObjectUriLiteral();

		/**
		 * The meta object literal for the '<em><b>Uri Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOBJECT_URI_LITERAL__URI_FRAGMENT = eINSTANCE.getEObjectUriLiteral_UriFragment();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.EObjectReferenceImpl <em>EObject Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.EObjectReferenceImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEObjectReference()
		 * @generated
		 */
		EClass EOBJECT_REFERENCE = eINSTANCE.getEObjectReference();

		/**
		 * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_REFERENCE__EOBJECT = eINSTANCE.getEObjectReference_EObject();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.DelayLiteralImpl <em>Delay Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.DelayLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getDelayLiteral()
		 * @generated
		 */
		EClass DELAY_LITERAL = eINSTANCE.getDelayLiteral();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_LITERAL__TIME_UNIT = eINSTANCE.getDelayLiteral_TimeUnit();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ResourceImportImpl <em>Resource Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ResourceImportImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getResourceImport()
		 * @generated
		 */
		EClass RESOURCE_IMPORT = eINSTANCE.getResourceImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_IMPORT__IMPORT_URI = eINSTANCE.getResourceImport_ImportURI();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.DomainModelImportImpl <em>Domain Model Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.DomainModelImportImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getDomainModelImport()
		 * @generated
		 */
		EClass DOMAIN_MODEL_IMPORT = eINSTANCE.getDomainModelImport();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.DomainDataImportImpl <em>Domain Data Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.DomainDataImportImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getDomainDataImport()
		 * @generated
		 */
		EClass DOMAIN_DATA_IMPORT = eINSTANCE.getDomainDataImport();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.TimeUnit
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.ResourceUriLiteralImpl <em>Resource Uri Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.ResourceUriLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getResourceUriLiteral()
		 * @generated
		 */
		EClass RESOURCE_URI_LITERAL = eINSTANCE.getResourceUriLiteral();

		/**
		 * The meta object literal for the '<em><b>Resource Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_URI_LITERAL__RESOURCE_URI = eINSTANCE.getResourceUriLiteral_ResourceUri();

		/**
		 * The meta object literal for the '{@link no.hal.scxml.scxmlxt.impl.AbstractUriLiteralImpl <em>Abstract Uri Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.scxml.scxmlxt.impl.AbstractUriLiteralImpl
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getAbstractUriLiteral()
		 * @generated
		 */
		EClass ABSTRACT_URI_LITERAL = eINSTANCE.getAbstractUriLiteral();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_URI_LITERAL__URI = eINSTANCE.getAbstractUriLiteral_Uri();

		/**
		 * The meta object literal for the '<em>EURI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see no.hal.scxml.scxmlxt.impl.ScxmlxtPackageImpl#getEURI()
		 * @generated
		 */
		EDataType EURI = eINSTANCE.getEURI();

	}

} //ScxmlxtPackage
