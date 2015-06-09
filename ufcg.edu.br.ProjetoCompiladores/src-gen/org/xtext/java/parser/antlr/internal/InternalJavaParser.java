package org.xtext.java.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.java.services.JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_MODIFIER", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'interface'", "'extends'", "','", "'{'", "'}'", "'class'", "'implements'", "'('", "')'", "'[]'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'static'", "':'", "'break'", "'continue'", "'package'", "'.'", "'import'", "'.*;;'"
    };
    public static final int RULE_MODIFIER=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_DOC_COMMENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaParser.tokenNames; }
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g"; }



     	private JavaGrammarAccess grammarAccess;
     	
        public InternalJavaParser(TokenStream input, JavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Head";	
       	}
       	
       	@Override
       	protected JavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHead"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:67:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:68:2: (iv_ruleHead= ruleHead EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:69:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead75);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:76:1: ruleHead returns [EObject current=null] : ( (lv_elements_0_0= ruleCompilation_unit ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:79:28: ( ( (lv_elements_0_0= ruleCompilation_unit ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:80:1: ( (lv_elements_0_0= ruleCompilation_unit ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:80:1: ( (lv_elements_0_0= ruleCompilation_unit ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:81:1: (lv_elements_0_0= ruleCompilation_unit )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:81:1: (lv_elements_0_0= ruleCompilation_unit )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:82:3: lv_elements_0_0= ruleCompilation_unit
            {
             
            	        newCompositeNode(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCompilation_unit_in_ruleHead130);
            lv_elements_0_0=ruleCompilation_unit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeadRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"Compilation_unit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleCompilation_unit"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:106:1: entryRuleCompilation_unit returns [EObject current=null] : iv_ruleCompilation_unit= ruleCompilation_unit EOF ;
    public final EObject entryRuleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilation_unit = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:107:2: (iv_ruleCompilation_unit= ruleCompilation_unit EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:108:2: iv_ruleCompilation_unit= ruleCompilation_unit EOF
            {
             newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;

             current =iv_ruleCompilation_unit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompilation_unit"


    // $ANTLR start "ruleCompilation_unit"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:115:1: ruleCompilation_unit returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_type_declarations_2_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_type_declarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:118:28: ( ( ( (lv_package_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_type_declarations_2_0= ruleType_declaration ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:1: ( ( (lv_package_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_type_declarations_2_0= ruleType_declaration ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:1: ( ( (lv_package_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_type_declarations_2_0= ruleType_declaration ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:2: ( (lv_package_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_type_declarations_2_0= ruleType_declaration ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:2: ( (lv_package_0_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:120:1: (lv_package_0_0= rulePackage_statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:120:1: (lv_package_0_0= rulePackage_statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:121:3: lv_package_0_0= rulePackage_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit221);
                    lv_package_0_0=rulePackage_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
                    	        }
                           		set(
                           			current, 
                           			"package",
                            		lv_package_0_0, 
                            		"Package_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:137:3: ( (lv_imports_1_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==36) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:138:1: (lv_imports_1_0= ruleImport_statement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:138:1: (lv_imports_1_0= ruleImport_statement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:139:3: lv_imports_1_0= ruleImport_statement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit243);
            	    lv_imports_1_0=ruleImport_statement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"Import_statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:155:3: ( (lv_type_declarations_2_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_DOC_COMMENT && LA3_0<=RULE_MODIFIER)||LA3_0==12||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:156:1: (lv_type_declarations_2_0= ruleType_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:156:1: (lv_type_declarations_2_0= ruleType_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:157:3: lv_type_declarations_2_0= ruleType_declaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit265);
            	    lv_type_declarations_2_0=ruleType_declaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"type_declarations",
            	            		lv_type_declarations_2_0, 
            	            		"Type_declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:181:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:182:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:183:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
             newCompositeNode(grammarAccess.getType_declarationRule()); 
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration302);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;

             current =iv_ruleType_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType_declaration"


    // $ANTLR start "ruleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:190:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:193:28: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:194:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:194:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:194:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:194:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:195:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:195:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:196:3: lv_doc_0_0= RULE_DOC_COMMENT
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration354); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getType_declarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:212:3: ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:212:4: ( (lv_name_1_0= ruleClass_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:212:4: ( (lv_name_1_0= ruleClass_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:213:1: (lv_name_1_0= ruleClass_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:213:1: (lv_name_1_0= ruleClass_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:214:3: lv_name_1_0= ruleClass_declaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration382);
                    lv_name_1_0=ruleClass_declaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"Class_declaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:231:6: ( (lv_name_2_0= ruleInterface_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:231:6: ( (lv_name_2_0= ruleInterface_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:232:1: (lv_name_2_0= ruleInterface_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:232:1: (lv_name_2_0= ruleInterface_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:233:3: lv_name_2_0= ruleInterface_declaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration409);
                    lv_name_2_0=ruleInterface_declaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"Interface_declaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleType_declaration422); 

                	newLeafNode(otherlv_3, grammarAccess.getType_declarationAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:261:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:262:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:263:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
             newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration458);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;

             current =iv_ruleInterface_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface_declaration"


    // $ANTLR start "ruleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:270:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleInterface_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_modifiers_0_0=null;
        Token otherlv_1=null;
        Token lv_interfaceName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_extend_4_0 = null;

        AntlrDatatypeRuleToken lv_extends_6_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:273:28: ( ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:274:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:274:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:274:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:274:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_MODIFIER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:275:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:275:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:276:3: lv_modifiers_0_0= RULE_MODIFIER
            	    {
            	    lv_modifiers_0_0=(Token)match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_ruleInterface_declaration510); 

            	    			newLeafNode(lv_modifiers_0_0, grammarAccess.getInterface_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInterface_declarationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"MODIFIER");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInterface_declaration528); 

                	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:296:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:297:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:297:1: (lv_interfaceName_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:298:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration545); 

            			newLeafNode(lv_interfaceName_2_0, grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterface_declarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interfaceName",
                    		lv_interfaceName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:314:2: (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:314:4: otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInterface_declaration563); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                        
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:318:1: ( (lv_extend_4_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:319:1: (lv_extend_4_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:319:1: (lv_extend_4_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:320:3: lv_extend_4_0= ruleInterface_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration584);
                    lv_extend_4_0=ruleInterface_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"extend",
                            		lv_extend_4_0, 
                            		"Interface_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:336:2: (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:336:4: otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInterface_declaration597); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:340:1: ( (lv_extends_6_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:341:1: (lv_extends_6_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:341:1: (lv_extends_6_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:342:3: lv_extends_6_0= ruleInterface_name
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration618);
                    	    lv_extends_6_0=ruleInterface_name();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extends",
                    	            		lv_extends_6_0, 
                    	            		"Interface_name");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInterface_declaration634); 

                	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInterface_declaration646); 

                	newLeafNode(otherlv_8, grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:374:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:375:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:376:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
             newCompositeNode(grammarAccess.getClass_declarationRule()); 
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration682);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;

             current =iv_ruleClass_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass_declaration"


    // $ANTLR start "ruleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:383:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' ) ;
    public final EObject ruleClass_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_modifiers_0_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_extend_4_0 = null;

        AntlrDatatypeRuleToken lv_implement_6_0 = null;

        AntlrDatatypeRuleToken lv_implements_8_0 = null;

        EObject lv_fields_10_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:386:28: ( ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:387:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:387:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:387:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:387:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_MODIFIER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:388:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:388:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:389:3: lv_modifiers_0_0= RULE_MODIFIER
            	    {
            	    lv_modifiers_0_0=(Token)match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_ruleClass_declaration734); 

            	    			newLeafNode(lv_modifiers_0_0, grammarAccess.getClass_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClass_declarationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"MODIFIER");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClass_declaration752); 

                	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:409:1: ( (lv_className_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:410:1: (lv_className_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:410:1: (lv_className_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:411:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration769); 

            			newLeafNode(lv_className_2_0, grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClass_declarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"ID");
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:427:2: (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:427:4: otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClass_declaration787); 

                        	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                        
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:431:1: ( (lv_extend_4_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:432:1: (lv_extend_4_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:432:1: (lv_extend_4_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:433:3: lv_extend_4_0= ruleClass_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration808);
                    lv_extend_4_0=ruleClass_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"extend",
                            		lv_extend_4_0, 
                            		"Class_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:449:4: (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:449:6: otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleClass_declaration823); 

                        	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                        
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:453:1: ( (lv_implement_6_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:454:1: (lv_implement_6_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:454:1: (lv_implement_6_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:455:3: lv_implement_6_0= ruleInterface_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration844);
                    lv_implement_6_0=ruleInterface_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"implement",
                            		lv_implement_6_0, 
                            		"Interface_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:471:2: (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:471:4: otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleClass_declaration857); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:475:1: ( (lv_implements_8_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:476:1: (lv_implements_8_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:476:1: (lv_implements_8_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:477:3: lv_implements_8_0= ruleInterface_name
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration878);
                    	    lv_implements_8_0=ruleInterface_name();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"implements",
                    	            		lv_implements_8_0, 
                    	            		"Interface_name");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleClass_declaration894); 

                	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:497:1: ( (lv_fields_10_0= ruleField_declaration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOC_COMMENT && LA13_0<=RULE_ID)||LA13_0==11||(LA13_0>=22 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:498:1: (lv_fields_10_0= ruleField_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:498:1: (lv_fields_10_0= ruleField_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:499:3: lv_fields_10_0= ruleField_declaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration915);
            	    lv_fields_10_0=ruleField_declaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_10_0, 
            	            		"Field_declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleClass_declaration928); 

                	newLeafNode(otherlv_11, grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:527:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:528:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:529:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
             newCompositeNode(grammarAccess.getField_declarationRule()); 
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration964);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;

             current =iv_ruleField_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField_declaration"


    // $ANTLR start "ruleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:536:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) ) ;
    public final EObject ruleField_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_debug_5_0=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:539:28: ( ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:540:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:540:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_MODIFIER:
            case RULE_ID:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 11:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:540:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:540:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:540:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:540:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DOC_COMMENT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:541:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:541:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:542:3: lv_doc_0_0= RULE_DOC_COMMENT
                            {
                            lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1017); 

                            			newLeafNode(lv_doc_0_0, grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getField_declarationRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"doc",
                                    		lv_doc_0_0, 
                                    		"DOC_COMMENT");
                            	    

                            }


                            }
                            break;

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:558:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    int alt15=3;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:558:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:558:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:559:1: (lv_name_1_0= ruleVariable_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:559:1: (lv_name_1_0= ruleVariable_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:560:3: lv_name_1_0= ruleVariable_declaration
                            {
                             
                            	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1045);
                            lv_name_1_0=ruleVariable_declaration();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"name",
                                    		lv_name_1_0, 
                                    		"Variable_declaration");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:577:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:577:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:578:1: (lv_name_2_0= ruleConstructor_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:578:1: (lv_name_2_0= ruleConstructor_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:579:3: lv_name_2_0= ruleConstructor_declaration
                            {
                             
                            	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1072);
                            lv_name_2_0=ruleConstructor_declaration();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"Constructor_declaration");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:596:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:596:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:597:1: (lv_name_3_0= ruleMethod_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:597:1: (lv_name_3_0= ruleMethod_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:598:3: lv_name_3_0= ruleMethod_declaration
                            {
                             
                            	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1099);
                            lv_name_3_0=ruleMethod_declaration();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"name",
                                    		lv_name_3_0, 
                                    		"Method_declaration");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:615:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:615:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:616:1: (lv_name_4_0= ruleStatic_initializer )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:616:1: (lv_name_4_0= ruleStatic_initializer )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:617:3: lv_name_4_0= ruleStatic_initializer
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1128);
                    lv_name_4_0=ruleStatic_initializer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_4_0, 
                            		"Static_initializer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:634:6: ( (lv_debug_5_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:634:6: ( (lv_debug_5_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:635:1: (lv_debug_5_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:635:1: (lv_debug_5_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:636:3: lv_debug_5_0= ';'
                    {
                    lv_debug_5_0=(Token)match(input,11,FOLLOW_11_in_ruleField_declaration1152); 

                            newLeafNode(lv_debug_5_0, grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getField_declarationRule());
                    	        }
                           		setWithLastConsumed(current, "debug", lv_debug_5_0, ";");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:657:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:658:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:659:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
             newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1201);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;

             current =iv_ruleMethod_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod_declaration"


    // $ANTLR start "ruleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:666:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statement_7_0= ruleStatement_block ) ) | ( (lv_debug_8_0= ';' ) ) ) ) ;
    public final EObject ruleMethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_modifiers_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_debug_8_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_statement_7_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:669:28: ( ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statement_7_0= ruleStatement_block ) ) | ( (lv_debug_8_0= ';' ) ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:670:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statement_7_0= ruleStatement_block ) ) | ( (lv_debug_8_0= ';' ) ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:670:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statement_7_0= ruleStatement_block ) ) | ( (lv_debug_8_0= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:670:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statement_7_0= ruleStatement_block ) ) | ( (lv_debug_8_0= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:670:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_MODIFIER) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:671:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:671:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:672:3: lv_modifiers_0_0= RULE_MODIFIER
            	    {
            	    lv_modifiers_0_0=(Token)match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_ruleMethod_declaration1253); 

            	    			newLeafNode(lv_modifiers_0_0, grammarAccess.getMethod_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMethod_declarationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"MODIFIER");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:688:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:689:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:689:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:690:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1280);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:706:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:707:1: (lv_name_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:707:1: (lv_name_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:708:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1297); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMethod_declarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethod_declarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMethod_declaration1314); 

                	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:728:1: ( (lv_parameter_4_0= ruleParameter_list ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=22 && LA18_0<=29)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:729:1: (lv_parameter_4_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:729:1: (lv_parameter_4_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:730:3: lv_parameter_4_0= ruleParameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1335);
                    lv_parameter_4_0=ruleParameter_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"parameter",
                            		lv_parameter_4_0, 
                            		"Parameter_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMethod_declaration1348); 

                	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:750:1: (otherlv_6= '[]' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:750:3: otherlv_6= '[]'
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMethod_declaration1361); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6());
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:754:3: ( ( (lv_statement_7_0= ruleStatement_block ) ) | ( (lv_debug_8_0= ';' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            else if ( (LA20_0==11) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:754:4: ( (lv_statement_7_0= ruleStatement_block ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:754:4: ( (lv_statement_7_0= ruleStatement_block ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:755:1: (lv_statement_7_0= ruleStatement_block )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:755:1: (lv_statement_7_0= ruleStatement_block )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:756:3: lv_statement_7_0= ruleStatement_block
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1385);
                    lv_statement_7_0=ruleStatement_block();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"statement",
                            		lv_statement_7_0, 
                            		"Statement_block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:773:6: ( (lv_debug_8_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:773:6: ( (lv_debug_8_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:774:1: (lv_debug_8_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:774:1: (lv_debug_8_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:775:3: lv_debug_8_0= ';'
                    {
                    lv_debug_8_0=(Token)match(input,11,FOLLOW_11_in_ruleMethod_declaration1409); 

                            newLeafNode(lv_debug_8_0, grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethod_declarationRule());
                    	        }
                           		setWithLastConsumed(current, "debug", lv_debug_8_0, ";");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:796:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:797:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:798:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
             newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1459);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;

             current =iv_ruleConstructor_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1469); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor_declaration"


    // $ANTLR start "ruleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:805:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) ) ;
    public final EObject ruleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_modifiers_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:808:28: ( ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:809:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:809:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:809:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:809:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MODIFIER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:810:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:810:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:811:3: lv_modifiers_0_0= RULE_MODIFIER
            	    {
            	    lv_modifiers_0_0=(Token)match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_ruleConstructor_declaration1511); 

            	    			newLeafNode(lv_modifiers_0_0, grammarAccess.getConstructor_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"MODIFIER");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:827:3: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:828:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:828:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:829:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1534); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConstructor_declaration1551); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:849:1: ( (lv_parameters_3_0= ruleParameter_list ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=22 && LA22_0<=29)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:850:1: (lv_parameters_3_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:850:1: (lv_parameters_3_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:851:3: lv_parameters_3_0= ruleParameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1572);
                    lv_parameters_3_0=ruleParameter_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameter_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConstructor_declaration1585); 

                	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:871:1: ( (lv_statement_5_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:872:1: (lv_statement_5_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:872:1: (lv_statement_5_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:873:3: lv_statement_5_0= ruleStatement_block
            {
             
            	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1606);
            lv_statement_5_0=ruleStatement_block();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_5_0, 
                    		"Statement_block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:897:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:898:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:899:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
             newCompositeNode(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1642);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;

             current =iv_ruleParameter_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:906:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:909:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:910:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:910:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:910:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:910:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:911:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:911:1: (lv_parameter_0_0= ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:912:3: lv_parameter_0_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1698);
            lv_parameter_0_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_0_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:928:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:928:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameter_list1711); 

            	        	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:932:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:933:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:933:1: (lv_parameters_2_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:934:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1732);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:958:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:959:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:960:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1770);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:967:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:970:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:971:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:971:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:971:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:971:2: ( (lv_type_0_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:972:1: (lv_type_0_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:972:1: (lv_type_0_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:973:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParameter1826);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:989:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:990:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:990:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:991:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1843); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1007:2: (otherlv_2= '[]' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1007:4: otherlv_2= '[]'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParameter1861); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1019:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1020:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1021:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
             newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1899);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;

             current =iv_ruleVariable_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration1909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable_declaration"


    // $ANTLR start "ruleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1028:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleVariable_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_modifiers_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_names_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1031:28: ( ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1032:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1032:1: ( ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1032:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1032:2: ( (lv_modifiers_0_0= RULE_MODIFIER ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MODIFIER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1033:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1033:1: (lv_modifiers_0_0= RULE_MODIFIER )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1034:3: lv_modifiers_0_0= RULE_MODIFIER
            	    {
            	    lv_modifiers_0_0=(Token)match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_ruleVariable_declaration1951); 

            	    			newLeafNode(lv_modifiers_0_0, grammarAccess.getVariable_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariable_declarationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"MODIFIER");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1050:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1051:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1051:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1052:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration1978);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1068:2: ( (lv_name_2_0= ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1069:1: (lv_name_2_0= ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1069:1: (lv_name_2_0= ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1070:3: lv_name_2_0= ruleVariable_declarator
            {
             
            	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration1999);
            lv_name_2_0=ruleVariable_declarator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Variable_declarator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1086:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1086:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleVariable_declaration2012); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	        
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1090:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1091:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1091:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1092:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2033);
            	    lv_names_4_0=ruleVariable_declarator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"names",
            	            		lv_names_4_0, 
            	            		"Variable_declarator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleVariable_declaration2047); 

                	newLeafNode(otherlv_5, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1120:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1121:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1122:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2083);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;

             current =iv_ruleVariable_declarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2093); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable_declarator"


    // $ANTLR start "ruleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1129:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[]' )* ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1132:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1133:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1133:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1133:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1133:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1134:1: (lv_name_0_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1134:1: (lv_name_0_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1135:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2135); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1151:2: (otherlv_1= '[]' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1151:4: otherlv_1= '[]'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVariable_declarator2153); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleType"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1163:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1164:2: (iv_ruleType= ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1165:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2191);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2201); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1172:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1175:28: ( ( ( (lv_name_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1176:1: ( ( (lv_name_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1176:1: ( ( (lv_name_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1176:2: ( (lv_name_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1176:2: ( (lv_name_0_0= ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1177:1: (lv_name_0_0= ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1177:1: (lv_name_0_0= ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1178:3: lv_name_0_0= ruleType_specifier
            {
             
            	        newCompositeNode(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType2247);
            lv_name_0_0=ruleType_specifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Type_specifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1194:2: (otherlv_1= '[]' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1194:4: otherlv_1= '[]'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleType2260); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1206:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1207:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1208:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
             newCompositeNode(grammarAccess.getType_specifierRule()); 
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier2299);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;

             current =iv_ruleType_specifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier2310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType_specifier"


    // $ANTLR start "ruleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1215:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_8 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1218:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1219:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1219:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt29=1;
                }
                break;
            case 23:
                {
                alt29=2;
                }
                break;
            case 24:
                {
                alt29=3;
                }
                break;
            case 25:
                {
                alt29=4;
                }
                break;
            case 26:
                {
                alt29=5;
                }
                break;
            case 27:
                {
                alt29=6;
                }
                break;
            case 28:
                {
                alt29=7;
                }
                break;
            case 29:
                {
                alt29=8;
                }
                break;
            case RULE_ID:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1220:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleType_specifier2348); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1227:2: kw= 'byte'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType_specifier2367); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1234:2: kw= 'char'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType_specifier2386); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1241:2: kw= 'short'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleType_specifier2405); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1248:2: kw= 'int'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleType_specifier2424); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1255:2: kw= 'float'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleType_specifier2443); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1262:2: kw= 'long'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleType_specifier2462); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1269:2: kw= 'double'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType_specifier2481); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1276:5: this_Class_name_8= ruleClass_name
                    {
                     
                            newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier2509);
                    this_Class_name_8=ruleClass_name();

                    state._fsp--;


                    		current.merge(this_Class_name_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1294:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1295:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1296:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
             newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2554);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;

             current =iv_ruleStatic_initializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer2564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatic_initializer"


    // $ANTLR start "ruleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1303:1: ruleStatic_initializer returns [EObject current=null] : (otherlv_0= 'static' ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1306:28: ( (otherlv_0= 'static' ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1307:1: (otherlv_0= 'static' ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1307:1: (otherlv_0= 'static' ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1307:3: otherlv_0= 'static' ( (lv_name_1_0= ruleStatement_block ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleStatic_initializer2601); 

                	newLeafNode(otherlv_0, grammarAccess.getStatic_initializerAccess().getStaticKeyword_0());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1311:1: ( (lv_name_1_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1312:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1312:1: (lv_name_1_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1313:3: lv_name_1_0= ruleStatement_block
            {
             
            	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer2622);
            lv_name_1_0=ruleStatement_block();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatic_initializerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Statement_block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1337:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1338:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1339:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
             newCompositeNode(grammarAccess.getStatement_blockRule()); 
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block2658);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;

             current =iv_ruleStatement_block; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block2668); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement_block"


    // $ANTLR start "ruleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1346:1: ruleStatement_block returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1349:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1350:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1350:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1350:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1350:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatement_blockAccess().getStatement_blockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStatement_block2714); 

                	newLeafNode(otherlv_1, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1360:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==11||(LA30_0>=32 && LA30_0<=33)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1361:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1361:1: (lv_statements_2_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1362:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block2735);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatement_blockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStatement_block2748); 

                	newLeafNode(otherlv_3, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1391:2: (iv_ruleStatement= ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1392:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2784);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1399:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) ) | ( () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';' ) | ( () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';' ) | ( () otherlv_12= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1402:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) ) | ( () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';' ) | ( () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';' ) | ( () otherlv_12= ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) ) | ( () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';' ) | ( () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';' ) | ( () otherlv_12= ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) ) | ( () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';' ) | ( () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';' ) | ( () otherlv_12= ';' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt33=1;
                }
                break;
            case 32:
                {
                alt33=2;
                }
                break;
            case 33:
                {
                alt33=3;
                }
                break;
            case 11:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1404:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1404:1: (lv_name_0_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1405:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement2837); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleStatement2854); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                        
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1425:1: ( (lv_statement_2_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1426:1: (lv_statement_2_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1426:1: (lv_statement_2_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1427:3: lv_statement_2_0= ruleStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement2875);
                    lv_statement_2_0=ruleStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"statement",
                            		lv_statement_2_0, 
                            		"Statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1444:6: ( () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1444:6: ( () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1444:7: () otherlv_4= 'break' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1444:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1445:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStatementAccess().getStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleStatement2904); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getBreakKeyword_1_1());
                        
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1454:1: ( (lv_name_5_0= RULE_ID ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1455:1: (lv_name_5_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1455:1: (lv_name_5_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1456:3: lv_name_5_0= RULE_ID
                            {
                            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement2921); 

                            			newLeafNode(lv_name_5_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStatementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_5_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleStatement2939); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1477:6: ( () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1477:6: ( () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1477:7: () otherlv_8= 'continue' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1477:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1478:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStatementAccess().getStatementAction_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleStatement2968); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getContinueKeyword_2_1());
                        
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1487:1: ( (lv_name_9_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1488:1: (lv_name_9_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1488:1: (lv_name_9_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1489:3: lv_name_9_0= RULE_ID
                            {
                            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement2985); 

                            			newLeafNode(lv_name_9_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStatementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_9_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleStatement3003); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1510:6: ( () otherlv_12= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1510:6: ( () otherlv_12= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1510:7: () otherlv_12= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1510:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1511:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStatementAccess().getStatementAction_3_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,11,FOLLOW_11_in_ruleStatement3032); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getSemicolonKeyword_3_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1528:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1529:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1530:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
             newCompositeNode(grammarAccess.getPackage_statementRule()); 
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement3069);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;

             current =iv_rulePackage_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement3079); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage_statement"


    // $ANTLR start "rulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1537:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1540:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1541:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1541:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1541:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_rulePackage_statement3116); 

                	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1545:1: ( (lv_name_1_0= rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1546:1: (lv_name_1_0= rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1546:1: (lv_name_1_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1547:3: lv_name_1_0= rulePackage_name
            {
             
            	        newCompositeNode(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement3137);
            lv_name_1_0=rulePackage_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackage_statementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Package_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_rulePackage_statement3149); 

                	newLeafNode(otherlv_2, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1575:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1576:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1577:2: iv_rulePackage_name= rulePackage_name EOF
            {
             newCompositeNode(grammarAccess.getPackage_nameRule()); 
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name3186);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;

             current =iv_rulePackage_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name3197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage_name"


    // $ANTLR start "rulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1584:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_aux_1 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1587:28: ( (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1588:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1588:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1588:6: this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name3237); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePackage_name_aux_in_rulePackage_name3264);
            this_Package_name_aux_1=rulePackage_name_aux();

            state._fsp--;


            		current.merge(this_Package_name_aux_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1614:1: entryRulePackage_name_aux returns [String current=null] : iv_rulePackage_name_aux= rulePackage_name_aux EOF ;
    public final String entryRulePackage_name_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_aux = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1615:2: (iv_rulePackage_name_aux= rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1616:2: iv_rulePackage_name_aux= rulePackage_name_aux EOF
            {
             newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux3310);
            iv_rulePackage_name_aux=rulePackage_name_aux();

            state._fsp--;

             current =iv_rulePackage_name_aux.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux3321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage_name_aux"


    // $ANTLR start "rulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1623:1: rulePackage_name_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1626:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1627:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1627:1: (kw= '.' this_ID_1= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1628:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_rulePackage_name_aux3359); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            	        
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_aux3374); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage_name_aux"


    // $ANTLR start "entryRuleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1648:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1649:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1650:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
             newCompositeNode(grammarAccess.getImport_statementRule()); 
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement3420);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;

             current =iv_ruleImport_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement3430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport_statement"


    // $ANTLR start "ruleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1657:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_classname_1_0 = null;

        AntlrDatatypeRuleToken lv_packagename_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1660:28: ( (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1661:1: (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1661:1: (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1661:3: otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleImport_statement3467); 

                	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1665:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1665:2: ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1665:2: ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1665:3: ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1665:3: ( (lv_classname_1_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1666:1: (lv_classname_1_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1666:1: (lv_classname_1_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1667:3: lv_classname_1_0= ruleClass_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement3490);
                    lv_classname_1_0=ruleClass_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"classname",
                            		lv_classname_1_0, 
                            		"Class_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleImport_statement3502); 

                        	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:7: ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:7: ( (lv_packagename_3_0= rulePackage_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1689:1: (lv_packagename_3_0= rulePackage_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1689:1: (lv_packagename_3_0= rulePackage_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1690:3: lv_packagename_3_0= rulePackage_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement3531);
                    lv_packagename_3_0=rulePackage_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"packagename",
                            		lv_packagename_3_0, 
                            		"Package_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleImport_statement3543); 

                        	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonSemicolonKeyword_1_1_1());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1719:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1720:2: iv_ruleClass_name= ruleClass_name EOF
            {
             newCompositeNode(grammarAccess.getClass_nameRule()); 
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name3582);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;

             current =iv_ruleClass_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name3593); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass_name"


    // $ANTLR start "ruleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1727:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1730:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1732:5: this_Package_name_0= rulePackage_name
            {
             
                    newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name3639);
            this_Package_name_0=rulePackage_name();

            state._fsp--;


            		current.merge(this_Package_name_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1750:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1751:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1752:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
             newCompositeNode(grammarAccess.getInterface_nameRule()); 
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name3684);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;

             current =iv_ruleInterface_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name3695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface_name"


    // $ANTLR start "ruleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1759:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1762:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:5: this_Package_name_0= rulePackage_name
            {
             
                    newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name3741);
            this_Package_name_0=rulePackage_name();

            state._fsp--;


            		current.merge(this_Package_name_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface_name"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\2\5\2\uffff";
    static final String DFA5_maxS =
        "\2\21\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\6\uffff\1\3\4\uffff\1\2",
            "\1\1\6\uffff\1\3\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "212:3: ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\22\uffff";
    static final String DFA15_eofS =
        "\22\uffff";
    static final String DFA15_minS =
        "\2\5\12\6\1\13\1\6\3\uffff\1\6";
    static final String DFA15_maxS =
        "\2\35\10\25\1\43\2\25\1\6\3\uffff\1\43";
    static final String DFA15_acceptS =
        "\16\uffff\1\2\1\1\1\3\1\uffff";
    static final String DFA15_specialS =
        "\22\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\12\17\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\1\1\12\17\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\16\uffff\1\13",
            "\1\14\14\uffff\1\16\1\uffff\1\13\15\uffff\1\15",
            "\1\14\16\uffff\1\13",
            "\1\17\2\uffff\1\17\4\uffff\1\20\1\uffff\1\17",
            "\1\21",
            "",
            "",
            "",
            "\1\14\16\uffff\1\13\15\uffff\1\15"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "558:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA35_eotS =
        "\6\uffff";
    static final String DFA35_eofS =
        "\6\uffff";
    static final String DFA35_minS =
        "\1\6\1\13\1\6\2\uffff\1\13";
    static final String DFA35_maxS =
        "\1\6\1\45\1\6\2\uffff\1\45";
    static final String DFA35_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA35_specialS =
        "\6\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1",
            "\1\4\27\uffff\1\2\1\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\27\uffff\1\2\1\uffff\1\3"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1665:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.*;;' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleHead130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit221 = new BitSet(new long[]{0x0000001000021032L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit243 = new BitSet(new long[]{0x0000001000021032L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit265 = new BitSet(new long[]{0x0000000000021032L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration354 = new BitSet(new long[]{0x0000000000021030L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration409 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleType_declaration422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_ruleInterface_declaration510 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_ruleInterface_declaration528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration545 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleInterface_declaration563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration584 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleInterface_declaration597 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration618 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleInterface_declaration634 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterface_declaration646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_ruleClass_declaration734 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleClass_declaration752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration769 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_13_in_ruleClass_declaration787 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration808 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleClass_declaration823 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration844 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleClass_declaration857 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration878 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleClass_declaration894 = new BitSet(new long[]{0x000000007FC10870L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration915 = new BitSet(new long[]{0x000000007FC10870L});
    public static final BitSet FOLLOW_16_in_ruleClass_declaration928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1017 = new BitSet(new long[]{0x000000003FC00070L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleField_declaration1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_ruleMethod_declaration1253 = new BitSet(new long[]{0x000000003FC00060L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMethod_declaration1314 = new BitSet(new long[]{0x000000003FD00060L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1335 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethod_declaration1348 = new BitSet(new long[]{0x0000000000208800L});
    public static final BitSet FOLLOW_21_in_ruleMethod_declaration1361 = new BitSet(new long[]{0x0000000000208800L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMethod_declaration1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_ruleConstructor_declaration1511 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1534 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstructor_declaration1551 = new BitSet(new long[]{0x000000003FD00060L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1572 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructor_declaration1585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1698 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleParameter_list1711 = new BitSet(new long[]{0x000000003FC00060L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1732 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1826 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1843 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleParameter1861 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_ruleVariable_declaration1951 = new BitSet(new long[]{0x000000003FC00060L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration1978 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration1999 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_14_in_ruleVariable_declaration2012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2033 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleVariable_declaration2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2135 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVariable_declarator2153 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType2247 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleType2260 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType_specifier2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType_specifier2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType_specifier2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType_specifier2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType_specifier2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType_specifier2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType_specifier2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType_specifier2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStatic_initializer2601 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block2658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatement_block2714 = new BitSet(new long[]{0x0000000300010840L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block2735 = new BitSet(new long[]{0x0000000300010840L});
    public static final BitSet FOLLOW_16_in_ruleStatement_block2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement2837 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStatement2854 = new BitSet(new long[]{0x0000000300000840L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStatement2904 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement2921 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatement2968 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement2985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatement3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement3069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePackage_statement3116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement3137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePackage_statement3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name3186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name3237 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rulePackage_name3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePackage_name_aux3359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_aux3374 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleImport_statement3467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement3490 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImport_statement3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement3531 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleImport_statement3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name3684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name3741 = new BitSet(new long[]{0x0000000000000002L});

}