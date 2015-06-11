/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Class_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.Class_declaration#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Class_declaration#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.xtext.java.java.Class_declaration#getImplement <em>Implement</em>}</li>
 *   <li>{@link org.xtext.java.java.Class_declaration#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.xtext.java.java.Class_declaration#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getClass_declaration()
 * @model
 * @generated
 */
public interface Class_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.xtext.java.java.JavaPackage#getClass_declaration_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

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
   * @see org.xtext.java.java.JavaPackage#getClass_declaration_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Class_declaration#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Extend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extend</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend</em>' attribute.
   * @see #setExtend(String)
   * @see org.xtext.java.java.JavaPackage#getClass_declaration_Extend()
   * @model
   * @generated
   */
  String getExtend();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Class_declaration#getExtend <em>Extend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend</em>' attribute.
   * @see #getExtend()
   * @generated
   */
  void setExtend(String value);

  /**
   * Returns the value of the '<em><b>Implement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implement</em>' attribute.
   * @see #setImplement(String)
   * @see org.xtext.java.java.JavaPackage#getClass_declaration_Implement()
   * @model
   * @generated
   */
  String getImplement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Class_declaration#getImplement <em>Implement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implement</em>' attribute.
   * @see #getImplement()
   * @generated
   */
  void setImplement(String value);

  /**
   * Returns the value of the '<em><b>Implements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' attribute list.
   * @see org.xtext.java.java.JavaPackage#getClass_declaration_Implements()
   * @model unique="false"
   * @generated
   */
  EList<String> getImplements();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Field_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getClass_declaration_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field_declaration> getFields();

} // Class_declaration
