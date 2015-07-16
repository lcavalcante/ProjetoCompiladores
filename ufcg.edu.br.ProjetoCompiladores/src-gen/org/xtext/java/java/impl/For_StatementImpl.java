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
import org.xtext.java.java.For_Statement;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Statement;
import org.xtext.java.java.Variable_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.For_StatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.For_StatementImpl#getPv <em>Pv</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.For_StatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.For_StatementImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.For_StatementImpl#getExpression3 <em>Expression3</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.For_StatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class For_StatementImpl extends MinimalEObjectImpl.Container implements For_Statement
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable_declaration variable;

  /**
   * The default value of the '{@link #getPv() <em>Pv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPv()
   * @generated
   * @ordered
   */
  protected static final String PV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPv() <em>Pv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPv()
   * @generated
   * @ordered
   */
  protected String pv = PV_EDEFAULT;

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
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected Expression expression2;

  /**
   * The cached value of the '{@link #getExpression3() <em>Expression3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression3()
   * @generated
   * @ordered
   */
  protected Expression expression3;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected For_StatementImpl()
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
    return JavaPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declaration getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable_declaration newVariable, NotificationChain msgs)
  {
    Variable_declaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable_declaration newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPv()
  {
    return pv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPv(String newPv)
  {
    String oldPv = pv;
    pv = newPv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__PV, oldPv, pv));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression2()
  {
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression2(Expression newExpression2, NotificationChain msgs)
  {
    Expression oldExpression2 = expression2;
    expression2 = newExpression2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__EXPRESSION2, oldExpression2, newExpression2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression2(Expression newExpression2)
  {
    if (newExpression2 != expression2)
    {
      NotificationChain msgs = null;
      if (expression2 != null)
        msgs = ((InternalEObject)expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__EXPRESSION2, null, msgs);
      if (newExpression2 != null)
        msgs = ((InternalEObject)newExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__EXPRESSION2, null, msgs);
      msgs = basicSetExpression2(newExpression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__EXPRESSION2, newExpression2, newExpression2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression3()
  {
    return expression3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression3(Expression newExpression3, NotificationChain msgs)
  {
    Expression oldExpression3 = expression3;
    expression3 = newExpression3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__EXPRESSION3, oldExpression3, newExpression3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression3(Expression newExpression3)
  {
    if (newExpression3 != expression3)
    {
      NotificationChain msgs = null;
      if (expression3 != null)
        msgs = ((InternalEObject)expression3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__EXPRESSION3, null, msgs);
      if (newExpression3 != null)
        msgs = ((InternalEObject)newExpression3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__EXPRESSION3, null, msgs);
      msgs = basicSetExpression3(newExpression3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__EXPRESSION3, newExpression3, newExpression3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_STATEMENT__STATEMENT, newStatement, newStatement));
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
      case JavaPackage.FOR_STATEMENT__VARIABLE:
        return basicSetVariable(null, msgs);
      case JavaPackage.FOR_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JavaPackage.FOR_STATEMENT__EXPRESSION2:
        return basicSetExpression2(null, msgs);
      case JavaPackage.FOR_STATEMENT__EXPRESSION3:
        return basicSetExpression3(null, msgs);
      case JavaPackage.FOR_STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case JavaPackage.FOR_STATEMENT__VARIABLE:
        return getVariable();
      case JavaPackage.FOR_STATEMENT__PV:
        return getPv();
      case JavaPackage.FOR_STATEMENT__EXPRESSION:
        return getExpression();
      case JavaPackage.FOR_STATEMENT__EXPRESSION2:
        return getExpression2();
      case JavaPackage.FOR_STATEMENT__EXPRESSION3:
        return getExpression3();
      case JavaPackage.FOR_STATEMENT__STATEMENT:
        return getStatement();
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
      case JavaPackage.FOR_STATEMENT__VARIABLE:
        setVariable((Variable_declaration)newValue);
        return;
      case JavaPackage.FOR_STATEMENT__PV:
        setPv((String)newValue);
        return;
      case JavaPackage.FOR_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JavaPackage.FOR_STATEMENT__EXPRESSION2:
        setExpression2((Expression)newValue);
        return;
      case JavaPackage.FOR_STATEMENT__EXPRESSION3:
        setExpression3((Expression)newValue);
        return;
      case JavaPackage.FOR_STATEMENT__STATEMENT:
        setStatement((Statement)newValue);
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
      case JavaPackage.FOR_STATEMENT__VARIABLE:
        setVariable((Variable_declaration)null);
        return;
      case JavaPackage.FOR_STATEMENT__PV:
        setPv(PV_EDEFAULT);
        return;
      case JavaPackage.FOR_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JavaPackage.FOR_STATEMENT__EXPRESSION2:
        setExpression2((Expression)null);
        return;
      case JavaPackage.FOR_STATEMENT__EXPRESSION3:
        setExpression3((Expression)null);
        return;
      case JavaPackage.FOR_STATEMENT__STATEMENT:
        setStatement((Statement)null);
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
      case JavaPackage.FOR_STATEMENT__VARIABLE:
        return variable != null;
      case JavaPackage.FOR_STATEMENT__PV:
        return PV_EDEFAULT == null ? pv != null : !PV_EDEFAULT.equals(pv);
      case JavaPackage.FOR_STATEMENT__EXPRESSION:
        return expression != null;
      case JavaPackage.FOR_STATEMENT__EXPRESSION2:
        return expression2 != null;
      case JavaPackage.FOR_STATEMENT__EXPRESSION3:
        return expression3 != null;
      case JavaPackage.FOR_STATEMENT__STATEMENT:
        return statement != null;
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
    result.append(" (pv: ");
    result.append(pv);
    result.append(')');
    return result.toString();
  }

} //For_StatementImpl
