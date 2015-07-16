/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Bit_Expression_NR;
import org.xtext.java.java.Cast_Expression;
import org.xtext.java.java.Creating_Expression;
import org.xtext.java.java.Expression;
import org.xtext.java.java.Expression_aux;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Literal_Expression;
import org.xtext.java.java.Logical_Expression_NR;
import org.xtext.java.java.Numeric_Expression_NR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getNumericExpression3 <em>Numeric Expression3</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getLogicalExpression <em>Logical Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getBitExpression <em>Bit Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getCastExpression <em>Cast Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getCreatingExpression <em>Creating Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getLiteralExpression <em>Literal Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getThis <em>This</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.ExpressionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getNumericExpression3() <em>Numeric Expression3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericExpression3()
   * @generated
   * @ordered
   */
  protected Numeric_Expression_NR numericExpression3;

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
   * The cached value of the '{@link #getLogicalExpression() <em>Logical Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalExpression()
   * @generated
   * @ordered
   */
  protected Logical_Expression_NR logicalExpression;

  /**
   * The cached value of the '{@link #getBitExpression() <em>Bit Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitExpression()
   * @generated
   * @ordered
   */
  protected Bit_Expression_NR bitExpression;

  /**
   * The cached value of the '{@link #getCastExpression() <em>Cast Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastExpression()
   * @generated
   * @ordered
   */
  protected Cast_Expression castExpression;

  /**
   * The cached value of the '{@link #getCreatingExpression() <em>Creating Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatingExpression()
   * @generated
   * @ordered
   */
  protected Creating_Expression creatingExpression;

  /**
   * The cached value of the '{@link #getLiteralExpression() <em>Literal Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralExpression()
   * @generated
   * @ordered
   */
  protected Literal_Expression literalExpression;

  /**
   * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected static final String NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected String null_ = NULL_EDEFAULT;

  /**
   * The default value of the '{@link #getSuper() <em>Super</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected static final String SUPER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuper() <em>Super</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected String super_ = SUPER_EDEFAULT;

  /**
   * The default value of the '{@link #getThis() <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected static final String THIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThis() <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected String this_ = THIS_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return JavaPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeric_Expression_NR getNumericExpression3()
  {
    return numericExpression3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumericExpression3(Numeric_Expression_NR newNumericExpression3, NotificationChain msgs)
  {
    Numeric_Expression_NR oldNumericExpression3 = numericExpression3;
    numericExpression3 = newNumericExpression3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3, oldNumericExpression3, newNumericExpression3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumericExpression3(Numeric_Expression_NR newNumericExpression3)
  {
    if (newNumericExpression3 != numericExpression3)
    {
      NotificationChain msgs = null;
      if (numericExpression3 != null)
        msgs = ((InternalEObject)numericExpression3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3, null, msgs);
      if (newNumericExpression3 != null)
        msgs = ((InternalEObject)newNumericExpression3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3, null, msgs);
      msgs = basicSetNumericExpression3(newNumericExpression3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3, newNumericExpression3, newNumericExpression3));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__AUX, oldAux, newAux);
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
        msgs = ((InternalEObject)aux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__AUX, null, msgs);
      if (newAux != null)
        msgs = ((InternalEObject)newAux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__AUX, null, msgs);
      msgs = basicSetAux(newAux, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__AUX, newAux, newAux));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical_Expression_NR getLogicalExpression()
  {
    return logicalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogicalExpression(Logical_Expression_NR newLogicalExpression, NotificationChain msgs)
  {
    Logical_Expression_NR oldLogicalExpression = logicalExpression;
    logicalExpression = newLogicalExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__LOGICAL_EXPRESSION, oldLogicalExpression, newLogicalExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogicalExpression(Logical_Expression_NR newLogicalExpression)
  {
    if (newLogicalExpression != logicalExpression)
    {
      NotificationChain msgs = null;
      if (logicalExpression != null)
        msgs = ((InternalEObject)logicalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__LOGICAL_EXPRESSION, null, msgs);
      if (newLogicalExpression != null)
        msgs = ((InternalEObject)newLogicalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__LOGICAL_EXPRESSION, null, msgs);
      msgs = basicSetLogicalExpression(newLogicalExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__LOGICAL_EXPRESSION, newLogicalExpression, newLogicalExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bit_Expression_NR getBitExpression()
  {
    return bitExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBitExpression(Bit_Expression_NR newBitExpression, NotificationChain msgs)
  {
    Bit_Expression_NR oldBitExpression = bitExpression;
    bitExpression = newBitExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__BIT_EXPRESSION, oldBitExpression, newBitExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBitExpression(Bit_Expression_NR newBitExpression)
  {
    if (newBitExpression != bitExpression)
    {
      NotificationChain msgs = null;
      if (bitExpression != null)
        msgs = ((InternalEObject)bitExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__BIT_EXPRESSION, null, msgs);
      if (newBitExpression != null)
        msgs = ((InternalEObject)newBitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__BIT_EXPRESSION, null, msgs);
      msgs = basicSetBitExpression(newBitExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__BIT_EXPRESSION, newBitExpression, newBitExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast_Expression getCastExpression()
  {
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastExpression(Cast_Expression newCastExpression, NotificationChain msgs)
  {
    Cast_Expression oldCastExpression = castExpression;
    castExpression = newCastExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__CAST_EXPRESSION, oldCastExpression, newCastExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastExpression(Cast_Expression newCastExpression)
  {
    if (newCastExpression != castExpression)
    {
      NotificationChain msgs = null;
      if (castExpression != null)
        msgs = ((InternalEObject)castExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__CAST_EXPRESSION, null, msgs);
      if (newCastExpression != null)
        msgs = ((InternalEObject)newCastExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__CAST_EXPRESSION, null, msgs);
      msgs = basicSetCastExpression(newCastExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__CAST_EXPRESSION, newCastExpression, newCastExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creating_Expression getCreatingExpression()
  {
    return creatingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreatingExpression(Creating_Expression newCreatingExpression, NotificationChain msgs)
  {
    Creating_Expression oldCreatingExpression = creatingExpression;
    creatingExpression = newCreatingExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__CREATING_EXPRESSION, oldCreatingExpression, newCreatingExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreatingExpression(Creating_Expression newCreatingExpression)
  {
    if (newCreatingExpression != creatingExpression)
    {
      NotificationChain msgs = null;
      if (creatingExpression != null)
        msgs = ((InternalEObject)creatingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__CREATING_EXPRESSION, null, msgs);
      if (newCreatingExpression != null)
        msgs = ((InternalEObject)newCreatingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__CREATING_EXPRESSION, null, msgs);
      msgs = basicSetCreatingExpression(newCreatingExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__CREATING_EXPRESSION, newCreatingExpression, newCreatingExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal_Expression getLiteralExpression()
  {
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralExpression(Literal_Expression newLiteralExpression, NotificationChain msgs)
  {
    Literal_Expression oldLiteralExpression = literalExpression;
    literalExpression = newLiteralExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__LITERAL_EXPRESSION, oldLiteralExpression, newLiteralExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralExpression(Literal_Expression newLiteralExpression)
  {
    if (newLiteralExpression != literalExpression)
    {
      NotificationChain msgs = null;
      if (literalExpression != null)
        msgs = ((InternalEObject)literalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__LITERAL_EXPRESSION, null, msgs);
      if (newLiteralExpression != null)
        msgs = ((InternalEObject)newLiteralExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPRESSION__LITERAL_EXPRESSION, null, msgs);
      msgs = basicSetLiteralExpression(newLiteralExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__LITERAL_EXPRESSION, newLiteralExpression, newLiteralExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(String newNull)
  {
    String oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__NULL, oldNull, null_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuper()
  {
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(String newSuper)
  {
    String oldSuper = super_;
    super_ = newSuper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__SUPER, oldSuper, super_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThis()
  {
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThis(String newThis)
  {
    String oldThis = this_;
    this_ = newThis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__THIS, oldThis, this_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPRESSION__NAME, oldName, name));
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
      case JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3:
        return basicSetNumericExpression3(null, msgs);
      case JavaPackage.EXPRESSION__AUX:
        return basicSetAux(null, msgs);
      case JavaPackage.EXPRESSION__LOGICAL_EXPRESSION:
        return basicSetLogicalExpression(null, msgs);
      case JavaPackage.EXPRESSION__BIT_EXPRESSION:
        return basicSetBitExpression(null, msgs);
      case JavaPackage.EXPRESSION__CAST_EXPRESSION:
        return basicSetCastExpression(null, msgs);
      case JavaPackage.EXPRESSION__CREATING_EXPRESSION:
        return basicSetCreatingExpression(null, msgs);
      case JavaPackage.EXPRESSION__LITERAL_EXPRESSION:
        return basicSetLiteralExpression(null, msgs);
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
      case JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3:
        return getNumericExpression3();
      case JavaPackage.EXPRESSION__AUX:
        return getAux();
      case JavaPackage.EXPRESSION__LOGICAL_EXPRESSION:
        return getLogicalExpression();
      case JavaPackage.EXPRESSION__BIT_EXPRESSION:
        return getBitExpression();
      case JavaPackage.EXPRESSION__CAST_EXPRESSION:
        return getCastExpression();
      case JavaPackage.EXPRESSION__CREATING_EXPRESSION:
        return getCreatingExpression();
      case JavaPackage.EXPRESSION__LITERAL_EXPRESSION:
        return getLiteralExpression();
      case JavaPackage.EXPRESSION__NULL:
        return getNull();
      case JavaPackage.EXPRESSION__SUPER:
        return getSuper();
      case JavaPackage.EXPRESSION__THIS:
        return getThis();
      case JavaPackage.EXPRESSION__NAME:
        return getName();
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
      case JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3:
        setNumericExpression3((Numeric_Expression_NR)newValue);
        return;
      case JavaPackage.EXPRESSION__AUX:
        setAux((Expression_aux)newValue);
        return;
      case JavaPackage.EXPRESSION__LOGICAL_EXPRESSION:
        setLogicalExpression((Logical_Expression_NR)newValue);
        return;
      case JavaPackage.EXPRESSION__BIT_EXPRESSION:
        setBitExpression((Bit_Expression_NR)newValue);
        return;
      case JavaPackage.EXPRESSION__CAST_EXPRESSION:
        setCastExpression((Cast_Expression)newValue);
        return;
      case JavaPackage.EXPRESSION__CREATING_EXPRESSION:
        setCreatingExpression((Creating_Expression)newValue);
        return;
      case JavaPackage.EXPRESSION__LITERAL_EXPRESSION:
        setLiteralExpression((Literal_Expression)newValue);
        return;
      case JavaPackage.EXPRESSION__NULL:
        setNull((String)newValue);
        return;
      case JavaPackage.EXPRESSION__SUPER:
        setSuper((String)newValue);
        return;
      case JavaPackage.EXPRESSION__THIS:
        setThis((String)newValue);
        return;
      case JavaPackage.EXPRESSION__NAME:
        setName((String)newValue);
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
      case JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3:
        setNumericExpression3((Numeric_Expression_NR)null);
        return;
      case JavaPackage.EXPRESSION__AUX:
        setAux((Expression_aux)null);
        return;
      case JavaPackage.EXPRESSION__LOGICAL_EXPRESSION:
        setLogicalExpression((Logical_Expression_NR)null);
        return;
      case JavaPackage.EXPRESSION__BIT_EXPRESSION:
        setBitExpression((Bit_Expression_NR)null);
        return;
      case JavaPackage.EXPRESSION__CAST_EXPRESSION:
        setCastExpression((Cast_Expression)null);
        return;
      case JavaPackage.EXPRESSION__CREATING_EXPRESSION:
        setCreatingExpression((Creating_Expression)null);
        return;
      case JavaPackage.EXPRESSION__LITERAL_EXPRESSION:
        setLiteralExpression((Literal_Expression)null);
        return;
      case JavaPackage.EXPRESSION__NULL:
        setNull(NULL_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION__SUPER:
        setSuper(SUPER_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION__THIS:
        setThis(THIS_EDEFAULT);
        return;
      case JavaPackage.EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
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
      case JavaPackage.EXPRESSION__NUMERIC_EXPRESSION3:
        return numericExpression3 != null;
      case JavaPackage.EXPRESSION__AUX:
        return aux != null;
      case JavaPackage.EXPRESSION__LOGICAL_EXPRESSION:
        return logicalExpression != null;
      case JavaPackage.EXPRESSION__BIT_EXPRESSION:
        return bitExpression != null;
      case JavaPackage.EXPRESSION__CAST_EXPRESSION:
        return castExpression != null;
      case JavaPackage.EXPRESSION__CREATING_EXPRESSION:
        return creatingExpression != null;
      case JavaPackage.EXPRESSION__LITERAL_EXPRESSION:
        return literalExpression != null;
      case JavaPackage.EXPRESSION__NULL:
        return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
      case JavaPackage.EXPRESSION__SUPER:
        return SUPER_EDEFAULT == null ? super_ != null : !SUPER_EDEFAULT.equals(super_);
      case JavaPackage.EXPRESSION__THIS:
        return THIS_EDEFAULT == null ? this_ != null : !THIS_EDEFAULT.equals(this_);
      case JavaPackage.EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (null: ");
    result.append(null_);
    result.append(", super: ");
    result.append(super_);
    result.append(", this: ");
    result.append(this_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
