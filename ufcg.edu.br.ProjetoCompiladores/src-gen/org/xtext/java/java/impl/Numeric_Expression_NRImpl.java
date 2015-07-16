/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Expression;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Numeric_Expression_NR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Expression NR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Numeric_Expression_NRImpl#getSinal_numeric <em>Sinal numeric</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Numeric_Expression_NRImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Numeric_Expression_NRImpl extends MinimalEObjectImpl.Container implements Numeric_Expression_NR
{
  /**
   * The default value of the '{@link #getSinal_numeric() <em>Sinal numeric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinal_numeric()
   * @generated
   * @ordered
   */
  protected static final String SINAL_NUMERIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSinal_numeric() <em>Sinal numeric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinal_numeric()
   * @generated
   * @ordered
   */
  protected String sinal_numeric = SINAL_NUMERIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Numeric_Expression_NRImpl()
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
    return JavaPackage.Literals.NUMERIC_EXPRESSION_NR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSinal_numeric()
  {
    return sinal_numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSinal_numeric(String newSinal_numeric)
  {
    String oldSinal_numeric = sinal_numeric;
    sinal_numeric = newSinal_numeric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.NUMERIC_EXPRESSION_NR__SINAL_NUMERIC, oldSinal_numeric, sinal_numeric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION, newExpression, newExpression));
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
      case JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case JavaPackage.NUMERIC_EXPRESSION_NR__SINAL_NUMERIC:
        return getSinal_numeric();
      case JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION:
        return getExpression();
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
      case JavaPackage.NUMERIC_EXPRESSION_NR__SINAL_NUMERIC:
        setSinal_numeric((String)newValue);
        return;
      case JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION:
        setExpression((Expression)newValue);
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
      case JavaPackage.NUMERIC_EXPRESSION_NR__SINAL_NUMERIC:
        setSinal_numeric(SINAL_NUMERIC_EDEFAULT);
        return;
      case JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION:
        setExpression((Expression)null);
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
      case JavaPackage.NUMERIC_EXPRESSION_NR__SINAL_NUMERIC:
        return SINAL_NUMERIC_EDEFAULT == null ? sinal_numeric != null : !SINAL_NUMERIC_EDEFAULT.equals(sinal_numeric);
      case JavaPackage.NUMERIC_EXPRESSION_NR__EXPRESSION:
        return expression != null;
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
    result.append(" (sinal_numeric: ");
    result.append(sinal_numeric);
    result.append(')');
    return result.toString();
  }

} //Numeric_Expression_NRImpl
