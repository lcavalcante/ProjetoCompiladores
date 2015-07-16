/**
 */
package org.xtext.java.java.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.java.java.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.java.java.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JavaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JavaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaSwitch<Adapter> modelSwitch =
    new JavaSwitch<Adapter>()
    {
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseCompilation_unit(Compilation_unit object)
      {
        return createCompilation_unitAdapter();
      }
      @Override
      public Adapter caseType_declaration(Type_declaration object)
      {
        return createType_declarationAdapter();
      }
      @Override
      public Adapter caseInterface_declaration(Interface_declaration object)
      {
        return createInterface_declarationAdapter();
      }
      @Override
      public Adapter caseClass_declaration(Class_declaration object)
      {
        return createClass_declarationAdapter();
      }
      @Override
      public Adapter caseField_declaration(Field_declaration object)
      {
        return createField_declarationAdapter();
      }
      @Override
      public Adapter caseMethod_declaration(Method_declaration object)
      {
        return createMethod_declarationAdapter();
      }
      @Override
      public Adapter caseMethod_call(Method_call object)
      {
        return createMethod_callAdapter();
      }
      @Override
      public Adapter caseConstructor_declaration(Constructor_declaration object)
      {
        return createConstructor_declarationAdapter();
      }
      @Override
      public Adapter caseParameter_list_method_call(Parameter_list_method_call object)
      {
        return createParameter_list_method_callAdapter();
      }
      @Override
      public Adapter caseParameter_list(Parameter_list object)
      {
        return createParameter_listAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseVariable_declaration(Variable_declaration object)
      {
        return createVariable_declarationAdapter();
      }
      @Override
      public Adapter caseVariable_declarator(Variable_declarator object)
      {
        return createVariable_declaratorAdapter();
      }
      @Override
      public Adapter caseVariable_initializer(Variable_initializer object)
      {
        return createVariable_initializerAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpression_aux(Expression_aux object)
      {
        return createExpression_auxAdapter();
      }
      @Override
      public Adapter caseAmpersand_Rule(Ampersand_Rule object)
      {
        return createAmpersand_RuleAdapter();
      }
      @Override
      public Adapter caseFloat_Literal(Float_Literal object)
      {
        return createFloat_LiteralAdapter();
      }
      @Override
      public Adapter caseLiteral_Expression(Literal_Expression object)
      {
        return createLiteral_ExpressionAdapter();
      }
      @Override
      public Adapter caseCreating_Expression(Creating_Expression object)
      {
        return createCreating_ExpressionAdapter();
      }
      @Override
      public Adapter caseCast_Expression(Cast_Expression object)
      {
        return createCast_ExpressionAdapter();
      }
      @Override
      public Adapter caseBit_Expression_NR(Bit_Expression_NR object)
      {
        return createBit_Expression_NRAdapter();
      }
      @Override
      public Adapter caseLogical_Expression_NR(Logical_Expression_NR object)
      {
        return createLogical_Expression_NRAdapter();
      }
      @Override
      public Adapter caseArg_List(Arg_List object)
      {
        return createArg_ListAdapter();
      }
      @Override
      public Adapter caseNumeric_Expression_NR(Numeric_Expression_NR object)
      {
        return createNumeric_Expression_NRAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseStatic_initializer(Static_initializer object)
      {
        return createStatic_initializerAdapter();
      }
      @Override
      public Adapter caseStatement_block(Statement_block object)
      {
        return createStatement_blockAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseSwitch_Statement(Switch_Statement object)
      {
        return createSwitch_StatementAdapter();
      }
      @Override
      public Adapter caseFor_Statement(For_Statement object)
      {
        return createFor_StatementAdapter();
      }
      @Override
      public Adapter caseWhile_Statement(While_Statement object)
      {
        return createWhile_StatementAdapter();
      }
      @Override
      public Adapter caseDo_Statement(Do_Statement object)
      {
        return createDo_StatementAdapter();
      }
      @Override
      public Adapter caseIf_Statement(If_Statement object)
      {
        return createIf_StatementAdapter();
      }
      @Override
      public Adapter caseReturn_Statement(Return_Statement object)
      {
        return createReturn_StatementAdapter();
      }
      @Override
      public Adapter caseReturn_value(Return_value object)
      {
        return createReturn_valueAdapter();
      }
      @Override
      public Adapter caseTry_statement(Try_statement object)
      {
        return createTry_statementAdapter();
      }
      @Override
      public Adapter casePackage_statement(Package_statement object)
      {
        return createPackage_statementAdapter();
      }
      @Override
      public Adapter caseImport_statement(Import_statement object)
      {
        return createImport_statementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Compilation_unit <em>Compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Compilation_unit
   * @generated
   */
  public Adapter createCompilation_unitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Type_declaration <em>Type declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Type_declaration
   * @generated
   */
  public Adapter createType_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Interface_declaration <em>Interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Interface_declaration
   * @generated
   */
  public Adapter createInterface_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Class_declaration <em>Class declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Class_declaration
   * @generated
   */
  public Adapter createClass_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Field_declaration <em>Field declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Field_declaration
   * @generated
   */
  public Adapter createField_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Method_declaration <em>Method declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Method_declaration
   * @generated
   */
  public Adapter createMethod_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Method_call <em>Method call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Method_call
   * @generated
   */
  public Adapter createMethod_callAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Constructor_declaration <em>Constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Constructor_declaration
   * @generated
   */
  public Adapter createConstructor_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Parameter_list_method_call <em>Parameter list method call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Parameter_list_method_call
   * @generated
   */
  public Adapter createParameter_list_method_callAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Parameter_list <em>Parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Parameter_list
   * @generated
   */
  public Adapter createParameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Variable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Variable_declaration
   * @generated
   */
  public Adapter createVariable_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Variable_declarator <em>Variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Variable_declarator
   * @generated
   */
  public Adapter createVariable_declaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Variable_initializer <em>Variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Variable_initializer
   * @generated
   */
  public Adapter createVariable_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Expression_aux <em>Expression aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Expression_aux
   * @generated
   */
  public Adapter createExpression_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Ampersand_Rule <em>Ampersand Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Ampersand_Rule
   * @generated
   */
  public Adapter createAmpersand_RuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Float_Literal <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Float_Literal
   * @generated
   */
  public Adapter createFloat_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Literal_Expression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Literal_Expression
   * @generated
   */
  public Adapter createLiteral_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Creating_Expression <em>Creating Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Creating_Expression
   * @generated
   */
  public Adapter createCreating_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Cast_Expression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Cast_Expression
   * @generated
   */
  public Adapter createCast_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Bit_Expression_NR <em>Bit Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Bit_Expression_NR
   * @generated
   */
  public Adapter createBit_Expression_NRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Logical_Expression_NR <em>Logical Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Logical_Expression_NR
   * @generated
   */
  public Adapter createLogical_Expression_NRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Arg_List <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Arg_List
   * @generated
   */
  public Adapter createArg_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Numeric_Expression_NR <em>Numeric Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Numeric_Expression_NR
   * @generated
   */
  public Adapter createNumeric_Expression_NRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Static_initializer <em>Static initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Static_initializer
   * @generated
   */
  public Adapter createStatic_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Statement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Statement_block
   * @generated
   */
  public Adapter createStatement_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Switch_Statement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Switch_Statement
   * @generated
   */
  public Adapter createSwitch_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.For_Statement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.For_Statement
   * @generated
   */
  public Adapter createFor_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.While_Statement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.While_Statement
   * @generated
   */
  public Adapter createWhile_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Do_Statement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Do_Statement
   * @generated
   */
  public Adapter createDo_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.If_Statement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.If_Statement
   * @generated
   */
  public Adapter createIf_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Return_Statement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Return_Statement
   * @generated
   */
  public Adapter createReturn_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Return_value <em>Return value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Return_value
   * @generated
   */
  public Adapter createReturn_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Try_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Try_statement
   * @generated
   */
  public Adapter createTry_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Package_statement <em>Package statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Package_statement
   * @generated
   */
  public Adapter createPackage_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.java.java.Import_statement <em>Import statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.java.java.Import_statement
   * @generated
   */
  public Adapter createImport_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JavaAdapterFactory
