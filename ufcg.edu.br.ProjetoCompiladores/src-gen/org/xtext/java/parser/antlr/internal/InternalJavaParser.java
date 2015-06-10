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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_ID", "RULE_DECIMAL_DIGITS", "RULE_EXPOENT_PART", "RULE_FLOAT_TYPE_SUFIX", "RULE_HEXA", "RULE_STRING", "RULE_CHAR", "RULE_MINUS", "RULE_INCREMENT", "RULE_DECREMENT", "RULE_MOD", "RULE_STATIC", "RULE_TRY", "RULE_CATCH", "RULE_FINALLY", "RULE_EXPONENTIAL", "RULE_PLUS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'interface'", "'extends'", "','", "'{'", "'}'", "'class'", "'implements'", "'('", "')'", "'['", "']'", "'[]'", "'='", "'null'", "'super'", "'this'", "'.'", "'instanceof'", "'l'", "'new'", "'~'", "'!'", "'false'", "'true'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'synchronized'", "'return'", "'throw'", "':'", "'break'", "'continue'", "'switch'", "'case'", "'default'", "'for'", "'while'", "'do'", "'if'", "'else'", "'package'", "'import'", "'*'"
    };
    public static final int T__50=50;
    public static final int RULE_CATCH=18;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_CHAR=11;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_INCREMENT=13;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_EXPONENTIAL=20;
    public static final int RULE_ID=5;
    public static final int RULE_MOD=15;
    public static final int RULE_HEXA=9;
    public static final int RULE_DOC_COMMENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_FINALLY=19;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_EXPOENT_PART=7;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_DECIMAL_DIGITS=6;
    public static final int T__35=35;
    public static final int RULE_PLUS=21;
    public static final int T__36=36;
    public static final int RULE_DECREMENT=14;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_FLOAT_TYPE_SUFIX=8;
    public static final int RULE_TRY=17;
    public static final int RULE_WS=24;
    public static final int RULE_STATIC=16;
    public static final int RULE_MINUS=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

            if ( (LA1_0==72) ) {
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

                if ( (LA2_0==73) ) {
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

                if ( (LA3_0==RULE_DOC_COMMENT||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==26||LA3_0==31) ) {
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:205:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:208:28: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:1: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:209:2: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleClass_declaration ) ) | ( (lv_name_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleType_declaration440); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration476);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration486); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:285:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:288:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}'
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
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration532);
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleInterface_declaration545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:311:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:313:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration562); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:329:2: (otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:329:4: otherlv_3= 'extends' ( (lv_extend_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleInterface_declaration580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
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
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration601);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:351:2: (otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==28) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:351:4: otherlv_5= ',' ( (lv_extends_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleInterface_declaration614); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
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
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration635);
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

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleInterface_declaration651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleInterface_declaration663); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:389:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:390:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:391:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration699);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration709); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:398:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:401:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:402:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:402:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:402:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fields_10_0= ruleField_declaration ) )* otherlv_11= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:402:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:403:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:403:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:404:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration755);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleClass_declaration768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:424:1: ( (lv_className_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:425:1: (lv_className_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:425:1: (lv_className_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:426:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration785); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:442:2: (otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:442:4: otherlv_3= 'extends' ( (lv_extend_4_0= ruleClass_name ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleClass_declaration803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:446:1: ( (lv_extend_4_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:447:1: (lv_extend_4_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:447:1: (lv_extend_4_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:448:3: lv_extend_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration824);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:464:4: (otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:464:6: otherlv_5= 'implements' ( (lv_implement_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleClass_declaration839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:468:1: ( (lv_implement_6_0= ruleInterface_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:469:1: (lv_implement_6_0= ruleInterface_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:469:1: (lv_implement_6_0= ruleInterface_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:470:3: lv_implement_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration860);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:486:2: (otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:486:4: otherlv_7= ',' ( (lv_implements_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleClass_declaration873); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:490:1: ( (lv_implements_8_0= ruleInterface_name ) )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:491:1: (lv_implements_8_0= ruleInterface_name )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:491:1: (lv_implements_8_0= ruleInterface_name )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:492:3: lv_implements_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration894);
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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleClass_declaration910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:512:1: ( (lv_fields_10_0= ruleField_declaration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOC_COMMENT && LA13_0<=RULE_ID)||(LA13_0>=RULE_MOD && LA13_0<=RULE_STATIC)||LA13_0==25||(LA13_0>=50 && LA13_0<=57)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:513:1: (lv_fields_10_0= ruleField_declaration )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:513:1: (lv_fields_10_0= ruleField_declaration )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:514:3: lv_fields_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration931);
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

            otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleClass_declaration944); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:542:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:543:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:544:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration980);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration990); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:551:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:554:28: ( ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:555:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:555:1: ( ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_name_4_0= ruleStatic_initializer ) ) | ( (lv_debug_5_0= ';' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt16=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID||(LA16_2>=RULE_MOD && LA16_2<=RULE_STATIC)||(LA16_2>=50 && LA16_2<=57)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==29) ) {
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
            case 25:
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:555:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:555:2: ( ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:555:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:555:3: ( (lv_doc_0_0= RULE_DOC_COMMENT ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DOC_COMMENT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:556:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:556:1: (lv_doc_0_0= RULE_DOC_COMMENT )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:557:3: lv_doc_0_0= RULE_DOC_COMMENT
                            {
                            lv_doc_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1033); if (state.failed) return current;
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )
                    int alt15=3;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:573:4: ( (lv_name_1_0= ruleVariable_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:574:1: (lv_name_1_0= ruleVariable_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:574:1: (lv_name_1_0= ruleVariable_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:575:3: lv_name_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1061);
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
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:592:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:592:6: ( (lv_name_2_0= ruleConstructor_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:593:1: (lv_name_2_0= ruleConstructor_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:593:1: (lv_name_2_0= ruleConstructor_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:594:3: lv_name_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1088);
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
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:611:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:611:6: ( (lv_name_3_0= ruleMethod_declaration ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:612:1: (lv_name_3_0= ruleMethod_declaration )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:612:1: (lv_name_3_0= ruleMethod_declaration )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:613:3: lv_name_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1115);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:630:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:630:6: ( (lv_name_4_0= ruleStatic_initializer ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:631:1: (lv_name_4_0= ruleStatic_initializer )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:631:1: (lv_name_4_0= ruleStatic_initializer )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:632:3: lv_name_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1144);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:649:6: ( (lv_debug_5_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:649:6: ( (lv_debug_5_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:650:1: (lv_debug_5_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:650:1: (lv_debug_5_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:651:3: lv_debug_5_0= ';'
                    {
                    lv_debug_5_0=(Token)match(input,25,FOLLOW_25_in_ruleField_declaration1168); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:672:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:673:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:674:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1217);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1227); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:681:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:684:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:685:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:685:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:685:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter_list ) )? otherlv_5= ')' ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )* ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:685:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:686:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:686:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:687:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1273);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:703:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:704:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:704:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:705:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1295);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:721:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:722:1: (lv_name_2_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:722:1: (lv_name_2_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:723:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1312); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleMethod_declaration1329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:743:1: ( (lv_parameter_4_0= ruleParameter_list ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=50 && LA18_0<=57)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:744:1: (lv_parameter_4_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:744:1: (lv_parameter_4_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:745:3: lv_parameter_4_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1350);
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

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleMethod_declaration1363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:1: ( (otherlv_6= '[' otherlv_7= ']' ) | otherlv_8= '[]' )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }
                else if ( (LA19_0==37) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:2: (otherlv_6= '[' otherlv_7= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:2: (otherlv_6= '[' otherlv_7= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:765:4: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleMethod_declaration1377); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleMethod_declaration1389); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:774:7: otherlv_8= '[]'
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleMethod_declaration1408); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:778:3: ( ( (lv_statement_9_0= ruleStatement_block ) ) | ( (lv_debug_10_0= ';' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:778:4: ( (lv_statement_9_0= ruleStatement_block ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:778:4: ( (lv_statement_9_0= ruleStatement_block ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:779:1: (lv_statement_9_0= ruleStatement_block )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:779:1: (lv_statement_9_0= ruleStatement_block )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:780:3: lv_statement_9_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1432);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:797:6: ( (lv_debug_10_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:797:6: ( (lv_debug_10_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:798:1: (lv_debug_10_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:798:1: (lv_debug_10_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:799:3: lv_debug_10_0= ';'
                    {
                    lv_debug_10_0=(Token)match(input,25,FOLLOW_25_in_ruleMethod_declaration1456); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:820:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:821:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:822:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1506);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1516); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:829:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:832:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:833:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:833:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:833:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statement_5_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:833:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_MOD && LA21_0<=RULE_STATIC)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:834:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:834:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:835:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1562);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:851:3: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:852:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:852:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:853:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1580); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleConstructor_declaration1597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:873:1: ( (lv_parameters_3_0= ruleParameter_list ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=50 && LA22_0<=57)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:874:1: (lv_parameters_3_0= ruleParameter_list )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:874:1: (lv_parameters_3_0= ruleParameter_list )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:875:3: lv_parameters_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1618);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleConstructor_declaration1631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:895:1: ( (lv_statement_5_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:896:1: (lv_statement_5_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:896:1: (lv_statement_5_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:897:3: lv_statement_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1652);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:921:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:922:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:923:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1688);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1698); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:930:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:933:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:934:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:934:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:934:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:934:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:935:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:935:1: (lv_parameter_0_0= ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:936:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1744);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:952:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:952:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleParameter_list1757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:956:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:957:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:957:1: (lv_parameters_2_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:958:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1778);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:982:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:983:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:984:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1816);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1826); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:991:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:994:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:995:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:995:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:995:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:995:2: ( (lv_type_0_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:996:1: (lv_type_0_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:996:1: (lv_type_0_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:997:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter1872);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1013:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1014:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1014:1: (lv_name_1_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1015:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1889); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1031:2: ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }
                else if ( (LA24_0==37) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1031:3: (otherlv_2= '[' otherlv_3= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1031:3: (otherlv_2= '[' otherlv_3= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1031:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleParameter1908); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleParameter1920); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1040:7: otherlv_4= '[]'
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleParameter1939); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1052:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1053:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1054:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1977);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration1987); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1061:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1064:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1065:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1065:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1065:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1065:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_MOD && LA25_0<=RULE_STATIC)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1066:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1066:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1067:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration2033);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1083:3: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1084:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1084:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1085:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration2055);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1101:2: ( (lv_name_2_0= ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1102:1: (lv_name_2_0= ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1102:1: (lv_name_2_0= ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1103:3: lv_name_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2076);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1119:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1119:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleVariable_declaration2089); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1123:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1124:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1124:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1125:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2110);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleVariable_declaration2124); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1153:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1154:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1155:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2160);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2170); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1162:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_initializer_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1165:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1166:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1166:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1166:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1166:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1167:1: (lv_name_0_0= RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1167:1: (lv_name_0_0= RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1168:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2212); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1184:2: ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }
                else if ( (LA27_0==37) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1184:3: (otherlv_1= '[' otherlv_2= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1184:3: (otherlv_1= '[' otherlv_2= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1184:5: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleVariable_declarator2231); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleVariable_declarator2243); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1193:7: otherlv_3= '[]'
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleVariable_declarator2262); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1197:3: (otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1197:5: otherlv_4= '=' ( (lv_initializer_5_0= ruleVariable_initializer ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleVariable_declarator2277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariable_declaratorAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1201:1: ( (lv_initializer_5_0= ruleVariable_initializer ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1202:1: (lv_initializer_5_0= ruleVariable_initializer )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1202:1: (lv_initializer_5_0= ruleVariable_initializer )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1203:3: lv_initializer_5_0= ruleVariable_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getInitializerVariable_initializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_initializer_in_ruleVariable_declarator2298);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1227:1: entryRuleVariable_initializer returns [EObject current=null] : iv_ruleVariable_initializer= ruleVariable_initializer EOF ;
    public final EObject entryRuleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_initializer = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1228:2: (iv_ruleVariable_initializer= ruleVariable_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1229:2: iv_ruleVariable_initializer= ruleVariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_initializer_in_entryRuleVariable_initializer2336);
            iv_ruleVariable_initializer=ruleVariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_initializer2346); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1236:1: ruleVariable_initializer returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1239:28: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1240:1: ( (lv_expression_0_0= ruleExpression ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1240:1: ( (lv_expression_0_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1241:1: (lv_expression_0_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1241:1: (lv_expression_0_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1242:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressionExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable_initializer2391);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1266:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1267:2: (iv_ruleExpression= ruleExpression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1268:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2426);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2436); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1275:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_null_12_0=null;
        Token lv_super_14_0=null;
        Token lv_this_16_0=null;
        Token lv_name_18_0=null;
        EObject lv_numericExpression_0_0 = null;

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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1278:28: ( ( ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1279:1: ( ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1279:1: ( ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            int alt29=10;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1279:2: ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1279:2: ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1279:3: ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1279:3: ( (lv_numericExpression_0_0= ruleNumeric_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1280:1: (lv_numericExpression_0_0= ruleNumeric_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1280:1: (lv_numericExpression_0_0= ruleNumeric_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1281:3: lv_numericExpression_0_0= ruleNumeric_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpressionNumeric_ExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumeric_Expression_in_ruleExpression2483);
                    lv_numericExpression_0_0=ruleNumeric_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numericExpression",
                              		lv_numericExpression_0_0, 
                              		"Numeric_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1297:2: ( (lv_aux_1_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1298:1: (lv_aux_1_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1298:1: (lv_aux_1_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1299:3: lv_aux_1_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2504);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1316:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1317:1: (lv_logicalExpression_2_0= ruleLogical_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1317:1: (lv_logicalExpression_2_0= ruleLogical_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1318:3: lv_logicalExpression_2_0= ruleLogical_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionLogical_ExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogical_Expression_in_ruleExpression2533);
                    lv_logicalExpression_2_0=ruleLogical_Expression();

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
                              		"Logical_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1334:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1335:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1335:1: (lv_aux_3_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1336:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2554);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1353:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1353:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1353:7: ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1353:7: ( (lv_bitExpression_4_0= ruleBit_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1354:1: (lv_bitExpression_4_0= ruleBit_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1354:1: (lv_bitExpression_4_0= ruleBit_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1355:3: lv_bitExpression_4_0= ruleBit_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getBitExpressionBit_ExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBit_Expression_in_ruleExpression2583);
                    lv_bitExpression_4_0=ruleBit_Expression();

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
                              		"Bit_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1371:2: ( (lv_aux_5_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1372:1: (lv_aux_5_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1372:1: (lv_aux_5_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1373:3: lv_aux_5_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2604);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1390:8: ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1394:5: ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1395:1: (lv_castExpression_6_0= ruleCast_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1395:1: (lv_castExpression_6_0= ruleCast_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1396:3: lv_castExpression_6_0= ruleCast_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCastExpressionCast_ExpressionParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCast_Expression_in_ruleExpression2646);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1412:3: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1413:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1413:1: (lv_aux_7_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1414:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2668);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1431:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1431:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1431:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1431:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1431:8: ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1435:5: ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1436:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1436:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1437:3: lv_creatingExpression_8_0= ruleCreating_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCreatingExpressionCreating_ExpressionParserRuleCall_4_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCreating_Expression_in_ruleExpression2710);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1453:3: ( (lv_aux_9_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1454:1: (lv_aux_9_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1454:1: (lv_aux_9_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1455:3: lv_aux_9_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2732);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1472:6: ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1472:6: ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1472:7: ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1472:7: ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1472:8: ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1476:5: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1477:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1477:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1478:3: lv_literalExpression_10_0= ruleLiteral_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionLiteral_ExpressionParserRuleCall_5_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_Expression_in_ruleExpression2774);
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


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1494:3: ( (lv_aux_11_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:1: (lv_aux_11_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1495:1: (lv_aux_11_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1496:3: lv_aux_11_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2796);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1513:6: ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1513:6: ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1513:7: ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1513:7: ( (lv_null_12_0= 'null' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1514:1: (lv_null_12_0= 'null' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1514:1: (lv_null_12_0= 'null' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1515:3: lv_null_12_0= 'null'
                    {
                    lv_null_12_0=(Token)match(input,39,FOLLOW_39_in_ruleExpression2822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_null_12_0, grammarAccess.getExpressionAccess().getNullNullKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "null", lv_null_12_0, "null");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1528:2: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1529:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1529:1: (lv_aux_13_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1530:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2856);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1547:6: ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1547:6: ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1547:7: ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1547:7: ( (lv_super_14_0= 'super' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1548:1: (lv_super_14_0= 'super' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1548:1: (lv_super_14_0= 'super' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1549:3: lv_super_14_0= 'super'
                    {
                    lv_super_14_0=(Token)match(input,40,FOLLOW_40_in_ruleExpression2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_super_14_0, grammarAccess.getExpressionAccess().getSuperSuperKeyword_7_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "super", lv_super_14_0, "super");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1562:2: ( (lv_aux_15_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1563:1: (lv_aux_15_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1563:1: (lv_aux_15_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1564:3: lv_aux_15_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2916);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1581:6: ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1581:6: ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1581:7: ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1581:7: ( (lv_this_16_0= 'this' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1582:1: (lv_this_16_0= 'this' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1582:1: (lv_this_16_0= 'this' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1583:3: lv_this_16_0= 'this'
                    {
                    lv_this_16_0=(Token)match(input,41,FOLLOW_41_in_ruleExpression2942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_this_16_0, grammarAccess.getExpressionAccess().getThisThisKeyword_8_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "this", lv_this_16_0, "this");
                      	    
                    }

                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1596:2: ( (lv_aux_17_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1597:1: (lv_aux_17_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1597:1: (lv_aux_17_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1598:3: lv_aux_17_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression2976);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1615:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1615:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1615:7: ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1615:7: ( (lv_name_18_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1616:1: (lv_name_18_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1616:1: (lv_name_18_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1617:3: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression3001); if (state.failed) return current;
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1633:2: ( (lv_aux_19_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1634:1: (lv_aux_19_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1634:1: (lv_aux_19_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1635:3: lv_aux_19_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression3027);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1659:1: entryRuleExpression_aux returns [EObject current=null] : iv_ruleExpression_aux= ruleExpression_aux EOF ;
    public final EObject entryRuleExpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_aux = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1660:2: (iv_ruleExpression_aux= ruleExpression_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1661:2: iv_ruleExpression_aux= ruleExpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_aux_in_entryRuleExpression_aux3064);
            iv_ruleExpression_aux=ruleExpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_aux3074); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1668:1: ruleExpression_aux returns [EObject current=null] : ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) ) | ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) ) | ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) ) | ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) ) | ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) ) | () ) ;
    public final EObject ruleExpression_aux() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux1_3_0 = null;

        EObject lv_expression2_5_0 = null;

        EObject lv_aux2_7_0 = null;

        EObject lv_expression2_9_0 = null;

        EObject lv_aux3_10_0 = null;

        EObject lv_expression_12_0 = null;

        EObject lv_aux4_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux5_16_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1671:28: ( ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) ) | ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) ) | ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) ) | ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) ) | ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) ) | () ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:1: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) ) | ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) ) | ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) ) | ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) ) | ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) ) | () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:1: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) ) | ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) ) | ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) ) | ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) ) | ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) ) | () )
            int alt30=6;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:3: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:3: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:4: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:4: ( ( '(' )=>otherlv_0= '(' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:5: ( '(' )=>otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleExpression_aux3121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExpression_auxAccess().getLeftParenthesisKeyword_0_0_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1677:2: ( (lv_argList_1_0= ruleArg_List ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1678:1: (lv_argList_1_0= ruleArg_List )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1678:1: (lv_argList_1_0= ruleArg_List )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1679:3: lv_argList_1_0= ruleArg_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArg_List_in_ruleExpression_aux3143);
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

                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleExpression_aux3155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpression_auxAccess().getRightParenthesisKeyword_0_0_2());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1699:2: ( (lv_aux1_3_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1700:1: (lv_aux1_3_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1700:1: (lv_aux1_3_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1701:3: lv_aux1_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux1Expression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3177);
                    lv_aux1_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux1",
                              		lv_aux1_3_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:6: ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:6: ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:7: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:7: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:8: ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:8: ( ( '[' )=>otherlv_4= '[' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:9: ( '[' )=>otherlv_4= '['
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleExpression_aux3206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExpression_auxAccess().getLeftSquareBracketKeyword_1_0_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1723:2: ( (lv_expression2_5_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1724:1: (lv_expression2_5_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1724:1: (lv_expression2_5_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1725:3: lv_expression2_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux3228);
                    lv_expression2_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		add(
                             			current, 
                             			"expression2",
                              		lv_expression2_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleExpression_aux3240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpression_auxAccess().getRightSquareBracketKeyword_1_0_2());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:2: ( (lv_aux2_7_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1746:1: (lv_aux2_7_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1746:1: (lv_aux2_7_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1747:3: lv_aux2_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux2Expression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3262);
                    lv_aux2_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux2",
                              		lv_aux2_7_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:6: ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:6: ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:7: ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:7: ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:8: ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:8: ( ( '.' )=>otherlv_8= '.' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:9: ( '.' )=>otherlv_8= '.'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleExpression_aux3291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getFullStopKeyword_2_0_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1769:2: ( (lv_expression2_9_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1770:1: (lv_expression2_9_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1770:1: (lv_expression2_9_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1771:3: lv_expression2_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux3313);
                    lv_expression2_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		add(
                             			current, 
                             			"expression2",
                              		lv_expression2_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1787:3: ( (lv_aux3_10_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1788:1: (lv_aux3_10_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1788:1: (lv_aux3_10_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1789:3: lv_aux3_10_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux3Expression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3335);
                    lv_aux3_10_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux3",
                              		lv_aux3_10_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:6: ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:6: ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:7: ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:7: ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:8: ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:8: ( ( ',' )=>otherlv_11= ',' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:9: ( ',' )=>otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleExpression_aux3364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExpression_auxAccess().getCommaKeyword_3_0_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1811:2: ( (lv_expression_12_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1812:1: (lv_expression_12_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1812:1: (lv_expression_12_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1813:3: lv_expression_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionExpressionParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux3386);
                    lv_expression_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		add(
                             			current, 
                             			"expression",
                              		lv_expression_12_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1829:3: ( (lv_aux4_13_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1830:1: (lv_aux4_13_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1830:1: (lv_aux4_13_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1831:3: lv_aux4_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux4Expression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3408);
                    lv_aux4_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux4",
                              		lv_aux4_13_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:6: ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:6: ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:7: ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:7: ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:8: ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:8: ( ( 'instanceof' )=>otherlv_14= 'instanceof' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:9: ( 'instanceof' )=>otherlv_14= 'instanceof'
                    {
                    otherlv_14=(Token)match(input,43,FOLLOW_43_in_ruleExpression_aux3437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getExpression_auxAccess().getInstanceofKeyword_4_0_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1853:2: ( (lv_name_15_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1854:1: (lv_name_15_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1854:1: (lv_name_15_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1855:3: lv_name_15_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleExpression_aux3459);
                    lv_name_15_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		add(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1871:3: ( (lv_aux5_16_0= ruleExpression_aux ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1872:1: (lv_aux5_16_0= ruleExpression_aux )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1872:1: (lv_aux5_16_0= ruleExpression_aux )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1873:3: lv_aux5_16_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux5Expression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux3481);
                    lv_aux5_16_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux5",
                              		lv_aux5_16_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1890:6: ()
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1890:6: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1891:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_auxAccess().getExpression_auxAction_5(),
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


    // $ANTLR start "entryRuleFloat_Literal"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1907:1: entryRuleFloat_Literal returns [EObject current=null] : iv_ruleFloat_Literal= ruleFloat_Literal EOF ;
    public final EObject entryRuleFloat_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat_Literal = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1908:2: (iv_ruleFloat_Literal= ruleFloat_Literal EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1909:2: iv_ruleFloat_Literal= ruleFloat_Literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_LiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloat_Literal_in_entryRuleFloat_Literal3536);
            iv_ruleFloat_Literal=ruleFloat_Literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat_Literal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat_Literal3546); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1916:1: ruleFloat_Literal returns [EObject current=null] : ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= RULE_EXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) ;
    public final EObject ruleFloat_Literal() throws RecognitionException {
        EObject current = null;

        Token lv_decimalDigits1_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalDigits2_2_0=null;
        Token lv_exp_3_0=null;
        Token lv_floatTypeSufix_4_0=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1919:28: ( ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= RULE_EXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= RULE_EXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= RULE_EXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= RULE_EXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1920:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1921:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1921:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1922:3: lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS
            {
            lv_decimalDigits1_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal3588); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleFloat_Literal3605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloat_LiteralAccess().getFullStopKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1942:1: ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_DECIMAL_DIGITS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1943:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1943:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1944:3: lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimalDigits2_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal3622); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1960:3: ( (lv_exp_3_0= RULE_EXPOENT_PART ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_EXPOENT_PART) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1961:1: (lv_exp_3_0= RULE_EXPOENT_PART )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1961:1: (lv_exp_3_0= RULE_EXPOENT_PART )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1962:3: lv_exp_3_0= RULE_EXPOENT_PART
                    {
                    lv_exp_3_0=(Token)match(input,RULE_EXPOENT_PART,FOLLOW_RULE_EXPOENT_PART_in_ruleFloat_Literal3645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_exp_3_0, grammarAccess.getFloat_LiteralAccess().getExpEXPOENT_PARTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"exp",
                              		lv_exp_3_0, 
                              		"EXPOENT_PART");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1978:3: ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_FLOAT_TYPE_SUFIX) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1979:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1979:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1980:3: lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX
                    {
                    lv_floatTypeSufix_4_0=(Token)match(input,RULE_FLOAT_TYPE_SUFIX,FOLLOW_RULE_FLOAT_TYPE_SUFIX_in_ruleFloat_Literal3668); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2004:1: entryRuleLiteral_Expression returns [EObject current=null] : iv_ruleLiteral_Expression= ruleLiteral_Expression EOF ;
    public final EObject entryRuleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2005:2: (iv_ruleLiteral_Expression= ruleLiteral_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2006:2: iv_ruleLiteral_Expression= ruleLiteral_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_Expression_in_entryRuleLiteral_Expression3710);
            iv_ruleLiteral_Expression=ruleLiteral_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral_Expression3720); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2013:1: ruleLiteral_Expression returns [EObject current=null] : ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) ) ;
    public final EObject ruleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        Token lv_exp_0_0=null;
        Token otherlv_1=null;
        Token lv_exp1_2_0=null;
        Token otherlv_3=null;
        Token lv_string_5_0=null;
        Token lv_char_6_0=null;
        EObject lv_exp2_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2016:28: ( ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_HEXA:
                {
                alt37=1;
                }
                break;
            case RULE_DECIMAL_DIGITS:
                {
                int LA37_2 = input.LA(2);

                if ( (synpred62_InternalJava()) ) {
                    alt37=1;
                }
                else if ( (synpred63_InternalJava()) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            case RULE_CHAR:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_HEXA) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_DECIMAL_DIGITS) ) {
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
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:4: ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )?
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:4: ( (lv_exp_0_0= RULE_HEXA ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2018:1: (lv_exp_0_0= RULE_HEXA )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2018:1: (lv_exp_0_0= RULE_HEXA )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2019:3: lv_exp_0_0= RULE_HEXA
                            {
                            lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_ruleLiteral_Expression3764); if (state.failed) return current;
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

                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2035:2: (otherlv_1= 'l' )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==44) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2035:4: otherlv_1= 'l'
                                    {
                                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleLiteral_Expression3782); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_1, grammarAccess.getLiteral_ExpressionAccess().getLKeyword_0_0_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )?
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2041:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2041:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2042:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                            {
                            lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleLiteral_Expression3809); if (state.failed) return current;
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

                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2058:2: (otherlv_3= 'l' )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==44) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2058:4: otherlv_3= 'l'
                                    {
                                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleLiteral_Expression3827); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getLiteral_ExpressionAccess().getLKeyword_0_1_1());
                                          
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2063:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2063:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2064:1: (lv_exp2_4_0= ruleFloat_Literal )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2064:1: (lv_exp2_4_0= ruleFloat_Literal )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:3: lv_exp2_4_0= ruleFloat_Literal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloat_Literal_in_ruleLiteral_Expression3858);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2082:6: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2082:6: ( (lv_string_5_0= RULE_STRING ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2083:1: (lv_string_5_0= RULE_STRING )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2083:1: (lv_string_5_0= RULE_STRING )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2084:3: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral_Expression3881); if (state.failed) return current;
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2101:6: ( (lv_char_6_0= RULE_CHAR ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2101:6: ( (lv_char_6_0= RULE_CHAR ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2102:1: (lv_char_6_0= RULE_CHAR )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2102:1: (lv_char_6_0= RULE_CHAR )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2103:3: lv_char_6_0= RULE_CHAR
                    {
                    lv_char_6_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleLiteral_Expression3909); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2127:1: entryRuleCreating_Expression returns [EObject current=null] : iv_ruleCreating_Expression= ruleCreating_Expression EOF ;
    public final EObject entryRuleCreating_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreating_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2128:2: (iv_ruleCreating_Expression= ruleCreating_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2129:2: iv_ruleCreating_Expression= ruleCreating_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCreating_Expression_in_entryRuleCreating_Expression3950);
            iv_ruleCreating_Expression=ruleCreating_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreating_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreating_Expression3960); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2136:1: ruleCreating_Expression returns [EObject current=null] : (otherlv_0= 'new' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) ) ) ;
    public final EObject ruleCreating_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;

        AntlrDatatypeRuleToken lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_expression_13_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2139:28: ( (otherlv_0= 'new' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2140:1: (otherlv_0= 'new' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2140:1: (otherlv_0= 'new' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2140:3: otherlv_0= 'new' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleCreating_Expression3997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreating_ExpressionAccess().getNewKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2145:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2145:1: (lv_className_1_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2146:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleCreating_Expression4020);
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

                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleCreating_Expression4032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCreating_ExpressionAccess().getLeftParenthesisKeyword_1_0_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2166:1: ( (lv_argList_3_0= ruleArg_List ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2167:1: (lv_argList_3_0= ruleArg_List )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2167:1: (lv_argList_3_0= ruleArg_List )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2168:3: lv_argList_3_0= ruleArg_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArg_List_in_ruleCreating_Expression4053);
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

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCreating_Expression4065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCreating_ExpressionAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )*
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2190:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2190:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2191:3: lv_typeSpecifier_5_0= ruleType_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_specifier_in_ruleCreating_Expression4094);
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2207:2: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    int alt38=2;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2207:4: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleCreating_Expression4107); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketKeyword_1_1_1_0());
                                  
                            }
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2211:1: ( (lv_expression_7_0= ruleExpression ) )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2212:1: (lv_expression_7_0= ruleExpression )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2212:1: (lv_expression_7_0= ruleExpression )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2213:3: lv_expression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCreating_Expression4128);
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

                            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleCreating_Expression4140); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreating_ExpressionAccess().getRightSquareBracketKeyword_1_1_1_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:3: ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==35) ) {
                            int LA39_2 = input.LA(2);

                            if ( (LA39_2==36) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0==37) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:4: (otherlv_9= '[' otherlv_10= ']' )
                    	    {
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:4: (otherlv_9= '[' otherlv_10= ']' )
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:6: otherlv_9= '[' otherlv_10= ']'
                    	    {
                    	    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleCreating_Expression4156); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketKeyword_1_1_2_0_0());
                    	          
                    	    }
                    	    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleCreating_Expression4168); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getCreating_ExpressionAccess().getRightSquareBracketKeyword_1_1_2_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2242:7: otherlv_11= '[]'
                    	    {
                    	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleCreating_Expression4187); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2247:6: (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2247:6: (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2247:8: otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleCreating_Expression4209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCreating_ExpressionAccess().getLeftParenthesisKeyword_1_2_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2251:1: ( (lv_expression_13_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2252:1: (lv_expression_13_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2252:1: (lv_expression_13_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2253:3: lv_expression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCreating_Expression4230);
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

                    otherlv_14=(Token)match(input,34,FOLLOW_34_in_ruleCreating_Expression4242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCreating_ExpressionAccess().getRightParenthesisKeyword_1_2_2());
                          
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2281:1: entryRuleCast_Expression returns [EObject current=null] : iv_ruleCast_Expression= ruleCast_Expression EOF ;
    public final EObject entryRuleCast_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2282:2: (iv_ruleCast_Expression= ruleCast_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2283:2: iv_ruleCast_Expression= ruleCast_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCast_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCast_Expression_in_entryRuleCast_Expression4280);
            iv_ruleCast_Expression=ruleCast_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCast_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast_Expression4290); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2290:1: ruleCast_Expression returns [EObject current=null] : (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCast_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2293:28: ( (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2294:1: (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2294:1: (otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2294:3: otherlv_0= '(' ( (lv_type_1_0= ruleType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleCast_Expression4327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCast_ExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2298:1: ( (lv_type_1_0= ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2299:1: (lv_type_1_0= ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2299:1: (lv_type_1_0= ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2300:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleCast_Expression4348);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleCast_Expression4360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCast_ExpressionAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2320:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2321:1: (lv_expression_3_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2321:1: (lv_expression_3_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2322:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCast_Expression4381);
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


    // $ANTLR start "entryRuleBit_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2346:1: entryRuleBit_Expression returns [EObject current=null] : iv_ruleBit_Expression= ruleBit_Expression EOF ;
    public final EObject entryRuleBit_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBit_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2347:2: (iv_ruleBit_Expression= ruleBit_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2348:2: iv_ruleBit_Expression= ruleBit_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBit_Expression_in_entryRuleBit_Expression4417);
            iv_ruleBit_Expression=ruleBit_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBit_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Expression4427); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBit_Expression"


    // $ANTLR start "ruleBit_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2355:1: ruleBit_Expression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBit_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2358:28: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2359:1: (otherlv_0= '~' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2359:1: (otherlv_0= '~' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2359:3: otherlv_0= '~' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleBit_Expression4464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBit_ExpressionAccess().getTildeKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2363:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2364:1: (lv_expression_1_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2364:1: (lv_expression_1_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2365:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_ExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleBit_Expression4485);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBit_ExpressionRule());
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
    // $ANTLR end "ruleBit_Expression"


    // $ANTLR start "entryRuleLogical_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2389:1: entryRuleLogical_Expression returns [EObject current=null] : iv_ruleLogical_Expression= ruleLogical_Expression EOF ;
    public final EObject entryRuleLogical_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2390:2: (iv_ruleLogical_Expression= ruleLogical_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2391:2: iv_ruleLogical_Expression= ruleLogical_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_Expression_in_entryRuleLogical_Expression4521);
            iv_ruleLogical_Expression=ruleLogical_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical_Expression4531); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogical_Expression"


    // $ANTLR start "ruleLogical_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2398:1: ruleLogical_Expression returns [EObject current=null] : ( (otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= ruleTRUE ) ) | ( (lv_false_3_0= ruleFALSE ) ) ) ;
    public final EObject ruleLogical_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        AntlrDatatypeRuleToken lv_true_2_0 = null;

        AntlrDatatypeRuleToken lv_false_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2401:28: ( ( (otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= ruleTRUE ) ) | ( (lv_false_3_0= ruleFALSE ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:1: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= ruleTRUE ) ) | ( (lv_false_3_0= ruleFALSE ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:1: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= ruleTRUE ) ) | ( (lv_false_3_0= ruleFALSE ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt41=1;
                }
                break;
            case 49:
                {
                alt41=2;
                }
                break;
            case 48:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2402:4: otherlv_0= '!' ( (lv_expression_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleLogical_Expression4569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getLogical_ExpressionAccess().getExclamationMarkKeyword_0_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2406:1: ( (lv_expression_1_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2407:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2407:1: (lv_expression_1_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2408:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_ExpressionAccess().getExpressionExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLogical_Expression4590);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_ExpressionRule());
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:6: ( (lv_true_2_0= ruleTRUE ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2425:6: ( (lv_true_2_0= ruleTRUE ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2426:1: (lv_true_2_0= ruleTRUE )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2426:1: (lv_true_2_0= ruleTRUE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2427:3: lv_true_2_0= ruleTRUE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_ExpressionAccess().getTrueTRUEParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTRUE_in_ruleLogical_Expression4618);
                    lv_true_2_0=ruleTRUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"true",
                              		lv_true_2_0, 
                              		"TRUE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2444:6: ( (lv_false_3_0= ruleFALSE ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2444:6: ( (lv_false_3_0= ruleFALSE ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2445:1: (lv_false_3_0= ruleFALSE )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2445:1: (lv_false_3_0= ruleFALSE )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2446:3: lv_false_3_0= ruleFALSE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_ExpressionAccess().getFalseFALSEParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFALSE_in_ruleLogical_Expression4645);
                    lv_false_3_0=ruleFALSE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"false",
                              		lv_false_3_0, 
                              		"FALSE");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleLogical_Expression"


    // $ANTLR start "entryRuleFALSE"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2470:1: entryRuleFALSE returns [String current=null] : iv_ruleFALSE= ruleFALSE EOF ;
    public final String entryRuleFALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFALSE = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2471:2: (iv_ruleFALSE= ruleFALSE EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2472:2: iv_ruleFALSE= ruleFALSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFALSERule()); 
            }
            pushFollow(FOLLOW_ruleFALSE_in_entryRuleFALSE4682);
            iv_ruleFALSE=ruleFALSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFALSE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFALSE4693); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFALSE"


    // $ANTLR start "ruleFALSE"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2479:1: ruleFALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleFALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2482:28: (kw= 'false' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2484:2: kw= 'false'
            {
            kw=(Token)match(input,48,FOLLOW_48_in_ruleFALSE4730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFALSEAccess().getFalseKeyword()); 
                  
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
    // $ANTLR end "ruleFALSE"


    // $ANTLR start "entryRuleTRUE"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2497:1: entryRuleTRUE returns [String current=null] : iv_ruleTRUE= ruleTRUE EOF ;
    public final String entryRuleTRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTRUE = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2498:2: (iv_ruleTRUE= ruleTRUE EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2499:2: iv_ruleTRUE= ruleTRUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTRUERule()); 
            }
            pushFollow(FOLLOW_ruleTRUE_in_entryRuleTRUE4770);
            iv_ruleTRUE=ruleTRUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTRUE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTRUE4781); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTRUE"


    // $ANTLR start "ruleTRUE"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2506:1: ruleTRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2509:28: (kw= 'true' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2511:2: kw= 'true'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleTRUE4818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTRUEAccess().getTrueKeyword()); 
                  
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
    // $ANTLR end "ruleTRUE"


    // $ANTLR start "entryRuleArg_List"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2524:1: entryRuleArg_List returns [EObject current=null] : iv_ruleArg_List= ruleArg_List EOF ;
    public final EObject entryRuleArg_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg_List = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2525:2: (iv_ruleArg_List= ruleArg_List EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2526:2: iv_ruleArg_List= ruleArg_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArg_ListRule()); 
            }
            pushFollow(FOLLOW_ruleArg_List_in_entryRuleArg_List4857);
            iv_ruleArg_List=ruleArg_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArg_List; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg_List4867); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2533:1: ruleArg_List returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArg_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2536:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2537:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2537:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2537:2: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2537:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2538:1: (lv_expression_0_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2538:1: (lv_expression_0_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2539:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArg_List4913);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2555:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2555:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleArg_List4926); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArg_ListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2559:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2560:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2560:1: (lv_expressions_2_0= ruleExpression )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2561:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArg_List4947);
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
            	    break loop42;
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


    // $ANTLR start "entryRuleNumeric_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2585:1: entryRuleNumeric_Expression returns [EObject current=null] : iv_ruleNumeric_Expression= ruleNumeric_Expression EOF ;
    public final EObject entryRuleNumeric_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Expression = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2586:2: (iv_ruleNumeric_Expression= ruleNumeric_Expression EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2587:2: iv_ruleNumeric_Expression= ruleNumeric_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumeric_Expression_in_entryRuleNumeric_Expression4985);
            iv_ruleNumeric_Expression=ruleNumeric_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Expression4995); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumeric_Expression"


    // $ANTLR start "ruleNumeric_Expression"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2594:1: ruleNumeric_Expression returns [EObject current=null] : ( ( ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNumeric_Expression() throws RecognitionException {
        EObject current = null;

        Token lv_sinal_0_1=null;
        Token lv_sinal_0_2=null;
        Token lv_sinal_0_3=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2597:28: ( ( ( ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2598:1: ( ( ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2598:1: ( ( ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2598:2: ( ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2598:2: ( ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2599:1: ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2599:1: ( (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2600:1: (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2600:1: (lv_sinal_0_1= RULE_MINUS | lv_sinal_0_2= RULE_INCREMENT | lv_sinal_0_3= RULE_DECREMENT )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_MINUS:
                {
                alt43=1;
                }
                break;
            case RULE_INCREMENT:
                {
                alt43=2;
                }
                break;
            case RULE_DECREMENT:
                {
                alt43=3;
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2601:3: lv_sinal_0_1= RULE_MINUS
                    {
                    lv_sinal_0_1=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleNumeric_Expression5039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_0_1, grammarAccess.getNumeric_ExpressionAccess().getSinalMINUSTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal",
                              		lv_sinal_0_1, 
                              		"MINUS");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2616:8: lv_sinal_0_2= RULE_INCREMENT
                    {
                    lv_sinal_0_2=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_ruleNumeric_Expression5059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_0_2, grammarAccess.getNumeric_ExpressionAccess().getSinalINCREMENTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal",
                              		lv_sinal_0_2, 
                              		"INCREMENT");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2631:8: lv_sinal_0_3= RULE_DECREMENT
                    {
                    lv_sinal_0_3=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleNumeric_Expression5079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_0_3, grammarAccess.getNumeric_ExpressionAccess().getSinalDECREMENTTerminalRuleCall_0_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal",
                              		lv_sinal_0_3, 
                              		"DECREMENT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2649:2: ( (lv_expression_1_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2650:1: (lv_expression_1_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2650:1: (lv_expression_1_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2651:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_ExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNumeric_Expression5108);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_ExpressionRule());
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
    // $ANTLR end "ruleNumeric_Expression"


    // $ANTLR start "entryRuleType"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2675:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2676:2: (iv_ruleType= ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2677:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType5144);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType5154); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2684:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2687:28: ( ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2688:1: ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2688:1: ( ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2688:2: ( (lv_name_0_0= ruleType_specifier ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2688:2: ( (lv_name_0_0= ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2689:1: (lv_name_0_0= ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2689:1: (lv_name_0_0= ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2690:3: lv_name_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType5200);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2706:2: ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==35) ) {
                    alt44=1;
                }
                else if ( (LA44_0==37) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2706:3: (otherlv_1= '[' otherlv_2= ']' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2706:3: (otherlv_1= '[' otherlv_2= ']' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2706:5: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleType5214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleType5226); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2715:7: otherlv_3= '[]'
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleType5245); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2727:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2728:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2729:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier5284);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier5295); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2736:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_8 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2739:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2740:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2740:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            int alt45=9;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt45=1;
                }
                break;
            case 51:
                {
                alt45=2;
                }
                break;
            case 52:
                {
                alt45=3;
                }
                break;
            case 53:
                {
                alt45=4;
                }
                break;
            case 54:
                {
                alt45=5;
                }
                break;
            case 55:
                {
                alt45=6;
                }
                break;
            case 56:
                {
                alt45=7;
                }
                break;
            case 57:
                {
                alt45=8;
                }
                break;
            case RULE_ID:
                {
                alt45=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2741:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleType_specifier5333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2748:2: kw= 'byte'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleType_specifier5352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2755:2: kw= 'char'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleType_specifier5371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2762:2: kw= 'short'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleType_specifier5390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2769:2: kw= 'int'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleType_specifier5409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2776:2: kw= 'float'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleType_specifier5428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2783:2: kw= 'long'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleType_specifier5447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2790:2: kw= 'double'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleType_specifier5466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2797:5: this_Class_name_8= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier5494);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2815:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2816:2: (iv_ruleModifier= ruleModifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2817:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier5540);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier5551); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2824:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2827:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2828:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2828:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_MOD) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_STATIC) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2828:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier5591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2836:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier5617); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2851:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2852:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2853:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer5662);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer5672); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2860:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2863:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2864:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2864:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2864:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2864:2: ( (lv_static_0_0= RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2865:1: (lv_static_0_0= RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2865:1: (lv_static_0_0= RULE_STATIC )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2866:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer5714); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2882:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2883:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2883:1: (lv_name_1_0= ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2884:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer5740);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2908:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2909:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2910:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block5776);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block5786); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2917:1: ruleStatement_block returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2920:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2921:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2921:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2921:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2921:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2922:2: 
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleStatement_block5835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2934:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||(LA47_0>=RULE_MOD && LA47_0<=RULE_TRY)||LA47_0==25||LA47_0==29||(LA47_0>=50 && LA47_0<=60)||(LA47_0>=62 && LA47_0<=64)||(LA47_0>=67 && LA47_0<=70)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2935:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2935:1: (lv_statements_2_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2936:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block5856);
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
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleStatement_block5869); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2964:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2965:2: (iv_ruleStatement= ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2966:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement5905);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement5915); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2973:1: ruleStatement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) ) | (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' ) | this_Statement_block_18= ruleStatement_block | ( (lv_try_19_0= ruleTry_statement ) ) | ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_name_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token lv_name_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token lv_name_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject lv_variable_0_0 = null;

        EObject lv_ifStatement_1_0 = null;

        EObject lv_doStatement_2_0 = null;

        EObject lv_whileStatement_3_0 = null;

        EObject lv_forStatement_4_0 = null;

        EObject lv_switchStatement_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_statement_10_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_expression_16_0 = null;

        EObject this_Statement_block_18 = null;

        EObject lv_try_19_0 = null;

        EObject lv_statement_22_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2976:28: ( ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) ) | (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' ) | this_Statement_block_18= ruleStatement_block | ( (lv_try_19_0= ruleTry_statement ) ) | ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2977:1: ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) ) | (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' ) | this_Statement_block_18= ruleStatement_block | ( (lv_try_19_0= ruleTry_statement ) ) | ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2977:1: ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) ) | (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' ) | this_Statement_block_18= ruleStatement_block | ( (lv_try_19_0= ruleTry_statement ) ) | ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) )
            int alt51=15;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2977:2: ( (lv_variable_0_0= ruleVariable_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2977:2: ( (lv_variable_0_0= ruleVariable_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2978:1: (lv_variable_0_0= ruleVariable_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2978:1: (lv_variable_0_0= ruleVariable_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2979:3: lv_variable_0_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariableVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleStatement5961);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2996:6: ( (lv_ifStatement_1_0= ruleIf_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2996:6: ( (lv_ifStatement_1_0= ruleIf_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2997:1: (lv_ifStatement_1_0= ruleIf_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2997:1: (lv_ifStatement_1_0= ruleIf_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2998:3: lv_ifStatement_1_0= ruleIf_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_StatementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_Statement_in_ruleStatement5988);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3015:6: ( (lv_doStatement_2_0= ruleDo_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3015:6: ( (lv_doStatement_2_0= ruleDo_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3016:1: (lv_doStatement_2_0= ruleDo_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3016:1: (lv_doStatement_2_0= ruleDo_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3017:3: lv_doStatement_2_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDo_Statement_in_ruleStatement6015);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3034:6: ( (lv_whileStatement_3_0= ruleWhile_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3034:6: ( (lv_whileStatement_3_0= ruleWhile_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3035:1: (lv_whileStatement_3_0= ruleWhile_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3035:1: (lv_whileStatement_3_0= ruleWhile_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3036:3: lv_whileStatement_3_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_Statement_in_ruleStatement6042);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3053:6: ( (lv_forStatement_4_0= ruleFor_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3053:6: ( (lv_forStatement_4_0= ruleFor_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3054:1: (lv_forStatement_4_0= ruleFor_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3054:1: (lv_forStatement_4_0= ruleFor_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3055:3: lv_forStatement_4_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_Statement_in_ruleStatement6069);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3072:6: ( (lv_switchStatement_5_0= ruleSwitch_Statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3072:6: ( (lv_switchStatement_5_0= ruleSwitch_Statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3073:1: (lv_switchStatement_5_0= ruleSwitch_Statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3073:1: (lv_switchStatement_5_0= ruleSwitch_Statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3074:3: lv_switchStatement_5_0= ruleSwitch_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitch_Statement_in_ruleStatement6096);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3091:6: (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3091:6: (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3091:8: otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleStatement6115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSynchronizedKeyword_6_0());
                          
                    }
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleStatement6127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3099:1: ( (lv_expression_8_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3100:1: (lv_expression_8_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3100:1: (lv_expression_8_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3101:3: lv_expression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement6148);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleStatement6160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getRightParenthesisKeyword_6_3());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3121:1: ( (lv_statement_10_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3122:1: (lv_statement_10_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3122:1: (lv_statement_10_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3123:3: lv_statement_10_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_6_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement6181);
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
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3140:6: ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3140:6: ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3140:7: () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3140:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3141:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3149:2: (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3149:4: otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';'
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleStatement6214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getReturnKeyword_7_1_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3153:1: ( (lv_expression_13_0= ruleExpression ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL_DIGITS)||(LA48_0>=RULE_HEXA && LA48_0<=RULE_DECREMENT)||LA48_0==33||(LA48_0>=39 && LA48_0<=41)||(LA48_0>=45 && LA48_0<=49)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3154:1: (lv_expression_13_0= ruleExpression )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3154:1: (lv_expression_13_0= ruleExpression )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3155:3: lv_expression_13_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_7_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleStatement6235);
                            lv_expression_13_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
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
                            break;

                    }

                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleStatement6248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3176:6: (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3176:6: (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3176:8: otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';'
                    {
                    otherlv_15=(Token)match(input,60,FOLLOW_60_in_ruleStatement6269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getThrowKeyword_8_0());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3180:1: ( (lv_expression_16_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3181:1: (lv_expression_16_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3181:1: (lv_expression_16_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3182:3: lv_expression_16_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement6290);
                    lv_expression_16_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_16_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleStatement6302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getSemicolonKeyword_8_2());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3204:2: this_Statement_block_18= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleStatement6334);
                    this_Statement_block_18=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_block_18; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3216:6: ( (lv_try_19_0= ruleTry_statement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3216:6: ( (lv_try_19_0= ruleTry_statement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3217:1: (lv_try_19_0= ruleTry_statement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3217:1: (lv_try_19_0= ruleTry_statement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3218:3: lv_try_19_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryTry_statementParserRuleCall_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTry_statement_in_ruleStatement6360);
                    lv_try_19_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"try",
                              		lv_try_19_0, 
                              		"Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3235:6: ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3235:6: ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3235:7: ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3235:7: ( (lv_name_20_0= RULE_ID ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3236:1: (lv_name_20_0= RULE_ID )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3236:1: (lv_name_20_0= RULE_ID )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3237:3: lv_name_20_0= RULE_ID
                    {
                    lv_name_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement6384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_20_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_11_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_20_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,61,FOLLOW_61_in_ruleStatement6401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getColonKeyword_11_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3257:1: ( (lv_statement_22_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3258:1: (lv_statement_22_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3258:1: (lv_statement_22_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3259:3: lv_statement_22_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement6422);
                    lv_statement_22_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_22_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:6: ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:6: ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:7: () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3276:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3277:2: 
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

                    otherlv_24=(Token)match(input,62,FOLLOW_62_in_ruleStatement6454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getBreakKeyword_12_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3289:1: ( (lv_name_25_0= RULE_ID ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3290:1: (lv_name_25_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3290:1: (lv_name_25_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3291:3: lv_name_25_0= RULE_ID
                            {
                            lv_name_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement6471); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_25_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_12_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_25_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_26=(Token)match(input,25,FOLLOW_25_in_ruleStatement6489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getSemicolonKeyword_12_3());
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:6: ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:6: ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:7: () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3312:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3313:2: 
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

                    otherlv_28=(Token)match(input,63,FOLLOW_63_in_ruleStatement6521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getStatementAccess().getContinueKeyword_13_1());
                          
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3325:1: ( (lv_name_29_0= RULE_ID ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3326:1: (lv_name_29_0= RULE_ID )
                            {
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3326:1: (lv_name_29_0= RULE_ID )
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3327:3: lv_name_29_0= RULE_ID
                            {
                            lv_name_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement6538); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_29_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_13_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_29_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,25,FOLLOW_25_in_ruleStatement6556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getSemicolonKeyword_13_3());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3348:6: ( () otherlv_32= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3348:6: ( () otherlv_32= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3348:7: () otherlv_32= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3348:7: ()
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3349:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_14_0(),
                                  current);
                          
                    }

                    }

                    otherlv_32=(Token)match(input,25,FOLLOW_25_in_ruleStatement6588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStatementAccess().getSemicolonKeyword_14_1());
                          
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3369:1: entryRuleSwitch_Statement returns [EObject current=null] : iv_ruleSwitch_Statement= ruleSwitch_Statement EOF ;
    public final EObject entryRuleSwitch_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3370:2: (iv_ruleSwitch_Statement= ruleSwitch_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3371:2: iv_ruleSwitch_Statement= ruleSwitch_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_Statement_in_entryRuleSwitch_Statement6625);
            iv_ruleSwitch_Statement=ruleSwitch_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_Statement6635); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3378:1: ruleSwitch_Statement returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' ) | (otherlv_9= 'default' otherlv_10= ':' ) | ( (lv_statements_11_0= ruleStatement ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleSwitch_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expressions_7_0 = null;

        EObject lv_statements_11_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3381:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' ) | (otherlv_9= 'default' otherlv_10= ':' ) | ( (lv_statements_11_0= ruleStatement ) ) )* otherlv_12= '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3382:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' ) | (otherlv_9= 'default' otherlv_10= ':' ) | ( (lv_statements_11_0= ruleStatement ) ) )* otherlv_12= '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3382:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' ) | (otherlv_9= 'default' otherlv_10= ':' ) | ( (lv_statements_11_0= ruleStatement ) ) )* otherlv_12= '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3382:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' ) | (otherlv_9= 'default' otherlv_10= ':' ) | ( (lv_statements_11_0= ruleStatement ) ) )* otherlv_12= '}'
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3382:2: ()
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3383:2: 
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

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleSwitch_Statement6684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_StatementAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSwitch_Statement6696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitch_StatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3399:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3400:1: (lv_expression_3_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3400:1: (lv_expression_3_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3401:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch_Statement6717);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleSwitch_Statement6729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitch_StatementAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleSwitch_Statement6741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSwitch_StatementAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3425:1: ( (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' ) | (otherlv_9= 'default' otherlv_10= ':' ) | ( (lv_statements_11_0= ruleStatement ) ) )*
            loop52:
            do {
                int alt52=4;
                switch ( input.LA(1) ) {
                case 65:
                    {
                    alt52=1;
                    }
                    break;
                case 66:
                    {
                    alt52=2;
                    }
                    break;
                case RULE_ID:
                case RULE_MOD:
                case RULE_STATIC:
                case RULE_TRY:
                case 25:
                case 29:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 62:
                case 63:
                case 64:
                case 67:
                case 68:
                case 69:
                case 70:
                    {
                    alt52=3;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3425:2: (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3425:2: (otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3425:4: otherlv_6= 'case' ( (lv_expressions_7_0= ruleExpression ) ) otherlv_8= ':'
            	    {
            	    otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleSwitch_Statement6755); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSwitch_StatementAccess().getCaseKeyword_6_0_0());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3429:1: ( (lv_expressions_7_0= ruleExpression ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3430:1: (lv_expressions_7_0= ruleExpression )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3430:1: (lv_expressions_7_0= ruleExpression )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3431:3: lv_expressions_7_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getExpressionsExpressionParserRuleCall_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSwitch_Statement6776);
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

            	    otherlv_8=(Token)match(input,61,FOLLOW_61_in_ruleSwitch_Statement6788); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSwitch_StatementAccess().getColonKeyword_6_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3452:6: (otherlv_9= 'default' otherlv_10= ':' )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3452:6: (otherlv_9= 'default' otherlv_10= ':' )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3452:8: otherlv_9= 'default' otherlv_10= ':'
            	    {
            	    otherlv_9=(Token)match(input,66,FOLLOW_66_in_ruleSwitch_Statement6808); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitch_StatementAccess().getDefaultKeyword_6_1_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,61,FOLLOW_61_in_ruleSwitch_Statement6820); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getSwitch_StatementAccess().getColonKeyword_6_1_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3461:6: ( (lv_statements_11_0= ruleStatement ) )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3461:6: ( (lv_statements_11_0= ruleStatement ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3462:1: (lv_statements_11_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3462:1: (lv_statements_11_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3463:3: lv_statements_11_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_StatementAccess().getStatementsStatementParserRuleCall_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitch_Statement6848);
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
            	    break loop52;
                }
            } while (true);

            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleSwitch_Statement6862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSwitch_StatementAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3491:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3492:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3493:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement6898);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor_Statement6908); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3500:1: ruleFor_Statement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pv_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression2_6_0 = null;

        EObject lv_expression3_8_0 = null;

        EObject lv_statement_11_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3503:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3504:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3504:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3504:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleFor_Statement6945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_StatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleFor_Statement6957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFor_StatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3512:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3512:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3512:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3513:1: (lv_variable_2_0= ruleVariable_declaration )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3513:1: (lv_variable_2_0= ruleVariable_declaration )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3514:3: lv_variable_2_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleFor_Statement6979);
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
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3531:6: ( (lv_pv_3_0= ';' ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3531:6: ( (lv_pv_3_0= ';' ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3532:1: (lv_pv_3_0= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3532:1: (lv_pv_3_0= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3533:3: lv_pv_3_0= ';'
                    {
                    lv_pv_3_0=(Token)match(input,25,FOLLOW_25_in_ruleFor_Statement7003); if (state.failed) return current;
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
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3547:6: ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3547:6: ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3547:7: ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3547:7: ( (lv_expression_4_0= ruleExpression ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3548:1: (lv_expression_4_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3548:1: (lv_expression_4_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3549:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpressionExpressionParserRuleCall_2_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement7044);
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

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleFor_Statement7056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2_2_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3569:3: ( (lv_expression2_6_0= ruleExpression ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL_DIGITS)||(LA54_0>=RULE_HEXA && LA54_0<=RULE_DECREMENT)||LA54_0==33||(LA54_0>=39 && LA54_0<=41)||(LA54_0>=45 && LA54_0<=49)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3570:1: (lv_expression2_6_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3570:1: (lv_expression2_6_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3571:3: lv_expression2_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression2ExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement7079);
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

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleFor_Statement7092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_4());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3591:1: ( (lv_expression3_8_0= ruleExpression ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_DECIMAL_DIGITS)||(LA55_0>=RULE_HEXA && LA55_0<=RULE_DECREMENT)||LA55_0==33||(LA55_0>=39 && LA55_0<=41)||(LA55_0>=45 && LA55_0<=49)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3592:1: (lv_expression3_8_0= ruleExpression )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3592:1: (lv_expression3_8_0= ruleExpression )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3593:3: lv_expression3_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression3ExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement7113);
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

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleFor_Statement7126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleFor_Statement7138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFor_StatementAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3617:1: ( (lv_statement_11_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3618:1: (lv_statement_11_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3618:1: (lv_statement_11_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3619:3: lv_statement_11_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getStatementStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor_Statement7159);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3643:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3644:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3645:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement7195);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement7205); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3652:1: ruleWhile_Statement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3655:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3656:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3656:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3656:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleWhile_Statement7242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_StatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleWhile_Statement7254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_StatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3664:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3665:1: (lv_expression_2_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3665:1: (lv_expression_2_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3666:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile_Statement7275);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleWhile_Statement7287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3686:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3687:1: (lv_statement_4_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3687:1: (lv_statement_4_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3688:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile_Statement7308);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3712:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3713:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3714:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement7344);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement7354); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3721:1: ruleDo_Statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_statement_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3724:28: ( (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3725:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3725:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3725:3: otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleDo_Statement7391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_StatementAccess().getDoKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3729:1: ( (lv_statement_1_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3730:1: (lv_statement_1_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3730:1: (lv_statement_1_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3731:3: lv_statement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDo_Statement7412);
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

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleDo_Statement7424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_StatementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDo_Statement7436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDo_StatementAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3755:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3756:1: (lv_expression_4_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3756:1: (lv_expression_4_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3757:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDo_Statement7457);
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

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleDo_Statement7469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_StatementAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleDo_Statement7481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDo_StatementAccess().getSemicolonKeyword_6());
                  
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3789:1: entryRuleIf_Statement returns [EObject current=null] : iv_ruleIf_Statement= ruleIf_Statement EOF ;
    public final EObject entryRuleIf_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_Statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3790:2: (iv_ruleIf_Statement= ruleIf_Statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3791:2: iv_ruleIf_Statement= ruleIf_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_Statement_in_entryRuleIf_Statement7517);
            iv_ruleIf_Statement=ruleIf_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_Statement7527); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3798:1: ruleIf_Statement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_statement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3801:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3802:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3802:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3802:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleIf_Statement7564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_StatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleIf_Statement7576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIf_StatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3810:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3811:1: (lv_expression_2_0= ruleExpression )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3811:1: (lv_expression_2_0= ruleExpression )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3812:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_StatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf_Statement7597);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleIf_Statement7609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIf_StatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3832:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3833:1: (lv_statement_4_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3833:1: (lv_statement_4_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3834:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_StatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf_Statement7630);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==71) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred112_InternalJava()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleIf_Statement7651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIf_StatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3855:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3856:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3856:1: (lv_elseStatement_6_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3857:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_StatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf_Statement7673);
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


    // $ANTLR start "entryRuleTry_statement"
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3881:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3882:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3883:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement7711);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement7721); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3890:1: ruleTry_statement returns [EObject current=null] : ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3893:28: ( ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3894:1: ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3894:1: ( ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3894:2: ( (lv_try_0_0= RULE_TRY ) ) ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )* ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3894:2: ( (lv_try_0_0= RULE_TRY ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3895:1: (lv_try_0_0= RULE_TRY )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3895:1: (lv_try_0_0= RULE_TRY )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3896:3: lv_try_0_0= RULE_TRY
            {
            lv_try_0_0=(Token)match(input,RULE_TRY,FOLLOW_RULE_TRY_in_ruleTry_statement7763); if (state.failed) return current;
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3912:2: ( (lv_tryStatement_1_0= ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3913:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3913:1: (lv_tryStatement_1_0= ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3914:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement7789);
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:2: ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_CATCH) ) {
                    int LA57_2 = input.LA(2);

                    if ( (synpred114_InternalJava()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:4: ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3936:1: (lv_catchs_2_0= RULE_CATCH )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3937:3: lv_catchs_2_0= RULE_CATCH
            	    {
            	    lv_catchs_2_0=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_ruleTry_statement7818); if (state.failed) return current;
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

            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleTry_statement7835); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3957:1: ( (lv_parameters_4_0= ruleParameter ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3958:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3958:1: (lv_parameters_4_0= ruleParameter )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3959:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTry_statement7856);
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

            	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleTry_statement7868); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3());
            	          
            	    }
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3979:1: ( (lv_catchStatements_6_0= ruleStatement ) )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3980:1: (lv_catchStatements_6_0= ruleStatement )
            	    {
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3980:1: (lv_catchStatements_6_0= ruleStatement )
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3981:3: lv_catchStatements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement7889);
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
            	    break loop57;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:4: ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_FINALLY) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred116_InternalJava()) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:6: ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4003:1: (lv_finally_7_0= RULE_FINALLY )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4004:3: lv_finally_7_0= RULE_FINALLY
                    {
                    lv_finally_7_0=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_ruleTry_statement7920); if (state.failed) return current;
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

                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4020:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4021:1: (lv_finallyStatement_8_0= ruleStatement )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4021:1: (lv_finallyStatement_8_0= ruleStatement )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4022:3: lv_finallyStatement_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement7946);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4046:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4047:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4048:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement7984);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement7994); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4055:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4058:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4059:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4059:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4059:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_rulePackage_statement8031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4063:1: ( (lv_name_1_0= rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4064:1: (lv_name_1_0= rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4064:1: (lv_name_1_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4065:3: lv_name_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement8052);
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_rulePackage_statement8064); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4093:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4094:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4095:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name8101);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name8112); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4102:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_aux_1 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4105:28: ( (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4106:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4106:1: (this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4106:6: this_ID_0= RULE_ID this_Package_name_aux_1= rulePackage_name_aux
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name8152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_rulePackage_name8179);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4132:1: entryRulePackage_name_aux returns [String current=null] : iv_rulePackage_name_aux= rulePackage_name_aux EOF ;
    public final String entryRulePackage_name_aux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_aux = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4133:2: (iv_rulePackage_name_aux= rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4134:2: iv_rulePackage_name_aux= rulePackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux8225);
            iv_rulePackage_name_aux=rulePackage_name_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_aux.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux8236); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4141:1: rulePackage_name_aux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_aux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4144:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4145:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4145:1: (kw= '.' this_ID_1= RULE_ID )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==42) ) {
                    int LA59_2 = input.LA(2);

                    if ( (LA59_2==RULE_ID) ) {
                        int LA59_3 = input.LA(3);

                        if ( (synpred117_InternalJava()) ) {
                            alt59=1;
                        }


                    }


                }


                switch (alt59) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4146:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_rulePackage_name_aux8274); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_aux8289); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4166:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4167:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4168:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement8335);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement8345); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4175:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) ) ;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4178:28: ( (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:1: (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:1: (otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4179:3: otherlv_0= 'import' ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleImport_statement8382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4183:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4183:2: ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4183:2: ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4183:3: ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4183:3: ( (lv_classname_1_0= ruleClass_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4184:1: (lv_classname_1_0= ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4184:1: (lv_classname_1_0= ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4185:3: lv_classname_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement8405);
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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleImport_statement8417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4206:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4206:6: ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4206:7: ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4206:7: ( (lv_packagename_3_0= rulePackage_name ) )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4207:1: (lv_packagename_3_0= rulePackage_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4207:1: (lv_packagename_3_0= rulePackage_name )
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4208:3: lv_packagename_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement8446);
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

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleImport_statement8458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopKeyword_1_1_1());
                          
                    }
                    otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleImport_statement8470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getImport_statementAccess().getAsteriskKeyword_1_1_2());
                          
                    }
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleImport_statement8482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_1_3());
                          
                    }
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleImport_statement8494); if (state.failed) return current;
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4248:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4249:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4250:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name8533);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name8544); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4257:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4260:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4262:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name8590);
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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4280:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4281:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4282:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name8635);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name8646); if (state.failed) return current;

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
    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4289:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4292:28: (this_Package_name_0= rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4294:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name8692);
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

    // $ANTLR start synpred47_InternalJava
    public final void synpred47_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux1_3_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:2: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:3: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:3: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:4: ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')'
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:4: ( ( '(' )=>otherlv_0= '(' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1672:5: ( '(' )=>otherlv_0= '('
        {
        otherlv_0=(Token)match(input,33,FOLLOW_33_in_synpred47_InternalJava3121); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1677:2: ( (lv_argList_1_0= ruleArg_List ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1678:1: (lv_argList_1_0= ruleArg_List )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1678:1: (lv_argList_1_0= ruleArg_List )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1679:3: lv_argList_1_0= ruleArg_List
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArg_List_in_synpred47_InternalJava3143);
        lv_argList_1_0=ruleArg_List();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,34,FOLLOW_34_in_synpred47_InternalJava3155); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1699:2: ( (lv_aux1_3_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1700:1: (lv_aux1_3_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1700:1: (lv_aux1_3_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1701:3: lv_aux1_3_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux1Expression_auxParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred47_InternalJava3177);
        lv_aux1_3_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred47_InternalJava

    // $ANTLR start synpred49_InternalJava
    public final void synpred49_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression2_5_0 = null;

        EObject lv_aux2_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:6: ( ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:6: ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:6: ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:7: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:7: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:8: ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']'
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:8: ( ( '[' )=>otherlv_4= '[' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1718:9: ( '[' )=>otherlv_4= '['
        {
        otherlv_4=(Token)match(input,35,FOLLOW_35_in_synpred49_InternalJava3206); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1723:2: ( (lv_expression2_5_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1724:1: (lv_expression2_5_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1724:1: (lv_expression2_5_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1725:3: lv_expression2_5_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred49_InternalJava3228);
        lv_expression2_5_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,36,FOLLOW_36_in_synpred49_InternalJava3240); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1745:2: ( (lv_aux2_7_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1746:1: (lv_aux2_7_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1746:1: (lv_aux2_7_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1747:3: lv_aux2_7_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux2Expression_auxParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred49_InternalJava3262);
        lv_aux2_7_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred49_InternalJava

    // $ANTLR start synpred51_InternalJava
    public final void synpred51_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        EObject lv_expression2_9_0 = null;

        EObject lv_aux3_10_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:6: ( ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:6: ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:6: ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:7: ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:7: ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:8: ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:8: ( ( '.' )=>otherlv_8= '.' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1764:9: ( '.' )=>otherlv_8= '.'
        {
        otherlv_8=(Token)match(input,42,FOLLOW_42_in_synpred51_InternalJava3291); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1769:2: ( (lv_expression2_9_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1770:1: (lv_expression2_9_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1770:1: (lv_expression2_9_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1771:3: lv_expression2_9_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred51_InternalJava3313);
        lv_expression2_9_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1787:3: ( (lv_aux3_10_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1788:1: (lv_aux3_10_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1788:1: (lv_aux3_10_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1789:3: lv_aux3_10_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux3Expression_auxParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred51_InternalJava3335);
        lv_aux3_10_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalJava

    // $ANTLR start synpred53_InternalJava
    public final void synpred53_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        EObject lv_expression_12_0 = null;

        EObject lv_aux4_13_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:6: ( ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:6: ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:6: ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:7: ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:7: ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:8: ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:8: ( ( ',' )=>otherlv_11= ',' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1806:9: ( ',' )=>otherlv_11= ','
        {
        otherlv_11=(Token)match(input,28,FOLLOW_28_in_synpred53_InternalJava3364); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1811:2: ( (lv_expression_12_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1812:1: (lv_expression_12_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1812:1: (lv_expression_12_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1813:3: lv_expression_12_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionExpressionParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred53_InternalJava3386);
        lv_expression_12_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1829:3: ( (lv_aux4_13_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1830:1: (lv_aux4_13_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1830:1: (lv_aux4_13_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1831:3: lv_aux4_13_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux4Expression_auxParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred53_InternalJava3408);
        lv_aux4_13_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred53_InternalJava

    // $ANTLR start synpred55_InternalJava
    public final void synpred55_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux5_16_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:6: ( ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:6: ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:6: ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:7: ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:7: ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:8: ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:8: ( ( 'instanceof' )=>otherlv_14= 'instanceof' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1848:9: ( 'instanceof' )=>otherlv_14= 'instanceof'
        {
        otherlv_14=(Token)match(input,43,FOLLOW_43_in_synpred55_InternalJava3437); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1853:2: ( (lv_name_15_0= ruleClass_name ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1854:1: (lv_name_15_0= ruleClass_name )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1854:1: (lv_name_15_0= ruleClass_name )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1855:3: lv_name_15_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleClass_name_in_synpred55_InternalJava3459);
        lv_name_15_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1871:3: ( (lv_aux5_16_0= ruleExpression_aux ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1872:1: (lv_aux5_16_0= ruleExpression_aux )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1872:1: (lv_aux5_16_0= ruleExpression_aux )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1873:3: lv_aux5_16_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAux5Expression_auxParserRuleCall_4_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred55_InternalJava3481);
        lv_aux5_16_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred55_InternalJava

    // $ANTLR start synpred62_InternalJava
    public final void synpred62_InternalJava_fragment() throws RecognitionException {   
        Token lv_exp_0_0=null;
        Token otherlv_1=null;
        Token lv_exp1_2_0=null;
        Token otherlv_3=null;

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:2: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? ) )
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( (LA68_0==RULE_HEXA) ) {
            alt68=1;
        }
        else if ( (LA68_0==RULE_DECIMAL_DIGITS) ) {
            alt68=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 68, 0, input);

            throw nvae;
        }
        switch (alt68) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )? )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:4: ( (lv_exp_0_0= RULE_HEXA ) ) (otherlv_1= 'l' )?
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2017:4: ( (lv_exp_0_0= RULE_HEXA ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2018:1: (lv_exp_0_0= RULE_HEXA )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2018:1: (lv_exp_0_0= RULE_HEXA )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2019:3: lv_exp_0_0= RULE_HEXA
                {
                lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_synpred62_InternalJava3764); if (state.failed) return ;

                }


                }

                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2035:2: (otherlv_1= 'l' )?
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==44) ) {
                    alt66=1;
                }
                switch (alt66) {
                    case 1 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2035:4: otherlv_1= 'l'
                        {
                        otherlv_1=(Token)match(input,44,FOLLOW_44_in_synpred62_InternalJava3782); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )? )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (otherlv_3= 'l' )?
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2040:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2041:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2041:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2042:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                {
                lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_synpred62_InternalJava3809); if (state.failed) return ;

                }


                }

                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2058:2: (otherlv_3= 'l' )?
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==44) ) {
                    alt67=1;
                }
                switch (alt67) {
                    case 1 :
                        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2058:4: otherlv_3= 'l'
                        {
                        otherlv_3=(Token)match(input,44,FOLLOW_44_in_synpred62_InternalJava3827); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred62_InternalJava

    // $ANTLR start synpred63_InternalJava
    public final void synpred63_InternalJava_fragment() throws RecognitionException {   
        EObject lv_exp2_4_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2063:6: ( ( (lv_exp2_4_0= ruleFloat_Literal ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2063:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2063:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2064:1: (lv_exp2_4_0= ruleFloat_Literal )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2064:1: (lv_exp2_4_0= ruleFloat_Literal )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2065:3: lv_exp2_4_0= ruleFloat_Literal
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleFloat_Literal_in_synpred63_InternalJava3858);
        lv_exp2_4_0=ruleFloat_Literal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred63_InternalJava

    // $ANTLR start synpred65_InternalJava
    public final void synpred65_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:2: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')'
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2144:3: ( (lv_className_1_0= ruleClass_name ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2145:1: (lv_className_1_0= ruleClass_name )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2145:1: (lv_className_1_0= ruleClass_name )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2146:3: lv_className_1_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleClass_name_in_synpred65_InternalJava4020);
        lv_className_1_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,33,FOLLOW_33_in_synpred65_InternalJava4032); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2166:1: ( (lv_argList_3_0= ruleArg_List ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2167:1: (lv_argList_3_0= ruleArg_List )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2167:1: (lv_argList_3_0= ruleArg_List )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2168:3: lv_argList_3_0= ruleArg_List
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArg_List_in_synpred65_InternalJava4053);
        lv_argList_3_0=ruleArg_List();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,34,FOLLOW_34_in_synpred65_InternalJava4065); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred65_InternalJava

    // $ANTLR start synpred66_InternalJava
    public final void synpred66_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expression_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2207:4: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2207:4: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
        {
        otherlv_6=(Token)match(input,35,FOLLOW_35_in_synpred66_InternalJava4107); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2211:1: ( (lv_expression_7_0= ruleExpression ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2212:1: (lv_expression_7_0= ruleExpression )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2212:1: (lv_expression_7_0= ruleExpression )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2213:3: lv_expression_7_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred66_InternalJava4128);
        lv_expression_7_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,36,FOLLOW_36_in_synpred66_InternalJava4140); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalJava

    // $ANTLR start synpred69_InternalJava
    public final void synpred69_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:6: ( ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )*
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2189:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2190:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2190:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2191:3: lv_typeSpecifier_5_0= ruleType_specifier
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleType_specifier_in_synpred69_InternalJava4094);
        lv_typeSpecifier_5_0=ruleType_specifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2207:2: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )?
        int alt69=2;
        int LA69_0 = input.LA(1);

        if ( (LA69_0==35) ) {
            int LA69_1 = input.LA(2);

            if ( ((LA69_1>=RULE_ID && LA69_1<=RULE_DECIMAL_DIGITS)||(LA69_1>=RULE_HEXA && LA69_1<=RULE_DECREMENT)||LA69_1==33||(LA69_1>=39 && LA69_1<=41)||(LA69_1>=45 && LA69_1<=49)) ) {
                alt69=1;
            }
        }
        switch (alt69) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2207:4: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
                {
                otherlv_6=(Token)match(input,35,FOLLOW_35_in_synpred69_InternalJava4107); if (state.failed) return ;
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2211:1: ( (lv_expression_7_0= ruleExpression ) )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2212:1: (lv_expression_7_0= ruleExpression )
                {
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2212:1: (lv_expression_7_0= ruleExpression )
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2213:3: lv_expression_7_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred69_InternalJava4128);
                lv_expression_7_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_8=(Token)match(input,36,FOLLOW_36_in_synpred69_InternalJava4140); if (state.failed) return ;

                }
                break;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:3: ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )*
        loop70:
        do {
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==35) ) {
                alt70=1;
            }
            else if ( (LA70_0==37) ) {
                alt70=2;
            }


            switch (alt70) {
        	case 1 :
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:4: (otherlv_9= '[' otherlv_10= ']' )
        	    {
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:4: (otherlv_9= '[' otherlv_10= ']' )
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2233:6: otherlv_9= '[' otherlv_10= ']'
        	    {
        	    otherlv_9=(Token)match(input,35,FOLLOW_35_in_synpred69_InternalJava4156); if (state.failed) return ;
        	    otherlv_10=(Token)match(input,36,FOLLOW_36_in_synpred69_InternalJava4168); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:2242:7: otherlv_11= '[]'
        	    {
        	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_synpred69_InternalJava4187); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop70;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred69_InternalJava

    // $ANTLR start synpred107_InternalJava
    public final void synpred107_InternalJava_fragment() throws RecognitionException {   
        EObject lv_variable_2_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3512:2: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3512:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3512:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3513:1: (lv_variable_2_0= ruleVariable_declaration )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3513:1: (lv_variable_2_0= ruleVariable_declaration )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3514:3: lv_variable_2_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_declaration_in_synpred107_InternalJava6979);
        lv_variable_2_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred107_InternalJava

    // $ANTLR start synpred112_InternalJava
    public final void synpred112_InternalJava_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseStatement_6_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:3: ( ( 'else' )=>otherlv_5= 'else' )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3850:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,71,FOLLOW_71_in_synpred112_InternalJava7651); if (state.failed) return ;

        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3855:2: ( (lv_elseStatement_6_0= ruleStatement ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3856:1: (lv_elseStatement_6_0= ruleStatement )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3856:1: (lv_elseStatement_6_0= ruleStatement )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3857:3: lv_elseStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIf_StatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred112_InternalJava7673);
        lv_elseStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred112_InternalJava

    // $ANTLR start synpred114_InternalJava
    public final void synpred114_InternalJava_fragment() throws RecognitionException {   
        Token lv_catchs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatements_6_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:3: ( ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catchStatements_6_0= ruleStatement ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:3: ( ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3930:4: ( ( RULE_CATCH ) )=> (lv_catchs_2_0= RULE_CATCH )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3936:1: (lv_catchs_2_0= RULE_CATCH )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3937:3: lv_catchs_2_0= RULE_CATCH
        {
        lv_catchs_2_0=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_synpred114_InternalJava7818); if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,33,FOLLOW_33_in_synpred114_InternalJava7835); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3957:1: ( (lv_parameters_4_0= ruleParameter ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3958:1: (lv_parameters_4_0= ruleParameter )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3958:1: (lv_parameters_4_0= ruleParameter )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3959:3: lv_parameters_4_0= ruleParameter
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameter_in_synpred114_InternalJava7856);
        lv_parameters_4_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,34,FOLLOW_34_in_synpred114_InternalJava7868); if (state.failed) return ;
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3979:1: ( (lv_catchStatements_6_0= ruleStatement ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3980:1: (lv_catchStatements_6_0= ruleStatement )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3980:1: (lv_catchStatements_6_0= ruleStatement )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3981:3: lv_catchStatements_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred114_InternalJava7889);
        lv_catchStatements_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred114_InternalJava

    // $ANTLR start synpred116_InternalJava
    public final void synpred116_InternalJava_fragment() throws RecognitionException {   
        Token lv_finally_7_0=null;
        EObject lv_finallyStatement_8_0 = null;


        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:5: ( ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) ) ( (lv_finallyStatement_8_0= ruleStatement ) )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:5: ( ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:3997:6: ( ( RULE_FINALLY ) )=> (lv_finally_7_0= RULE_FINALLY )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4003:1: (lv_finally_7_0= RULE_FINALLY )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4004:3: lv_finally_7_0= RULE_FINALLY
        {
        lv_finally_7_0=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_synpred116_InternalJava7920); if (state.failed) return ;

        }


        }

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4020:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4021:1: (lv_finallyStatement_8_0= ruleStatement )
        {
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4021:1: (lv_finallyStatement_8_0= ruleStatement )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4022:3: lv_finallyStatement_8_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred116_InternalJava7946);
        lv_finallyStatement_8_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred116_InternalJava

    // $ANTLR start synpred117_InternalJava
    public final void synpred117_InternalJava_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_1=null;

        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4146:2: (kw= '.' this_ID_1= RULE_ID )
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:4146:2: kw= '.' this_ID_1= RULE_ID
        {
        kw=(Token)match(input,42,FOLLOW_42_in_synpred117_InternalJava8274); if (state.failed) return ;
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred117_InternalJava8289); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_InternalJava

    // Delegated rules

    public final boolean synpred69_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalJava_fragment(); // can never throw exception
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
    public final boolean synpred49_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalJava_fragment(); // can never throw exception
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
    public final boolean synpred63_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalJava_fragment(); // can never throw exception
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
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\17\2\uffff";
    static final String DFA5_maxS =
        "\3\37\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\11\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\11\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\11\uffff\1\4\4\uffff\1\3",
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
    static final String DFA15_eotS =
        "\25\uffff";
    static final String DFA15_eofS =
        "\25\uffff";
    static final String DFA15_minS =
        "\14\5\1\44\1\5\1\31\1\uffff\2\5\2\uffff\1\5";
    static final String DFA15_maxS =
        "\3\71\10\45\1\52\1\44\1\45\1\46\1\uffff\1\5\1\45\2\uffff\1\52";
    static final String DFA15_acceptS =
        "\17\uffff\1\2\2\uffff\1\1\1\3\1\uffff";
    static final String DFA15_specialS =
        "\25\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\13\11\uffff\1\1\1\2\41\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\11\uffff\1\1\1\2\41\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\11\uffff\1\1\1\2\41\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\16\33\uffff\1\17\1\uffff\1\14\1\uffff\1\15\4\uffff\1\20",
            "\1\21",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "\1\22\2\uffff\1\22\4\uffff\1\23\1\uffff\1\22\1\uffff\2\22",
            "",
            "\1\24",
            "\1\16\35\uffff\1\14\1\uffff\1\15",
            "",
            "",
            "\1\16\35\uffff\1\14\1\uffff\1\15\4\uffff\1\20"
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
            return "573:3: ( ( (lv_name_1_0= ruleVariable_declaration ) ) | ( (lv_name_2_0= ruleConstructor_declaration ) ) | ( (lv_name_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA29_eotS =
        "\13\uffff";
    static final String DFA29_eofS =
        "\13\uffff";
    static final String DFA29_minS =
        "\1\5\12\uffff";
    static final String DFA29_maxS =
        "\1\61\12\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA29_specialS =
        "\13\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\12\1\6\2\uffff\3\6\3\1\22\uffff\1\4\5\uffff\1\7\1\10\1\11\3\uffff\1\5\1\3\3\2",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1279:1: ( ( ( (lv_numericExpression_0_0= ruleNumeric_Expression ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleLiteral_Expression ) ) )=> ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= 'null' ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= 'super' ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= 'this' ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )";
        }
    }
    static final String DFA30_eotS =
        "\14\uffff";
    static final String DFA30_eofS =
        "\1\6\13\uffff";
    static final String DFA30_minS =
        "\1\31\5\0\6\uffff";
    static final String DFA30_maxS =
        "\1\75\5\0\6\uffff";
    static final String DFA30_acceptS =
        "\6\uffff\1\6\1\1\1\2\1\3\1\4\1\5";
    static final String DFA30_specialS =
        "\1\uffff\1\3\1\4\1\2\1\0\1\1\6\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\6\2\uffff\1\4\4\uffff\1\1\1\6\1\2\1\6\5\uffff\1\3\1\5\21\uffff\1\6",
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
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1672:1: ( ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_argList_1_0= ruleArg_List ) ) otherlv_2= ')' ) ( (lv_aux1_3_0= ruleExpression_aux ) ) ) | ( ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux2_7_0= ruleExpression_aux ) ) ) | ( ( ( ( '.' )=>otherlv_8= '.' ) ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux3_10_0= ruleExpression_aux ) ) ) | ( ( ( ( ',' )=>otherlv_11= ',' ) ( (lv_expression_12_0= ruleExpression ) ) ) ( (lv_aux4_13_0= ruleExpression_aux ) ) ) | ( ( ( ( 'instanceof' )=>otherlv_14= 'instanceof' ) ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux5_16_0= ruleExpression_aux ) ) ) | () )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalJava()) ) {s = 10;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalJava()) ) {s = 11;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalJava()) ) {s = 9;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalJava()) ) {s = 7;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalJava()) ) {s = 8;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\14\uffff";
    static final String DFA40_eofS =
        "\14\uffff";
    static final String DFA40_minS =
        "\1\5\1\0\12\uffff";
    static final String DFA40_maxS =
        "\1\71\1\0\12\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\7\uffff\1\3\1\1";
    static final String DFA40_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\33\uffff\1\12\20\uffff\10\2",
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
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2144:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= '(' ( (lv_argList_3_0= ruleArg_List ) ) otherlv_4= ')' ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )? ( (otherlv_9= '[' otherlv_10= ']' ) | otherlv_11= '[]' )* ) | (otherlv_12= '(' ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalJava()) ) {s = 11;}

                        else if ( (synpred69_InternalJava()) ) {s = 2;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\15\uffff";
    static final String DFA38_eofS =
        "\1\2\14\uffff";
    static final String DFA38_minS =
        "\1\31\1\0\13\uffff";
    static final String DFA38_maxS =
        "\1\75\1\0\13\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\11\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\2\2\uffff\1\2\4\uffff\2\2\1\1\2\2\4\uffff\2\2\21\uffff\1\2",
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2207:2: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalJava()) ) {s = 12;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\21\uffff";
    static final String DFA51_eofS =
        "\21\uffff";
    static final String DFA51_minS =
        "\1\5\1\uffff\1\5\16\uffff";
    static final String DFA51_maxS =
        "\1\106\1\uffff\1\75\16\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\15\1\16\1\17\1\14";
    static final String DFA51_specialS =
        "\21\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\11\uffff\2\1\1\14\7\uffff\1\17\3\uffff\1\13\24\uffff\10\1\1\10\1\11\1\12\1\uffff\1\15\1\16\1\7\2\uffff\1\6\1\5\1\4\1\3",
            "",
            "\1\1\35\uffff\1\1\1\uffff\1\1\4\uffff\1\1\22\uffff\1\20",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2977:1: ( ( (lv_variable_0_0= ruleVariable_declaration ) ) | ( (lv_ifStatement_1_0= ruleIf_Statement ) ) | ( (lv_doStatement_2_0= ruleDo_Statement ) ) | ( (lv_whileStatement_3_0= ruleWhile_Statement ) ) | ( (lv_forStatement_4_0= ruleFor_Statement ) ) | ( (lv_switchStatement_5_0= ruleSwitch_Statement ) ) | (otherlv_6= 'synchronized' otherlv_7= '(' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ( (lv_statement_10_0= ruleStatement ) ) ) | ( () (otherlv_12= 'return' ( (lv_expression_13_0= ruleExpression ) )? otherlv_14= ';' ) ) | (otherlv_15= 'throw' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ';' ) | this_Statement_block_18= ruleStatement_block | ( (lv_try_19_0= ruleTry_statement ) ) | ( ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) )";
        }
    }
    static final String DFA53_eotS =
        "\21\uffff";
    static final String DFA53_eofS =
        "\21\uffff";
    static final String DFA53_minS =
        "\1\5\1\uffff\1\5\2\uffff\13\5\1\0";
    static final String DFA53_maxS =
        "\1\71\1\uffff\1\53\2\uffff\2\61\1\53\2\61\1\53\2\61\1\53\2\61\1\0";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\14\uffff";
    static final String DFA53_specialS =
        "\20\uffff\1\0}>";
    static final String[] DFA53_transitionS = {
            "\1\2\1\4\2\uffff\6\4\2\1\10\uffff\1\3\7\uffff\1\4\5\uffff\3\4\3\uffff\5\4\10\1",
            "",
            "\1\1\23\uffff\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\5\1\uffff\1\1\4\uffff\1\6\1\4",
            "",
            "",
            "\2\4\2\uffff\6\4\22\uffff\1\4\2\uffff\1\1\2\uffff\3\4\3\uffff\5\4",
            "\1\7\1\4\2\uffff\6\4\22\uffff\1\4\5\uffff\3\4\3\uffff\5\4",
            "\1\1\23\uffff\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\10\1\uffff\1\1\4\uffff\1\11\1\4",
            "\2\4\2\uffff\6\4\22\uffff\1\4\2\uffff\1\1\2\uffff\3\4\3\uffff\5\4",
            "\1\12\1\4\2\uffff\6\4\22\uffff\1\4\5\uffff\3\4\3\uffff\5\4",
            "\1\1\23\uffff\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\13\1\uffff\1\1\4\uffff\1\14\1\4",
            "\2\4\2\uffff\6\4\22\uffff\1\4\2\uffff\1\1\2\uffff\3\4\3\uffff\5\4",
            "\1\15\1\4\2\uffff\6\4\22\uffff\1\4\5\uffff\3\4\3\uffff\5\4",
            "\1\1\23\uffff\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\16\1\uffff\1\1\4\uffff\1\17\1\4",
            "\2\4\2\uffff\6\4\22\uffff\1\4\2\uffff\1\1\2\uffff\3\4\3\uffff\5\4",
            "\1\20\1\4\2\uffff\6\4\22\uffff\1\4\5\uffff\3\4\3\uffff\5\4",
            "\1\uffff"
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
            return "3512:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | ( (lv_pv_3_0= ';' ) ) | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_16 = input.LA(1);

                         
                        int index53_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred107_InternalJava()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_16);
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
    static final String DFA60_eotS =
        "\6\uffff";
    static final String DFA60_eofS =
        "\6\uffff";
    static final String DFA60_minS =
        "\1\5\1\31\1\5\2\uffff\1\31";
    static final String DFA60_maxS =
        "\1\5\1\52\1\112\2\uffff\1\52";
    static final String DFA60_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA60_specialS =
        "\6\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\5\104\uffff\1\4",
            "",
            "",
            "\1\3\20\uffff\1\2"
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "4183:1: ( ( ( (lv_classname_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_packagename_3_0= rulePackage_name ) ) otherlv_4= '.' otherlv_5= '*' otherlv_6= ';' otherlv_7= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleHead136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit239 = new BitSet(new long[]{0x0000000084018012L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit261 = new BitSet(new long[]{0x0000000084018012L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit283 = new BitSet(new long[]{0x0000000084018012L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration372 = new BitSet(new long[]{0x0000000084018010L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration400 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration427 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleType_declaration440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface_declaration532 = new BitSet(new long[]{0x0000000004018000L});
    public static final BitSet FOLLOW_26_in_ruleInterface_declaration545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration562 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_27_in_ruleInterface_declaration580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration601 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleInterface_declaration614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration635 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleInterface_declaration651 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInterface_declaration663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass_declaration755 = new BitSet(new long[]{0x0000000080018000L});
    public static final BitSet FOLLOW_31_in_ruleClass_declaration768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration785 = new BitSet(new long[]{0x0000000128000000L});
    public static final BitSet FOLLOW_27_in_ruleClass_declaration803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration824 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_32_in_ruleClass_declaration839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration860 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleClass_declaration873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration894 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleClass_declaration910 = new BitSet(new long[]{0x03FC000042018030L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration931 = new BitSet(new long[]{0x03FC000042018030L});
    public static final BitSet FOLLOW_30_in_ruleClass_declaration944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1033 = new BitSet(new long[]{0x03FC000000018030L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleField_declaration1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod_declaration1273 = new BitSet(new long[]{0x03FC000000018020L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1312 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMethod_declaration1329 = new BitSet(new long[]{0x03FC000400018020L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1350 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMethod_declaration1363 = new BitSet(new long[]{0x0000002822000000L});
    public static final BitSet FOLLOW_35_in_ruleMethod_declaration1377 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMethod_declaration1389 = new BitSet(new long[]{0x0000002822000000L});
    public static final BitSet FOLLOW_37_in_ruleMethod_declaration1408 = new BitSet(new long[]{0x0000002822000000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMethod_declaration1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructor_declaration1562 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1580 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleConstructor_declaration1597 = new BitSet(new long[]{0x03FC000400018020L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1618 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleConstructor_declaration1631 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1744 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleParameter_list1757 = new BitSet(new long[]{0x03FC000000018020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1778 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1889 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_35_in_ruleParameter1908 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleParameter1920 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_37_in_ruleParameter1939 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariable_declaration2033 = new BitSet(new long[]{0x03FC000000018020L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration2055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2076 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_28_in_ruleVariable_declaration2089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2110 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable_declaration2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2212 = new BitSet(new long[]{0x0000006800000002L});
    public static final BitSet FOLLOW_35_in_ruleVariable_declarator2231 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVariable_declarator2243 = new BitSet(new long[]{0x0000006800000002L});
    public static final BitSet FOLLOW_37_in_ruleVariable_declarator2262 = new BitSet(new long[]{0x0000006800000002L});
    public static final BitSet FOLLOW_38_in_ruleVariable_declarator2277 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleVariable_declarator2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_entryRuleVariable_initializer2336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_initializer2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable_initializer2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_in_ruleExpression2483 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_Expression_in_ruleExpression2533 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Expression_in_ruleExpression2583 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_Expression_in_ruleExpression2646 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreating_Expression_in_ruleExpression2710 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_ruleExpression2774 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExpression2822 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpression2882 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExpression2942 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression3001 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_entryRuleExpression_aux3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_aux3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleExpression_aux3121 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleArg_List_in_ruleExpression_aux3143 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleExpression_aux3155 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExpression_aux3206 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux3228 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExpression_aux3240 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleExpression_aux3291 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux3313 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleExpression_aux3364 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux3386 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleExpression_aux3437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleExpression_aux3459 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_entryRuleFloat_Literal3536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat_Literal3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal3588 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFloat_Literal3605 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal3622 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_RULE_EXPOENT_PART_in_ruleFloat_Literal3645 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_SUFIX_in_ruleFloat_Literal3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_entryRuleLiteral_Expression3710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral_Expression3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_ruleLiteral_Expression3764 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleLiteral_Expression3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleLiteral_Expression3809 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleLiteral_Expression3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_ruleLiteral_Expression3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral_Expression3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleLiteral_Expression3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreating_Expression_in_entryRuleCreating_Expression3950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreating_Expression3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCreating_Expression3997 = new BitSet(new long[]{0x03FC000200018020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleCreating_Expression4020 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCreating_Expression4032 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleArg_List_in_ruleCreating_Expression4053 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCreating_Expression4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleCreating_Expression4094 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_35_in_ruleCreating_Expression4107 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreating_Expression4128 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCreating_Expression4140 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_35_in_ruleCreating_Expression4156 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCreating_Expression4168 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_37_in_ruleCreating_Expression4187 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_33_in_ruleCreating_Expression4209 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreating_Expression4230 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCreating_Expression4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_Expression_in_entryRuleCast_Expression4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast_Expression4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCast_Expression4327 = new BitSet(new long[]{0x03FC000000018020L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast_Expression4348 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCast_Expression4360 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCast_Expression4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Expression_in_entryRuleBit_Expression4417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Expression4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBit_Expression4464 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBit_Expression4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_Expression_in_entryRuleLogical_Expression4521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical_Expression4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLogical_Expression4569 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogical_Expression4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRUE_in_ruleLogical_Expression4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFALSE_in_ruleLogical_Expression4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFALSE_in_entryRuleFALSE4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFALSE4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFALSE4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRUE_in_entryRuleTRUE4770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTRUE4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTRUE4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_List_in_entryRuleArg_List4857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg_List4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg_List4913 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleArg_List4926 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg_List4947 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_in_entryRuleNumeric_Expression4985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Expression4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleNumeric_Expression5039 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_ruleNumeric_Expression5059 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleNumeric_Expression5079 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNumeric_Expression5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType5144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType5200 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_35_in_ruleType5214 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleType5226 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_37_in_ruleType5245 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier5284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleType_specifier5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleType_specifier5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleType_specifier5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleType_specifier5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleType_specifier5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleType_specifier5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleType_specifier5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleType_specifier5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier5540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_ruleModifier5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleModifier5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer5662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleStatic_initializer5714 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block5776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStatement_block5835 = new BitSet(new long[]{0xDFFC000062038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block5856 = new BitSet(new long[]{0xDFFC000062038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_30_in_ruleStatement_block5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement5905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleStatement5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_Statement_in_ruleStatement5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_ruleStatement6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_ruleStatement6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_ruleStatement6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_Statement_in_ruleStatement6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleStatement6115 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStatement6127 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement6148 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleStatement6160 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleStatement6214 = new BitSet(new long[]{0x0003E38202007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement6235 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatement6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStatement6269 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement6290 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatement6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatement6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_ruleStatement6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement6384 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleStatement6401 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleStatement6454 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement6471 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatement6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStatement6521 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement6538 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatement6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStatement6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_Statement_in_entryRuleSwitch_Statement6625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_Statement6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSwitch_Statement6684 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSwitch_Statement6696 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch_Statement6717 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSwitch_Statement6729 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSwitch_Statement6741 = new BitSet(new long[]{0xDFFC000062038020L,0x000000000000007FL});
    public static final BitSet FOLLOW_65_in_ruleSwitch_Statement6755 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch_Statement6776 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleSwitch_Statement6788 = new BitSet(new long[]{0xDFFC000062038020L,0x000000000000007FL});
    public static final BitSet FOLLOW_66_in_ruleSwitch_Statement6808 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleSwitch_Statement6820 = new BitSet(new long[]{0xDFFC000062038020L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitch_Statement6848 = new BitSet(new long[]{0xDFFC000062038020L,0x000000000000007FL});
    public static final BitSet FOLLOW_30_in_ruleSwitch_Statement6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor_Statement6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFor_Statement6945 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFor_Statement6957 = new BitSet(new long[]{0x03FFE3820201FE60L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleFor_Statement6979 = new BitSet(new long[]{0x0003E38202007E60L});
    public static final BitSet FOLLOW_25_in_ruleFor_Statement7003 = new BitSet(new long[]{0x0003E38202007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement7044 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFor_Statement7056 = new BitSet(new long[]{0x0003E38202007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement7079 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFor_Statement7092 = new BitSet(new long[]{0x0003E38202007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement7113 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFor_Statement7126 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFor_Statement7138 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor_Statement7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement7195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleWhile_Statement7242 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWhile_Statement7254 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile_Statement7275 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleWhile_Statement7287 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile_Statement7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement7344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDo_Statement7391 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo_Statement7412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDo_Statement7424 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDo_Statement7436 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDo_Statement7457 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDo_Statement7469 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDo_Statement7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_Statement_in_entryRuleIf_Statement7517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_Statement7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleIf_Statement7564 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIf_Statement7576 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf_Statement7597 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIf_Statement7609 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_Statement7630 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleIf_Statement7651 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_Statement7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement7711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRY_in_ruleTry_statement7763 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement7789 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_ruleTry_statement7818 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTry_statement7835 = new BitSet(new long[]{0x03FC000000018020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTry_statement7856 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTry_statement7868 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement7889 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_ruleTry_statement7920 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement7984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePackage_statement8031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement8052 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePackage_statement8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name8101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name8152 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rulePackage_name8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux8225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePackage_name_aux8274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_aux8289 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement8335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement8345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleImport_statement8382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement8405 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleImport_statement8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement8446 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleImport_statement8458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleImport_statement8470 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleImport_statement8482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleImport_statement8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name8533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name8635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred47_InternalJava3121 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleArg_List_in_synpred47_InternalJava3143 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred47_InternalJava3155 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred47_InternalJava3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred49_InternalJava3206 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred49_InternalJava3228 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred49_InternalJava3240 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred49_InternalJava3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred51_InternalJava3291 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred51_InternalJava3313 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred51_InternalJava3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred53_InternalJava3364 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred53_InternalJava3386 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred53_InternalJava3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred55_InternalJava3437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_synpred55_InternalJava3459 = new BitSet(new long[]{0x00000C0A10000000L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred55_InternalJava3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_synpred62_InternalJava3764 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_synpred62_InternalJava3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_synpred62_InternalJava3809 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_synpred62_InternalJava3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_synpred63_InternalJava3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_synpred65_InternalJava4020 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred65_InternalJava4032 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleArg_List_in_synpred65_InternalJava4053 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred65_InternalJava4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred66_InternalJava4107 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred66_InternalJava4128 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred66_InternalJava4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_synpred69_InternalJava4094 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_35_in_synpred69_InternalJava4107 = new BitSet(new long[]{0x0003E38200007E60L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred69_InternalJava4128 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred69_InternalJava4140 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_35_in_synpred69_InternalJava4156 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred69_InternalJava4168 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_37_in_synpred69_InternalJava4187 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_synpred107_InternalJava6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred112_InternalJava7651 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred112_InternalJava7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_synpred114_InternalJava7818 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred114_InternalJava7835 = new BitSet(new long[]{0x03FC000000018020L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred114_InternalJava7856 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred114_InternalJava7868 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred114_InternalJava7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_synpred116_InternalJava7920 = new BitSet(new long[]{0xDFFC000022038020L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred116_InternalJava7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred117_InternalJava8274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred117_InternalJava8289 = new BitSet(new long[]{0x0000000000000002L});

}