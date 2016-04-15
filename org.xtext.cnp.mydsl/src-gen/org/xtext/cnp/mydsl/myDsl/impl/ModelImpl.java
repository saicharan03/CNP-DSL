/**
 */
package org.xtext.cnp.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.cnp.mydsl.myDsl.ClassAttributes;
import org.xtext.cnp.mydsl.myDsl.ContractNetProtocol;
import org.xtext.cnp.mydsl.myDsl.Model;
import org.xtext.cnp.mydsl.myDsl.MyDslPackage;
import org.xtext.cnp.mydsl.myDsl.OrganizationalModel;
import org.xtext.cnp.mydsl.myDsl.TasksModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getAgentAttributes <em>Agent Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getTaskAttributes <em>Task Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getBidAttributes <em>Bid Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getContractAttributes <em>Contract Attributes</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getOrganizationalModel <em>Organizational Model</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getTasksModel <em>Tasks Model</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ModelImpl#getContractNetProtocols <em>Contract Net Protocols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getAgentAttributes() <em>Agent Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentAttributes()
   * @generated
   * @ordered
   */
  protected ClassAttributes agentAttributes;

  /**
   * The cached value of the '{@link #getTaskAttributes() <em>Task Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskAttributes()
   * @generated
   * @ordered
   */
  protected ClassAttributes taskAttributes;

  /**
   * The cached value of the '{@link #getBidAttributes() <em>Bid Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBidAttributes()
   * @generated
   * @ordered
   */
  protected ClassAttributes bidAttributes;

  /**
   * The cached value of the '{@link #getContractAttributes() <em>Contract Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractAttributes()
   * @generated
   * @ordered
   */
  protected ClassAttributes contractAttributes;

  /**
   * The cached value of the '{@link #getOrganizationalModel() <em>Organizational Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizationalModel()
   * @generated
   * @ordered
   */
  protected OrganizationalModel organizationalModel;

  /**
   * The cached value of the '{@link #getTasksModel() <em>Tasks Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasksModel()
   * @generated
   * @ordered
   */
  protected TasksModel tasksModel;

  /**
   * The cached value of the '{@link #getContractNetProtocols() <em>Contract Net Protocols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractNetProtocols()
   * @generated
   * @ordered
   */
  protected EList<ContractNetProtocol> contractNetProtocols;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAttributes getAgentAttributes()
  {
    return agentAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAgentAttributes(ClassAttributes newAgentAttributes, NotificationChain msgs)
  {
    ClassAttributes oldAgentAttributes = agentAttributes;
    agentAttributes = newAgentAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__AGENT_ATTRIBUTES, oldAgentAttributes, newAgentAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgentAttributes(ClassAttributes newAgentAttributes)
  {
    if (newAgentAttributes != agentAttributes)
    {
      NotificationChain msgs = null;
      if (agentAttributes != null)
        msgs = ((InternalEObject)agentAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__AGENT_ATTRIBUTES, null, msgs);
      if (newAgentAttributes != null)
        msgs = ((InternalEObject)newAgentAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__AGENT_ATTRIBUTES, null, msgs);
      msgs = basicSetAgentAttributes(newAgentAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__AGENT_ATTRIBUTES, newAgentAttributes, newAgentAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAttributes getTaskAttributes()
  {
    return taskAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskAttributes(ClassAttributes newTaskAttributes, NotificationChain msgs)
  {
    ClassAttributes oldTaskAttributes = taskAttributes;
    taskAttributes = newTaskAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__TASK_ATTRIBUTES, oldTaskAttributes, newTaskAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskAttributes(ClassAttributes newTaskAttributes)
  {
    if (newTaskAttributes != taskAttributes)
    {
      NotificationChain msgs = null;
      if (taskAttributes != null)
        msgs = ((InternalEObject)taskAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__TASK_ATTRIBUTES, null, msgs);
      if (newTaskAttributes != null)
        msgs = ((InternalEObject)newTaskAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__TASK_ATTRIBUTES, null, msgs);
      msgs = basicSetTaskAttributes(newTaskAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__TASK_ATTRIBUTES, newTaskAttributes, newTaskAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAttributes getBidAttributes()
  {
    return bidAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBidAttributes(ClassAttributes newBidAttributes, NotificationChain msgs)
  {
    ClassAttributes oldBidAttributes = bidAttributes;
    bidAttributes = newBidAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__BID_ATTRIBUTES, oldBidAttributes, newBidAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBidAttributes(ClassAttributes newBidAttributes)
  {
    if (newBidAttributes != bidAttributes)
    {
      NotificationChain msgs = null;
      if (bidAttributes != null)
        msgs = ((InternalEObject)bidAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__BID_ATTRIBUTES, null, msgs);
      if (newBidAttributes != null)
        msgs = ((InternalEObject)newBidAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__BID_ATTRIBUTES, null, msgs);
      msgs = basicSetBidAttributes(newBidAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__BID_ATTRIBUTES, newBidAttributes, newBidAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAttributes getContractAttributes()
  {
    return contractAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContractAttributes(ClassAttributes newContractAttributes, NotificationChain msgs)
  {
    ClassAttributes oldContractAttributes = contractAttributes;
    contractAttributes = newContractAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__CONTRACT_ATTRIBUTES, oldContractAttributes, newContractAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContractAttributes(ClassAttributes newContractAttributes)
  {
    if (newContractAttributes != contractAttributes)
    {
      NotificationChain msgs = null;
      if (contractAttributes != null)
        msgs = ((InternalEObject)contractAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__CONTRACT_ATTRIBUTES, null, msgs);
      if (newContractAttributes != null)
        msgs = ((InternalEObject)newContractAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__CONTRACT_ATTRIBUTES, null, msgs);
      msgs = basicSetContractAttributes(newContractAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__CONTRACT_ATTRIBUTES, newContractAttributes, newContractAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrganizationalModel getOrganizationalModel()
  {
    return organizationalModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrganizationalModel(OrganizationalModel newOrganizationalModel, NotificationChain msgs)
  {
    OrganizationalModel oldOrganizationalModel = organizationalModel;
    organizationalModel = newOrganizationalModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__ORGANIZATIONAL_MODEL, oldOrganizationalModel, newOrganizationalModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganizationalModel(OrganizationalModel newOrganizationalModel)
  {
    if (newOrganizationalModel != organizationalModel)
    {
      NotificationChain msgs = null;
      if (organizationalModel != null)
        msgs = ((InternalEObject)organizationalModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__ORGANIZATIONAL_MODEL, null, msgs);
      if (newOrganizationalModel != null)
        msgs = ((InternalEObject)newOrganizationalModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__ORGANIZATIONAL_MODEL, null, msgs);
      msgs = basicSetOrganizationalModel(newOrganizationalModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__ORGANIZATIONAL_MODEL, newOrganizationalModel, newOrganizationalModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TasksModel getTasksModel()
  {
    return tasksModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTasksModel(TasksModel newTasksModel, NotificationChain msgs)
  {
    TasksModel oldTasksModel = tasksModel;
    tasksModel = newTasksModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__TASKS_MODEL, oldTasksModel, newTasksModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTasksModel(TasksModel newTasksModel)
  {
    if (newTasksModel != tasksModel)
    {
      NotificationChain msgs = null;
      if (tasksModel != null)
        msgs = ((InternalEObject)tasksModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__TASKS_MODEL, null, msgs);
      if (newTasksModel != null)
        msgs = ((InternalEObject)newTasksModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MODEL__TASKS_MODEL, null, msgs);
      msgs = basicSetTasksModel(newTasksModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__TASKS_MODEL, newTasksModel, newTasksModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractNetProtocol> getContractNetProtocols()
  {
    if (contractNetProtocols == null)
    {
      contractNetProtocols = new EObjectContainmentEList<ContractNetProtocol>(ContractNetProtocol.class, this, MyDslPackage.MODEL__CONTRACT_NET_PROTOCOLS);
    }
    return contractNetProtocols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__AGENT_ATTRIBUTES:
        return basicSetAgentAttributes(null, msgs);
      case MyDslPackage.MODEL__TASK_ATTRIBUTES:
        return basicSetTaskAttributes(null, msgs);
      case MyDslPackage.MODEL__BID_ATTRIBUTES:
        return basicSetBidAttributes(null, msgs);
      case MyDslPackage.MODEL__CONTRACT_ATTRIBUTES:
        return basicSetContractAttributes(null, msgs);
      case MyDslPackage.MODEL__ORGANIZATIONAL_MODEL:
        return basicSetOrganizationalModel(null, msgs);
      case MyDslPackage.MODEL__TASKS_MODEL:
        return basicSetTasksModel(null, msgs);
      case MyDslPackage.MODEL__CONTRACT_NET_PROTOCOLS:
        return ((InternalEList<?>)getContractNetProtocols()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__AGENT_ATTRIBUTES:
        return getAgentAttributes();
      case MyDslPackage.MODEL__TASK_ATTRIBUTES:
        return getTaskAttributes();
      case MyDslPackage.MODEL__BID_ATTRIBUTES:
        return getBidAttributes();
      case MyDslPackage.MODEL__CONTRACT_ATTRIBUTES:
        return getContractAttributes();
      case MyDslPackage.MODEL__ORGANIZATIONAL_MODEL:
        return getOrganizationalModel();
      case MyDslPackage.MODEL__TASKS_MODEL:
        return getTasksModel();
      case MyDslPackage.MODEL__CONTRACT_NET_PROTOCOLS:
        return getContractNetProtocols();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__AGENT_ATTRIBUTES:
        setAgentAttributes((ClassAttributes)newValue);
        return;
      case MyDslPackage.MODEL__TASK_ATTRIBUTES:
        setTaskAttributes((ClassAttributes)newValue);
        return;
      case MyDslPackage.MODEL__BID_ATTRIBUTES:
        setBidAttributes((ClassAttributes)newValue);
        return;
      case MyDslPackage.MODEL__CONTRACT_ATTRIBUTES:
        setContractAttributes((ClassAttributes)newValue);
        return;
      case MyDslPackage.MODEL__ORGANIZATIONAL_MODEL:
        setOrganizationalModel((OrganizationalModel)newValue);
        return;
      case MyDslPackage.MODEL__TASKS_MODEL:
        setTasksModel((TasksModel)newValue);
        return;
      case MyDslPackage.MODEL__CONTRACT_NET_PROTOCOLS:
        getContractNetProtocols().clear();
        getContractNetProtocols().addAll((Collection<? extends ContractNetProtocol>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__AGENT_ATTRIBUTES:
        setAgentAttributes((ClassAttributes)null);
        return;
      case MyDslPackage.MODEL__TASK_ATTRIBUTES:
        setTaskAttributes((ClassAttributes)null);
        return;
      case MyDslPackage.MODEL__BID_ATTRIBUTES:
        setBidAttributes((ClassAttributes)null);
        return;
      case MyDslPackage.MODEL__CONTRACT_ATTRIBUTES:
        setContractAttributes((ClassAttributes)null);
        return;
      case MyDslPackage.MODEL__ORGANIZATIONAL_MODEL:
        setOrganizationalModel((OrganizationalModel)null);
        return;
      case MyDslPackage.MODEL__TASKS_MODEL:
        setTasksModel((TasksModel)null);
        return;
      case MyDslPackage.MODEL__CONTRACT_NET_PROTOCOLS:
        getContractNetProtocols().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__AGENT_ATTRIBUTES:
        return agentAttributes != null;
      case MyDslPackage.MODEL__TASK_ATTRIBUTES:
        return taskAttributes != null;
      case MyDslPackage.MODEL__BID_ATTRIBUTES:
        return bidAttributes != null;
      case MyDslPackage.MODEL__CONTRACT_ATTRIBUTES:
        return contractAttributes != null;
      case MyDslPackage.MODEL__ORGANIZATIONAL_MODEL:
        return organizationalModel != null;
      case MyDslPackage.MODEL__TASKS_MODEL:
        return tasksModel != null;
      case MyDslPackage.MODEL__CONTRACT_NET_PROTOCOLS:
        return contractNetProtocols != null && !contractNetProtocols.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
