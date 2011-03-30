/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import javax.measure.Measurable;
import no.playtrd.v10.playtrd.Item;
import no.playtrd.v10.playtrd.MoneyValued;
import no.playtrd.v10.playtrd.PlaytrdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.jscience.economics.money.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.ItemImpl#getMoneyValue <em>Money Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
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
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.ITEM__MONEY_VALUE, oldMoneyValue, moneyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.ITEM__MONEY_VALUE:
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
			case PlaytrdPackage.ITEM__MONEY_VALUE:
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
			case PlaytrdPackage.ITEM__MONEY_VALUE:
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
			case PlaytrdPackage.ITEM__MONEY_VALUE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MoneyValued.class) {
			switch (derivedFeatureID) {
				case PlaytrdPackage.ITEM__MONEY_VALUE: return PlaytrdPackage.MONEY_VALUED__MONEY_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MoneyValued.class) {
			switch (baseFeatureID) {
				case PlaytrdPackage.MONEY_VALUED__MONEY_VALUE: return PlaytrdPackage.ITEM__MONEY_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //ItemImpl
