/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.java.java.JavaPackage
 * @generated
 */
public interface JavaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JavaFactory eINSTANCE = org.xtext.java.java.impl.JavaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Head</em>'.
   * @generated
   */
  Head createHead();

  /**
   * Returns a new object of class '<em>Compilation unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation unit</em>'.
   * @generated
   */
  Compilation_unit createCompilation_unit();

  /**
   * Returns a new object of class '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type declaration</em>'.
   * @generated
   */
  Type_declaration createType_declaration();

  /**
   * Returns a new object of class '<em>Interface declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface declaration</em>'.
   * @generated
   */
  Interface_declaration createInterface_declaration();

  /**
   * Returns a new object of class '<em>Class declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class declaration</em>'.
   * @generated
   */
  Class_declaration createClass_declaration();

  /**
   * Returns a new object of class '<em>Field declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field declaration</em>'.
   * @generated
   */
  Field_declaration createField_declaration();

  /**
   * Returns a new object of class '<em>Constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor declaration</em>'.
   * @generated
   */
  Constructor_declaration createConstructor_declaration();

  /**
   * Returns a new object of class '<em>Parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter list</em>'.
   * @generated
   */
  Parameter_list createParameter_list();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Variable declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable declaration</em>'.
   * @generated
   */
  Variable_declaration createVariable_declaration();

  /**
   * Returns a new object of class '<em>Variable declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable declarator</em>'.
   * @generated
   */
  Variable_declarator createVariable_declarator();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Static initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static initializer</em>'.
   * @generated
   */
  Static_initializer createStatic_initializer();

  /**
   * Returns a new object of class '<em>Statement block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement block</em>'.
   * @generated
   */
  Statement_block createStatement_block();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Package statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package statement</em>'.
   * @generated
   */
  Package_statement createPackage_statement();

  /**
   * Returns a new object of class '<em>Import statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import statement</em>'.
   * @generated
   */
  Import_statement createImport_statement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JavaPackage getJavaPackage();

} //JavaFactory
