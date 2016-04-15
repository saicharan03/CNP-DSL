/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.ActionStatement#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.ActionStatement#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActionStatement()
 * @model
 * @generated
 */
public interface ActionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActionStatement_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.ActionStatement#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' attribute list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActionStatement_Inputs()
   * @model unique="false"
   * @generated
   */
  EList<String> getInputs();

} // ActionStatement
