/**
 */
package org.xtext.cnp.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getAgentAttributes <em>Agent Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getTaskAttributes <em>Task Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getBidAttributes <em>Bid Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getContractAttributes <em>Contract Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getOrganizationalModel <em>Organizational Model</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getTasksModel <em>Tasks Model</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.Model#getContractNetProtocols <em>Contract Net Protocols</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Attributes</em>' containment reference.
   * @see #setAgentAttributes(ClassAttributes)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_AgentAttributes()
   * @model containment="true"
   * @generated
   */
  ClassAttributes getAgentAttributes();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Model#getAgentAttributes <em>Agent Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent Attributes</em>' containment reference.
   * @see #getAgentAttributes()
   * @generated
   */
  void setAgentAttributes(ClassAttributes value);

  /**
   * Returns the value of the '<em><b>Task Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Attributes</em>' containment reference.
   * @see #setTaskAttributes(ClassAttributes)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_TaskAttributes()
   * @model containment="true"
   * @generated
   */
  ClassAttributes getTaskAttributes();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Model#getTaskAttributes <em>Task Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Attributes</em>' containment reference.
   * @see #getTaskAttributes()
   * @generated
   */
  void setTaskAttributes(ClassAttributes value);

  /**
   * Returns the value of the '<em><b>Bid Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bid Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bid Attributes</em>' containment reference.
   * @see #setBidAttributes(ClassAttributes)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_BidAttributes()
   * @model containment="true"
   * @generated
   */
  ClassAttributes getBidAttributes();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Model#getBidAttributes <em>Bid Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bid Attributes</em>' containment reference.
   * @see #getBidAttributes()
   * @generated
   */
  void setBidAttributes(ClassAttributes value);

  /**
   * Returns the value of the '<em><b>Contract Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contract Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract Attributes</em>' containment reference.
   * @see #setContractAttributes(ClassAttributes)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_ContractAttributes()
   * @model containment="true"
   * @generated
   */
  ClassAttributes getContractAttributes();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Model#getContractAttributes <em>Contract Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contract Attributes</em>' containment reference.
   * @see #getContractAttributes()
   * @generated
   */
  void setContractAttributes(ClassAttributes value);

  /**
   * Returns the value of the '<em><b>Organizational Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizational Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizational Model</em>' containment reference.
   * @see #setOrganizationalModel(OrganizationalModel)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_OrganizationalModel()
   * @model containment="true"
   * @generated
   */
  OrganizationalModel getOrganizationalModel();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Model#getOrganizationalModel <em>Organizational Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organizational Model</em>' containment reference.
   * @see #getOrganizationalModel()
   * @generated
   */
  void setOrganizationalModel(OrganizationalModel value);

  /**
   * Returns the value of the '<em><b>Tasks Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks Model</em>' containment reference.
   * @see #setTasksModel(TasksModel)
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_TasksModel()
   * @model containment="true"
   * @generated
   */
  TasksModel getTasksModel();

  /**
   * Sets the value of the '{@link org.xtext.cnp.mydsl.myDsl.Model#getTasksModel <em>Tasks Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tasks Model</em>' containment reference.
   * @see #getTasksModel()
   * @generated
   */
  void setTasksModel(TasksModel value);

  /**
   * Returns the value of the '<em><b>Contract Net Protocols</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cnp.mydsl.myDsl.ContractNetProtocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contract Net Protocols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract Net Protocols</em>' containment reference list.
   * @see org.xtext.cnp.mydsl.myDsl.MyDslPackage#getModel_ContractNetProtocols()
   * @model containment="true"
   * @generated
   */
  EList<ContractNetProtocol> getContractNetProtocols();

} // Model
