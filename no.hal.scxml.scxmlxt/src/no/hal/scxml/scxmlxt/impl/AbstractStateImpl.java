/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt.impl;

import java.util.Collection;

import no.hal.scxml.scxmlxt.AbstractState;
import no.hal.scxml.scxmlxt.AbstractTransition;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.VarDef;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.impl.AbstractStateImpl#getStates <em>States</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.impl.AbstractStateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.impl.AbstractStateImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends EObjectImpl implements AbstractState {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTransition> transitions;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDef> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlxtPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ScxmlxtPackage.ABSTRACT_STATE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<AbstractTransition>(AbstractTransition.class, this, ScxmlxtPackage.ABSTRACT_STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDef> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<VarDef>(VarDef.class, this, ScxmlxtPackage.ABSTRACT_STATE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlxtPackage.ABSTRACT_STATE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ScxmlxtPackage.ABSTRACT_STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case ScxmlxtPackage.ABSTRACT_STATE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlxtPackage.ABSTRACT_STATE__STATES:
				return getStates();
			case ScxmlxtPackage.ABSTRACT_STATE__TRANSITIONS:
				return getTransitions();
			case ScxmlxtPackage.ABSTRACT_STATE__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScxmlxtPackage.ABSTRACT_STATE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ScxmlxtPackage.ABSTRACT_STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends AbstractTransition>)newValue);
				return;
			case ScxmlxtPackage.ABSTRACT_STATE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends VarDef>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScxmlxtPackage.ABSTRACT_STATE__STATES:
				getStates().clear();
				return;
			case ScxmlxtPackage.ABSTRACT_STATE__TRANSITIONS:
				getTransitions().clear();
				return;
			case ScxmlxtPackage.ABSTRACT_STATE__VARIABLES:
				getVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScxmlxtPackage.ABSTRACT_STATE__STATES:
				return states != null && !states.isEmpty();
			case ScxmlxtPackage.ABSTRACT_STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case ScxmlxtPackage.ABSTRACT_STATE__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateImpl
