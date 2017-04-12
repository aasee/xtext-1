/**
 */
package org.rmemory.xcore.po.model.po.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.rmemory.xcore.po.model.po.Item;
import org.rmemory.xcore.po.model.po.PoPackage;
import org.rmemory.xcore.po.model.po.PurchaseOrder;
import org.rmemory.xcore.po.model.po.util.PoValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getUSPrice <em>US Price</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getShipDate <em>Ship Date</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getPartNum <em>Part Num</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.impl.ItemImpl#getPurchaseOrder <em>Purchase Order</em>}</li>
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
	 * The default value of the '{@link #getUSPrice() <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int US_PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUSPrice() <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSPrice()
	 * @generated
	 * @ordered
	 */
	protected int usPrice = US_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipDate = SHIP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNum() <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNum()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNum() <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNum()
	 * @generated
	 * @ordered
	 */
	protected String partNum = PART_NUM_EDEFAULT;

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
	public boolean isPriceValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PoValidator.DIAGNOSTIC_SOURCE,
						 PoValidator.ITEM__IS_PRICE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "isPriceValid", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
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
	public int getUSPrice() {
		return usPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUSPrice(int newUSPrice) {
		int oldUSPrice = usPrice;
		usPrice = newUSPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__US_PRICE, oldUSPrice, usPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getShipDate() {
		return shipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipDate(Date newShipDate) {
		Date oldShipDate = shipDate;
		shipDate = newShipDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__SHIP_DATE, oldShipDate, shipDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartNum() {
		return partNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNum(String newPartNum) {
		String oldPartNum = partNum;
		partNum = newPartNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoPackage.ITEM__PART_NUM, oldPartNum, partNum));
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
			case PoPackage.ITEM__PRODUCT_NAME:
				return getProductName();
			case PoPackage.ITEM__QUANTITY:
				return getQuantity();
			case PoPackage.ITEM__US_PRICE:
				return getUSPrice();
			case PoPackage.ITEM__COMMENT:
				return getComment();
			case PoPackage.ITEM__SHIP_DATE:
				return getShipDate();
			case PoPackage.ITEM__PART_NUM:
				return getPartNum();
			case PoPackage.ITEM__PURCHASE_ORDER:
				if (resolve) return getPurchaseOrder();
				return basicGetPurchaseOrder();
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
			case PoPackage.ITEM__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case PoPackage.ITEM__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case PoPackage.ITEM__US_PRICE:
				setUSPrice((Integer)newValue);
				return;
			case PoPackage.ITEM__COMMENT:
				setComment((String)newValue);
				return;
			case PoPackage.ITEM__SHIP_DATE:
				setShipDate((Date)newValue);
				return;
			case PoPackage.ITEM__PART_NUM:
				setPartNum((String)newValue);
				return;
			case PoPackage.ITEM__PURCHASE_ORDER:
				setPurchaseOrder((PurchaseOrder)newValue);
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
			case PoPackage.ITEM__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case PoPackage.ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case PoPackage.ITEM__US_PRICE:
				setUSPrice(US_PRICE_EDEFAULT);
				return;
			case PoPackage.ITEM__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PoPackage.ITEM__SHIP_DATE:
				setShipDate(SHIP_DATE_EDEFAULT);
				return;
			case PoPackage.ITEM__PART_NUM:
				setPartNum(PART_NUM_EDEFAULT);
				return;
			case PoPackage.ITEM__PURCHASE_ORDER:
				setPurchaseOrder((PurchaseOrder)null);
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
			case PoPackage.ITEM__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case PoPackage.ITEM__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case PoPackage.ITEM__US_PRICE:
				return usPrice != US_PRICE_EDEFAULT;
			case PoPackage.ITEM__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PoPackage.ITEM__SHIP_DATE:
				return SHIP_DATE_EDEFAULT == null ? shipDate != null : !SHIP_DATE_EDEFAULT.equals(shipDate);
			case PoPackage.ITEM__PART_NUM:
				return PART_NUM_EDEFAULT == null ? partNum != null : !PART_NUM_EDEFAULT.equals(partNum);
			case PoPackage.ITEM__PURCHASE_ORDER:
				return basicGetPurchaseOrder() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PoPackage.ITEM___IS_PRICE_VALID__DIAGNOSTICCHAIN_MAP:
				return isPriceValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", USPrice: ");
		result.append(usPrice);
		result.append(", comment: ");
		result.append(comment);
		result.append(", shipDate: ");
		result.append(shipDate);
		result.append(", partNum: ");
		result.append(partNum);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
