/**
 */
package org.xtext.cnp.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Multiply#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Multiply#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getMultiply()
 * @model
 * @generated
 */
public interface Multiply extends Term
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Term)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getMultiply_Left()
   * @model containment="true"
   * @generated
   */
  Term getLeft();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Multiply#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Term value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Factor)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getMultiply_Right()
   * @model containment="true"
   * @generated
   */
  Factor getRight();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Multiply#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Factor value);

} // Multiply
