/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Map;
import javax.measure.Measurable;
import javax.measure.quantity.Quantity;
import javax.measure.quantity.Angle;

import no.playtrd.services.IPositionService;
import no.playtrd.v10.playtrd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.jscience.economics.money.Money;
import org.jscience.geography.coordinates.LatLong;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaytrdFactoryImpl extends EFactoryImpl implements PlaytrdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlaytrdFactory init() {
		try {
			PlaytrdFactory thePlaytrdFactory = (PlaytrdFactory)EPackage.Registry.INSTANCE.getEFactory("http://playtrd.no/v10/playtrd.ecore"); 
			if (thePlaytrdFactory != null) {
				return thePlaytrdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlaytrdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaytrdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlaytrdPackage.OBJECT_POSITION: return createObjectPosition();
			case PlaytrdPackage.PLAYER: return createPlayer();
			case PlaytrdPackage.PLAYTRD: return createPlaytrd();
			case PlaytrdPackage.POI: return createPOI();
			case PlaytrdPackage.REGION: return createRegion();
			case PlaytrdPackage.GAME: return createGame();
			case PlaytrdPackage.PLAYER_STATE: return createPlayerState();
			case PlaytrdPackage.COMMUNITY: return createCommunity();
			case PlaytrdPackage.POSITION_SERVICE: return createPositionService();
			case PlaytrdPackage.MESSAGE_SERVICE: return createMessageService();
			case PlaytrdPackage.PLAYER_MESSAGE: return createPlayerMessage();
			case PlaytrdPackage.SERVICE: return createService();
			case PlaytrdPackage.LOCATION_SERVICE: return createLocationService();
			case PlaytrdPackage.OBJECT_LOCATION: return createObjectLocation();
			case PlaytrdPackage.ITEM: return createItem();
			case PlaytrdPackage.WALLET: return createWallet();
			case PlaytrdPackage.STORE: return createStore();
			case PlaytrdPackage.OWNER: return createOwner();
			case PlaytrdPackage.TRADE: return createTrade();
			case PlaytrdPackage.MONEY_VALUED: return createMoneyValued();
			case PlaytrdPackage.INVENTORY: return createInventory();
			case PlaytrdPackage.PROPERTIES: return createProperties();
			case PlaytrdPackage.TAG_SERVICE: return createTagService();
			case PlaytrdPackage.TAG_DATA: return createTagData();
			case PlaytrdPackage.TAG_ENTRY: return (EObject)createTagEntry();
			case PlaytrdPackage.COLOCATION_SERVICE: return createColocationService();
			case PlaytrdPackage.OBJECT_COLOCATION: return createObjectColocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlaytrdPackage.GLOBE_POSITION:
				return createGlobePositionFromString(eDataType, initialValue);
			case PlaytrdPackage.MONEY:
				return createMoneyFromString(eDataType, initialValue);
			case PlaytrdPackage.IEDITING_DOMAIN_PROVIDER:
				return createIEditingDomainProviderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlaytrdPackage.GLOBE_POSITION:
				return convertGlobePositionToString(eDataType, instanceValue);
			case PlaytrdPackage.MONEY:
				return convertMoneyToString(eDataType, instanceValue);
			case PlaytrdPackage.IEDITING_DOMAIN_PROVIDER:
				return convertIEditingDomainProviderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPosition createObjectPosition() {
		ObjectPositionImpl objectPosition = new ObjectPositionImpl();
		return objectPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Playtrd createPlaytrd() {
		PlaytrdImpl playtrd = new PlaytrdImpl();
		return playtrd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POI createPOI() {
		POIImpl poi = new POIImpl();
		return poi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends PlayerState> Game<T> createGame() {
		GameImpl<T> game = new GameImpl<T>();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerState createPlayerState() {
		PlayerStateImpl playerState = new PlayerStateImpl();
		return playerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Community createCommunity() {
		CommunityImpl community = new CommunityImpl();
		return community;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionService createPositionService() {
		PositionServiceImpl positionService = new PositionServiceImpl();
		return positionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageService createMessageService() {
		MessageServiceImpl messageService = new MessageServiceImpl();
		return messageService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerMessage createPlayerMessage() {
		PlayerMessageImpl playerMessage = new PlayerMessageImpl();
		return playerMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationService createLocationService() {
		LocationServiceImpl locationService = new LocationServiceImpl();
		return locationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectLocation createObjectLocation() {
		ObjectLocationImpl objectLocation = new ObjectLocationImpl();
		return objectLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet createWallet() {
		WalletImpl wallet = new WalletImpl();
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trade createTrade() {
		TradeImpl trade = new TradeImpl();
		return trade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoneyValued createMoneyValued() {
		MoneyValuedImpl moneyValued = new MoneyValuedImpl();
		return moneyValued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagService createTagService() {
		TagServiceImpl tagService = new TagServiceImpl();
		return tagService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagData createTagData() {
		TagDataImpl tagData = new TagDataImpl();
		return tagData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createTagEntry() {
		TagEntryImpl tagEntry = new TagEntryImpl();
		return tagEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColocationService createColocationService() {
		ColocationServiceImpl colocationService = new ColocationServiceImpl();
		return colocationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectColocation createObjectColocation() {
		ObjectColocationImpl objectColocation = new ObjectColocationImpl();
		return objectColocation;
	}

	private static String positionSeparatorPattern = "(\\s*[ ,;/]\\s*)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LatLong createGlobePositionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null || initialValue.trim().length() == 0) {
			return null;
		}
		String separators = positionSeparatorPattern;
		try {
			String[] latLngString = initialValue.split(separators);
			if (latLngString.length != 2) {
				throw new IllegalArgumentException("Split of " + initialValue + " on " + separators + " gave " + latLngString.length + " parts, should have been 2");
			}
			double lat = Double.valueOf(latLngString[0]);
			double lng = Double.valueOf(latLngString[1]);
			return createLatLong(lat, lng);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("A GlobePosition must have two double values: " + initialValue + " (" + e + ")");
		}
	}

	public static LatLong createLatLong(double lat, double lng) {
		return LatLong.valueOf(lat, lng, IPositionService.LATLONG_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertGlobePositionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return "";
		}
		LatLong latLng = (LatLong)instanceValue;
		return latLng.latitudeValue(IPositionService.LATLONG_UNIT) + " " + latLng.longitudeValue(IPositionService.LATLONG_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Measurable createMoneyFromString(EDataType eDataType, String initialValue) {
		return (Measurable)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoneyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEditingDomainProvider createIEditingDomainProviderFromString(EDataType eDataType, String initialValue) {
		return (IEditingDomainProvider)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIEditingDomainProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaytrdPackage getPlaytrdPackage() {
		return (PlaytrdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlaytrdPackage getPackage() {
		return PlaytrdPackage.eINSTANCE;
	}

} //PlaytrdFactoryImpl
