/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Do_Statement;
import org.xtext.java.java.Expression;
import org.xtext.java.java.For_Statement;
import org.xtext.java.java.If_Statement;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Statement;
import org.xtext.java.java.Switch_Statement;
import org.xtext.java.java.Try_statement;
import org.xtext.java.java.Variable_declaration;
import org.xtext.java.java.While_Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getExpressionx <em>Expressionx</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getWhileStatement <em>While Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getForStatement <em>For Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getSwitchStatement <em>Switch Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getTry <em>Try</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.StatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
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
   * The cached value of the '{@link #getExpressionx() <em>Expressionx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionx()
   * @generated
   * @ordered
   */
  protected Expression expressionx;

  /**
   * The cached value of the '{@link #getIfStatement() <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStatement()
   * @generated
   * @ordered
   */
  protected If_Statement ifStatement;

  /**
   * The cached value of the '{@link #getDoStatement() <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoStatement()
   * @generated
   * @ordered
   */
  protected Do_Statement doStatement;

  /**
   * The cached value of the '{@link #getWhileStatement() <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileStatement()
   * @generated
   * @ordered
   */
  protected While_Statement whileStatement;

  /**
   * The cached value of the '{@link #getForStatement() <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStatement()
   * @generated
   * @ordered
   */
  protected For_Statement forStatement;

  /**
   * The cached value of the '{@link #getSwitchStatement() <em>Switch Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchStatement()
   * @generated
   * @ordered
   */
  protected Switch_Statement switchStatement;

  /**
   * The cached value of the '{@link #getTry() <em>Try</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTry()
   * @generated
   * @ordered
   */
  protected Try_statement try_;

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
    return JavaPackage.Literals.STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__VARIABLE, oldVariable, newVariable);
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
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpressionx()
  {
    return expressionx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionx(Expression newExpressionx, NotificationChain msgs)
  {
    Expression oldExpressionx = expressionx;
    expressionx = newExpressionx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__EXPRESSIONX, oldExpressionx, newExpressionx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionx(Expression newExpressionx)
  {
    if (newExpressionx != expressionx)
    {
      NotificationChain msgs = null;
      if (expressionx != null)
        msgs = ((InternalEObject)expressionx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__EXPRESSIONX, null, msgs);
      if (newExpressionx != null)
        msgs = ((InternalEObject)newExpressionx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__EXPRESSIONX, null, msgs);
      msgs = basicSetExpressionx(newExpressionx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__EXPRESSIONX, newExpressionx, newExpressionx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If_Statement getIfStatement()
  {
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStatement(If_Statement newIfStatement, NotificationChain msgs)
  {
    If_Statement oldIfStatement = ifStatement;
    ifStatement = newIfStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__IF_STATEMENT, oldIfStatement, newIfStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStatement(If_Statement newIfStatement)
  {
    if (newIfStatement != ifStatement)
    {
      NotificationChain msgs = null;
      if (ifStatement != null)
        msgs = ((InternalEObject)ifStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__IF_STATEMENT, null, msgs);
      if (newIfStatement != null)
        msgs = ((InternalEObject)newIfStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__IF_STATEMENT, null, msgs);
      msgs = basicSetIfStatement(newIfStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__IF_STATEMENT, newIfStatement, newIfStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do_Statement getDoStatement()
  {
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoStatement(Do_Statement newDoStatement, NotificationChain msgs)
  {
    Do_Statement oldDoStatement = doStatement;
    doStatement = newDoStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__DO_STATEMENT, oldDoStatement, newDoStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoStatement(Do_Statement newDoStatement)
  {
    if (newDoStatement != doStatement)
    {
      NotificationChain msgs = null;
      if (doStatement != null)
        msgs = ((InternalEObject)doStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__DO_STATEMENT, null, msgs);
      if (newDoStatement != null)
        msgs = ((InternalEObject)newDoStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__DO_STATEMENT, null, msgs);
      msgs = basicSetDoStatement(newDoStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__DO_STATEMENT, newDoStatement, newDoStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While_Statement getWhileStatement()
  {
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileStatement(While_Statement newWhileStatement, NotificationChain msgs)
  {
    While_Statement oldWhileStatement = whileStatement;
    whileStatement = newWhileStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__WHILE_STATEMENT, oldWhileStatement, newWhileStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileStatement(While_Statement newWhileStatement)
  {
    if (newWhileStatement != whileStatement)
    {
      NotificationChain msgs = null;
      if (whileStatement != null)
        msgs = ((InternalEObject)whileStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      if (newWhileStatement != null)
        msgs = ((InternalEObject)newWhileStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      msgs = basicSetWhileStatement(newWhileStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__WHILE_STATEMENT, newWhileStatement, newWhileStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_Statement getForStatement()
  {
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStatement(For_Statement newForStatement, NotificationChain msgs)
  {
    For_Statement oldForStatement = forStatement;
    forStatement = newForStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__FOR_STATEMENT, oldForStatement, newForStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStatement(For_Statement newForStatement)
  {
    if (newForStatement != forStatement)
    {
      NotificationChain msgs = null;
      if (forStatement != null)
        msgs = ((InternalEObject)forStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      if (newForStatement != null)
        msgs = ((InternalEObject)newForStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetForStatement(newForStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__FOR_STATEMENT, newForStatement, newForStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch_Statement getSwitchStatement()
  {
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchStatement(Switch_Statement newSwitchStatement, NotificationChain msgs)
  {
    Switch_Statement oldSwitchStatement = switchStatement;
    switchStatement = newSwitchStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__SWITCH_STATEMENT, oldSwitchStatement, newSwitchStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchStatement(Switch_Statement newSwitchStatement)
  {
    if (newSwitchStatement != switchStatement)
    {
      NotificationChain msgs = null;
      if (switchStatement != null)
        msgs = ((InternalEObject)switchStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__SWITCH_STATEMENT, null, msgs);
      if (newSwitchStatement != null)
        msgs = ((InternalEObject)newSwitchStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__SWITCH_STATEMENT, null, msgs);
      msgs = basicSetSwitchStatement(newSwitchStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__SWITCH_STATEMENT, newSwitchStatement, newSwitchStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try_statement getTry()
  {
    return try_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTry(Try_statement newTry, NotificationChain msgs)
  {
    Try_statement oldTry = try_;
    try_ = newTry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__TRY, oldTry, newTry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTry(Try_statement newTry)
  {
    if (newTry != try_)
    {
      NotificationChain msgs = null;
      if (try_ != null)
        msgs = ((InternalEObject)try_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__TRY, null, msgs);
      if (newTry != null)
        msgs = ((InternalEObject)newTry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__TRY, null, msgs);
      msgs = basicSetTry(newTry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__TRY, newTry, newTry));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__STATEMENT, oldStatement, newStatement);
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
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATEMENT__STATEMENT, newStatement, newStatement));
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
      case JavaPackage.STATEMENT__VARIABLE:
        return basicSetVariable(null, msgs);
      case JavaPackage.STATEMENT__EXPRESSIONX:
        return basicSetExpressionx(null, msgs);
      case JavaPackage.STATEMENT__IF_STATEMENT:
        return basicSetIfStatement(null, msgs);
      case JavaPackage.STATEMENT__DO_STATEMENT:
        return basicSetDoStatement(null, msgs);
      case JavaPackage.STATEMENT__WHILE_STATEMENT:
        return basicSetWhileStatement(null, msgs);
      case JavaPackage.STATEMENT__FOR_STATEMENT:
        return basicSetForStatement(null, msgs);
      case JavaPackage.STATEMENT__SWITCH_STATEMENT:
        return basicSetSwitchStatement(null, msgs);
      case JavaPackage.STATEMENT__TRY:
        return basicSetTry(null, msgs);
      case JavaPackage.STATEMENT__STATEMENT:
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
      case JavaPackage.STATEMENT__VARIABLE:
        return getVariable();
      case JavaPackage.STATEMENT__EXPRESSIONX:
        return getExpressionx();
      case JavaPackage.STATEMENT__IF_STATEMENT:
        return getIfStatement();
      case JavaPackage.STATEMENT__DO_STATEMENT:
        return getDoStatement();
      case JavaPackage.STATEMENT__WHILE_STATEMENT:
        return getWhileStatement();
      case JavaPackage.STATEMENT__FOR_STATEMENT:
        return getForStatement();
      case JavaPackage.STATEMENT__SWITCH_STATEMENT:
        return getSwitchStatement();
      case JavaPackage.STATEMENT__TRY:
        return getTry();
      case JavaPackage.STATEMENT__NAME:
        return getName();
      case JavaPackage.STATEMENT__STATEMENT:
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
      case JavaPackage.STATEMENT__VARIABLE:
        setVariable((Variable_declaration)newValue);
        return;
      case JavaPackage.STATEMENT__EXPRESSIONX:
        setExpressionx((Expression)newValue);
        return;
      case JavaPackage.STATEMENT__IF_STATEMENT:
        setIfStatement((If_Statement)newValue);
        return;
      case JavaPackage.STATEMENT__DO_STATEMENT:
        setDoStatement((Do_Statement)newValue);
        return;
      case JavaPackage.STATEMENT__WHILE_STATEMENT:
        setWhileStatement((While_Statement)newValue);
        return;
      case JavaPackage.STATEMENT__FOR_STATEMENT:
        setForStatement((For_Statement)newValue);
        return;
      case JavaPackage.STATEMENT__SWITCH_STATEMENT:
        setSwitchStatement((Switch_Statement)newValue);
        return;
      case JavaPackage.STATEMENT__TRY:
        setTry((Try_statement)newValue);
        return;
      case JavaPackage.STATEMENT__NAME:
        setName((String)newValue);
        return;
      case JavaPackage.STATEMENT__STATEMENT:
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
      case JavaPackage.STATEMENT__VARIABLE:
        setVariable((Variable_declaration)null);
        return;
      case JavaPackage.STATEMENT__EXPRESSIONX:
        setExpressionx((Expression)null);
        return;
      case JavaPackage.STATEMENT__IF_STATEMENT:
        setIfStatement((If_Statement)null);
        return;
      case JavaPackage.STATEMENT__DO_STATEMENT:
        setDoStatement((Do_Statement)null);
        return;
      case JavaPackage.STATEMENT__WHILE_STATEMENT:
        setWhileStatement((While_Statement)null);
        return;
      case JavaPackage.STATEMENT__FOR_STATEMENT:
        setForStatement((For_Statement)null);
        return;
      case JavaPackage.STATEMENT__SWITCH_STATEMENT:
        setSwitchStatement((Switch_Statement)null);
        return;
      case JavaPackage.STATEMENT__TRY:
        setTry((Try_statement)null);
        return;
      case JavaPackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JavaPackage.STATEMENT__STATEMENT:
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
      case JavaPackage.STATEMENT__VARIABLE:
        return variable != null;
      case JavaPackage.STATEMENT__EXPRESSIONX:
        return expressionx != null;
      case JavaPackage.STATEMENT__IF_STATEMENT:
        return ifStatement != null;
      case JavaPackage.STATEMENT__DO_STATEMENT:
        return doStatement != null;
      case JavaPackage.STATEMENT__WHILE_STATEMENT:
        return whileStatement != null;
      case JavaPackage.STATEMENT__FOR_STATEMENT:
        return forStatement != null;
      case JavaPackage.STATEMENT__SWITCH_STATEMENT:
        return switchStatement != null;
      case JavaPackage.STATEMENT__TRY:
        return try_ != null;
      case JavaPackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JavaPackage.STATEMENT__STATEMENT:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
