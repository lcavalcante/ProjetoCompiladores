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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Parameter;
import org.xtext.java.java.Statement;
import org.xtext.java.java.Try_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getTry <em>Try</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getCatchs <em>Catchs</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getCatchStatements <em>Catch Statements</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getFinally <em>Finally</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Try_statementImpl#getFinallyStatement <em>Finally Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Try_statementImpl extends MinimalEObjectImpl.Container implements Try_statement
{
  /**
   * The default value of the '{@link #getTry() <em>Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTry()
   * @generated
   * @ordered
   */
  protected static final String TRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTry() <em>Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTry()
   * @generated
   * @ordered
   */
  protected String try_ = TRY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTryStatement() <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTryStatement()
   * @generated
   * @ordered
   */
  protected Statement tryStatement;

  /**
   * The cached value of the '{@link #getCatchs() <em>Catchs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchs()
   * @generated
   * @ordered
   */
  protected EList<String> catchs;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getCatchStatements() <em>Catch Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> catchStatements;

  /**
   * The default value of the '{@link #getFinally() <em>Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinally()
   * @generated
   * @ordered
   */
  protected static final String FINALLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinally() <em>Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinally()
   * @generated
   * @ordered
   */
  protected String finally_ = FINALLY_EDEFAULT;

  /**
   * The cached value of the '{@link #getFinallyStatement() <em>Finally Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinallyStatement()
   * @generated
   * @ordered
   */
  protected Statement finallyStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Try_statementImpl()
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
    return JavaPackage.Literals.TRY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTry()
  {
    return try_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTry(String newTry)
  {
    String oldTry = try_;
    try_ = newTry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TRY_STATEMENT__TRY, oldTry, try_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getTryStatement()
  {
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTryStatement(Statement newTryStatement, NotificationChain msgs)
  {
    Statement oldTryStatement = tryStatement;
    tryStatement = newTryStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.TRY_STATEMENT__TRY_STATEMENT, oldTryStatement, newTryStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTryStatement(Statement newTryStatement)
  {
    if (newTryStatement != tryStatement)
    {
      NotificationChain msgs = null;
      if (tryStatement != null)
        msgs = ((InternalEObject)tryStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTryStatement != null)
        msgs = ((InternalEObject)newTryStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTryStatement(newTryStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TRY_STATEMENT__TRY_STATEMENT, newTryStatement, newTryStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCatchs()
  {
    if (catchs == null)
    {
      catchs = new EDataTypeEList<String>(String.class, this, JavaPackage.TRY_STATEMENT__CATCHS);
    }
    return catchs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, JavaPackage.TRY_STATEMENT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getCatchStatements()
  {
    if (catchStatements == null)
    {
      catchStatements = new EObjectContainmentEList<Statement>(Statement.class, this, JavaPackage.TRY_STATEMENT__CATCH_STATEMENTS);
    }
    return catchStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFinally()
  {
    return finally_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinally(String newFinally)
  {
    String oldFinally = finally_;
    finally_ = newFinally;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TRY_STATEMENT__FINALLY, oldFinally, finally_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getFinallyStatement()
  {
    return finallyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinallyStatement(Statement newFinallyStatement, NotificationChain msgs)
  {
    Statement oldFinallyStatement = finallyStatement;
    finallyStatement = newFinallyStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, oldFinallyStatement, newFinallyStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinallyStatement(Statement newFinallyStatement)
  {
    if (newFinallyStatement != finallyStatement)
    {
      NotificationChain msgs = null;
      if (finallyStatement != null)
        msgs = ((InternalEObject)finallyStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, null, msgs);
      if (newFinallyStatement != null)
        msgs = ((InternalEObject)newFinallyStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, null, msgs);
      msgs = basicSetFinallyStatement(newFinallyStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, newFinallyStatement, newFinallyStatement));
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
      case JavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        return basicSetTryStatement(null, msgs);
      case JavaPackage.TRY_STATEMENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case JavaPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        return ((InternalEList<?>)getCatchStatements()).basicRemove(otherEnd, msgs);
      case JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return basicSetFinallyStatement(null, msgs);
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
      case JavaPackage.TRY_STATEMENT__TRY:
        return getTry();
      case JavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        return getTryStatement();
      case JavaPackage.TRY_STATEMENT__CATCHS:
        return getCatchs();
      case JavaPackage.TRY_STATEMENT__PARAMETERS:
        return getParameters();
      case JavaPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        return getCatchStatements();
      case JavaPackage.TRY_STATEMENT__FINALLY:
        return getFinally();
      case JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return getFinallyStatement();
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
      case JavaPackage.TRY_STATEMENT__TRY:
        setTry((String)newValue);
        return;
      case JavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTryStatement((Statement)newValue);
        return;
      case JavaPackage.TRY_STATEMENT__CATCHS:
        getCatchs().clear();
        getCatchs().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.TRY_STATEMENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case JavaPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        getCatchStatements().clear();
        getCatchStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case JavaPackage.TRY_STATEMENT__FINALLY:
        setFinally((String)newValue);
        return;
      case JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        setFinallyStatement((Statement)newValue);
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
      case JavaPackage.TRY_STATEMENT__TRY:
        setTry(TRY_EDEFAULT);
        return;
      case JavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTryStatement((Statement)null);
        return;
      case JavaPackage.TRY_STATEMENT__CATCHS:
        getCatchs().clear();
        return;
      case JavaPackage.TRY_STATEMENT__PARAMETERS:
        getParameters().clear();
        return;
      case JavaPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        getCatchStatements().clear();
        return;
      case JavaPackage.TRY_STATEMENT__FINALLY:
        setFinally(FINALLY_EDEFAULT);
        return;
      case JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        setFinallyStatement((Statement)null);
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
      case JavaPackage.TRY_STATEMENT__TRY:
        return TRY_EDEFAULT == null ? try_ != null : !TRY_EDEFAULT.equals(try_);
      case JavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        return tryStatement != null;
      case JavaPackage.TRY_STATEMENT__CATCHS:
        return catchs != null && !catchs.isEmpty();
      case JavaPackage.TRY_STATEMENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case JavaPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        return catchStatements != null && !catchStatements.isEmpty();
      case JavaPackage.TRY_STATEMENT__FINALLY:
        return FINALLY_EDEFAULT == null ? finally_ != null : !FINALLY_EDEFAULT.equals(finally_);
      case JavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return finallyStatement != null;
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
    result.append(" (try: ");
    result.append(try_);
    result.append(", catchs: ");
    result.append(catchs);
    result.append(", finally: ");
    result.append(finally_);
    result.append(')');
    return result.toString();
  }

} //Try_statementImpl
