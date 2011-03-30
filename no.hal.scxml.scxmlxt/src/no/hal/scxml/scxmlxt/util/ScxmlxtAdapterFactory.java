/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt.util;

import no.hal.scxml.scxmlxt.AbstractState;
import no.hal.scxml.scxmlxt.AbstractTransition;
import no.hal.scxml.scxmlxt.AbstractTransitionEvent;
import no.hal.scxml.scxmlxt.AbstractUriLiteral;
import no.hal.scxml.scxmlxt.Action;
import no.hal.scxml.scxmlxt.AssignmentAction;
import no.hal.scxml.scxmlxt.BooleanLiteral;
import no.hal.scxml.scxmlxt.Condition;
import no.hal.scxml.scxmlxt.DelayLiteral;
import no.hal.scxml.scxmlxt.DomainDataImport;
import no.hal.scxml.scxmlxt.DomainModelImport;
import no.hal.scxml.scxmlxt.EObjectReference;
import no.hal.scxml.scxmlxt.EObjectUriLiteral;
import no.hal.scxml.scxmlxt.EPath;
import no.hal.scxml.scxmlxt.EStep;
import no.hal.scxml.scxmlxt.EStepFilter;
import no.hal.scxml.scxmlxt.EnterEvent;
import no.hal.scxml.scxmlxt.Event;
import no.hal.scxml.scxmlxt.ExitEvent;
import no.hal.scxml.scxmlxt.Expression;
import no.hal.scxml.scxmlxt.FloatLiteral;
import no.hal.scxml.scxmlxt.InitialTransition;
import no.hal.scxml.scxmlxt.IntLiteral;
import no.hal.scxml.scxmlxt.InternalTransition;
import no.hal.scxml.scxmlxt.Literal;
import no.hal.scxml.scxmlxt.ResourceImport;
import no.hal.scxml.scxmlxt.ResourceUriLiteral;
import no.hal.scxml.scxmlxt.ScriptAction;
import no.hal.scxml.scxmlxt.ScriptEvent;
import no.hal.scxml.scxmlxt.ScriptExpression;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;
import no.hal.scxml.scxmlxt.StringLiteral;
import no.hal.scxml.scxmlxt.SymbolicAction;
import no.hal.scxml.scxmlxt.SymbolicEvent;
import no.hal.scxml.scxmlxt.TimerEvent;
import no.hal.scxml.scxmlxt.Transition;
import no.hal.scxml.scxmlxt.TransitionEvent;
import no.hal.scxml.scxmlxt.Typed;
import no.hal.scxml.scxmlxt.UriLiteral;
import no.hal.scxml.scxmlxt.VarDef;
import no.hal.scxml.scxmlxt.VarRef;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage
 * @generated
 */
public class ScxmlxtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScxmlxtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlxtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScxmlxtPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScxmlxtSwitch<Adapter> modelSwitch =
		new ScxmlxtSwitch<Adapter>() {
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseInitialTransition(InitialTransition object) {
				return createInitialTransitionAdapter();
			}
			@Override
			public Adapter caseAbstractState(AbstractState object) {
				return createAbstractStateAdapter();
			}
			@Override
			public Adapter caseAbstractTransition(AbstractTransition object) {
				return createAbstractTransitionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseSymbolicEvent(SymbolicEvent object) {
				return createSymbolicEventAdapter();
			}
			@Override
			public Adapter caseAbstractTransitionEvent(AbstractTransitionEvent object) {
				return createAbstractTransitionEventAdapter();
			}
			@Override
			public Adapter caseTransitionEvent(TransitionEvent object) {
				return createTransitionEventAdapter();
			}
			@Override
			public Adapter caseEnterEvent(EnterEvent object) {
				return createEnterEventAdapter();
			}
			@Override
			public Adapter caseExitEvent(ExitEvent object) {
				return createExitEventAdapter();
			}
			@Override
			public Adapter caseScriptEvent(ScriptEvent object) {
				return createScriptEventAdapter();
			}
			@Override
			public Adapter caseTimerEvent(TimerEvent object) {
				return createTimerEventAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseSymbolicAction(SymbolicAction object) {
				return createSymbolicActionAdapter();
			}
			@Override
			public Adapter caseScriptAction(ScriptAction object) {
				return createScriptActionAdapter();
			}
			@Override
			public Adapter caseTyped(Typed object) {
				return createTypedAdapter();
			}
			@Override
			public Adapter caseVarDef(VarDef object) {
				return createVarDefAdapter();
			}
			@Override
			public Adapter caseAssignmentAction(AssignmentAction object) {
				return createAssignmentActionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseVarRef(VarRef object) {
				return createVarRefAdapter();
			}
			@Override
			public Adapter caseEPath(EPath object) {
				return createEPathAdapter();
			}
			@Override
			public Adapter caseEStep(EStep object) {
				return createEStepAdapter();
			}
			@Override
			public Adapter caseEStepFilter(EStepFilter object) {
				return createEStepFilterAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseIntLiteral(IntLiteral object) {
				return createIntLiteralAdapter();
			}
			@Override
			public Adapter caseFloatLiteral(FloatLiteral object) {
				return createFloatLiteralAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseScriptExpression(ScriptExpression object) {
				return createScriptExpressionAdapter();
			}
			@Override
			public Adapter caseAbstractUriLiteral(AbstractUriLiteral object) {
				return createAbstractUriLiteralAdapter();
			}
			@Override
			public Adapter caseUriLiteral(UriLiteral object) {
				return createUriLiteralAdapter();
			}
			@Override
			public Adapter caseResourceUriLiteral(ResourceUriLiteral object) {
				return createResourceUriLiteralAdapter();
			}
			@Override
			public Adapter caseEObjectUriLiteral(EObjectUriLiteral object) {
				return createEObjectUriLiteralAdapter();
			}
			@Override
			public Adapter caseEObjectReference(EObjectReference object) {
				return createEObjectReferenceAdapter();
			}
			@Override
			public Adapter caseDelayLiteral(DelayLiteral object) {
				return createDelayLiteralAdapter();
			}
			@Override
			public Adapter caseResourceImport(ResourceImport object) {
				return createResourceImportAdapter();
			}
			@Override
			public Adapter caseDomainModelImport(DomainModelImport object) {
				return createDomainModelImportAdapter();
			}
			@Override
			public Adapter caseDomainDataImport(DomainDataImport object) {
				return createDomainDataImportAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.InitialTransition <em>Initial Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.InitialTransition
	 * @generated
	 */
	public Adapter createInitialTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.AbstractState
	 * @generated
	 */
	public Adapter createAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.AbstractTransition
	 * @generated
	 */
	public Adapter createAbstractTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.SymbolicEvent <em>Symbolic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.SymbolicEvent
	 * @generated
	 */
	public Adapter createSymbolicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.AbstractTransitionEvent <em>Abstract Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.AbstractTransitionEvent
	 * @generated
	 */
	public Adapter createAbstractTransitionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.TransitionEvent
	 * @generated
	 */
	public Adapter createTransitionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.EnterEvent <em>Enter Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.EnterEvent
	 * @generated
	 */
	public Adapter createEnterEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.ExitEvent <em>Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.ExitEvent
	 * @generated
	 */
	public Adapter createExitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.ScriptEvent <em>Script Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.ScriptEvent
	 * @generated
	 */
	public Adapter createScriptEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.TimerEvent <em>Timer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.TimerEvent
	 * @generated
	 */
	public Adapter createTimerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.SymbolicAction <em>Symbolic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.SymbolicAction
	 * @generated
	 */
	public Adapter createSymbolicActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.ScriptAction <em>Script Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.ScriptAction
	 * @generated
	 */
	public Adapter createScriptActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Typed
	 * @generated
	 */
	public Adapter createTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.VarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.VarDef
	 * @generated
	 */
	public Adapter createVarDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.AssignmentAction <em>Assignment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.AssignmentAction
	 * @generated
	 */
	public Adapter createAssignmentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.VarRef
	 * @generated
	 */
	public Adapter createVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.EPath <em>EPath</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.EPath
	 * @generated
	 */
	public Adapter createEPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.EStep
	 * @generated
	 */
	public Adapter createEStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.EStepFilter <em>EStep Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.EStepFilter
	 * @generated
	 */
	public Adapter createEStepFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.IntLiteral <em>Int Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.IntLiteral
	 * @generated
	 */
	public Adapter createIntLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.FloatLiteral <em>Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.FloatLiteral
	 * @generated
	 */
	public Adapter createFloatLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.ScriptExpression <em>Script Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.ScriptExpression
	 * @generated
	 */
	public Adapter createScriptExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.UriLiteral <em>Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.UriLiteral
	 * @generated
	 */
	public Adapter createUriLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.EObjectUriLiteral <em>EObject Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.EObjectUriLiteral
	 * @generated
	 */
	public Adapter createEObjectUriLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.EObjectReference <em>EObject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.EObjectReference
	 * @generated
	 */
	public Adapter createEObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.DelayLiteral <em>Delay Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.DelayLiteral
	 * @generated
	 */
	public Adapter createDelayLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.ResourceImport <em>Resource Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.ResourceImport
	 * @generated
	 */
	public Adapter createResourceImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.DomainModelImport <em>Domain Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.DomainModelImport
	 * @generated
	 */
	public Adapter createDomainModelImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.DomainDataImport <em>Domain Data Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.DomainDataImport
	 * @generated
	 */
	public Adapter createDomainDataImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.ResourceUriLiteral <em>Resource Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.ResourceUriLiteral
	 * @generated
	 */
	public Adapter createResourceUriLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.scxml.scxmlxt.AbstractUriLiteral <em>Abstract Uri Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.scxml.scxmlxt.AbstractUriLiteral
	 * @generated
	 */
	public Adapter createAbstractUriLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScxmlxtAdapterFactory
