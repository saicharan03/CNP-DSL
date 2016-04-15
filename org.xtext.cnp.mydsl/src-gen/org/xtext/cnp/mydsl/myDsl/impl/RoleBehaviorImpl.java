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

import org.xtext.cnp.mydsl.myDsl.Action;
import org.xtext.cnp.mydsl.myDsl.MyDslPackage;
import org.xtext.cnp.mydsl.myDsl.RoleBehavior;
import org.xtext.cnp.mydsl.myDsl.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.RoleBehaviorImpl#getEndState <em>End State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleBehaviorImpl extends MinimalEObjectImpl.Container implements RoleBehavior
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
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * The cached value of the '{@link #getStartState() <em>Start State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartState()
   * @generated
   * @ordered
   */
  protected State startState;

  /**
   * The cached value of the '{@link #getEndState() <em>End State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndState()
   * @generated
   * @ordered
   */
  protected State endState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleBehaviorImpl()
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
    return MyDslPackage.Literals.ROLE_BEHAVIOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLE_BEHAVIOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, MyDslPackage.ROLE_BEHAVIOR__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, MyDslPackage.ROLE_BEHAVIOR__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getStartState()
  {
    if (startState != null && startState.eIsProxy())
    {
      InternalEObject oldStartState = (InternalEObject)startState;
      startState = (State)eResolveProxy(oldStartState);
      if (startState != oldStartState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ROLE_BEHAVIOR__START_STATE, oldStartState, startState));
      }
    }
    return startState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetStartState()
  {
    return startState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartState(State newStartState)
  {
    State oldStartState = startState;
    startState = newStartState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLE_BEHAVIOR__START_STATE, oldStartState, startState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getEndState()
  {
    if (endState != null && endState.eIsProxy())
    {
      InternalEObject oldEndState = (InternalEObject)endState;
      endState = (State)eResolveProxy(oldEndState);
      if (endState != oldEndState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ROLE_BEHAVIOR__END_STATE, oldEndState, endState));
      }
    }
    return endState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetEndState()
  {
    return endState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndState(State newEndState)
  {
    State oldEndState = endState;
    endState = newEndState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLE_BEHAVIOR__END_STATE, oldEndState, endState));
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
      case MyDslPackage.ROLE_BEHAVIOR__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROLE_BEHAVIOR__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ROLE_BEHAVIOR__NAME:
        return getName();
      case MyDslPackage.ROLE_BEHAVIOR__ACTIONS:
        return getActions();
      case MyDslPackage.ROLE_BEHAVIOR__STATES:
        return getStates();
      case MyDslPackage.ROLE_BEHAVIOR__START_STATE:
        if (resolve) return getStartState();
        return basicGetStartState();
      case MyDslPackage.ROLE_BEHAVIOR__END_STATE:
        if (resolve) return getEndState();
        return basicGetEndState();
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
      case MyDslPackage.ROLE_BEHAVIOR__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.ROLE_BEHAVIOR__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case MyDslPackage.ROLE_BEHAVIOR__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
      case MyDslPackage.ROLE_BEHAVIOR__START_STATE:
        setStartState((State)newValue);
        return;
      case MyDslPackage.ROLE_BEHAVIOR__END_STATE:
        setEndState((State)newValue);
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
      case MyDslPackage.ROLE_BEHAVIOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.ROLE_BEHAVIOR__ACTIONS:
        getActions().clear();
        return;
      case MyDslPackage.ROLE_BEHAVIOR__STATES:
        getStates().clear();
        return;
      case MyDslPackage.ROLE_BEHAVIOR__START_STATE:
        setStartState((State)null);
        return;
      case MyDslPackage.ROLE_BEHAVIOR__END_STATE:
        setEndState((State)null);
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
      case MyDslPackage.ROLE_BEHAVIOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.ROLE_BEHAVIOR__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MyDslPackage.ROLE_BEHAVIOR__STATES:
        return states != null && !states.isEmpty();
      case MyDslPackage.ROLE_BEHAVIOR__START_STATE:
        return startState != null;
      case MyDslPackage.ROLE_BEHAVIOR__END_STATE:
        return endState != null;
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

} //RoleBehaviorImpl
