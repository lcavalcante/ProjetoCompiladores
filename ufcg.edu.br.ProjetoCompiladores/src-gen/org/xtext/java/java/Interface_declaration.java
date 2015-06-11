/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Interface_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.Interface_declaration#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Interface_declaration#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.xtext.java.java.Interface_declaration#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.xtext.java.java.Interface_declaration#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getInterface_declaration()
 * @model
 * @generated
 */
public interface Interface_declaration extends EObject
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
   * @see org.xtext.java.java.JavaPackage#getInterface_declaration_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

  /**
   * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Name</em>' attribute.
   * @see #setInterfaceName(String)
   * @see org.xtext.java.java.JavaPackage#getInterface_declaration_InterfaceName()
   * @model
   * @generated
   */
  String getInterfaceName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Interface_declaration#getInterfaceName <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Name</em>' attribute.
   * @see #getInterfaceName()
   * @generated
   */
  void setInterfaceName(String value);

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
   * @see org.xtext.java.java.JavaPackage#getInterface_declaration_Extend()
   * @model
   * @generated
   */
  String getExtend();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Interface_declaration#getExtend <em>Extend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend</em>' attribute.
   * @see #getExtend()
   * @generated
   */
  void setExtend(String value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' attribute list.
   * @see org.xtext.java.java.JavaPackage#getInterface_declaration_Extends()
   * @model unique="false"
   * @generated
   */
  EList<String> getExtends();

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
   * @see org.xtext.java.java.JavaPackage#getInterface_declaration_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field_declaration> getFields();

} // Interface_declaration
