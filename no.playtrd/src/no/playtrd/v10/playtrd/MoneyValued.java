/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import javax.measure.Measurable;
import org.eclipse.emf.ecore.EObject;

import org.jscience.economics.money.Money;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Money Valued</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.MoneyValued#getMoneyValue <em>Money Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getMoneyValued()
 * @model
 * @generated
 */
public interface MoneyValued extends EObject {
	/**
	 * Returns the value of the '<em><b>Money Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Money Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money Value</em>' attribute.
	 * @see #setMoneyValue(Measurable)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getMoneyValued_MoneyValue()
	 * @model dataType="no.playtrd.v10.playtrd.Money"
	 * @generated
	 */
	Measurable<Money> getMoneyValue();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.MoneyValued#getMoneyValue <em>Money Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money Value</em>' attribute.
	 * @see #getMoneyValue()
	 * @generated
	 */
	void setMoneyValue(Measurable<Money> value);

} // MoneyValued
