/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt.impl;

import no.hal.scxml.scxmlxt.ExitEvent;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExitEventImpl extends AbstractTransitionEventImpl implements ExitEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlxtPackage.Literals.EXIT_EVENT;
	}

	@Override
	public State getSource() {
		EObject parent = this;
		while (parent != null) {
			if (parent instanceof State) {
				return (State)parent;
			}
			parent = parent.eContainer();
		}
		return super.getSource();
	}

} //ExitEventImpl
