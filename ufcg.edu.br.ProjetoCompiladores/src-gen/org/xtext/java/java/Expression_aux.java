/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression aux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Expression_aux#getArgList <em>Arg List</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getAux <em>Aux</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getSgin <em>Sgin</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getNumericSign <em>Numeric Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getTestingSign <em>Testing Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getLogicalSign <em>Logical Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getAmpersand <em>Ampersand</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getStringSign <em>String Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getBitSign <em>Bit Sign</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExpressionBit <em>Expression Bit</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getExpression_aux()
 * @model
 * @generated
 */
public interface Expression_aux extends EObject
{
  /**
   * Returns the value of the '<em><b>Arg List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Arg_List}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg List</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_ArgList()
   * @model containment="true"
   * @generated
   */
  EList<Arg_List> getArgList();

  /**
   * Returns the value of the '<em><b>Aux</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux</em>' containment reference.
   * @see #setAux(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Aux()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAux <em>Aux</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux</em>' containment reference.
   * @see #getAux()
   * @generated
   */
  void setAux(Expression_aux value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference.
   * @see #setExpression2(Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Expression2()
   * @model containment="true"
   * @generated
   */
  Expression getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(Expression value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sgin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sgin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sgin</em>' attribute.
   * @see #setSgin(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Sgin()
   * @model
   * @generated
   */
  String getSgin();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getSgin <em>Sgin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sgin</em>' attribute.
   * @see #getSgin()
   * @generated
   */
  void setSgin(String value);

  /**
   * Returns the value of the '<em><b>Numeric Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric Sign</em>' attribute.
   * @see #setNumericSign(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_NumericSign()
   * @model
   * @generated
   */
  String getNumericSign();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getNumericSign <em>Numeric Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeric Sign</em>' attribute.
   * @see #getNumericSign()
   * @generated
   */
  void setNumericSign(String value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference.
   * @see #setExp2(Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Exp2()
   * @model containment="true"
   * @generated
   */
  Expression getExp2();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getExp2 <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' containment reference.
   * @see #getExp2()
   * @generated
   */
  void setExp2(Expression value);

  /**
   * Returns the value of the '<em><b>Testing Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testing Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testing Sign</em>' attribute.
   * @see #setTestingSign(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_TestingSign()
   * @model
   * @generated
   */
  String getTestingSign();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getTestingSign <em>Testing Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testing Sign</em>' attribute.
   * @see #getTestingSign()
   * @generated
   */
  void setTestingSign(String value);

  /**
   * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' containment reference.
   * @see #setExp1(Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Exp1()
   * @model containment="true"
   * @generated
   */
  Expression getExp1();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getExp1 <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' containment reference.
   * @see #getExp1()
   * @generated
   */
  void setExp1(Expression value);

  /**
   * Returns the value of the '<em><b>Logical Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Sign</em>' attribute.
   * @see #setLogicalSign(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_LogicalSign()
   * @model
   * @generated
   */
  String getLogicalSign();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getLogicalSign <em>Logical Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical Sign</em>' attribute.
   * @see #getLogicalSign()
   * @generated
   */
  void setLogicalSign(String value);

  /**
   * Returns the value of the '<em><b>Ampersand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ampersand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ampersand</em>' containment reference.
   * @see #setAmpersand(Ampersand_Rule)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Ampersand()
   * @model containment="true"
   * @generated
   */
  Ampersand_Rule getAmpersand();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAmpersand <em>Ampersand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ampersand</em>' containment reference.
   * @see #getAmpersand()
   * @generated
   */
  void setAmpersand(Ampersand_Rule value);

  /**
   * Returns the value of the '<em><b>String Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Sign</em>' attribute.
   * @see #setStringSign(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_StringSign()
   * @model
   * @generated
   */
  String getStringSign();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getStringSign <em>String Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Sign</em>' attribute.
   * @see #getStringSign()
   * @generated
   */
  void setStringSign(String value);

  /**
   * Returns the value of the '<em><b>Bit Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Sign</em>' attribute.
   * @see #setBitSign(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_BitSign()
   * @model
   * @generated
   */
  String getBitSign();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getBitSign <em>Bit Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Sign</em>' attribute.
   * @see #getBitSign()
   * @generated
   */
  void setBitSign(String value);

  /**
   * Returns the value of the '<em><b>Expression Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Bit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Bit</em>' containment reference.
   * @see #setExpressionBit(Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_ExpressionBit()
   * @model containment="true"
   * @generated
   */
  Expression getExpressionBit();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getExpressionBit <em>Expression Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Bit</em>' containment reference.
   * @see #getExpressionBit()
   * @generated
   */
  void setExpressionBit(Expression value);

} // Expression_aux
