/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage
 * @generated
 */
public interface ScxmlxtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScxmlxtFactory eINSTANCE = no.hal.scxml.scxmlxt.impl.ScxmlxtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Initial Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Transition</em>'.
	 * @generated
	 */
	InitialTransition createInitialTransition();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Internal Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Transition</em>'.
	 * @generated
	 */
	InternalTransition createInternalTransition();

	/**
	 * Returns a new object of class '<em>Symbolic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbolic Event</em>'.
	 * @generated
	 */
	SymbolicEvent createSymbolicEvent();

	/**
	 * Returns a new object of class '<em>Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Event</em>'.
	 * @generated
	 */
	TransitionEvent createTransitionEvent();

	/**
	 * Returns a new object of class '<em>Enter Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enter Event</em>'.
	 * @generated
	 */
	EnterEvent createEnterEvent();

	/**
	 * Returns a new object of class '<em>Exit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Event</em>'.
	 * @generated
	 */
	ExitEvent createExitEvent();

	/**
	 * Returns a new object of class '<em>Script Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Event</em>'.
	 * @generated
	 */
	ScriptEvent createScriptEvent();

	/**
	 * Returns a new object of class '<em>Timer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Event</em>'.
	 * @generated
	 */
	TimerEvent createTimerEvent();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Symbolic Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbolic Action</em>'.
	 * @generated
	 */
	SymbolicAction createSymbolicAction();

	/**
	 * Returns a new object of class '<em>Script Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Action</em>'.
	 * @generated
	 */
	ScriptAction createScriptAction();

	/**
	 * Returns a new object of class '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed</em>'.
	 * @generated
	 */
	Typed createTyped();

	/**
	 * Returns a new object of class '<em>Var Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Def</em>'.
	 * @generated
	 */
	VarDef createVarDef();

	/**
	 * Returns a new object of class '<em>Assignment Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Action</em>'.
	 * @generated
	 */
	AssignmentAction createAssignmentAction();

	/**
	 * Returns a new object of class '<em>Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Ref</em>'.
	 * @generated
	 */
	VarRef createVarRef();

	/**
	 * Returns a new object of class '<em>EPath</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPath</em>'.
	 * @generated
	 */
	EPath createEPath();

	/**
	 * Returns a new object of class '<em>EStep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStep</em>'.
	 * @generated
	 */
	EStep createEStep();

	/**
	 * Returns a new object of class '<em>EStep Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStep Filter</em>'.
	 * @generated
	 */
	EStepFilter createEStepFilter();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Literal</em>'.
	 * @generated
	 */
	IntLiteral createIntLiteral();

	/**
	 * Returns a new object of class '<em>Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Literal</em>'.
	 * @generated
	 */
	FloatLiteral createFloatLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Script Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Expression</em>'.
	 * @generated
	 */
	ScriptExpression createScriptExpression();

	/**
	 * Returns a new object of class '<em>Uri Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Literal</em>'.
	 * @generated
	 */
	UriLiteral createUriLiteral();

	/**
	 * Returns a new object of class '<em>EObject Uri Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Uri Literal</em>'.
	 * @generated
	 */
	EObjectUriLiteral createEObjectUriLiteral();

	/**
	 * Returns a new object of class '<em>EObject Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Reference</em>'.
	 * @generated
	 */
	EObjectReference createEObjectReference();

	/**
	 * Returns a new object of class '<em>Delay Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Literal</em>'.
	 * @generated
	 */
	DelayLiteral createDelayLiteral();

	/**
	 * Returns a new object of class '<em>Domain Model Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model Import</em>'.
	 * @generated
	 */
	DomainModelImport createDomainModelImport();

	/**
	 * Returns a new object of class '<em>Domain Data Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Data Import</em>'.
	 * @generated
	 */
	DomainDataImport createDomainDataImport();

	/**
	 * Returns a new object of class '<em>Resource Uri Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Uri Literal</em>'.
	 * @generated
	 */
	ResourceUriLiteral createResourceUriLiteral();

	/**
	 * Returns a new object of class '<em>Abstract Uri Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Uri Literal</em>'.
	 * @generated
	 */
	AbstractUriLiteral createAbstractUriLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScxmlxtPackage getScxmlxtPackage();

} //ScxmlxtFactory
