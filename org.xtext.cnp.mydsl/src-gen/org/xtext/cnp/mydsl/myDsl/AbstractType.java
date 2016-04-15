/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.AbstractType#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.AbstractType#isListType <em>List Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getAbstractType()
 * @model
 * @generated
 */
public interface AbstractType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getAbstractType_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.AbstractType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>List Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Type</em>' attribute.
   * @see #setListType(boolean)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getAbstractType_ListType()
   * @model
   * @generated
   */
  boolean isListType();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.AbstractType#isListType <em>List Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Type</em>' attribute.
   * @see #isListType()
   * @generated
   */
  void setListType(boolean value);

} // AbstractType
