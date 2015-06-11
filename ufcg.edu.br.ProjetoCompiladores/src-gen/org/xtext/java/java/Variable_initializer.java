/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Variable_initializer#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Variable_initializer#getVariableInitializer1 <em>Variable Initializer1</em>}</li>
 *   <li>{@link org.xtext.java.java.Variable_initializer#getVariableIniatializer2 <em>Variable Iniatializer2</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getVariable_initializer()
 * @model
 * @generated
 */
public interface Variable_initializer extends EObject
{
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
   * @see org.xtext.java.java.JavaPackage#getVariable_initializer_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Variable_initializer#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Variable Initializer1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Initializer1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Initializer1</em>' containment reference.
   * @see #setVariableInitializer1(Variable_initializer)
   * @see org.xtext.java.java.JavaPackage#getVariable_initializer_VariableInitializer1()
   * @model containment="true"
   * @generated
   */
  Variable_initializer getVariableInitializer1();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Variable_initializer#getVariableInitializer1 <em>Variable Initializer1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Initializer1</em>' containment reference.
   * @see #getVariableInitializer1()
   * @generated
   */
  void setVariableInitializer1(Variable_initializer value);

  /**
   * Returns the value of the '<em><b>Variable Iniatializer2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Variable_initializer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Iniatializer2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Iniatializer2</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getVariable_initializer_VariableIniatializer2()
   * @model containment="true"
   * @generated
   */
  EList<Variable_initializer> getVariableIniatializer2();

} // Variable_initializer
