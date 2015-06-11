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
 *   <li>{@link org.xtext.java.java.Expression_aux#getSinalNumeric <em>Sinal Numeric</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExp2 <em>Exp2</em>}</li>
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
   * Returns the value of the '<em><b>Sinal Numeric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sinal Numeric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sinal Numeric</em>' attribute.
   * @see #setSinalNumeric(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_SinalNumeric()
   * @model
   * @generated
   */
  String getSinalNumeric();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getSinalNumeric <em>Sinal Numeric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sinal Numeric</em>' attribute.
   * @see #getSinalNumeric()
   * @generated
   */
  void setSinalNumeric(String value);

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

} // Expression_aux
