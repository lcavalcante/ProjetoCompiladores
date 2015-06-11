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

import org.xtext.java.java.Arg_List;
import org.xtext.java.java.Expression;
import org.xtext.java.java.Expression_aux;
import org.xtext.java.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression aux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getArgList <em>Arg List</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getSgin <em>Sgin</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getSinalNumeric <em>Sinal Numeric</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Expression_auxImpl extends MinimalEObjectImpl.Container implements Expression_aux
{
  /**
   * The cached value of the '{@link #getArgList() <em>Arg List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgList()
   * @generated
   * @ordered
   */
  protected EList<Arg_List> argList;

  /**
   * The cached value of the '{@link #getAux() <em>Aux</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAux()
   * @generated
   * @ordered
   */
  protected Expression_aux aux;

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
   * The default value of the '{@link #getSgin() <em>Sgin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSgin()
   * @generated
   * @ordered
   */
  protected static final String SGIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSgin() <em>Sgin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSgin()
   * @generated
   * @ordered
   */
  protected String sgin = SGIN_EDEFAULT;

  /**
   * The default value of the '{@link #getSinalNumeric() <em>Sinal Numeric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinalNumeric()
   * @generated
   * @ordered
   */
  protected static final String SINAL_NUMERIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSinalNumeric() <em>Sinal Numeric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinalNumeric()
   * @generated
   * @ordered
   */
  protected String sinalNumeric = SINAL_NUMERIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected Expression exp2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Expression_auxImpl()
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
    return JavaPackage.Literals.EXPRESSION_AUX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arg_List> getArgList()
  {
    if (argList == null)
    {
      argList = new EObjectContainmentEList<Arg_List>(Arg_List.class, this, JavaPackage.EXPRESSION_AUX__ARG_LIST);
    }
    return argList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_aux getAux()
  {
    return aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAux(Expression_aux newAux, NotificationChain msgs)
  {
    Expression_aux oldAux = aux;
    aux = newAux;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX, oldAux, newAux);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAux(Expression_aux newAux)
  {
    if (newAux != aux)
    {
      NotificationChain msgs = null;
      if (aux != null)
        msgs = ((InternalEObject)aux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX, null, msgs);
      if (newAux != null)
        msgs = ((InternalEObject)newAux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX, null, msgs);
      msgs = basicSetAux(newAux, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX, newAux, newAux));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXPRESSION2, oldExpression2, newExpression2);
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
        msgs = ((InternalEObject)expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXPRESSION2, null, msgs);
      if (newExpression2 != null)
        msgs = ((InternalEObject)newExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXPRESSION2, null, msgs);
      msgs = basicSetExpression2(newExpression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXPRESSION2, newExpression2, newExpression2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSgin()
  {
    return sgin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSgin(String newSgin)
  {
    String oldSgin = sgin;
    sgin = newSgin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__SGIN, oldSgin, sgin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSinalNumeric()
  {
    return sinalNumeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSinalNumeric(String newSinalNumeric)
  {
    String oldSinalNumeric = sinalNumeric;
    sinalNumeric = newSinalNumeric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__SINAL_NUMERIC, oldSinalNumeric, sinalNumeric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp2(Expression newExp2, NotificationChain msgs)
  {
    Expression oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXP2, oldExp2, newExp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp2(Expression newExp2)
  {
    if (newExp2 != exp2)
    {
      NotificationChain msgs = null;
      if (exp2 != null)
        msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXP2, null, msgs);
      if (newExp2 != null)
        msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXP2, null, msgs);
      msgs = basicSetExp2(newExp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXP2, newExp2, newExp2));
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
      case JavaPackage.EXPRESSION_AUX__ARG_LIST:
        return ((InternalEList<?>)getArgList()).basicRemove(otherEnd, msgs);
      case JavaPackage.EXPRESSION_AUX__AUX:
        return basicSetAux(null, msgs);
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        return basicSetExpression2(null, msgs);
      case JavaPackage.EXPRESSION_AUX__EXP2:
        return basicSetExp2(null, msgs);
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
      case JavaPackage.EXPRESSION_AUX__ARG_LIST:
        return getArgList();
      case JavaPackage.EXPRESSION_AUX__AUX:
        return getAux();
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        return getExpression2();
      case JavaPackage.EXPRESSION_AUX__NAME:
        return getName();
      case JavaPackage.EXPRESSION_AUX__SGIN:
        return getSgin();
      case JavaPackage.EXPRESSION_AUX__SINAL_NUMERIC:
        return getSinalNumeric();
      case JavaPackage.EXPRESSION_AUX__EXP2:
        return getExp2();
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
      case JavaPackage.EXPRESSION_AUX__ARG_LIST:
        getArgList().clear();
        getArgList().addAll((Collection<? extends Arg_List>)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__AUX:
        setAux((Expression_aux)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        setExpression2((Expression)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__NAME:
        setName((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__SGIN:
        setSgin((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__SINAL_NUMERIC:
        setSinalNumeric((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXP2:
        setExp2((Expression)newValue);
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
      case JavaPackage.EXPRESSION_AUX__ARG_LIST:
        getArgList().clear();
        return;
      case JavaPackage.EXPRESSION_AUX__AUX:
        setAux((Expression_aux)null);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        setExpression2((Expression)null);
        return;
      case JavaPackage.EXPRESSION_AUX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__SGIN:
        setSgin(SGIN_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__SINAL_NUMERIC:
        setSinalNumeric(SINAL_NUMERIC_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__EXP2:
        setExp2((Expression)null);
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
      case JavaPackage.EXPRESSION_AUX__ARG_LIST:
        return argList != null && !argList.isEmpty();
      case JavaPackage.EXPRESSION_AUX__AUX:
        return aux != null;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        return expression2 != null;
      case JavaPackage.EXPRESSION_AUX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JavaPackage.EXPRESSION_AUX__SGIN:
        return SGIN_EDEFAULT == null ? sgin != null : !SGIN_EDEFAULT.equals(sgin);
      case JavaPackage.EXPRESSION_AUX__SINAL_NUMERIC:
        return SINAL_NUMERIC_EDEFAULT == null ? sinalNumeric != null : !SINAL_NUMERIC_EDEFAULT.equals(sinalNumeric);
      case JavaPackage.EXPRESSION_AUX__EXP2:
        return exp2 != null;
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
    result.append(", sgin: ");
    result.append(sgin);
    result.append(", sinalNumeric: ");
    result.append(sinalNumeric);
    result.append(')');
    return result.toString();
  }

} //Expression_auxImpl
