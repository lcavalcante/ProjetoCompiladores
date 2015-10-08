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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_EOL", "RULE_INTERFACE", "RULE_ID", "RULE_EXTENDS", "RULE_COMMA", "RULE_R_CURLY_BRACE", "RULE_L_CURLY_BRACE", "RULE_RIGHT_PARENTHESIS", "RULE_LEFT_PARENTHESIS", "RULE_R_ABS", "RULE_L_ABS", "RULE_ABS", "RULE_EQUAL", "RULE_NULL", "RULE_SUPER", "RULE_THIS", "RULE_INSTANCEOF", "RULE_INCREMENT", "RULE_DECREMENT", "RULE_PLUS", "RULE_PLUS_EQUAL", "RULE_MINUS", "RULE_MINUS_EQUAL", "RULE_MULTIPLY", "RULE_MULTIPLY_EQUAL", "RULE_DIVIDE", "RULE_DIVIDE_EQUAL", "RULE_MODULE", "RULE_MODULE_EQUAL", "RULE_BT", "RULE_ST", "RULE_BE", "RULE_SE", "RULE_DOUBLE_EQUAL", "RULE_DIFFERENT", "RULE_OR", "RULE_OR_EQUAL", "RULE_EXP", "RULE_EXP_EQUAL", "RULE_DOUBLE_OR_EQUAL", "RULE_WAT", "RULE_COLON", "RULE_R_SHIFT_EQUAL", "RULE_L_SHIFT", "RULE_R_SHIFT", "RULE_SUPER_SHIFT", "RULE_AMPERSAND", "RULE_DECIMAL_DIGITS", "RULE_FLOAT_TYPE_SUFIX", "RULE_HEXA", "RULE_LONG", "RULE_STRING", "RULE_CHAR", "RULE_NEW", "RULE_NOT", "RULE_EXCLAMATION", "RULE_TRUE", "RULE_FALSE", "RULE_MOD", "RULE_STATIC", "RULE_SWITCH", "RULE_CASE", "RULE_DEFAULT", "RULE_FOR", "RULE_WHILE", "RULE_DO", "RULE_IF", "RULE_ELSE", "RULE_RETURN", "RULE_TRY", "RULE_CATCH", "RULE_FINALLY", "RULE_PACKAGE", "RULE_IMPORT", "RULE_EXPONENTIAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'implements'", "'.'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'void'", "'break'", "'continue'"
    };
    public static final int RULE_EXP=42;
    public static final int RULE_R_ABS=14;
    public static final int RULE_MINUS_EQUAL=27;
    public static final int RULE_LEFT_PARENTHESIS=13;
    public static final int RULE_PLUS_EQUAL=25;
    public static final int RULE_OR=40;
    public static final int RULE_WHILE=69;
    public static final int RULE_ID=7;
    public static final int RULE_EQUAL=17;
    public static final int RULE_MOD=63;
    public static final int RULE_RETURN=73;
    public static final int RULE_EOL=5;
    public static final int RULE_R_CURLY_BRACE=10;
    public static final int RULE_THIS=20;
    public static final int RULE_DOUBLE_OR_EQUAL=44;
    public static final int RULE_HEXA=54;
    public static final int RULE_COLON=46;
    public static final int RULE_L_CURLY_BRACE=11;
    public static final int RULE_ML_COMMENT=80;
    public static final int RULE_FALSE=62;
    public static final int RULE_WAT=45;
    public static final int RULE_L_ABS=15;
    public static final int RULE_IMPORT=78;
    public static final int RULE_DIVIDE=30;
    public static final int RULE_DECIMAL_DIGITS=52;
    public static final int RULE_DEFAULT=67;
    public static final int RULE_IF=71;
    public static final int RULE_FLOAT_TYPE_SUFIX=53;
    public static final int RULE_STATIC=64;
    public static final int RULE_SUPER_SHIFT=50;
    public static final int RULE_EXCLAMATION=60;
    public static final int RULE_BT=34;
    public static final int RULE_SE=37;
    public static final int RULE_INSTANCEOF=21;
    public static final int RULE_MODULE_EQUAL=33;
    public static final int RULE_AMPERSAND=51;
    public static final int RULE_SWITCH=65;
    public static final int RULE_BE=36;
    public static final int RULE_DIFFERENT=39;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int RULE_NEW=58;
    public static final int T__90=90;
    public static final int RULE_CATCH=75;
    public static final int RULE_CHAR=57;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_ST=35;
    public static final int RULE_INCREMENT=22;
    public static final int RULE_L_SHIFT=48;
    public static final int RULE_EXPONENTIAL=79;
    public static final int RULE_SUPER=19;
    public static final int RULE_COMMA=9;
    public static final int RULE_EXTENDS=8;
    public static final int RULE_DOUBLE_EQUAL=38;
    public static final int RULE_INTERFACE=6;
    public static final int RULE_DOC_COMMENT=4;
    public static final int RULE_MULTIPLY=28;
    public static final int RULE_MULTIPLY_EQUAL=29;
    public static final int RULE_CASE=66;
    public static final int RULE_DO=70;
    public static final int RULE_ABS=16;
    public static final int RULE_FINALLY=76;
    public static final int RULE_PACKAGE=77;
    public static final int RULE_ELSE=72;
    public static final int RULE_R_SHIFT_EQUAL=47;
    public static final int RULE_R_SHIFT=49;
    public static final int RULE_EXP_EQUAL=43;
    public static final int RULE_STRING=56;
    public static final int RULE_NOT=59;
    public static final int RULE_NULL=18;
    public static final int RULE_OR_EQUAL=41;
    public static final int RULE_SL_COMMENT=81;
    public static final int RULE_DIVIDE_EQUAL=31;
    public static final int RULE_TRUE=61;
    public static final int RULE_PLUS=24;
    public static final int RULE_DECREMENT=23;
    public static final int RULE_FOR=68;
    public static final int EOF=-1;
    public static final int RULE_RIGHT_PARENTHESIS=12;
    public static final int RULE_TRY=74;
    public static final int RULE_WS=82;
    public static final int RULE_ANY_OTHER=83;
    public static final int RULE_MINUS=26;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_LONG=55;
    public static final int RULE_MODULE=32;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:73:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:74:2: (iv_ruleHead= ruleHead EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:75:2: iv_ruleHead= ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead81);
            iv_ruleHead=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHead; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead91); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:82:1: ruleHead returns [EObject current=null] : ( (lv_elements_0_0= ruleCompilation_unit ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:85:28: ( ( (lv_elements_0_0= ruleCompilation_unit ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:86:1: ( (lv_elements_0_0= ruleCompilation_unit ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:86:1: ( (lv_elements_0_0= ruleCompilation_unit ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:87:1: (lv_elements_0_0= ruleCompilation_unit )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:87:1: (lv_elements_0_0= ruleCompilation_unit )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:88:3: lv_elements_0_0= ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_ruleHead136);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:112:1: entryRuleCompilation_unit returns [EObject current=null] : iv_ruleCompilation_unit= ruleCompilation_unit EOF ;
    public final EObject entryRuleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilation_unit = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:113:2: (iv_ruleCompilation_unit= ruleCompilation_unit EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:114:2: iv_ruleCompilation_unit= ruleCompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit171);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit181); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:121:1: ruleCompilation_unit returns [EObject current=null] : ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_type_declarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:124:28: ( ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:125:1: ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:125:1: ( () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:125:2: () ( (lv_package_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_type_declarations_3_0= ruleType_declaration ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:125:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:126:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompilation_unitAccess().getCompilation_unitAction_0(),
                          current);
                  
            }

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:134:2: ( (lv_package_1_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:135:1: (lv_package_1_0= rulePackage_statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:135:1: (lv_package_1_0= rulePackage_statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:136:3: lv_package_1_0= rulePackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit239);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:152:3: ( (lv_imports_2_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:153:1: (lv_imports_2_0= ruleImport_statement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:153:1: (lv_imports_2_0= ruleImport_statement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:154:3: lv_imports_2_0= ruleImport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit261);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:170:3: ( (lv_type_declarations_3_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||LA3_0==RULE_INTERFACE||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==84) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:171:1: (lv_type_declarations_3_0= ruleType_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:171:1: (lv_type_declarations_3_0= ruleType_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:172:3: lv_type_declarations_3_0= ruleType_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit283);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:196:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:197:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:198:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration320);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration330); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:205:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) this_EOL_3= RULE_EOL ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token this_EOL_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:208:28: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) this_EOL_3= RULE_EOL ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) this_EOL_3= RULE_EOL )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) this_EOL_3= RULE_EOL )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) this_EOL_3= RULE_EOL
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:210:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:210:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:211:3: lv_doc_0_0= RULE_DOC_COMMENT
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration372); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:227:3: ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:227:4: ( (lv_name_1_0= ruleClass_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:227:4: ( (lv_name_1_0= ruleClass_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:228:1: (lv_name_1_0= ruleClass_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:228:1: (lv_name_1_0= ruleClass_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:229:3: lv_name_1_0= ruleClass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration400);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:246:6: ( (lv_name_2_0= ruleInterface_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:246:6: ( (lv_name_2_0= ruleInterface_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:247:1: (lv_name_2_0= ruleInterface_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:247:1: (lv_name_2_0= ruleInterface_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:248:3: lv_name_2_0= ruleInterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration427);
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

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleType_declaration439); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_3, grammarAccess.getType_declarationAccess().getEOLTerminalRuleCall_2()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:276:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:277:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:278:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration474);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration484); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:285:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fields_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleInterface_declaration() throws RecognitionException {
        EObject current = null;

        Token this_INTERFACE_1=null;
        Token lv_interfaceName_2_0=null;
        Token this_EXTENDS_3=null;
        Token this_COMMA_5=null;
        Token this_R_CURLY_BRACE_7=null;
        Token this_L_CURLY_BRACE_9=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_extend_4_0 = null;

        AntlrDatatypeRuleToken lv_extends_6_0 = null;

        EObject lv_fields_8_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:288:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fields_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fields_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fields_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fields_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_MOD && LA6_0<=RULE_STATIC)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:290:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:290:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:291:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration530);
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

            this_INTERFACE_1=(Token)match(input,RULE_INTERFACE,FOLLOW_RULE_INTERFACE_in_ruleInterface_declaration542); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTERFACE_1, grammarAccess.getInterface_declarationAccess().getINTERFACETerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:311:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:313:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration558); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:329:2: (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EXTENDS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:329:3: this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleInterface_name ) ) (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleInterface_declaration575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getInterface_declarationAccess().getEXTENDSTerminalRuleCall_3_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:333:1: ( (lv_extend_4_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:334:1: (lv_extend_4_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:334:1: (lv_extend_4_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:335:3: lv_extend_4_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration595);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:351:2: (this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:351:3: this_COMMA_5= RULE_COMMA ( (lv_extends_6_0= ruleInterface_name ) )
                    	    {
                    	    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterface_declaration607); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_COMMA_5, grammarAccess.getInterface_declarationAccess().getCOMMATerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:355:1: ( (lv_extends_6_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:356:1: (lv_extends_6_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:356:1: (lv_extends_6_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:357:3: lv_extends_6_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration627);
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

            this_R_CURLY_BRACE_7=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleInterface_declaration642); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_7, grammarAccess.getInterface_declarationAccess().getR_CURLY_BRACETerminalRuleCall_4()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:377:1: ( (lv_fields_8_0= ruleField_declaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_DOC_COMMENT && LA9_0<=RULE_EOL)||LA9_0==RULE_ID||(LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)||(LA9_0>=87 && LA9_0<=95)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:378:1: (lv_fields_8_0= ruleField_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:378:1: (lv_fields_8_0= ruleField_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:379:3: lv_fields_8_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getFieldsField_declarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleInterface_declaration662);
            	    lv_fields_8_0=ruleField_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_8_0, 
            	              		"Field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_L_CURLY_BRACE_9=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleInterface_declaration674); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_9, grammarAccess.getInterface_declarationAccess().getL_CURLY_BRACETerminalRuleCall_6()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:407:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:408:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:409:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration709);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration719); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:416:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fields_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleClass_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token this_EXTENDS_3=null;
        Token otherlv_5=null;
        Token this_COMMA_7=null;
        Token this_R_CURLY_BRACE_9=null;
        Token this_L_CURLY_BRACE_11=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_extend_4_0 = null;

        AntlrDatatypeRuleToken lv_implement_6_0 = null;

        AntlrDatatypeRuleToken lv_implements_8_0 = null;

        EObject lv_fields_10_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:419:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fields_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:420:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fields_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:420:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fields_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:420:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fields_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:420:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_MOD && LA10_0<=RULE_STATIC)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:421:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:421:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:422:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration765);
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
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleClass_declaration778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:442:1: ( (lv_className_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:443:1: (lv_className_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:443:1: (lv_className_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:444:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration795); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:460:2: (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EXTENDS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:460:3: this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleClass_name ) )
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleClass_declaration812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getClass_declarationAccess().getEXTENDSTerminalRuleCall_3_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:464:1: ( (lv_extend_4_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:465:1: (lv_extend_4_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:465:1: (lv_extend_4_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:466:3: lv_extend_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration832);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:482:4: (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==85) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:482:6: otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_85_in_ruleClass_declaration847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:486:1: ( (lv_implement_6_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:487:1: (lv_implement_6_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:487:1: (lv_implement_6_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:488:3: lv_implement_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration868);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:504:2: (this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:504:3: this_COMMA_7= RULE_COMMA ( (lv_implements_8_0= ruleInterface_name ) )
                    	    {
                    	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleClass_declaration880); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_COMMA_7, grammarAccess.getClass_declarationAccess().getCOMMATerminalRuleCall_4_2_0()); 
                    	          
                    	    }
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:508:1: ( (lv_implements_8_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:509:1: (lv_implements_8_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:509:1: (lv_implements_8_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:510:3: lv_implements_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration900);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            this_R_CURLY_BRACE_9=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleClass_declaration915); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_9, grammarAccess.getClass_declarationAccess().getR_CURLY_BRACETerminalRuleCall_5()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:530:1: ( (lv_fields_10_0= ruleField_declaration ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_DOC_COMMENT && LA14_0<=RULE_EOL)||LA14_0==RULE_ID||(LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)||(LA14_0>=87 && LA14_0<=95)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:531:1: (lv_fields_10_0= ruleField_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:531:1: (lv_fields_10_0= ruleField_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:532:3: lv_fields_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration935);
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
            	    break loop14;
                }
            } while (true);

            this_L_CURLY_BRACE_11=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleClass_declaration947); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_11, grammarAccess.getClass_declarationAccess().getL_CURLY_BRACETerminalRuleCall_7()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:560:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:561:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:562:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration982);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration992); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:569:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= RULE_EOL ) ) ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:572:28: ( ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= RULE_EOL ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= RULE_EOL ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= RULE_EOL ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt17=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID||(LA17_2>=RULE_MOD && LA17_2<=RULE_STATIC)||(LA17_2>=87 && LA17_2<=95)) ) {
                    alt17=1;
                }
                else if ( (LA17_2==RULE_R_CURLY_BRACE) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EOL:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_DOC_COMMENT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:574:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:574:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:575:3: lv_doc_0_0= RULE_DOC_COMMENT
                            {
                            lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1035); if (state.failed) return current;
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:591:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:591:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:591:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:592:1: (lv_name_1_0= ruleVariable_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:592:1: (lv_name_1_0= ruleVariable_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:593:3: lv_name_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1063);
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
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:610:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:610:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:611:1: (lv_name_2_0= ruleConstructor_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:611:1: (lv_name_2_0= ruleConstructor_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:612:3: lv_name_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1090);
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
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:629:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:629:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:630:1: (lv_name_3_0= ruleMethod_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:630:1: (lv_name_3_0= ruleMethod_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:631:3: lv_name_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1117);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:648:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:648:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:649:1: (lv_name_4_0= ruleStatic_initializer )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:649:1: (lv_name_4_0= ruleStatic_initializer )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:650:3: lv_name_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1146);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:667:6: ( (lv_debug_5_0= RULE_EOL ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:667:6: ( (lv_debug_5_0= RULE_EOL ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:668:1: (lv_debug_5_0= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:668:1: (lv_debug_5_0= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:669:3: lv_debug_5_0= RULE_EOL
                    {
                    lv_debug_5_0=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleField_declaration1169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_debug_5_0, grammarAccess.getField_declarationAccess().getDebugEOLTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getField_declarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"debug",
                              		lv_debug_5_0, 
                              		"EOL");
                      	    
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:693:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:694:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:695:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1210);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1220); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:702:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_parameter_4_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS ) | this_ABS_8= RULE_ABS )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= RULE_EOL ) ) ) ) ;
    public final EObject ruleMethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token this_RIGHT_PARENTHESIS_3=null;
        Token this_LEFT_PARENTHESIS_5=null;
        Token this_R_ABS_6=null;
        Token this_L_ABS_7=null;
        Token this_ABS_8=null;
        Token lv_debug_10_0=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_statement_9_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:705:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_parameter_4_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS ) | this_ABS_8= RULE_ABS )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= RULE_EOL ) ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:706:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_parameter_4_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS ) | this_ABS_8= RULE_ABS )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= RULE_EOL ) ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:706:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_parameter_4_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS ) | this_ABS_8= RULE_ABS )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= RULE_EOL ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:706:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_parameter_4_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS ) | this_ABS_8= RULE_ABS )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= RULE_EOL ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:706:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_MOD && LA18_0<=RULE_STATIC)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:707:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:707:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:708:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1266);
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
            	    break loop18;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:724:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:725:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:725:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:726:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1288);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:742:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:743:1: (lv_name_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:743:1: (lv_name_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:744:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1305); if (state.failed) return current;
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

            this_RIGHT_PARENTHESIS_3=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleMethod_declaration1321); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_3, grammarAccess.getMethod_declarationAccess().getRIGHT_PARENTHESISTerminalRuleCall_3()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:764:1: ( (lv_parameter_4_0= ruleParameter_list ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=87 && LA19_0<=95)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:1: (lv_parameter_4_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:1: (lv_parameter_4_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:766:3: lv_parameter_4_0= ruleParameter_list
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

            this_LEFT_PARENTHESIS_5=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleMethod_declaration1353); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_5, grammarAccess.getMethod_declarationAccess().getLEFT_PARENTHESISTerminalRuleCall_5()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:786:1: ( (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS ) | this_ABS_8= RULE_ABS )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_R_ABS) ) {
                    alt20=1;
                }
                else if ( (LA20_0==RULE_ABS) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:786:2: (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:786:2: (this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:786:3: this_R_ABS_6= RULE_R_ABS this_L_ABS_7= RULE_L_ABS
            	    {
            	    this_R_ABS_6=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleMethod_declaration1365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_R_ABS_6, grammarAccess.getMethod_declarationAccess().getR_ABSTerminalRuleCall_6_0_0()); 
            	          
            	    }
            	    this_L_ABS_7=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleMethod_declaration1375); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_L_ABS_7, grammarAccess.getMethod_declarationAccess().getL_ABSTerminalRuleCall_6_0_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:795:6: this_ABS_8= RULE_ABS
            	    {
            	    this_ABS_8=(Token)match(input,RULE_ABS,FOLLOW_RULE_ABS_in_ruleMethod_declaration1392); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ABS_8, grammarAccess.getMethod_declarationAccess().getABSTerminalRuleCall_6_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:799:3: ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= RULE_EOL ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_R_CURLY_BRACE) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_EOL) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:799:4: ( (lv_statement_9_0= ruleStatement_block ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:799:4: ( (lv_statement_9_0= ruleStatement_block ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:800:1: (lv_statement_9_0= ruleStatement_block )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:800:1: (lv_statement_9_0= ruleStatement_block )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:801:3: lv_statement_9_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1415);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:818:6: ( (lv_debug_10_0= RULE_EOL ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:818:6: ( (lv_debug_10_0= RULE_EOL ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:819:1: (lv_debug_10_0= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:819:1: (lv_debug_10_0= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:820:3: lv_debug_10_0= RULE_EOL
                    {
                    lv_debug_10_0=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleMethod_declaration1438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_debug_10_0, grammarAccess.getMethod_declarationAccess().getDebugEOLTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethod_declarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"debug",
                              		lv_debug_10_0, 
                              		"EOL");
                      	    
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


    // $ANTLR start "entryRuleMethod_call"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:844:1: entryRuleMethod_call returns [EObject current=null] : iv_ruleMethod_call= ruleMethod_call EOF ;
    public final EObject entryRuleMethod_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_call = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:845:2: (iv_ruleMethod_call= ruleMethod_call EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:846:2: iv_ruleMethod_call= ruleMethod_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_callRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_call_in_entryRuleMethod_call1480);
            iv_ruleMethod_call=ruleMethod_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_call; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_call1490); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod_call"


    // $ANTLR start "ruleMethod_call"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:853:1: ruleMethod_call returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_parameter_2_0= ruleParameter_list_method_call ) )? this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ) ;
    public final EObject ruleMethod_call() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_RIGHT_PARENTHESIS_1=null;
        Token this_LEFT_PARENTHESIS_3=null;
        EObject lv_parameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:856:28: ( ( ( (lv_name_0_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_parameter_2_0= ruleParameter_list_method_call ) )? this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:857:1: ( ( (lv_name_0_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_parameter_2_0= ruleParameter_list_method_call ) )? this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:857:1: ( ( (lv_name_0_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_parameter_2_0= ruleParameter_list_method_call ) )? this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:857:2: ( (lv_name_0_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_parameter_2_0= ruleParameter_list_method_call ) )? this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:857:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:858:1: (lv_name_0_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:858:1: (lv_name_0_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:859:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_call1532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMethod_callAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_callRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            this_RIGHT_PARENTHESIS_1=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleMethod_call1548); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_1, grammarAccess.getMethod_callAccess().getRIGHT_PARENTHESISTerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:879:1: ( (lv_parameter_2_0= ruleParameter_list_method_call ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:880:1: (lv_parameter_2_0= ruleParameter_list_method_call )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:880:1: (lv_parameter_2_0= ruleParameter_list_method_call )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:881:3: lv_parameter_2_0= ruleParameter_list_method_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_callAccess().getParameterParameter_list_method_callParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_method_call_in_ruleMethod_call1568);
                    lv_parameter_2_0=ruleParameter_list_method_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_callRule());
                      	        }
                             		set(
                             			current, 
                             			"parameter",
                              		lv_parameter_2_0, 
                              		"Parameter_list_method_call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_LEFT_PARENTHESIS_3=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleMethod_call1580); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_3, grammarAccess.getMethod_callAccess().getLEFT_PARENTHESISTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleMethod_call"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:909:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:910:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:911:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1615);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1625); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:918:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_parameters_3_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_statement_5_0= ruleStatement_block ) ) ) ;
    public final EObject ruleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_RIGHT_PARENTHESIS_2=null;
        Token this_LEFT_PARENTHESIS_4=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:921:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_parameters_3_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_statement_5_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:922:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_parameters_3_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_statement_5_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:922:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_parameters_3_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_statement_5_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:922:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_parameters_3_0= ruleParameter_list ) )? this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_statement_5_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:922:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_MOD && LA23_0<=RULE_STATIC)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:923:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:923:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:924:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1671);
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
            	    break loop23;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:940:3: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:941:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:941:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:942:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1689); if (state.failed) return current;
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

            this_RIGHT_PARENTHESIS_2=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleConstructor_declaration1705); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_2, grammarAccess.getConstructor_declarationAccess().getRIGHT_PARENTHESISTerminalRuleCall_2()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:962:1: ( (lv_parameters_3_0= ruleParameter_list ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=87 && LA24_0<=95)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:963:1: (lv_parameters_3_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:963:1: (lv_parameters_3_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:964:3: lv_parameters_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1725);
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

            this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleConstructor_declaration1737); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_4, grammarAccess.getConstructor_declarationAccess().getLEFT_PARENTHESISTerminalRuleCall_4()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:984:1: ( (lv_statement_5_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:985:1: (lv_statement_5_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:985:1: (lv_statement_5_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:986:3: lv_statement_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1757);
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


    // $ANTLR start "entryRuleParameter_list_method_call"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1010:1: entryRuleParameter_list_method_call returns [EObject current=null] : iv_ruleParameter_list_method_call= ruleParameter_list_method_call EOF ;
    public final EObject entryRuleParameter_list_method_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list_method_call = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1011:2: (iv_ruleParameter_list_method_call= ruleParameter_list_method_call EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1012:2: iv_ruleParameter_list_method_call= ruleParameter_list_method_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_list_method_callRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_method_call_in_entryRuleParameter_list_method_call1793);
            iv_ruleParameter_list_method_call=ruleParameter_list_method_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list_method_call; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list_method_call1803); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter_list_method_call"


    // $ANTLR start "ruleParameter_list_method_call"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1019:1: ruleParameter_list_method_call returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleParameter_list_method_call() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_COMMA_1=null;
        Token lv_parameters_2_0=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1022:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1023:1: ( ( (lv_name_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1023:1: ( ( (lv_name_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1023:2: ( (lv_name_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1023:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1024:1: (lv_name_0_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1024:1: (lv_name_0_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1025:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter_list_method_call1845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParameter_list_method_callAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameter_list_method_callRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1041:2: (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1041:3: this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= RULE_ID ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleParameter_list_method_call1862); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getParameter_list_method_callAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1045:1: ( (lv_parameters_2_0= RULE_ID ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1046:1: (lv_parameters_2_0= RULE_ID )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1046:1: (lv_parameters_2_0= RULE_ID )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1047:3: lv_parameters_2_0= RULE_ID
            	    {
            	    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter_list_method_call1878); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_parameters_2_0, grammarAccess.getParameter_list_method_callAccess().getParametersIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getParameter_list_method_callRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_2_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleParameter_list_method_call"


    // $ANTLR start "entryRuleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1071:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1072:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1073:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1921);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1931); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1080:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1083:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1084:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1084:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1084:2: ( (lv_parameter_0_0= ruleParameter ) ) (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1084:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1085:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1085:1: (lv_parameter_0_0= ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1086:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1977);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1102:2: (this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1102:3: this_COMMA_1= RULE_COMMA ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleParameter_list1989); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getParameter_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1106:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1107:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1107:1: (lv_parameters_2_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1108:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list2009);
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
            	    break loop26;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1132:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1133:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1134:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2047);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2057); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1141:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS ) | this_ABS_4= RULE_ABS )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_R_ABS_2=null;
        Token this_L_ABS_3=null;
        Token this_ABS_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1144:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS ) | this_ABS_4= RULE_ABS )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1145:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS ) | this_ABS_4= RULE_ABS )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1145:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS ) | this_ABS_4= RULE_ABS )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1145:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS ) | this_ABS_4= RULE_ABS )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1145:2: ( (lv_type_0_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1146:1: (lv_type_0_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1146:1: (lv_type_0_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1147:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter2103);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1163:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1164:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1164:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2120); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1181:2: ( (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS ) | this_ABS_4= RULE_ABS )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_R_ABS) ) {
                    alt27=1;
                }
                else if ( (LA27_0==RULE_ABS) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1181:3: (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1181:3: (this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1181:4: this_R_ABS_2= RULE_R_ABS this_L_ABS_3= RULE_L_ABS
            	    {
            	    this_R_ABS_2=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleParameter2138); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_R_ABS_2, grammarAccess.getParameterAccess().getR_ABSTerminalRuleCall_2_0_0()); 
            	          
            	    }
            	    this_L_ABS_3=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleParameter2148); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_L_ABS_3, grammarAccess.getParameterAccess().getL_ABSTerminalRuleCall_2_0_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1190:6: this_ABS_4= RULE_ABS
            	    {
            	    this_ABS_4=(Token)match(input,RULE_ABS,FOLLOW_RULE_ABS_in_ruleParameter2165); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ABS_4, grammarAccess.getParameterAccess().getABSTerminalRuleCall_2_1()); 
            	          
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1202:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1203:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1204:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration2202);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration2212); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1211:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) ) )* this_EOL_5= RULE_EOL ) ;
    public final EObject ruleVariable_declaration() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        Token this_EOL_5=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_names_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1214:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) ) )* this_EOL_5= RULE_EOL ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1215:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) ) )* this_EOL_5= RULE_EOL )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1215:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) ) )* this_EOL_5= RULE_EOL )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1215:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) ) )* this_EOL_5= RULE_EOL
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1215:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_MOD && LA28_0<=RULE_STATIC)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1216:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1216:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1217:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration2258);
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
            	    break loop28;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1233:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1234:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1234:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1235:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration2280);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1251:2: ( (lv_name_2_0= ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1252:1: (lv_name_2_0= ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1252:1: (lv_name_2_0= ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1253:3: lv_name_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2301);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1269:2: (this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1269:3: this_COMMA_3= RULE_COMMA ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleVariable_declaration2313); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getVariable_declarationAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1273:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1274:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1274:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1275:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2333);
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
            	    break loop29;
                }
            } while (true);

            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleVariable_declaration2346); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_5, grammarAccess.getVariable_declarationAccess().getEOLTerminalRuleCall_4()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1303:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1304:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1305:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2381);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2391); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1312:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* (this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_R_ABS_1=null;
        Token this_L_ABS_2=null;
        Token this_ABS_3=null;
        Token this_EQUAL_4=null;
        EObject lv_initializer_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1315:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* (this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* (this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* (this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:2: ( (lv_name_0_0= RULE_ID ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* (this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1317:1: (lv_name_0_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1317:1: (lv_name_0_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1318:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2433); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1334:2: ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_R_ABS) ) {
                    alt30=1;
                }
                else if ( (LA30_0==RULE_ABS) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1334:3: (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1334:3: (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1334:4: this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS
            	    {
            	    this_R_ABS_1=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleVariable_declarator2451); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_R_ABS_1, grammarAccess.getVariable_declaratorAccess().getR_ABSTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    this_L_ABS_2=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleVariable_declarator2461); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_L_ABS_2, grammarAccess.getVariable_declaratorAccess().getL_ABSTerminalRuleCall_1_0_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1343:6: this_ABS_3= RULE_ABS
            	    {
            	    this_ABS_3=(Token)match(input,RULE_ABS,FOLLOW_RULE_ABS_in_ruleVariable_declarator2478); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ABS_3, grammarAccess.getVariable_declaratorAccess().getABSTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1347:3: (this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_EQUAL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1347:4: this_EQUAL_4= RULE_EQUAL ( (lv_initializer_5_0= ruleVariable_initializer ) )
                    {
                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleVariable_declarator2491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_4, grammarAccess.getVariable_declaratorAccess().getEQUALTerminalRuleCall_2_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1351:1: ( (lv_initializer_5_0= ruleVariable_initializer ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1352:1: (lv_initializer_5_0= ruleVariable_initializer )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1352:1: (lv_initializer_5_0= ruleVariable_initializer )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1353:3: lv_initializer_5_0= ruleVariable_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getInitializerVariable_initializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_initializer_in_ruleVariable_declarator2511);
                    lv_initializer_5_0=ruleVariable_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_declaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"initializer",
                              		lv_initializer_5_0, 
                              		"Variable_initializer");
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
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleVariable_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1377:1: entryRuleVariable_initializer returns [EObject current=null] : iv_ruleVariable_initializer= ruleVariable_initializer EOF ;
    public final EObject entryRuleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_initializer = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1378:2: (iv_ruleVariable_initializer= ruleVariable_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1379:2: iv_ruleVariable_initializer= ruleVariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_initializer_in_entryRuleVariable_initializer2549);
            iv_ruleVariable_initializer=ruleVariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_initializer2559); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_initializer"


    // $ANTLR start "ruleVariable_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1386:1: ruleVariable_initializer returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) | ( () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE ) ) ;
    public final EObject ruleVariable_initializer() throws RecognitionException {
        EObject current = null;

        Token this_R_CURLY_BRACE_2=null;
        Token this_COMMA_4=null;
        Token this_COMMA_6=null;
        Token this_L_CURLY_BRACE_7=null;
        EObject lv_expression_0_0 = null;

        EObject lv_variableInitializer1_3_0 = null;

        EObject lv_variableIniatializer2_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1389:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) | ( () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:1: ( ( (lv_expression_0_0= ruleExpression ) ) | ( () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:1: ( ( (lv_expression_0_0= ruleExpression ) ) | ( () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==RULE_RIGHT_PARENTHESIS||(LA35_0>=RULE_NULL && LA35_0<=RULE_THIS)||(LA35_0>=RULE_INCREMENT && LA35_0<=RULE_DECREMENT)||LA35_0==RULE_MINUS||LA35_0==RULE_DECIMAL_DIGITS||LA35_0==RULE_HEXA||(LA35_0>=RULE_STRING && LA35_0<=RULE_FALSE)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_R_CURLY_BRACE) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:2: ( (lv_expression_0_0= ruleExpression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:2: ( (lv_expression_0_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1391:1: (lv_expression_0_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1391:1: (lv_expression_0_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1392:3: lv_expression_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressionExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariable_initializer2605);
                    lv_expression_0_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1409:6: ( () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1409:6: ( () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1409:7: () ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE ) ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )? this_L_CURLY_BRACE_7= RULE_L_CURLY_BRACE
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1409:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1410:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVariable_initializerAccess().getVariable_initializerAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1418:2: ( ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1418:3: ( RULE_R_CURLY_BRACE )=>this_R_CURLY_BRACE_2= RULE_R_CURLY_BRACE
                    {
                    this_R_CURLY_BRACE_2=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleVariable_initializer2641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_R_CURLY_BRACE_2, grammarAccess.getVariable_initializerAccess().getR_CURLY_BRACETerminalRuleCall_1_1()); 
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1422:2: ( ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )? )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==RULE_R_CURLY_BRACE||LA34_0==RULE_RIGHT_PARENTHESIS||(LA34_0>=RULE_NULL && LA34_0<=RULE_THIS)||(LA34_0>=RULE_INCREMENT && LA34_0<=RULE_DECREMENT)||LA34_0==RULE_MINUS||LA34_0==RULE_DECIMAL_DIGITS||LA34_0==RULE_HEXA||(LA34_0>=RULE_STRING && LA34_0<=RULE_FALSE)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1422:3: ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) ) (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )* (this_COMMA_6= RULE_COMMA )?
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1422:3: ( (lv_variableInitializer1_3_0= ruleVariable_initializer ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1423:1: (lv_variableInitializer1_3_0= ruleVariable_initializer )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1423:1: (lv_variableInitializer1_3_0= ruleVariable_initializer )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1424:3: lv_variableInitializer1_3_0= ruleVariable_initializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getVariableInitializer1Variable_initializerParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_initializer_in_ruleVariable_initializer2663);
                            lv_variableInitializer1_3_0=ruleVariable_initializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variableInitializer1",
                                      		lv_variableInitializer1_3_0, 
                                      		"Variable_initializer");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1440:2: (this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==RULE_COMMA) ) {
                                    int LA32_1 = input.LA(2);

                                    if ( (LA32_1==RULE_ID||LA32_1==RULE_R_CURLY_BRACE||LA32_1==RULE_RIGHT_PARENTHESIS||(LA32_1>=RULE_NULL && LA32_1<=RULE_THIS)||(LA32_1>=RULE_INCREMENT && LA32_1<=RULE_DECREMENT)||LA32_1==RULE_MINUS||LA32_1==RULE_DECIMAL_DIGITS||LA32_1==RULE_HEXA||(LA32_1>=RULE_STRING && LA32_1<=RULE_FALSE)) ) {
                                        alt32=1;
                                    }


                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1440:3: this_COMMA_4= RULE_COMMA ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) )
                            	    {
                            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleVariable_initializer2675); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_COMMA_4, grammarAccess.getVariable_initializerAccess().getCOMMATerminalRuleCall_1_2_1_0()); 
                            	          
                            	    }
                            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1444:1: ( (lv_variableIniatializer2_5_0= ruleVariable_initializer ) )
                            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1445:1: (lv_variableIniatializer2_5_0= ruleVariable_initializer )
                            	    {
                            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1445:1: (lv_variableIniatializer2_5_0= ruleVariable_initializer )
                            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1446:3: lv_variableIniatializer2_5_0= ruleVariable_initializer
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getVariableIniatializer2Variable_initializerParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleVariable_initializer_in_ruleVariable_initializer2695);
                            	    lv_variableIniatializer2_5_0=ruleVariable_initializer();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"variableIniatializer2",
                            	              		lv_variableIniatializer2_5_0, 
                            	              		"Variable_initializer");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);

                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1462:4: (this_COMMA_6= RULE_COMMA )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==RULE_COMMA) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1462:5: this_COMMA_6= RULE_COMMA
                                    {
                                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleVariable_initializer2709); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_COMMA_6, grammarAccess.getVariable_initializerAccess().getCOMMATerminalRuleCall_1_2_2()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    this_L_CURLY_BRACE_7=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleVariable_initializer2723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_L_CURLY_BRACE_7, grammarAccess.getVariable_initializerAccess().getL_CURLY_BRACETerminalRuleCall_1_3()); 
                          
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
    // $ANTLR end "ruleVariable_initializer"


    // $ANTLR start "entryRuleExpression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1478:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1479:2: (iv_ruleExpression= ruleExpression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1480:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2759);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2769); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1487:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_null_12_0=null;
        Token lv_super_14_0=null;
        Token lv_this_16_0=null;
        Token lv_name_18_0=null;
        EObject lv_numericExpression3_0_0 = null;

        EObject lv_aux_1_0 = null;

        EObject lv_logicalExpression_2_0 = null;

        EObject lv_aux_3_0 = null;

        EObject lv_bitExpression_4_0 = null;

        EObject lv_aux_5_0 = null;

        EObject lv_castExpression_6_0 = null;

        EObject lv_aux_7_0 = null;

        EObject lv_creatingExpression_8_0 = null;

        EObject lv_aux_9_0 = null;

        EObject lv_literalExpression_10_0 = null;

        EObject lv_aux_11_0 = null;

        EObject lv_aux_13_0 = null;

        EObject lv_aux_15_0 = null;

        EObject lv_aux_17_0 = null;

        EObject lv_aux_19_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1490:28: ( ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            int alt36=10;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:2: ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:2: ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:3: ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:3: ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1491:4: ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:5: ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1496:1: (lv_numericExpression3_0_0= ruleNumeric_Expression_NR )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1496:1: (lv_numericExpression3_0_0= ruleNumeric_Expression_NR )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1497:3: lv_numericExpression3_0_0= ruleNumeric_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpression3Numeric_Expression_NRParserRuleCall_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumeric_Expression_NR_in_ruleExpression2829);
                    lv_numericExpression3_0_0=ruleNumeric_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numericExpression3",
                              		lv_numericExpression3_0_0, 
                              		"Numeric_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1513:3: ( (lv_aux_1_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1514:1: (lv_aux_1_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1514:1: (lv_aux_1_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1515:3: lv_aux_1_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2851);
                    lv_aux_1_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_1_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1532:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1532:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1532:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1532:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1533:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1533:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1534:3: lv_logicalExpression_2_0= ruleLogical_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionLogical_Expression_NRParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogical_Expression_NR_in_ruleExpression2880);
                    lv_logicalExpression_2_0=ruleLogical_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"logicalExpression",
                              		lv_logicalExpression_2_0, 
                              		"Logical_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1550:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1551:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1551:1: (lv_aux_3_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1552:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2901);
                    lv_aux_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_3_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1569:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1569:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1569:7: ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1569:7: ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1570:1: (lv_bitExpression_4_0= ruleBit_Expression_NR )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1570:1: (lv_bitExpression_4_0= ruleBit_Expression_NR )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1571:3: lv_bitExpression_4_0= ruleBit_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getBitExpressionBit_Expression_NRParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBit_Expression_NR_in_ruleExpression2930);
                    lv_bitExpression_4_0=ruleBit_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"bitExpression",
                              		lv_bitExpression_4_0, 
                              		"Bit_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1587:2: ( (lv_aux_5_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1588:1: (lv_aux_5_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1588:1: (lv_aux_5_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1589:3: lv_aux_5_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2951);
                    lv_aux_5_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_5_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1606:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1606:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1606:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1606:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1606:8: ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1610:5: ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1611:1: (lv_castExpression_6_0= ruleCast_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1611:1: (lv_castExpression_6_0= ruleCast_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1612:3: lv_castExpression_6_0= ruleCast_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCastExpressionCast_ExpressionParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCast_Expression_in_ruleExpression2993);
                    lv_castExpression_6_0=ruleCast_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"castExpression",
                              		lv_castExpression_6_0, 
                              		"Cast_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1628:3: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1629:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1629:1: (lv_aux_7_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1630:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3015);
                    lv_aux_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_7_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1647:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1647:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1647:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1647:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1647:8: ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1651:5: ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1652:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1652:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1653:3: lv_creatingExpression_8_0= ruleCreating_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCreatingExpressionCreating_ExpressionParserRuleCall_4_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCreating_Expression_in_ruleExpression3057);
                    lv_creatingExpression_8_0=ruleCreating_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"creatingExpression",
                              		lv_creatingExpression_8_0, 
                              		"Creating_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1669:3: ( (lv_aux_9_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1670:1: (lv_aux_9_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1670:1: (lv_aux_9_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1671:3: lv_aux_9_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3079);
                    lv_aux_9_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_9_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:6: ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:6: ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:7: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1688:7: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1689:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1689:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1690:3: lv_literalExpression_10_0= ruleLiteral_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionLiteral_ExpressionParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_Expression_in_ruleExpression3108);
                    lv_literalExpression_10_0=ruleLiteral_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literalExpression",
                              		lv_literalExpression_10_0, 
                              		"Literal_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1706:2: ( (lv_aux_11_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1707:1: (lv_aux_11_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1707:1: (lv_aux_11_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1708:3: lv_aux_11_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3129);
                    lv_aux_11_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_11_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1725:6: ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1725:6: ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1725:7: ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1725:7: ( (lv_null_12_0= RULE_NULL ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1726:1: (lv_null_12_0= RULE_NULL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1726:1: (lv_null_12_0= RULE_NULL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1727:3: lv_null_12_0= RULE_NULL
                    {
                    lv_null_12_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleExpression3154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_null_12_0, grammarAccess.getExpressionAccess().getNullNULLTerminalRuleCall_6_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"null",
                              		lv_null_12_0, 
                              		"NULL");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1743:2: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1744:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1744:1: (lv_aux_13_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3180);
                    lv_aux_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_13_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1762:6: ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1762:6: ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1762:7: ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1762:7: ( (lv_super_14_0= RULE_SUPER ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1763:1: (lv_super_14_0= RULE_SUPER )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1763:1: (lv_super_14_0= RULE_SUPER )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:3: lv_super_14_0= RULE_SUPER
                    {
                    lv_super_14_0=(Token)match(input,RULE_SUPER,FOLLOW_RULE_SUPER_in_ruleExpression3205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_super_14_0, grammarAccess.getExpressionAccess().getSuperSUPERTerminalRuleCall_7_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"super",
                              		lv_super_14_0, 
                              		"SUPER");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1780:2: ( (lv_aux_15_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1781:1: (lv_aux_15_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1781:1: (lv_aux_15_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1782:3: lv_aux_15_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3231);
                    lv_aux_15_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_15_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1799:6: ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1799:6: ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1799:7: ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1799:7: ( (lv_this_16_0= RULE_THIS ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1800:1: (lv_this_16_0= RULE_THIS )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1800:1: (lv_this_16_0= RULE_THIS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1801:3: lv_this_16_0= RULE_THIS
                    {
                    lv_this_16_0=(Token)match(input,RULE_THIS,FOLLOW_RULE_THIS_in_ruleExpression3256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_this_16_0, grammarAccess.getExpressionAccess().getThisTHISTerminalRuleCall_8_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"this",
                              		lv_this_16_0, 
                              		"THIS");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1817:2: ( (lv_aux_17_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1818:1: (lv_aux_17_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1818:1: (lv_aux_17_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1819:3: lv_aux_17_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3282);
                    lv_aux_17_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_17_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1836:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1836:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1836:7: ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1836:7: ( (lv_name_18_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1837:1: (lv_name_18_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1837:1: (lv_name_18_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1838:3: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression3307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_18_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_9_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_18_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1854:2: ( (lv_aux_19_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1855:1: (lv_aux_19_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1855:1: (lv_aux_19_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1856:3: lv_aux_19_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3333);
                    lv_aux_19_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_19_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_aux"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1880:1: entryRuleExpression_aux returns [EObject current=null] : iv_ruleExpression_aux= ruleExpression_aux EOF ;
    public final EObject entryRuleExpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_aux = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1881:2: (iv_ruleExpression_aux= ruleExpression_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1882:2: iv_ruleExpression_aux= ruleExpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_aux_in_entryRuleExpression_aux3370);
            iv_ruleExpression_aux=ruleExpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_aux3380); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_aux"


    // $ANTLR start "ruleExpression_aux"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1889:1: ruleExpression_aux returns [EObject current=null] : ( ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () ) ;
    public final EObject ruleExpression_aux() throws RecognitionException {
        EObject current = null;

        Token this_RIGHT_PARENTHESIS_0=null;
        Token this_LEFT_PARENTHESIS_2=null;
        Token this_R_ABS_4=null;
        Token this_L_ABS_6=null;
        Token otherlv_8=null;
        Token this_COMMA_11=null;
        Token this_INSTANCEOF_14=null;
        Token lv_sgin_17_1=null;
        Token lv_sgin_17_2=null;
        Token lv_numericSign_19_1=null;
        Token lv_numericSign_19_2=null;
        Token lv_numericSign_19_3=null;
        Token lv_numericSign_19_4=null;
        Token lv_numericSign_19_5=null;
        Token lv_numericSign_19_6=null;
        Token lv_numericSign_19_7=null;
        Token lv_numericSign_19_8=null;
        Token lv_numericSign_19_9=null;
        Token lv_numericSign_19_10=null;
        Token lv_testingSign_22_1=null;
        Token lv_testingSign_22_2=null;
        Token lv_testingSign_22_3=null;
        Token lv_testingSign_22_4=null;
        Token lv_testingSign_22_5=null;
        Token lv_testingSign_22_6=null;
        Token lv_logicalSign_25_1=null;
        Token lv_logicalSign_25_2=null;
        Token lv_logicalSign_25_3=null;
        Token lv_logicalSign_25_4=null;
        Token lv_logicalSign_25_5=null;
        Token lv_logicalSign_25_6=null;
        Token lv_logicalSign_25_7=null;
        Token this_WAT_29=null;
        Token this_COLON_31=null;
        Token lv_stringSign_34_1=null;
        Token lv_stringSign_34_2=null;
        Token lv_bitSign_37_1=null;
        Token lv_bitSign_37_2=null;
        Token lv_bitSign_37_3=null;
        Token lv_bitSign_37_4=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux_3_0 = null;

        EObject lv_expression2_5_0 = null;

        EObject lv_aux_7_0 = null;

        EObject lv_expression2_9_0 = null;

        EObject lv_aux_10_0 = null;

        EObject lv_expression2_12_0 = null;

        EObject lv_aux_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux_16_0 = null;

        EObject lv_aux_18_0 = null;

        EObject lv_exp2_20_0 = null;

        EObject lv_aux_21_0 = null;

        EObject lv_exp1_23_0 = null;

        EObject lv_aux_24_0 = null;

        EObject lv_ampersand_26_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_aux_28_0 = null;

        EObject lv_exp1_30_0 = null;

        EObject lv_exp2_32_0 = null;

        EObject lv_aux_33_0 = null;

        EObject lv_exp1_35_0 = null;

        EObject lv_aux_36_0 = null;

        EObject lv_expressionBit_38_0 = null;

        EObject lv_aux_39_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1892:28: ( ( ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:1: ( ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:1: ( ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () )
            int alt44=13;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:2: ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:2: ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:3: (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:3: (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:4: this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS
                    {
                    this_RIGHT_PARENTHESIS_0=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleExpression_aux3418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PARENTHESIS_0, grammarAccess.getExpression_auxAccess().getRIGHT_PARENTHESISTerminalRuleCall_0_0_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1897:1: ( (lv_argList_1_0= ruleArg_List ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1898:1: (lv_argList_1_0= ruleArg_List )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1898:1: (lv_argList_1_0= ruleArg_List )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1899:3: lv_argList_1_0= ruleArg_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArg_List_in_ruleExpression_aux3438);
                    lv_argList_1_0=ruleArg_List();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		add(
                             			current, 
                             			"argList",
                              		lv_argList_1_0, 
                              		"Arg_List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_PARENTHESIS_2=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleExpression_aux3449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PARENTHESIS_2, grammarAccess.getExpression_auxAccess().getLEFT_PARENTHESISTerminalRuleCall_0_0_2()); 
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1919:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:1: (lv_aux_3_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1921:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3470);
                    lv_aux_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_3_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:6: ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:6: ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:7: (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:7: (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:8: this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS
                    {
                    this_R_ABS_4=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleExpression_aux3490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_R_ABS_4, grammarAccess.getExpression_auxAccess().getR_ABSTerminalRuleCall_1_0_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1942:1: ( (lv_expression2_5_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1943:1: (lv_expression2_5_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1943:1: (lv_expression2_5_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1944:3: lv_expression2_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux3510);
                    lv_expression2_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_L_ABS_6=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleExpression_aux3521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_L_ABS_6, grammarAccess.getExpression_auxAccess().getL_ABSTerminalRuleCall_1_0_2()); 
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1964:2: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1965:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1965:1: (lv_aux_7_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1966:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3542);
                    lv_aux_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_7_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:9: otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,86,FOLLOW_86_in_ruleExpression_aux3563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getFullStopKeyword_2_0_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1987:1: ( (lv_expression2_9_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1988:1: (lv_expression2_9_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1988:1: (lv_expression2_9_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1989:3: lv_expression2_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux3584);
                    lv_expression2_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2005:3: ( (lv_aux_10_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2006:1: (lv_aux_10_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2006:1: (lv_aux_10_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2007:3: lv_aux_10_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3606);
                    lv_aux_10_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_10_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:6: ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:6: ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:7: (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:7: (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:8: this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) )
                    {
                    this_COMMA_11=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleExpression_aux3626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_11, grammarAccess.getExpression_auxAccess().getCOMMATerminalRuleCall_3_0_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2028:1: ( (lv_expression2_12_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2029:1: (lv_expression2_12_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2029:1: (lv_expression2_12_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2030:3: lv_expression2_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux3646);
                    lv_expression2_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_12_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2046:3: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2047:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2047:1: (lv_aux_13_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2048:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3668);
                    lv_aux_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_13_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:8: this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) )
                    {
                    this_INSTANCEOF_14=(Token)match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_ruleExpression_aux3688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INSTANCEOF_14, grammarAccess.getExpression_auxAccess().getINSTANCEOFTerminalRuleCall_4_0_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2069:1: ( (lv_name_15_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2070:1: (lv_name_15_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2070:1: (lv_name_15_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2071:3: lv_name_15_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleExpression_aux3708);
                    lv_name_15_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2087:3: ( (lv_aux_16_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2088:1: (lv_aux_16_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2088:1: (lv_aux_16_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2089:3: lv_aux_16_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3730);
                    lv_aux_16_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_16_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2107:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2107:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2108:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2108:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INCREMENT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_DECREMENT) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2109:3: lv_sgin_17_1= RULE_INCREMENT
                            {
                            lv_sgin_17_1=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_ruleExpression_aux3757); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_sgin_17_1, grammarAccess.getExpression_auxAccess().getSginINCREMENTTerminalRuleCall_5_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"sgin",
                                      		lv_sgin_17_1, 
                                      		"INCREMENT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2124:8: lv_sgin_17_2= RULE_DECREMENT
                            {
                            lv_sgin_17_2=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleExpression_aux3777); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_sgin_17_2, grammarAccess.getExpression_auxAccess().getSginDECREMENTTerminalRuleCall_5_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"sgin",
                                      		lv_sgin_17_2, 
                                      		"DECREMENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2142:2: ( (lv_aux_18_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2143:1: (lv_aux_18_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2143:1: (lv_aux_18_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:3: lv_aux_18_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3806);
                    lv_aux_18_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_18_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:6: ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:6: ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:7: ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:7: ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2162:1: ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2162:1: ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2163:1: (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2163:1: (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
                    int alt38=10;
                    switch ( input.LA(1) ) {
                    case RULE_PLUS:
                        {
                        alt38=1;
                        }
                        break;
                    case RULE_PLUS_EQUAL:
                        {
                        alt38=2;
                        }
                        break;
                    case RULE_MINUS:
                        {
                        alt38=3;
                        }
                        break;
                    case RULE_MINUS_EQUAL:
                        {
                        alt38=4;
                        }
                        break;
                    case RULE_MULTIPLY:
                        {
                        alt38=5;
                        }
                        break;
                    case RULE_MULTIPLY_EQUAL:
                        {
                        alt38=6;
                        }
                        break;
                    case RULE_DIVIDE:
                        {
                        alt38=7;
                        }
                        break;
                    case RULE_DIVIDE_EQUAL:
                        {
                        alt38=8;
                        }
                        break;
                    case RULE_MODULE:
                        {
                        alt38=9;
                        }
                        break;
                    case RULE_MODULE_EQUAL:
                        {
                        alt38=10;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2164:3: lv_numericSign_19_1= RULE_PLUS
                            {
                            lv_numericSign_19_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExpression_aux3833); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_1, grammarAccess.getExpression_auxAccess().getNumericSignPLUSTerminalRuleCall_6_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_1, 
                                      		"PLUS");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2179:8: lv_numericSign_19_2= RULE_PLUS_EQUAL
                            {
                            lv_numericSign_19_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux3853); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_2, grammarAccess.getExpression_auxAccess().getNumericSignPLUS_EQUALTerminalRuleCall_6_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_2, 
                                      		"PLUS_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2194:8: lv_numericSign_19_3= RULE_MINUS
                            {
                            lv_numericSign_19_3=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExpression_aux3873); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_3, grammarAccess.getExpression_auxAccess().getNumericSignMINUSTerminalRuleCall_6_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_3, 
                                      		"MINUS");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2209:8: lv_numericSign_19_4= RULE_MINUS_EQUAL
                            {
                            lv_numericSign_19_4=(Token)match(input,RULE_MINUS_EQUAL,FOLLOW_RULE_MINUS_EQUAL_in_ruleExpression_aux3893); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_4, grammarAccess.getExpression_auxAccess().getNumericSignMINUS_EQUALTerminalRuleCall_6_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_4, 
                                      		"MINUS_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2224:8: lv_numericSign_19_5= RULE_MULTIPLY
                            {
                            lv_numericSign_19_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_ruleExpression_aux3913); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_5, grammarAccess.getExpression_auxAccess().getNumericSignMULTIPLYTerminalRuleCall_6_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_5, 
                                      		"MULTIPLY");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:8: lv_numericSign_19_6= RULE_MULTIPLY_EQUAL
                            {
                            lv_numericSign_19_6=(Token)match(input,RULE_MULTIPLY_EQUAL,FOLLOW_RULE_MULTIPLY_EQUAL_in_ruleExpression_aux3933); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_6, grammarAccess.getExpression_auxAccess().getNumericSignMULTIPLY_EQUALTerminalRuleCall_6_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_6, 
                                      		"MULTIPLY_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2254:8: lv_numericSign_19_7= RULE_DIVIDE
                            {
                            lv_numericSign_19_7=(Token)match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleExpression_aux3953); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_7, grammarAccess.getExpression_auxAccess().getNumericSignDIVIDETerminalRuleCall_6_0_0_6()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_7, 
                                      		"DIVIDE");
                              	    
                            }

                            }
                            break;
                        case 8 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2269:8: lv_numericSign_19_8= RULE_DIVIDE_EQUAL
                            {
                            lv_numericSign_19_8=(Token)match(input,RULE_DIVIDE_EQUAL,FOLLOW_RULE_DIVIDE_EQUAL_in_ruleExpression_aux3973); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_8, grammarAccess.getExpression_auxAccess().getNumericSignDIVIDE_EQUALTerminalRuleCall_6_0_0_7()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_8, 
                                      		"DIVIDE_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 9 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2284:8: lv_numericSign_19_9= RULE_MODULE
                            {
                            lv_numericSign_19_9=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_ruleExpression_aux3993); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_9, grammarAccess.getExpression_auxAccess().getNumericSignMODULETerminalRuleCall_6_0_0_8()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_9, 
                                      		"MODULE");
                              	    
                            }

                            }
                            break;
                        case 10 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2299:8: lv_numericSign_19_10= RULE_MODULE_EQUAL
                            {
                            lv_numericSign_19_10=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux4013); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_10, grammarAccess.getExpression_auxAccess().getNumericSignMODULE_EQUALTerminalRuleCall_6_0_0_9()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_10, 
                                      		"MODULE_EQUAL");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2317:2: ( (lv_exp2_20_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2318:1: (lv_exp2_20_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2318:1: (lv_exp2_20_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2319:3: lv_exp2_20_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4042);
                    lv_exp2_20_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_20_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2335:2: ( (lv_aux_21_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2336:1: (lv_aux_21_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2336:1: (lv_aux_21_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2337:3: lv_aux_21_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux4063);
                    lv_aux_21_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_21_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2355:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2355:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2356:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2356:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
                    int alt39=6;
                    switch ( input.LA(1) ) {
                    case RULE_BT:
                        {
                        alt39=1;
                        }
                        break;
                    case RULE_ST:
                        {
                        alt39=2;
                        }
                        break;
                    case RULE_BE:
                        {
                        alt39=3;
                        }
                        break;
                    case RULE_SE:
                        {
                        alt39=4;
                        }
                        break;
                    case RULE_DOUBLE_EQUAL:
                        {
                        alt39=5;
                        }
                        break;
                    case RULE_DIFFERENT:
                        {
                        alt39=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2357:3: lv_testingSign_22_1= RULE_BT
                            {
                            lv_testingSign_22_1=(Token)match(input,RULE_BT,FOLLOW_RULE_BT_in_ruleExpression_aux4090); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_1, grammarAccess.getExpression_auxAccess().getTestingSignBTTerminalRuleCall_7_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_1, 
                                      		"BT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2372:8: lv_testingSign_22_2= RULE_ST
                            {
                            lv_testingSign_22_2=(Token)match(input,RULE_ST,FOLLOW_RULE_ST_in_ruleExpression_aux4110); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_2, grammarAccess.getExpression_auxAccess().getTestingSignSTTerminalRuleCall_7_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_2, 
                                      		"ST");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2387:8: lv_testingSign_22_3= RULE_BE
                            {
                            lv_testingSign_22_3=(Token)match(input,RULE_BE,FOLLOW_RULE_BE_in_ruleExpression_aux4130); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_3, grammarAccess.getExpression_auxAccess().getTestingSignBETerminalRuleCall_7_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_3, 
                                      		"BE");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:8: lv_testingSign_22_4= RULE_SE
                            {
                            lv_testingSign_22_4=(Token)match(input,RULE_SE,FOLLOW_RULE_SE_in_ruleExpression_aux4150); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_4, grammarAccess.getExpression_auxAccess().getTestingSignSETerminalRuleCall_7_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_4, 
                                      		"SE");
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2417:8: lv_testingSign_22_5= RULE_DOUBLE_EQUAL
                            {
                            lv_testingSign_22_5=(Token)match(input,RULE_DOUBLE_EQUAL,FOLLOW_RULE_DOUBLE_EQUAL_in_ruleExpression_aux4170); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_5, grammarAccess.getExpression_auxAccess().getTestingSignDOUBLE_EQUALTerminalRuleCall_7_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_5, 
                                      		"DOUBLE_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2432:8: lv_testingSign_22_6= RULE_DIFFERENT
                            {
                            lv_testingSign_22_6=(Token)match(input,RULE_DIFFERENT,FOLLOW_RULE_DIFFERENT_in_ruleExpression_aux4190); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_6, grammarAccess.getExpression_auxAccess().getTestingSignDIFFERENTTerminalRuleCall_7_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_6, 
                                      		"DIFFERENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2450:2: ( (lv_exp1_23_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2451:1: (lv_exp1_23_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2451:1: (lv_exp1_23_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2452:3: lv_exp1_23_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4219);
                    lv_exp1_23_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_23_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2468:2: ( (lv_aux_24_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2469:1: (lv_aux_24_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2469:1: (lv_aux_24_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2470:3: lv_aux_24_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux4240);
                    lv_aux_24_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_24_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=RULE_MODULE && LA41_0<=RULE_MODULE_EQUAL)||(LA41_0>=RULE_OR && LA41_0<=RULE_DOUBLE_OR_EQUAL)) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_AMPERSAND) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2488:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2488:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2489:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2489:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                            int alt40=7;
                            switch ( input.LA(1) ) {
                            case RULE_OR:
                                {
                                alt40=1;
                                }
                                break;
                            case RULE_OR_EQUAL:
                                {
                                alt40=2;
                                }
                                break;
                            case RULE_EXP:
                                {
                                alt40=3;
                                }
                                break;
                            case RULE_EXP_EQUAL:
                                {
                                alt40=4;
                                }
                                break;
                            case RULE_DOUBLE_OR_EQUAL:
                                {
                                alt40=5;
                                }
                                break;
                            case RULE_MODULE:
                                {
                                alt40=6;
                                }
                                break;
                            case RULE_MODULE_EQUAL:
                                {
                                alt40=7;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 0, input);

                                throw nvae;
                            }

                            switch (alt40) {
                                case 1 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2490:3: lv_logicalSign_25_1= RULE_OR
                                    {
                                    lv_logicalSign_25_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleExpression_aux4268); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_1, grammarAccess.getExpression_auxAccess().getLogicalSignORTerminalRuleCall_8_0_0_0_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_1, 
                                              		"OR");
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2505:8: lv_logicalSign_25_2= RULE_OR_EQUAL
                                    {
                                    lv_logicalSign_25_2=(Token)match(input,RULE_OR_EQUAL,FOLLOW_RULE_OR_EQUAL_in_ruleExpression_aux4288); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_2, grammarAccess.getExpression_auxAccess().getLogicalSignOR_EQUALTerminalRuleCall_8_0_0_0_1()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_2, 
                                              		"OR_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2520:8: lv_logicalSign_25_3= RULE_EXP
                                    {
                                    lv_logicalSign_25_3=(Token)match(input,RULE_EXP,FOLLOW_RULE_EXP_in_ruleExpression_aux4308); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_3, grammarAccess.getExpression_auxAccess().getLogicalSignEXPTerminalRuleCall_8_0_0_0_2()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_3, 
                                              		"EXP");
                                      	    
                                    }

                                    }
                                    break;
                                case 4 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2535:8: lv_logicalSign_25_4= RULE_EXP_EQUAL
                                    {
                                    lv_logicalSign_25_4=(Token)match(input,RULE_EXP_EQUAL,FOLLOW_RULE_EXP_EQUAL_in_ruleExpression_aux4328); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_4, grammarAccess.getExpression_auxAccess().getLogicalSignEXP_EQUALTerminalRuleCall_8_0_0_0_3()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_4, 
                                              		"EXP_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 5 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2550:8: lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL
                                    {
                                    lv_logicalSign_25_5=(Token)match(input,RULE_DOUBLE_OR_EQUAL,FOLLOW_RULE_DOUBLE_OR_EQUAL_in_ruleExpression_aux4348); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_5, grammarAccess.getExpression_auxAccess().getLogicalSignDOUBLE_OR_EQUALTerminalRuleCall_8_0_0_0_4()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_5, 
                                              		"DOUBLE_OR_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 6 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2565:8: lv_logicalSign_25_6= RULE_MODULE
                                    {
                                    lv_logicalSign_25_6=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_ruleExpression_aux4368); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_6, grammarAccess.getExpression_auxAccess().getLogicalSignMODULETerminalRuleCall_8_0_0_0_5()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_6, 
                                              		"MODULE");
                                      	    
                                    }

                                    }
                                    break;
                                case 7 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2580:8: lv_logicalSign_25_7= RULE_MODULE_EQUAL
                                    {
                                    lv_logicalSign_25_7=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux4388); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_7, grammarAccess.getExpression_auxAccess().getLogicalSignMODULE_EQUALTerminalRuleCall_8_0_0_0_6()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_7, 
                                              		"MODULE_EQUAL");
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2599:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2599:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2600:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2600:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2601:3: lv_ampersand_26_0= ruleAmpersand_Rule
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAmpersandAmpersand_RuleParserRuleCall_8_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAmpersand_Rule_in_ruleExpression_aux4423);
                            lv_ampersand_26_0=ruleAmpersand_Rule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ampersand",
                                      		lv_ampersand_26_0, 
                                      		"Ampersand_Rule");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2617:3: ( (lv_exp1_27_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2618:1: (lv_exp1_27_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2618:1: (lv_exp1_27_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2619:3: lv_exp1_27_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4445);
                    lv_exp1_27_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_27_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2635:2: ( (lv_aux_28_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2636:1: (lv_aux_28_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2636:1: (lv_aux_28_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2637:3: lv_aux_28_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux4466);
                    lv_aux_28_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_28_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:7: this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) )
                    {
                    this_WAT_29=(Token)match(input,RULE_WAT,FOLLOW_RULE_WAT_in_ruleExpression_aux4485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WAT_29, grammarAccess.getExpression_auxAccess().getWATTerminalRuleCall_9_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2658:1: ( (lv_exp1_30_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2659:1: (lv_exp1_30_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2659:1: (lv_exp1_30_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2660:3: lv_exp1_30_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4505);
                    lv_exp1_30_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_30_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_COLON_31=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleExpression_aux4516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_31, grammarAccess.getExpression_auxAccess().getCOLONTerminalRuleCall_9_2()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2680:1: ( (lv_exp2_32_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2681:1: (lv_exp2_32_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2681:1: (lv_exp2_32_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2682:3: lv_exp2_32_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4536);
                    lv_exp2_32_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_32_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2698:2: ( (lv_aux_33_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2699:1: (lv_aux_33_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2699:1: (lv_aux_33_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2700:3: lv_aux_33_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_9_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux4557);
                    lv_aux_33_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_33_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:6: ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:6: ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:7: ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:7: ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2718:1: ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2718:1: ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2719:1: (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2719:1: (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_PLUS) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==RULE_PLUS_EQUAL) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2720:3: lv_stringSign_34_1= RULE_PLUS
                            {
                            lv_stringSign_34_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExpression_aux4584); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_stringSign_34_1, grammarAccess.getExpression_auxAccess().getStringSignPLUSTerminalRuleCall_10_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"stringSign",
                                      		lv_stringSign_34_1, 
                                      		"PLUS");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2735:8: lv_stringSign_34_2= RULE_PLUS_EQUAL
                            {
                            lv_stringSign_34_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux4604); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_stringSign_34_2, grammarAccess.getExpression_auxAccess().getStringSignPLUS_EQUALTerminalRuleCall_10_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"stringSign",
                                      		lv_stringSign_34_2, 
                                      		"PLUS_EQUAL");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2753:2: ( (lv_exp1_35_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2754:1: (lv_exp1_35_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2754:1: (lv_exp1_35_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2755:3: lv_exp1_35_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4633);
                    lv_exp1_35_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_35_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2771:2: ( (lv_aux_36_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2772:1: (lv_aux_36_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2772:1: (lv_aux_36_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2773:3: lv_aux_36_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux4654);
                    lv_aux_36_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_36_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2791:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2791:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2792:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2792:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
                    int alt43=4;
                    switch ( input.LA(1) ) {
                    case RULE_R_SHIFT_EQUAL:
                        {
                        alt43=1;
                        }
                        break;
                    case RULE_L_SHIFT:
                        {
                        alt43=2;
                        }
                        break;
                    case RULE_R_SHIFT:
                        {
                        alt43=3;
                        }
                        break;
                    case RULE_SUPER_SHIFT:
                        {
                        alt43=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2793:3: lv_bitSign_37_1= RULE_R_SHIFT_EQUAL
                            {
                            lv_bitSign_37_1=(Token)match(input,RULE_R_SHIFT_EQUAL,FOLLOW_RULE_R_SHIFT_EQUAL_in_ruleExpression_aux4681); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_1, grammarAccess.getExpression_auxAccess().getBitSignR_SHIFT_EQUALTerminalRuleCall_11_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_1, 
                                      		"R_SHIFT_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2808:8: lv_bitSign_37_2= RULE_L_SHIFT
                            {
                            lv_bitSign_37_2=(Token)match(input,RULE_L_SHIFT,FOLLOW_RULE_L_SHIFT_in_ruleExpression_aux4701); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_2, grammarAccess.getExpression_auxAccess().getBitSignL_SHIFTTerminalRuleCall_11_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_2, 
                                      		"L_SHIFT");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2823:8: lv_bitSign_37_3= RULE_R_SHIFT
                            {
                            lv_bitSign_37_3=(Token)match(input,RULE_R_SHIFT,FOLLOW_RULE_R_SHIFT_in_ruleExpression_aux4721); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_3, grammarAccess.getExpression_auxAccess().getBitSignR_SHIFTTerminalRuleCall_11_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_3, 
                                      		"R_SHIFT");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2838:8: lv_bitSign_37_4= RULE_SUPER_SHIFT
                            {
                            lv_bitSign_37_4=(Token)match(input,RULE_SUPER_SHIFT,FOLLOW_RULE_SUPER_SHIFT_in_ruleExpression_aux4741); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_4, grammarAccess.getExpression_auxAccess().getBitSignSUPER_SHIFTTerminalRuleCall_11_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_4, 
                                      		"SUPER_SHIFT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2856:2: ( (lv_expressionBit_38_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2857:1: (lv_expressionBit_38_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2857:1: (lv_expressionBit_38_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2858:3: lv_expressionBit_38_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionBitExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux4770);
                    lv_expressionBit_38_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionBit",
                              		lv_expressionBit_38_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2874:2: ( (lv_aux_39_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2875:1: (lv_aux_39_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2875:1: (lv_aux_39_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2876:3: lv_aux_39_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux4791);
                    lv_aux_39_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_39_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2893:6: ()
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2893:6: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2894:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_auxAccess().getExpression_auxAction_12(),
                                  current);
                          
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
    // $ANTLR end "ruleExpression_aux"


    // $ANTLR start "entryRuleAmpersand_Rule"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2910:1: entryRuleAmpersand_Rule returns [EObject current=null] : iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF ;
    public final EObject entryRuleAmpersand_Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmpersand_Rule = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2911:2: (iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2912:2: iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAmpersand_RuleRule()); 
            }
            pushFollow(FOLLOW_ruleAmpersand_Rule_in_entryRuleAmpersand_Rule4846);
            iv_ruleAmpersand_Rule=ruleAmpersand_Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAmpersand_Rule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAmpersand_Rule4856); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAmpersand_Rule"


    // $ANTLR start "ruleAmpersand_Rule"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2919:1: ruleAmpersand_Rule returns [EObject current=null] : ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | this_EQUAL_2= RULE_EQUAL )? ) ;
    public final EObject ruleAmpersand_Rule() throws RecognitionException {
        EObject current = null;

        Token lv_a1_0_0=null;
        Token lv_a2_1_0=null;
        Token this_EQUAL_2=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2922:28: ( ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | this_EQUAL_2= RULE_EQUAL )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2923:1: ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | this_EQUAL_2= RULE_EQUAL )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2923:1: ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | this_EQUAL_2= RULE_EQUAL )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2923:2: ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | this_EQUAL_2= RULE_EQUAL )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2923:2: ( (lv_a1_0_0= RULE_AMPERSAND ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2924:1: (lv_a1_0_0= RULE_AMPERSAND )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2924:1: (lv_a1_0_0= RULE_AMPERSAND )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2925:3: lv_a1_0_0= RULE_AMPERSAND
            {
            lv_a1_0_0=(Token)match(input,RULE_AMPERSAND,FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule4898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_a1_0_0, grammarAccess.getAmpersand_RuleAccess().getA1AMPERSANDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAmpersand_RuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"a1",
                      		lv_a1_0_0, 
                      		"AMPERSAND");
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2941:2: ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | this_EQUAL_2= RULE_EQUAL )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_AMPERSAND) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_EQUAL) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2941:3: ( (lv_a2_1_0= RULE_AMPERSAND ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2941:3: ( (lv_a2_1_0= RULE_AMPERSAND ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2942:1: (lv_a2_1_0= RULE_AMPERSAND )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2942:1: (lv_a2_1_0= RULE_AMPERSAND )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2943:3: lv_a2_1_0= RULE_AMPERSAND
                    {
                    lv_a2_1_0=(Token)match(input,RULE_AMPERSAND,FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule4921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_a2_1_0, grammarAccess.getAmpersand_RuleAccess().getA2AMPERSANDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAmpersand_RuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"a2",
                              		lv_a2_1_0, 
                              		"AMPERSAND");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2960:6: this_EQUAL_2= RULE_EQUAL
                    {
                    this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleAmpersand_Rule4943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_2, grammarAccess.getAmpersand_RuleAccess().getEQUALTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "ruleAmpersand_Rule"


    // $ANTLR start "entryRuleFloat_Literal"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2972:1: entryRuleFloat_Literal returns [EObject current=null] : iv_ruleFloat_Literal= ruleFloat_Literal EOF ;
    public final EObject entryRuleFloat_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat_Literal = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2973:2: (iv_ruleFloat_Literal= ruleFloat_Literal EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2974:2: iv_ruleFloat_Literal= ruleFloat_Literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_LiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloat_Literal_in_entryRuleFloat_Literal4980);
            iv_ruleFloat_Literal=ruleFloat_Literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat_Literal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat_Literal4990); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloat_Literal"


    // $ANTLR start "ruleFloat_Literal"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2981:1: ruleFloat_Literal returns [EObject current=null] : ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) ;
    public final EObject ruleFloat_Literal() throws RecognitionException {
        EObject current = null;

        Token lv_decimalDigits1_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalDigits2_2_0=null;
        Token lv_floatTypeSufix_4_0=null;
        AntlrDatatypeRuleToken lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2984:28: ( ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2985:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2985:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2985:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2985:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2986:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2986:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2987:3: lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS
            {
            lv_decimalDigits1_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal5032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_decimalDigits1_0_0, grammarAccess.getFloat_LiteralAccess().getDecimalDigits1DECIMAL_DIGITSTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"decimalDigits1",
                      		lv_decimalDigits1_0_0, 
                      		"DECIMAL_DIGITS");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleFloat_Literal5049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloat_LiteralAccess().getFullStopKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3007:1: ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DECIMAL_DIGITS) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred94_InternalJava()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3008:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3008:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3009:3: lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimalDigits2_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal5066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_decimalDigits2_2_0, grammarAccess.getFloat_LiteralAccess().getDecimalDigits2DECIMAL_DIGITSTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"decimalDigits2",
                              		lv_decimalDigits2_2_0, 
                              		"DECIMAL_DIGITS");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3025:3: ( (lv_exp_3_0= ruleEXPOENT_PART ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_EXPONENTIAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3026:1: (lv_exp_3_0= ruleEXPOENT_PART )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3026:1: (lv_exp_3_0= ruleEXPOENT_PART )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3027:3: lv_exp_3_0= ruleEXPOENT_PART
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloat_LiteralAccess().getExpEXPOENT_PARTParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEXPOENT_PART_in_ruleFloat_Literal5093);
                    lv_exp_3_0=ruleEXPOENT_PART();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_3_0, 
                              		"EXPOENT_PART");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3043:3: ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_FLOAT_TYPE_SUFIX) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3044:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3044:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3045:3: lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX
                    {
                    lv_floatTypeSufix_4_0=(Token)match(input,RULE_FLOAT_TYPE_SUFIX,FOLLOW_RULE_FLOAT_TYPE_SUFIX_in_ruleFloat_Literal5111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_floatTypeSufix_4_0, grammarAccess.getFloat_LiteralAccess().getFloatTypeSufixFLOAT_TYPE_SUFIXTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"floatTypeSufix",
                              		lv_floatTypeSufix_4_0, 
                              		"FLOAT_TYPE_SUFIX");
                      	    
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
    // $ANTLR end "ruleFloat_Literal"


    // $ANTLR start "entryRuleLiteral_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3069:1: entryRuleLiteral_Expression returns [EObject current=null] : iv_ruleLiteral_Expression= ruleLiteral_Expression EOF ;
    public final EObject entryRuleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3070:2: (iv_ruleLiteral_Expression= ruleLiteral_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3071:2: iv_ruleLiteral_Expression= ruleLiteral_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_Expression_in_entryRuleLiteral_Expression5153);
            iv_ruleLiteral_Expression=ruleLiteral_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral_Expression5163); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral_Expression"


    // $ANTLR start "ruleLiteral_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3078:1: ruleLiteral_Expression returns [EObject current=null] : ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) ) ;
    public final EObject ruleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        Token lv_exp_0_0=null;
        Token this_LONG_1=null;
        Token lv_exp1_2_0=null;
        Token this_LONG_3=null;
        Token lv_string_5_0=null;
        Token lv_char_6_0=null;
        EObject lv_exp2_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3081:28: ( ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_HEXA:
                {
                alt52=1;
                }
                break;
            case RULE_DECIMAL_DIGITS:
                {
                int LA52_2 = input.LA(2);

                if ( (synpred100_InternalJava()) ) {
                    alt52=1;
                }
                else if ( (synpred101_InternalJava()) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt52=3;
                }
                break;
            case RULE_CHAR:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_HEXA) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==RULE_DECIMAL_DIGITS) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:4: ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )?
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:4: ( (lv_exp_0_0= RULE_HEXA ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3083:1: (lv_exp_0_0= RULE_HEXA )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3083:1: (lv_exp_0_0= RULE_HEXA )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3084:3: lv_exp_0_0= RULE_HEXA
                            {
                            lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_ruleLiteral_Expression5207); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_exp_0_0, grammarAccess.getLiteral_ExpressionAccess().getExpHEXATerminalRuleCall_0_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"exp",
                                      		lv_exp_0_0, 
                                      		"HEXA");
                              	    
                            }

                            }


                            }

                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3100:2: (this_LONG_1= RULE_LONG )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==RULE_LONG) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3100:3: this_LONG_1= RULE_LONG
                                    {
                                    this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_ruleLiteral_Expression5224); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_LONG_1, grammarAccess.getLiteral_ExpressionAccess().getLONGTerminalRuleCall_0_0_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )?
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3106:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3106:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3107:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                            {
                            lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleLiteral_Expression5250); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_exp1_2_0, grammarAccess.getLiteral_ExpressionAccess().getExp1DECIMAL_DIGITSTerminalRuleCall_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"exp1",
                                      		lv_exp1_2_0, 
                                      		"DECIMAL_DIGITS");
                              	    
                            }

                            }


                            }

                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3123:2: (this_LONG_3= RULE_LONG )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==RULE_LONG) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3123:3: this_LONG_3= RULE_LONG
                                    {
                                    this_LONG_3=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_ruleLiteral_Expression5267); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_LONG_3, grammarAccess.getLiteral_ExpressionAccess().getLONGTerminalRuleCall_0_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3128:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3128:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3129:1: (lv_exp2_4_0= ruleFloat_Literal )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3129:1: (lv_exp2_4_0= ruleFloat_Literal )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3130:3: lv_exp2_4_0= ruleFloat_Literal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloat_Literal_in_ruleLiteral_Expression5297);
                    lv_exp2_4_0=ruleFloat_Literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_4_0, 
                              		"Float_Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3147:6: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3147:6: ( (lv_string_5_0= RULE_STRING ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3148:1: (lv_string_5_0= RULE_STRING )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3148:1: (lv_string_5_0= RULE_STRING )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3149:3: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral_Expression5320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_5_0, grammarAccess.getLiteral_ExpressionAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3166:6: ( (lv_char_6_0= RULE_CHAR ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3166:6: ( (lv_char_6_0= RULE_CHAR ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3167:1: (lv_char_6_0= RULE_CHAR )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3167:1: (lv_char_6_0= RULE_CHAR )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3168:3: lv_char_6_0= RULE_CHAR
                    {
                    lv_char_6_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleLiteral_Expression5348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_char_6_0, grammarAccess.getLiteral_ExpressionAccess().getCharCHARTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"char",
                              		lv_char_6_0, 
                              		"CHAR");
                      	    
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
    // $ANTLR end "ruleLiteral_Expression"


    // $ANTLR start "entryRuleCreating_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3192:1: entryRuleCreating_Expression returns [EObject current=null] : iv_ruleCreating_Expression= ruleCreating_Expression EOF ;
    public final EObject entryRuleCreating_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreating_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3193:2: (iv_ruleCreating_Expression= ruleCreating_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3194:2: iv_ruleCreating_Expression= ruleCreating_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCreating_Expression_in_entryRuleCreating_Expression5389);
            iv_ruleCreating_Expression=ruleCreating_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreating_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreating_Expression5399); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreating_Expression"


    // $ANTLR start "ruleCreating_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3201:1: ruleCreating_Expression returns [EObject current=null] : (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) ) ) ;
    public final EObject ruleCreating_Expression() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        Token this_RIGHT_PARENTHESIS_2=null;
        Token this_LEFT_PARENTHESIS_4=null;
        Token this_R_ABS_6=null;
        Token this_L_ABS_8=null;
        Token this_R_ABS_9=null;
        Token this_L_ABS_10=null;
        Token this_ABS_11=null;
        Token this_RIGHT_PARENTHESIS_12=null;
        Token this_LEFT_PARENTHESIS_14=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;

        AntlrDatatypeRuleToken lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_expression_13_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3204:28: ( (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3205:1: (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3205:1: (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3205:2: this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleCreating_Expression5435); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NEW_0, grammarAccess.getCreating_ExpressionAccess().getNEWTerminalRuleCall_0()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) )
            int alt55=3;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:3: ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3210:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3210:1: (lv_className_1_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3211:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleCreating_Expression5457);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_1_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_PARENTHESIS_2=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleCreating_Expression5468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PARENTHESIS_2, grammarAccess.getCreating_ExpressionAccess().getRIGHT_PARENTHESISTerminalRuleCall_1_0_1()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3231:1: ( (lv_argList_3_0= ruleArg_List ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3232:1: (lv_argList_3_0= ruleArg_List )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3232:1: (lv_argList_3_0= ruleArg_List )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3233:3: lv_argList_3_0= ruleArg_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArg_List_in_ruleCreating_Expression5488);
                    lv_argList_3_0=ruleArg_List();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argList",
                              		lv_argList_3_0, 
                              		"Arg_List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleCreating_Expression5499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PARENTHESIS_4, grammarAccess.getCreating_ExpressionAccess().getLEFT_PARENTHESISTerminalRuleCall_1_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )*
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3255:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3255:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3256:3: lv_typeSpecifier_5_0= ruleType_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_specifier_in_ruleCreating_Expression5527);
                    lv_typeSpecifier_5_0=ruleType_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_5_0, 
                              		"Type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3272:2: (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )?
                    int alt53=2;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3272:3: this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS
                            {
                            this_R_ABS_6=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleCreating_Expression5539); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_R_ABS_6, grammarAccess.getCreating_ExpressionAccess().getR_ABSTerminalRuleCall_1_1_1_0()); 
                                  
                            }
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:1: ( (lv_expression_7_0= ruleExpression ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:1: (lv_expression_7_0= ruleExpression )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:1: (lv_expression_7_0= ruleExpression )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3278:3: lv_expression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCreating_Expression5559);
                            lv_expression_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_7_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_L_ABS_8=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleCreating_Expression5570); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_L_ABS_8, grammarAccess.getCreating_ExpressionAccess().getL_ABSTerminalRuleCall_1_1_1_2()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:3: ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )*
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_R_ABS) ) {
                            int LA54_2 = input.LA(2);

                            if ( (LA54_2==RULE_L_ABS) ) {
                                alt54=1;
                            }


                        }
                        else if ( (LA54_0==RULE_ABS) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:4: (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:4: (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:5: this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS
                    	    {
                    	    this_R_ABS_9=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleCreating_Expression5584); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_R_ABS_9, grammarAccess.getCreating_ExpressionAccess().getR_ABSTerminalRuleCall_1_1_2_0_0()); 
                    	          
                    	    }
                    	    this_L_ABS_10=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleCreating_Expression5594); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_L_ABS_10, grammarAccess.getCreating_ExpressionAccess().getL_ABSTerminalRuleCall_1_1_2_0_1()); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3307:6: this_ABS_11= RULE_ABS
                    	    {
                    	    this_ABS_11=(Token)match(input,RULE_ABS,FOLLOW_RULE_ABS_in_ruleCreating_Expression5611); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ABS_11, grammarAccess.getCreating_ExpressionAccess().getABSTerminalRuleCall_1_1_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:6: (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:6: (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:7: this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS
                    {
                    this_RIGHT_PARENTHESIS_12=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleCreating_Expression5631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_PARENTHESIS_12, grammarAccess.getCreating_ExpressionAccess().getRIGHT_PARENTHESISTerminalRuleCall_1_2_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3316:1: ( (lv_expression_13_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3317:1: (lv_expression_13_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3317:1: (lv_expression_13_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3318:3: lv_expression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCreating_Expression5651);
                    lv_expression_13_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_13_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LEFT_PARENTHESIS_14=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleCreating_Expression5662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_PARENTHESIS_14, grammarAccess.getCreating_ExpressionAccess().getLEFT_PARENTHESISTerminalRuleCall_1_2_2()); 
                          
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
    // $ANTLR end "ruleCreating_Expression"


    // $ANTLR start "entryRuleCast_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3346:1: entryRuleCast_Expression returns [EObject current=null] : iv_ruleCast_Expression= ruleCast_Expression EOF ;
    public final EObject entryRuleCast_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3347:2: (iv_ruleCast_Expression= ruleCast_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3348:2: iv_ruleCast_Expression= ruleCast_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCast_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCast_Expression_in_entryRuleCast_Expression5699);
            iv_ruleCast_Expression=ruleCast_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCast_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast_Expression5709); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCast_Expression"


    // $ANTLR start "ruleCast_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3355:1: ruleCast_Expression returns [EObject current=null] : (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_type_1_0= ruleType ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCast_Expression() throws RecognitionException {
        EObject current = null;

        Token this_RIGHT_PARENTHESIS_0=null;
        Token this_LEFT_PARENTHESIS_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3358:28: ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_type_1_0= ruleType ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3359:1: (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_type_1_0= ruleType ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3359:1: (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_type_1_0= ruleType ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3359:2: this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_type_1_0= ruleType ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) )
            {
            this_RIGHT_PARENTHESIS_0=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleCast_Expression5745); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_0, grammarAccess.getCast_ExpressionAccess().getRIGHT_PARENTHESISTerminalRuleCall_0()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3363:1: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3364:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3364:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3365:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleCast_Expression5765);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCast_ExpressionRule());
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

            this_LEFT_PARENTHESIS_2=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleCast_Expression5776); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_2, grammarAccess.getCast_ExpressionAccess().getLEFT_PARENTHESISTerminalRuleCall_2()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3385:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3386:1: (lv_expression_3_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3386:1: (lv_expression_3_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3387:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCast_Expression5796);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCast_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression");
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
    // $ANTLR end "ruleCast_Expression"


    // $ANTLR start "entryRuleBit_Expression_NR"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3411:1: entryRuleBit_Expression_NR returns [EObject current=null] : iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF ;
    public final EObject entryRuleBit_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBit_Expression_NR = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3412:2: (iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3413:2: iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_ruleBit_Expression_NR_in_entryRuleBit_Expression_NR5832);
            iv_ruleBit_Expression_NR=ruleBit_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBit_Expression_NR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Expression_NR5842); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBit_Expression_NR"


    // $ANTLR start "ruleBit_Expression_NR"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3420:1: ruleBit_Expression_NR returns [EObject current=null] : (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBit_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3423:28: ( (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3424:1: (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3424:1: (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3424:2: this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) )
            {
            this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleBit_Expression_NR5878); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_0, grammarAccess.getBit_Expression_NRAccess().getNOTTerminalRuleCall_0()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3428:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3429:1: (lv_expression_1_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3429:1: (lv_expression_1_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3430:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleBit_Expression_NR5898);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBit_Expression_NRRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
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
    // $ANTLR end "ruleBit_Expression_NR"


    // $ANTLR start "entryRuleLogical_Expression_NR"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3454:1: entryRuleLogical_Expression_NR returns [EObject current=null] : iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF ;
    public final EObject entryRuleLogical_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical_Expression_NR = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3455:2: (iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3456:2: iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_Expression_NR_in_entryRuleLogical_Expression_NR5934);
            iv_ruleLogical_Expression_NR=ruleLogical_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_Expression_NR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical_Expression_NR5944); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogical_Expression_NR"


    // $ANTLR start "ruleLogical_Expression_NR"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3463:1: ruleLogical_Expression_NR returns [EObject current=null] : ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) ;
    public final EObject ruleLogical_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token this_EXCLAMATION_0=null;
        Token lv_true_2_0=null;
        Token lv_false_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3466:28: ( ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3467:1: ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3467:1: ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case RULE_EXCLAMATION:
                {
                alt56=1;
                }
                break;
            case RULE_TRUE:
                {
                alt56=2;
                }
                break;
            case RULE_FALSE:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3467:2: (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3467:2: (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3467:3: this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) )
                    {
                    this_EXCLAMATION_0=(Token)match(input,RULE_EXCLAMATION,FOLLOW_RULE_EXCLAMATION_in_ruleLogical_Expression_NR5981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXCLAMATION_0, grammarAccess.getLogical_Expression_NRAccess().getEXCLAMATIONTerminalRuleCall_0_0()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3471:1: ( (lv_expression_1_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3472:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3472:1: (lv_expression_1_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3473:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_Expression_NRAccess().getExpressionExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLogical_Expression_NR6001);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3490:6: ( (lv_true_2_0= RULE_TRUE ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3490:6: ( (lv_true_2_0= RULE_TRUE ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3491:1: (lv_true_2_0= RULE_TRUE )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3491:1: (lv_true_2_0= RULE_TRUE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3492:3: lv_true_2_0= RULE_TRUE
                    {
                    lv_true_2_0=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLogical_Expression_NR6025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_true_2_0, grammarAccess.getLogical_Expression_NRAccess().getTrueTRUETerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"true",
                              		lv_true_2_0, 
                              		"TRUE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3509:6: ( (lv_false_3_0= RULE_FALSE ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3509:6: ( (lv_false_3_0= RULE_FALSE ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3510:1: (lv_false_3_0= RULE_FALSE )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3510:1: (lv_false_3_0= RULE_FALSE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3511:3: lv_false_3_0= RULE_FALSE
                    {
                    lv_false_3_0=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLogical_Expression_NR6053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_false_3_0, grammarAccess.getLogical_Expression_NRAccess().getFalseFALSETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"false",
                              		lv_false_3_0, 
                              		"FALSE");
                      	    
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
    // $ANTLR end "ruleLogical_Expression_NR"


    // $ANTLR start "entryRuleArg_List"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3535:1: entryRuleArg_List returns [EObject current=null] : iv_ruleArg_List= ruleArg_List EOF ;
    public final EObject entryRuleArg_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg_List = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3536:2: (iv_ruleArg_List= ruleArg_List EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3537:2: iv_ruleArg_List= ruleArg_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArg_ListRule()); 
            }
            pushFollow(FOLLOW_ruleArg_List_in_entryRuleArg_List6094);
            iv_ruleArg_List=ruleArg_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArg_List; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg_List6104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArg_List"


    // $ANTLR start "ruleArg_List"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3544:1: ruleArg_List returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArg_List() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3547:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3548:1: ( ( (lv_expression_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3548:1: ( ( (lv_expression_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3548:2: ( (lv_expression_0_0= ruleExpression ) ) (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3548:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3549:1: (lv_expression_0_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3549:1: (lv_expression_0_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3550:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArg_List6150);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArg_ListRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3566:2: (this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3566:3: this_COMMA_1= RULE_COMMA ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArg_List6162); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getArg_ListAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3570:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3571:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3571:1: (lv_expressions_2_0= ruleExpression )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3572:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArg_List6182);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArg_ListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleArg_List"


    // $ANTLR start "entryRuleNumeric_Expression_NR"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3596:1: entryRuleNumeric_Expression_NR returns [EObject current=null] : iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF ;
    public final EObject entryRuleNumeric_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Expression_NR = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3597:2: (iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3598:2: iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_ruleNumeric_Expression_NR_in_entryRuleNumeric_Expression_NR6220);
            iv_ruleNumeric_Expression_NR=ruleNumeric_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric_Expression_NR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Expression_NR6230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumeric_Expression_NR"


    // $ANTLR start "ruleNumeric_Expression_NR"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3605:1: ruleNumeric_Expression_NR returns [EObject current=null] : ( ( ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNumeric_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token lv_sinal_numeric_0_1=null;
        Token lv_sinal_numeric_0_2=null;
        Token lv_sinal_numeric_0_3=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3608:28: ( ( ( ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3609:1: ( ( ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3609:1: ( ( ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3609:2: ( ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3609:2: ( ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3610:1: ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3610:1: ( (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3611:1: (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3611:1: (lv_sinal_numeric_0_1= RULE_MINUS | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT )
            int alt58=3;
            switch ( input.LA(1) ) {
            case RULE_MINUS:
                {
                alt58=1;
                }
                break;
            case RULE_INCREMENT:
                {
                alt58=2;
                }
                break;
            case RULE_DECREMENT:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3612:3: lv_sinal_numeric_0_1= RULE_MINUS
                    {
                    lv_sinal_numeric_0_1=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleNumeric_Expression_NR6274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_1, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericMINUSTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_1, 
                              		"MINUS");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3627:8: lv_sinal_numeric_0_2= RULE_INCREMENT
                    {
                    lv_sinal_numeric_0_2=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_ruleNumeric_Expression_NR6294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_2, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericINCREMENTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_2, 
                              		"INCREMENT");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3642:8: lv_sinal_numeric_0_3= RULE_DECREMENT
                    {
                    lv_sinal_numeric_0_3=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleNumeric_Expression_NR6314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_3, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericDECREMENTTerminalRuleCall_0_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_3, 
                              		"DECREMENT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3660:2: ( (lv_expression_1_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3661:1: (lv_expression_1_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3661:1: (lv_expression_1_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3662:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNumeric_Expression_NR6343);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_NRRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
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
    // $ANTLR end "ruleNumeric_Expression_NR"


    // $ANTLR start "entryRuleType"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3686:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3687:2: (iv_ruleType= ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3688:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType6379);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6389); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3695:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= ruleType_specifier ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token this_R_ABS_1=null;
        Token this_L_ABS_2=null;
        Token this_ABS_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3698:28: ( ( ( (lv_name_0_0= ruleType_specifier ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3699:1: ( ( (lv_name_0_0= ruleType_specifier ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3699:1: ( ( (lv_name_0_0= ruleType_specifier ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3699:2: ( (lv_name_0_0= ruleType_specifier ) ) ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3699:2: ( (lv_name_0_0= ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3700:1: (lv_name_0_0= ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3700:1: (lv_name_0_0= ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3701:3: lv_name_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType6435);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3717:2: ( (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS ) | this_ABS_3= RULE_ABS )*
            loop59:
            do {
                int alt59=3;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_R_ABS) ) {
                    alt59=1;
                }
                else if ( (LA59_0==RULE_ABS) ) {
                    alt59=2;
                }


                switch (alt59) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3717:3: (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3717:3: (this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3717:4: this_R_ABS_1= RULE_R_ABS this_L_ABS_2= RULE_L_ABS
            	    {
            	    this_R_ABS_1=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_ruleType6448); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_R_ABS_1, grammarAccess.getTypeAccess().getR_ABSTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    this_L_ABS_2=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_ruleType6458); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_L_ABS_2, grammarAccess.getTypeAccess().getL_ABSTerminalRuleCall_1_0_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3726:6: this_ABS_3= RULE_ABS
            	    {
            	    this_ABS_3=(Token)match(input,RULE_ABS,FOLLOW_RULE_ABS_in_ruleType6475); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ABS_3, grammarAccess.getTypeAccess().getABSTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3738:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3739:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3740:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier6513);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier6524); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3747:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_9 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3750:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3751:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3751:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name )
            int alt60=10;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt60=1;
                }
                break;
            case 88:
                {
                alt60=2;
                }
                break;
            case 89:
                {
                alt60=3;
                }
                break;
            case 90:
                {
                alt60=4;
                }
                break;
            case 91:
                {
                alt60=5;
                }
                break;
            case 92:
                {
                alt60=6;
                }
                break;
            case 93:
                {
                alt60=7;
                }
                break;
            case 94:
                {
                alt60=8;
                }
                break;
            case 95:
                {
                alt60=9;
                }
                break;
            case RULE_ID:
                {
                alt60=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3752:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleType_specifier6562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3759:2: kw= 'byte'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleType_specifier6581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3766:2: kw= 'char'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleType_specifier6600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3773:2: kw= 'short'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleType_specifier6619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3780:2: kw= 'int'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleType_specifier6638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3787:2: kw= 'float'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleType_specifier6657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3794:2: kw= 'long'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleType_specifier6676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3801:2: kw= 'double'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleType_specifier6695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3808:2: kw= 'void'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleType_specifier6714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getVoidKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3815:5: this_Class_name_9= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier6742);
                    this_Class_name_9=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Class_name_9);
                          
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3833:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3834:2: (iv_ruleModifier= ruleModifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3835:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier6788);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier6799); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3842:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3845:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3846:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3846:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_MOD) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_STATIC) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3846:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier6839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3854:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier6865); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3869:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3870:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3871:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer6910);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer6920); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3878:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3881:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3882:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3882:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3882:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3882:2: ( (lv_static_0_0= RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3883:1: (lv_static_0_0= RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3883:1: (lv_static_0_0= RULE_STATIC )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3884:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer6962); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3900:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3901:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3901:1: (lv_name_1_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3902:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer6988);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3926:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3927:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3928:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block7024);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block7034); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3935:1: ruleStatement_block returns [EObject current=null] : ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_L_CURLY_BRACE_3= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token this_R_CURLY_BRACE_1=null;
        Token this_L_CURLY_BRACE_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3938:28: ( ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_L_CURLY_BRACE_3= RULE_L_CURLY_BRACE ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3939:1: ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_L_CURLY_BRACE_3= RULE_L_CURLY_BRACE )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3939:1: ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_L_CURLY_BRACE_3= RULE_L_CURLY_BRACE )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3939:2: () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_L_CURLY_BRACE_3= RULE_L_CURLY_BRACE
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3939:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3940:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatement_blockAccess().getStatement_blockAction_0(),
                          current);
                  
            }

            }

            this_R_CURLY_BRACE_1=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleStatement_block7082); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_1, grammarAccess.getStatement_blockAccess().getR_CURLY_BRACETerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3952:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_EOL||LA62_0==RULE_ID||LA62_0==RULE_R_CURLY_BRACE||LA62_0==RULE_RIGHT_PARENTHESIS||(LA62_0>=RULE_NULL && LA62_0<=RULE_THIS)||(LA62_0>=RULE_INCREMENT && LA62_0<=RULE_DECREMENT)||LA62_0==RULE_MINUS||LA62_0==RULE_DECIMAL_DIGITS||LA62_0==RULE_HEXA||(LA62_0>=RULE_STRING && LA62_0<=RULE_SWITCH)||(LA62_0>=RULE_FOR && LA62_0<=RULE_IF)||(LA62_0>=RULE_RETURN && LA62_0<=RULE_TRY)||(LA62_0>=87 && LA62_0<=97)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3953:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3953:1: (lv_statements_2_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3954:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block7102);
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
            	    break loop62;
                }
            } while (true);

            this_L_CURLY_BRACE_3=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleStatement_block7114); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_3, grammarAccess.getStatement_blockAccess().getL_CURLY_BRACETerminalRuleCall_3()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3982:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3983:2: (iv_ruleStatement= ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3984:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement7149);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement7159); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3991:1: ruleStatement returns [EObject current=null] : ( ( (lv_returnSmt_0_0= ruleReturn_Statement ) ) | ( (lv_variable_1_0= ruleVariable_declaration ) ) | ( (lv_expressionx_2_0= ruleExpression ) ) | ( (lv_ifStatement_3_0= ruleIf_Statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_Statement ) ) | this_Statement_block_8= ruleStatement_block | ( (lv_try_9_0= ruleTry_statement ) ) | ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) ) | ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL ) | ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL ) | ( () this_EOL_22= RULE_EOL ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_10_0=null;
        Token this_COLON_11=null;
        Token otherlv_14=null;
        Token lv_name_15_0=null;
        Token this_EOL_16=null;
        Token otherlv_18=null;
        Token lv_name_19_0=null;
        Token this_EOL_20=null;
        Token this_EOL_22=null;
        EObject lv_returnSmt_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expressionx_2_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_doStatement_4_0 = null;

        EObject lv_whileStatement_5_0 = null;

        EObject lv_forStatement_6_0 = null;

        EObject lv_switchStatement_7_0 = null;

        EObject this_Statement_block_8 = null;

        EObject lv_try_9_0 = null;

        EObject lv_statement_12_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3994:28: ( ( ( (lv_returnSmt_0_0= ruleReturn_Statement ) ) | ( (lv_variable_1_0= ruleVariable_declaration ) ) | ( (lv_expressionx_2_0= ruleExpression ) ) | ( (lv_ifStatement_3_0= ruleIf_Statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_Statement ) ) | this_Statement_block_8= ruleStatement_block | ( (lv_try_9_0= ruleTry_statement ) ) | ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) ) | ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL ) | ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL ) | ( () this_EOL_22= RULE_EOL ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3995:1: ( ( (lv_returnSmt_0_0= ruleReturn_Statement ) ) | ( (lv_variable_1_0= ruleVariable_declaration ) ) | ( (lv_expressionx_2_0= ruleExpression ) ) | ( (lv_ifStatement_3_0= ruleIf_Statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_Statement ) ) | this_Statement_block_8= ruleStatement_block | ( (lv_try_9_0= ruleTry_statement ) ) | ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) ) | ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL ) | ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL ) | ( () this_EOL_22= RULE_EOL ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3995:1: ( ( (lv_returnSmt_0_0= ruleReturn_Statement ) ) | ( (lv_variable_1_0= ruleVariable_declaration ) ) | ( (lv_expressionx_2_0= ruleExpression ) ) | ( (lv_ifStatement_3_0= ruleIf_Statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_Statement ) ) | this_Statement_block_8= ruleStatement_block | ( (lv_try_9_0= ruleTry_statement ) ) | ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) ) | ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL ) | ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL ) | ( () this_EOL_22= RULE_EOL ) )
            int alt65=14;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3995:2: ( (lv_returnSmt_0_0= ruleReturn_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3995:2: ( (lv_returnSmt_0_0= ruleReturn_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3996:1: (lv_returnSmt_0_0= ruleReturn_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3996:1: (lv_returnSmt_0_0= ruleReturn_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:3: lv_returnSmt_0_0= ruleReturn_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getReturnSmtReturn_StatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturn_Statement_in_ruleStatement7205);
                    lv_returnSmt_0_0=ruleReturn_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"returnSmt",
                              		lv_returnSmt_0_0, 
                              		"Return_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4014:6: ( (lv_variable_1_0= ruleVariable_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4014:6: ( (lv_variable_1_0= ruleVariable_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4015:1: (lv_variable_1_0= ruleVariable_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4015:1: (lv_variable_1_0= ruleVariable_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4016:3: lv_variable_1_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariableVariable_declarationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleStatement7232);
                    lv_variable_1_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_1_0, 
                              		"Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4033:6: ( (lv_expressionx_2_0= ruleExpression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4033:6: ( (lv_expressionx_2_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4034:1: (lv_expressionx_2_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4034:1: (lv_expressionx_2_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4035:3: lv_expressionx_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionxExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement7259);
                    lv_expressionx_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionx",
                              		lv_expressionx_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4052:6: ( (lv_ifStatement_3_0= ruleIf_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4052:6: ( (lv_ifStatement_3_0= ruleIf_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4053:1: (lv_ifStatement_3_0= ruleIf_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4053:1: (lv_ifStatement_3_0= ruleIf_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4054:3: lv_ifStatement_3_0= ruleIf_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_StatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_Statement_in_ruleStatement7286);
                    lv_ifStatement_3_0=ruleIf_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifStatement",
                              		lv_ifStatement_3_0, 
                              		"If_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4071:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4071:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4072:1: (lv_doStatement_4_0= ruleDo_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4072:1: (lv_doStatement_4_0= ruleDo_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4073:3: lv_doStatement_4_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDo_Statement_in_ruleStatement7313);
                    lv_doStatement_4_0=ruleDo_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"doStatement",
                              		lv_doStatement_4_0, 
                              		"Do_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4090:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4090:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4091:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4091:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4092:3: lv_whileStatement_5_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_Statement_in_ruleStatement7340);
                    lv_whileStatement_5_0=ruleWhile_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whileStatement",
                              		lv_whileStatement_5_0, 
                              		"While_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4109:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4109:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4110:1: (lv_forStatement_6_0= ruleFor_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4110:1: (lv_forStatement_6_0= ruleFor_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4111:3: lv_forStatement_6_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_Statement_in_ruleStatement7367);
                    lv_forStatement_6_0=ruleFor_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forStatement",
                              		lv_forStatement_6_0, 
                              		"For_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4128:6: ( (lv_switchStatement_7_0= ruleSwitch_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4128:6: ( (lv_switchStatement_7_0= ruleSwitch_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4129:1: (lv_switchStatement_7_0= ruleSwitch_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4129:1: (lv_switchStatement_7_0= ruleSwitch_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4130:3: lv_switchStatement_7_0= ruleSwitch_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_StatementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitch_Statement_in_ruleStatement7394);
                    lv_switchStatement_7_0=ruleSwitch_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"switchStatement",
                              		lv_switchStatement_7_0, 
                              		"Switch_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4148:2: this_Statement_block_8= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleStatement7425);
                    this_Statement_block_8=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_block_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4160:6: ( (lv_try_9_0= ruleTry_statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4160:6: ( (lv_try_9_0= ruleTry_statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4161:1: (lv_try_9_0= ruleTry_statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4161:1: (lv_try_9_0= ruleTry_statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4162:3: lv_try_9_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryTry_statementParserRuleCall_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTry_statement_in_ruleStatement7451);
                    lv_try_9_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"try",
                              		lv_try_9_0, 
                              		"Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:6: ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:6: ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:7: ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:7: ( (lv_name_10_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4180:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4180:1: (lv_name_10_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4181:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement7475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_10_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_10_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_10_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleStatement7491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_11, grammarAccess.getStatementAccess().getCOLONTerminalRuleCall_10_1()); 
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4201:1: ( (lv_statement_12_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4202:1: (lv_statement_12_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4202:1: (lv_statement_12_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4203:3: lv_statement_12_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement7511);
                    lv_statement_12_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_12_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4220:6: ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4220:6: ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4220:7: () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4220:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4221:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,96,FOLLOW_96_in_ruleStatement7543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getBreakKeyword_11_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4233:1: ( (lv_name_15_0= RULE_ID ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4234:1: (lv_name_15_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4234:1: (lv_name_15_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4235:3: lv_name_15_0= RULE_ID
                            {
                            lv_name_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement7560); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_15_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_11_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_15_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_EOL_16=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleStatement7577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_16, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_11_3()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4256:6: ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4256:6: ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4256:7: () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4256:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4257:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_12_0(),
                                  current);
                          
                    }

                    }

                    otherlv_18=(Token)match(input,97,FOLLOW_97_in_ruleStatement7608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getContinueKeyword_12_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4269:1: ( (lv_name_19_0= RULE_ID ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_ID) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4270:1: (lv_name_19_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4270:1: (lv_name_19_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4271:3: lv_name_19_0= RULE_ID
                            {
                            lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement7625); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_19_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_12_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_19_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_EOL_20=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleStatement7642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_20, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_12_3()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4292:6: ( () this_EOL_22= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4292:6: ( () this_EOL_22= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4292:7: () this_EOL_22= RULE_EOL
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4292:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4293:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_13_0(),
                                  current);
                          
                    }

                    }

                    this_EOL_22=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleStatement7672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_22, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_13_1()); 
                          
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4313:1: entryRuleSwitch_Statement returns [EObject current=null] : iv_ruleSwitch_Statement= ruleSwitch_Statement EOF ;
    public final EObject entryRuleSwitch_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4314:2: (iv_ruleSwitch_Statement= ruleSwitch_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4315:2: iv_ruleSwitch_Statement= ruleSwitch_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_Statement_in_entryRuleSwitch_Statement7708);
            iv_ruleSwitch_Statement=ruleSwitch_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_Statement7718); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4322:1: ruleSwitch_Statement returns [EObject current=null] : ( () this_SWITCH_1= RULE_SWITCH this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON ) | ( (lv_statements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleSwitch_Statement() throws RecognitionException {
        EObject current = null;

        Token this_SWITCH_1=null;
        Token this_RIGHT_PARENTHESIS_2=null;
        Token this_LEFT_PARENTHESIS_4=null;
        Token this_R_CURLY_BRACE_5=null;
        Token this_CASE_6=null;
        Token this_COLON_8=null;
        Token this_DEFAULT_9=null;
        Token this_COLON_10=null;
        Token this_L_CURLY_BRACE_12=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expressions_7_0 = null;

        EObject lv_statements_11_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4325:28: ( ( () this_SWITCH_1= RULE_SWITCH this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON ) | ( (lv_statements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4326:1: ( () this_SWITCH_1= RULE_SWITCH this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON ) | ( (lv_statements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4326:1: ( () this_SWITCH_1= RULE_SWITCH this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON ) | ( (lv_statements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4326:2: () this_SWITCH_1= RULE_SWITCH this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_expression_3_0= ruleExpression ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON ) | ( (lv_statements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4326:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4327:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitch_StatementAccess().getSwitch_StatementAction_0(),
                          current);
                  
            }

            }

            this_SWITCH_1=(Token)match(input,RULE_SWITCH,FOLLOW_RULE_SWITCH_in_ruleSwitch_Statement7766); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SWITCH_1, grammarAccess.getSwitch_StatementAccess().getSWITCHTerminalRuleCall_1()); 
                  
            }
            this_RIGHT_PARENTHESIS_2=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleSwitch_Statement7776); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_2, grammarAccess.getSwitch_StatementAccess().getRIGHT_PARENTHESISTerminalRuleCall_2()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4343:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4344:1: (lv_expression_3_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4344:1: (lv_expression_3_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4345:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch_Statement7796);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitch_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleSwitch_Statement7807); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_4, grammarAccess.getSwitch_StatementAccess().getLEFT_PARENTHESISTerminalRuleCall_4()); 
                  
            }
            this_R_CURLY_BRACE_5=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleSwitch_Statement7817); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_5, grammarAccess.getSwitch_StatementAccess().getR_CURLY_BRACETerminalRuleCall_5()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4369:1: ( (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON ) | ( (lv_statements_11_0= ruleStatement ) ) )*
            loop66:
            do {
                int alt66=4;
                switch ( input.LA(1) ) {
                case RULE_CASE:
                    {
                    alt66=1;
                    }
                    break;
                case RULE_DEFAULT:
                    {
                    alt66=2;
                    }
                    break;
                case RULE_EOL:
                case RULE_ID:
                case RULE_R_CURLY_BRACE:
                case RULE_RIGHT_PARENTHESIS:
                case RULE_NULL:
                case RULE_SUPER:
                case RULE_THIS:
                case RULE_INCREMENT:
                case RULE_DECREMENT:
                case RULE_MINUS:
                case RULE_DECIMAL_DIGITS:
                case RULE_HEXA:
                case RULE_STRING:
                case RULE_CHAR:
                case RULE_NEW:
                case RULE_NOT:
                case RULE_EXCLAMATION:
                case RULE_TRUE:
                case RULE_FALSE:
                case RULE_MOD:
                case RULE_STATIC:
                case RULE_SWITCH:
                case RULE_FOR:
                case RULE_WHILE:
                case RULE_DO:
                case RULE_IF:
                case RULE_RETURN:
                case RULE_TRY:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                    {
                    alt66=3;
                    }
                    break;

                }

                switch (alt66) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4369:2: (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4369:2: (this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4369:3: this_CASE_6= RULE_CASE ( (lv_expressions_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON
            	    {
            	    this_CASE_6=(Token)match(input,RULE_CASE,FOLLOW_RULE_CASE_in_ruleSwitch_Statement7829); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CASE_6, grammarAccess.getSwitch_StatementAccess().getCASETerminalRuleCall_6_0_0()); 
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4373:1: ( (lv_expressions_7_0= ruleExpression ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4374:1: (lv_expressions_7_0= ruleExpression )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4374:1: (lv_expressions_7_0= ruleExpression )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4375:3: lv_expressions_7_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getExpressionsExpressionParserRuleCall_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSwitch_Statement7849);
            	    lv_expressions_7_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_StatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_7_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSwitch_Statement7860); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_8, grammarAccess.getSwitch_StatementAccess().getCOLONTerminalRuleCall_6_0_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4396:6: (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4396:6: (this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4396:7: this_DEFAULT_9= RULE_DEFAULT this_COLON_10= RULE_COLON
            	    {
            	    this_DEFAULT_9=(Token)match(input,RULE_DEFAULT,FOLLOW_RULE_DEFAULT_in_ruleSwitch_Statement7878); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DEFAULT_9, grammarAccess.getSwitch_StatementAccess().getDEFAULTTerminalRuleCall_6_1_0()); 
            	          
            	    }
            	    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSwitch_Statement7888); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_10, grammarAccess.getSwitch_StatementAccess().getCOLONTerminalRuleCall_6_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4405:6: ( (lv_statements_11_0= ruleStatement ) )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4405:6: ( (lv_statements_11_0= ruleStatement ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4406:1: (lv_statements_11_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4406:1: (lv_statements_11_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4407:3: lv_statements_11_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getStatementsStatementParserRuleCall_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitch_Statement7915);
            	    lv_statements_11_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_StatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_11_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            this_L_CURLY_BRACE_12=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleSwitch_Statement7928); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_12, grammarAccess.getSwitch_StatementAccess().getL_CURLY_BRACETerminalRuleCall_7()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4435:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4436:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4437:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement7963);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor_Statement7973); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4444:1: ruleFor_Statement returns [EObject current=null] : (this_FOR_0= RULE_FOR this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) ) ( (lv_expression2_6_0= ruleExpression ) )? this_EOL_7= RULE_EOL ( (lv_expression3_8_0= ruleExpression ) )? this_EOL_9= RULE_EOL this_LEFT_PARENTHESIS_10= RULE_LEFT_PARENTHESIS ( (lv_statement_11_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token this_FOR_0=null;
        Token this_RIGHT_PARENTHESIS_1=null;
        Token lv_pv_3_0=null;
        Token this_EOL_5=null;
        Token this_EOL_7=null;
        Token this_EOL_9=null;
        Token this_LEFT_PARENTHESIS_10=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression2_6_0 = null;

        EObject lv_expression3_8_0 = null;

        EObject lv_statement_11_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4447:28: ( (this_FOR_0= RULE_FOR this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) ) ( (lv_expression2_6_0= ruleExpression ) )? this_EOL_7= RULE_EOL ( (lv_expression3_8_0= ruleExpression ) )? this_EOL_9= RULE_EOL this_LEFT_PARENTHESIS_10= RULE_LEFT_PARENTHESIS ( (lv_statement_11_0= ruleStatement ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4448:1: (this_FOR_0= RULE_FOR this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) ) ( (lv_expression2_6_0= ruleExpression ) )? this_EOL_7= RULE_EOL ( (lv_expression3_8_0= ruleExpression ) )? this_EOL_9= RULE_EOL this_LEFT_PARENTHESIS_10= RULE_LEFT_PARENTHESIS ( (lv_statement_11_0= ruleStatement ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4448:1: (this_FOR_0= RULE_FOR this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) ) ( (lv_expression2_6_0= ruleExpression ) )? this_EOL_7= RULE_EOL ( (lv_expression3_8_0= ruleExpression ) )? this_EOL_9= RULE_EOL this_LEFT_PARENTHESIS_10= RULE_LEFT_PARENTHESIS ( (lv_statement_11_0= ruleStatement ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4448:2: this_FOR_0= RULE_FOR this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) ) ( (lv_expression2_6_0= ruleExpression ) )? this_EOL_7= RULE_EOL ( (lv_expression3_8_0= ruleExpression ) )? this_EOL_9= RULE_EOL this_LEFT_PARENTHESIS_10= RULE_LEFT_PARENTHESIS ( (lv_statement_11_0= ruleStatement ) )
            {
            this_FOR_0=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_ruleFor_Statement8009); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FOR_0, grammarAccess.getFor_StatementAccess().getFORTerminalRuleCall_0()); 
                  
            }
            this_RIGHT_PARENTHESIS_1=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleFor_Statement8019); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_1, grammarAccess.getFor_StatementAccess().getRIGHT_PARENTHESISTerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4456:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) )
            int alt67=3;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4456:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4456:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4457:1: (lv_variable_2_0= ruleVariable_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4457:1: (lv_variable_2_0= ruleVariable_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4458:3: lv_variable_2_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleFor_Statement8040);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4475:6: ( (lv_pv_3_0= RULE_EOL ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4475:6: ( (lv_pv_3_0= RULE_EOL ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4476:1: (lv_pv_3_0= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4476:1: (lv_pv_3_0= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4477:3: lv_pv_3_0= RULE_EOL
                    {
                    lv_pv_3_0=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleFor_Statement8063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_pv_3_0, grammarAccess.getFor_StatementAccess().getPvEOLTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFor_StatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"pv",
                              		lv_pv_3_0, 
                              		"EOL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4494:6: ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4494:6: ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4494:7: ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4494:7: ( (lv_expression_4_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4495:1: (lv_expression_4_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4495:1: (lv_expression_4_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4496:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpressionExpressionParserRuleCall_2_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement8096);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleFor_Statement8107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_5, grammarAccess.getFor_StatementAccess().getEOLTerminalRuleCall_2_2_1()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4516:3: ( (lv_expression2_6_0= ruleExpression ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||LA68_0==RULE_RIGHT_PARENTHESIS||(LA68_0>=RULE_NULL && LA68_0<=RULE_THIS)||(LA68_0>=RULE_INCREMENT && LA68_0<=RULE_DECREMENT)||LA68_0==RULE_MINUS||LA68_0==RULE_DECIMAL_DIGITS||LA68_0==RULE_HEXA||(LA68_0>=RULE_STRING && LA68_0<=RULE_FALSE)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4517:1: (lv_expression2_6_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4517:1: (lv_expression2_6_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4518:3: lv_expression2_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression2ExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement8129);
                    lv_expression2_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_EOL_7=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleFor_Statement8141); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_7, grammarAccess.getFor_StatementAccess().getEOLTerminalRuleCall_4()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4538:1: ( (lv_expression3_8_0= ruleExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||LA69_0==RULE_RIGHT_PARENTHESIS||(LA69_0>=RULE_NULL && LA69_0<=RULE_THIS)||(LA69_0>=RULE_INCREMENT && LA69_0<=RULE_DECREMENT)||LA69_0==RULE_MINUS||LA69_0==RULE_DECIMAL_DIGITS||LA69_0==RULE_HEXA||(LA69_0>=RULE_STRING && LA69_0<=RULE_FALSE)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4539:1: (lv_expression3_8_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4539:1: (lv_expression3_8_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4540:3: lv_expression3_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression3ExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement8161);
                    lv_expression3_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression3",
                              		lv_expression3_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_EOL_9=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleFor_Statement8173); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_9, grammarAccess.getFor_StatementAccess().getEOLTerminalRuleCall_6()); 
                  
            }
            this_LEFT_PARENTHESIS_10=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleFor_Statement8183); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_10, grammarAccess.getFor_StatementAccess().getLEFT_PARENTHESISTerminalRuleCall_7()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4564:1: ( (lv_statement_11_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4565:1: (lv_statement_11_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4565:1: (lv_statement_11_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4566:3: lv_statement_11_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getStatementStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor_Statement8203);
            lv_statement_11_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_11_0, 
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4590:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4591:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4592:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement8239);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement8249); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4599:1: ruleWhile_Statement returns [EObject current=null] : (this_WHILE_0= RULE_WHILE this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token this_WHILE_0=null;
        Token this_RIGHT_PARENTHESIS_1=null;
        Token this_LEFT_PARENTHESIS_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4602:28: ( (this_WHILE_0= RULE_WHILE this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4603:1: (this_WHILE_0= RULE_WHILE this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4603:1: (this_WHILE_0= RULE_WHILE this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4603:2: this_WHILE_0= RULE_WHILE this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) )
            {
            this_WHILE_0=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleWhile_Statement8285); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WHILE_0, grammarAccess.getWhile_StatementAccess().getWHILETerminalRuleCall_0()); 
                  
            }
            this_RIGHT_PARENTHESIS_1=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleWhile_Statement8295); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_1, grammarAccess.getWhile_StatementAccess().getRIGHT_PARENTHESISTerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4611:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4612:1: (lv_expression_2_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4612:1: (lv_expression_2_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4613:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile_Statement8315);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LEFT_PARENTHESIS_3=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleWhile_Statement8326); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_3, grammarAccess.getWhile_StatementAccess().getLEFT_PARENTHESISTerminalRuleCall_3()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4633:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4634:1: (lv_statement_4_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4634:1: (lv_statement_4_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4635:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile_Statement8346);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4659:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4660:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4661:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement8382);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement8392); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4668:1: ruleDo_Statement returns [EObject current=null] : (this_DO_0= RULE_DO ( (lv_statement_1_0= ruleStatement ) ) this_WHILE_2= RULE_WHILE this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_expression_4_0= ruleExpression ) ) this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS this_EOL_6= RULE_EOL ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token this_DO_0=null;
        Token this_WHILE_2=null;
        Token this_RIGHT_PARENTHESIS_3=null;
        Token this_LEFT_PARENTHESIS_5=null;
        Token this_EOL_6=null;
        EObject lv_statement_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4671:28: ( (this_DO_0= RULE_DO ( (lv_statement_1_0= ruleStatement ) ) this_WHILE_2= RULE_WHILE this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_expression_4_0= ruleExpression ) ) this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS this_EOL_6= RULE_EOL ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4672:1: (this_DO_0= RULE_DO ( (lv_statement_1_0= ruleStatement ) ) this_WHILE_2= RULE_WHILE this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_expression_4_0= ruleExpression ) ) this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS this_EOL_6= RULE_EOL )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4672:1: (this_DO_0= RULE_DO ( (lv_statement_1_0= ruleStatement ) ) this_WHILE_2= RULE_WHILE this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_expression_4_0= ruleExpression ) ) this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS this_EOL_6= RULE_EOL )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4672:2: this_DO_0= RULE_DO ( (lv_statement_1_0= ruleStatement ) ) this_WHILE_2= RULE_WHILE this_RIGHT_PARENTHESIS_3= RULE_RIGHT_PARENTHESIS ( (lv_expression_4_0= ruleExpression ) ) this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS this_EOL_6= RULE_EOL
            {
            this_DO_0=(Token)match(input,RULE_DO,FOLLOW_RULE_DO_in_ruleDo_Statement8428); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DO_0, grammarAccess.getDo_StatementAccess().getDOTerminalRuleCall_0()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4676:1: ( (lv_statement_1_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4677:1: (lv_statement_1_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4677:1: (lv_statement_1_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4678:3: lv_statement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDo_Statement8448);
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

            this_WHILE_2=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleDo_Statement8459); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WHILE_2, grammarAccess.getDo_StatementAccess().getWHILETerminalRuleCall_2()); 
                  
            }
            this_RIGHT_PARENTHESIS_3=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleDo_Statement8469); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_3, grammarAccess.getDo_StatementAccess().getRIGHT_PARENTHESISTerminalRuleCall_3()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4702:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4703:1: (lv_expression_4_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4703:1: (lv_expression_4_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4704:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDo_Statement8489);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LEFT_PARENTHESIS_5=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleDo_Statement8500); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_5, grammarAccess.getDo_StatementAccess().getLEFT_PARENTHESISTerminalRuleCall_5()); 
                  
            }
            this_EOL_6=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleDo_Statement8510); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_6, grammarAccess.getDo_StatementAccess().getEOLTerminalRuleCall_6()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4736:1: entryRuleIf_Statement returns [EObject current=null] : iv_ruleIf_Statement= ruleIf_Statement EOF ;
    public final EObject entryRuleIf_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4737:2: (iv_ruleIf_Statement= ruleIf_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4738:2: iv_ruleIf_Statement= ruleIf_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_Statement_in_entryRuleIf_Statement8545);
            iv_ruleIf_Statement=ruleIf_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_Statement8555); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4745:1: ruleIf_Statement returns [EObject current=null] : (this_IF_0= RULE_IF this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_Statement() throws RecognitionException {
        EObject current = null;

        Token this_IF_0=null;
        Token this_RIGHT_PARENTHESIS_1=null;
        Token this_LEFT_PARENTHESIS_3=null;
        Token this_ELSE_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_statement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4748:28: ( (this_IF_0= RULE_IF this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4749:1: (this_IF_0= RULE_IF this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4749:1: (this_IF_0= RULE_IF this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4749:2: this_IF_0= RULE_IF this_RIGHT_PARENTHESIS_1= RULE_RIGHT_PARENTHESIS ( (lv_expression_2_0= ruleExpression ) ) this_LEFT_PARENTHESIS_3= RULE_LEFT_PARENTHESIS ( (lv_statement_4_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            this_IF_0=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleIf_Statement8591); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IF_0, grammarAccess.getIf_StatementAccess().getIFTerminalRuleCall_0()); 
                  
            }
            this_RIGHT_PARENTHESIS_1=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleIf_Statement8601); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_PARENTHESIS_1, grammarAccess.getIf_StatementAccess().getRIGHT_PARENTHESISTerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4757:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4758:1: (lv_expression_2_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4758:1: (lv_expression_2_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4759:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_StatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf_Statement8621);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LEFT_PARENTHESIS_3=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleIf_Statement8632); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_PARENTHESIS_3, grammarAccess.getIf_StatementAccess().getLEFT_PARENTHESISTerminalRuleCall_3()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4779:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4780:1: (lv_statement_4_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4780:1: (lv_statement_4_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4781:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_StatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf_Statement8652);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:2: ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ELSE) ) {
                int LA70_1 = input.LA(2);

                if ( (synpred149_InternalJava()) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:3: ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:3: ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:4: ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE
                    {
                    this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleIf_Statement8670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELSE_5, grammarAccess.getIf_StatementAccess().getELSETerminalRuleCall_5_0()); 
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4801:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4802:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4802:1: (lv_elseStatement_6_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4803:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_StatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf_Statement8691);
                    lv_elseStatement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
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


    // $ANTLR start "entryRuleReturn_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4827:1: entryRuleReturn_Statement returns [EObject current=null] : iv_ruleReturn_Statement= ruleReturn_Statement EOF ;
    public final EObject entryRuleReturn_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4828:2: (iv_ruleReturn_Statement= ruleReturn_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4829:2: iv_ruleReturn_Statement= ruleReturn_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturn_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_Statement_in_entryRuleReturn_Statement8729);
            iv_ruleReturn_Statement=ruleReturn_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn_Statement8739); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturn_Statement"


    // $ANTLR start "ruleReturn_Statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4836:1: ruleReturn_Statement returns [EObject current=null] : ( () this_RETURN_1= RULE_RETURN ( (lv_rv_2_0= ruleReturn_value ) )? this_EOL_3= RULE_EOL ) ;
    public final EObject ruleReturn_Statement() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_1=null;
        Token this_EOL_3=null;
        EObject lv_rv_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4839:28: ( ( () this_RETURN_1= RULE_RETURN ( (lv_rv_2_0= ruleReturn_value ) )? this_EOL_3= RULE_EOL ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4840:1: ( () this_RETURN_1= RULE_RETURN ( (lv_rv_2_0= ruleReturn_value ) )? this_EOL_3= RULE_EOL )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4840:1: ( () this_RETURN_1= RULE_RETURN ( (lv_rv_2_0= ruleReturn_value ) )? this_EOL_3= RULE_EOL )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4840:2: () this_RETURN_1= RULE_RETURN ( (lv_rv_2_0= ruleReturn_value ) )? this_EOL_3= RULE_EOL
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4840:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4841:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturn_StatementAccess().getReturn_StatementAction_0(),
                          current);
                  
            }

            }

            this_RETURN_1=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_ruleReturn_Statement8787); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RETURN_1, grammarAccess.getReturn_StatementAccess().getRETURNTerminalRuleCall_1()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4853:1: ( (lv_rv_2_0= ruleReturn_value ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID||LA71_0==RULE_DECIMAL_DIGITS||LA71_0==RULE_HEXA||(LA71_0>=RULE_STRING && LA71_0<=RULE_CHAR)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4854:1: (lv_rv_2_0= ruleReturn_value )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4854:1: (lv_rv_2_0= ruleReturn_value )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4855:3: lv_rv_2_0= ruleReturn_value
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturn_StatementAccess().getRvReturn_valueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturn_value_in_ruleReturn_Statement8807);
                    lv_rv_2_0=ruleReturn_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturn_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"rv",
                              		lv_rv_2_0, 
                              		"Return_value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleReturn_Statement8819); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_3, grammarAccess.getReturn_StatementAccess().getEOLTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleReturn_Statement"


    // $ANTLR start "entryRuleReturn_value"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4883:1: entryRuleReturn_value returns [EObject current=null] : iv_ruleReturn_value= ruleReturn_value EOF ;
    public final EObject entryRuleReturn_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn_value = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4884:2: (iv_ruleReturn_value= ruleReturn_value EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4885:2: iv_ruleReturn_value= ruleReturn_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturn_valueRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_value_in_entryRuleReturn_value8854);
            iv_ruleReturn_value=ruleReturn_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn_value; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn_value8864); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturn_value"


    // $ANTLR start "ruleReturn_value"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4892:1: ruleReturn_value returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | this_Method_call_1= ruleMethod_call | this_Literal_Expression_2= ruleLiteral_Expression ) ;
    public final EObject ruleReturn_value() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject this_Method_call_1 = null;

        EObject this_Literal_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4895:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | this_Method_call_1= ruleMethod_call | this_Literal_Expression_2= ruleLiteral_Expression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4896:1: ( ( (lv_name_0_0= RULE_ID ) ) | this_Method_call_1= ruleMethod_call | this_Literal_Expression_2= ruleLiteral_Expression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4896:1: ( ( (lv_name_0_0= RULE_ID ) ) | this_Method_call_1= ruleMethod_call | this_Literal_Expression_2= ruleLiteral_Expression )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==EOF||LA72_1==RULE_EOL) ) {
                    alt72=1;
                }
                else if ( (LA72_1==RULE_RIGHT_PARENTHESIS) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA72_0==RULE_DECIMAL_DIGITS||LA72_0==RULE_HEXA||(LA72_0>=RULE_STRING && LA72_0<=RULE_CHAR)) ) {
                alt72=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4896:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4896:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4897:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4897:1: (lv_name_0_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4898:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReturn_value8906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getReturn_valueAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReturn_valueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4916:2: this_Method_call_1= ruleMethod_call
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReturn_valueAccess().getMethod_callParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethod_call_in_ruleReturn_value8942);
                    this_Method_call_1=ruleMethod_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Method_call_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4929:2: this_Literal_Expression_2= ruleLiteral_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReturn_valueAccess().getLiteral_ExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_Expression_in_ruleReturn_value8972);
                    this_Literal_Expression_2=ruleLiteral_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_Expression_2; 
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
    // $ANTLR end "ruleReturn_value"


    // $ANTLR start "entryRuleTry_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4948:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4949:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4950:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement9007);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement9017); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4957:1: ruleTry_statement returns [EObject current=null] : ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )? ) ;
    public final EObject ruleTry_statement() throws RecognitionException {
        EObject current = null;

        Token lv_try_0_0=null;
        Token lv_catchs_2_0=null;
        Token this_LEFT_PARENTHESIS_4=null;
        Token lv_finally_6_0=null;
        EObject lv_tryStatement_1_0 = null;

        EObject lv_RIGHT_PARENTHESISparameters_3_0 = null;

        EObject lv_catchStatements_5_0 = null;

        EObject lv_finallyStatement_7_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4960:28: ( ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4961:1: ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4961:1: ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4961:2: ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4961:2: ( (lv_try_0_0= RULE_TRY ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4962:1: (lv_try_0_0= RULE_TRY )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4962:1: (lv_try_0_0= RULE_TRY )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4963:3: lv_try_0_0= RULE_TRY
            {
            lv_try_0_0=(Token)match(input,RULE_TRY,FOLLOW_RULE_TRY_in_ruleTry_statement9059); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4979:2: ( (lv_tryStatement_1_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4980:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4980:1: (lv_tryStatement_1_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4981:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement9085);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:2: ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_CATCH) ) {
                    int LA73_2 = input.LA(2);

                    if ( (synpred154_InternalJava()) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:4: ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5003:1: (lv_catchs_2_0= RULE_CATCH )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5004:3: lv_catchs_2_0= RULE_CATCH
            	    {
            	    lv_catchs_2_0=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_ruleTry_statement9114); if (state.failed) return current;
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

            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5020:2: ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5021:1: (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5021:1: (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5022:3: lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getRIGHT_PARENTHESISparametersParameterParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTry_statement9140);
            	    lv_RIGHT_PARENTHESISparameters_3_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"RIGHT_PARENTHESISparameters",
            	              		lv_RIGHT_PARENTHESISparameters_3_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleTry_statement9151); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LEFT_PARENTHESIS_4, grammarAccess.getTry_statementAccess().getLEFT_PARENTHESISTerminalRuleCall_2_2()); 
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5042:1: ( (lv_catchStatements_5_0= ruleStatement ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5043:1: (lv_catchStatements_5_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5043:1: (lv_catchStatements_5_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5044:3: lv_catchStatements_5_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement9171);
            	    lv_catchStatements_5_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catchStatements",
            	              		lv_catchStatements_5_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:4: ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_FINALLY) ) {
                int LA74_1 = input.LA(2);

                if ( (synpred156_InternalJava()) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:6: ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5066:1: (lv_finally_6_0= RULE_FINALLY )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5067:3: lv_finally_6_0= RULE_FINALLY
                    {
                    lv_finally_6_0=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_ruleTry_statement9202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_finally_6_0, grammarAccess.getTry_statementAccess().getFinallyFINALLYTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTry_statementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"finally",
                              		lv_finally_6_0, 
                              		"FINALLY");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5083:2: ( (lv_finallyStatement_7_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5084:1: (lv_finallyStatement_7_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5084:1: (lv_finallyStatement_7_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5085:3: lv_finallyStatement_7_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement9228);
                    lv_finallyStatement_7_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyStatement",
                              		lv_finallyStatement_7_0, 
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5109:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5110:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5111:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement9266);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement9276); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5118:1: rulePackage_statement returns [EObject current=null] : (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= rulePackage_name ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token this_PACKAGE_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5121:28: ( (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= rulePackage_name ) ) this_EOL_2= RULE_EOL ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5122:1: (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= rulePackage_name ) ) this_EOL_2= RULE_EOL )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5122:1: (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= rulePackage_name ) ) this_EOL_2= RULE_EOL )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5122:2: this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= rulePackage_name ) ) this_EOL_2= RULE_EOL
            {
            this_PACKAGE_0=(Token)match(input,RULE_PACKAGE,FOLLOW_RULE_PACKAGE_in_rulePackage_statement9312); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_PACKAGE_0, grammarAccess.getPackage_statementAccess().getPACKAGETerminalRuleCall_0()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5126:1: ( (lv_name_1_0= rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5127:1: (lv_name_1_0= rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5127:1: (lv_name_1_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5128:3: lv_name_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement9332);
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

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rulePackage_statement9343); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EOL_2, grammarAccess.getPackage_statementAccess().getEOLTerminalRuleCall_2()); 
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5156:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5157:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5158:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name9379);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name9390); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5165:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_aux_1 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5168:28: ( (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5169:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5169:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5169:6: this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name9430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_rulePackage_name9457);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5195:1: entryRulePackage_name_aux returns [String current=null] : iv_rulePackage_name_aux= rulePackage_name_aux EOF ;
    public final String entryRulePackage_name_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_aux = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5196:2: (iv_rulePackage_name_aux= rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5197:2: iv_rulePackage_name_aux= rulePackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux9503);
            iv_rulePackage_name_aux=rulePackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux9514); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5204:1: rulePackage_name_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5207:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5208:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5208:1: (kw= '.' this_ID_1= RULE_ID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==86) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred157_InternalJava()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5209:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,86,FOLLOW_86_in_rulePackage_name_aux9552); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_aux9567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5229:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5230:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5231:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement9613);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement9623); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5238:1: ruleImport_statement returns [EObject current=null] : (this_IMPORT_0= RULE_IMPORT ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token this_IMPORT_0=null;
        Token this_EOL_2=null;
        Token otherlv_4=null;
        Token this_MULTIPLY_5=null;
        Token this_EOL_6=null;
        Token this_EOL_7=null;
        AntlrDatatypeRuleToken lv_classname_1_0 = null;

        AntlrDatatypeRuleToken lv_packagename_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5241:28: ( (this_IMPORT_0= RULE_IMPORT ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5242:1: (this_IMPORT_0= RULE_IMPORT ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5242:1: (this_IMPORT_0= RULE_IMPORT ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5242:2: this_IMPORT_0= RULE_IMPORT ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) )
            {
            this_IMPORT_0=(Token)match(input,RULE_IMPORT,FOLLOW_RULE_IMPORT_in_ruleImport_statement9659); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_IMPORT_0, grammarAccess.getImport_statementAccess().getIMPORTTerminalRuleCall_0()); 
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5246:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5246:2: ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5246:2: ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5246:3: ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5246:3: ( (lv_classname_1_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5247:1: (lv_classname_1_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5247:1: (lv_classname_1_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5248:3: lv_classname_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement9681);
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

                    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleImport_statement9692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_2, grammarAccess.getImport_statementAccess().getEOLTerminalRuleCall_1_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5269:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5269:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5269:7: ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5269:7: ( (lv_packagename_3_0= rulePackage_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5270:1: (lv_packagename_3_0= rulePackage_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5270:1: (lv_packagename_3_0= rulePackage_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5271:3: lv_packagename_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement9720);
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

                    otherlv_4=(Token)match(input,86,FOLLOW_86_in_ruleImport_statement9732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopKeyword_1_1_1());
                          
                    }
                    this_MULTIPLY_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_ruleImport_statement9743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MULTIPLY_5, grammarAccess.getImport_statementAccess().getMULTIPLYTerminalRuleCall_1_1_2()); 
                          
                    }
                    this_EOL_6=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleImport_statement9753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_6, grammarAccess.getImport_statementAccess().getEOLTerminalRuleCall_1_1_3()); 
                          
                    }
                    this_EOL_7=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleImport_statement9763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EOL_7, grammarAccess.getImport_statementAccess().getEOLTerminalRuleCall_1_1_4()); 
                          
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5311:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5312:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5313:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name9801);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name9812); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5320:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5323:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5325:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name9858);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5343:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5344:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5345:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name9903);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name9914); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5352:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5355:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name9960);
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


    // $ANTLR start "entryRuleEXPOENT_PART"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5375:1: entryRuleEXPOENT_PART returns [String current=null] : iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF ;
    public final String entryRuleEXPOENT_PART() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPOENT_PART = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5376:2: (iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5377:2: iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPOENT_PARTRule()); 
            }
            pushFollow(FOLLOW_ruleEXPOENT_PART_in_entryRuleEXPOENT_PART10005);
            iv_ruleEXPOENT_PART=ruleEXPOENT_PART();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPOENT_PART.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPOENT_PART10016); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEXPOENT_PART"


    // $ANTLR start "ruleEXPOENT_PART"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5384:1: ruleEXPOENT_PART returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS ) ;
    public final AntlrDatatypeRuleToken ruleEXPOENT_PART() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXPONENTIAL_0=null;
        Token this_DECIMAL_DIGITS_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5387:28: ( (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5388:1: (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5388:1: (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5388:6: this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS
            {
            this_EXPONENTIAL_0=(Token)match(input,RULE_EXPONENTIAL,FOLLOW_RULE_EXPONENTIAL_in_ruleEXPOENT_PART10056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPONENTIAL_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EXPONENTIAL_0, grammarAccess.getEXPOENT_PARTAccess().getEXPONENTIALTerminalRuleCall_0()); 
                  
            }
            this_DECIMAL_DIGITS_1=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleEXPOENT_PART10076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECIMAL_DIGITS_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DECIMAL_DIGITS_1, grammarAccess.getEXPOENT_PARTAccess().getDECIMAL_DIGITSTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleEXPOENT_PART"

    // $ANTLR start synpred54_InternalJava
    public final void synpred54_InternalJava_fragment() throws RecognitionException {   
        Token this_RIGHT_PARENTHESIS_0=null;
        Token this_LEFT_PARENTHESIS_2=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux_3_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:2: ( ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:2: ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:2: ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:3: (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:3: (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1893:4: this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS
        {
        this_RIGHT_PARENTHESIS_0=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_synpred54_InternalJava3418); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1897:1: ( (lv_argList_1_0= ruleArg_List ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1898:1: (lv_argList_1_0= ruleArg_List )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1898:1: (lv_argList_1_0= ruleArg_List )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1899:3: lv_argList_1_0= ruleArg_List
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArg_List_in_synpred54_InternalJava3438);
        lv_argList_1_0=ruleArg_List();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_PARENTHESIS_2=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_synpred54_InternalJava3449); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1919:2: ( (lv_aux_3_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:1: (lv_aux_3_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:1: (lv_aux_3_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1921:3: lv_aux_3_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred54_InternalJava3470);
        lv_aux_3_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalJava

    // $ANTLR start synpred55_InternalJava
    public final void synpred55_InternalJava_fragment() throws RecognitionException {   
        Token this_R_ABS_4=null;
        Token this_L_ABS_6=null;
        EObject lv_expression2_5_0 = null;

        EObject lv_aux_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:6: ( ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:6: ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:6: ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:7: (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:7: (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1938:8: this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS
        {
        this_R_ABS_4=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_synpred55_InternalJava3490); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1942:1: ( (lv_expression2_5_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1943:1: (lv_expression2_5_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1943:1: (lv_expression2_5_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1944:3: lv_expression2_5_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred55_InternalJava3510);
        lv_expression2_5_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_L_ABS_6=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_synpred55_InternalJava3521); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1964:2: ( (lv_aux_7_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1965:1: (lv_aux_7_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1965:1: (lv_aux_7_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1966:3: lv_aux_7_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred55_InternalJava3542);
        lv_aux_7_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred55_InternalJava

    // $ANTLR start synpred56_InternalJava
    public final void synpred56_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        EObject lv_expression2_9_0 = null;

        EObject lv_aux_10_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:6: ( ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1983:9: otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) )
        {
        otherlv_8=(Token)match(input,86,FOLLOW_86_in_synpred56_InternalJava3563); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1987:1: ( (lv_expression2_9_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1988:1: (lv_expression2_9_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1988:1: (lv_expression2_9_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1989:3: lv_expression2_9_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred56_InternalJava3584);
        lv_expression2_9_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2005:3: ( (lv_aux_10_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2006:1: (lv_aux_10_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2006:1: (lv_aux_10_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2007:3: lv_aux_10_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred56_InternalJava3606);
        lv_aux_10_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred56_InternalJava

    // $ANTLR start synpred57_InternalJava
    public final void synpred57_InternalJava_fragment() throws RecognitionException {   
        Token this_COMMA_11=null;
        EObject lv_expression2_12_0 = null;

        EObject lv_aux_13_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:6: ( ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:6: ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:6: ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:7: (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:7: (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2024:8: this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) )
        {
        this_COMMA_11=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_synpred57_InternalJava3626); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2028:1: ( (lv_expression2_12_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2029:1: (lv_expression2_12_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2029:1: (lv_expression2_12_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2030:3: lv_expression2_12_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred57_InternalJava3646);
        lv_expression2_12_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2046:3: ( (lv_aux_13_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2047:1: (lv_aux_13_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2047:1: (lv_aux_13_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2048:3: lv_aux_13_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred57_InternalJava3668);
        lv_aux_13_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred57_InternalJava

    // $ANTLR start synpred58_InternalJava
    public final void synpred58_InternalJava_fragment() throws RecognitionException {   
        Token this_INSTANCEOF_14=null;
        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux_16_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:6: ( ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:8: this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) )
        {
        this_INSTANCEOF_14=(Token)match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_synpred58_InternalJava3688); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2069:1: ( (lv_name_15_0= ruleClass_name ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2070:1: (lv_name_15_0= ruleClass_name )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2070:1: (lv_name_15_0= ruleClass_name )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2071:3: lv_name_15_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleClass_name_in_synpred58_InternalJava3708);
        lv_name_15_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2087:3: ( (lv_aux_16_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2088:1: (lv_aux_16_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2088:1: (lv_aux_16_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2089:3: lv_aux_16_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred58_InternalJava3730);
        lv_aux_16_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred58_InternalJava

    // $ANTLR start synpred60_InternalJava
    public final void synpred60_InternalJava_fragment() throws RecognitionException {   
        Token lv_sgin_17_1=null;
        Token lv_sgin_17_2=null;
        EObject lv_aux_18_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:6: ( ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2106:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2107:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2107:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2108:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2108:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_INCREMENT) ) {
            alt83=1;
        }
        else if ( (LA83_0==RULE_DECREMENT) ) {
            alt83=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 83, 0, input);

            throw nvae;
        }
        switch (alt83) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2109:3: lv_sgin_17_1= RULE_INCREMENT
                {
                lv_sgin_17_1=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_synpred60_InternalJava3757); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2124:8: lv_sgin_17_2= RULE_DECREMENT
                {
                lv_sgin_17_2=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_synpred60_InternalJava3777); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2142:2: ( (lv_aux_18_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2143:1: (lv_aux_18_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2143:1: (lv_aux_18_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:3: lv_aux_18_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred60_InternalJava3806);
        lv_aux_18_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred60_InternalJava

    // $ANTLR start synpred70_InternalJava
    public final void synpred70_InternalJava_fragment() throws RecognitionException {   
        Token lv_numericSign_19_1=null;
        Token lv_numericSign_19_2=null;
        Token lv_numericSign_19_3=null;
        Token lv_numericSign_19_4=null;
        Token lv_numericSign_19_5=null;
        Token lv_numericSign_19_6=null;
        Token lv_numericSign_19_7=null;
        Token lv_numericSign_19_8=null;
        Token lv_numericSign_19_9=null;
        Token lv_numericSign_19_10=null;
        EObject lv_exp2_20_0 = null;

        EObject lv_aux_21_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:6: ( ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:6: ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:6: ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:7: ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2161:7: ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2162:1: ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2162:1: ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2163:1: (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2163:1: (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
        int alt84=10;
        switch ( input.LA(1) ) {
        case RULE_PLUS:
            {
            alt84=1;
            }
            break;
        case RULE_PLUS_EQUAL:
            {
            alt84=2;
            }
            break;
        case RULE_MINUS:
            {
            alt84=3;
            }
            break;
        case RULE_MINUS_EQUAL:
            {
            alt84=4;
            }
            break;
        case RULE_MULTIPLY:
            {
            alt84=5;
            }
            break;
        case RULE_MULTIPLY_EQUAL:
            {
            alt84=6;
            }
            break;
        case RULE_DIVIDE:
            {
            alt84=7;
            }
            break;
        case RULE_DIVIDE_EQUAL:
            {
            alt84=8;
            }
            break;
        case RULE_MODULE:
            {
            alt84=9;
            }
            break;
        case RULE_MODULE_EQUAL:
            {
            alt84=10;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 84, 0, input);

            throw nvae;
        }

        switch (alt84) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2164:3: lv_numericSign_19_1= RULE_PLUS
                {
                lv_numericSign_19_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_synpred70_InternalJava3833); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2179:8: lv_numericSign_19_2= RULE_PLUS_EQUAL
                {
                lv_numericSign_19_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_synpred70_InternalJava3853); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2194:8: lv_numericSign_19_3= RULE_MINUS
                {
                lv_numericSign_19_3=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_synpred70_InternalJava3873); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2209:8: lv_numericSign_19_4= RULE_MINUS_EQUAL
                {
                lv_numericSign_19_4=(Token)match(input,RULE_MINUS_EQUAL,FOLLOW_RULE_MINUS_EQUAL_in_synpred70_InternalJava3893); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2224:8: lv_numericSign_19_5= RULE_MULTIPLY
                {
                lv_numericSign_19_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_synpred70_InternalJava3913); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2239:8: lv_numericSign_19_6= RULE_MULTIPLY_EQUAL
                {
                lv_numericSign_19_6=(Token)match(input,RULE_MULTIPLY_EQUAL,FOLLOW_RULE_MULTIPLY_EQUAL_in_synpred70_InternalJava3933); if (state.failed) return ;

                }
                break;
            case 7 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2254:8: lv_numericSign_19_7= RULE_DIVIDE
                {
                lv_numericSign_19_7=(Token)match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_synpred70_InternalJava3953); if (state.failed) return ;

                }
                break;
            case 8 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2269:8: lv_numericSign_19_8= RULE_DIVIDE_EQUAL
                {
                lv_numericSign_19_8=(Token)match(input,RULE_DIVIDE_EQUAL,FOLLOW_RULE_DIVIDE_EQUAL_in_synpred70_InternalJava3973); if (state.failed) return ;

                }
                break;
            case 9 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2284:8: lv_numericSign_19_9= RULE_MODULE
                {
                lv_numericSign_19_9=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_synpred70_InternalJava3993); if (state.failed) return ;

                }
                break;
            case 10 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2299:8: lv_numericSign_19_10= RULE_MODULE_EQUAL
                {
                lv_numericSign_19_10=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_synpred70_InternalJava4013); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2317:2: ( (lv_exp2_20_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2318:1: (lv_exp2_20_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2318:1: (lv_exp2_20_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2319:3: lv_exp2_20_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred70_InternalJava4042);
        lv_exp2_20_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2335:2: ( (lv_aux_21_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2336:1: (lv_aux_21_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2336:1: (lv_aux_21_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2337:3: lv_aux_21_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_6_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred70_InternalJava4063);
        lv_aux_21_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred70_InternalJava

    // $ANTLR start synpred76_InternalJava
    public final void synpred76_InternalJava_fragment() throws RecognitionException {   
        Token lv_testingSign_22_1=null;
        Token lv_testingSign_22_2=null;
        Token lv_testingSign_22_3=null;
        Token lv_testingSign_22_4=null;
        Token lv_testingSign_22_5=null;
        Token lv_testingSign_22_6=null;
        EObject lv_exp1_23_0 = null;

        EObject lv_aux_24_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:6: ( ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2354:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2355:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2355:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2356:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2356:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
        int alt85=6;
        switch ( input.LA(1) ) {
        case RULE_BT:
            {
            alt85=1;
            }
            break;
        case RULE_ST:
            {
            alt85=2;
            }
            break;
        case RULE_BE:
            {
            alt85=3;
            }
            break;
        case RULE_SE:
            {
            alt85=4;
            }
            break;
        case RULE_DOUBLE_EQUAL:
            {
            alt85=5;
            }
            break;
        case RULE_DIFFERENT:
            {
            alt85=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 85, 0, input);

            throw nvae;
        }

        switch (alt85) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2357:3: lv_testingSign_22_1= RULE_BT
                {
                lv_testingSign_22_1=(Token)match(input,RULE_BT,FOLLOW_RULE_BT_in_synpred76_InternalJava4090); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2372:8: lv_testingSign_22_2= RULE_ST
                {
                lv_testingSign_22_2=(Token)match(input,RULE_ST,FOLLOW_RULE_ST_in_synpred76_InternalJava4110); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2387:8: lv_testingSign_22_3= RULE_BE
                {
                lv_testingSign_22_3=(Token)match(input,RULE_BE,FOLLOW_RULE_BE_in_synpred76_InternalJava4130); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:8: lv_testingSign_22_4= RULE_SE
                {
                lv_testingSign_22_4=(Token)match(input,RULE_SE,FOLLOW_RULE_SE_in_synpred76_InternalJava4150); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2417:8: lv_testingSign_22_5= RULE_DOUBLE_EQUAL
                {
                lv_testingSign_22_5=(Token)match(input,RULE_DOUBLE_EQUAL,FOLLOW_RULE_DOUBLE_EQUAL_in_synpred76_InternalJava4170); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2432:8: lv_testingSign_22_6= RULE_DIFFERENT
                {
                lv_testingSign_22_6=(Token)match(input,RULE_DIFFERENT,FOLLOW_RULE_DIFFERENT_in_synpred76_InternalJava4190); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2450:2: ( (lv_exp1_23_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2451:1: (lv_exp1_23_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2451:1: (lv_exp1_23_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2452:3: lv_exp1_23_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_7_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred76_InternalJava4219);
        lv_exp1_23_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2468:2: ( (lv_aux_24_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2469:1: (lv_aux_24_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2469:1: (lv_aux_24_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2470:3: lv_aux_24_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_7_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred76_InternalJava4240);
        lv_aux_24_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred76_InternalJava

    // $ANTLR start synpred84_InternalJava
    public final void synpred84_InternalJava_fragment() throws RecognitionException {   
        Token lv_logicalSign_25_1=null;
        Token lv_logicalSign_25_2=null;
        Token lv_logicalSign_25_3=null;
        Token lv_logicalSign_25_4=null;
        Token lv_logicalSign_25_5=null;
        Token lv_logicalSign_25_6=null;
        Token lv_logicalSign_25_7=null;
        EObject lv_ampersand_26_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_aux_28_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:6: ( ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) )
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( ((LA88_0>=RULE_MODULE && LA88_0<=RULE_MODULE_EQUAL)||(LA88_0>=RULE_OR && LA88_0<=RULE_DOUBLE_OR_EQUAL)) ) {
            alt88=1;
        }
        else if ( (LA88_0==RULE_AMPERSAND) ) {
            alt88=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }
        switch (alt88) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2487:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2488:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2488:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2489:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2489:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                int alt87=7;
                switch ( input.LA(1) ) {
                case RULE_OR:
                    {
                    alt87=1;
                    }
                    break;
                case RULE_OR_EQUAL:
                    {
                    alt87=2;
                    }
                    break;
                case RULE_EXP:
                    {
                    alt87=3;
                    }
                    break;
                case RULE_EXP_EQUAL:
                    {
                    alt87=4;
                    }
                    break;
                case RULE_DOUBLE_OR_EQUAL:
                    {
                    alt87=5;
                    }
                    break;
                case RULE_MODULE:
                    {
                    alt87=6;
                    }
                    break;
                case RULE_MODULE_EQUAL:
                    {
                    alt87=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 0, input);

                    throw nvae;
                }

                switch (alt87) {
                    case 1 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2490:3: lv_logicalSign_25_1= RULE_OR
                        {
                        lv_logicalSign_25_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_synpred84_InternalJava4268); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2505:8: lv_logicalSign_25_2= RULE_OR_EQUAL
                        {
                        lv_logicalSign_25_2=(Token)match(input,RULE_OR_EQUAL,FOLLOW_RULE_OR_EQUAL_in_synpred84_InternalJava4288); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2520:8: lv_logicalSign_25_3= RULE_EXP
                        {
                        lv_logicalSign_25_3=(Token)match(input,RULE_EXP,FOLLOW_RULE_EXP_in_synpred84_InternalJava4308); if (state.failed) return ;

                        }
                        break;
                    case 4 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2535:8: lv_logicalSign_25_4= RULE_EXP_EQUAL
                        {
                        lv_logicalSign_25_4=(Token)match(input,RULE_EXP_EQUAL,FOLLOW_RULE_EXP_EQUAL_in_synpred84_InternalJava4328); if (state.failed) return ;

                        }
                        break;
                    case 5 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2550:8: lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL
                        {
                        lv_logicalSign_25_5=(Token)match(input,RULE_DOUBLE_OR_EQUAL,FOLLOW_RULE_DOUBLE_OR_EQUAL_in_synpred84_InternalJava4348); if (state.failed) return ;

                        }
                        break;
                    case 6 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2565:8: lv_logicalSign_25_6= RULE_MODULE
                        {
                        lv_logicalSign_25_6=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_synpred84_InternalJava4368); if (state.failed) return ;

                        }
                        break;
                    case 7 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2580:8: lv_logicalSign_25_7= RULE_MODULE_EQUAL
                        {
                        lv_logicalSign_25_7=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_synpred84_InternalJava4388); if (state.failed) return ;

                        }
                        break;

                }


                }


                }


                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2599:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2599:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2600:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2600:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2601:3: lv_ampersand_26_0= ruleAmpersand_Rule
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAmpersandAmpersand_RuleParserRuleCall_8_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleAmpersand_Rule_in_synpred84_InternalJava4423);
                lv_ampersand_26_0=ruleAmpersand_Rule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2617:3: ( (lv_exp1_27_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2618:1: (lv_exp1_27_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2618:1: (lv_exp1_27_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2619:3: lv_exp1_27_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_8_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred84_InternalJava4445);
        lv_exp1_27_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2635:2: ( (lv_aux_28_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2636:1: (lv_aux_28_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2636:1: (lv_aux_28_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2637:3: lv_aux_28_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_8_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred84_InternalJava4466);
        lv_aux_28_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred84_InternalJava

    // $ANTLR start synpred85_InternalJava
    public final void synpred85_InternalJava_fragment() throws RecognitionException {   
        Token this_WAT_29=null;
        Token this_COLON_31=null;
        EObject lv_exp1_30_0 = null;

        EObject lv_exp2_32_0 = null;

        EObject lv_aux_33_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:6: ( (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2654:7: this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) )
        {
        this_WAT_29=(Token)match(input,RULE_WAT,FOLLOW_RULE_WAT_in_synpred85_InternalJava4485); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2658:1: ( (lv_exp1_30_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2659:1: (lv_exp1_30_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2659:1: (lv_exp1_30_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2660:3: lv_exp1_30_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_9_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred85_InternalJava4505);
        lv_exp1_30_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_COLON_31=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_synpred85_InternalJava4516); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2680:1: ( (lv_exp2_32_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2681:1: (lv_exp2_32_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2681:1: (lv_exp2_32_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2682:3: lv_exp2_32_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_9_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred85_InternalJava4536);
        lv_exp2_32_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2698:2: ( (lv_aux_33_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2699:1: (lv_aux_33_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2699:1: (lv_aux_33_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2700:3: lv_aux_33_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_9_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred85_InternalJava4557);
        lv_aux_33_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred85_InternalJava

    // $ANTLR start synpred87_InternalJava
    public final void synpred87_InternalJava_fragment() throws RecognitionException {   
        Token lv_stringSign_34_1=null;
        Token lv_stringSign_34_2=null;
        EObject lv_exp1_35_0 = null;

        EObject lv_aux_36_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:6: ( ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:6: ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:6: ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:7: ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2717:7: ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2718:1: ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2718:1: ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2719:1: (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2719:1: (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL )
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_PLUS) ) {
            alt89=1;
        }
        else if ( (LA89_0==RULE_PLUS_EQUAL) ) {
            alt89=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }
        switch (alt89) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2720:3: lv_stringSign_34_1= RULE_PLUS
                {
                lv_stringSign_34_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_synpred87_InternalJava4584); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2735:8: lv_stringSign_34_2= RULE_PLUS_EQUAL
                {
                lv_stringSign_34_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_synpred87_InternalJava4604); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2753:2: ( (lv_exp1_35_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2754:1: (lv_exp1_35_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2754:1: (lv_exp1_35_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2755:3: lv_exp1_35_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_10_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred87_InternalJava4633);
        lv_exp1_35_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2771:2: ( (lv_aux_36_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2772:1: (lv_aux_36_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2772:1: (lv_aux_36_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2773:3: lv_aux_36_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_10_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred87_InternalJava4654);
        lv_aux_36_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87_InternalJava

    // $ANTLR start synpred91_InternalJava
    public final void synpred91_InternalJava_fragment() throws RecognitionException {   
        Token lv_bitSign_37_1=null;
        Token lv_bitSign_37_2=null;
        Token lv_bitSign_37_3=null;
        Token lv_bitSign_37_4=null;
        EObject lv_expressionBit_38_0 = null;

        EObject lv_aux_39_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:6: ( ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2791:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2791:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2792:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2792:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
        int alt90=4;
        switch ( input.LA(1) ) {
        case RULE_R_SHIFT_EQUAL:
            {
            alt90=1;
            }
            break;
        case RULE_L_SHIFT:
            {
            alt90=2;
            }
            break;
        case RULE_R_SHIFT:
            {
            alt90=3;
            }
            break;
        case RULE_SUPER_SHIFT:
            {
            alt90=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 90, 0, input);

            throw nvae;
        }

        switch (alt90) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2793:3: lv_bitSign_37_1= RULE_R_SHIFT_EQUAL
                {
                lv_bitSign_37_1=(Token)match(input,RULE_R_SHIFT_EQUAL,FOLLOW_RULE_R_SHIFT_EQUAL_in_synpred91_InternalJava4681); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2808:8: lv_bitSign_37_2= RULE_L_SHIFT
                {
                lv_bitSign_37_2=(Token)match(input,RULE_L_SHIFT,FOLLOW_RULE_L_SHIFT_in_synpred91_InternalJava4701); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2823:8: lv_bitSign_37_3= RULE_R_SHIFT
                {
                lv_bitSign_37_3=(Token)match(input,RULE_R_SHIFT,FOLLOW_RULE_R_SHIFT_in_synpred91_InternalJava4721); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2838:8: lv_bitSign_37_4= RULE_SUPER_SHIFT
                {
                lv_bitSign_37_4=(Token)match(input,RULE_SUPER_SHIFT,FOLLOW_RULE_SUPER_SHIFT_in_synpred91_InternalJava4741); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2856:2: ( (lv_expressionBit_38_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2857:1: (lv_expressionBit_38_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2857:1: (lv_expressionBit_38_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2858:3: lv_expressionBit_38_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionBitExpressionParserRuleCall_11_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred91_InternalJava4770);
        lv_expressionBit_38_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2874:2: ( (lv_aux_39_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2875:1: (lv_aux_39_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2875:1: (lv_aux_39_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2876:3: lv_aux_39_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_11_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred91_InternalJava4791);
        lv_aux_39_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred91_InternalJava

    // $ANTLR start synpred94_InternalJava
    public final void synpred94_InternalJava_fragment() throws RecognitionException {   
        Token lv_decimalDigits2_2_0=null;

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3008:1: ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3008:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3008:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3009:3: lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS
        {
        lv_decimalDigits2_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_synpred94_InternalJava5066); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred94_InternalJava

    // $ANTLR start synpred100_InternalJava
    public final void synpred100_InternalJava_fragment() throws RecognitionException {   
        Token lv_exp_0_0=null;
        Token this_LONG_1=null;
        Token lv_exp1_2_0=null;
        Token this_LONG_3=null;

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:2: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_HEXA) ) {
            alt94=1;
        }
        else if ( (LA94_0==RULE_DECIMAL_DIGITS) ) {
            alt94=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }
        switch (alt94) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:4: ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )?
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3082:4: ( (lv_exp_0_0= RULE_HEXA ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3083:1: (lv_exp_0_0= RULE_HEXA )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3083:1: (lv_exp_0_0= RULE_HEXA )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3084:3: lv_exp_0_0= RULE_HEXA
                {
                lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_synpred100_InternalJava5207); if (state.failed) return ;

                }


                }

                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3100:2: (this_LONG_1= RULE_LONG )?
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_LONG) ) {
                    alt92=1;
                }
                switch (alt92) {
                    case 1 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3100:3: this_LONG_1= RULE_LONG
                        {
                        this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_synpred100_InternalJava5224); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )?
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3105:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3106:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3106:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3107:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                {
                lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_synpred100_InternalJava5250); if (state.failed) return ;

                }


                }

                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3123:2: (this_LONG_3= RULE_LONG )?
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_LONG) ) {
                    alt93=1;
                }
                switch (alt93) {
                    case 1 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3123:3: this_LONG_3= RULE_LONG
                        {
                        this_LONG_3=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_synpred100_InternalJava5267); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred100_InternalJava

    // $ANTLR start synpred101_InternalJava
    public final void synpred101_InternalJava_fragment() throws RecognitionException {   
        EObject lv_exp2_4_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3128:6: ( ( (lv_exp2_4_0= ruleFloat_Literal ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3128:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3128:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3129:1: (lv_exp2_4_0= ruleFloat_Literal )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3129:1: (lv_exp2_4_0= ruleFloat_Literal )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3130:3: lv_exp2_4_0= ruleFloat_Literal
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleFloat_Literal_in_synpred101_InternalJava5297);
        lv_exp2_4_0=ruleFloat_Literal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred101_InternalJava

    // $ANTLR start synpred103_InternalJava
    public final void synpred103_InternalJava_fragment() throws RecognitionException {   
        Token this_RIGHT_PARENTHESIS_2=null;
        Token this_LEFT_PARENTHESIS_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:2: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:3: ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3209:3: ( (lv_className_1_0= ruleClass_name ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3210:1: (lv_className_1_0= ruleClass_name )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3210:1: (lv_className_1_0= ruleClass_name )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3211:3: lv_className_1_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleClass_name_in_synpred103_InternalJava5457);
        lv_className_1_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RIGHT_PARENTHESIS_2=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_RULE_RIGHT_PARENTHESIS_in_synpred103_InternalJava5468); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3231:1: ( (lv_argList_3_0= ruleArg_List ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3232:1: (lv_argList_3_0= ruleArg_List )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3232:1: (lv_argList_3_0= ruleArg_List )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3233:3: lv_argList_3_0= ruleArg_List
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArg_List_in_synpred103_InternalJava5488);
        lv_argList_3_0=ruleArg_List();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_synpred103_InternalJava5499); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred103_InternalJava

    // $ANTLR start synpred104_InternalJava
    public final void synpred104_InternalJava_fragment() throws RecognitionException {   
        Token this_R_ABS_6=null;
        Token this_L_ABS_8=null;
        EObject lv_expression_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3272:3: (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3272:3: this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS
        {
        this_R_ABS_6=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_synpred104_InternalJava5539); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:1: ( (lv_expression_7_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:1: (lv_expression_7_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:1: (lv_expression_7_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3278:3: lv_expression_7_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred104_InternalJava5559);
        lv_expression_7_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_L_ABS_8=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_synpred104_InternalJava5570); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_InternalJava

    // $ANTLR start synpred107_InternalJava
    public final void synpred107_InternalJava_fragment() throws RecognitionException {   
        Token this_R_ABS_6=null;
        Token this_L_ABS_8=null;
        Token this_R_ABS_9=null;
        Token this_L_ABS_10=null;
        Token this_ABS_11=null;
        AntlrDatatypeRuleToken lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:6: ( ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )*
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3254:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3255:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3255:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3256:3: lv_typeSpecifier_5_0= ruleType_specifier
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleType_specifier_in_synpred107_InternalJava5527);
        lv_typeSpecifier_5_0=ruleType_specifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3272:2: (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_R_ABS) ) {
            int LA95_1 = input.LA(2);

            if ( (LA95_1==RULE_ID||LA95_1==RULE_RIGHT_PARENTHESIS||(LA95_1>=RULE_NULL && LA95_1<=RULE_THIS)||(LA95_1>=RULE_INCREMENT && LA95_1<=RULE_DECREMENT)||LA95_1==RULE_MINUS||LA95_1==RULE_DECIMAL_DIGITS||LA95_1==RULE_HEXA||(LA95_1>=RULE_STRING && LA95_1<=RULE_FALSE)) ) {
                alt95=1;
            }
        }
        switch (alt95) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3272:3: this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS
                {
                this_R_ABS_6=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_synpred107_InternalJava5539); if (state.failed) return ;
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:1: ( (lv_expression_7_0= ruleExpression ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:1: (lv_expression_7_0= ruleExpression )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:1: (lv_expression_7_0= ruleExpression )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3278:3: lv_expression_7_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred107_InternalJava5559);
                lv_expression_7_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                this_L_ABS_8=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_synpred107_InternalJava5570); if (state.failed) return ;

                }
                break;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:3: ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )*
        loop96:
        do {
            int alt96=3;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_R_ABS) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_ABS) ) {
                alt96=2;
            }


            switch (alt96) {
        	case 1 :
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:4: (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS )
        	    {
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:4: (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS )
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3298:5: this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS
        	    {
        	    this_R_ABS_9=(Token)match(input,RULE_R_ABS,FOLLOW_RULE_R_ABS_in_synpred107_InternalJava5584); if (state.failed) return ;
        	    this_L_ABS_10=(Token)match(input,RULE_L_ABS,FOLLOW_RULE_L_ABS_in_synpred107_InternalJava5594); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3307:6: this_ABS_11= RULE_ABS
        	    {
        	    this_ABS_11=(Token)match(input,RULE_ABS,FOLLOW_RULE_ABS_in_synpred107_InternalJava5611); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop96;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred107_InternalJava

    // $ANTLR start synpred127_InternalJava
    public final void synpred127_InternalJava_fragment() throws RecognitionException {   
        EObject lv_variable_1_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4014:6: ( ( (lv_variable_1_0= ruleVariable_declaration ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4014:6: ( (lv_variable_1_0= ruleVariable_declaration ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4014:6: ( (lv_variable_1_0= ruleVariable_declaration ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4015:1: (lv_variable_1_0= ruleVariable_declaration )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4015:1: (lv_variable_1_0= ruleVariable_declaration )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4016:3: lv_variable_1_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getVariableVariable_declarationParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_declaration_in_synpred127_InternalJava7232);
        lv_variable_1_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred127_InternalJava

    // $ANTLR start synpred128_InternalJava
    public final void synpred128_InternalJava_fragment() throws RecognitionException {   
        EObject lv_expressionx_2_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4033:6: ( ( (lv_expressionx_2_0= ruleExpression ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4033:6: ( (lv_expressionx_2_0= ruleExpression ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4033:6: ( (lv_expressionx_2_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4034:1: (lv_expressionx_2_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4034:1: (lv_expressionx_2_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4035:3: lv_expressionx_2_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionxExpressionParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred128_InternalJava7259);
        lv_expressionx_2_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred128_InternalJava

    // $ANTLR start synpred144_InternalJava
    public final void synpred144_InternalJava_fragment() throws RecognitionException {   
        EObject lv_variable_2_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4456:2: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4456:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4456:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4457:1: (lv_variable_2_0= ruleVariable_declaration )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4457:1: (lv_variable_2_0= ruleVariable_declaration )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4458:3: lv_variable_2_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_declaration_in_synpred144_InternalJava8040);
        lv_variable_2_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred144_InternalJava

    // $ANTLR start synpred149_InternalJava
    public final void synpred149_InternalJava_fragment() throws RecognitionException {   
        Token this_ELSE_5=null;
        EObject lv_elseStatement_6_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:3: ( ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:3: ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE ) ( (lv_elseStatement_6_0= ruleStatement ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:3: ( ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4797:4: ( RULE_ELSE )=>this_ELSE_5= RULE_ELSE
        {
        this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_synpred149_InternalJava8670); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4801:2: ( (lv_elseStatement_6_0= ruleStatement ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4802:1: (lv_elseStatement_6_0= ruleStatement )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4802:1: (lv_elseStatement_6_0= ruleStatement )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4803:3: lv_elseStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIf_StatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred149_InternalJava8691);
        lv_elseStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred149_InternalJava

    // $ANTLR start synpred154_InternalJava
    public final void synpred154_InternalJava_fragment() throws RecognitionException {   
        Token lv_catchs_2_0=null;
        Token this_LEFT_PARENTHESIS_4=null;
        EObject lv_RIGHT_PARENTHESISparameters_3_0 = null;

        EObject lv_catchStatements_5_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:3: ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( (lv_catchStatements_5_0= ruleStatement ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4997:4: ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5003:1: (lv_catchs_2_0= RULE_CATCH )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5004:3: lv_catchs_2_0= RULE_CATCH
        {
        lv_catchs_2_0=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_synpred154_InternalJava9114); if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5020:2: ( (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5021:1: (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5021:1: (lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5022:3: lv_RIGHT_PARENTHESISparameters_3_0= ruleParameter
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getRIGHT_PARENTHESISparametersParameterParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameter_in_synpred154_InternalJava9140);
        lv_RIGHT_PARENTHESISparameters_3_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_RULE_LEFT_PARENTHESIS_in_synpred154_InternalJava9151); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5042:1: ( (lv_catchStatements_5_0= ruleStatement ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5043:1: (lv_catchStatements_5_0= ruleStatement )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5043:1: (lv_catchStatements_5_0= ruleStatement )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5044:3: lv_catchStatements_5_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred154_InternalJava9171);
        lv_catchStatements_5_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred154_InternalJava

    // $ANTLR start synpred156_InternalJava
    public final void synpred156_InternalJava_fragment() throws RecognitionException {   
        Token lv_finally_6_0=null;
        EObject lv_finallyStatement_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:5: ( ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) ) ( (lv_finallyStatement_7_0= ruleStatement ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5060:6: ( ( RULE_FINALLY ) )=> (lv_finally_6_0= RULE_FINALLY )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5066:1: (lv_finally_6_0= RULE_FINALLY )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5067:3: lv_finally_6_0= RULE_FINALLY
        {
        lv_finally_6_0=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_synpred156_InternalJava9202); if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5083:2: ( (lv_finallyStatement_7_0= ruleStatement ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5084:1: (lv_finallyStatement_7_0= ruleStatement )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5084:1: (lv_finallyStatement_7_0= ruleStatement )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5085:3: lv_finallyStatement_7_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred156_InternalJava9228);
        lv_finallyStatement_7_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred156_InternalJava

    // $ANTLR start synpred157_InternalJava
    public final void synpred157_InternalJava_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_1=null;

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5209:2: (kw= '.' this_ID_1= RULE_ID )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5209:2: kw= '.' this_ID_1= RULE_ID
        {
        kw=(Token)match(input,86,FOLLOW_86_in_synpred157_InternalJava9552); if (state.failed) return ;
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred157_InternalJava9567); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred157_InternalJava

    // Delegated rules

    public final boolean synpred154_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_InternalJava_fragment(); // can never throw exception
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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\6\2\uffff";
    static final String DFA5_maxS =
        "\3\124\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\70\uffff\1\1\1\2\23\uffff\1\3",
            "\1\4\70\uffff\1\1\1\2\23\uffff\1\3",
            "\1\4\70\uffff\1\1\1\2\23\uffff\1\3",
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
            return "227:3: ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String DFA16_eotS =
        "\26\uffff";
    static final String DFA16_eofS =
        "\26\uffff";
    static final String DFA16_minS =
        "\15\7\1\17\1\7\1\5\1\uffff\2\7\2\uffff\1\7";
    static final String DFA16_maxS =
        "\3\137\11\20\1\126\1\17\1\20\1\21\1\uffff\1\7\1\20\2\uffff\1\126";
    static final String DFA16_acceptS =
        "\20\uffff\1\2\2\uffff\1\1\1\3\1\uffff";
    static final String DFA16_specialS =
        "\26\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\14\67\uffff\1\1\1\2\26\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13",
            "\1\14\67\uffff\1\1\1\2\26\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13",
            "\1\14\67\uffff\1\1\1\2\26\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\17\4\uffff\1\20\1\uffff\1\15\1\uffff\1\16\105\uffff\1\21",
            "\1\22",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "\1\23\3\uffff\1\23\2\uffff\1\24\1\uffff\1\23\1\uffff\2\23",
            "",
            "\1\25",
            "\1\17\6\uffff\1\15\1\uffff\1\16",
            "",
            "",
            "\1\17\6\uffff\1\15\1\uffff\1\16\105\uffff\1\21"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "591:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\13\uffff";
    static final String DFA36_minS =
        "\1\7\12\uffff";
    static final String DFA36_maxS =
        "\1\76\12\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA36_specialS =
        "\13\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\12\4\uffff\1\4\5\uffff\1\7\1\10\1\11\1\uffff\2\1\2\uffff"+
            "\1\1\31\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\5\1\3\3\2",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1491:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )";
        }
    }
    static final String DFA44_eotS =
        "\60\uffff";
    static final String DFA44_eofS =
        "\1\43\57\uffff";
    static final String DFA44_minS =
        "\1\5\42\0\15\uffff";
    static final String DFA44_maxS =
        "\1\141\42\0\15\uffff";
    static final String DFA44_acceptS =
        "\43\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\13\1\11\1\10\1\12"+
        "\1\14";
    static final String DFA44_specialS =
        "\1\uffff\1\7\1\35\1\12\1\31\1\2\1\40\1\14\1\41\1\17\1\5\1\16\1"+
        "\11\1\24\1\22\1\34\1\27\1\25\1\23\1\21\1\33\1\30\1\0\1\4\1\3\1\37"+
        "\1\20\1\13\1\26\1\32\1\1\1\36\1\15\1\10\1\6\15\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\43\1\uffff\1\43\1\uffff\1\4\2\43\1\1\1\43\1\2\1\43\2\uffff"+
            "\3\43\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\34\1\36\1\43\1\37\1\40\1\41\1\42\1\35\1\43\1\uffff\1\43\1\uffff"+
            "\25\43\11\uffff\1\3\13\43",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "1893:1: ( ( (this_RIGHT_PARENTHESIS_0= RULE_RIGHT_PARENTHESIS ( (lv_argList_1_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_2= RULE_LEFT_PARENTHESIS ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (this_R_ABS_4= RULE_R_ABS ( (lv_expression2_5_0= ruleExpression ) ) this_L_ABS_6= RULE_L_ABS ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (this_COMMA_11= RULE_COMMA ( (lv_expression2_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= RULE_PLUS | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= RULE_MINUS | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= RULE_PLUS | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_22 = input.LA(1);

                         
                        int index44_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalJava()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_30 = input.LA(1);

                         
                        int index44_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalJava()) ) {s = 46;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalJava()) ) {s = 40;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_24 = input.LA(1);

                         
                        int index44_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_23 = input.LA(1);

                         
                        int index44_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalJava()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_34 = input.LA(1);

                         
                        int index44_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalJava()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_34);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalJava()) ) {s = 36;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_33 = input.LA(1);

                         
                        int index44_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalJava()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_33);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalJava()) ) {s = 38;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_27 = input.LA(1);

                         
                        int index44_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_27);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalJava()) ) {s = 41;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA44_32 = input.LA(1);

                         
                        int index44_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalJava()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (synpred87_InternalJava()) ) {s = 43;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA44_26 = input.LA(1);

                         
                        int index44_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_26);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA44_19 = input.LA(1);

                         
                        int index44_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalJava()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA44_18 = input.LA(1);

                         
                        int index44_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalJava()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_18);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA44_17 = input.LA(1);

                         
                        int index44_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_17);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA44_28 = input.LA(1);

                         
                        int index44_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_28);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA44_16 = input.LA(1);

                         
                        int index44_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_16);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA44_21 = input.LA(1);

                         
                        int index44_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalJava()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_21);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA44_4 = input.LA(1);

                         
                        int index44_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalJava()) ) {s = 39;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_4);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA44_29 = input.LA(1);

                         
                        int index44_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_29);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA44_20 = input.LA(1);

                         
                        int index44_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalJava()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_20);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalJava()) ) {s = 37;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA44_31 = input.LA(1);

                         
                        int index44_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalJava()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA44_25 = input.LA(1);

                         
                        int index44_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalJava()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_25);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalJava()) ) {s = 41;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalJava()) ) {s = 42;}

                        else if ( (synpred87_InternalJava()) ) {s = 43;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\15\uffff";
    static final String DFA55_eofS =
        "\15\uffff";
    static final String DFA55_minS =
        "\1\7\1\0\13\uffff";
    static final String DFA55_maxS =
        "\1\137\1\0\13\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\10\uffff\1\3\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\4\uffff\1\13\112\uffff\11\2",
            "\1\uffff",
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

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3209:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_RIGHT_PARENTHESIS_2= RULE_RIGHT_PARENTHESIS ( (lv_argList_3_0= ruleArg_List ) ) this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )? ( (this_R_ABS_9= RULE_R_ABS this_L_ABS_10= RULE_L_ABS ) | this_ABS_11= RULE_ABS )* ) | (this_RIGHT_PARENTHESIS_12= RULE_RIGHT_PARENTHESIS ( (lv_expression_13_0= ruleExpression ) ) this_LEFT_PARENTHESIS_14= RULE_LEFT_PARENTHESIS ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_InternalJava()) ) {s = 12;}

                        else if ( (synpred107_InternalJava()) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\122\uffff";
    static final String DFA53_eofS =
        "\1\2\121\uffff";
    static final String DFA53_minS =
        "\1\5\1\0\120\uffff";
    static final String DFA53_maxS =
        "\1\141\1\0\120\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\116\uffff\1\1";
    static final String DFA53_specialS =
        "\1\uffff\1\0\120\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\5\2\1\1\2\2\1\uffff\43\2\1\uffff\1"+
            "\2\1\uffff\25\2\11\uffff\14\2",
            "\1\uffff",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3272:2: (this_R_ABS_6= RULE_R_ABS ( (lv_expression_7_0= ruleExpression ) ) this_L_ABS_8= RULE_L_ABS )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalJava()) ) {s = 81;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\55\uffff";
    static final String DFA65_eofS =
        "\3\uffff\1\4\17\uffff\1\4\11\uffff\1\4\5\uffff\1\4\11\uffff";
    static final String DFA65_minS =
        "\1\5\2\uffff\1\5\14\uffff\2\7\2\5\1\7\1\5\1\7\1\0\2\7\1\5\1\17"+
        "\2\5\4\7\2\5\4\7\1\5\1\0\2\7\1\0";
    static final String DFA65_maxS =
        "\1\141\2\uffff\1\141\14\uffff\2\76\2\141\1\76\1\21\1\76\1\0\2\76"+
        "\1\21\1\17\2\141\4\76\2\141\4\76\1\141\1\0\2\76\1\0";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\14"+
        "\1\15\1\16\1\13\35\uffff";
    static final String DFA65_specialS =
        "\27\uffff\1\0\21\uffff\1\1\2\uffff\1\2}>";
    static final String[] DFA65_transitionS = {
            "\1\16\1\uffff\1\3\2\uffff\1\12\1\uffff\1\4\5\uffff\3\4\1\uffff"+
            "\2\4\2\uffff\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\2\2\1"+
            "\11\2\uffff\1\10\1\7\1\6\1\5\1\uffff\1\1\1\13\14\uffff\11\2"+
            "\1\14\1\15",
            "",
            "",
            "\1\4\1\uffff\1\22\1\uffff\4\4\1\uffff\1\20\1\uffff\1\2\1\uffff"+
            "\34\4\1\17\6\4\1\uffff\1\4\1\uffff\25\4\11\uffff\1\21\13\4",
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
            "",
            "",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\23\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\27\1\uffff\1\4\1\uffff\1\26\3\4\1\uffff\1\24\1\uffff\1"+
            "\25\1\2\43\4\1\uffff\1\4\1\uffff\20\4\1\uffff\2\4\13\uffff\14"+
            "\4",
            "\1\4\1\uffff\1\22\1\uffff\4\4\1\uffff\1\30\1\uffff\1\2\1\uffff"+
            "\34\4\1\uffff\6\4\1\uffff\1\4\1\uffff\25\4\11\uffff\1\31\13"+
            "\4",
            "\1\4\4\uffff\1\4\2\uffff\1\32\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\2\1\uffff\1\4\1\uffff\1\2\4\uffff\1\33\1\uffff\1\25\1\2",
            "\1\34\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\uffff",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\35\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\2\1\uffff\1\4\1\uffff\1\2\4\uffff\1\33\1\uffff\1\25\1\2",
            "\1\32",
            "\1\27\1\uffff\1\4\1\uffff\1\37\3\4\1\uffff\1\36\1\uffff\2"+
            "\2\34\4\1\uffff\6\4\1\uffff\1\4\1\uffff\20\4\1\uffff\2\4\13"+
            "\uffff\14\4",
            "\1\4\1\uffff\1\22\1\uffff\4\4\1\uffff\1\40\1\uffff\1\2\1\uffff"+
            "\34\4\1\uffff\6\4\1\uffff\1\4\1\uffff\25\4\11\uffff\1\41\13"+
            "\4",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\42\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\43\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\27\1\uffff\1\4\1\uffff\1\45\3\4\1\uffff\1\44\1\uffff\2"+
            "\2\34\4\1\uffff\6\4\1\uffff\1\4\1\uffff\20\4\1\uffff\2\4\13"+
            "\uffff\14\4",
            "\1\4\1\uffff\1\22\1\uffff\4\4\1\uffff\1\46\1\uffff\1\2\1\uffff"+
            "\34\4\1\uffff\6\4\1\uffff\1\4\1\uffff\25\4\11\uffff\1\47\13"+
            "\4",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\50\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\51\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\27\1\uffff\1\4\1\uffff\1\53\3\4\1\uffff\1\52\1\uffff\2"+
            "\2\34\4\1\uffff\6\4\1\uffff\1\4\1\uffff\20\4\1\uffff\2\4\13"+
            "\uffff\14\4",
            "\1\uffff",
            "\1\4\4\uffff\1\4\2\uffff\1\2\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\54\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\uffff"
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3995:1: ( ( (lv_returnSmt_0_0= ruleReturn_Statement ) ) | ( (lv_variable_1_0= ruleVariable_declaration ) ) | ( (lv_expressionx_2_0= ruleExpression ) ) | ( (lv_ifStatement_3_0= ruleIf_Statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_Statement ) ) | this_Statement_block_8= ruleStatement_block | ( (lv_try_9_0= ruleTry_statement ) ) | ( ( (lv_name_10_0= RULE_ID ) ) this_COLON_11= RULE_COLON ( (lv_statement_12_0= ruleStatement ) ) ) | ( () otherlv_14= 'break' ( (lv_name_15_0= RULE_ID ) )? this_EOL_16= RULE_EOL ) | ( () otherlv_18= 'continue' ( (lv_name_19_0= RULE_ID ) )? this_EOL_20= RULE_EOL ) | ( () this_EOL_22= RULE_EOL ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_23 = input.LA(1);

                         
                        int index65_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalJava()) ) {s = 2;}

                        else if ( (synpred128_InternalJava()) ) {s = 4;}

                         
                        input.seek(index65_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_41 = input.LA(1);

                         
                        int index65_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalJava()) ) {s = 2;}

                        else if ( (synpred128_InternalJava()) ) {s = 4;}

                         
                        input.seek(index65_41);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_44 = input.LA(1);

                         
                        int index65_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalJava()) ) {s = 2;}

                        else if ( (synpred128_InternalJava()) ) {s = 4;}

                         
                        input.seek(index65_44);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\21\uffff";
    static final String DFA67_eofS =
        "\21\uffff";
    static final String DFA67_minS =
        "\1\5\1\uffff\1\5\2\uffff\2\7\1\5\2\7\1\5\2\7\1\5\2\7\1\0";
    static final String DFA67_maxS =
        "\1\137\1\uffff\1\126\2\uffff\2\76\1\126\2\76\1\126\2\76\1\126\2"+
        "\76\1\0";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\14\uffff";
    static final String DFA67_specialS =
        "\20\uffff\1\0}>";
    static final String[] DFA67_transitionS = {
            "\1\3\1\uffff\1\2\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\2\1\26\uffff\11\1",
            "",
            "\1\4\1\uffff\1\1\1\uffff\1\4\2\uffff\1\4\1\uffff\1\6\1\uffff"+
            "\1\1\4\uffff\31\4\1\uffff\5\4\42\uffff\1\5",
            "",
            "",
            "\1\7\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\4\4\uffff\1\4\2\uffff\1\1\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\4\1\uffff\1\1\1\uffff\1\4\2\uffff\1\4\1\uffff\1\10\1\uffff"+
            "\1\1\4\uffff\31\4\1\uffff\5\4\42\uffff\1\11",
            "\1\4\4\uffff\1\4\2\uffff\1\1\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\12\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\4\1\uffff\1\1\1\uffff\1\4\2\uffff\1\4\1\uffff\1\13\1\uffff"+
            "\1\1\4\uffff\31\4\1\uffff\5\4\42\uffff\1\14",
            "\1\4\4\uffff\1\4\2\uffff\1\1\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\15\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\4\1\uffff\1\1\1\uffff\1\4\2\uffff\1\4\1\uffff\1\16\1\uffff"+
            "\1\1\4\uffff\31\4\1\uffff\5\4\42\uffff\1\17",
            "\1\4\4\uffff\1\4\2\uffff\1\1\2\uffff\3\4\1\uffff\2\4\2\uffff"+
            "\1\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\20\4\uffff\1\4\5\uffff\3\4\1\uffff\2\4\2\uffff\1\4\31\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\7\4",
            "\1\uffff"
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "4456:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= RULE_EOL ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) this_EOL_5= RULE_EOL ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalJava()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\6\uffff";
    static final String DFA76_eofS =
        "\6\uffff";
    static final String DFA76_minS =
        "\1\7\1\5\1\7\1\uffff\1\5\1\uffff";
    static final String DFA76_maxS =
        "\1\7\1\126\1\34\1\uffff\1\126\1\uffff";
    static final String DFA76_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA76_specialS =
        "\6\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1",
            "\1\3\120\uffff\1\2",
            "\1\4\24\uffff\1\5",
            "",
            "\1\3\120\uffff\1\2",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "5246:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) this_EOL_2= RULE_EOL ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' this_MULTIPLY_5= RULE_MULTIPLY this_EOL_6= RULE_EOL this_EOL_7= RULE_EOL ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleHead136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit239 = new BitSet(new long[]{0x8000000000000052L,0x0000000000104001L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit261 = new BitSet(new long[]{0x8000000000000052L,0x0000000000104001L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit283 = new BitSet(new long[]{0x8000000000000052L,0x0000000000100001L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration372 = new BitSet(new long[]{0x8000000000000050L,0x0000000000100001L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleType_declaration439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface_declaration530 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_INTERFACE_in_ruleInterface_declaration542 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration558 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleInterface_declaration575 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration595 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterface_declaration607 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration627 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleInterface_declaration642 = new BitSet(new long[]{0x80000000000008B0L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleInterface_declaration662 = new BitSet(new long[]{0x80000000000008B0L,0x00000000FF800001L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleInterface_declaration674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass_declaration765 = new BitSet(new long[]{0x8000000000000000L,0x0000000000100001L});
    public static final BitSet FOLLOW_84_in_ruleClass_declaration778 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration795 = new BitSet(new long[]{0x0000000000000500L,0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleClass_declaration812 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration832 = new BitSet(new long[]{0x0000000000000400L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleClass_declaration847 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration868 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleClass_declaration880 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration900 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleClass_declaration915 = new BitSet(new long[]{0x80000000000008B0L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration935 = new BitSet(new long[]{0x80000000000008B0L,0x00000000FF800001L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleClass_declaration947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1035 = new BitSet(new long[]{0x8000000000000090L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleField_declaration1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod_declaration1266 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1305 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleMethod_declaration1321 = new BitSet(new long[]{0x8000000000002080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1341 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleMethod_declaration1353 = new BitSet(new long[]{0x0000000000014420L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleMethod_declaration1365 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleMethod_declaration1375 = new BitSet(new long[]{0x0000000000014420L});
    public static final BitSet FOLLOW_RULE_ABS_in_ruleMethod_declaration1392 = new BitSet(new long[]{0x0000000000014420L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleMethod_declaration1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_call_in_entryRuleMethod_call1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_call1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_call1532 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleMethod_call1548 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_ruleParameter_list_method_call_in_ruleMethod_call1568 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleMethod_call1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructor_declaration1671 = new BitSet(new long[]{0x8000000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleConstructor_declaration1705 = new BitSet(new long[]{0x8000000000002080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1725 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleConstructor_declaration1737 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_method_call_in_entryRuleParameter_list_method_call1793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list_method_call1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter_list_method_call1845 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleParameter_list_method_call1862 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter_list_method_call1878 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1977 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleParameter_list1989 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list2009 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter2103 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2120 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleParameter2138 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleParameter2148 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_ABS_in_ruleParameter2165 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariable_declaration2258 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration2280 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2301 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleVariable_declaration2313 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2333 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleVariable_declaration2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2433 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleVariable_declarator2451 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleVariable_declarator2461 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_RULE_ABS_in_ruleVariable_declarator2478 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleVariable_declarator2491 = new BitSet(new long[]{0x7F50000004DC1480L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleVariable_declarator2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_entryRuleVariable_initializer2549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_initializer2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable_initializer2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleVariable_initializer2641 = new BitSet(new long[]{0x7F50000004DC1C80L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleVariable_initializer2663 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleVariable_initializer2675 = new BitSet(new long[]{0x7F50000004DC1480L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleVariable_initializer2695 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleVariable_initializer2709 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleVariable_initializer2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_NR_in_ruleExpression2829 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_Expression_NR_in_ruleExpression2880 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Expression_NR_in_ruleExpression2930 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_Expression_in_ruleExpression2993 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreating_Expression_in_ruleExpression3057 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_ruleExpression3108 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleExpression3154 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SUPER_in_ruleExpression3205 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THIS_in_ruleExpression3256 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression3307 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_entryRuleExpression_aux3370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_aux3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleExpression_aux3418 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleArg_List_in_ruleExpression_aux3438 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleExpression_aux3449 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleExpression_aux3490 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux3510 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleExpression_aux3521 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleExpression_aux3563 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux3584 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleExpression_aux3626 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux3646 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_ruleExpression_aux3688 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleExpression_aux3708 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_ruleExpression_aux3757 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleExpression_aux3777 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExpression_aux3833 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux3853 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExpression_aux3873 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MINUS_EQUAL_in_ruleExpression_aux3893 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_ruleExpression_aux3913 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_EQUAL_in_ruleExpression_aux3933 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleExpression_aux3953 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DIVIDE_EQUAL_in_ruleExpression_aux3973 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_in_ruleExpression_aux3993 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux4013 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4042 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BT_in_ruleExpression_aux4090 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_ST_in_ruleExpression_aux4110 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_BE_in_ruleExpression_aux4130 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_SE_in_ruleExpression_aux4150 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_EQUAL_in_ruleExpression_aux4170 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DIFFERENT_in_ruleExpression_aux4190 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4219 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleExpression_aux4268 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_OR_EQUAL_in_ruleExpression_aux4288 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_EXP_in_ruleExpression_aux4308 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_EXP_EQUAL_in_ruleExpression_aux4328 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_OR_EQUAL_in_ruleExpression_aux4348 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_in_ruleExpression_aux4368 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux4388 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleAmpersand_Rule_in_ruleExpression_aux4423 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4445 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WAT_in_ruleExpression_aux4485 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4505 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleExpression_aux4516 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4536 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExpression_aux4584 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux4604 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4633 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_EQUAL_in_ruleExpression_aux4681 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_L_SHIFT_in_ruleExpression_aux4701 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_in_ruleExpression_aux4721 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_SUPER_SHIFT_in_ruleExpression_aux4741 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux4770 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmpersand_Rule_in_entryRuleAmpersand_Rule4846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAmpersand_Rule4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule4898 = new BitSet(new long[]{0x0008000000020002L});
    public static final BitSet FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleAmpersand_Rule4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_entryRuleFloat_Literal4980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat_Literal4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal5032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleFloat_Literal5049 = new BitSet(new long[]{0x0030000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal5066 = new BitSet(new long[]{0x0020000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleEXPOENT_PART_in_ruleFloat_Literal5093 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_SUFIX_in_ruleFloat_Literal5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_entryRuleLiteral_Expression5153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral_Expression5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_ruleLiteral_Expression5207 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_ruleLiteral_Expression5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleLiteral_Expression5250 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_ruleLiteral_Expression5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_ruleLiteral_Expression5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral_Expression5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleLiteral_Expression5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreating_Expression_in_entryRuleCreating_Expression5389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreating_Expression5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleCreating_Expression5435 = new BitSet(new long[]{0x8000000000001080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleCreating_Expression5457 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleCreating_Expression5468 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleArg_List_in_ruleCreating_Expression5488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleCreating_Expression5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleCreating_Expression5527 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleCreating_Expression5539 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreating_Expression5559 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleCreating_Expression5570 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleCreating_Expression5584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleCreating_Expression5594 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_ABS_in_ruleCreating_Expression5611 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleCreating_Expression5631 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreating_Expression5651 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleCreating_Expression5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_Expression_in_entryRuleCast_Expression5699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast_Expression5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleCast_Expression5745 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast_Expression5765 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleCast_Expression5776 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCast_Expression5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Expression_NR_in_entryRuleBit_Expression_NR5832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Expression_NR5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleBit_Expression_NR5878 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBit_Expression_NR5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_Expression_NR_in_entryRuleLogical_Expression_NR5934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical_Expression_NR5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXCLAMATION_in_ruleLogical_Expression_NR5981 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogical_Expression_NR6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLogical_Expression_NR6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLogical_Expression_NR6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_List_in_entryRuleArg_List6094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg_List6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg_List6150 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArg_List6162 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg_List6182 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_NR_in_entryRuleNumeric_Expression_NR6220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Expression_NR6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleNumeric_Expression_NR6274 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_ruleNumeric_Expression_NR6294 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleNumeric_Expression_NR6314 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNumeric_Expression_NR6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType6435 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_ruleType6448 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_ruleType6458 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_ABS_in_ruleType6475 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier6513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleType_specifier6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleType_specifier6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleType_specifier6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleType_specifier6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleType_specifier6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleType_specifier6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleType_specifier6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleType_specifier6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleType_specifier6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier6788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_ruleModifier6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleModifier6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer6910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleStatic_initializer6962 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block7024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleStatement_block7082 = new BitSet(new long[]{0xFF50000004DC1CA0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block7102 = new BitSet(new long[]{0xFF50000004DC1CA0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleStatement_block7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement7149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_Statement_in_ruleStatement7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleStatement7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_Statement_in_ruleStatement7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_ruleStatement7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_ruleStatement7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_ruleStatement7367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_Statement_in_ruleStatement7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatement7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_ruleStatement7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement7475 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleStatement7491 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleStatement7543 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement7560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleStatement7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleStatement7608 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement7625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleStatement7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleStatement7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_Statement_in_entryRuleSwitch_Statement7708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_Statement7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SWITCH_in_ruleSwitch_Statement7766 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleSwitch_Statement7776 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch_Statement7796 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleSwitch_Statement7807 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleSwitch_Statement7817 = new BitSet(new long[]{0xFF50000004DC1CA0L,0x00000003FF8006FFL});
    public static final BitSet FOLLOW_RULE_CASE_in_ruleSwitch_Statement7829 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch_Statement7849 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSwitch_Statement7860 = new BitSet(new long[]{0xFF50000004DC1CA0L,0x00000003FF8006FFL});
    public static final BitSet FOLLOW_RULE_DEFAULT_in_ruleSwitch_Statement7878 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSwitch_Statement7888 = new BitSet(new long[]{0xFF50000004DC1CA0L,0x00000003FF8006FFL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitch_Statement7915 = new BitSet(new long[]{0xFF50000004DC1CA0L,0x00000003FF8006FFL});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleSwitch_Statement7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor_Statement7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_ruleFor_Statement8009 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleFor_Statement8019 = new BitSet(new long[]{0xFF50000004DC10A0L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleFor_Statement8040 = new BitSet(new long[]{0x7F50000004DC10A0L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleFor_Statement8063 = new BitSet(new long[]{0x7F50000004DC10A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement8096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleFor_Statement8107 = new BitSet(new long[]{0x7F50000004DC10A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement8129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleFor_Statement8141 = new BitSet(new long[]{0x7F50000004DC10A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement8161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleFor_Statement8173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleFor_Statement8183 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor_Statement8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement8239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleWhile_Statement8285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleWhile_Statement8295 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile_Statement8315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleWhile_Statement8326 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile_Statement8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement8382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_in_ruleDo_Statement8428 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo_Statement8448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleDo_Statement8459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleDo_Statement8469 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDo_Statement8489 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleDo_Statement8500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleDo_Statement8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_Statement_in_entryRuleIf_Statement8545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_Statement8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleIf_Statement8591 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_ruleIf_Statement8601 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf_Statement8621 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleIf_Statement8632 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_Statement8652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleIf_Statement8670 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_Statement8691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_Statement_in_entryRuleReturn_Statement8729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn_Statement8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_ruleReturn_Statement8787 = new BitSet(new long[]{0x03500000000000A0L});
    public static final BitSet FOLLOW_ruleReturn_value_in_ruleReturn_Statement8807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleReturn_Statement8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_value_in_entryRuleReturn_value8854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn_value8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReturn_value8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_call_in_ruleReturn_value8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_ruleReturn_value8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement9007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRY_in_ruleTry_statement9059 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement9085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_RULE_CATCH_in_ruleTry_statement9114 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTry_statement9140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_ruleTry_statement9151 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement9171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_ruleTry_statement9202 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement9266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_in_rulePackage_statement9312 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement9332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_rulePackage_statement9343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name9379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name9430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rulePackage_name9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux9503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rulePackage_name_aux9552 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_aux9567 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement9613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_in_ruleImport_statement9659 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement9681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleImport_statement9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement9720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleImport_statement9732 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_ruleImport_statement9743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleImport_statement9753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleImport_statement9763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name9801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name9903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPOENT_PART_in_entryRuleEXPOENT_PART10005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPOENT_PART10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXPONENTIAL_in_ruleEXPOENT_PART10056 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleEXPOENT_PART10076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_synpred54_InternalJava3418 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleArg_List_in_synpred54_InternalJava3438 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_synpred54_InternalJava3449 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred54_InternalJava3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_synpred55_InternalJava3490 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred55_InternalJava3510 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_synpred55_InternalJava3521 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred55_InternalJava3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_synpred56_InternalJava3563 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred56_InternalJava3584 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred56_InternalJava3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_synpred57_InternalJava3626 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred57_InternalJava3646 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred57_InternalJava3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_synpred58_InternalJava3688 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleClass_name_in_synpred58_InternalJava3708 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred58_InternalJava3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_synpred60_InternalJava3757 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_synpred60_InternalJava3777 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred60_InternalJava3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_synpred70_InternalJava3833 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_synpred70_InternalJava3853 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MINUS_in_synpred70_InternalJava3873 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MINUS_EQUAL_in_synpred70_InternalJava3893 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_synpred70_InternalJava3913 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_EQUAL_in_synpred70_InternalJava3933 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_synpred70_InternalJava3953 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DIVIDE_EQUAL_in_synpred70_InternalJava3973 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_in_synpred70_InternalJava3993 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_synpred70_InternalJava4013 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred70_InternalJava4042 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred70_InternalJava4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BT_in_synpred76_InternalJava4090 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_ST_in_synpred76_InternalJava4110 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_BE_in_synpred76_InternalJava4130 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_SE_in_synpred76_InternalJava4150 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_EQUAL_in_synpred76_InternalJava4170 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DIFFERENT_in_synpred76_InternalJava4190 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred76_InternalJava4219 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred76_InternalJava4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_synpred84_InternalJava4268 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_OR_EQUAL_in_synpred84_InternalJava4288 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_EXP_in_synpred84_InternalJava4308 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_EXP_EQUAL_in_synpred84_InternalJava4328 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_OR_EQUAL_in_synpred84_InternalJava4348 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_in_synpred84_InternalJava4368 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_synpred84_InternalJava4388 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleAmpersand_Rule_in_synpred84_InternalJava4423 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred84_InternalJava4445 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred84_InternalJava4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WAT_in_synpred85_InternalJava4485 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred85_InternalJava4505 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_synpred85_InternalJava4516 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred85_InternalJava4536 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred85_InternalJava4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_synpred87_InternalJava4584 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_synpred87_InternalJava4604 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred87_InternalJava4633 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred87_InternalJava4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_EQUAL_in_synpred91_InternalJava4681 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_L_SHIFT_in_synpred91_InternalJava4701 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_in_synpred91_InternalJava4721 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_RULE_SUPER_SHIFT_in_synpred91_InternalJava4741 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred91_InternalJava4770 = new BitSet(new long[]{0x000FBFFFFFE05200L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred91_InternalJava4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_synpred94_InternalJava5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_synpred100_InternalJava5207 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_synpred100_InternalJava5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_synpred100_InternalJava5250 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_synpred100_InternalJava5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_synpred101_InternalJava5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_synpred103_InternalJava5457 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_RIGHT_PARENTHESIS_in_synpred103_InternalJava5468 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleArg_List_in_synpred103_InternalJava5488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_synpred103_InternalJava5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_synpred104_InternalJava5539 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred104_InternalJava5559 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_synpred104_InternalJava5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_synpred107_InternalJava5527 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_synpred107_InternalJava5539 = new BitSet(new long[]{0x7F50000004DC1080L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred107_InternalJava5559 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_synpred107_InternalJava5570 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_R_ABS_in_synpred107_InternalJava5584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_L_ABS_in_synpred107_InternalJava5594 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_RULE_ABS_in_synpred107_InternalJava5611 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_synpred127_InternalJava7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred128_InternalJava7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_synpred144_InternalJava8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_synpred149_InternalJava8670 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred149_InternalJava8691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_synpred154_InternalJava9114 = new BitSet(new long[]{0x8000000000000080L,0x00000000FF800001L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred154_InternalJava9140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_LEFT_PARENTHESIS_in_synpred154_InternalJava9151 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred154_InternalJava9171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_synpred156_InternalJava9202 = new BitSet(new long[]{0xFF50000004DC14A0L,0x00000003FF8006F3L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred156_InternalJava9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_synpred157_InternalJava9552 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred157_InternalJava9567 = new BitSet(new long[]{0x0000000000000002L});

}