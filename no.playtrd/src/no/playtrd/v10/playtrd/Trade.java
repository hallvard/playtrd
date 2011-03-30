/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.Trade#getSeller <em>Seller</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Trade#getBuyer <em>Buyer</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Trade#getSellerWallet <em>Seller Wallet</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Trade#getSellerItems <em>Seller Items</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Trade#getBuyerItems <em>Buyer Items</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Trade#getBuyerWallet <em>Buyer Wallet</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='buyerIsNonNull sellerIsNonNull buyerWalletIsNonNull sellerOwnsSellerItems buyerOwnsBuyerItems moneyValueDefined walletHasMoneyValue'"
 * @generated
 */
public interface Trade extends MoneyValued {
	/**
	 * Returns the value of the '<em><b>Seller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller</em>' reference.
	 * @see #setSeller(Owner)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade_Seller()
	 * @model
	 * @generated
	 */
	Owner getSeller();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Trade#getSeller <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller</em>' reference.
	 * @see #getSeller()
	 * @generated
	 */
	void setSeller(Owner value);

	/**
	 * Returns the value of the '<em><b>Buyer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buyer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buyer</em>' reference.
	 * @see #setBuyer(Owner)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade_Buyer()
	 * @model
	 * @generated
	 */
	Owner getBuyer();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Trade#getBuyer <em>Buyer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer</em>' reference.
	 * @see #getBuyer()
	 * @generated
	 */
	void setBuyer(Owner value);

	/**
	 * Returns the value of the '<em><b>Seller Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seller Wallet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller Wallet</em>' reference.
	 * @see #setSellerWallet(Wallet)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade_SellerWallet()
	 * @model
	 * @generated
	 */
	Wallet getSellerWallet();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Trade#getSellerWallet <em>Seller Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Wallet</em>' reference.
	 * @see #getSellerWallet()
	 * @generated
	 */
	void setSellerWallet(Wallet value);

	/**
	 * Returns the value of the '<em><b>Seller Items</b></em>' reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seller Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller Items</em>' reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade_SellerItems()
	 * @model
	 * @generated
	 */
	EList<Item> getSellerItems();

	/**
	 * Returns the value of the '<em><b>Buyer Items</b></em>' reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buyer Items</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buyer Items</em>' reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade_BuyerItems()
	 * @model
	 * @generated
	 */
	EList<Item> getBuyerItems();

	/**
	 * Returns the value of the '<em><b>Buyer Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buyer Wallet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buyer Wallet</em>' reference.
	 * @see #setBuyerWallet(Wallet)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getTrade_BuyerWallet()
	 * @model
	 * @generated
	 */
	Wallet getBuyerWallet();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Trade#getBuyerWallet <em>Buyer Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer Wallet</em>' reference.
	 * @see #getBuyerWallet()
	 * @generated
	 */
	void setBuyerWallet(Wallet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void perform();

} // Trade
