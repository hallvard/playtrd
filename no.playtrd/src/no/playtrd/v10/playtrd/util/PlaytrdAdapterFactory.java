/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.util;

import java.util.Map;
import no.playtrd.v10.playtrd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.playtrd.v10.playtrd.PlaytrdPackage
 * @generated
 */
public class PlaytrdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlaytrdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaytrdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlaytrdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaytrdSwitch<Adapter> modelSwitch =
		new PlaytrdSwitch<Adapter>() {
			@Override
			public Adapter caseObjectPosition(ObjectPosition object) {
				return createObjectPositionAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter casePlaytrd(Playtrd object) {
				return createPlaytrdAdapter();
			}
			@Override
			public Adapter casePOI(POI object) {
				return createPOIAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public <T extends PlayerState> Adapter caseGame(Game<T> object) {
				return createGameAdapter();
			}
			@Override
			public Adapter casePlayerState(PlayerState object) {
				return createPlayerStateAdapter();
			}
			@Override
			public Adapter caseCommunity(Community object) {
				return createCommunityAdapter();
			}
			@Override
			public Adapter casePositionService(PositionService object) {
				return createPositionServiceAdapter();
			}
			@Override
			public Adapter casePositioned(Positioned object) {
				return createPositionedAdapter();
			}
			@Override
			public Adapter caseMessageService(MessageService object) {
				return createMessageServiceAdapter();
			}
			@Override
			public Adapter casePlayerMessage(PlayerMessage object) {
				return createPlayerMessageAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseScripted(Scripted object) {
				return createScriptedAdapter();
			}
			@Override
			public Adapter caseLocationService(LocationService object) {
				return createLocationServiceAdapter();
			}
			@Override
			public Adapter caseObjectLocation(ObjectLocation object) {
				return createObjectLocationAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseWallet(Wallet object) {
				return createWalletAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseOwner(Owner object) {
				return createOwnerAdapter();
			}
			@Override
			public Adapter caseTrade(Trade object) {
				return createTradeAdapter();
			}
			@Override
			public Adapter caseMoneyValued(MoneyValued object) {
				return createMoneyValuedAdapter();
			}
			@Override
			public Adapter caseInventory(Inventory object) {
				return createInventoryAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseTagService(TagService object) {
				return createTagServiceAdapter();
			}
			@Override
			public Adapter caseTagData(TagData object) {
				return createTagDataAdapter();
			}
			@Override
			public Adapter caseTagEntry(Map.Entry<String, String> object) {
				return createTagEntryAdapter();
			}
			@Override
			public Adapter caseColocationService(ColocationService object) {
				return createColocationServiceAdapter();
			}
			@Override
			public Adapter caseObjectColocation(ObjectColocation object) {
				return createObjectColocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.ObjectPosition <em>Object Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.ObjectPosition
	 * @generated
	 */
	public Adapter createObjectPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Playtrd <em>Playtrd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Playtrd
	 * @generated
	 */
	public Adapter createPlaytrdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.POI <em>POI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.POI
	 * @generated
	 */
	public Adapter createPOIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.PlayerState <em>Player State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.PlayerState
	 * @generated
	 */
	public Adapter createPlayerStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Community
	 * @generated
	 */
	public Adapter createCommunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.PositionService <em>Position Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.PositionService
	 * @generated
	 */
	public Adapter createPositionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Positioned
	 * @generated
	 */
	public Adapter createPositionedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.MessageService <em>Message Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.MessageService
	 * @generated
	 */
	public Adapter createMessageServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.PlayerMessage <em>Player Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.PlayerMessage
	 * @generated
	 */
	public Adapter createPlayerMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Scripted <em>Scripted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Scripted
	 * @generated
	 */
	public Adapter createScriptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.LocationService <em>Location Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.LocationService
	 * @generated
	 */
	public Adapter createLocationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.ObjectLocation <em>Object Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.ObjectLocation
	 * @generated
	 */
	public Adapter createObjectLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Wallet
	 * @generated
	 */
	public Adapter createWalletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Owner
	 * @generated
	 */
	public Adapter createOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Trade <em>Trade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Trade
	 * @generated
	 */
	public Adapter createTradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.MoneyValued <em>Money Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.MoneyValued
	 * @generated
	 */
	public Adapter createMoneyValuedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Inventory
	 * @generated
	 */
	public Adapter createInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.TagService <em>Tag Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.TagService
	 * @generated
	 */
	public Adapter createTagServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.TagData <em>Tag Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.TagData
	 * @generated
	 */
	public Adapter createTagDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Tag Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createTagEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.ColocationService <em>Colocation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.ColocationService
	 * @generated
	 */
	public Adapter createColocationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.playtrd.v10.playtrd.ObjectColocation <em>Object Colocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.playtrd.v10.playtrd.ObjectColocation
	 * @generated
	 */
	public Adapter createObjectColocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlaytrdAdapterFactory
