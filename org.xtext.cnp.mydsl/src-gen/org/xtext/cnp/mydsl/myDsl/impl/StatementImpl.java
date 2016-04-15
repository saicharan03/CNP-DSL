/**
 */
package org.xtext.cnp.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.cnp.mydsl.myDsl.ActionStatement;
import org.xtext.cnp.mydsl.myDsl.AssertStatement;
import org.xtext.cnp.mydsl.myDsl.ChangeStateStatement;
import org.xtext.cnp.mydsl.myDsl.MyDslPackage;
import org.xtext.cnp.mydsl.myDsl.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl#isIsAction <em>Is Action</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl#getActionStatement <em>Action Statement</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl#isIsChangeState <em>Is Change State</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl#getChangeStateStatement <em>Change State Statement</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.StatementImpl#getAssertStatement <em>Assert Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The default value of the '{@link #isIsAction() <em>Is Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAction()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ACTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAction() <em>Is Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAction()
   * @generated
   * @ordered
   */
  protected boolean isAction = IS_ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionStatement()
   * @generated
   * @ordered
   */
  protected ActionStatement actionStatement;

  /**
   * The default value of the '{@link #isIsChangeState() <em>Is Change State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsChangeState()
   * @generated
   * @ordered
   */
  protected static final boolean IS_CHANGE_STATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsChangeState() <em>Is Change State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsChangeState()
   * @generated
   * @ordered
   */
  protected boolean isChangeState = IS_CHANGE_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getChangeStateStatement() <em>Change State Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeStateStatement()
   * @generated
   * @ordered
   */
  protected ChangeStateStatement changeStateStatement;

  /**
   * The cached value of the '{@link #getAssertStatement() <em>Assert Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertStatement()
   * @generated
   * @ordered
   */
  protected AssertStatement assertStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return MyDslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAction()
  {
    return isAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAction(boolean newIsAction)
  {
    boolean oldIsAction = isAction;
    isAction = newIsAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__IS_ACTION, oldIsAction, isAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement getActionStatement()
  {
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionStatement(ActionStatement newActionStatement, NotificationChain msgs)
  {
    ActionStatement oldActionStatement = actionStatement;
    actionStatement = newActionStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__ACTION_STATEMENT, oldActionStatement, newActionStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionStatement(ActionStatement newActionStatement)
  {
    if (newActionStatement != actionStatement)
    {
      NotificationChain msgs = null;
      if (actionStatement != null)
        msgs = ((InternalEObject)actionStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__ACTION_STATEMENT, null, msgs);
      if (newActionStatement != null)
        msgs = ((InternalEObject)newActionStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__ACTION_STATEMENT, null, msgs);
      msgs = basicSetActionStatement(newActionStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__ACTION_STATEMENT, newActionStatement, newActionStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsChangeState()
  {
    return isChangeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsChangeState(boolean newIsChangeState)
  {
    boolean oldIsChangeState = isChangeState;
    isChangeState = newIsChangeState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__IS_CHANGE_STATE, oldIsChangeState, isChangeState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeStateStatement getChangeStateStatement()
  {
    return changeStateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChangeStateStatement(ChangeStateStatement newChangeStateStatement, NotificationChain msgs)
  {
    ChangeStateStatement oldChangeStateStatement = changeStateStatement;
    changeStateStatement = newChangeStateStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT, oldChangeStateStatement, newChangeStateStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangeStateStatement(ChangeStateStatement newChangeStateStatement)
  {
    if (newChangeStateStatement != changeStateStatement)
    {
      NotificationChain msgs = null;
      if (changeStateStatement != null)
        msgs = ((InternalEObject)changeStateStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT, null, msgs);
      if (newChangeStateStatement != null)
        msgs = ((InternalEObject)newChangeStateStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT, null, msgs);
      msgs = basicSetChangeStateStatement(newChangeStateStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT, newChangeStateStatement, newChangeStateStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertStatement getAssertStatement()
  {
    return assertStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertStatement(AssertStatement newAssertStatement, NotificationChain msgs)
  {
    AssertStatement oldAssertStatement = assertStatement;
    assertStatement = newAssertStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__ASSERT_STATEMENT, oldAssertStatement, newAssertStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertStatement(AssertStatement newAssertStatement)
  {
    if (newAssertStatement != assertStatement)
    {
      NotificationChain msgs = null;
      if (assertStatement != null)
        msgs = ((InternalEObject)assertStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__ASSERT_STATEMENT, null, msgs);
      if (newAssertStatement != null)
        msgs = ((InternalEObject)newAssertStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__ASSERT_STATEMENT, null, msgs);
      msgs = basicSetAssertStatement(newAssertStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__ASSERT_STATEMENT, newAssertStatement, newAssertStatement));
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
      case MyDslPackage.STATEMENT__ACTION_STATEMENT:
        return basicSetActionStatement(null, msgs);
      case MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        return basicSetChangeStateStatement(null, msgs);
      case MyDslPackage.STATEMENT__ASSERT_STATEMENT:
        return basicSetAssertStatement(null, msgs);
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
      case MyDslPackage.STATEMENT__IS_ACTION:
        return isIsAction();
      case MyDslPackage.STATEMENT__ACTION_STATEMENT:
        return getActionStatement();
      case MyDslPackage.STATEMENT__IS_CHANGE_STATE:
        return isIsChangeState();
      case MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        return getChangeStateStatement();
      case MyDslPackage.STATEMENT__ASSERT_STATEMENT:
        return getAssertStatement();
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
      case MyDslPackage.STATEMENT__IS_ACTION:
        setIsAction((Boolean)newValue);
        return;
      case MyDslPackage.STATEMENT__ACTION_STATEMENT:
        setActionStatement((ActionStatement)newValue);
        return;
      case MyDslPackage.STATEMENT__IS_CHANGE_STATE:
        setIsChangeState((Boolean)newValue);
        return;
      case MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        setChangeStateStatement((ChangeStateStatement)newValue);
        return;
      case MyDslPackage.STATEMENT__ASSERT_STATEMENT:
        setAssertStatement((AssertStatement)newValue);
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
      case MyDslPackage.STATEMENT__IS_ACTION:
        setIsAction(IS_ACTION_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__ACTION_STATEMENT:
        setActionStatement((ActionStatement)null);
        return;
      case MyDslPackage.STATEMENT__IS_CHANGE_STATE:
        setIsChangeState(IS_CHANGE_STATE_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        setChangeStateStatement((ChangeStateStatement)null);
        return;
      case MyDslPackage.STATEMENT__ASSERT_STATEMENT:
        setAssertStatement((AssertStatement)null);
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
      case MyDslPackage.STATEMENT__IS_ACTION:
        return isAction != IS_ACTION_EDEFAULT;
      case MyDslPackage.STATEMENT__ACTION_STATEMENT:
        return actionStatement != null;
      case MyDslPackage.STATEMENT__IS_CHANGE_STATE:
        return isChangeState != IS_CHANGE_STATE_EDEFAULT;
      case MyDslPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        return changeStateStatement != null;
      case MyDslPackage.STATEMENT__ASSERT_STATEMENT:
        return assertStatement != null;
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
    result.append(" (isAction: ");
    result.append(isAction);
    result.append(", isChangeState: ");
    result.append(isChangeState);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
