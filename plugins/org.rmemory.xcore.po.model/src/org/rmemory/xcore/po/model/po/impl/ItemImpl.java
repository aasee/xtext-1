/**
 */
package org.rmemory.xcore.po.model.po.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.rmemory.xcore.po.model.po.Item;
import org.rmemory.xcore.po.model.po.PoPackage;
import org.rmemory.xcore.po.model.po.PurchaseOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getPurchaseOrder <em>Purchase Order</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

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
		return PoPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder getPurchaseOrder() {
		if (eContainerFeatureID() != PoPackage.ITEM__PURCHASE_ORDER) return null;
		return (PurchaseOrder)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder basicGetPurchaseOrder() {
		if (eContainerFeatureID() != PoPackage.ITEM__PURCHASE_ORDER) return null;
		return (PurchaseOrder)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurchaseOrder(PurchaseOrder newPurchaseOrder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPurchaseOrder, PoPackage.ITEM__PURCHASE_ORDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchaseOrder(PurchaseOrder newPurchaseOrder) {
		if (newPurchaseOrder != eInternalContainer() || (eContainerFeatureID() != PoPackage.ITEM__PURCHASE_ORDER && newPurchaseOrder != null)) {
			if (EcoreUtil.isAncestor(this, newPurchaseOrder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPurchaseOrder != null)
				msgs = ((InternalEObject)newPurchaseOrder).eInverseAdd(this, PoPackage.PURCHASE_ORDER__ITEMS, PurchaseOrder.class, msgs);
			msgs = basicSetPurchaseOrder(newPurchaseOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__PURCHASE_ORDER, newPurchaseOrder, newPurchaseOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoPackage.ITEM__PURCHASE_ORDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPurchaseOrder((PurchaseOrder)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoPackage.ITEM__PURCHASE_ORDER:
				return basicSetPurchaseOrder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PoPackage.ITEM__PURCHASE_ORDER:
				return eInternalContainer().eInverseRemove(this, PoPackage.PURCHASE_ORDER__ITEMS, PurchaseOrder.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PoPackage.ITEM__PURCHASE_ORDER:
				if (resolve) return getPurchaseOrder();
				return basicGetPurchaseOrder();
			case PoPackage.ITEM__PRODUCT_NAME:
				return getProductName();
			case PoPackage.ITEM__QUANTITY:
				return getQuantity();
			case PoPackage.ITEM__PRICE:
				return getPrice();
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
			case PoPackage.ITEM__PURCHASE_ORDER:
				setPurchaseOrder((PurchaseOrder)newValue);
				return;
			case PoPackage.ITEM__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case PoPackage.ITEM__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case PoPackage.ITEM__PRICE:
				setPrice((Float)newValue);
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
			case PoPackage.ITEM__PURCHASE_ORDER:
				setPurchaseOrder((PurchaseOrder)null);
				return;
			case PoPackage.ITEM__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case PoPackage.ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case PoPackage.ITEM__PRICE:
				setPrice(PRICE_EDEFAULT);
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
			case PoPackage.ITEM__PURCHASE_ORDER:
				return basicGetPurchaseOrder() != null;
			case PoPackage.ITEM__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case PoPackage.ITEM__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case PoPackage.ITEM__PRICE:
				return price != PRICE_EDEFAULT;
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
		result.append(" (productName: ");
		result.append(productName);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
