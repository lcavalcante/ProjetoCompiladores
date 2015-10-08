/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creating Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Creating_Expression#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Creating_Expression#getArgList <em>Arg List</em>}</li>
 *   <li>{@link org.xtext.java.java.Creating_Expression#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.xtext.java.java.Creating_Expression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getCreating_Expression()
 * @model
 * @generated
 */
public interface Creating_Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see org.xtext.java.java.JavaPackage#getCreating_Expression_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Creating_Expression#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Arg List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg List</em>' containment reference.
   * @see #setArgList(Arg_List)
   * @see org.xtext.java.java.JavaPackage#getCreating_Expression_ArgList()
   * @model containment="true"
   * @generated
   */
  Arg_List getArgList();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Creating_Expression#getArgList <em>Arg List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg List</em>' containment reference.
   * @see #getArgList()
   * @generated
   */
  void setArgList(Arg_List value);

  /**
   * Returns the value of the '<em><b>Type Specifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Specifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Specifier</em>' attribute.
   * @see #setTypeSpecifier(String)
   * @see org.xtext.java.java.JavaPackage#getCreating_Expression_TypeSpecifier()
   * @model
   * @generated
   */
  String getTypeSpecifier();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Creating_Expression#getTypeSpecifier <em>Type Specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Specifier</em>' attribute.
   * @see #getTypeSpecifier()
   * @generated
   */
  void setTypeSpecifier(String value);

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
   * @see org.xtext.java.java.JavaPackage#getCreating_Expression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Creating_Expression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Creating_Expression
