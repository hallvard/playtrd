/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.Game#getName <em>Name</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Game#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Game#getCurrentStates <em>Current States</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getGame()
 * @model
 * @generated
 */
public interface Game<T extends PlayerState> extends Scripted {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getGame_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Game#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.PlayerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getGame_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlayerState> getPlayers();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' containment reference.
	 * @see #setStateMachine(StateMachine)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getGame_StateMachine()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Game#getStateMachine <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' containment reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Current States</b></em>' reference list.
	 * The list contents are of type {@link no.hal.scxml.scxmlxt.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current States</em>' reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getGame_CurrentStates()
	 * @model
	 * @generated
	 */
	EList<State> getCurrentStates();

} // Game
