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

import org.xtext.java.java.Ampersand_Rule;
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
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getArgList <em>Arg List</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getSgin <em>Sgin</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getNumericSign <em>Numeric Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getTestingSign <em>Testing Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getLogicalSign <em>Logical Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getAmpersand <em>Ampersand</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getStringSign <em>String Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getBitSign <em>Bit Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Expression_auxImpl#getExpressionBit <em>Expression Bit</em>}</li>
 * </ul>
 * </p>
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
   * The default value of the '{@link #getNumericSign() <em>Numeric Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericSign()
   * @generated
   * @ordered
   */
  protected static final String NUMERIC_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumericSign() <em>Numeric Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericSign()
   * @generated
   * @ordered
   */
  protected String numericSign = NUMERIC_SIGN_EDEFAULT;

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
   * The default value of the '{@link #getTestingSign() <em>Testing Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestingSign()
   * @generated
   * @ordered
   */
  protected static final String TESTING_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTestingSign() <em>Testing Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestingSign()
   * @generated
   * @ordered
   */
  protected String testingSign = TESTING_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected Expression exp1;

  /**
   * The default value of the '{@link #getLogicalSign() <em>Logical Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalSign()
   * @generated
   * @ordered
   */
  protected static final String LOGICAL_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLogicalSign() <em>Logical Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalSign()
   * @generated
   * @ordered
   */
  protected String logicalSign = LOGICAL_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getAmpersand() <em>Ampersand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmpersand()
   * @generated
   * @ordered
   */
  protected Ampersand_Rule ampersand;

  /**
   * The default value of the '{@link #getStringSign() <em>String Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringSign()
   * @generated
   * @ordered
   */
  protected static final String STRING_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringSign() <em>String Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringSign()
   * @generated
   * @ordered
   */
  protected String stringSign = STRING_SIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getBitSign() <em>Bit Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitSign()
   * @generated
   * @ordered
   */
  protected static final String BIT_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBitSign() <em>Bit Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitSign()
   * @generated
   * @ordered
   */
  protected String bitSign = BIT_SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressionBit() <em>Expression Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionBit()
   * @generated
   * @ordered
   */
  protected Expression expressionBit;

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
  public String getNumericSign()
  {
    return numericSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumericSign(String newNumericSign)
  {
    String oldNumericSign = numericSign;
    numericSign = newNumericSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__NUMERIC_SIGN, oldNumericSign, numericSign));
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
  public String getTestingSign()
  {
    return testingSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestingSign(String newTestingSign)
  {
    String oldTestingSign = testingSign;
    testingSign = newTestingSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__TESTING_SIGN, oldTestingSign, testingSign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp1(Expression newExp1, NotificationChain msgs)
  {
    Expression oldExp1 = exp1;
    exp1 = newExp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXP1, oldExp1, newExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp1(Expression newExp1)
  {
    if (newExp1 != exp1)
    {
      NotificationChain msgs = null;
      if (exp1 != null)
        msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXP1, null, msgs);
      if (newExp1 != null)
        msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXP1, null, msgs);
      msgs = basicSetExp1(newExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXP1, newExp1, newExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLogicalSign()
  {
    return logicalSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogicalSign(String newLogicalSign)
  {
    String oldLogicalSign = logicalSign;
    logicalSign = newLogicalSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__LOGICAL_SIGN, oldLogicalSign, logicalSign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ampersand_Rule getAmpersand()
  {
    return ampersand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAmpersand(Ampersand_Rule newAmpersand, NotificationChain msgs)
  {
    Ampersand_Rule oldAmpersand = ampersand;
    ampersand = newAmpersand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AMPERSAND, oldAmpersand, newAmpersand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmpersand(Ampersand_Rule newAmpersand)
  {
    if (newAmpersand != ampersand)
    {
      NotificationChain msgs = null;
      if (ampersand != null)
        msgs = ((InternalEObject)ampersand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AMPERSAND, null, msgs);
      if (newAmpersand != null)
        msgs = ((InternalEObject)newAmpersand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__AMPERSAND, null, msgs);
      msgs = basicSetAmpersand(newAmpersand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__AMPERSAND, newAmpersand, newAmpersand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringSign()
  {
    return stringSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringSign(String newStringSign)
  {
    String oldStringSign = stringSign;
    stringSign = newStringSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__STRING_SIGN, oldStringSign, stringSign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBitSign()
  {
    return bitSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBitSign(String newBitSign)
  {
    String oldBitSign = bitSign;
    bitSign = newBitSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__BIT_SIGN, oldBitSign, bitSign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpressionBit()
  {
    return expressionBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionBit(Expression newExpressionBit, NotificationChain msgs)
  {
    Expression oldExpressionBit = expressionBit;
    expressionBit = newExpressionBit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT, oldExpressionBit, newExpressionBit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionBit(Expression newExpressionBit)
  {
    if (newExpressionBit != expressionBit)
    {
      NotificationChain msgs = null;
      if (expressionBit != null)
        msgs = ((InternalEObject)expressionBit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT, null, msgs);
      if (newExpressionBit != null)
        msgs = ((InternalEObject)newExpressionBit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT, null, msgs);
      msgs = basicSetExpressionBit(newExpressionBit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT, newExpressionBit, newExpressionBit));
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
      case JavaPackage.EXPRESSION_AUX__EXP1:
        return basicSetExp1(null, msgs);
      case JavaPackage.EXPRESSION_AUX__AMPERSAND:
        return basicSetAmpersand(null, msgs);
      case JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT:
        return basicSetExpressionBit(null, msgs);
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
      case JavaPackage.EXPRESSION_AUX__NUMERIC_SIGN:
        return getNumericSign();
      case JavaPackage.EXPRESSION_AUX__EXP2:
        return getExp2();
      case JavaPackage.EXPRESSION_AUX__TESTING_SIGN:
        return getTestingSign();
      case JavaPackage.EXPRESSION_AUX__EXP1:
        return getExp1();
      case JavaPackage.EXPRESSION_AUX__LOGICAL_SIGN:
        return getLogicalSign();
      case JavaPackage.EXPRESSION_AUX__AMPERSAND:
        return getAmpersand();
      case JavaPackage.EXPRESSION_AUX__STRING_SIGN:
        return getStringSign();
      case JavaPackage.EXPRESSION_AUX__BIT_SIGN:
        return getBitSign();
      case JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT:
        return getExpressionBit();
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
      case JavaPackage.EXPRESSION_AUX__NUMERIC_SIGN:
        setNumericSign((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXP2:
        setExp2((Expression)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__TESTING_SIGN:
        setTestingSign((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXP1:
        setExp1((Expression)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__LOGICAL_SIGN:
        setLogicalSign((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__AMPERSAND:
        setAmpersand((Ampersand_Rule)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__STRING_SIGN:
        setStringSign((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__BIT_SIGN:
        setBitSign((String)newValue);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT:
        setExpressionBit((Expression)newValue);
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
      case JavaPackage.EXPRESSION_AUX__NUMERIC_SIGN:
        setNumericSign(NUMERIC_SIGN_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__EXP2:
        setExp2((Expression)null);
        return;
      case JavaPackage.EXPRESSION_AUX__TESTING_SIGN:
        setTestingSign(TESTING_SIGN_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__EXP1:
        setExp1((Expression)null);
        return;
      case JavaPackage.EXPRESSION_AUX__LOGICAL_SIGN:
        setLogicalSign(LOGICAL_SIGN_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__AMPERSAND:
        setAmpersand((Ampersand_Rule)null);
        return;
      case JavaPackage.EXPRESSION_AUX__STRING_SIGN:
        setStringSign(STRING_SIGN_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__BIT_SIGN:
        setBitSign(BIT_SIGN_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT:
        setExpressionBit((Expression)null);
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
      case JavaPackage.EXPRESSION_AUX__NUMERIC_SIGN:
        return NUMERIC_SIGN_EDEFAULT == null ? numericSign != null : !NUMERIC_SIGN_EDEFAULT.equals(numericSign);
      case JavaPackage.EXPRESSION_AUX__EXP2:
        return exp2 != null;
      case JavaPackage.EXPRESSION_AUX__TESTING_SIGN:
        return TESTING_SIGN_EDEFAULT == null ? testingSign != null : !TESTING_SIGN_EDEFAULT.equals(testingSign);
      case JavaPackage.EXPRESSION_AUX__EXP1:
        return exp1 != null;
      case JavaPackage.EXPRESSION_AUX__LOGICAL_SIGN:
        return LOGICAL_SIGN_EDEFAULT == null ? logicalSign != null : !LOGICAL_SIGN_EDEFAULT.equals(logicalSign);
      case JavaPackage.EXPRESSION_AUX__AMPERSAND:
        return ampersand != null;
      case JavaPackage.EXPRESSION_AUX__STRING_SIGN:
        return STRING_SIGN_EDEFAULT == null ? stringSign != null : !STRING_SIGN_EDEFAULT.equals(stringSign);
      case JavaPackage.EXPRESSION_AUX__BIT_SIGN:
        return BIT_SIGN_EDEFAULT == null ? bitSign != null : !BIT_SIGN_EDEFAULT.equals(bitSign);
      case JavaPackage.EXPRESSION_AUX__EXPRESSION_BIT:
        return expressionBit != null;
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
    result.append(", numericSign: ");
    result.append(numericSign);
    result.append(", testingSign: ");
    result.append(testingSign);
    result.append(", logicalSign: ");
    result.append(logicalSign);
    result.append(", stringSign: ");
    result.append(stringSign);
    result.append(", bitSign: ");
    result.append(bitSign);
    result.append(')');
    return result.toString();
  }

} //Expression_auxImpl
