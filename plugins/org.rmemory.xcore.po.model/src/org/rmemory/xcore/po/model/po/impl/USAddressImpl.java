/**
 */
package org.rmemory.xcore.po.model.po.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rmemory.xcore.po.model.po.PoPackage;
import org.rmemory.xcore.po.model.po.PurchaseOrder;
import org.rmemory.xcore.po.model.po.USAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getState <em>State</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.USAddressImpl#getPo <em>Po</em>}</li>
 * </ul>
 *
 * @generated
 */
public class USAddressImpl extends MinimalEObjectImpl.Container implements USAddress {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final int ZIP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected int zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = "US";

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPo() <em>Po</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPo()
	 * @generated
	 * @ordered
	 */
	protected PurchaseOrder po;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoPackage.Literals.US_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZip(int newZip) {
		int oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder getPo() {
		if (po != null && po.eIsProxy()) {
			InternalEObject oldPo = (InternalEObject)po;
			po = (PurchaseOrder)eResolveProxy(oldPo);
			if (po != oldPo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoPackage.US_ADDRESS__PO, oldPo, po));
			}
		}
		return po;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder basicGetPo() {
		return po;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPo(PurchaseOrder newPo) {
		PurchaseOrder oldPo = po;
		po = newPo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.US_ADDRESS__PO, oldPo, po));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PoPackage.US_ADDRESS__NAME:
				return getName();
			case PoPackage.US_ADDRESS__STREET:
				return getStreet();
			case PoPackage.US_ADDRESS__CITY:
				return getCity();
			case PoPackage.US_ADDRESS__STATE:
				return getState();
			case PoPackage.US_ADDRESS__ZIP:
				return getZip();
			case PoPackage.US_ADDRESS__COUNTRY:
				return getCountry();
			case PoPackage.US_ADDRESS__PO:
				if (resolve) return getPo();
				return basicGetPo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PoPackage.US_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case PoPackage.US_ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case PoPackage.US_ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case PoPackage.US_ADDRESS__STATE:
				setState((String)newValue);
				return;
			case PoPackage.US_ADDRESS__ZIP:
				setZip((Integer)newValue);
				return;
			case PoPackage.US_ADDRESS__COUNTRY:
				setCountry((String)newValue);
				return;
			case PoPackage.US_ADDRESS__PO:
				setPo((PurchaseOrder)newValue);
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
			case PoPackage.US_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoPackage.US_ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case PoPackage.US_ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case PoPackage.US_ADDRESS__STATE:
				setState(STATE_EDEFAULT);
				return;
			case PoPackage.US_ADDRESS__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case PoPackage.US_ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case PoPackage.US_ADDRESS__PO:
				setPo((PurchaseOrder)null);
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
			case PoPackage.US_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoPackage.US_ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case PoPackage.US_ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case PoPackage.US_ADDRESS__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case PoPackage.US_ADDRESS__ZIP:
				return zip != ZIP_EDEFAULT;
			case PoPackage.US_ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case PoPackage.US_ADDRESS__PO:
				return po != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", street: ");
		result.append(street);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", zip: ");
		result.append(zip);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //USAddressImpl
