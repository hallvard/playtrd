/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Map;

import javax.measure.Measurable;

import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.playtrd.v10.playtrd.ColocationService;
import no.playtrd.v10.playtrd.Community;
import no.playtrd.v10.playtrd.Game;
import no.playtrd.v10.playtrd.Inventory;
import no.playtrd.v10.playtrd.Item;
import no.playtrd.v10.playtrd.LocationService;
import no.playtrd.v10.playtrd.MessageService;
import no.playtrd.v10.playtrd.MoneyValued;
import no.playtrd.v10.playtrd.ObjectColocation;
import no.playtrd.v10.playtrd.ObjectLocation;
import no.playtrd.v10.playtrd.ObjectPosition;
import no.playtrd.v10.playtrd.Owner;
import no.playtrd.v10.playtrd.Player;
import no.playtrd.v10.playtrd.PlayerMessage;
import no.playtrd.v10.playtrd.PlayerState;
import no.playtrd.v10.playtrd.Playtrd;
import no.playtrd.v10.playtrd.PlaytrdFactory;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.PositionService;
import no.playtrd.v10.playtrd.Positioned;
import no.playtrd.v10.playtrd.Properties;
import no.playtrd.v10.playtrd.Region;
import no.playtrd.v10.playtrd.Scripted;
import no.playtrd.v10.playtrd.Service;
import no.playtrd.v10.playtrd.Store;
import no.playtrd.v10.playtrd.TagData;
import no.playtrd.v10.playtrd.TagService;
import no.playtrd.v10.playtrd.Trade;
import no.playtrd.v10.playtrd.Wallet;
import no.playtrd.v10.playtrd.util.PlaytrdValidator;

import org.eclipse.e4.tm.widgets.WidgetsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.jscience.geography.coordinates.LatLong;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaytrdPackageImpl extends EPackageImpl implements PlaytrdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playtrdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyValuedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colocationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectColocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType globePositionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType moneyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iEditingDomainProviderEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlaytrdPackageImpl() {
		super(eNS_URI, PlaytrdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PlaytrdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlaytrdPackage init() {
		if (isInited) return (PlaytrdPackage)EPackage.Registry.INSTANCE.getEPackage(PlaytrdPackage.eNS_URI);

		// Obtain or create and register package
		PlaytrdPackageImpl thePlaytrdPackage = (PlaytrdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlaytrdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlaytrdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ScxmlxtPackage.eINSTANCE.eClass();
		WidgetsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePlaytrdPackage.createPackageContents();

		// Initialize created meta-data
		thePlaytrdPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlaytrdPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PlaytrdValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlaytrdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlaytrdPackage.eNS_URI, thePlaytrdPackage);
		return thePlaytrdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPosition() {
		return objectPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPosition_GlobePosition() {
		return (EAttribute)objectPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPosition_Positioned() {
		return (EReference)objectPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Name() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaytrd() {
		return playtrdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaytrd_Regions() {
		return (EReference)playtrdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaytrd_Communities() {
		return (EReference)playtrdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaytrd_Services() {
		return (EReference)playtrdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaytrd_Games() {
		return (EReference)playtrdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaytrd_Uis() {
		return (EReference)playtrdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOI() {
		return poiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOI_Name() {
		return (EAttribute)poiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Name() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Pois() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Name() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Players() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_StateMachine() {
		return (EReference)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_CurrentStates() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerState() {
		return playerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayerState_Player() {
		return (EReference)playerStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunity() {
		return communityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunity_Name() {
		return (EAttribute)communityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunity_Players() {
		return (EReference)communityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionService() {
		return positionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionService_ObjectPositions() {
		return (EReference)positionServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositioned() {
		return positionedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageService() {
		return messageServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageService_Messages() {
		return (EReference)messageServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerMessage() {
		return playerMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayerMessage_Player() {
		return (EReference)playerMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerMessage_Message() {
		return (EAttribute)playerMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripted() {
		return scriptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScripted_ScriptSource() {
		return (EAttribute)scriptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationService() {
		return locationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationService_ObjectLocations() {
		return (EReference)locationServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectLocation() {
		return objectLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectLocation_Positioned() {
		return (EReference)objectLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectLocation_Target() {
		return (EReference)objectLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallet() {
		return walletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwner() {
		return ownerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrade() {
		return tradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrade_Seller() {
		return (EReference)tradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrade_Buyer() {
		return (EReference)tradeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrade_SellerWallet() {
		return (EReference)tradeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrade_SellerItems() {
		return (EReference)tradeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrade_BuyerItems() {
		return (EReference)tradeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrade_BuyerWallet() {
		return (EReference)tradeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoneyValued() {
		return moneyValuedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoneyValued_MoneyValue() {
		return (EAttribute)moneyValuedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventory_ContainedItems() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagService() {
		return tagServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagService_MetaData() {
		return (EReference)tagServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagData() {
		return tagDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagData_Poi() {
		return (EReference)tagDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagData_Entries() {
		return (EReference)tagDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagEntry() {
		return tagEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagEntry_Key() {
		return (EAttribute)tagEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagEntry_Value() {
		return (EAttribute)tagEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColocationService() {
		return colocationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColocationService_ObjectColocations() {
		return (EReference)colocationServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectColocation() {
		return objectColocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectColocation_Positioned() {
		return (EReference)objectColocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectColocation_Targets() {
		return (EReference)objectColocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlobePosition() {
		return globePositionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMoney() {
		return moneyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIEditingDomainProvider() {
		return iEditingDomainProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaytrdFactory getPlaytrdFactory() {
		return (PlaytrdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		objectPositionEClass = createEClass(OBJECT_POSITION);
		createEAttribute(objectPositionEClass, OBJECT_POSITION__GLOBE_POSITION);
		createEReference(objectPositionEClass, OBJECT_POSITION__POSITIONED);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__NAME);

		playtrdEClass = createEClass(PLAYTRD);
		createEReference(playtrdEClass, PLAYTRD__REGIONS);
		createEReference(playtrdEClass, PLAYTRD__COMMUNITIES);
		createEReference(playtrdEClass, PLAYTRD__SERVICES);
		createEReference(playtrdEClass, PLAYTRD__GAMES);
		createEReference(playtrdEClass, PLAYTRD__UIS);

		poiEClass = createEClass(POI);
		createEAttribute(poiEClass, POI__NAME);

		regionEClass = createEClass(REGION);
		createEAttribute(regionEClass, REGION__NAME);
		createEReference(regionEClass, REGION__POIS);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__NAME);
		createEReference(gameEClass, GAME__PLAYERS);
		createEReference(gameEClass, GAME__STATE_MACHINE);
		createEReference(gameEClass, GAME__CURRENT_STATES);

		playerStateEClass = createEClass(PLAYER_STATE);
		createEReference(playerStateEClass, PLAYER_STATE__PLAYER);

		communityEClass = createEClass(COMMUNITY);
		createEAttribute(communityEClass, COMMUNITY__NAME);
		createEReference(communityEClass, COMMUNITY__PLAYERS);

		positionServiceEClass = createEClass(POSITION_SERVICE);
		createEReference(positionServiceEClass, POSITION_SERVICE__OBJECT_POSITIONS);

		positionedEClass = createEClass(POSITIONED);

		messageServiceEClass = createEClass(MESSAGE_SERVICE);
		createEReference(messageServiceEClass, MESSAGE_SERVICE__MESSAGES);

		playerMessageEClass = createEClass(PLAYER_MESSAGE);
		createEReference(playerMessageEClass, PLAYER_MESSAGE__PLAYER);
		createEAttribute(playerMessageEClass, PLAYER_MESSAGE__MESSAGE);

		serviceEClass = createEClass(SERVICE);

		scriptedEClass = createEClass(SCRIPTED);
		createEAttribute(scriptedEClass, SCRIPTED__SCRIPT_SOURCE);

		locationServiceEClass = createEClass(LOCATION_SERVICE);
		createEReference(locationServiceEClass, LOCATION_SERVICE__OBJECT_LOCATIONS);

		objectLocationEClass = createEClass(OBJECT_LOCATION);
		createEReference(objectLocationEClass, OBJECT_LOCATION__POSITIONED);
		createEReference(objectLocationEClass, OBJECT_LOCATION__TARGET);

		itemEClass = createEClass(ITEM);

		walletEClass = createEClass(WALLET);

		storeEClass = createEClass(STORE);

		ownerEClass = createEClass(OWNER);

		tradeEClass = createEClass(TRADE);
		createEReference(tradeEClass, TRADE__SELLER);
		createEReference(tradeEClass, TRADE__BUYER);
		createEReference(tradeEClass, TRADE__SELLER_WALLET);
		createEReference(tradeEClass, TRADE__SELLER_ITEMS);
		createEReference(tradeEClass, TRADE__BUYER_ITEMS);
		createEReference(tradeEClass, TRADE__BUYER_WALLET);

		moneyValuedEClass = createEClass(MONEY_VALUED);
		createEAttribute(moneyValuedEClass, MONEY_VALUED__MONEY_VALUE);

		inventoryEClass = createEClass(INVENTORY);
		createEReference(inventoryEClass, INVENTORY__CONTAINED_ITEMS);

		propertiesEClass = createEClass(PROPERTIES);

		tagServiceEClass = createEClass(TAG_SERVICE);
		createEReference(tagServiceEClass, TAG_SERVICE__META_DATA);

		tagDataEClass = createEClass(TAG_DATA);
		createEReference(tagDataEClass, TAG_DATA__POI);
		createEReference(tagDataEClass, TAG_DATA__ENTRIES);

		tagEntryEClass = createEClass(TAG_ENTRY);
		createEAttribute(tagEntryEClass, TAG_ENTRY__KEY);
		createEAttribute(tagEntryEClass, TAG_ENTRY__VALUE);

		colocationServiceEClass = createEClass(COLOCATION_SERVICE);
		createEReference(colocationServiceEClass, COLOCATION_SERVICE__OBJECT_COLOCATIONS);

		objectColocationEClass = createEClass(OBJECT_COLOCATION);
		createEReference(objectColocationEClass, OBJECT_COLOCATION__POSITIONED);
		createEReference(objectColocationEClass, OBJECT_COLOCATION__TARGETS);

		// Create data types
		globePositionEDataType = createEDataType(GLOBE_POSITION);
		moneyEDataType = createEDataType(MONEY);
		iEditingDomainProviderEDataType = createEDataType(IEDITING_DOMAIN_PROVIDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		WidgetsPackage theWidgetsPackage = (WidgetsPackage)EPackage.Registry.INSTANCE.getEPackage(WidgetsPackage.eNS_URI);
		ScxmlxtPackage theScxmlxtPackage = (ScxmlxtPackage)EPackage.Registry.INSTANCE.getEPackage(ScxmlxtPackage.eNS_URI);

		// Create type parameters
		ETypeParameter gameEClass_T = addETypeParameter(gameEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getPlayerState());
		gameEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		objectPositionEClass.getESuperTypes().add(this.getScripted());
		playerEClass.getESuperTypes().add(this.getPositioned());
		playtrdEClass.getESuperTypes().add(this.getScripted());
		poiEClass.getESuperTypes().add(this.getPositioned());
		gameEClass.getESuperTypes().add(this.getScripted());
		playerStateEClass.getESuperTypes().add(this.getScripted());
		positionServiceEClass.getESuperTypes().add(this.getService());
		messageServiceEClass.getESuperTypes().add(this.getService());
		playerMessageEClass.getESuperTypes().add(this.getScripted());
		serviceEClass.getESuperTypes().add(this.getScripted());
		locationServiceEClass.getESuperTypes().add(this.getService());
		itemEClass.getESuperTypes().add(this.getPositioned());
		itemEClass.getESuperTypes().add(this.getMoneyValued());
		walletEClass.getESuperTypes().add(this.getItem());
		storeEClass.getESuperTypes().add(this.getOwner());
		ownerEClass.getESuperTypes().add(this.getInventory());
		tradeEClass.getESuperTypes().add(this.getMoneyValued());
		colocationServiceEClass.getESuperTypes().add(this.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(objectPositionEClass, ObjectPosition.class, "ObjectPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectPosition_GlobePosition(), this.getGlobePosition(), "globePosition", null, 0, 1, ObjectPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectPosition_Positioned(), this.getPositioned(), null, "positioned", null, 0, 1, ObjectPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playtrdEClass, Playtrd.class, "Playtrd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaytrd_Regions(), this.getRegion(), null, "regions", null, 0, -1, Playtrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaytrd_Communities(), this.getCommunity(), null, "communities", null, 0, -1, Playtrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaytrd_Services(), this.getService(), null, "services", null, 0, -1, Playtrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaytrd_Games(), this.getGame(), null, "games", null, 0, -1, Playtrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theWidgetsPackage.getAbstractComposite());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getPlaytrd_Uis(), g1, null, "uis", null, 0, -1, Playtrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poiEClass, no.playtrd.v10.playtrd.POI.class, "POI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOI_Name(), ecorePackage.getEString(), "name", null, 0, 1, no.playtrd.v10.playtrd.POI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Pois(), this.getPOI(), null, "pois", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Name(), ecorePackage.getEString(), "name", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Players(), this.getPlayerState(), null, "players", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_StateMachine(), theScxmlxtPackage.getStateMachine(), null, "stateMachine", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_CurrentStates(), theScxmlxtPackage.getState(), null, "currentStates", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerStateEClass, PlayerState.class, "PlayerState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerState_Player(), this.getPlayer(), null, "player", null, 0, 1, PlayerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communityEClass, Community.class, "Community", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Community.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunity_Players(), this.getPlayer(), null, "players", null, 0, -1, Community.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionServiceEClass, PositionService.class, "PositionService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionService_ObjectPositions(), this.getObjectPosition(), null, "objectPositions", null, 0, -1, PositionService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedEClass, Positioned.class, "Positioned", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageServiceEClass, MessageService.class, "MessageService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageService_Messages(), this.getPlayerMessage(), null, "messages", null, 0, -1, MessageService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerMessageEClass, PlayerMessage.class, "PlayerMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerMessage_Player(), this.getPlayer(), null, "player", null, 0, 1, PlayerMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, PlayerMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptedEClass, Scripted.class, "Scripted", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScripted_ScriptSource(), ecorePackage.getEString(), "scriptSource", null, 0, 1, Scripted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationServiceEClass, LocationService.class, "LocationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationService_ObjectLocations(), this.getObjectLocation(), null, "objectLocations", null, 0, -1, LocationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectLocationEClass, ObjectLocation.class, "ObjectLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectLocation_Positioned(), this.getPositioned(), null, "positioned", null, 0, 1, ObjectLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectLocation_Target(), this.getPositioned(), null, "target", null, 0, 1, ObjectLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(walletEClass, Wallet.class, "Wallet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ownerEClass, Owner.class, "Owner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tradeEClass, Trade.class, "Trade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrade_Seller(), this.getOwner(), null, "seller", null, 0, 1, Trade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrade_Buyer(), this.getOwner(), null, "buyer", null, 0, 1, Trade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrade_SellerWallet(), this.getWallet(), null, "sellerWallet", null, 0, 1, Trade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrade_SellerItems(), this.getItem(), null, "sellerItems", null, 0, -1, Trade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrade_BuyerItems(), this.getItem(), null, "buyerItems", null, 0, -1, Trade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrade_BuyerWallet(), this.getWallet(), null, "buyerWallet", null, 0, 1, Trade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(tradeEClass, null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moneyValuedEClass, MoneyValued.class, "MoneyValued", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoneyValued_MoneyValue(), this.getMoney(), "moneyValue", null, 0, 1, MoneyValued.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventory_ContainedItems(), this.getItem(), null, "containedItems", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagServiceEClass, TagService.class, "TagService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagService_MetaData(), this.getTagData(), null, "metaData", null, 0, -1, TagService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagDataEClass, TagData.class, "TagData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagData_Poi(), this.getPOI(), null, "poi", null, 0, 1, TagData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagData_Entries(), this.getTagEntry(), null, "entries", null, 0, -1, TagData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEntryEClass, Map.Entry.class, "TagEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colocationServiceEClass, ColocationService.class, "ColocationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColocationService_ObjectColocations(), this.getObjectColocation(), null, "objectColocations", null, 0, -1, ColocationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectColocationEClass, ObjectColocation.class, "ObjectColocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectColocation_Positioned(), this.getPositioned(), null, "positioned", null, 0, 1, ObjectColocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectColocation_Targets(), this.getPositioned(), null, "targets", null, 0, -1, ObjectColocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(globePositionEDataType, LatLong.class, "GlobePosition", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(moneyEDataType, Measurable.class, "Money", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "javax.measure.Measurable<org.jscience.economics.money.Money>");
		initEDataType(iEditingDomainProviderEDataType, IEditingDomainProvider.class, "IEditingDomainProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://playtrd.no/v10/playtrd.ecore
		createPlaytrdAnnotations();
		// http://www.eclipse.org/e4/emf/ecore/javascript/scriptSourceFeature
		createScriptSourceFeatureAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://playtrd.no/v10/playtrd.ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPlaytrdAnnotations() {
		String source = "http://playtrd.no/v10/playtrd.ecore";		
		addAnnotation
		  (getObjectPosition_GlobePosition(), 
		   source, 
		   new String[] {
			 "positionFeature", "GlobePosition"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/e4/emf/ecore/javascript/scriptSourceFeature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createScriptSourceFeatureAnnotations() {
		String source = "http://www.eclipse.org/e4/emf/ecore/javascript/scriptSourceFeature";			
		addAnnotation
		  (getScripted_ScriptSource(), 
		   source, 
		   new String[] {
			 "js", "eval, listen"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";				
		addAnnotation
		  (tradeEClass, 
		   source, 
		   new String[] {
			 "constraints", "buyerIsNonNull sellerIsNonNull buyerWalletIsNonNull sellerOwnsSellerItems buyerOwnsBuyerItems moneyValueDefined walletHasMoneyValue"
		   });
	}

} //PlaytrdPackageImpl
