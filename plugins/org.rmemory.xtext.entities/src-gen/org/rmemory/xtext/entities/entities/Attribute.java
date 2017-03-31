/**
 * generated by Xtext 2.10.0
 */
package org.rmemory.xtext.entities.entities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xtext.entities.entities.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.rmemory.xtext.entities.entities.Attribute#isArray <em>Array</em>}</li>
 *   <li>{@link org.rmemory.xtext.entities.entities.Attribute#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.rmemory.xtext.entities.entities.EntitiesPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.rmemory.xtext.entities.entities.EntitiesPackage#getAttribute_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.rmemory.xtext.entities.entities.Attribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.rmemory.xtext.entities.entities.EntitiesPackage#getAttribute_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.rmemory.xtext.entities.entities.Attribute#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

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
   * @see org.rmemory.xtext.entities.entities.EntitiesPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.rmemory.xtext.entities.entities.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
