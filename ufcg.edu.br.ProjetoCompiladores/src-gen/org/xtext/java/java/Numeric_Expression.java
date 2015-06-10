/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Numeric_Expression#getSinal <em>Sinal</em>}</li>
 *   <li>{@link org.xtext.java.java.Numeric_Expression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getNumeric_Expression()
 * @model
 * @generated
 */
public interface Numeric_Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Sinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sinal</em>' attribute.
   * @see #setSinal(String)
   * @see org.xtext.java.java.JavaPackage#getNumeric_Expression_Sinal()
   * @model
   * @generated
   */
  String getSinal();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Numeric_Expression#getSinal <em>Sinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sinal</em>' attribute.
   * @see #getSinal()
   * @generated
   */
  void setSinal(String value);

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
   * @see org.xtext.java.java.JavaPackage#getNumeric_Expression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Numeric_Expression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Numeric_Expression
