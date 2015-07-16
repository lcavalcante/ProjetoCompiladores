/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Return_Statement;
import org.xtext.java.java.Return_value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Return_StatementImpl#getReturnSmt <em>Return Smt</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Return_StatementImpl#getRv <em>Rv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Return_StatementImpl extends StatementImpl implements Return_Statement
{
  /**
   * The cached value of the '{@link #getReturnSmt() <em>Return Smt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnSmt()
   * @generated
   * @ordered
   */
  protected Return_Statement returnSmt;

  /**
   * The cached value of the '{@link #getRv() <em>Rv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRv()
   * @generated
   * @ordered
   */
  protected Return_value rv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Return_StatementImpl()
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
    return JavaPackage.Literals.RETURN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return_Statement getReturnSmt()
  {
    return returnSmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnSmt(Return_Statement newReturnSmt, NotificationChain msgs)
  {
    Return_Statement oldReturnSmt = returnSmt;
    returnSmt = newReturnSmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.RETURN_STATEMENT__RETURN_SMT, oldReturnSmt, newReturnSmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnSmt(Return_Statement newReturnSmt)
  {
    if (newReturnSmt != returnSmt)
    {
      NotificationChain msgs = null;
      if (returnSmt != null)
        msgs = ((InternalEObject)returnSmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.RETURN_STATEMENT__RETURN_SMT, null, msgs);
      if (newReturnSmt != null)
        msgs = ((InternalEObject)newReturnSmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.RETURN_STATEMENT__RETURN_SMT, null, msgs);
      msgs = basicSetReturnSmt(newReturnSmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.RETURN_STATEMENT__RETURN_SMT, newReturnSmt, newReturnSmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return_value getRv()
  {
    return rv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRv(Return_value newRv, NotificationChain msgs)
  {
    Return_value oldRv = rv;
    rv = newRv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.RETURN_STATEMENT__RV, oldRv, newRv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRv(Return_value newRv)
  {
    if (newRv != rv)
    {
      NotificationChain msgs = null;
      if (rv != null)
        msgs = ((InternalEObject)rv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.RETURN_STATEMENT__RV, null, msgs);
      if (newRv != null)
        msgs = ((InternalEObject)newRv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.RETURN_STATEMENT__RV, null, msgs);
      msgs = basicSetRv(newRv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.RETURN_STATEMENT__RV, newRv, newRv));
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
      case JavaPackage.RETURN_STATEMENT__RETURN_SMT:
        return basicSetReturnSmt(null, msgs);
      case JavaPackage.RETURN_STATEMENT__RV:
        return basicSetRv(null, msgs);
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
      case JavaPackage.RETURN_STATEMENT__RETURN_SMT:
        return getReturnSmt();
      case JavaPackage.RETURN_STATEMENT__RV:
        return getRv();
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
      case JavaPackage.RETURN_STATEMENT__RETURN_SMT:
        setReturnSmt((Return_Statement)newValue);
        return;
      case JavaPackage.RETURN_STATEMENT__RV:
        setRv((Return_value)newValue);
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
      case JavaPackage.RETURN_STATEMENT__RETURN_SMT:
        setReturnSmt((Return_Statement)null);
        return;
      case JavaPackage.RETURN_STATEMENT__RV:
        setRv((Return_value)null);
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
      case JavaPackage.RETURN_STATEMENT__RETURN_SMT:
        return returnSmt != null;
      case JavaPackage.RETURN_STATEMENT__RV:
        return rv != null;
    }
    return super.eIsSet(featureID);
  }

} //Return_StatementImpl
