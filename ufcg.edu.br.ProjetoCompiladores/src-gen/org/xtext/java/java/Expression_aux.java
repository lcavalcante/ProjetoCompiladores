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
 *   <li>{@link org.xtext.java.java.Expression_aux#getAux1 <em>Aux1</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getAux2 <em>Aux2</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getAux3 <em>Aux3</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getAux4 <em>Aux4</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression_aux#getAux5 <em>Aux5</em>}</li>
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
   * Returns the value of the '<em><b>Aux1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux1</em>' containment reference.
   * @see #setAux1(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Aux1()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux1();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAux1 <em>Aux1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux1</em>' containment reference.
   * @see #getAux1()
   * @generated
   */
  void setAux1(Expression_aux value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Expression2()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression2();

  /**
   * Returns the value of the '<em><b>Aux2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux2</em>' containment reference.
   * @see #setAux2(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Aux2()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux2();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAux2 <em>Aux2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux2</em>' containment reference.
   * @see #getAux2()
   * @generated
   */
  void setAux2(Expression_aux value);

  /**
   * Returns the value of the '<em><b>Aux3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux3</em>' containment reference.
   * @see #setAux3(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Aux3()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux3();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAux3 <em>Aux3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux3</em>' containment reference.
   * @see #getAux3()
   * @generated
   */
  void setAux3(Expression_aux value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

  /**
   * Returns the value of the '<em><b>Aux4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux4</em>' containment reference.
   * @see #setAux4(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Aux4()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux4();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAux4 <em>Aux4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux4</em>' containment reference.
   * @see #getAux4()
   * @generated
   */
  void setAux4(Expression_aux value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Aux5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux5</em>' containment reference.
   * @see #setAux5(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_aux_Aux5()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux5();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression_aux#getAux5 <em>Aux5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux5</em>' containment reference.
   * @see #getAux5()
   * @generated
   */
  void setAux5(Expression_aux value);

} // Expression_aux
