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

import org.xtext.cnp.mydsl.myDsl.ContractNetProtocol;
import org.xtext.cnp.mydsl.myDsl.MyDslPackage;
import org.xtext.cnp.mydsl.myDsl.RoleBehavior;
import org.xtext.cnp.mydsl.myDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Net Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ContractNetProtocolImpl#getRoleBehavior <em>Role Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractNetProtocolImpl extends MinimalEObjectImpl.Container implements ContractNetProtocol
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getRoleBehavior() <em>Role Behavior</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleBehavior()
   * @generated
   * @ordered
   */
  protected EList<RoleBehavior> roleBehavior;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractNetProtocolImpl()
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
    return MyDslPackage.Literals.CONTRACT_NET_PROTOCOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONTRACT_NET_PROTOCOL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, MyDslPackage.CONTRACT_NET_PROTOCOL__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RoleBehavior> getRoleBehavior()
  {
    if (roleBehavior == null)
    {
      roleBehavior = new EObjectContainmentEList<RoleBehavior>(RoleBehavior.class, this, MyDslPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR);
    }
    return roleBehavior;
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
      case MyDslPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR:
        return ((InternalEList<?>)getRoleBehavior()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CONTRACT_NET_PROTOCOL__NAME:
        return getName();
      case MyDslPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return getVariables();
      case MyDslPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR:
        return getRoleBehavior();
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
      case MyDslPackage.CONTRACT_NET_PROTOCOL__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case MyDslPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR:
        getRoleBehavior().clear();
        getRoleBehavior().addAll((Collection<? extends RoleBehavior>)newValue);
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
      case MyDslPackage.CONTRACT_NET_PROTOCOL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        getVariables().clear();
        return;
      case MyDslPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR:
        getRoleBehavior().clear();
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
      case MyDslPackage.CONTRACT_NET_PROTOCOL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case MyDslPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIOR:
        return roleBehavior != null && !roleBehavior.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ContractNetProtocolImpl
