/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import javax.measure.Measurable;
import no.playtrd.v10.playtrd.MoneyValued;
import no.playtrd.v10.playtrd.PlaytrdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.jscience.economics.money.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Money Valued</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.MoneyValuedImpl#getMoneyValue <em>Money Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoneyValuedImpl extends EObjectImpl implements MoneyValued {
	/**
	 * The cached value of the '{@link #getMoneyValue() <em>Money Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneyValue()
	 * @generated
	 * @ordered
	 */
	protected Measurable<Money> moneyValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoneyValuedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.MONEY_VALUED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurable<Money> getMoneyValue() {
		return moneyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoneyValue(Measurable<Money> newMoneyValue) {
		Measurable<Money> oldMoneyValue = moneyValue;
		moneyValue = newMoneyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.MONEY_VALUED__MONEY_VALUE, oldMoneyValue, moneyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.MONEY_VALUED__MONEY_VALUE:
				return getMoneyValue();
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
			case PlaytrdPackage.MONEY_VALUED__MONEY_VALUE:
				setMoneyValue((Measurable<Money>)newValue);
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
			case PlaytrdPackage.MONEY_VALUED__MONEY_VALUE:
				setMoneyValue((Measurable<Money>)null);
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
			case PlaytrdPackage.MONEY_VALUED__MONEY_VALUE:
				return moneyValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (moneyValue: ");
		result.append(moneyValue);
		result.append(')');
		return result.toString();
	}

} //MoneyValuedImpl
