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
   * Returns a new object of class '<em>Method declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method declaration</em>'.
   * @generated
   */
  Method_declaration createMethod_declaration();

  /**
   * Returns a new object of class '<em>Method call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method call</em>'.
   * @generated
   */
  Method_call createMethod_call();

  /**
   * Returns a new object of class '<em>Constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor declaration</em>'.
   * @generated
   */
  Constructor_declaration createConstructor_declaration();

  /**
   * Returns a new object of class '<em>Parameter list method call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter list method call</em>'.
   * @generated
   */
  Parameter_list_method_call createParameter_list_method_call();

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
   * Returns a new object of class '<em>Variable initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable initializer</em>'.
   * @generated
   */
  Variable_initializer createVariable_initializer();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Expression aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression aux</em>'.
   * @generated
   */
  Expression_aux createExpression_aux();

  /**
   * Returns a new object of class '<em>Ampersand Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ampersand Rule</em>'.
   * @generated
   */
  Ampersand_Rule createAmpersand_Rule();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  Float_Literal createFloat_Literal();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  Literal_Expression createLiteral_Expression();

  /**
   * Returns a new object of class '<em>Creating Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creating Expression</em>'.
   * @generated
   */
  Creating_Expression createCreating_Expression();

  /**
   * Returns a new object of class '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expression</em>'.
   * @generated
   */
  Cast_Expression createCast_Expression();

  /**
   * Returns a new object of class '<em>Bit Expression NR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Expression NR</em>'.
   * @generated
   */
  Bit_Expression_NR createBit_Expression_NR();

  /**
   * Returns a new object of class '<em>Logical Expression NR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Expression NR</em>'.
   * @generated
   */
  Logical_Expression_NR createLogical_Expression_NR();

  /**
   * Returns a new object of class '<em>Arg List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arg List</em>'.
   * @generated
   */
  Arg_List createArg_List();

  /**
   * Returns a new object of class '<em>Numeric Expression NR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Expression NR</em>'.
   * @generated
   */
  Numeric_Expression_NR createNumeric_Expression_NR();

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
   * Returns a new object of class '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Statement</em>'.
   * @generated
   */
  Switch_Statement createSwitch_Statement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  For_Statement createFor_Statement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  While_Statement createWhile_Statement();

  /**
   * Returns a new object of class '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Statement</em>'.
   * @generated
   */
  Do_Statement createDo_Statement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  If_Statement createIf_Statement();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  Return_Statement createReturn_Statement();

  /**
   * Returns a new object of class '<em>Return value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return value</em>'.
   * @generated
   */
  Return_value createReturn_value();

  /**
   * Returns a new object of class '<em>Try statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try statement</em>'.
   * @generated
   */
  Try_statement createTry_statement();

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
