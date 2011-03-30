/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.TimerEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.TimerEvent#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getTimerEvent()
 * @model
 * @generated
 */
public interface TimerEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(Expression)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getTimerEvent_Delay()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDelay();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.TimerEvent#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Expression value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getTimerEvent_Event()
	 * @model containment="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.TimerEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // TimerEvent
