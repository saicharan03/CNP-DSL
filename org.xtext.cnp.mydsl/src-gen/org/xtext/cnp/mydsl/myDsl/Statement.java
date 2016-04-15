/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Statement#isIsAction <em>Is Action</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Statement#getActionStatement <em>Action Statement</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Statement#isIsChangeState <em>Is Change State</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Statement#getChangeStateStatement <em>Change State Statement</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Statement#getAssertStatement <em>Assert Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Action</em>' attribute.
   * @see #setIsAction(boolean)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getStatement_IsAction()
   * @model
   * @generated
   */
  boolean isIsAction();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Statement#isIsAction <em>Is Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Action</em>' attribute.
   * @see #isIsAction()
   * @generated
   */
  void setIsAction(boolean value);

  /**
   * Returns the value of the '<em><b>Action Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Statement</em>' containment reference.
   * @see #setActionStatement(ActionStatement)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getStatement_ActionStatement()
   * @model containment="true"
   * @generated
   */
  ActionStatement getActionStatement();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Statement#getActionStatement <em>Action Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Statement</em>' containment reference.
   * @see #getActionStatement()
   * @generated
   */
  void setActionStatement(ActionStatement value);

  /**
   * Returns the value of the '<em><b>Is Change State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Change State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Change State</em>' attribute.
   * @see #setIsChangeState(boolean)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getStatement_IsChangeState()
   * @model
   * @generated
   */
  boolean isIsChangeState();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Statement#isIsChangeState <em>Is Change State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Change State</em>' attribute.
   * @see #isIsChangeState()
   * @generated
   */
  void setIsChangeState(boolean value);

  /**
   * Returns the value of the '<em><b>Change State Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change State Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change State Statement</em>' containment reference.
   * @see #setChangeStateStatement(ChangeStateStatement)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getStatement_ChangeStateStatement()
   * @model containment="true"
   * @generated
   */
  ChangeStateStatement getChangeStateStatement();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Statement#getChangeStateStatement <em>Change State Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change State Statement</em>' containment reference.
   * @see #getChangeStateStatement()
   * @generated
   */
  void setChangeStateStatement(ChangeStateStatement value);

  /**
   * Returns the value of the '<em><b>Assert Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Statement</em>' containment reference.
   * @see #setAssertStatement(AssertStatement)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getStatement_AssertStatement()
   * @model containment="true"
   * @generated
   */
  AssertStatement getAssertStatement();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Statement#getAssertStatement <em>Assert Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert Statement</em>' containment reference.
   * @see #getAssertStatement()
   * @generated
   */
  void setAssertStatement(AssertStatement value);

} // Statement
