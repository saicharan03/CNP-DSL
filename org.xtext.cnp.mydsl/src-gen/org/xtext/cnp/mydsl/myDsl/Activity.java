/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Activity#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Activity#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Activity#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Activity#getElseif <em>Elseif</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Activity#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActivity_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(Condition)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActivity_If()
   * @model containment="true"
   * @generated
   */
  Condition getIf();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Activity#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(Condition value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActivity_Then()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThen();

  /**
   * Returns the value of the '<em><b>Elseif</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseif</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseif</em>' containment reference.
   * @see #setElseif(Activity)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActivity_Elseif()
   * @model containment="true"
   * @generated
   */
  Activity getElseif();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Activity#getElseif <em>Elseif</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elseif</em>' containment reference.
   * @see #getElseif()
   * @generated
   */
  void setElseif(Activity value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getActivity_Else()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElse();

} // Activity
