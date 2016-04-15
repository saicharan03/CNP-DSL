/**
 */
package org.xtext.cnp.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.cnp.mydsl.myDsl.ChangeStateStatement;
import org.xtext.cnp.mydsl.myDsl.MyDslPackage;
import org.xtext.cnp.mydsl.myDsl.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change State Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ChangeStateStatementImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeStateStatementImpl extends MinimalEObjectImpl.Container implements ChangeStateStatement
{
  /**
   * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetState()
   * @generated
   * @ordered
   */
  protected State targetState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChangeStateStatementImpl()
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
    return MyDslPackage.Literals.CHANGE_STATE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getTargetState()
  {
    if (targetState != null && targetState.eIsProxy())
    {
      InternalEObject oldTargetState = (InternalEObject)targetState;
      targetState = (State)eResolveProxy(oldTargetState);
      if (targetState != oldTargetState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.CHANGE_STATE_STATEMENT__TARGET_STATE, oldTargetState, targetState));
      }
    }
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTargetState()
  {
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetState(State newTargetState)
  {
    State oldTargetState = targetState;
    targetState = newTargetState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHANGE_STATE_STATEMENT__TARGET_STATE, oldTargetState, targetState));
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
      case MyDslPackage.CHANGE_STATE_STATEMENT__TARGET_STATE:
        if (resolve) return getTargetState();
        return basicGetTargetState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CHANGE_STATE_STATEMENT__TARGET_STATE:
        setTargetState((State)newValue);
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
      case MyDslPackage.CHANGE_STATE_STATEMENT__TARGET_STATE:
        setTargetState((State)null);
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
      case MyDslPackage.CHANGE_STATE_STATEMENT__TARGET_STATE:
        return targetState != null;
    }
    return super.eIsSet(featureID);
  }

} //ChangeStateStatementImpl
