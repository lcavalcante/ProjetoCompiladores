/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Float_Literal;
import org.xtext.java.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Float_LiteralImpl#getDecimalDigits1 <em>Decimal Digits1</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Float_LiteralImpl#getDecimalDigits2 <em>Decimal Digits2</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Float_LiteralImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Float_LiteralImpl#getFloatTypeSufix <em>Float Type Sufix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Float_LiteralImpl extends MinimalEObjectImpl.Container implements Float_Literal
{
  /**
   * The default value of the '{@link #getDecimalDigits1() <em>Decimal Digits1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalDigits1()
   * @generated
   * @ordered
   */
  protected static final int DECIMAL_DIGITS1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDecimalDigits1() <em>Decimal Digits1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalDigits1()
   * @generated
   * @ordered
   */
  protected int decimalDigits1 = DECIMAL_DIGITS1_EDEFAULT;

  /**
   * The default value of the '{@link #getDecimalDigits2() <em>Decimal Digits2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalDigits2()
   * @generated
   * @ordered
   */
  protected static final int DECIMAL_DIGITS2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDecimalDigits2() <em>Decimal Digits2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalDigits2()
   * @generated
   * @ordered
   */
  protected int decimalDigits2 = DECIMAL_DIGITS2_EDEFAULT;

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
   * The default value of the '{@link #getFloatTypeSufix() <em>Float Type Sufix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatTypeSufix()
   * @generated
   * @ordered
   */
  protected static final String FLOAT_TYPE_SUFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloatTypeSufix() <em>Float Type Sufix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatTypeSufix()
   * @generated
   * @ordered
   */
  protected String floatTypeSufix = FLOAT_TYPE_SUFIX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Float_LiteralImpl()
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
    return JavaPackage.Literals.FLOAT_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDecimalDigits1()
  {
    return decimalDigits1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimalDigits1(int newDecimalDigits1)
  {
    int oldDecimalDigits1 = decimalDigits1;
    decimalDigits1 = newDecimalDigits1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS1, oldDecimalDigits1, decimalDigits1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDecimalDigits2()
  {
    return decimalDigits2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimalDigits2(int newDecimalDigits2)
  {
    int oldDecimalDigits2 = decimalDigits2;
    decimalDigits2 = newDecimalDigits2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS2, oldDecimalDigits2, decimalDigits2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FLOAT_LITERAL__EXP, oldExp, exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFloatTypeSufix()
  {
    return floatTypeSufix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloatTypeSufix(String newFloatTypeSufix)
  {
    String oldFloatTypeSufix = floatTypeSufix;
    floatTypeSufix = newFloatTypeSufix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FLOAT_LITERAL__FLOAT_TYPE_SUFIX, oldFloatTypeSufix, floatTypeSufix));
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
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS1:
        return getDecimalDigits1();
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS2:
        return getDecimalDigits2();
      case JavaPackage.FLOAT_LITERAL__EXP:
        return getExp();
      case JavaPackage.FLOAT_LITERAL__FLOAT_TYPE_SUFIX:
        return getFloatTypeSufix();
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
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS1:
        setDecimalDigits1((Integer)newValue);
        return;
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS2:
        setDecimalDigits2((Integer)newValue);
        return;
      case JavaPackage.FLOAT_LITERAL__EXP:
        setExp((String)newValue);
        return;
      case JavaPackage.FLOAT_LITERAL__FLOAT_TYPE_SUFIX:
        setFloatTypeSufix((String)newValue);
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
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS1:
        setDecimalDigits1(DECIMAL_DIGITS1_EDEFAULT);
        return;
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS2:
        setDecimalDigits2(DECIMAL_DIGITS2_EDEFAULT);
        return;
      case JavaPackage.FLOAT_LITERAL__EXP:
        setExp(EXP_EDEFAULT);
        return;
      case JavaPackage.FLOAT_LITERAL__FLOAT_TYPE_SUFIX:
        setFloatTypeSufix(FLOAT_TYPE_SUFIX_EDEFAULT);
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
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS1:
        return decimalDigits1 != DECIMAL_DIGITS1_EDEFAULT;
      case JavaPackage.FLOAT_LITERAL__DECIMAL_DIGITS2:
        return decimalDigits2 != DECIMAL_DIGITS2_EDEFAULT;
      case JavaPackage.FLOAT_LITERAL__EXP:
        return EXP_EDEFAULT == null ? exp != null : !EXP_EDEFAULT.equals(exp);
      case JavaPackage.FLOAT_LITERAL__FLOAT_TYPE_SUFIX:
        return FLOAT_TYPE_SUFIX_EDEFAULT == null ? floatTypeSufix != null : !FLOAT_TYPE_SUFIX_EDEFAULT.equals(floatTypeSufix);
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
    result.append(" (decimalDigits1: ");
    result.append(decimalDigits1);
    result.append(", decimalDigits2: ");
    result.append(decimalDigits2);
    result.append(", exp: ");
    result.append(exp);
    result.append(", floatTypeSufix: ");
    result.append(floatTypeSufix);
    result.append(')');
    return result.toString();
  }

} //Float_LiteralImpl
