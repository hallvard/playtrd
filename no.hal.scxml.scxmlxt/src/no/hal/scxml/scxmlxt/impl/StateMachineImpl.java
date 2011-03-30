/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt.impl;

import java.util.Collection;
import no.hal.scxml.scxmlxt.ResourceImport;
import no.hal.scxml.scxmlxt.DomainDataImport;
import no.hal.scxml.scxmlxt.DomainModelImport;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.impl.StateMachineImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.impl.StateMachineImpl#getCurrentStates <em>Current States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends AbstractStateImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceImport> imports;
	/**
	 * The cached value of the '{@link #getCurrentStates() <em>Current States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> currentStates;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlxtPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ResourceImport>(ResourceImport.class, this, ScxmlxtPackage.STATE_MACHINE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getCurrentStates() {
		if (currentStates == null) {
			currentStates = new EObjectResolvingEList<State>(State.class, this, ScxmlxtPackage.STATE_MACHINE__CURRENT_STATES);
		}
		return currentStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlxtPackage.STATE_MACHINE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case ScxmlxtPackage.STATE_MACHINE__IMPORTS:
				return getImports();
			case ScxmlxtPackage.STATE_MACHINE__CURRENT_STATES:
				return getCurrentStates();
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
			case ScxmlxtPackage.STATE_MACHINE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ResourceImport>)newValue);
				return;
			case ScxmlxtPackage.STATE_MACHINE__CURRENT_STATES:
				getCurrentStates().clear();
				getCurrentStates().addAll((Collection<? extends State>)newValue);
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
			case ScxmlxtPackage.STATE_MACHINE__IMPORTS:
				getImports().clear();
				return;
			case ScxmlxtPackage.STATE_MACHINE__CURRENT_STATES:
				getCurrentStates().clear();
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
			case ScxmlxtPackage.STATE_MACHINE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ScxmlxtPackage.STATE_MACHINE__CURRENT_STATES:
				return currentStates != null && !currentStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
