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

import org.xtext.cnp.mydsl.myDsl.Activity;
import org.xtext.cnp.mydsl.myDsl.Condition;
import org.xtext.cnp.mydsl.myDsl.MyDslPackage;
import org.xtext.cnp.mydsl.myDsl.Statement;
import org.xtext.cnp.mydsl.myDsl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl#getElseif <em>Elseif</em>}</li>
 *   <li>{@link org.xtext.cnp.mydsl.myDsl.impl.ActivityImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> declarations;

  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected Condition if_;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected EList<Statement> then;

  /**
   * The cached value of the '{@link #getElseif() <em>Elseif</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseif()
   * @generated
   * @ordered
   */
  protected Activity elseif;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected EList<Statement> else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityImpl()
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
    return MyDslPackage.Literals.ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, MyDslPackage.ACTIVITY__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getIf()
  {
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf(Condition newIf, NotificationChain msgs)
  {
    Condition oldIf = if_;
    if_ = newIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__IF, oldIf, newIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf(Condition newIf)
  {
    if (newIf != if_)
    {
      NotificationChain msgs = null;
      if (if_ != null)
        msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTIVITY__IF, null, msgs);
      if (newIf != null)
        msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTIVITY__IF, null, msgs);
      msgs = basicSetIf(newIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__IF, newIf, newIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getThen()
  {
    if (then == null)
    {
      then = new EObjectContainmentEList<Statement>(Statement.class, this, MyDslPackage.ACTIVITY__THEN);
    }
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getElseif()
  {
    return elseif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseif(Activity newElseif, NotificationChain msgs)
  {
    Activity oldElseif = elseif;
    elseif = newElseif;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__ELSEIF, oldElseif, newElseif);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseif(Activity newElseif)
  {
    if (newElseif != elseif)
    {
      NotificationChain msgs = null;
      if (elseif != null)
        msgs = ((InternalEObject)elseif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTIVITY__ELSEIF, null, msgs);
      if (newElseif != null)
        msgs = ((InternalEObject)newElseif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTIVITY__ELSEIF, null, msgs);
      msgs = basicSetElseif(newElseif, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__ELSEIF, newElseif, newElseif));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElse()
  {
    if (else_ == null)
    {
      else_ = new EObjectContainmentEList<Statement>(Statement.class, this, MyDslPackage.ACTIVITY__ELSE);
    }
    return else_;
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
      case MyDslPackage.ACTIVITY__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ACTIVITY__IF:
        return basicSetIf(null, msgs);
      case MyDslPackage.ACTIVITY__THEN:
        return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ACTIVITY__ELSEIF:
        return basicSetElseif(null, msgs);
      case MyDslPackage.ACTIVITY__ELSE:
        return ((InternalEList<?>)getElse()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ACTIVITY__DECLARATIONS:
        return getDeclarations();
      case MyDslPackage.ACTIVITY__IF:
        return getIf();
      case MyDslPackage.ACTIVITY__THEN:
        return getThen();
      case MyDslPackage.ACTIVITY__ELSEIF:
        return getElseif();
      case MyDslPackage.ACTIVITY__ELSE:
        return getElse();
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
      case MyDslPackage.ACTIVITY__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case MyDslPackage.ACTIVITY__IF:
        setIf((Condition)newValue);
        return;
      case MyDslPackage.ACTIVITY__THEN:
        getThen().clear();
        getThen().addAll((Collection<? extends Statement>)newValue);
        return;
      case MyDslPackage.ACTIVITY__ELSEIF:
        setElseif((Activity)newValue);
        return;
      case MyDslPackage.ACTIVITY__ELSE:
        getElse().clear();
        getElse().addAll((Collection<? extends Statement>)newValue);
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
      case MyDslPackage.ACTIVITY__DECLARATIONS:
        getDeclarations().clear();
        return;
      case MyDslPackage.ACTIVITY__IF:
        setIf((Condition)null);
        return;
      case MyDslPackage.ACTIVITY__THEN:
        getThen().clear();
        return;
      case MyDslPackage.ACTIVITY__ELSEIF:
        setElseif((Activity)null);
        return;
      case MyDslPackage.ACTIVITY__ELSE:
        getElse().clear();
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
      case MyDslPackage.ACTIVITY__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case MyDslPackage.ACTIVITY__IF:
        return if_ != null;
      case MyDslPackage.ACTIVITY__THEN:
        return then != null && !then.isEmpty();
      case MyDslPackage.ACTIVITY__ELSEIF:
        return elseif != null;
      case MyDslPackage.ACTIVITY__ELSE:
        return else_ != null && !else_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActivityImpl
