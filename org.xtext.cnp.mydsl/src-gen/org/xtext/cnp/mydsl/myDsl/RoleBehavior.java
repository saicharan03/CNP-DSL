/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStartState <em>Start State</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getEndState <em>End State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getRoleBehavior()
 * @model
 * @generated
 */
public interface RoleBehavior extends EObject
{
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
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getRoleBehavior_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getRoleBehavior_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getRoleBehavior_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Start State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start State</em>' reference.
   * @see #setStartState(State)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getRoleBehavior_StartState()
   * @model
   * @generated
   */
  State getStartState();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getStartState <em>Start State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start State</em>' reference.
   * @see #getStartState()
   * @generated
   */
  void setStartState(State value);

  /**
   * Returns the value of the '<em><b>End State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End State</em>' reference.
   * @see #setEndState(State)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getRoleBehavior_EndState()
   * @model
   * @generated
   */
  State getEndState();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.RoleBehavior#getEndState <em>End State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End State</em>' reference.
   * @see #getEndState()
   * @generated
   */
  void setEndState(State value);

} // RoleBehavior
