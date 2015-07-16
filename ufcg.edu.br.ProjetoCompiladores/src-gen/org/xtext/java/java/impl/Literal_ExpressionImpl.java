/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.java.java.Float_Literal;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Literal_Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Literal_ExpressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Literal_ExpressionImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Literal_ExpressionImpl#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Literal_ExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Literal_ExpressionImpl#getChar <em>Char</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Literal_ExpressionImpl extends Return_valueImpl implements Literal_Expression
{
  /**
   * The default value of the '{@link #getExp() <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected static final String EXP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected String exp = EXP_EDEFAULT;

  /**
   * The default value of the '{@link #getExp1() <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected static final int EXP1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected int exp1 = EXP1_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected Float_Literal exp2;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChar()
   * @generated
   * @ordered
   */
  protected static final String CHAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChar()
   * @generated
   * @ordered
   */
  protected String char_ = CHAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Literal_ExpressionImpl()
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
    return JavaPackage.Literals.LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(String newExp)
  {
    String oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.LITERAL_EXPRESSION__EXP, oldExp, exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp1(int newExp1)
  {
    int oldExp1 = exp1;
    exp1 = newExp1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.LITERAL_EXPRESSION__EXP1, oldExp1, exp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float_Literal getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp2(Float_Literal newExp2, NotificationChain msgs)
  {
    Float_Literal oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.LITERAL_EXPRESSION__EXP2, oldExp2, newExp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp2(Float_Literal newExp2)
  {
    if (newExp2 != exp2)
    {
      NotificationChain msgs = null;
      if (exp2 != null)
        msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.LITERAL_EXPRESSION__EXP2, null, msgs);
      if (newExp2 != null)
        msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.LITERAL_EXPRESSION__EXP2, null, msgs);
      msgs = basicSetExp2(newExp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.LITERAL_EXPRESSION__EXP2, newExp2, newExp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.LITERAL_EXPRESSION__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChar()
  {
    return char_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChar(String newChar)
  {
    String oldChar = char_;
    char_ = newChar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.LITERAL_EXPRESSION__CHAR, oldChar, char_));
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
      case JavaPackage.LITERAL_EXPRESSION__EXP2:
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
      case JavaPackage.LITERAL_EXPRESSION__EXP:
        return getExp();
      case JavaPackage.LITERAL_EXPRESSION__EXP1:
        return getExp1();
      case JavaPackage.LITERAL_EXPRESSION__EXP2:
        return getExp2();
      case JavaPackage.LITERAL_EXPRESSION__STRING:
        return getString();
      case JavaPackage.LITERAL_EXPRESSION__CHAR:
        return getChar();
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
      case JavaPackage.LITERAL_EXPRESSION__EXP:
        setExp((String)newValue);
        return;
      case JavaPackage.LITERAL_EXPRESSION__EXP1:
        setExp1((Integer)newValue);
        return;
      case JavaPackage.LITERAL_EXPRESSION__EXP2:
        setExp2((Float_Literal)newValue);
        return;
      case JavaPackage.LITERAL_EXPRESSION__STRING:
        setString((String)newValue);
        return;
      case JavaPackage.LITERAL_EXPRESSION__CHAR:
        setChar((String)newValue);
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
      case JavaPackage.LITERAL_EXPRESSION__EXP:
        setExp(EXP_EDEFAULT);
        return;
      case JavaPackage.LITERAL_EXPRESSION__EXP1:
        setExp1(EXP1_EDEFAULT);
        return;
      case JavaPackage.LITERAL_EXPRESSION__EXP2:
        setExp2((Float_Literal)null);
        return;
      case JavaPackage.LITERAL_EXPRESSION__STRING:
        setString(STRING_EDEFAULT);
        return;
      case JavaPackage.LITERAL_EXPRESSION__CHAR:
        setChar(CHAR_EDEFAULT);
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
      case JavaPackage.LITERAL_EXPRESSION__EXP:
        return EXP_EDEFAULT == null ? exp != null : !EXP_EDEFAULT.equals(exp);
      case JavaPackage.LITERAL_EXPRESSION__EXP1:
        return exp1 != EXP1_EDEFAULT;
      case JavaPackage.LITERAL_EXPRESSION__EXP2:
        return exp2 != null;
      case JavaPackage.LITERAL_EXPRESSION__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case JavaPackage.LITERAL_EXPRESSION__CHAR:
        return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
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
    result.append(" (exp: ");
    result.append(exp);
    result.append(", exp1: ");
    result.append(exp1);
    result.append(", string: ");
    result.append(string);
    result.append(", char: ");
    result.append(char_);
    result.append(')');
    return result.toString();
  }

} //Literal_ExpressionImpl
