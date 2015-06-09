/*
 * generated by Xtext
 */
package org.xtext.java.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.java.java.Class_declaration;
import org.xtext.java.java.Compilation_unit;
import org.xtext.java.java.Constructor_declaration;
import org.xtext.java.java.Field_declaration;
import org.xtext.java.java.Head;
import org.xtext.java.java.Import_statement;
import org.xtext.java.java.Interface_declaration;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Method_declaration;
import org.xtext.java.java.Package_statement;
import org.xtext.java.java.Parameter;
import org.xtext.java.java.Parameter_list;
import org.xtext.java.java.Statement;
import org.xtext.java.java.Statement_block;
import org.xtext.java.java.Static_initializer;
import org.xtext.java.java.Type;
import org.xtext.java.java.Type_declaration;
import org.xtext.java.java.Variable_declaration;
import org.xtext.java.java.Variable_declarator;
import org.xtext.java.services.JavaGrammarAccess;

@SuppressWarnings("all")
public class JavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JavaGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JavaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JavaPackage.CLASS_DECLARATION:
				sequence_Class_declaration(context, (Class_declaration) semanticObject); 
				return; 
			case JavaPackage.COMPILATION_UNIT:
				sequence_Compilation_unit(context, (Compilation_unit) semanticObject); 
				return; 
			case JavaPackage.CONSTRUCTOR_DECLARATION:
				sequence_Constructor_declaration(context, (Constructor_declaration) semanticObject); 
				return; 
			case JavaPackage.FIELD_DECLARATION:
				sequence_Field_declaration(context, (Field_declaration) semanticObject); 
				return; 
			case JavaPackage.HEAD:
				sequence_Head(context, (Head) semanticObject); 
				return; 
			case JavaPackage.IMPORT_STATEMENT:
				sequence_Import_statement(context, (Import_statement) semanticObject); 
				return; 
			case JavaPackage.INTERFACE_DECLARATION:
				sequence_Interface_declaration(context, (Interface_declaration) semanticObject); 
				return; 
			case JavaPackage.METHOD_DECLARATION:
				sequence_Method_declaration(context, (Method_declaration) semanticObject); 
				return; 
			case JavaPackage.PACKAGE_STATEMENT:
				sequence_Package_statement(context, (Package_statement) semanticObject); 
				return; 
			case JavaPackage.PARAMETER:
				sequence_Parameter(context, (Parameter) semanticObject); 
				return; 
			case JavaPackage.PARAMETER_LIST:
				sequence_Parameter_list(context, (Parameter_list) semanticObject); 
				return; 
			case JavaPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case JavaPackage.STATEMENT_BLOCK:
				sequence_Statement_block(context, (Statement_block) semanticObject); 
				return; 
			case JavaPackage.STATIC_INITIALIZER:
				sequence_Static_initializer(context, (Static_initializer) semanticObject); 
				return; 
			case JavaPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case JavaPackage.TYPE_DECLARATION:
				sequence_Type_declaration(context, (Type_declaration) semanticObject); 
				return; 
			case JavaPackage.VARIABLE_DECLARATION:
				sequence_Variable_declaration(context, (Variable_declaration) semanticObject); 
				return; 
			case JavaPackage.VARIABLE_DECLARATOR:
				sequence_Variable_declarator(context, (Variable_declarator) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (modifiers+=MODIFIER* className=ID extend=Class_name? (implement=Interface_name implements+=Interface_name*)? fields+=Field_declaration*)
	 */
	protected void sequence_Class_declaration(EObject context, Class_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=Package_statement? imports+=Import_statement* type_declarations+=Type_declaration*)
	 */
	protected void sequence_Compilation_unit(EObject context, Compilation_unit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=MODIFIER* name=ID parameters=Parameter_list? statement=Statement_block)
	 */
	protected void sequence_Constructor_declaration(EObject context, Constructor_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((doc=DOC_COMMENT? (name=Variable_declaration | name=Constructor_declaration | name=Method_declaration)) | name=Static_initializer | debug=';')
	 */
	protected void sequence_Field_declaration(EObject context, Field_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Compilation_unit
	 */
	protected void sequence_Head(EObject context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classname=Class_name | packagename=Package_name)
	 */
	protected void sequence_Import_statement(EObject context, Import_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=MODIFIER* interfaceName=ID (extend=Interface_name extends+=Interface_name*)?)
	 */
	protected void sequence_Interface_declaration(EObject context, Interface_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=MODIFIER* type=Type name=ID parameter=Parameter_list? (statement=Statement_block | debug=';'))
	 */
	protected void sequence_Method_declaration(EObject context, Method_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Package_name
	 */
	protected void sequence_Package_statement(EObject context, Package_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.PACKAGE_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.PACKAGE_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=Parameter parameters+=Parameter*)
	 */
	protected void sequence_Parameter_list(EObject context, Parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID?) | (name=ID?))
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_Statement_block(EObject context, Statement_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Statement_block
	 */
	protected void sequence_Static_initializer(EObject context, Static_initializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.STATIC_INITIALIZER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.STATIC_INITIALIZER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Type_specifier
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC_COMMENT? (name=Class_declaration | name=Interface_declaration))
	 */
	protected void sequence_Type_declaration(EObject context, Type_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=MODIFIER* type=Type name=Variable_declarator names+=Variable_declarator*)
	 */
	protected void sequence_Variable_declaration(EObject context, Variable_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable_declarator(EObject context, Variable_declarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.VARIABLE_DECLARATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.VARIABLE_DECLARATOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
}
