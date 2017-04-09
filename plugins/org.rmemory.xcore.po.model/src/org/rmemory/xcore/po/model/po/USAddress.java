/**
 */
package org.rmemory.xcore.po.model.po;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getName <em>Name</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getStreet <em>Street</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getCity <em>City</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getState <em>State</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getZip <em>Zip</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getCountry <em>Country</em>}</li>
 *   <li>{@link org.rmemory.xcore.po.model.po.USAddress#getPo <em>Po</em>}</li>
 * </ul>
 *
 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress()
 * @model
 * @generated
 */
public interface USAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_Street()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_City()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_State()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(int)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_Zip()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getZip();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(int value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * The default value is <code>"US"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_Country()
	 * @model default="US" unique="false" required="true"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Po</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Po</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Po</em>' reference.
	 * @see #setPo(PurchaseOrder)
	 * @see org.rmemory.xcore.po.model.po.PoPackage#getUSAddress_Po()
	 * @model required="true"
	 * @generated
	 */
	PurchaseOrder getPo();

	/**
	 * Sets the value of the '{@link org.rmemory.xcore.po.model.po.USAddress#getPo <em>Po</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Po</em>' reference.
	 * @see #getPo()
	 * @generated
	 */
	void setPo(PurchaseOrder value);

} // USAddress
