/*
 * generated by Xtext
 */
package org.xtext.java.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.java.services.JavaGrammarAccess;

public class JavaParser extends AbstractContentAssistParser {
	
	@Inject
	private JavaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.java.ui.contentassist.antlr.internal.InternalJavaParser createParser() {
		org.xtext.java.ui.contentassist.antlr.internal.InternalJavaParser result = new org.xtext.java.ui.contentassist.antlr.internal.InternalJavaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getType_declarationAccess().getAlternatives_1(), "rule__Type_declaration__Alternatives_1");
					put(grammarAccess.getField_declarationAccess().getAlternatives(), "rule__Field_declaration__Alternatives");
					put(grammarAccess.getType_specifierAccess().getAlternatives(), "rule__Type_specifier__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getImport_statementAccess().getAlternatives_1(), "rule__Import_statement__Alternatives_1");
					put(grammarAccess.getCompilation_unitAccess().getGroup(), "rule__Compilation_unit__Group__0");
					put(grammarAccess.getType_declarationAccess().getGroup(), "rule__Type_declaration__Group__0");
					put(grammarAccess.getInterface_declarationAccess().getGroup(), "rule__Interface_declaration__Group__0");
					put(grammarAccess.getInterface_declarationAccess().getGroup_3(), "rule__Interface_declaration__Group_3__0");
					put(grammarAccess.getInterface_declarationAccess().getGroup_3_2(), "rule__Interface_declaration__Group_3_2__0");
					put(grammarAccess.getClass_declarationAccess().getGroup(), "rule__Class_declaration__Group__0");
					put(grammarAccess.getClass_declarationAccess().getGroup_3(), "rule__Class_declaration__Group_3__0");
					put(grammarAccess.getClass_declarationAccess().getGroup_4(), "rule__Class_declaration__Group_4__0");
					put(grammarAccess.getClass_declarationAccess().getGroup_4_2(), "rule__Class_declaration__Group_4_2__0");
					put(grammarAccess.getField_declarationAccess().getGroup_0(), "rule__Field_declaration__Group_0__0");
					put(grammarAccess.getVariable_declarationAccess().getGroup(), "rule__Variable_declaration__Group__0");
					put(grammarAccess.getVariable_declarationAccess().getGroup_3(), "rule__Variable_declaration__Group_3__0");
					put(grammarAccess.getVariable_declaratorAccess().getGroup(), "rule__Variable_declarator__Group__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getStatic_initializerAccess().getGroup(), "rule__Static_initializer__Group__0");
					put(grammarAccess.getStatement_blockAccess().getGroup(), "rule__Statement_block__Group__0");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup_2(), "rule__Statement__Group_2__0");
					put(grammarAccess.getStatementAccess().getGroup_3(), "rule__Statement__Group_3__0");
					put(grammarAccess.getPackage_statementAccess().getGroup(), "rule__Package_statement__Group__0");
					put(grammarAccess.getPackage_nameAccess().getGroup(), "rule__Package_name__Group__0");
					put(grammarAccess.getPackage_name_auxAccess().getGroup(), "rule__Package_name_aux__Group__0");
					put(grammarAccess.getImport_statementAccess().getGroup(), "rule__Import_statement__Group__0");
					put(grammarAccess.getImport_statementAccess().getGroup_1_0(), "rule__Import_statement__Group_1_0__0");
					put(grammarAccess.getImport_statementAccess().getGroup_1_1(), "rule__Import_statement__Group_1_1__0");
					put(grammarAccess.getHeadAccess().getElementsAssignment(), "rule__Head__ElementsAssignment");
					put(grammarAccess.getCompilation_unitAccess().getPackageAssignment_0(), "rule__Compilation_unit__PackageAssignment_0");
					put(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1(), "rule__Compilation_unit__ImportsAssignment_1");
					put(grammarAccess.getCompilation_unitAccess().getType_declarationsAssignment_2(), "rule__Compilation_unit__Type_declarationsAssignment_2");
					put(grammarAccess.getType_declarationAccess().getDocAssignment_0(), "rule__Type_declaration__DocAssignment_0");
					put(grammarAccess.getType_declarationAccess().getNameAssignment_1_0(), "rule__Type_declaration__NameAssignment_1_0");
					put(grammarAccess.getType_declarationAccess().getNameAssignment_1_1(), "rule__Type_declaration__NameAssignment_1_1");
					put(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0(), "rule__Interface_declaration__ModifiersAssignment_0");
					put(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2(), "rule__Interface_declaration__InterfaceNameAssignment_2");
					put(grammarAccess.getInterface_declarationAccess().getExtendAssignment_3_1(), "rule__Interface_declaration__ExtendAssignment_3_1");
					put(grammarAccess.getInterface_declarationAccess().getExtendsAssignment_3_2_1(), "rule__Interface_declaration__ExtendsAssignment_3_2_1");
					put(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0(), "rule__Class_declaration__ModifiersAssignment_0");
					put(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2(), "rule__Class_declaration__ClassNameAssignment_2");
					put(grammarAccess.getClass_declarationAccess().getExtendAssignment_3_1(), "rule__Class_declaration__ExtendAssignment_3_1");
					put(grammarAccess.getClass_declarationAccess().getImplementAssignment_4_1(), "rule__Class_declaration__ImplementAssignment_4_1");
					put(grammarAccess.getClass_declarationAccess().getImplementsAssignment_4_2_1(), "rule__Class_declaration__ImplementsAssignment_4_2_1");
					put(grammarAccess.getClass_declarationAccess().getFieldsAssignment_6(), "rule__Class_declaration__FieldsAssignment_6");
					put(grammarAccess.getField_declarationAccess().getDocAssignment_0_0(), "rule__Field_declaration__DocAssignment_0_0");
					put(grammarAccess.getField_declarationAccess().getNameAssignment_0_1(), "rule__Field_declaration__NameAssignment_0_1");
					put(grammarAccess.getField_declarationAccess().getNameAssignment_1(), "rule__Field_declaration__NameAssignment_1");
					put(grammarAccess.getField_declarationAccess().getDebugAssignment_2(), "rule__Field_declaration__DebugAssignment_2");
					put(grammarAccess.getVariable_declarationAccess().getModifiersAssignment_0(), "rule__Variable_declaration__ModifiersAssignment_0");
					put(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1(), "rule__Variable_declaration__TypeAssignment_1");
					put(grammarAccess.getVariable_declarationAccess().getNameAssignment_2(), "rule__Variable_declaration__NameAssignment_2");
					put(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1(), "rule__Variable_declaration__NamesAssignment_3_1");
					put(grammarAccess.getVariable_declaratorAccess().getNameAssignment_0(), "rule__Variable_declarator__NameAssignment_0");
					put(grammarAccess.getTypeAccess().getNameAssignment_0(), "rule__Type__NameAssignment_0");
					put(grammarAccess.getStatic_initializerAccess().getNameAssignment_1(), "rule__Static_initializer__NameAssignment_1");
					put(grammarAccess.getStatement_blockAccess().getStatementsAssignment_2(), "rule__Statement_block__StatementsAssignment_2");
					put(grammarAccess.getStatementAccess().getNameAssignment_0_0(), "rule__Statement__NameAssignment_0_0");
					put(grammarAccess.getStatementAccess().getStatementAssignment_0_2(), "rule__Statement__StatementAssignment_0_2");
					put(grammarAccess.getStatementAccess().getNameAssignment_1_2(), "rule__Statement__NameAssignment_1_2");
					put(grammarAccess.getStatementAccess().getNameAssignment_2_2(), "rule__Statement__NameAssignment_2_2");
					put(grammarAccess.getPackage_statementAccess().getNameAssignment_1(), "rule__Package_statement__NameAssignment_1");
					put(grammarAccess.getImport_statementAccess().getClassnameAssignment_1_0_0(), "rule__Import_statement__ClassnameAssignment_1_0_0");
					put(grammarAccess.getImport_statementAccess().getPackagenameAssignment_1_1_0(), "rule__Import_statement__PackagenameAssignment_1_1_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.java.ui.contentassist.antlr.internal.InternalJavaParser typedParser = (org.xtext.java.ui.contentassist.antlr.internal.InternalJavaParser) parser;
			typedParser.entryRuleHead();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JavaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JavaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
