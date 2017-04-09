/**
 */
package org.rmemory.xcore.po.model.po;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xcore.po.model.po.PurchaseOrder#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.PurchaseOrder#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.PurchaseOrder#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.rmemory.xcore.po.model.po.PoPackage#getPurchaseOrder()
 * @model
 * @generated
 */
public interface PurchaseOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' containment reference.
	 * @see #setShipTo(USAddress)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getPurchaseOrder_ShipTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	USAddress getShipTo();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.PurchaseOrder#getShipTo <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' containment reference.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(USAddress value);

	/**
	 * Returns the value of the '<em><b>Bill To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To</em>' containment reference.
	 * @see #setBillTo(USAddress)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getPurchaseOrder_BillTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	USAddress getBillTo();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.PurchaseOrder#getBillTo <em>Bill To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To</em>' containment reference.
	 * @see #getBillTo()
	 * @generated
	 */
	void setBillTo(USAddress value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.rmemory.xcore.po.model.po.Item}.
	 * It is bidirectional and its opposite is '{@link org.rmemory.xcore.po.model.po.Item#getPurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getPurchaseOrder_Items()
	 * @see org.rmemory.xcore.po.model.po.Item#getPurchaseOrder
	 * @model opposite="purchaseOrder" containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // PurchaseOrder
