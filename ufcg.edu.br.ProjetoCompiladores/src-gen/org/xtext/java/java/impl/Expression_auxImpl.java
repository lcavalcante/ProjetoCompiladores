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
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux1 <em>Aux1</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux2 <em>Aux2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux3 <em>Aux3</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux4 <em>Aux4</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux5 <em>Aux5</em>}</li>
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
   * The cached value of the '{@link #getAux1() <em>Aux1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAux1()
   * @generated
   * @ordered
   */
  protected Expression_aux aux1;

  /**
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression2;

  /**
   * The cached value of the '{@link #getAux2() <em>Aux2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAux2()
   * @generated
   * @ordered
   */
  protected Expression_aux aux2;

  /**
   * The cached value of the '{@link #getAux3() <em>Aux3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAux3()
   * @generated
   * @ordered
   */
  protected Expression_aux aux3;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression;

  /**
   * The cached value of the '{@link #getAux4() <em>Aux4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAux4()
   * @generated
   * @ordered
   */
  protected Expression_aux aux4;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * The cached value of the '{@link #getAux5() <em>Aux5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAux5()
   * @generated
   * @ordered
   */
  protected Expression_aux aux5;

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
  public Expression_aux getAux1()
  {
    return aux1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAux1(Expression_aux newAux1, NotificationChain msgs)
  {
    Expression_aux oldAux1 = aux1;
    aux1 = newAux1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX1, oldAux1, newAux1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAux1(Expression_aux newAux1)
  {
    if (newAux1 != aux1)
    {
      NotificationChain msgs = null;
      if (aux1 != null)
        msgs = ((InternalEObject)aux1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX1, null, msgs);
      if (newAux1 != null)
        msgs = ((InternalEObject)newAux1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX1, null, msgs);
      msgs = basicSetAux1(newAux1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX1, newAux1, newAux1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression2()
  {
    if (expression2 == null)
    {
      expression2 = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.EXPRESSION_AUX__EXPRESSION2);
    }
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_aux getAux2()
  {
    return aux2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAux2(Expression_aux newAux2, NotificationChain msgs)
  {
    Expression_aux oldAux2 = aux2;
    aux2 = newAux2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX2, oldAux2, newAux2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAux2(Expression_aux newAux2)
  {
    if (newAux2 != aux2)
    {
      NotificationChain msgs = null;
      if (aux2 != null)
        msgs = ((InternalEObject)aux2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX2, null, msgs);
      if (newAux2 != null)
        msgs = ((InternalEObject)newAux2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX2, null, msgs);
      msgs = basicSetAux2(newAux2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX2, newAux2, newAux2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_aux getAux3()
  {
    return aux3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAux3(Expression_aux newAux3, NotificationChain msgs)
  {
    Expression_aux oldAux3 = aux3;
    aux3 = newAux3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX3, oldAux3, newAux3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAux3(Expression_aux newAux3)
  {
    if (newAux3 != aux3)
    {
      NotificationChain msgs = null;
      if (aux3 != null)
        msgs = ((InternalEObject)aux3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX3, null, msgs);
      if (newAux3 != null)
        msgs = ((InternalEObject)newAux3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX3, null, msgs);
      msgs = basicSetAux3(newAux3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX3, newAux3, newAux3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.EXPRESSION_AUX__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_aux getAux4()
  {
    return aux4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAux4(Expression_aux newAux4, NotificationChain msgs)
  {
    Expression_aux oldAux4 = aux4;
    aux4 = newAux4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX4, oldAux4, newAux4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAux4(Expression_aux newAux4)
  {
    if (newAux4 != aux4)
    {
      NotificationChain msgs = null;
      if (aux4 != null)
        msgs = ((InternalEObject)aux4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX4, null, msgs);
      if (newAux4 != null)
        msgs = ((InternalEObject)newAux4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX4, null, msgs);
      msgs = basicSetAux4(newAux4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX4, newAux4, newAux4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, JavaPackage.EXPRESSION_AUX__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_aux getAux5()
  {
    return aux5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAux5(Expression_aux newAux5, NotificationChain msgs)
  {
    Expression_aux oldAux5 = aux5;
    aux5 = newAux5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX5, oldAux5, newAux5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAux5(Expression_aux newAux5)
  {
    if (newAux5 != aux5)
    {
      NotificationChain msgs = null;
      if (aux5 != null)
        msgs = ((InternalEObject)aux5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX5, null, msgs);
      if (newAux5 != null)
        msgs = ((InternalEObject)newAux5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AUX5, null, msgs);
      msgs = basicSetAux5(newAux5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AUX5, newAux5, newAux5));
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
      case JavaPackage.EXPRESSION_AUX__AUX1:
        return basicSetAux1(null, msgs);
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        return ((InternalEList<?>)getExpression2()).basicRemove(otherEnd, msgs);
      case JavaPackage.EXPRESSION_AUX__AUX2:
        return basicSetAux2(null, msgs);
      case JavaPackage.EXPRESSION_AUX__AUX3:
        return basicSetAux3(null, msgs);
      case JavaPackage.EXPRESSION_AUX__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case JavaPackage.EXPRESSION_AUX__AUX4:
        return basicSetAux4(null, msgs);
      case JavaPackage.EXPRESSION_AUX__AUX5:
        return basicSetAux5(null, msgs);
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
      case JavaPackage.EXPRESSION_AUX__AUX1:
        return getAux1();
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        return getExpression2();
      case JavaPackage.EXPRESSION_AUX__AUX2:
        return getAux2();
      case JavaPackage.EXPRESSION_AUX__AUX3:
        return getAux3();
      case JavaPackage.EXPRESSION_AUX__EXPRESSION:
        return getExpression();
      case JavaPackage.EXPRESSION_AUX__AUX4:
        return getAux4();
      case JavaPackage.EXPRESSION_AUX__NAME:
        return getName();
      case JavaPackage.EXPRESSION_AUX__AUX5:
        return getAux5();
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
      case JavaPackage.EXPRESSION_AUX__AUX1:
        setAux1((Expression_aux)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        getExpression2().clear();
        getExpression2().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__AUX2:
        setAux2((Expression_aux)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__AUX3:
        setAux3((Expression_aux)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__AUX4:
        setAux4((Expression_aux)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__AUX5:
        setAux5((Expression_aux)newValue);
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
      case JavaPackage.EXPRESSION_AUX__AUX1:
        setAux1((Expression_aux)null);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        getExpression2().clear();
        return;
      case JavaPackage.EXPRESSION_AUX__AUX2:
        setAux2((Expression_aux)null);
        return;
      case JavaPackage.EXPRESSION_AUX__AUX3:
        setAux3((Expression_aux)null);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION:
        getExpression().clear();
        return;
      case JavaPackage.EXPRESSION_AUX__AUX4:
        setAux4((Expression_aux)null);
        return;
      case JavaPackage.EXPRESSION_AUX__NAME:
        getName().clear();
        return;
      case JavaPackage.EXPRESSION_AUX__AUX5:
        setAux5((Expression_aux)null);
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
      case JavaPackage.EXPRESSION_AUX__AUX1:
        return aux1 != null;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION2:
        return expression2 != null && !expression2.isEmpty();
      case JavaPackage.EXPRESSION_AUX__AUX2:
        return aux2 != null;
      case JavaPackage.EXPRESSION_AUX__AUX3:
        return aux3 != null;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case JavaPackage.EXPRESSION_AUX__AUX4:
        return aux4 != null;
      case JavaPackage.EXPRESSION_AUX__NAME:
        return name != null && !name.isEmpty();
      case JavaPackage.EXPRESSION_AUX__AUX5:
        return aux5 != null;
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

} //Expression_auxImpl
