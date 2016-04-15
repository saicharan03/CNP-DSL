/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organizational Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.OrganizationalModel#getAgents <em>Agents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getOrganizationalModel()
 * @model
 * @generated
 */
public interface OrganizationalModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.Agent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agents</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getOrganizationalModel_Agents()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgents();

} // OrganizationalModel
