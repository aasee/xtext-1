/**
 * generated by Xtext 2.10.0
 */
package org.rmemory.xtext.entities.entities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rmemory.xtext.entities.entities.BasicType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.rmemory.xtext.entities.entities.EntitiesPackage#getBasicType()
 * @model
 * @generated
 */
public interface BasicType extends ElementType
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see #setTypeName(String)
   * @see org.rmemory.xtext.entities.entities.EntitiesPackage#getBasicType_TypeName()
   * @model
   * @generated
   */
  String getTypeName();

  /**
   * Sets the value of the '{@link org.rmemory.xtext.entities.entities.BasicType#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(String value);

} // BasicType
