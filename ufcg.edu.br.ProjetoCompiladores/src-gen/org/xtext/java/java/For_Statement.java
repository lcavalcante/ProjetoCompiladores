/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.For_Statement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getPv <em>Pv</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getExpression3 <em>Expression3</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getFor_Statement()
 * @model
 * @generated
 */
public interface For_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable_declaration)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Variable()
   * @model containment="true"
   * @generated
   */
  Variable_declaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable_declaration value);

  /**
   * Returns the value of the '<em><b>Pv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pv</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pv</em>' attribute.
   * @see #setPv(String)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Pv()
   * @model
   * @generated
   */
  String getPv();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getPv <em>Pv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pv</em>' attribute.
   * @see #getPv()
   * @generated
   */
  void setPv(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

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
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Expression2()
   * @model containment="true"
   * @generated
   */
  Expression getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(Expression value);

  /**
   * Returns the value of the '<em><b>Expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression3</em>' containment reference.
   * @see #setExpression3(Expression)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Expression3()
   * @model containment="true"
   * @generated
   */
  Expression getExpression3();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getExpression3 <em>Expression3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression3</em>' containment reference.
   * @see #getExpression3()
   * @generated
   */
  void setExpression3(Expression value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // For_Statement
