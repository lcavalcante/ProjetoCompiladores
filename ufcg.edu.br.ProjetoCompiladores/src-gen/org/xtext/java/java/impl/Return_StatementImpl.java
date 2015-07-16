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
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Return_StatementImpl#getReturnSmt <em>Return Smt</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Return_StatementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Return_value value;

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
  public Return_value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Return_value newValue, NotificationChain msgs)
  {
    Return_value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.RETURN_STATEMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Return_value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.RETURN_STATEMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.RETURN_STATEMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.RETURN_STATEMENT__VALUE, newValue, newValue));
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
      case JavaPackage.RETURN_STATEMENT__VALUE:
        return basicSetValue(null, msgs);
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
      case JavaPackage.RETURN_STATEMENT__VALUE:
        return getValue();
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
      case JavaPackage.RETURN_STATEMENT__VALUE:
        setValue((Return_value)newValue);
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
      case JavaPackage.RETURN_STATEMENT__VALUE:
        setValue((Return_value)null);
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
      case JavaPackage.RETURN_STATEMENT__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //Return_StatementImpl
