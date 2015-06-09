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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_ID", "RULE_MOD", "RULE_STATIC", "RULE_TRY", "RULE_CATCH", "RULE_FINALLY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'interface'", "'extends'", "','", "'{'", "'}'", "'class'", "'implements'", "'('", "')'", "'['", "']'", "'[]'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "':'", "'break'", "'continue'", "'switch'", "'case'", "'default'", "'for'", "'while'", "'do'", "'if'", "'else'", "'package'", "'.'", "'import'", "'*'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int RULE_DOC_COMMENT=4;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_STATIC=7;
    public static final int EOF=-1;
    public static final int RULE_MOD=6;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_CATCH=9;
    public static final int RULE_TRY=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;
    public static final int RULE_FINALLY=10;

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead75);
            iv_ruleHead=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHead; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead85); if (state.failed) return current;

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
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_ruleHead130);
            lv_elements_0_0=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit175); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:115:1: ruleCompilation_unit returns [EObject current=null] : ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_type_declarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:118:28: ( ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:1: ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:1: ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:2: () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:119:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:120:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompilation_unitAccess().getCompilation_unitAction_0(),
                          current);
                  
            }

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:125:2: ( (lv_package_1_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:126:1: (lv_package_1_0= rulePackage_statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:126:1: (lv_package_1_0= rulePackage_statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:127:3: lv_package_1_0= rulePackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit230);
                    lv_package_1_0=rulePackage_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
                      	        }
                             		set(
                             			current, 
                             			"package",
                              		lv_package_1_0, 
                              		"Package_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:143:3: ( (lv_imports_2_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==49) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:144:1: (lv_imports_2_0= ruleImport_statement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:144:1: (lv_imports_2_0= ruleImport_statement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:145:3: lv_imports_2_0= ruleImport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit252);
            	    lv_imports_2_0=ruleImport_statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import_statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:161:3: ( (lv_type_declarations_3_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==16||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:162:1: (lv_type_declarations_3_0= ruleType_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:162:1: (lv_type_declarations_3_0= ruleType_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:163:3: lv_type_declarations_3_0= ruleType_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit274);
            	    lv_type_declarations_3_0=ruleType_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"type_declarations",
            	              		lv_type_declarations_3_0, 
            	              		"Type_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:187:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:188:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:189:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration311);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration321); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:196:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:199:28: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:200:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:200:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:200:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:200:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:201:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:201:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:202:3: lv_doc_0_0= RULE_DOC_COMMENT
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_doc_0_0, grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:218:3: ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:218:4: ( (lv_name_1_0= ruleClass_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:218:4: ( (lv_name_1_0= ruleClass_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:219:1: (lv_name_1_0= ruleClass_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:219:1: (lv_name_1_0= ruleClass_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:220:3: lv_name_1_0= ruleClass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration391);
                    lv_name_1_0=ruleClass_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:237:6: ( (lv_name_2_0= ruleInterface_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:237:6: ( (lv_name_2_0= ruleInterface_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:238:1: (lv_name_2_0= ruleInterface_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:238:1: (lv_name_2_0= ruleInterface_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:239:3: lv_name_2_0= ruleInterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration418);
                    lv_name_2_0=ruleInterface_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleType_declaration431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getType_declarationAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:267:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:268:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:269:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration467);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration477); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:276:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleInterface_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_interfaceName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_extend_4_0 = null;

        AntlrDatatypeRuleToken lv_extends_6_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:279:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:280:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:280:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:280:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:280:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_MOD && LA6_0<=RULE_STATIC)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:281:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:281:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:282:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration523);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleInterface_declaration536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:302:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:303:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:303:1: (lv_interfaceName_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:304:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_interfaceName_2_0, grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:320:2: (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:320:4: otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterface_declaration571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:324:1: ( (lv_extend_4_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:325:1: (lv_extend_4_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:325:1: (lv_extend_4_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:326:3: lv_extend_4_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration592);
                    lv_extend_4_0=ruleInterface_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:342:2: (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:342:4: otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleInterface_declaration605); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:346:1: ( (lv_extends_6_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:347:1: (lv_extends_6_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:347:1: (lv_extends_6_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:348:3: lv_extends_6_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration626);
                    	    lv_extends_6_0=ruleInterface_name();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleInterface_declaration642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleInterface_declaration654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:380:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:381:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:382:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration690);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration700); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:389:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' ) ;
    public final EObject ruleClass_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_extend_4_0 = null;

        AntlrDatatypeRuleToken lv_implement_6_0 = null;

        AntlrDatatypeRuleToken lv_implements_8_0 = null;

        EObject lv_fields_10_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:392:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:393:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:393:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:393:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:393:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:394:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:394:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:395:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration746);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleClass_declaration759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:415:1: ( (lv_className_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:416:1: (lv_className_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:416:1: (lv_className_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:417:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_className_2_0, grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:433:2: (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:433:4: otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleClass_declaration794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:437:1: ( (lv_extend_4_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:438:1: (lv_extend_4_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:438:1: (lv_extend_4_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:439:3: lv_extend_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration815);
                    lv_extend_4_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:455:4: (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:455:6: otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleClass_declaration830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:459:1: ( (lv_implement_6_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:460:1: (lv_implement_6_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:460:1: (lv_implement_6_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:461:3: lv_implement_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration851);
                    lv_implement_6_0=ruleInterface_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:477:2: (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:477:4: otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleClass_declaration864); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:481:1: ( (lv_implements_8_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:482:1: (lv_implements_8_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:482:1: (lv_implements_8_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:483:3: lv_implements_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration885);
                    	    lv_implements_8_0=ruleInterface_name();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleClass_declaration901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:503:1: ( (lv_fields_10_0= ruleField_declaration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOC_COMMENT && LA13_0<=RULE_STATIC)||LA13_0==15||(LA13_0>=28 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:504:1: (lv_fields_10_0= ruleField_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:504:1: (lv_fields_10_0= ruleField_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:505:3: lv_fields_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration922);
            	    lv_fields_10_0=ruleField_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleClass_declaration935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:533:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:534:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:535:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration971);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration981); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:542:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:545:28: ( ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:546:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:546:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt16=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA16_2 = input.LA(2);

                if ( ((LA16_2>=RULE_ID && LA16_2<=RULE_STATIC)||(LA16_2>=28 && LA16_2<=35)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==19) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:546:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:546:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:546:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:546:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DOC_COMMENT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:547:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:547:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:548:3: lv_doc_0_0= RULE_DOC_COMMENT
                            {
                            lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1024); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_doc_0_0, grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:564:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    int alt15=3;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:564:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:564:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:565:1: (lv_name_1_0= ruleVariable_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:565:1: (lv_name_1_0= ruleVariable_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:566:3: lv_name_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1052);
                            lv_name_1_0=ruleVariable_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:583:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:583:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:584:1: (lv_name_2_0= ruleConstructor_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:584:1: (lv_name_2_0= ruleConstructor_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:585:3: lv_name_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1079);
                            lv_name_2_0=ruleConstructor_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;
                        case 3 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:602:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:602:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:603:1: (lv_name_3_0= ruleMethod_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:603:1: (lv_name_3_0= ruleMethod_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:604:3: lv_name_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1106);
                            lv_name_3_0=ruleMethod_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:621:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:621:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:622:1: (lv_name_4_0= ruleStatic_initializer )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:622:1: (lv_name_4_0= ruleStatic_initializer )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:623:3: lv_name_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1135);
                    lv_name_4_0=ruleStatic_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:640:6: ( (lv_debug_5_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:640:6: ( (lv_debug_5_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:641:1: (lv_debug_5_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:641:1: (lv_debug_5_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:642:3: lv_debug_5_0= ';'
                    {
                    lv_debug_5_0=(Token)match(input,15,FOLLOW_15_in_ruleField_declaration1159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_debug_5_0, grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getField_declarationRule());
                      	        }
                             		setWithLastConsumed(current, "debug", lv_debug_5_0, ";");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:663:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:664:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:665:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1208);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1218); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:672:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) ) ;
    public final EObject ruleMethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_debug_10_0=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_statement_9_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:675:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:676:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:676:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:676:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:676:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:677:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:677:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:678:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1264);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:694:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:695:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:695:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:696:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1286);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:712:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:713:1: (lv_name_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:713:1: (lv_name_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:714:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMethod_declarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleMethod_declaration1320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:734:1: ( (lv_parameter_4_0= ruleParameter_list ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=28 && LA18_0<=35)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:735:1: (lv_parameter_4_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:735:1: (lv_parameter_4_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:736:3: lv_parameter_4_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1341);
                    lv_parameter_4_0=ruleParameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleMethod_declaration1354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:756:1: ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }
                else if ( (LA19_0==27) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:756:2: (otherlv_6= '[' otherlv_7= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:756:2: (otherlv_6= '[' otherlv_7= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:756:4: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleMethod_declaration1368); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleMethod_declaration1380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:7: otherlv_8= '[]'
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleMethod_declaration1399); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:769:3: ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            else if ( (LA20_0==15) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:769:4: ( (lv_statement_9_0= ruleStatement_block ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:769:4: ( (lv_statement_9_0= ruleStatement_block ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:770:1: (lv_statement_9_0= ruleStatement_block )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:770:1: (lv_statement_9_0= ruleStatement_block )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:771:3: lv_statement_9_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1423);
                    lv_statement_9_0=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_9_0, 
                              		"Statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:788:6: ( (lv_debug_10_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:788:6: ( (lv_debug_10_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:789:1: (lv_debug_10_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:789:1: (lv_debug_10_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:790:3: lv_debug_10_0= ';'
                    {
                    lv_debug_10_0=(Token)match(input,15,FOLLOW_15_in_ruleMethod_declaration1447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_debug_10_0, grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethod_declarationRule());
                      	        }
                             		setWithLastConsumed(current, "debug", lv_debug_10_0, ";");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:811:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:812:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:813:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1497);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1507); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:820:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) ) ;
    public final EObject ruleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:823:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:824:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:824:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:824:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:824:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_MOD && LA21_0<=RULE_STATIC)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:825:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:825:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:826:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1553);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:842:3: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:843:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:843:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:844:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleConstructor_declaration1588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:864:1: ( (lv_parameters_3_0= ruleParameter_list ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=28 && LA22_0<=35)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:865:1: (lv_parameters_3_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:865:1: (lv_parameters_3_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:866:3: lv_parameters_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1609);
                    lv_parameters_3_0=ruleParameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleConstructor_declaration1622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:886:1: ( (lv_statement_5_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:887:1: (lv_statement_5_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:887:1: (lv_statement_5_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:888:3: lv_statement_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1643);
            lv_statement_5_0=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:912:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:913:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:914:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1679);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1689); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:921:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:924:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:925:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:925:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:925:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:925:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:926:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:926:1: (lv_parameter_0_0= ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:927:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1735);
            lv_parameter_0_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:943:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:943:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleParameter_list1748); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:947:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:948:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:948:1: (lv_parameters_2_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:949:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1769);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:973:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:974:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:975:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1807);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1817); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:982:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:985:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:986:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:986:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:986:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:986:2: ( (lv_type_0_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:987:1: (lv_type_0_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:987:1: (lv_type_0_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:988:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter1863);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1004:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1005:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1005:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1006:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1022:2: ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }
                else if ( (LA24_0==27) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1022:3: (otherlv_2= '[' otherlv_3= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1022:3: (otherlv_2= '[' otherlv_3= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1022:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleParameter1899); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleParameter1911); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1031:7: otherlv_4= '[]'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleParameter1930); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1043:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1044:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1045:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1968);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration1978); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1052:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleVariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_names_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1055:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1056:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1056:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1056:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1056:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_MOD && LA25_0<=RULE_STATIC)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1057:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1057:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1058:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration2024);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1074:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1075:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1075:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1076:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration2046);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1092:2: ( (lv_name_2_0= ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1093:1: (lv_name_2_0= ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1093:1: (lv_name_2_0= ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1094:3: lv_name_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2067);
            lv_name_2_0=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1110:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1110:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVariable_declaration2080); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1114:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1115:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1115:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1116:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2101);
            	    lv_names_4_0=ruleVariable_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleVariable_declaration2115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1144:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1145:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1146:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2151);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2161); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1153:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1156:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1157:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1157:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1157:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1157:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1158:1: (lv_name_0_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1158:1: (lv_name_0_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1159:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1175:2: ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }
                else if ( (LA27_0==27) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1175:3: (otherlv_1= '[' otherlv_2= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1175:3: (otherlv_1= '[' otherlv_2= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1175:5: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleVariable_declarator2222); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleVariable_declarator2234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1184:7: otherlv_3= '[]'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleVariable_declarator2253); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleType"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1196:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1197:2: (iv_ruleType= ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1198:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType2291);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2301); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1205:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1208:28: ( ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1209:1: ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1209:1: ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1209:2: ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1209:2: ( (lv_name_0_0= ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1210:1: (lv_name_0_0= ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1210:1: (lv_name_0_0= ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1211:3: lv_name_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType2347);
            lv_name_0_0=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1227:2: ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }
                else if ( (LA28_0==27) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1227:3: (otherlv_1= '[' otherlv_2= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1227:3: (otherlv_1= '[' otherlv_2= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1227:5: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleType2361); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleType2373); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1236:7: otherlv_3= '[]'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleType2392); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1248:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1249:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1250:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier2431);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier2442); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1257:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_8 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1260:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1261:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1261:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt29=1;
                }
                break;
            case 29:
                {
                alt29=2;
                }
                break;
            case 30:
                {
                alt29=3;
                }
                break;
            case 31:
                {
                alt29=4;
                }
                break;
            case 32:
                {
                alt29=5;
                }
                break;
            case 33:
                {
                alt29=6;
                }
                break;
            case 34:
                {
                alt29=7;
                }
                break;
            case 35:
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1262:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleType_specifier2480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1269:2: kw= 'byte'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType_specifier2499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1276:2: kw= 'char'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleType_specifier2518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1283:2: kw= 'short'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleType_specifier2537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1290:2: kw= 'int'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleType_specifier2556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1297:2: kw= 'float'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleType_specifier2575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1304:2: kw= 'long'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleType_specifier2594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1311:2: kw= 'double'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleType_specifier2613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1318:5: this_Class_name_8= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier2641);
                    this_Class_name_8=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Class_name_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleModifier"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1336:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1337:2: (iv_ruleModifier= ruleModifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1338:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier2687);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier2698); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1345:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1348:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1349:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1349:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_MOD) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STATIC) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1349:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier2738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1357:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier2764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STATIC_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STATIC_1, grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1372:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1373:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1374:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2809);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer2819); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1381:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1384:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1385:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1385:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1385:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1385:2: ( (lv_static_0_0= RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1386:1: (lv_static_0_0= RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1386:1: (lv_static_0_0= RULE_STATIC )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1387:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer2861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_static_0_0, grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatic_initializerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"static",
                      		lv_static_0_0, 
                      		"STATIC");
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1403:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1404:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1404:1: (lv_name_1_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1405:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer2887);
            lv_name_1_0=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1429:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1430:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1431:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block2923);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block2933); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1438:1: ruleStatement_block returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1441:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1442:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1442:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1442:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1442:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1443:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatement_blockAccess().getStatement_blockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStatement_block2979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1452:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_TRY)||LA31_0==15||LA31_0==19||(LA31_0>=28 && LA31_0<=35)||(LA31_0>=37 && LA31_0<=39)||(LA31_0>=42 && LA31_0<=45)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1453:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1453:1: (lv_statements_2_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1454:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block3000);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleStatement_block3013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1482:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1483:2: (iv_ruleStatement= ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1484:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3049);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3059); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:1: ruleStatement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | this_Statement_block_6= ruleStatement_block | ( (lv_try_7_0= ruleTry_statement ) ) | ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' ) | ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' ) | ( () otherlv_20= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_variable_0_0 = null;

        EObject lv_ifStatement_1_0 = null;

        EObject lv_doStatement_2_0 = null;

        EObject lv_whileStatement_3_0 = null;

        EObject lv_forStatement_4_0 = null;

        EObject lv_switchStatement_5_0 = null;

        EObject this_Statement_block_6 = null;

        EObject lv_try_7_0 = null;

        EObject lv_statement_10_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1494:28: ( ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | this_Statement_block_6= ruleStatement_block | ( (lv_try_7_0= ruleTry_statement ) ) | ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' ) | ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' ) | ( () otherlv_20= ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:1: ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | this_Statement_block_6= ruleStatement_block | ( (lv_try_7_0= ruleTry_statement ) ) | ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' ) | ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' ) | ( () otherlv_20= ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:1: ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | this_Statement_block_6= ruleStatement_block | ( (lv_try_7_0= ruleTry_statement ) ) | ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' ) | ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' ) | ( () otherlv_20= ';' ) )
            int alt34=12;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:2: ( (lv_variable_0_0= ruleVariable_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:2: ( (lv_variable_0_0= ruleVariable_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1496:1: (lv_variable_0_0= ruleVariable_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1496:1: (lv_variable_0_0= ruleVariable_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1497:3: lv_variable_0_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariableVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleStatement3105);
                    lv_variable_0_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_0_0, 
                              		"Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1514:6: ( (lv_ifStatement_1_0= ruleIf_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1514:6: ( (lv_ifStatement_1_0= ruleIf_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1515:1: (lv_ifStatement_1_0= ruleIf_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1515:1: (lv_ifStatement_1_0= ruleIf_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1516:3: lv_ifStatement_1_0= ruleIf_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_StatementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_Statement_in_ruleStatement3132);
                    lv_ifStatement_1_0=ruleIf_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifStatement",
                              		lv_ifStatement_1_0, 
                              		"If_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1533:6: ( (lv_doStatement_2_0= ruleDo_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1533:6: ( (lv_doStatement_2_0= ruleDo_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1534:1: (lv_doStatement_2_0= ruleDo_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1534:1: (lv_doStatement_2_0= ruleDo_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1535:3: lv_doStatement_2_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDo_Statement_in_ruleStatement3159);
                    lv_doStatement_2_0=ruleDo_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"doStatement",
                              		lv_doStatement_2_0, 
                              		"Do_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1552:6: ( (lv_whileStatement_3_0= ruleWhile_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1552:6: ( (lv_whileStatement_3_0= ruleWhile_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1553:1: (lv_whileStatement_3_0= ruleWhile_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1553:1: (lv_whileStatement_3_0= ruleWhile_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1554:3: lv_whileStatement_3_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_Statement_in_ruleStatement3186);
                    lv_whileStatement_3_0=ruleWhile_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whileStatement",
                              		lv_whileStatement_3_0, 
                              		"While_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1571:6: ( (lv_forStatement_4_0= ruleFor_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1571:6: ( (lv_forStatement_4_0= ruleFor_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1572:1: (lv_forStatement_4_0= ruleFor_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1572:1: (lv_forStatement_4_0= ruleFor_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1573:3: lv_forStatement_4_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_Statement_in_ruleStatement3213);
                    lv_forStatement_4_0=ruleFor_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forStatement",
                              		lv_forStatement_4_0, 
                              		"For_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1590:6: ( (lv_switchStatement_5_0= ruleSwitch_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1590:6: ( (lv_switchStatement_5_0= ruleSwitch_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1591:1: (lv_switchStatement_5_0= ruleSwitch_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1591:1: (lv_switchStatement_5_0= ruleSwitch_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1592:3: lv_switchStatement_5_0= ruleSwitch_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitch_Statement_in_ruleStatement3240);
                    lv_switchStatement_5_0=ruleSwitch_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"switchStatement",
                              		lv_switchStatement_5_0, 
                              		"Switch_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1610:5: this_Statement_block_6= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleStatement3268);
                    this_Statement_block_6=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_block_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1619:6: ( (lv_try_7_0= ruleTry_statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1619:6: ( (lv_try_7_0= ruleTry_statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1620:1: (lv_try_7_0= ruleTry_statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1620:1: (lv_try_7_0= ruleTry_statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1621:3: lv_try_7_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryTry_statementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTry_statement_in_ruleStatement3294);
                    lv_try_7_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"try",
                              		lv_try_7_0, 
                              		"Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1638:6: ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1638:6: ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1638:7: ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1638:7: ( (lv_name_8_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1639:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1639:1: (lv_name_8_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1640:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_8_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_8_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_8_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleStatement3335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getColonKeyword_8_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1660:1: ( (lv_statement_10_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1661:1: (lv_statement_10_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1661:1: (lv_statement_10_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1662:3: lv_statement_10_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3356);
                    lv_statement_10_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_10_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1679:6: ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1679:6: ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1679:7: () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1679:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1680:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleStatement3385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getBreakKeyword_9_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1689:1: ( (lv_name_13_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1690:1: (lv_name_13_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1690:1: (lv_name_13_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1691:3: lv_name_13_0= RULE_ID
                            {
                            lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3402); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_13_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_9_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_13_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleStatement3420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1712:6: ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1712:6: ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1712:7: () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1712:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1713:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleStatement3449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getContinueKeyword_10_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1722:1: ( (lv_name_17_0= RULE_ID ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1723:1: (lv_name_17_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1723:1: (lv_name_17_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1724:3: lv_name_17_0= RULE_ID
                            {
                            lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3466); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_17_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_10_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_17_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleStatement3484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:6: ( () otherlv_20= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:6: ( () otherlv_20= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:7: () otherlv_20= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1746:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleStatement3513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getSemicolonKeyword_11_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSwitch_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1763:1: entryRuleSwitch_Statement returns [EObject current=null] : iv_ruleSwitch_Statement= ruleSwitch_Statement EOF ;
    public final EObject entryRuleSwitch_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:2: (iv_ruleSwitch_Statement= ruleSwitch_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1765:2: iv_ruleSwitch_Statement= ruleSwitch_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_Statement_in_entryRuleSwitch_Statement3550);
            iv_ruleSwitch_Statement=ruleSwitch_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_Statement3560); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitch_Statement"


    // $ANTLR start "ruleSwitch_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1772:1: ruleSwitch_Statement returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | (otherlv_7= 'default' otherlv_8= ':' ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleSwitch_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_statements_9_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1775:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | (otherlv_7= 'default' otherlv_8= ':' ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1776:1: ( () otherlv_1= 'switch' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | (otherlv_7= 'default' otherlv_8= ':' ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1776:1: ( () otherlv_1= 'switch' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | (otherlv_7= 'default' otherlv_8= ':' ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1776:2: () otherlv_1= 'switch' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | (otherlv_7= 'default' otherlv_8= ':' ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1776:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1777:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitch_StatementAccess().getSwitch_StatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleSwitch_Statement3606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_StatementAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSwitch_Statement3618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitch_StatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleSwitch_Statement3630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitch_StatementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSwitch_Statement3642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitch_StatementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1798:1: ( (otherlv_5= 'case' otherlv_6= ':' ) | (otherlv_7= 'default' otherlv_8= ':' ) | ( (lv_statements_9_0= ruleStatement ) ) )*
            loop35:
            do {
                int alt35=4;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt35=1;
                    }
                    break;
                case 41:
                    {
                    alt35=2;
                    }
                    break;
                case RULE_ID:
                case RULE_MOD:
                case RULE_STATIC:
                case RULE_TRY:
                case 15:
                case 19:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 44:
                case 45:
                    {
                    alt35=3;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1798:2: (otherlv_5= 'case' otherlv_6= ':' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1798:2: (otherlv_5= 'case' otherlv_6= ':' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1798:4: otherlv_5= 'case' otherlv_6= ':'
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleSwitch_Statement3656); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSwitch_StatementAccess().getCaseKeyword_5_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleSwitch_Statement3668); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSwitch_StatementAccess().getColonKeyword_5_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1807:6: (otherlv_7= 'default' otherlv_8= ':' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1807:6: (otherlv_7= 'default' otherlv_8= ':' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1807:8: otherlv_7= 'default' otherlv_8= ':'
            	    {
            	    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleSwitch_Statement3688); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSwitch_StatementAccess().getDefaultKeyword_5_1_0());
            	          
            	    }
            	    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleSwitch_Statement3700); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSwitch_StatementAccess().getColonKeyword_5_1_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1816:6: ( (lv_statements_9_0= ruleStatement ) )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1816:6: ( (lv_statements_9_0= ruleStatement ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1817:1: (lv_statements_9_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1817:1: (lv_statements_9_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1818:3: lv_statements_9_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getStatementsStatementParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitch_Statement3728);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_StatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_9_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleSwitch_Statement3742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSwitch_StatementAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitch_Statement"


    // $ANTLR start "entryRuleFor_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1846:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1847:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement3778);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor_Statement3788); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor_Statement"


    // $ANTLR start "ruleFor_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1855:1: ruleFor_Statement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) ) otherlv_4= ';' otherlv_5= ';' otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pv_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_variable_2_0 = null;

        EObject lv_statement_7_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1858:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) ) otherlv_4= ';' otherlv_5= ';' otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1859:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) ) otherlv_4= ';' otherlv_5= ';' otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1859:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) ) otherlv_4= ';' otherlv_5= ';' otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1859:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) ) otherlv_4= ';' otherlv_5= ';' otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFor_Statement3825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_StatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleFor_Statement3837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFor_StatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1867:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STATIC)||(LA36_0>=28 && LA36_0<=35)) ) {
                alt36=1;
            }
            else if ( (LA36_0==15) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1867:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1867:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1868:1: (lv_variable_2_0= ruleVariable_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1868:1: (lv_variable_2_0= ruleVariable_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1869:3: lv_variable_2_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleFor_Statement3859);
                    lv_variable_2_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_2_0, 
                              		"Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1886:6: ( (lv_pv_3_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1886:6: ( (lv_pv_3_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1887:1: (lv_pv_3_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1887:1: (lv_pv_3_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1888:3: lv_pv_3_0= ';'
                    {
                    lv_pv_3_0=(Token)match(input,15,FOLLOW_15_in_ruleFor_Statement3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_pv_3_0, grammarAccess.getFor_StatementAccess().getPvSemicolonKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFor_StatementRule());
                      	        }
                             		setWithLastConsumed(current, "pv", lv_pv_3_0, ";");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFor_Statement3909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFor_Statement3921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleFor_Statement3933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFor_StatementAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1913:1: ( (lv_statement_7_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1914:1: (lv_statement_7_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1914:1: (lv_statement_7_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1915:3: lv_statement_7_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getStatementStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor_Statement3954);
            lv_statement_7_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_7_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFor_Statement"


    // $ANTLR start "entryRuleWhile_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1939:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1940:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1941:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement3990);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement4000); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile_Statement"


    // $ANTLR start "ruleWhile_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1948:1: ruleWhile_Statement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1951:28: ( (otherlv_0= 'while' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1952:1: (otherlv_0= 'while' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1952:1: (otherlv_0= 'while' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1952:3: otherlv_0= 'while' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWhile_Statement4037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_StatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleWhile_Statement4049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_StatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleWhile_Statement4061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1964:1: ( (lv_statement_3_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1965:1: (lv_statement_3_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1965:1: (lv_statement_3_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1966:3: lv_statement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile_Statement4082);
            lv_statement_3_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_3_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhile_Statement"


    // $ANTLR start "entryRuleDo_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1990:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1991:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1992:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement4118);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement4128); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDo_Statement"


    // $ANTLR start "ruleDo_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1999:1: ruleDo_Statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statement_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2002:28: ( (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2003:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2003:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2003:3: otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDo_Statement4165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_StatementAccess().getDoKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2007:1: ( (lv_statement_1_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2008:1: (lv_statement_1_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2008:1: (lv_statement_1_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2009:3: lv_statement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDo_Statement4186);
            lv_statement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleDo_Statement4198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_StatementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDo_Statement4210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDo_StatementAccess().getLeftParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleDo_Statement4222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDo_StatementAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDo_Statement4234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_StatementAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDo_Statement"


    // $ANTLR start "entryRuleIf_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2049:1: entryRuleIf_Statement returns [EObject current=null] : iv_ruleIf_Statement= ruleIf_Statement EOF ;
    public final EObject entryRuleIf_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2050:2: (iv_ruleIf_Statement= ruleIf_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2051:2: iv_ruleIf_Statement= ruleIf_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_Statement_in_entryRuleIf_Statement4270);
            iv_ruleIf_Statement=ruleIf_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_Statement4280); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf_Statement"


    // $ANTLR start "ruleIf_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2058:1: ruleIf_Statement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2061:28: ( (otherlv_0= 'if' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2062:1: (otherlv_0= 'if' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2062:1: (otherlv_0= 'if' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2062:3: otherlv_0= 'if' otherlv_1= '(' otherlv_2= ')' ( (lv_statement_3_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleIf_Statement4317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_StatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleIf_Statement4329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIf_StatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleIf_Statement4341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIf_StatementAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2074:1: ( (lv_statement_3_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2075:1: (lv_statement_3_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2075:1: (lv_statement_3_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2076:3: lv_statement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_StatementAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf_Statement4362);
            lv_statement_3_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_3_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2092:2: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred1_InternalJava()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2092:3: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_elseStatement_5_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2092:3: ( ( 'else' )=>otherlv_4= 'else' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2092:4: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleIf_Statement4383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIf_StatementAccess().getElseKeyword_4_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2097:2: ( (lv_elseStatement_5_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2098:1: (lv_elseStatement_5_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2098:1: (lv_elseStatement_5_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2099:3: lv_elseStatement_5_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_StatementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf_Statement4405);
                    lv_elseStatement_5_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_5_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIf_Statement"


    // $ANTLR start "entryRuleTry_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2123:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2124:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2125:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement4443);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement4453); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTry_statement"


    // $ANTLR start "ruleTry_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2132:1: ruleTry_statement returns [EObject current=null] : ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) ;
    public final EObject ruleTry_statement() throws RecognitionException {
        EObject current = null;

        Token lv_try_0_0=null;
        Token lv_catchs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_finally_7_0=null;
        EObject lv_tryStatement_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatements_6_0 = null;

        EObject lv_finallyStatement_8_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2135:28: ( ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2136:1: ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2136:1: ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2136:2: ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2136:2: ( (lv_try_0_0= RULE_TRY ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2137:1: (lv_try_0_0= RULE_TRY )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2137:1: (lv_try_0_0= RULE_TRY )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2138:3: lv_try_0_0= RULE_TRY
            {
            lv_try_0_0=(Token)match(input,RULE_TRY,FOLLOW_RULE_TRY_in_ruleTry_statement4495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_try_0_0, grammarAccess.getTry_statementAccess().getTryTRYTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTry_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"try",
                      		lv_try_0_0, 
                      		"TRY");
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2154:2: ( (lv_tryStatement_1_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2155:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2155:1: (lv_tryStatement_1_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2156:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement4521);
            lv_tryStatement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
              	        }
                     		set(
                     			current, 
                     			"tryStatement",
                      		lv_tryStatement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2172:2: ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_CATCH) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred2_InternalJava()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2172:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2172:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2172:4: ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2178:1: (lv_catchs_2_0= RULE_CATCH )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2179:3: lv_catchs_2_0= RULE_CATCH
            	    {
            	    lv_catchs_2_0=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_ruleTry_statement4550); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_catchs_2_0, grammarAccess.getTry_statementAccess().getCatchsCATCHTerminalRuleCall_2_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"catchs",
            	              		lv_catchs_2_0, 
            	              		"CATCH");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTry_statement4567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2199:1: ( (lv_parameters_4_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2200:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2200:1: (lv_parameters_4_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2201:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTry_statement4588);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_4_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleTry_statement4600); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2221:1: ( (lv_catchStatements_6_0= ruleStatement ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2222:1: (lv_catchStatements_6_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2222:1: (lv_catchStatements_6_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2223:3: lv_catchStatements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement4621);
            	    lv_catchStatements_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catchStatements",
            	              		lv_catchStatements_6_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:4: ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_FINALLY) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred3_InternalJava()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:6: ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2245:1: (lv_finally_7_0= RULE_FINALLY )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2246:3: lv_finally_7_0= RULE_FINALLY
                    {
                    lv_finally_7_0=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_ruleTry_statement4652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_finally_7_0, grammarAccess.getTry_statementAccess().getFinallyFINALLYTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTry_statementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"finally",
                              		lv_finally_7_0, 
                              		"FINALLY");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2262:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2263:1: (lv_finallyStatement_8_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2263:1: (lv_finallyStatement_8_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2264:3: lv_finallyStatement_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement4678);
                    lv_finallyStatement_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyStatement",
                              		lv_finallyStatement_8_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTry_statement"


    // $ANTLR start "entryRulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2288:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2289:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2290:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement4716);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement4726); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2297:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2300:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2301:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2301:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2301:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulePackage_statement4763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2305:1: ( (lv_name_1_0= rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2306:1: (lv_name_1_0= rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2306:1: (lv_name_1_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2307:3: lv_name_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement4784);
            lv_name_1_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePackage_statement4796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2335:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2336:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2337:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name4833);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name4844); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2344:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_aux_1 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2347:28: ( (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2348:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2348:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2348:6: this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name4884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_rulePackage_name4911);
            this_Package_name_aux_1=rulePackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_aux_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2374:1: entryRulePackage_name_aux returns [String current=null] : iv_rulePackage_name_aux= rulePackage_name_aux EOF ;
    public final String entryRulePackage_name_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_aux = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2375:2: (iv_rulePackage_name_aux= rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2376:2: iv_rulePackage_name_aux= rulePackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux4957);
            iv_rulePackage_name_aux=rulePackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux4968); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2383:1: rulePackage_name_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2386:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2387:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2387:1: (kw= '.' this_ID_1= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==48) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2388:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_rulePackage_name_aux5006); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_aux5021); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage_name_aux"


    // $ANTLR start "entryRuleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2408:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2409:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2410:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement5067);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement5077); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2417:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_classname_1_0 = null;

        AntlrDatatypeRuleToken lv_packagename_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2420:28: ( (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2421:1: (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2421:1: (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2421:3: otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleImport_statement5114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:2: ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:2: ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:3: ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:3: ( (lv_classname_1_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2426:1: (lv_classname_1_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2426:1: (lv_classname_1_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2427:3: lv_classname_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement5137);
                    lv_classname_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport_statement5149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2448:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2448:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2448:7: ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2448:7: ( (lv_packagename_3_0= rulePackage_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2449:1: (lv_packagename_3_0= rulePackage_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2449:1: (lv_packagename_3_0= rulePackage_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2450:3: lv_packagename_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement5178);
                    lv_packagename_3_0=rulePackage_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleImport_statement5190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopKeyword_1_1_1());
                          
                    }
                    otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleImport_statement5202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getImport_statementAccess().getAsteriskKeyword_1_1_2());
                          
                    }
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleImport_statement5214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_1_3());
                          
                    }
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleImport_statement5226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_1_4());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2490:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2491:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2492:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name5265);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name5276); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2499:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2502:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2504:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name5322);
            this_Package_name_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2522:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2523:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2524:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name5367);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name5378); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2531:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2534:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2536:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name5424);
            this_Package_name_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface_name"

    // $ANTLR start synpred1_InternalJava
    public final void synpred1_InternalJava_fragment() throws RecognitionException {   
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2092:4: ( 'else' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2092:6: 'else'
        {
        match(input,46,FOLLOW_46_in_synpred1_InternalJava4375); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJava

    // $ANTLR start synpred2_InternalJava
    public final void synpred2_InternalJava_fragment() throws RecognitionException {   
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2172:4: ( ( RULE_CATCH ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2173:1: ( RULE_CATCH )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2173:1: ( RULE_CATCH )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2174:1: RULE_CATCH
        {
        match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_synpred2_InternalJava4536); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalJava

    // $ANTLR start synpred3_InternalJava
    public final void synpred3_InternalJava_fragment() throws RecognitionException {   
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:6: ( ( RULE_FINALLY ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2240:1: ( RULE_FINALLY )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2240:1: ( RULE_FINALLY )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2241:1: RULE_FINALLY
        {
        match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_synpred3_InternalJava4638); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalJava

    // Delegated rules

    public final boolean synpred3_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\6\2\uffff";
    static final String DFA5_maxS =
        "\3\25\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\10\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\10\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\10\uffff\1\4\4\uffff\1\3",
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
            return "218:3: ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\25\uffff";
    static final String DFA15_eofS =
        "\25\uffff";
    static final String DFA15_minS =
        "\14\5\1\32\1\5\1\17\1\uffff\2\5\2\uffff\1\5";
    static final String DFA15_maxS =
        "\3\43\10\33\1\60\1\32\2\33\1\uffff\1\5\1\33\2\uffff\1\60";
    static final String DFA15_acceptS =
        "\17\uffff\1\2\2\uffff\1\3\1\1\1\uffff";
    static final String DFA15_specialS =
        "\25\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\13\1\1\1\2\24\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\1\1\1\2\24\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\1\1\1\2\24\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\16\21\uffff\1\17\1\uffff\1\14\1\uffff\1\15\24\uffff\1\20",
            "\1\21",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "\1\23\2\uffff\1\23\4\uffff\1\22\1\uffff\1\23\1\uffff\1\23",
            "",
            "\1\24",
            "\1\16\23\uffff\1\14\1\uffff\1\15",
            "",
            "",
            "\1\16\23\uffff\1\14\1\uffff\1\15\24\uffff\1\20"
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
            return "564:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\16\uffff";
    static final String DFA34_minS =
        "\1\5\1\uffff\1\5\13\uffff";
    static final String DFA34_maxS =
        "\1\55\1\uffff\1\60\13\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14"+
        "\1\11";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\2\1\1\11\6\uffff\1\14\3\uffff\1\10\10\uffff\10\1\1\uffff"+
            "\1\12\1\13\1\7\2\uffff\1\6\1\5\1\4\1\3",
            "",
            "\1\1\23\uffff\1\1\1\uffff\1\1\10\uffff\1\15\13\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1495:1: ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | this_Statement_block_6= ruleStatement_block | ( (lv_try_7_0= ruleTry_statement ) ) | ( ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'break' ( (lv_name_13_0= RULE_ID ) )? otherlv_14= ';' ) | ( () otherlv_16= 'continue' ( (lv_name_17_0= RULE_ID ) )? otherlv_18= ';' ) | ( () otherlv_20= ';' ) )";
        }
    }
    static final String DFA41_eotS =
        "\6\uffff";
    static final String DFA41_eofS =
        "\6\uffff";
    static final String DFA41_minS =
        "\1\5\1\17\1\5\1\uffff\1\17\1\uffff";
    static final String DFA41_maxS =
        "\1\5\1\60\1\62\1\uffff\1\60\1\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA41_specialS =
        "\6\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1",
            "\1\3\40\uffff\1\2",
            "\1\4\54\uffff\1\5",
            "",
            "\1\3\40\uffff\1\2",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2425:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleHead130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit230 = new BitSet(new long[]{0x00020000002100D2L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit252 = new BitSet(new long[]{0x00020000002100D2L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit274 = new BitSet(new long[]{0x00000000002100D2L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration363 = new BitSet(new long[]{0x00000000002100D0L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration391 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration418 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleType_declaration431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface_declaration523 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_16_in_ruleInterface_declaration536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration553 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleInterface_declaration571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration592 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleInterface_declaration605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration626 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleInterface_declaration642 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterface_declaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass_declaration746 = new BitSet(new long[]{0x00000000002000C0L});
    public static final BitSet FOLLOW_21_in_ruleClass_declaration759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration776 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_17_in_ruleClass_declaration794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration815 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleClass_declaration830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration851 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleClass_declaration864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration885 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleClass_declaration901 = new BitSet(new long[]{0x0000000FF01080F0L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration922 = new BitSet(new long[]{0x0000000FF01080F0L});
    public static final BitSet FOLLOW_20_in_ruleClass_declaration935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1024 = new BitSet(new long[]{0x0000000FF00000F0L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleField_declaration1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod_declaration1264 = new BitSet(new long[]{0x0000000FF00000E0L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1303 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMethod_declaration1320 = new BitSet(new long[]{0x0000000FF10000E0L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1341 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMethod_declaration1354 = new BitSet(new long[]{0x000000000A088000L});
    public static final BitSet FOLLOW_25_in_ruleMethod_declaration1368 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMethod_declaration1380 = new BitSet(new long[]{0x000000000A088000L});
    public static final BitSet FOLLOW_27_in_ruleMethod_declaration1399 = new BitSet(new long[]{0x000000000A088000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMethod_declaration1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructor_declaration1553 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1571 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConstructor_declaration1588 = new BitSet(new long[]{0x0000000FF10000E0L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1609 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstructor_declaration1622 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1735 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParameter_list1748 = new BitSet(new long[]{0x0000000FF00000E0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1769 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1880 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_25_in_ruleParameter1899 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParameter1911 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_27_in_ruleParameter1930 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariable_declaration2024 = new BitSet(new long[]{0x0000000FF00000E0L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration2046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2067 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariable_declaration2080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2101 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleVariable_declaration2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2203 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_25_in_ruleVariable_declarator2222 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVariable_declarator2234 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_27_in_ruleVariable_declarator2253 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType2347 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_25_in_ruleType2361 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleType2373 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_27_in_ruleType2392 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType_specifier2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType_specifier2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleType_specifier2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType_specifier2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType_specifier2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType_specifier2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType_specifier2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType_specifier2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier2687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_ruleModifier2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleModifier2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleStatic_initializer2861 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block2923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStatement_block2979 = new BitSet(new long[]{0x00003CEFF01881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block3000 = new BitSet(new long[]{0x00003CEFF01881E0L});
    public static final BitSet FOLLOW_20_in_ruleStatement_block3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleStatement3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_Statement_in_ruleStatement3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_ruleStatement3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_ruleStatement3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_ruleStatement3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_Statement_in_ruleStatement3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatement3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_ruleStatement3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3318 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleStatement3335 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStatement3385 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStatement3449 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3466 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatement3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatement3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_Statement_in_entryRuleSwitch_Statement3550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_Statement3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSwitch_Statement3606 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSwitch_Statement3618 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSwitch_Statement3630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSwitch_Statement3642 = new BitSet(new long[]{0x00003FEFF01881E0L});
    public static final BitSet FOLLOW_40_in_ruleSwitch_Statement3656 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSwitch_Statement3668 = new BitSet(new long[]{0x00003FEFF01881E0L});
    public static final BitSet FOLLOW_41_in_ruleSwitch_Statement3688 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSwitch_Statement3700 = new BitSet(new long[]{0x00003FEFF01881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitch_Statement3728 = new BitSet(new long[]{0x00003FEFF01881E0L});
    public static final BitSet FOLLOW_20_in_ruleSwitch_Statement3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement3778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor_Statement3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFor_Statement3825 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFor_Statement3837 = new BitSet(new long[]{0x0000000FF00080E0L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleFor_Statement3859 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFor_Statement3883 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFor_Statement3909 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFor_Statement3921 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFor_Statement3933 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor_Statement3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement3990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWhile_Statement4037 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhile_Statement4049 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWhile_Statement4061 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile_Statement4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement4118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDo_Statement4165 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo_Statement4186 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDo_Statement4198 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDo_Statement4210 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDo_Statement4222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDo_Statement4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_Statement_in_entryRuleIf_Statement4270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_Statement4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleIf_Statement4317 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIf_Statement4329 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIf_Statement4341 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_Statement4362 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleIf_Statement4383 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_Statement4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement4443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRY_in_ruleTry_statement4495 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement4521 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_RULE_CATCH_in_ruleTry_statement4550 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTry_statement4567 = new BitSet(new long[]{0x0000000FF00000E0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTry_statement4588 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTry_statement4600 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement4621 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_ruleTry_statement4652 = new BitSet(new long[]{0x00003CEFF00881E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement4716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePackage_statement4763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement4784 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage_statement4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name4833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name4884 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rulePackage_name4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux4957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePackage_name_aux5006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_aux5021 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement5067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleImport_statement5114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement5137 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport_statement5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement5178 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleImport_statement5190 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleImport_statement5202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport_statement5214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport_statement5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name5265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name5367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred1_InternalJava4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_synpred2_InternalJava4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_synpred3_InternalJava4638 = new BitSet(new long[]{0x0000000000000002L});

}