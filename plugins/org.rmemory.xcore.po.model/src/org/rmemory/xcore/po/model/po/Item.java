/**
 */
package org.rmemory.xcore.po.model.po;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xcore.po.model.po.Item#getPurchaseOrder <em>Purchase Order</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.Item#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.Item#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.Item#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see org.rmemory.xcore.po.model.po.PoPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Purchase Order</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.rmemory.xcore.po.model.po.PurchaseOrder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Order</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Order</em>' container reference.
	 * @see #setPurchaseOrder(PurchaseOrder)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getItem_PurchaseOrder()
	 * @see org.rmemory.xcore.po.model.po.PurchaseOrder#getItems
	 * @model opposite="items" required="true" transient="false"
	 * @generated
	 */
	PurchaseOrder getPurchaseOrder();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.Item#getPurchaseOrder <em>Purchase Order</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order</em>' container reference.
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	void setPurchaseOrder(PurchaseOrder value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getItem_ProductName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.Item#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getItem_Quantity()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.Item#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getItem_Price()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.Item#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

} // Item
