/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt.impl;

import no.hal.scxml.scxmlxt.*;
import no.hal.scxml.scxmlxt.AbstractUriLiteral;
import no.hal.scxml.scxmlxt.BooleanLiteral;
import no.hal.scxml.scxmlxt.Condition;
import no.hal.scxml.scxmlxt.EObjectUriLiteral;
import no.hal.scxml.scxmlxt.EnterEvent;
import no.hal.scxml.scxmlxt.ExitEvent;
import no.hal.scxml.scxmlxt.FloatLiteral;
import no.hal.scxml.scxmlxt.InitialTransition;
import no.hal.scxml.scxmlxt.IntLiteral;
import no.hal.scxml.scxmlxt.InternalTransition;
import no.hal.scxml.scxmlxt.ResourceUriLiteral;
import no.hal.scxml.scxmlxt.ScriptAction;
import no.hal.scxml.scxmlxt.ScriptEvent;
import no.hal.scxml.scxmlxt.ScriptExpression;
import no.hal.scxml.scxmlxt.ScxmlxtFactory;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;
import no.hal.scxml.scxmlxt.StringLiteral;
import no.hal.scxml.scxmlxt.SymbolicAction;
import no.hal.scxml.scxmlxt.SymbolicEvent;
import no.hal.scxml.scxmlxt.TimerEvent;
import no.hal.scxml.scxmlxt.Transition;
import no.hal.scxml.scxmlxt.TransitionEvent;
import no.hal.scxml.scxmlxt.UriLiteral;
import no.hal.scxml.scxmlxt.VarDef;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlxtFactoryImpl extends EFactoryImpl implements ScxmlxtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScxmlxtFactory init() {
		try {
			ScxmlxtFactory theScxmlxtFactory = (ScxmlxtFactory)EPackage.Registry.INSTANCE.getEFactory("http://no.hal/scxml/scxmlxt.ecore"); 
			if (theScxmlxtFactory != null) {
				return theScxmlxtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScxmlxtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlxtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScxmlxtPackage.STATE_MACHINE: return createStateMachine();
			case ScxmlxtPackage.STATE: return createState();
			case ScxmlxtPackage.INITIAL_TRANSITION: return createInitialTransition();
			case ScxmlxtPackage.TRANSITION: return createTransition();
			case ScxmlxtPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case ScxmlxtPackage.SYMBOLIC_EVENT: return createSymbolicEvent();
			case ScxmlxtPackage.TRANSITION_EVENT: return createTransitionEvent();
			case ScxmlxtPackage.ENTER_EVENT: return createEnterEvent();
			case ScxmlxtPackage.EXIT_EVENT: return createExitEvent();
			case ScxmlxtPackage.SCRIPT_EVENT: return createScriptEvent();
			case ScxmlxtPackage.TIMER_EVENT: return createTimerEvent();
			case ScxmlxtPackage.CONDITION: return createCondition();
			case ScxmlxtPackage.SYMBOLIC_ACTION: return createSymbolicAction();
			case ScxmlxtPackage.SCRIPT_ACTION: return createScriptAction();
			case ScxmlxtPackage.TYPED: return createTyped();
			case ScxmlxtPackage.VAR_DEF: return createVarDef();
			case ScxmlxtPackage.ASSIGNMENT_ACTION: return createAssignmentAction();
			case ScxmlxtPackage.VAR_REF: return createVarRef();
			case ScxmlxtPackage.EPATH: return createEPath();
			case ScxmlxtPackage.ESTEP: return createEStep();
			case ScxmlxtPackage.ESTEP_FILTER: return createEStepFilter();
			case ScxmlxtPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case ScxmlxtPackage.INT_LITERAL: return createIntLiteral();
			case ScxmlxtPackage.FLOAT_LITERAL: return createFloatLiteral();
			case ScxmlxtPackage.STRING_LITERAL: return createStringLiteral();
			case ScxmlxtPackage.SCRIPT_EXPRESSION: return createScriptExpression();
			case ScxmlxtPackage.ABSTRACT_URI_LITERAL: return createAbstractUriLiteral();
			case ScxmlxtPackage.URI_LITERAL: return createUriLiteral();
			case ScxmlxtPackage.RESOURCE_URI_LITERAL: return createResourceUriLiteral();
			case ScxmlxtPackage.EOBJECT_URI_LITERAL: return createEObjectUriLiteral();
			case ScxmlxtPackage.EOBJECT_REFERENCE: return createEObjectReference();
			case ScxmlxtPackage.DELAY_LITERAL: return createDelayLiteral();
			case ScxmlxtPackage.DOMAIN_MODEL_IMPORT: return createDomainModelImport();
			case ScxmlxtPackage.DOMAIN_DATA_IMPORT: return createDomainDataImport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScxmlxtPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case ScxmlxtPackage.EURI:
				return createEURIFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScxmlxtPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case ScxmlxtPackage.EURI:
				return convertEURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialTransition createInitialTransition() {
		InitialTransitionImpl initialTransition = new InitialTransitionImpl();
		return initialTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicEvent createSymbolicEvent() {
		SymbolicEventImpl symbolicEvent = new SymbolicEventImpl();
		return symbolicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent createTransitionEvent() {
		TransitionEventImpl transitionEvent = new TransitionEventImpl();
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterEvent createEnterEvent() {
		EnterEventImpl enterEvent = new EnterEventImpl();
		return enterEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEvent createExitEvent() {
		ExitEventImpl exitEvent = new ExitEventImpl();
		return exitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptEvent createScriptEvent() {
		ScriptEventImpl scriptEvent = new ScriptEventImpl();
		return scriptEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEvent createTimerEvent() {
		TimerEventImpl timerEvent = new TimerEventImpl();
		return timerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicAction createSymbolicAction() {
		SymbolicActionImpl symbolicAction = new SymbolicActionImpl();
		return symbolicAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptAction createScriptAction() {
		ScriptActionImpl scriptAction = new ScriptActionImpl();
		return scriptAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typed createTyped() {
		TypedImpl typed = new TypedImpl();
		return typed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDef createVarDef() {
		VarDefImpl varDef = new VarDefImpl();
		return varDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentAction createAssignmentAction() {
		AssignmentActionImpl assignmentAction = new AssignmentActionImpl();
		return assignmentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarRef createVarRef() {
		VarRefImpl varRef = new VarRefImpl();
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPath createEPath() {
		EPathImpl ePath = new EPathImpl();
		return ePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStep createEStep() {
		EStepImpl eStep = new EStepImpl();
		return eStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStepFilter createEStepFilter() {
		EStepFilterImpl eStepFilter = new EStepFilterImpl();
		return eStepFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntLiteral createIntLiteral() {
		IntLiteralImpl intLiteral = new IntLiteralImpl();
		return intLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatLiteral createFloatLiteral() {
		FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
		return floatLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptExpression createScriptExpression() {
		ScriptExpressionImpl scriptExpression = new ScriptExpressionImpl();
		return scriptExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriLiteral createUriLiteral() {
		UriLiteralImpl uriLiteral = new UriLiteralImpl();
		return uriLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectUriLiteral createEObjectUriLiteral() {
		EObjectUriLiteralImpl eObjectUriLiteral = new EObjectUriLiteralImpl();
		return eObjectUriLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectReference createEObjectReference() {
		EObjectReferenceImpl eObjectReference = new EObjectReferenceImpl();
		return eObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayLiteral createDelayLiteral() {
		DelayLiteralImpl delayLiteral = new DelayLiteralImpl();
		return delayLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModelImport createDomainModelImport() {
		DomainModelImportImpl domainModelImport = new DomainModelImportImpl();
		return domainModelImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDataImport createDomainDataImport() {
		DomainDataImportImpl domainDataImport = new DomainDataImportImpl();
		return domainDataImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUriLiteral createResourceUriLiteral() {
		ResourceUriLiteralImpl resourceUriLiteral = new ResourceUriLiteralImpl();
		return resourceUriLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUriLiteral createAbstractUriLiteral() {
		AbstractUriLiteralImpl abstractUriLiteral = new AbstractUriLiteralImpl();
		return abstractUriLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public URI createEURIFromString(EDataType eDataType, String initialValue) {
		URI uri = null;
		return (initialValue != null && initialValue.length() > 0 ? URI.createURI(initialValue) : null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertEURIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue instanceof URI ? instanceValue.toString() : "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlxtPackage getScxmlxtPackage() {
		return (ScxmlxtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScxmlxtPackage getPackage() {
		return ScxmlxtPackage.eINSTANCE;
	}

} //ScxmlxtFactoryImpl
