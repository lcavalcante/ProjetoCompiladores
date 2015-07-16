/**
 */
package org.xtext.java.java.impl;

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

import org.xtext.java.java.Expression;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Variable_initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Variable_initializerImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Variable_initializerImpl#getVariableInitializer1 <em>Variable Initializer1</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Variable_initializerImpl#getVariableIniatializer2 <em>Variable Iniatializer2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Variable_initializerImpl extends MinimalEObjectImpl.Container implements Variable_initializer
{
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
   * The cached value of the '{@link #getVariableInitializer1() <em>Variable Initializer1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableInitializer1()
   * @generated
   * @ordered
   */
  protected Variable_initializer variableInitializer1;

  /**
   * The cached value of the '{@link #getVariableIniatializer2() <em>Variable Iniatializer2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableIniatializer2()
   * @generated
   * @ordered
   */
  protected EList<Variable_initializer> variableIniatializer2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable_initializerImpl()
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
    return JavaPackage.Literals.VARIABLE_INITIALIZER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.VARIABLE_INITIALIZER__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_INITIALIZER__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_INITIALIZER__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.VARIABLE_INITIALIZER__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_initializer getVariableInitializer1()
  {
    return variableInitializer1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableInitializer1(Variable_initializer newVariableInitializer1, NotificationChain msgs)
  {
    Variable_initializer oldVariableInitializer1 = variableInitializer1;
    variableInitializer1 = newVariableInitializer1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1, oldVariableInitializer1, newVariableInitializer1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableInitializer1(Variable_initializer newVariableInitializer1)
  {
    if (newVariableInitializer1 != variableInitializer1)
    {
      NotificationChain msgs = null;
      if (variableInitializer1 != null)
        msgs = ((InternalEObject)variableInitializer1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1, null, msgs);
      if (newVariableInitializer1 != null)
        msgs = ((InternalEObject)newVariableInitializer1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1, null, msgs);
      msgs = basicSetVariableInitializer1(newVariableInitializer1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1, newVariableInitializer1, newVariableInitializer1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable_initializer> getVariableIniatializer2()
  {
    if (variableIniatializer2 == null)
    {
      variableIniatializer2 = new EObjectContainmentEList<Variable_initializer>(Variable_initializer.class, this, JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INIATIALIZER2);
    }
    return variableIniatializer2;
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
      case JavaPackage.VARIABLE_INITIALIZER__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1:
        return basicSetVariableInitializer1(null, msgs);
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INIATIALIZER2:
        return ((InternalEList<?>)getVariableIniatializer2()).basicRemove(otherEnd, msgs);
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
      case JavaPackage.VARIABLE_INITIALIZER__EXPRESSION:
        return getExpression();
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1:
        return getVariableInitializer1();
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INIATIALIZER2:
        return getVariableIniatializer2();
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
      case JavaPackage.VARIABLE_INITIALIZER__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1:
        setVariableInitializer1((Variable_initializer)newValue);
        return;
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INIATIALIZER2:
        getVariableIniatializer2().clear();
        getVariableIniatializer2().addAll((Collection<? extends Variable_initializer>)newValue);
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
      case JavaPackage.VARIABLE_INITIALIZER__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1:
        setVariableInitializer1((Variable_initializer)null);
        return;
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INIATIALIZER2:
        getVariableIniatializer2().clear();
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
      case JavaPackage.VARIABLE_INITIALIZER__EXPRESSION:
        return expression != null;
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER1:
        return variableInitializer1 != null;
      case JavaPackage.VARIABLE_INITIALIZER__VARIABLE_INIATIALIZER2:
        return variableIniatializer2 != null && !variableIniatializer2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Variable_initializerImpl
