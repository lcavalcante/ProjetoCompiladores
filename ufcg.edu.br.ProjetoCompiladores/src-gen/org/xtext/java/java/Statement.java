/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Statement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getExpressionx <em>Expressionx</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getWhileStatement <em>While Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getForStatement <em>For Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getSwitchStatement <em>Switch Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getTry <em>Try</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
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
   * @see org.xtext.java.java.JavaPackage#getStatement_Variable()
   * @model containment="true"
   * @generated
   */
  Variable_declaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable_declaration value);

  /**
   * Returns the value of the '<em><b>Expressionx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionx</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionx</em>' containment reference.
   * @see #setExpressionx(Expression)
   * @see org.xtext.java.java.JavaPackage#getStatement_Expressionx()
   * @model containment="true"
   * @generated
   */
  Expression getExpressionx();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getExpressionx <em>Expressionx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionx</em>' containment reference.
   * @see #getExpressionx()
   * @generated
   */
  void setExpressionx(Expression value);

  /**
   * Returns the value of the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Statement</em>' containment reference.
   * @see #setIfStatement(If_Statement)
   * @see org.xtext.java.java.JavaPackage#getStatement_IfStatement()
   * @model containment="true"
   * @generated
   */
  If_Statement getIfStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getIfStatement <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Statement</em>' containment reference.
   * @see #getIfStatement()
   * @generated
   */
  void setIfStatement(If_Statement value);

  /**
   * Returns the value of the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Statement</em>' containment reference.
   * @see #setDoStatement(Do_Statement)
   * @see org.xtext.java.java.JavaPackage#getStatement_DoStatement()
   * @model containment="true"
   * @generated
   */
  Do_Statement getDoStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getDoStatement <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Statement</em>' containment reference.
   * @see #getDoStatement()
   * @generated
   */
  void setDoStatement(Do_Statement value);

  /**
   * Returns the value of the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Statement</em>' containment reference.
   * @see #setWhileStatement(While_Statement)
   * @see org.xtext.java.java.JavaPackage#getStatement_WhileStatement()
   * @model containment="true"
   * @generated
   */
  While_Statement getWhileStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getWhileStatement <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Statement</em>' containment reference.
   * @see #getWhileStatement()
   * @generated
   */
  void setWhileStatement(While_Statement value);

  /**
   * Returns the value of the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Statement</em>' containment reference.
   * @see #setForStatement(For_Statement)
   * @see org.xtext.java.java.JavaPackage#getStatement_ForStatement()
   * @model containment="true"
   * @generated
   */
  For_Statement getForStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getForStatement <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Statement</em>' containment reference.
   * @see #getForStatement()
   * @generated
   */
  void setForStatement(For_Statement value);

  /**
   * Returns the value of the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Statement</em>' containment reference.
   * @see #setSwitchStatement(Switch_Statement)
   * @see org.xtext.java.java.JavaPackage#getStatement_SwitchStatement()
   * @model containment="true"
   * @generated
   */
  Switch_Statement getSwitchStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getSwitchStatement <em>Switch Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Statement</em>' containment reference.
   * @see #getSwitchStatement()
   * @generated
   */
  void setSwitchStatement(Switch_Statement value);

  /**
   * Returns the value of the '<em><b>Try</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try</em>' containment reference.
   * @see #setTry(Try_statement)
   * @see org.xtext.java.java.JavaPackage#getStatement_Try()
   * @model containment="true"
   * @generated
   */
  Try_statement getTry();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getTry <em>Try</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try</em>' containment reference.
   * @see #getTry()
   * @generated
   */
  void setTry(Try_statement value);

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
   * @see org.xtext.java.java.JavaPackage#getStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.java.java.JavaPackage#getStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // Statement
