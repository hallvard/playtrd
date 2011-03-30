/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;
import java.util.List;

import javax.measure.Measurable;
import javax.measure.Measure;

import no.playtrd.properties.GameCurrency;
import no.playtrd.v10.playtrd.Inventory;
import no.playtrd.v10.playtrd.Item;
import no.playtrd.v10.playtrd.Owner;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.Trade;
import no.playtrd.v10.playtrd.Wallet;
import no.playtrd.v10.playtrd.util.PlaytrdValidator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.jscience.economics.money.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TradeImpl#getSeller <em>Seller</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TradeImpl#getBuyer <em>Buyer</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TradeImpl#getSellerWallet <em>Seller Wallet</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TradeImpl#getSellerItems <em>Seller Items</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TradeImpl#getBuyerItems <em>Buyer Items</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TradeImpl#getBuyerWallet <em>Buyer Wallet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TradeImpl extends MoneyValuedImpl implements Trade {
	/**
	 * The cached value of the '{@link #getSeller() <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeller()
	 * @generated
	 * @ordered
	 */
	protected Owner seller;

	/**
	 * The cached value of the '{@link #getBuyer() <em>Buyer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyer()
	 * @generated
	 * @ordered
	 */
	protected Owner buyer;

	/**
	 * The cached value of the '{@link #getSellerWallet() <em>Seller Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerWallet()
	 * @generated
	 * @ordered
	 */
	protected Wallet sellerWallet;

	/**
	 * The cached value of the '{@link #getSellerItems() <em>Seller Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> sellerItems;

	/**
	 * The cached value of the '{@link #getBuyerItems() <em>Buyer Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> buyerItems;

	/**
	 * The cached value of the '{@link #getBuyerWallet() <em>Buyer Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerWallet()
	 * @generated
	 * @ordered
	 */
	protected Wallet buyerWallet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.TRADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner getSeller() {
		if (seller != null && seller.eIsProxy()) {
			InternalEObject oldSeller = (InternalEObject)seller;
			seller = (Owner)eResolveProxy(oldSeller);
			if (seller != oldSeller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.TRADE__SELLER, oldSeller, seller));
			}
		}
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner basicGetSeller() {
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeller(Owner newSeller) {
		Owner oldSeller = seller;
		seller = newSeller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.TRADE__SELLER, oldSeller, seller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner getBuyer() {
		if (buyer != null && buyer.eIsProxy()) {
			InternalEObject oldBuyer = (InternalEObject)buyer;
			buyer = (Owner)eResolveProxy(oldBuyer);
			if (buyer != oldBuyer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.TRADE__BUYER, oldBuyer, buyer));
			}
		}
		return buyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner basicGetBuyer() {
		return buyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuyer(Owner newBuyer) {
		Owner oldBuyer = buyer;
		buyer = newBuyer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.TRADE__BUYER, oldBuyer, buyer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet getSellerWallet() {
		if (sellerWallet != null && sellerWallet.eIsProxy()) {
			InternalEObject oldSellerWallet = (InternalEObject)sellerWallet;
			sellerWallet = (Wallet)eResolveProxy(oldSellerWallet);
			if (sellerWallet != oldSellerWallet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.TRADE__SELLER_WALLET, oldSellerWallet, sellerWallet));
			}
		}
		return sellerWallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet basicGetSellerWallet() {
		return sellerWallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSellerWallet(Wallet newSellerWallet) {
		Wallet oldSellerWallet = sellerWallet;
		sellerWallet = newSellerWallet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.TRADE__SELLER_WALLET, oldSellerWallet, sellerWallet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getSellerItems() {
		if (sellerItems == null) {
			sellerItems = new EObjectResolvingEList<Item>(Item.class, this, PlaytrdPackage.TRADE__SELLER_ITEMS);
		}
		return sellerItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getBuyerItems() {
		if (buyerItems == null) {
			buyerItems = new EObjectResolvingEList<Item>(Item.class, this, PlaytrdPackage.TRADE__BUYER_ITEMS);
		}
		return buyerItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet getBuyerWallet() {
		if (buyerWallet != null && buyerWallet.eIsProxy()) {
			InternalEObject oldBuyerWallet = (InternalEObject)buyerWallet;
			buyerWallet = (Wallet)eResolveProxy(oldBuyerWallet);
			if (buyerWallet != oldBuyerWallet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.TRADE__BUYER_WALLET, oldBuyerWallet, buyerWallet));
			}
		}
		return buyerWallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet basicGetBuyerWallet() {
		return buyerWallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuyerWallet(Wallet newBuyerWallet) {
		Wallet oldBuyerWallet = buyerWallet;
		buyerWallet = newBuyerWallet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.TRADE__BUYER_WALLET, oldBuyerWallet, buyerWallet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void perform() {
		// compute new money values
		double total = PlaytrdValidator.getTradeMoneyValue(this);
		double newBuyerMoney = getBuyerWallet().getMoneyValue().doubleValue(GameCurrency.GAME_CURRENCY) - total;
		double newSellerMoney = getSellerWallet().getMoneyValue().doubleValue(GameCurrency.GAME_CURRENCY) + total;
		// transfer of items
		transferItems(getBuyer(), getSellerItems());
		transferItems(getSeller(), getBuyerItems());
		// transfer of money
		getBuyerWallet().setMoneyValue(Measure.valueOf(newBuyerMoney, GameCurrency.GAME_CURRENCY));
		getSellerWallet().setMoneyValue(Measure.valueOf(newSellerMoney, GameCurrency.GAME_CURRENCY));
	}

	private void transferItems(Inventory target, List<Item> items) {
		for (Item item : items) {
			Inventory inventory = getItemInventory(item);
			inventory.getContainedItems().remove(item);
			target.getContainedItems().add(item);
		}
	}

	private Inventory getItemInventory(Item item) {
		for (EObject container = item.eContainer(); container != null; container = container.eContainer()) {
			if (container instanceof Inventory) {
				return (Inventory)container;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.TRADE__SELLER:
				if (resolve) return getSeller();
				return basicGetSeller();
			case PlaytrdPackage.TRADE__BUYER:
				if (resolve) return getBuyer();
				return basicGetBuyer();
			case PlaytrdPackage.TRADE__SELLER_WALLET:
				if (resolve) return getSellerWallet();
				return basicGetSellerWallet();
			case PlaytrdPackage.TRADE__SELLER_ITEMS:
				return getSellerItems();
			case PlaytrdPackage.TRADE__BUYER_ITEMS:
				return getBuyerItems();
			case PlaytrdPackage.TRADE__BUYER_WALLET:
				if (resolve) return getBuyerWallet();
				return basicGetBuyerWallet();
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
			case PlaytrdPackage.TRADE__SELLER:
				setSeller((Owner)newValue);
				return;
			case PlaytrdPackage.TRADE__BUYER:
				setBuyer((Owner)newValue);
				return;
			case PlaytrdPackage.TRADE__SELLER_WALLET:
				setSellerWallet((Wallet)newValue);
				return;
			case PlaytrdPackage.TRADE__SELLER_ITEMS:
				getSellerItems().clear();
				getSellerItems().addAll((Collection<? extends Item>)newValue);
				return;
			case PlaytrdPackage.TRADE__BUYER_ITEMS:
				getBuyerItems().clear();
				getBuyerItems().addAll((Collection<? extends Item>)newValue);
				return;
			case PlaytrdPackage.TRADE__BUYER_WALLET:
				setBuyerWallet((Wallet)newValue);
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
			case PlaytrdPackage.TRADE__SELLER:
				setSeller((Owner)null);
				return;
			case PlaytrdPackage.TRADE__BUYER:
				setBuyer((Owner)null);
				return;
			case PlaytrdPackage.TRADE__SELLER_WALLET:
				setSellerWallet((Wallet)null);
				return;
			case PlaytrdPackage.TRADE__SELLER_ITEMS:
				getSellerItems().clear();
				return;
			case PlaytrdPackage.TRADE__BUYER_ITEMS:
				getBuyerItems().clear();
				return;
			case PlaytrdPackage.TRADE__BUYER_WALLET:
				setBuyerWallet((Wallet)null);
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
			case PlaytrdPackage.TRADE__SELLER:
				return seller != null;
			case PlaytrdPackage.TRADE__BUYER:
				return buyer != null;
			case PlaytrdPackage.TRADE__SELLER_WALLET:
				return sellerWallet != null;
			case PlaytrdPackage.TRADE__SELLER_ITEMS:
				return sellerItems != null && !sellerItems.isEmpty();
			case PlaytrdPackage.TRADE__BUYER_ITEMS:
				return buyerItems != null && !buyerItems.isEmpty();
			case PlaytrdPackage.TRADE__BUYER_WALLET:
				return buyerWallet != null;
		}
		return super.eIsSet(featureID);
	}

} //TradeImpl
