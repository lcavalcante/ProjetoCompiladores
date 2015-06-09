package org.xtext.java.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.java.services.JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MOD", "RULE_STATIC", "RULE_ID", "RULE_DOC_COMMENT", "RULE_TRY", "RULE_CATCH", "RULE_FINALLY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "';'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "':'", "'break'", "'continue'", "'package'", "'.'", "'import'", "'.*;;'"
    };
    public static final int RULE_CATCH=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_TRY=8;
    public static final int RULE_MOD=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=13;
    public static final int RULE_STATIC=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_FINALLY=10;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
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
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g"; }


     
     	private JavaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JavaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleHead"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:61:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:62:1: ( ruleHead EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:63:1: ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead67);
            ruleHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:70:1: ruleHead : ( ( rule__Head__ElementsAssignment ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:74:2: ( ( ( rule__Head__ElementsAssignment ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:75:1: ( ( rule__Head__ElementsAssignment ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:75:1: ( ( rule__Head__ElementsAssignment ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:76:1: ( rule__Head__ElementsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadAccess().getElementsAssignment()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:77:1: ( rule__Head__ElementsAssignment )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:77:2: rule__Head__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Head__ElementsAssignment_in_ruleHead100);
            rule__Head__ElementsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleCompilation_unit"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:89:1: entryRuleCompilation_unit : ruleCompilation_unit EOF ;
    public final void entryRuleCompilation_unit() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:90:1: ( ruleCompilation_unit EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:91:1: ruleCompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit127);
            ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompilation_unit"


    // $ANTLR start "ruleCompilation_unit"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:98:1: ruleCompilation_unit : ( ( rule__Compilation_unit__Group__0 ) ) ;
    public final void ruleCompilation_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:102:2: ( ( ( rule__Compilation_unit__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:103:1: ( ( rule__Compilation_unit__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:103:1: ( ( rule__Compilation_unit__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:104:1: ( rule__Compilation_unit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:105:1: ( rule__Compilation_unit__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:105:2: rule__Compilation_unit__Group__0
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0_in_ruleCompilation_unit160);
            rule__Compilation_unit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:117:1: entryRuleType_declaration : ruleType_declaration EOF ;
    public final void entryRuleType_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:118:1: ( ruleType_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:119:1: ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration187);
            ruleType_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_declaration"


    // $ANTLR start "ruleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:126:1: ruleType_declaration : ( ( rule__Type_declaration__Group__0 ) ) ;
    public final void ruleType_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:130:2: ( ( ( rule__Type_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:131:1: ( ( rule__Type_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:131:1: ( ( rule__Type_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:132:1: ( rule__Type_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:133:1: ( rule__Type_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:133:2: rule__Type_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0_in_ruleType_declaration220);
            rule__Type_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:145:1: entryRuleInterface_declaration : ruleInterface_declaration EOF ;
    public final void entryRuleInterface_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:146:1: ( ruleInterface_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:147:1: ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration247);
            ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface_declaration"


    // $ANTLR start "ruleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:154:1: ruleInterface_declaration : ( ( rule__Interface_declaration__Group__0 ) ) ;
    public final void ruleInterface_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:158:2: ( ( ( rule__Interface_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:159:1: ( ( rule__Interface_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:159:1: ( ( rule__Interface_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:160:1: ( rule__Interface_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:161:1: ( rule__Interface_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:161:2: rule__Interface_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0_in_ruleInterface_declaration280);
            rule__Interface_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:173:1: entryRuleClass_declaration : ruleClass_declaration EOF ;
    public final void entryRuleClass_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:174:1: ( ruleClass_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:175:1: ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration307);
            ruleClass_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass_declaration"


    // $ANTLR start "ruleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:182:1: ruleClass_declaration : ( ( rule__Class_declaration__Group__0 ) ) ;
    public final void ruleClass_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:186:2: ( ( ( rule__Class_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:187:1: ( ( rule__Class_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:187:1: ( ( rule__Class_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:188:1: ( rule__Class_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:189:1: ( rule__Class_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:189:2: rule__Class_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0_in_ruleClass_declaration340);
            rule__Class_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:201:1: entryRuleField_declaration : ruleField_declaration EOF ;
    public final void entryRuleField_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:202:1: ( ruleField_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:203:1: ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration367);
            ruleField_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField_declaration"


    // $ANTLR start "ruleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:210:1: ruleField_declaration : ( ( rule__Field_declaration__Alternatives ) ) ;
    public final void ruleField_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:214:2: ( ( ( rule__Field_declaration__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:215:1: ( ( rule__Field_declaration__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:215:1: ( ( rule__Field_declaration__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:216:1: ( rule__Field_declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:217:1: ( rule__Field_declaration__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:217:2: rule__Field_declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_in_ruleField_declaration400);
            rule__Field_declaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:229:1: entryRuleMethod_declaration : ruleMethod_declaration EOF ;
    public final void entryRuleMethod_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:230:1: ( ruleMethod_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:231:1: ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration427);
            ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod_declaration"


    // $ANTLR start "ruleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:238:1: ruleMethod_declaration : ( ( rule__Method_declaration__Group__0 ) ) ;
    public final void ruleMethod_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:242:2: ( ( ( rule__Method_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:243:1: ( ( rule__Method_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:243:1: ( ( rule__Method_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:244:1: ( rule__Method_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:245:1: ( rule__Method_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:245:2: rule__Method_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0_in_ruleMethod_declaration460);
            rule__Method_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:257:1: entryRuleConstructor_declaration : ruleConstructor_declaration EOF ;
    public final void entryRuleConstructor_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:258:1: ( ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:259:1: ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration487);
            ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor_declaration"


    // $ANTLR start "ruleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:266:1: ruleConstructor_declaration : ( ( rule__Constructor_declaration__Group__0 ) ) ;
    public final void ruleConstructor_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:270:2: ( ( ( rule__Constructor_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:271:1: ( ( rule__Constructor_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:271:1: ( ( rule__Constructor_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:272:1: ( rule__Constructor_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:273:1: ( rule__Constructor_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:273:2: rule__Constructor_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration520);
            rule__Constructor_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:285:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:286:1: ( ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:287:1: ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list547);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:294:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:298:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:299:1: ( ( rule__Parameter_list__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:299:1: ( ( rule__Parameter_list__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:300:1: ( rule__Parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:301:1: ( rule__Parameter_list__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:301:2: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list580);
            rule__Parameter_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:313:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:314:1: ( ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:315:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter607);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:322:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:326:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:327:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:327:1: ( ( rule__Parameter__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:328:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:329:1: ( rule__Parameter__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:329:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter640);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:341:1: entryRuleVariable_declaration : ruleVariable_declaration EOF ;
    public final void entryRuleVariable_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:342:1: ( ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:343:1: ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration667);
            ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable_declaration"


    // $ANTLR start "ruleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:350:1: ruleVariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void ruleVariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:354:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:355:1: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:355:1: ( ( rule__Variable_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:356:1: ( rule__Variable_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:357:1: ( rule__Variable_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:357:2: rule__Variable_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration700);
            rule__Variable_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:369:1: entryRuleVariable_declarator : ruleVariable_declarator EOF ;
    public final void entryRuleVariable_declarator() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:370:1: ( ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:371:1: ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator727);
            ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable_declarator"


    // $ANTLR start "ruleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:378:1: ruleVariable_declarator : ( ( rule__Variable_declarator__Group__0 ) ) ;
    public final void ruleVariable_declarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:382:2: ( ( ( rule__Variable_declarator__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:383:1: ( ( rule__Variable_declarator__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:383:1: ( ( rule__Variable_declarator__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:384:1: ( rule__Variable_declarator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:385:1: ( rule__Variable_declarator__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:385:2: rule__Variable_declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator760);
            rule__Variable_declarator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleType"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:397:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:398:1: ( ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:399:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType787);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:406:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:410:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:411:1: ( ( rule__Type__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:411:1: ( ( rule__Type__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:412:1: ( rule__Type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:413:1: ( rule__Type__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:413:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType820);
            rule__Type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:425:1: entryRuleType_specifier : ruleType_specifier EOF ;
    public final void entryRuleType_specifier() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:426:1: ( ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:427:1: ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier847);
            ruleType_specifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_specifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_specifier"


    // $ANTLR start "ruleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:434:1: ruleType_specifier : ( ( rule__Type_specifier__Alternatives ) ) ;
    public final void ruleType_specifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:438:2: ( ( ( rule__Type_specifier__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:439:1: ( ( rule__Type_specifier__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:439:1: ( ( rule__Type_specifier__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:440:1: ( rule__Type_specifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_specifierAccess().getAlternatives()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:441:1: ( rule__Type_specifier__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:441:2: rule__Type_specifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier880);
            rule__Type_specifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_specifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleModifier"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:453:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:454:1: ( ruleModifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:455:1: ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier907);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:462:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:466:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:467:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:467:1: ( ( rule__Modifier__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:468:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:469:1: ( rule__Modifier__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:469:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier940);
            rule__Modifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:481:1: entryRuleStatic_initializer : ruleStatic_initializer EOF ;
    public final void entryRuleStatic_initializer() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:482:1: ( ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:483:1: ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer967);
            ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatic_initializer"


    // $ANTLR start "ruleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:490:1: ruleStatic_initializer : ( ( rule__Static_initializer__Group__0 ) ) ;
    public final void ruleStatic_initializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:494:2: ( ( ( rule__Static_initializer__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:495:1: ( ( rule__Static_initializer__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:495:1: ( ( rule__Static_initializer__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:496:1: ( rule__Static_initializer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:497:1: ( rule__Static_initializer__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:497:2: rule__Static_initializer__Group__0
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer1000);
            rule__Static_initializer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:509:1: entryRuleStatement_block : ruleStatement_block EOF ;
    public final void entryRuleStatement_block() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:510:1: ( ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:511:1: ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block1027);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement_block"


    // $ANTLR start "ruleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:518:1: ruleStatement_block : ( ( rule__Statement_block__Group__0 ) ) ;
    public final void ruleStatement_block() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:522:2: ( ( ( rule__Statement_block__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:523:1: ( ( rule__Statement_block__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:523:1: ( ( rule__Statement_block__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:524:1: ( rule__Statement_block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:525:1: ( rule__Statement_block__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:525:2: rule__Statement_block__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block1060);
            rule__Statement_block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:537:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:538:1: ( ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:539:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1087);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:546:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:550:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:551:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:551:1: ( ( rule__Statement__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:552:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:553:1: ( rule__Statement__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:553:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement1120);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTry_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:565:1: entryRuleTry_statement : ruleTry_statement EOF ;
    public final void entryRuleTry_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:566:1: ( ruleTry_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:567:1: ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement1147);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement1154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTry_statement"


    // $ANTLR start "ruleTry_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:574:1: ruleTry_statement : ( ( rule__Try_statement__Group__0 ) ) ;
    public final void ruleTry_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:578:2: ( ( ( rule__Try_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:579:1: ( ( rule__Try_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:579:1: ( ( rule__Try_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:580:1: ( rule__Try_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:581:1: ( rule__Try_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:581:2: rule__Try_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1180);
            rule__Try_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTry_statement"


    // $ANTLR start "entryRulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:593:1: entryRulePackage_statement : rulePackage_statement EOF ;
    public final void entryRulePackage_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:594:1: ( rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:595:1: rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement1207);
            rulePackage_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage_statement"


    // $ANTLR start "rulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:602:1: rulePackage_statement : ( ( rule__Package_statement__Group__0 ) ) ;
    public final void rulePackage_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:606:2: ( ( ( rule__Package_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:607:1: ( ( rule__Package_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:607:1: ( ( rule__Package_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:608:1: ( rule__Package_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:609:1: ( rule__Package_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:609:2: rule__Package_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1240);
            rule__Package_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:621:1: entryRulePackage_name : rulePackage_name EOF ;
    public final void entryRulePackage_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:622:1: ( rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:623:1: rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name1267);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name1274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage_name"


    // $ANTLR start "rulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:630:1: rulePackage_name : ( ( rule__Package_name__Group__0 ) ) ;
    public final void rulePackage_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:634:2: ( ( ( rule__Package_name__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:635:1: ( ( rule__Package_name__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:635:1: ( ( rule__Package_name__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:636:1: ( rule__Package_name__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:637:1: ( rule__Package_name__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:637:2: rule__Package_name__Group__0
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1300);
            rule__Package_name__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:649:1: entryRulePackage_name_aux : rulePackage_name_aux EOF ;
    public final void entryRulePackage_name_aux() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:650:1: ( rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:651:1: rulePackage_name_aux EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_auxRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux1327);
            rulePackage_name_aux();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_auxRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux1334); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage_name_aux"


    // $ANTLR start "rulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:658:1: rulePackage_name_aux : ( ( rule__Package_name_aux__Group__0 )* ) ;
    public final void rulePackage_name_aux() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:662:2: ( ( ( rule__Package_name_aux__Group__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:663:1: ( ( rule__Package_name_aux__Group__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:663:1: ( ( rule__Package_name_aux__Group__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:664:1: ( rule__Package_name_aux__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_auxAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:665:1: ( rule__Package_name_aux__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:665:2: rule__Package_name_aux__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Package_name_aux__Group__0_in_rulePackage_name_aux1360);
            	    rule__Package_name_aux__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_auxAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage_name_aux"


    // $ANTLR start "entryRuleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:677:1: entryRuleImport_statement : ruleImport_statement EOF ;
    public final void entryRuleImport_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:678:1: ( ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:679:1: ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement1388);
            ruleImport_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement1395); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport_statement"


    // $ANTLR start "ruleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:686:1: ruleImport_statement : ( ( rule__Import_statement__Group__0 ) ) ;
    public final void ruleImport_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:690:2: ( ( ( rule__Import_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:691:1: ( ( rule__Import_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:691:1: ( ( rule__Import_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:692:1: ( rule__Import_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getGroup()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:693:1: ( rule__Import_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:693:2: rule__Import_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1421);
            rule__Import_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:705:1: entryRuleClass_name : ruleClass_name EOF ;
    public final void entryRuleClass_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:706:1: ( ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:707:1: ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name1448);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name1455); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass_name"


    // $ANTLR start "ruleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:714:1: ruleClass_name : ( rulePackage_name ) ;
    public final void ruleClass_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:718:2: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:719:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:719:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:720:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name1481);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:733:1: entryRuleInterface_name : ruleInterface_name EOF ;
    public final void entryRuleInterface_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:734:1: ( ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:735:1: ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name1507);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name1514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface_name"


    // $ANTLR start "ruleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:742:1: ruleInterface_name : ( rulePackage_name ) ;
    public final void ruleInterface_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:746:2: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:747:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:747:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:748:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name1540);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface_name"


    // $ANTLR start "rule__Type_declaration__Alternatives_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:761:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) );
    public final void rule__Type_declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:765:1: ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:766:1: ( ( rule__Type_declaration__NameAssignment_1_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:766:1: ( ( rule__Type_declaration__NameAssignment_1_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:767:1: ( rule__Type_declaration__NameAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getNameAssignment_1_0()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:768:1: ( rule__Type_declaration__NameAssignment_1_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:768:2: rule__Type_declaration__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__NameAssignment_1_0_in_rule__Type_declaration__Alternatives_11575);
                    rule__Type_declaration__NameAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_declarationAccess().getNameAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:772:6: ( ( rule__Type_declaration__NameAssignment_1_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:772:6: ( ( rule__Type_declaration__NameAssignment_1_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:773:1: ( rule__Type_declaration__NameAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getNameAssignment_1_1()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:774:1: ( rule__Type_declaration__NameAssignment_1_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:774:2: rule__Type_declaration__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__NameAssignment_1_1_in_rule__Type_declaration__Alternatives_11593);
                    rule__Type_declaration__NameAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_declarationAccess().getNameAssignment_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Alternatives_1"


    // $ANTLR start "rule__Field_declaration__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:783:1: rule__Field_declaration__Alternatives : ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__NameAssignment_1 ) ) | ( ( rule__Field_declaration__DebugAssignment_2 ) ) );
    public final void rule__Field_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:787:1: ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__NameAssignment_1 ) ) | ( ( rule__Field_declaration__DebugAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_MOD:
            case RULE_ID:
            case RULE_DOC_COMMENT:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt3=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=RULE_MOD && LA3_2<=RULE_ID)||(LA3_2>=15 && LA3_2<=22)) ) {
                    alt3=1;
                }
                else if ( (LA3_2==25) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:788:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:788:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:789:1: ( rule__Field_declaration__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:790:1: ( rule__Field_declaration__Group_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:790:2: rule__Field_declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1626);
                    rule__Field_declaration__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:794:6: ( ( rule__Field_declaration__NameAssignment_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:794:6: ( ( rule__Field_declaration__NameAssignment_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:795:1: ( rule__Field_declaration__NameAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getNameAssignment_1()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:796:1: ( rule__Field_declaration__NameAssignment_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:796:2: rule__Field_declaration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_1_in_rule__Field_declaration__Alternatives1644);
                    rule__Field_declaration__NameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getNameAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:800:6: ( ( rule__Field_declaration__DebugAssignment_2 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:800:6: ( ( rule__Field_declaration__DebugAssignment_2 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:801:1: ( rule__Field_declaration__DebugAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getDebugAssignment_2()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:802:1: ( rule__Field_declaration__DebugAssignment_2 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:802:2: rule__Field_declaration__DebugAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__DebugAssignment_2_in_rule__Field_declaration__Alternatives1662);
                    rule__Field_declaration__DebugAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getDebugAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Alternatives"


    // $ANTLR start "rule__Field_declaration__Alternatives_0_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:811:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_2 ) ) );
    public final void rule__Field_declaration__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:815:1: ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:816:1: ( ( rule__Field_declaration__NameAssignment_0_1_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:816:1: ( ( rule__Field_declaration__NameAssignment_0_1_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:817:1: ( rule__Field_declaration__NameAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_0()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:818:1: ( rule__Field_declaration__NameAssignment_0_1_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:818:2: rule__Field_declaration__NameAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11695);
                    rule__Field_declaration__NameAssignment_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:822:6: ( ( rule__Field_declaration__NameAssignment_0_1_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:822:6: ( ( rule__Field_declaration__NameAssignment_0_1_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:823:1: ( rule__Field_declaration__NameAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_1()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:824:1: ( rule__Field_declaration__NameAssignment_0_1_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:824:2: rule__Field_declaration__NameAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11713);
                    rule__Field_declaration__NameAssignment_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:828:6: ( ( rule__Field_declaration__NameAssignment_0_1_2 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:828:6: ( ( rule__Field_declaration__NameAssignment_0_1_2 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:829:1: ( rule__Field_declaration__NameAssignment_0_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_2()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:830:1: ( rule__Field_declaration__NameAssignment_0_1_2 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:830:2: rule__Field_declaration__NameAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11731);
                    rule__Field_declaration__NameAssignment_0_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Alternatives_0_1"


    // $ANTLR start "rule__Method_declaration__Alternatives_7"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:839:1: rule__Method_declaration__Alternatives_7 : ( ( ( rule__Method_declaration__StatementAssignment_7_0 ) ) | ( ( rule__Method_declaration__DebugAssignment_7_1 ) ) );
    public final void rule__Method_declaration__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:843:1: ( ( ( rule__Method_declaration__StatementAssignment_7_0 ) ) | ( ( rule__Method_declaration__DebugAssignment_7_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:844:1: ( ( rule__Method_declaration__StatementAssignment_7_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:844:1: ( ( rule__Method_declaration__StatementAssignment_7_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:845:1: ( rule__Method_declaration__StatementAssignment_7_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getStatementAssignment_7_0()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:846:1: ( rule__Method_declaration__StatementAssignment_7_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:846:2: rule__Method_declaration__StatementAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__StatementAssignment_7_0_in_rule__Method_declaration__Alternatives_71764);
                    rule__Method_declaration__StatementAssignment_7_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethod_declarationAccess().getStatementAssignment_7_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:850:6: ( ( rule__Method_declaration__DebugAssignment_7_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:850:6: ( ( rule__Method_declaration__DebugAssignment_7_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:851:1: ( rule__Method_declaration__DebugAssignment_7_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getDebugAssignment_7_1()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:852:1: ( rule__Method_declaration__DebugAssignment_7_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:852:2: rule__Method_declaration__DebugAssignment_7_1
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__DebugAssignment_7_1_in_rule__Method_declaration__Alternatives_71782);
                    rule__Method_declaration__DebugAssignment_7_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethod_declarationAccess().getDebugAssignment_7_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Alternatives_7"


    // $ANTLR start "rule__Type_specifier__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:861:1: rule__Type_specifier__Alternatives : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) );
    public final void rule__Type_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:865:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            case 22:
                {
                alt6=8;
                }
                break;
            case RULE_ID:
                {
                alt6=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:866:1: ( 'boolean' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:866:1: ( 'boolean' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:867:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Type_specifier__Alternatives1816); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:874:6: ( 'byte' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:874:6: ( 'byte' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:875:1: 'byte'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Type_specifier__Alternatives1836); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:882:6: ( 'char' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:882:6: ( 'char' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:883:1: 'char'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Type_specifier__Alternatives1856); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:890:6: ( 'short' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:890:6: ( 'short' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:891:1: 'short'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Type_specifier__Alternatives1876); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:898:6: ( 'int' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:898:6: ( 'int' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:899:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Type_specifier__Alternatives1896); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:906:6: ( 'float' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:906:6: ( 'float' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:907:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Type_specifier__Alternatives1916); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:914:6: ( 'long' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:914:6: ( 'long' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:915:1: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Type_specifier__Alternatives1936); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:922:6: ( 'double' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:922:6: ( 'double' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:923:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Type_specifier__Alternatives1956); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:930:6: ( ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:930:6: ( ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:931:1: ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1975);
                    ruleClass_name();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_specifier__Alternatives"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:941:1: rule__Modifier__Alternatives : ( ( RULE_MOD ) | ( RULE_STATIC ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:945:1: ( ( RULE_MOD ) | ( RULE_STATIC ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_MOD) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STATIC) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:946:1: ( RULE_MOD )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:946:1: ( RULE_MOD )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:947:1: RULE_MOD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }
                    match(input,RULE_MOD,FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2007); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:952:6: ( RULE_STATIC )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:952:6: ( RULE_STATIC )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:953:1: RULE_STATIC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2024); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:963:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ( rule__Statement__TryAssignment_1 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:967:1: ( ( ruleStatement_block ) | ( ( rule__Statement__TryAssignment_1 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case RULE_TRY:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:968:1: ( ruleStatement_block )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:968:1: ( ruleStatement_block )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:969:1: ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2056);
                    ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:974:6: ( ( rule__Statement__TryAssignment_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:974:6: ( ( rule__Statement__TryAssignment_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:975:1: ( rule__Statement__TryAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTryAssignment_1()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:976:1: ( rule__Statement__TryAssignment_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:976:2: rule__Statement__TryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Statement__TryAssignment_1_in_rule__Statement__Alternatives2073);
                    rule__Statement__TryAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTryAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:980:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:980:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:981:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:982:1: ( rule__Statement__Group_2__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:982:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives2091);
                    rule__Statement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:986:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:986:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:987:1: ( rule__Statement__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_3()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:988:1: ( rule__Statement__Group_3__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:988:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives2109);
                    rule__Statement__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:992:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:992:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:993:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:994:1: ( rule__Statement__Group_4__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:994:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives2127);
                    rule__Statement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:998:6: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:998:6: ( ( rule__Statement__Group_5__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:999:1: ( rule__Statement__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1000:1: ( rule__Statement__Group_5__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1000:2: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives2145);
                    rule__Statement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Import_statement__Alternatives_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1009:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1013:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1014:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1014:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1015:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1016:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1016:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12178);
                    rule__Import_statement__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1020:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1020:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1021:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1022:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1022:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12196);
                    rule__Import_statement__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Alternatives_1"


    // $ANTLR start "rule__Compilation_unit__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1033:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1037:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1038:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02227);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02230);
            rule__Compilation_unit__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__0"


    // $ANTLR start "rule__Compilation_unit__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1045:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__PackageAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1049:1: ( ( ( rule__Compilation_unit__PackageAssignment_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1050:1: ( ( rule__Compilation_unit__PackageAssignment_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1050:1: ( ( rule__Compilation_unit__PackageAssignment_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1051:1: ( rule__Compilation_unit__PackageAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getPackageAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1052:1: ( rule__Compilation_unit__PackageAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1052:2: rule__Compilation_unit__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__PackageAssignment_0_in_rule__Compilation_unit__Group__0__Impl2257);
                    rule__Compilation_unit__PackageAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getPackageAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__0__Impl"


    // $ANTLR start "rule__Compilation_unit__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1062:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1066:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1067:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12288);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12291);
            rule__Compilation_unit__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__1"


    // $ANTLR start "rule__Compilation_unit__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1074:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1078:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1079:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1079:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1080:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1081:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1081:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2318);
            	    rule__Compilation_unit__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__1__Impl"


    // $ANTLR start "rule__Compilation_unit__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1091:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1095:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1096:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22349);
            rule__Compilation_unit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__2"


    // $ANTLR start "rule__Compilation_unit__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1102:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1106:1: ( ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1107:1: ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1107:1: ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1108:1: ( rule__Compilation_unit__Type_declarationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getType_declarationsAssignment_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1109:1: ( rule__Compilation_unit__Type_declarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_MOD && LA12_0<=RULE_STATIC)||LA12_0==RULE_DOC_COMMENT||LA12_0==24||LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1109:2: rule__Compilation_unit__Type_declarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__Type_declarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2376);
            	    rule__Compilation_unit__Type_declarationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getType_declarationsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__2__Impl"


    // $ANTLR start "rule__Type_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1125:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1129:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1130:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02413);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02416);
            rule__Type_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__0"


    // $ANTLR start "rule__Type_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1137:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__DocAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1141:1: ( ( ( rule__Type_declaration__DocAssignment_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1142:1: ( ( rule__Type_declaration__DocAssignment_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1142:1: ( ( rule__Type_declaration__DocAssignment_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1143:1: ( rule__Type_declaration__DocAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getDocAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1144:1: ( rule__Type_declaration__DocAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOC_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1144:2: rule__Type_declaration__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__DocAssignment_0_in_rule__Type_declaration__Group__0__Impl2443);
                    rule__Type_declaration__DocAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getDocAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__0__Impl"


    // $ANTLR start "rule__Type_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1154:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1158:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1159:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12474);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12477);
            rule__Type_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__1"


    // $ANTLR start "rule__Type_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1166:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1170:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1171:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1171:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1172:1: ( rule__Type_declaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1173:1: ( rule__Type_declaration__Alternatives_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1173:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2504);
            rule__Type_declaration__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__1__Impl"


    // $ANTLR start "rule__Type_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1183:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1187:1: ( rule__Type_declaration__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1188:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22534);
            rule__Type_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__2"


    // $ANTLR start "rule__Type_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1194:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1198:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1199:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1199:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1200:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Type_declaration__Group__2__Impl2562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1219:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1223:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1224:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02599);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02602);
            rule__Interface_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__0"


    // $ANTLR start "rule__Interface_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1231:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1235:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1236:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1236:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1237:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1238:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1238:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2629);
            	    rule__Interface_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1248:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1252:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1253:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12660);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12663);
            rule__Interface_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__1"


    // $ANTLR start "rule__Interface_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1260:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1264:1: ( ( 'interface' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1265:1: ( 'interface' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1265:1: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1266:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group__1__Impl2691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__1__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1279:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1283:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1284:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22722);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22725);
            rule__Interface_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__2"


    // $ANTLR start "rule__Interface_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1291:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1295:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1296:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1296:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1297:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1298:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1298:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2752);
            rule__Interface_declaration__InterfaceNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1308:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1312:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1313:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32782);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32785);
            rule__Interface_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__3"


    // $ANTLR start "rule__Interface_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1320:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1324:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1325:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1325:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1326:1: ( rule__Interface_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1327:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1327:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2812);
                    rule__Interface_declaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__3__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1337:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1341:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1342:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42843);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42846);
            rule__Interface_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__4"


    // $ANTLR start "rule__Interface_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1349:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1353:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1354:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1354:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1355:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_25_in_rule__Interface_declaration__Group__4__Impl2874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__4__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1368:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1372:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1373:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52905);
            rule__Interface_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__5"


    // $ANTLR start "rule__Interface_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1379:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1383:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1384:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1384:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1385:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,26,FOLLOW_26_in_rule__Interface_declaration__Group__5__Impl2933); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__5__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1410:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1414:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1415:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02976);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__02979);
            rule__Interface_declaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__0"


    // $ANTLR start "rule__Interface_declaration__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1422:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1426:1: ( ( 'extends' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1427:1: ( 'extends' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1427:1: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1428:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Interface_declaration__Group_3__0__Impl3007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1441:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1445:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1446:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13038);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13041);
            rule__Interface_declaration__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__1"


    // $ANTLR start "rule__Interface_declaration__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1453:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1457:1: ( ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1458:1: ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1458:1: ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1459:1: ( rule__Interface_declaration__ExtendAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendAssignment_3_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1460:1: ( rule__Interface_declaration__ExtendAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1460:2: rule__Interface_declaration__ExtendAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__ExtendAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3068);
            rule__Interface_declaration__ExtendAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getExtendAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1470:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1474:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1475:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23098);
            rule__Interface_declaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__2"


    // $ANTLR start "rule__Interface_declaration__Group_3__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1481:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1485:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1486:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1486:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1487:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1488:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1488:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3125);
            	    rule__Interface_declaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1504:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1508:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1509:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03162);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03165);
            rule__Interface_declaration__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__0"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1516:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1520:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1521:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1521:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1522:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Interface_declaration__Group_3_2__0__Impl3193); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1535:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1539:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1540:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13224);
            rule__Interface_declaration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__1"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1546:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1550:1: ( ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1551:1: ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1551:1: ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1552:1: ( rule__Interface_declaration__ExtendsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsAssignment_3_2_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1553:1: ( rule__Interface_declaration__ExtendsAssignment_3_2_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1553:2: rule__Interface_declaration__ExtendsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__ExtendsAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3251);
            rule__Interface_declaration__ExtendsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getExtendsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1567:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1571:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1572:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03285);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03288);
            rule__Class_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__0"


    // $ANTLR start "rule__Class_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1579:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1583:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1584:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1584:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1585:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1586:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1586:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3315);
            	    rule__Class_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1596:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1600:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1601:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13346);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13349);
            rule__Class_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__1"


    // $ANTLR start "rule__Class_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1608:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1612:1: ( ( 'class' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1613:1: ( 'class' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1613:1: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1614:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Class_declaration__Group__1__Impl3377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1627:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1631:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1632:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23408);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23411);
            rule__Class_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__2"


    // $ANTLR start "rule__Class_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1639:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1643:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1644:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1644:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1645:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1646:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1646:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3438);
            rule__Class_declaration__ClassNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__2__Impl"


    // $ANTLR start "rule__Class_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1656:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1660:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1661:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33468);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33471);
            rule__Class_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__3"


    // $ANTLR start "rule__Class_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1668:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1672:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1673:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1673:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1674:1: ( rule__Class_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1675:1: ( rule__Class_declaration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1675:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3498);
                    rule__Class_declaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__3__Impl"


    // $ANTLR start "rule__Class_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1685:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1689:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1690:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43529);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43532);
            rule__Class_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__4"


    // $ANTLR start "rule__Class_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1697:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1701:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1702:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1702:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1703:1: ( rule__Class_declaration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1704:1: ( rule__Class_declaration__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1704:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3559);
                    rule__Class_declaration__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__4__Impl"


    // $ANTLR start "rule__Class_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1714:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1718:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1719:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53590);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53593);
            rule__Class_declaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__5"


    // $ANTLR start "rule__Class_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1726:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1730:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1731:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1731:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1732:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group__5__Impl3621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__5__Impl"


    // $ANTLR start "rule__Class_declaration__Group__6"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1745:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1749:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1750:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63652);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63655);
            rule__Class_declaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__6"


    // $ANTLR start "rule__Class_declaration__Group__6__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1757:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1761:1: ( ( ( rule__Class_declaration__FieldsAssignment_6 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1762:1: ( ( rule__Class_declaration__FieldsAssignment_6 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1762:1: ( ( rule__Class_declaration__FieldsAssignment_6 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1763:1: ( rule__Class_declaration__FieldsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsAssignment_6()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1764:1: ( rule__Class_declaration__FieldsAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_MOD && LA20_0<=RULE_DOC_COMMENT)||(LA20_0>=15 && LA20_0<=23)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1764:2: rule__Class_declaration__FieldsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsAssignment_6_in_rule__Class_declaration__Group__6__Impl3682);
            	    rule__Class_declaration__FieldsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getFieldsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__6__Impl"


    // $ANTLR start "rule__Class_declaration__Group__7"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1774:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1778:1: ( rule__Class_declaration__Group__7__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1779:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73713);
            rule__Class_declaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__7"


    // $ANTLR start "rule__Class_declaration__Group__7__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1785:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1789:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1790:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1790:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1791:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group__7__Impl3741); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__7__Impl"


    // $ANTLR start "rule__Class_declaration__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1820:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1824:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1825:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03788);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03791);
            rule__Class_declaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__0"


    // $ANTLR start "rule__Class_declaration__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1832:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1836:1: ( ( 'extends' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1837:1: ( 'extends' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1837:1: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1838:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Class_declaration__Group_3__0__Impl3819); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1851:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1855:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1856:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13850);
            rule__Class_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__1"


    // $ANTLR start "rule__Class_declaration__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1862:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ExtendAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1866:1: ( ( ( rule__Class_declaration__ExtendAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1867:1: ( ( rule__Class_declaration__ExtendAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1867:1: ( ( rule__Class_declaration__ExtendAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1868:1: ( rule__Class_declaration__ExtendAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendAssignment_3_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1869:1: ( rule__Class_declaration__ExtendAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1869:2: rule__Class_declaration__ExtendAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ExtendAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3877);
            rule__Class_declaration__ExtendAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getExtendAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1883:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1887:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1888:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03911);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03914);
            rule__Class_declaration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__0"


    // $ANTLR start "rule__Class_declaration__Group_4__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1895:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1899:1: ( ( 'implements' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1900:1: ( 'implements' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1900:1: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1901:1: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Class_declaration__Group_4__0__Impl3942); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1914:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1918:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1919:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13973);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13976);
            rule__Class_declaration__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__1"


    // $ANTLR start "rule__Class_declaration__Group_4__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1926:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__ImplementAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1930:1: ( ( ( rule__Class_declaration__ImplementAssignment_4_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1931:1: ( ( rule__Class_declaration__ImplementAssignment_4_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1931:1: ( ( rule__Class_declaration__ImplementAssignment_4_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1932:1: ( rule__Class_declaration__ImplementAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementAssignment_4_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1933:1: ( rule__Class_declaration__ImplementAssignment_4_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1933:2: rule__Class_declaration__ImplementAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ImplementAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4003);
            rule__Class_declaration__ImplementAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getImplementAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1943:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1947:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1948:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24033);
            rule__Class_declaration__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__2"


    // $ANTLR start "rule__Class_declaration__Group_4__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1954:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1958:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1959:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1959:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1960:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1961:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1961:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4060);
            	    rule__Class_declaration__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__2__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1977:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1981:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1982:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04097);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04100);
            rule__Class_declaration__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__0"


    // $ANTLR start "rule__Class_declaration__Group_4_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1989:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1993:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1994:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1994:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1995:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Class_declaration__Group_4_2__0__Impl4128); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2008:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2012:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2013:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14159);
            rule__Class_declaration__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__1"


    // $ANTLR start "rule__Class_declaration__Group_4_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2019:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2023:1: ( ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2024:1: ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2024:1: ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2025:1: ( rule__Class_declaration__ImplementsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsAssignment_4_2_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2026:1: ( rule__Class_declaration__ImplementsAssignment_4_2_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2026:2: rule__Class_declaration__ImplementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ImplementsAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4186);
            rule__Class_declaration__ImplementsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getImplementsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__1__Impl"


    // $ANTLR start "rule__Field_declaration__Group_0__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2040:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2044:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2045:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04220);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04223);
            rule__Field_declaration__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__0"


    // $ANTLR start "rule__Field_declaration__Group_0__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2052:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__DocAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2056:1: ( ( ( rule__Field_declaration__DocAssignment_0_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2057:1: ( ( rule__Field_declaration__DocAssignment_0_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2057:1: ( ( rule__Field_declaration__DocAssignment_0_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2058:1: ( rule__Field_declaration__DocAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getDocAssignment_0_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2059:1: ( rule__Field_declaration__DocAssignment_0_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOC_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2059:2: rule__Field_declaration__DocAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__DocAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4250);
                    rule__Field_declaration__DocAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getDocAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__0__Impl"


    // $ANTLR start "rule__Field_declaration__Group_0__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2069:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2073:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2074:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14281);
            rule__Field_declaration__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__1"


    // $ANTLR start "rule__Field_declaration__Group_0__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2080:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2084:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2085:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2085:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2086:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2087:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2087:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4308);
            rule__Field_declaration__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__1__Impl"


    // $ANTLR start "rule__Method_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2101:1: rule__Method_declaration__Group__0 : rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 ;
    public final void rule__Method_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2105:1: ( rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2106:2: rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04342);
            rule__Method_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04345);
            rule__Method_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__0"


    // $ANTLR start "rule__Method_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2113:1: rule__Method_declaration__Group__0__Impl : ( ( rule__Method_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Method_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2117:1: ( ( ( rule__Method_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2118:1: ( ( rule__Method_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2118:1: ( ( rule__Method_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2119:1: ( rule__Method_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2120:1: ( rule__Method_declaration__ModifiersAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_MOD && LA23_0<=RULE_STATIC)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2120:2: rule__Method_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Method_declaration__ModifiersAssignment_0_in_rule__Method_declaration__Group__0__Impl4372);
            	    rule__Method_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getModifiersAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__0__Impl"


    // $ANTLR start "rule__Method_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2130:1: rule__Method_declaration__Group__1 : rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 ;
    public final void rule__Method_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2134:1: ( rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2135:2: rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14403);
            rule__Method_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14406);
            rule__Method_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__1"


    // $ANTLR start "rule__Method_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2142:1: rule__Method_declaration__Group__1__Impl : ( ( rule__Method_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Method_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2146:1: ( ( ( rule__Method_declaration__TypeAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2147:1: ( ( rule__Method_declaration__TypeAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2147:1: ( ( rule__Method_declaration__TypeAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2148:1: ( rule__Method_declaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2149:1: ( rule__Method_declaration__TypeAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2149:2: rule__Method_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Method_declaration__TypeAssignment_1_in_rule__Method_declaration__Group__1__Impl4433);
            rule__Method_declaration__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__1__Impl"


    // $ANTLR start "rule__Method_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2159:1: rule__Method_declaration__Group__2 : rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 ;
    public final void rule__Method_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2163:1: ( rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2164:2: rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24463);
            rule__Method_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24466);
            rule__Method_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__2"


    // $ANTLR start "rule__Method_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2171:1: rule__Method_declaration__Group__2__Impl : ( ( rule__Method_declaration__NameAssignment_2 ) ) ;
    public final void rule__Method_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2175:1: ( ( ( rule__Method_declaration__NameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2176:1: ( ( rule__Method_declaration__NameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2176:1: ( ( rule__Method_declaration__NameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2177:1: ( rule__Method_declaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameAssignment_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2178:1: ( rule__Method_declaration__NameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2178:2: rule__Method_declaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Method_declaration__NameAssignment_2_in_rule__Method_declaration__Group__2__Impl4493);
            rule__Method_declaration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__2__Impl"


    // $ANTLR start "rule__Method_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2188:1: rule__Method_declaration__Group__3 : rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 ;
    public final void rule__Method_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2192:1: ( rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2193:2: rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34523);
            rule__Method_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34526);
            rule__Method_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__3"


    // $ANTLR start "rule__Method_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2200:1: rule__Method_declaration__Group__3__Impl : ( '(' ) ;
    public final void rule__Method_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2204:1: ( ( '(' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2205:1: ( '(' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2205:1: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2206:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__Method_declaration__Group__3__Impl4554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__3__Impl"


    // $ANTLR start "rule__Method_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2219:1: rule__Method_declaration__Group__4 : rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 ;
    public final void rule__Method_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2223:1: ( rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2224:2: rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44585);
            rule__Method_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44588);
            rule__Method_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__4"


    // $ANTLR start "rule__Method_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2231:1: rule__Method_declaration__Group__4__Impl : ( ( rule__Method_declaration__ParameterAssignment_4 )? ) ;
    public final void rule__Method_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2235:1: ( ( ( rule__Method_declaration__ParameterAssignment_4 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2236:1: ( ( rule__Method_declaration__ParameterAssignment_4 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2236:1: ( ( rule__Method_declaration__ParameterAssignment_4 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2237:1: ( rule__Method_declaration__ParameterAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterAssignment_4()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2238:1: ( rule__Method_declaration__ParameterAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=15 && LA24_0<=22)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2238:2: rule__Method_declaration__ParameterAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__ParameterAssignment_4_in_rule__Method_declaration__Group__4__Impl4615);
                    rule__Method_declaration__ParameterAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getParameterAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__4__Impl"


    // $ANTLR start "rule__Method_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2248:1: rule__Method_declaration__Group__5 : rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 ;
    public final void rule__Method_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2252:1: ( rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2253:2: rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__54646);
            rule__Method_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__54649);
            rule__Method_declaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__5"


    // $ANTLR start "rule__Method_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2260:1: rule__Method_declaration__Group__5__Impl : ( ')' ) ;
    public final void rule__Method_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2264:1: ( ( ')' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2265:1: ( ')' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2265:1: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2266:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,32,FOLLOW_32_in_rule__Method_declaration__Group__5__Impl4677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__5__Impl"


    // $ANTLR start "rule__Method_declaration__Group__6"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2279:1: rule__Method_declaration__Group__6 : rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 ;
    public final void rule__Method_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2283:1: ( rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2284:2: rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__64708);
            rule__Method_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__64711);
            rule__Method_declaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__6"


    // $ANTLR start "rule__Method_declaration__Group__6__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2291:1: rule__Method_declaration__Group__6__Impl : ( ( '[]' )* ) ;
    public final void rule__Method_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2295:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2296:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2296:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2297:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2298:1: ( '[]' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2299:2: '[]'
            	    {
            	    match(input,33,FOLLOW_33_in_rule__Method_declaration__Group__6__Impl4740); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__6__Impl"


    // $ANTLR start "rule__Method_declaration__Group__7"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2310:1: rule__Method_declaration__Group__7 : rule__Method_declaration__Group__7__Impl ;
    public final void rule__Method_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2314:1: ( rule__Method_declaration__Group__7__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2315:2: rule__Method_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__74773);
            rule__Method_declaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__7"


    // $ANTLR start "rule__Method_declaration__Group__7__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2321:1: rule__Method_declaration__Group__7__Impl : ( ( rule__Method_declaration__Alternatives_7 ) ) ;
    public final void rule__Method_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2325:1: ( ( ( rule__Method_declaration__Alternatives_7 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2326:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2326:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2327:1: ( rule__Method_declaration__Alternatives_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2328:1: ( rule__Method_declaration__Alternatives_7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2328:2: rule__Method_declaration__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl4800);
            rule__Method_declaration__Alternatives_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__7__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2354:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2358:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2359:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04846);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04849);
            rule__Constructor_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__0"


    // $ANTLR start "rule__Constructor_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2366:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2370:1: ( ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2371:1: ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2371:1: ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2372:1: ( rule__Constructor_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2373:1: ( rule__Constructor_declaration__ModifiersAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_MOD && LA26_0<=RULE_STATIC)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2373:2: rule__Constructor_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersAssignment_0_in_rule__Constructor_declaration__Group__0__Impl4876);
            	    rule__Constructor_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getModifiersAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__0__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2383:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2387:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2388:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__14907);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__14910);
            rule__Constructor_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__1"


    // $ANTLR start "rule__Constructor_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2395:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2399:1: ( ( ( rule__Constructor_declaration__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2400:1: ( ( rule__Constructor_declaration__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2400:1: ( ( rule__Constructor_declaration__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2401:1: ( rule__Constructor_declaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2402:1: ( rule__Constructor_declaration__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2402:2: rule__Constructor_declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameAssignment_1_in_rule__Constructor_declaration__Group__1__Impl4937);
            rule__Constructor_declaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__1__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2412:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2416:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2417:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__24967);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__24970);
            rule__Constructor_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__2"


    // $ANTLR start "rule__Constructor_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2424:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2428:1: ( ( '(' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2429:1: ( '(' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2429:1: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2430:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Constructor_declaration__Group__2__Impl4998); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__2__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2443:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2447:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2448:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35029);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35032);
            rule__Constructor_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__3"


    // $ANTLR start "rule__Constructor_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2455:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParametersAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2459:1: ( ( ( rule__Constructor_declaration__ParametersAssignment_3 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2460:1: ( ( rule__Constructor_declaration__ParametersAssignment_3 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2460:1: ( ( rule__Constructor_declaration__ParametersAssignment_3 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2461:1: ( rule__Constructor_declaration__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParametersAssignment_3()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2462:1: ( rule__Constructor_declaration__ParametersAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=15 && LA27_0<=22)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2462:2: rule__Constructor_declaration__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParametersAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5059);
                    rule__Constructor_declaration__ParametersAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getParametersAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__3__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2472:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2476:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2477:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45090);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45093);
            rule__Constructor_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__4"


    // $ANTLR start "rule__Constructor_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2484:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2488:1: ( ( ')' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2489:1: ( ')' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2489:1: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2490:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__Constructor_declaration__Group__4__Impl5121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__4__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2503:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2507:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2508:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55152);
            rule__Constructor_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__5"


    // $ANTLR start "rule__Constructor_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2514:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2518:1: ( ( ( rule__Constructor_declaration__StatementAssignment_5 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2519:1: ( ( rule__Constructor_declaration__StatementAssignment_5 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2519:1: ( ( rule__Constructor_declaration__StatementAssignment_5 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2520:1: ( rule__Constructor_declaration__StatementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementAssignment_5()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2521:1: ( rule__Constructor_declaration__StatementAssignment_5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2521:2: rule__Constructor_declaration__StatementAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5179);
            rule__Constructor_declaration__StatementAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getStatementAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__5__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2543:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2547:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2548:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05221);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05224);
            rule__Parameter_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0"


    // $ANTLR start "rule__Parameter_list__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2555:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2559:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2560:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2560:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2561:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2562:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2562:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5251);
            rule__Parameter_list__ParameterAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2572:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2576:1: ( rule__Parameter_list__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2577:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15281);
            rule__Parameter_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1"


    // $ANTLR start "rule__Parameter_list__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2583:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2587:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2588:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2588:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2589:1: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2590:1: ( rule__Parameter_list__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2590:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5308);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2604:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2608:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2609:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05343);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05346);
            rule__Parameter_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0"


    // $ANTLR start "rule__Parameter_list__Group_1__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2616:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2620:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2621:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2621:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2622:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Parameter_list__Group_1__0__Impl5374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2635:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2639:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2640:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15405);
            rule__Parameter_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1"


    // $ANTLR start "rule__Parameter_list__Group_1__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2646:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2650:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2651:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2651:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2652:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2653:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2653:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5432);
            rule__Parameter_list__ParametersAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2667:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2671:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2672:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05466);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05469);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2679:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2683:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2684:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2684:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2685:1: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2686:1: ( rule__Parameter__TypeAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2686:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5496);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2696:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2700:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2701:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15526);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15529);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2708:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2712:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2713:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2713:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2714:1: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2715:1: ( rule__Parameter__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2715:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl5556);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2725:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2729:1: ( rule__Parameter__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2730:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25586);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2736:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2740:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2741:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2741:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2742:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2743:1: ( '[]' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2744:2: '[]'
            	    {
            	    match(input,33,FOLLOW_33_in_rule__Parameter__Group__2__Impl5615); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2761:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2765:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2766:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__05654);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__05657);
            rule__Variable_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0"


    // $ANTLR start "rule__Variable_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2773:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2777:1: ( ( ( rule__Variable_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2778:1: ( ( rule__Variable_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2778:1: ( ( rule__Variable_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2779:1: ( rule__Variable_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2780:1: ( rule__Variable_declaration__ModifiersAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_MOD && LA30_0<=RULE_STATIC)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2780:2: rule__Variable_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersAssignment_0_in_rule__Variable_declaration__Group__0__Impl5684);
            	    rule__Variable_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getModifiersAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2790:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2794:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2795:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__15715);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__15718);
            rule__Variable_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1"


    // $ANTLR start "rule__Variable_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2802:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2806:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2807:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2807:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2808:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2809:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2809:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl5745);
            rule__Variable_declaration__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2819:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2823:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2824:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__25775);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__25778);
            rule__Variable_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2"


    // $ANTLR start "rule__Variable_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2831:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2835:1: ( ( ( rule__Variable_declaration__NameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2836:1: ( ( rule__Variable_declaration__NameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2836:1: ( ( rule__Variable_declaration__NameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2837:1: ( rule__Variable_declaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameAssignment_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2838:1: ( rule__Variable_declaration__NameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2838:2: rule__Variable_declaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameAssignment_2_in_rule__Variable_declaration__Group__2__Impl5805);
            rule__Variable_declaration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2848:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2852:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2853:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__35835);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__35838);
            rule__Variable_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__3"


    // $ANTLR start "rule__Variable_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2860:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2864:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2865:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2865:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2866:1: ( rule__Variable_declaration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2867:1: ( rule__Variable_declaration__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2867:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl5865);
            	    rule__Variable_declaration__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2877:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2881:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2882:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__45896);
            rule__Variable_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__4"


    // $ANTLR start "rule__Variable_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2888:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2892:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2893:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2893:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2894:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__Variable_declaration__Group__4__Impl5924); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__4__Impl"


    // $ANTLR start "rule__Variable_declaration__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2917:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2921:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2922:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__05965);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__05968);
            rule__Variable_declaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__0"


    // $ANTLR start "rule__Variable_declaration__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2929:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2933:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2934:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2934:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2935:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Variable_declaration__Group_3__0__Impl5996); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2948:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2952:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2953:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16027);
            rule__Variable_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__1"


    // $ANTLR start "rule__Variable_declaration__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2959:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2963:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2964:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2964:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2965:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2966:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2966:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6054);
            rule__Variable_declaration__NamesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_declarator__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2980:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2984:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2985:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06088);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06091);
            rule__Variable_declarator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__0"


    // $ANTLR start "rule__Variable_declarator__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2992:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2996:1: ( ( ( rule__Variable_declarator__NameAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2997:1: ( ( rule__Variable_declarator__NameAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2997:1: ( ( rule__Variable_declarator__NameAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2998:1: ( rule__Variable_declarator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2999:1: ( rule__Variable_declarator__NameAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2999:2: rule__Variable_declarator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameAssignment_0_in_rule__Variable_declarator__Group__0__Impl6118);
            rule__Variable_declarator__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__0__Impl"


    // $ANTLR start "rule__Variable_declarator__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3009:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3013:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3014:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16148);
            rule__Variable_declarator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__1"


    // $ANTLR start "rule__Variable_declarator__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3020:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3024:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3025:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3025:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3026:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3027:1: ( '[]' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3028:2: '[]'
            	    {
            	    match(input,33,FOLLOW_33_in_rule__Variable_declarator__Group__1__Impl6177); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3043:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3047:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3048:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06214);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06217);
            rule__Type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3055:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3059:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3060:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3060:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3061:1: ( rule__Type__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3062:1: ( rule__Type__NameAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3062:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl6244);
            rule__Type__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3072:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3076:1: ( rule__Type__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3077:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16274);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3083:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3087:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3088:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3088:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3089:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3090:1: ( '[]' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3091:2: '[]'
            	    {
            	    match(input,33,FOLLOW_33_in_rule__Type__Group__1__Impl6303); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Static_initializer__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3106:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3110:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3111:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06340);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06343);
            rule__Static_initializer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__0"


    // $ANTLR start "rule__Static_initializer__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3118:1: rule__Static_initializer__Group__0__Impl : ( RULE_STATIC ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3122:1: ( ( RULE_STATIC ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3123:1: ( RULE_STATIC )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3123:1: ( RULE_STATIC )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3124:1: RULE_STATIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getSTATICTerminalRuleCall_0()); 
            }
            match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Static_initializer__Group__0__Impl6370); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getSTATICTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__0__Impl"


    // $ANTLR start "rule__Static_initializer__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3135:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3139:1: ( rule__Static_initializer__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3140:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16399);
            rule__Static_initializer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__1"


    // $ANTLR start "rule__Static_initializer__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3146:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3150:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3151:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3151:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3152:1: ( rule__Static_initializer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3153:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3153:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6426);
            rule__Static_initializer__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__1__Impl"


    // $ANTLR start "rule__Statement_block__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3167:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3171:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3172:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06460);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06463);
            rule__Statement_block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__0"


    // $ANTLR start "rule__Statement_block__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3179:1: rule__Statement_block__Group__0__Impl : ( () ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3183:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3184:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3184:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3185:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatement_blockAction_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3186:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3188:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getStatement_blockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__0__Impl"


    // $ANTLR start "rule__Statement_block__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3198:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3202:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3203:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16521);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16524);
            rule__Statement_block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__1"


    // $ANTLR start "rule__Statement_block__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3210:1: rule__Statement_block__Group__1__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3214:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3215:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3215:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3216:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Statement_block__Group__1__Impl6552); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__1__Impl"


    // $ANTLR start "rule__Statement_block__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3229:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3 ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3233:1: ( rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3234:2: rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26583);
            rule__Statement_block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__3_in_rule__Statement_block__Group__26586);
            rule__Statement_block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__2"


    // $ANTLR start "rule__Statement_block__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3241:1: rule__Statement_block__Group__2__Impl : ( ( rule__Statement_block__StatementsAssignment_2 )* ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3245:1: ( ( ( rule__Statement_block__StatementsAssignment_2 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3246:1: ( ( rule__Statement_block__StatementsAssignment_2 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3246:1: ( ( rule__Statement_block__StatementsAssignment_2 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3247:1: ( rule__Statement_block__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatementsAssignment_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3248:1: ( rule__Statement_block__StatementsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==RULE_TRY||LA34_0==23||LA34_0==25||(LA34_0>=35 && LA34_0<=36)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3248:2: rule__Statement_block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatementsAssignment_2_in_rule__Statement_block__Group__2__Impl6613);
            	    rule__Statement_block__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__2__Impl"


    // $ANTLR start "rule__Statement_block__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3258:1: rule__Statement_block__Group__3 : rule__Statement_block__Group__3__Impl ;
    public final void rule__Statement_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3262:1: ( rule__Statement_block__Group__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3263:2: rule__Statement_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__3__Impl_in_rule__Statement_block__Group__36644);
            rule__Statement_block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__3"


    // $ANTLR start "rule__Statement_block__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3269:1: rule__Statement_block__Group__3__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3273:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3274:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3274:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3275:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,26,FOLLOW_26_in_rule__Statement_block__Group__3__Impl6672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3296:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3300:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3301:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__06711);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__06714);
            rule__Statement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3308:1: rule__Statement__Group_2__0__Impl : ( ( rule__Statement__NameAssignment_2_0 ) ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3312:1: ( ( ( rule__Statement__NameAssignment_2_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3313:1: ( ( rule__Statement__NameAssignment_2_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3313:1: ( ( rule__Statement__NameAssignment_2_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3314:1: ( rule__Statement__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_2_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3315:1: ( rule__Statement__NameAssignment_2_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3315:2: rule__Statement__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_2_0_in_rule__Statement__Group_2__0__Impl6741);
            rule__Statement__NameAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3325:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3329:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3330:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__16771);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__16774);
            rule__Statement__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3337:1: rule__Statement__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3341:1: ( ( ':' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3342:1: ( ':' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3342:1: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3343:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_2_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Statement__Group_2__1__Impl6802); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3356:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3360:1: ( rule__Statement__Group_2__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3361:2: rule__Statement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__26833);
            rule__Statement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2"


    // $ANTLR start "rule__Statement__Group_2__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3367:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__StatementAssignment_2_2 ) ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3371:1: ( ( ( rule__Statement__StatementAssignment_2_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3372:1: ( ( rule__Statement__StatementAssignment_2_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3372:1: ( ( rule__Statement__StatementAssignment_2_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3373:1: ( rule__Statement__StatementAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAssignment_2_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3374:1: ( rule__Statement__StatementAssignment_2_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3374:2: rule__Statement__StatementAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_2_2_in_rule__Statement__Group_2__2__Impl6860);
            rule__Statement__StatementAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3390:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3394:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3395:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__06896);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__06899);
            rule__Statement__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3402:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3406:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3407:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3407:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3408:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3409:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3411:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3421:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3425:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3426:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__16957);
            rule__Statement__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__16960);
            rule__Statement__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3433:1: rule__Statement__Group_3__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3437:1: ( ( 'break' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3438:1: ( 'break' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3438:1: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3439:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getBreakKeyword_3_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Statement__Group_3__1__Impl6988); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getBreakKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3452:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3456:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3457:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__27019);
            rule__Statement__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__3_in_rule__Statement__Group_3__27022);
            rule__Statement__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2"


    // $ANTLR start "rule__Statement__Group_3__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3464:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__NameAssignment_3_2 )? ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3468:1: ( ( ( rule__Statement__NameAssignment_3_2 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3469:1: ( ( rule__Statement__NameAssignment_3_2 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3469:1: ( ( rule__Statement__NameAssignment_3_2 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3470:1: ( rule__Statement__NameAssignment_3_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_3_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3471:1: ( rule__Statement__NameAssignment_3_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3471:2: rule__Statement__NameAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_3_2_in_rule__Statement__Group_3__2__Impl7049);
                    rule__Statement__NameAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2__Impl"


    // $ANTLR start "rule__Statement__Group_3__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3481:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3485:1: ( rule__Statement__Group_3__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3486:2: rule__Statement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__3__Impl_in_rule__Statement__Group_3__37080);
            rule__Statement__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__3"


    // $ANTLR start "rule__Statement__Group_3__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3492:1: rule__Statement__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3496:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3497:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3497:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3498:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Statement__Group_3__3__Impl7108); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__3__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3519:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3523:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3524:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__07147);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__07150);
            rule__Statement__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3531:1: rule__Statement__Group_4__0__Impl : ( () ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3535:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3536:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3536:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3537:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_4_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3538:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3540:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3550:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3554:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3555:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__17208);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__17211);
            rule__Statement__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3562:1: rule__Statement__Group_4__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3566:1: ( ( 'continue' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3567:1: ( 'continue' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3567:1: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3568:1: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getContinueKeyword_4_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_4__1__Impl7239); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getContinueKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3581:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3585:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3586:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__27270);
            rule__Statement__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__27273);
            rule__Statement__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__2"


    // $ANTLR start "rule__Statement__Group_4__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3593:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__NameAssignment_4_2 )? ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3597:1: ( ( ( rule__Statement__NameAssignment_4_2 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3598:1: ( ( rule__Statement__NameAssignment_4_2 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3598:1: ( ( rule__Statement__NameAssignment_4_2 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3599:1: ( rule__Statement__NameAssignment_4_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_4_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3600:1: ( rule__Statement__NameAssignment_4_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3600:2: rule__Statement__NameAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_4_2_in_rule__Statement__Group_4__2__Impl7300);
                    rule__Statement__NameAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__2__Impl"


    // $ANTLR start "rule__Statement__Group_4__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3610:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3614:1: ( rule__Statement__Group_4__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3615:2: rule__Statement__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__37331);
            rule__Statement__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__3"


    // $ANTLR start "rule__Statement__Group_4__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3621:1: rule__Statement__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3625:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3626:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3626:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3627:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Statement__Group_4__3__Impl7359); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__3__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3648:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3652:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3653:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__07398);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__07401);
            rule__Statement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3660:1: rule__Statement__Group_5__0__Impl : ( () ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3664:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3665:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3665:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3666:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_5_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3667:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3669:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3679:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3683:1: ( rule__Statement__Group_5__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3684:2: rule__Statement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__17459);
            rule__Statement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3690:1: rule__Statement__Group_5__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3694:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3695:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3695:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3696:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Statement__Group_5__1__Impl7487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Try_statement__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3713:1: rule__Try_statement__Group__0 : rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 ;
    public final void rule__Try_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3717:1: ( rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3718:2: rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__07522);
            rule__Try_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__07525);
            rule__Try_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__0"


    // $ANTLR start "rule__Try_statement__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3725:1: rule__Try_statement__Group__0__Impl : ( ( rule__Try_statement__TryAssignment_0 ) ) ;
    public final void rule__Try_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3729:1: ( ( ( rule__Try_statement__TryAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3730:1: ( ( rule__Try_statement__TryAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3730:1: ( ( rule__Try_statement__TryAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3731:1: ( rule__Try_statement__TryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryAssignment_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3732:1: ( rule__Try_statement__TryAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3732:2: rule__Try_statement__TryAssignment_0
            {
            pushFollow(FOLLOW_rule__Try_statement__TryAssignment_0_in_rule__Try_statement__Group__0__Impl7552);
            rule__Try_statement__TryAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__0__Impl"


    // $ANTLR start "rule__Try_statement__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3742:1: rule__Try_statement__Group__1 : rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 ;
    public final void rule__Try_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3746:1: ( rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3747:2: rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__17582);
            rule__Try_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__17585);
            rule__Try_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__1"


    // $ANTLR start "rule__Try_statement__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3754:1: rule__Try_statement__Group__1__Impl : ( ( rule__Try_statement__TryStatementAssignment_1 ) ) ;
    public final void rule__Try_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3758:1: ( ( ( rule__Try_statement__TryStatementAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3759:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3759:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3760:1: ( rule__Try_statement__TryStatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3761:1: ( rule__Try_statement__TryStatementAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3761:2: rule__Try_statement__TryStatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl7612);
            rule__Try_statement__TryStatementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__1__Impl"


    // $ANTLR start "rule__Try_statement__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3771:1: rule__Try_statement__Group__2 : rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 ;
    public final void rule__Try_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3775:1: ( rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3776:2: rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__27642);
            rule__Try_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__27645);
            rule__Try_statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__2"


    // $ANTLR start "rule__Try_statement__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3783:1: rule__Try_statement__Group__2__Impl : ( ( rule__Try_statement__Group_2__0 )* ) ;
    public final void rule__Try_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3787:1: ( ( ( rule__Try_statement__Group_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3788:1: ( ( rule__Try_statement__Group_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3788:1: ( ( rule__Try_statement__Group_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3789:1: ( rule__Try_statement__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3790:1: ( rule__Try_statement__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_CATCH) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred50_InternalJava()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3790:2: rule__Try_statement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl7672);
            	    rule__Try_statement__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__2__Impl"


    // $ANTLR start "rule__Try_statement__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3800:1: rule__Try_statement__Group__3 : rule__Try_statement__Group__3__Impl ;
    public final void rule__Try_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3804:1: ( rule__Try_statement__Group__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3805:2: rule__Try_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__37703);
            rule__Try_statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__3"


    // $ANTLR start "rule__Try_statement__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3811:1: rule__Try_statement__Group__3__Impl : ( ( rule__Try_statement__Group_3__0 )? ) ;
    public final void rule__Try_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3815:1: ( ( ( rule__Try_statement__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3816:1: ( ( rule__Try_statement__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3816:1: ( ( rule__Try_statement__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3817:1: ( rule__Try_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_3()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3818:1: ( rule__Try_statement__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_FINALLY) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred51_InternalJava()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3818:2: rule__Try_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl7730);
                    rule__Try_statement__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group__3__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3836:1: rule__Try_statement__Group_2__0 : rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 ;
    public final void rule__Try_statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3840:1: ( rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3841:2: rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__07769);
            rule__Try_statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__07772);
            rule__Try_statement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__0"


    // $ANTLR start "rule__Try_statement__Group_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3848:1: rule__Try_statement__Group_2__0__Impl : ( ( rule__Try_statement__CatchsAssignment_2_0 ) ) ;
    public final void rule__Try_statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3852:1: ( ( ( rule__Try_statement__CatchsAssignment_2_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3853:1: ( ( rule__Try_statement__CatchsAssignment_2_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3853:1: ( ( rule__Try_statement__CatchsAssignment_2_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3854:1: ( rule__Try_statement__CatchsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchsAssignment_2_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3855:1: ( rule__Try_statement__CatchsAssignment_2_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3855:2: rule__Try_statement__CatchsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Try_statement__CatchsAssignment_2_0_in_rule__Try_statement__Group_2__0__Impl7799);
            rule__Try_statement__CatchsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getCatchsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__0__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3865:1: rule__Try_statement__Group_2__1 : rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 ;
    public final void rule__Try_statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3869:1: ( rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3870:2: rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__17829);
            rule__Try_statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__17832);
            rule__Try_statement__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__1"


    // $ANTLR start "rule__Try_statement__Group_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3877:1: rule__Try_statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Try_statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3881:1: ( ( '(' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3882:1: ( '(' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3882:1: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3883:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Try_statement__Group_2__1__Impl7860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__1__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3896:1: rule__Try_statement__Group_2__2 : rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 ;
    public final void rule__Try_statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3900:1: ( rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3901:2: rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__27891);
            rule__Try_statement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__27894);
            rule__Try_statement__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__2"


    // $ANTLR start "rule__Try_statement__Group_2__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3908:1: rule__Try_statement__Group_2__2__Impl : ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) ;
    public final void rule__Try_statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3912:1: ( ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3913:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3913:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3914:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3915:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3915:2: rule__Try_statement__ParametersAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl7921);
            rule__Try_statement__ParametersAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__2__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3925:1: rule__Try_statement__Group_2__3 : rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 ;
    public final void rule__Try_statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3929:1: ( rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3930:2: rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__37951);
            rule__Try_statement__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__37954);
            rule__Try_statement__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__3"


    // $ANTLR start "rule__Try_statement__Group_2__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3937:1: rule__Try_statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Try_statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3941:1: ( ( ')' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3942:1: ( ')' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3942:1: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3943:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Try_statement__Group_2__3__Impl7982); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__3__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3956:1: rule__Try_statement__Group_2__4 : rule__Try_statement__Group_2__4__Impl ;
    public final void rule__Try_statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3960:1: ( rule__Try_statement__Group_2__4__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3961:2: rule__Try_statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__48013);
            rule__Try_statement__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__4"


    // $ANTLR start "rule__Try_statement__Group_2__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3967:1: rule__Try_statement__Group_2__4__Impl : ( ( rule__Try_statement__CatchStatementsAssignment_2_4 ) ) ;
    public final void rule__Try_statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3971:1: ( ( ( rule__Try_statement__CatchStatementsAssignment_2_4 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3972:1: ( ( rule__Try_statement__CatchStatementsAssignment_2_4 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3972:1: ( ( rule__Try_statement__CatchStatementsAssignment_2_4 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3973:1: ( rule__Try_statement__CatchStatementsAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchStatementsAssignment_2_4()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3974:1: ( rule__Try_statement__CatchStatementsAssignment_2_4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3974:2: rule__Try_statement__CatchStatementsAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Try_statement__CatchStatementsAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl8040);
            rule__Try_statement__CatchStatementsAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getCatchStatementsAssignment_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_2__4__Impl"


    // $ANTLR start "rule__Try_statement__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3994:1: rule__Try_statement__Group_3__0 : rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 ;
    public final void rule__Try_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3998:1: ( rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3999:2: rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__08080);
            rule__Try_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__08083);
            rule__Try_statement__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_3__0"


    // $ANTLR start "rule__Try_statement__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4006:1: rule__Try_statement__Group_3__0__Impl : ( ( rule__Try_statement__FinallyAssignment_3_0 ) ) ;
    public final void rule__Try_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4010:1: ( ( ( rule__Try_statement__FinallyAssignment_3_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4011:1: ( ( rule__Try_statement__FinallyAssignment_3_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4011:1: ( ( rule__Try_statement__FinallyAssignment_3_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4012:1: ( rule__Try_statement__FinallyAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyAssignment_3_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4013:1: ( rule__Try_statement__FinallyAssignment_3_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4013:2: rule__Try_statement__FinallyAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Try_statement__FinallyAssignment_3_0_in_rule__Try_statement__Group_3__0__Impl8110);
            rule__Try_statement__FinallyAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getFinallyAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_3__0__Impl"


    // $ANTLR start "rule__Try_statement__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4023:1: rule__Try_statement__Group_3__1 : rule__Try_statement__Group_3__1__Impl ;
    public final void rule__Try_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4027:1: ( rule__Try_statement__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4028:2: rule__Try_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__18140);
            rule__Try_statement__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_3__1"


    // $ANTLR start "rule__Try_statement__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4034:1: rule__Try_statement__Group_3__1__Impl : ( ( rule__Try_statement__FinallyStatementAssignment_3_1 ) ) ;
    public final void rule__Try_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4038:1: ( ( ( rule__Try_statement__FinallyStatementAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4039:1: ( ( rule__Try_statement__FinallyStatementAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4039:1: ( ( rule__Try_statement__FinallyStatementAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4040:1: ( rule__Try_statement__FinallyStatementAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyStatementAssignment_3_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4041:1: ( rule__Try_statement__FinallyStatementAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4041:2: rule__Try_statement__FinallyStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Try_statement__FinallyStatementAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl8167);
            rule__Try_statement__FinallyStatementAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getFinallyStatementAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__Group_3__1__Impl"


    // $ANTLR start "rule__Package_statement__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4055:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4059:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4060:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__08201);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__08204);
            rule__Package_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__0"


    // $ANTLR start "rule__Package_statement__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4067:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4071:1: ( ( 'package' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4072:1: ( 'package' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4072:1: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4073:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Package_statement__Group__0__Impl8232); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__0__Impl"


    // $ANTLR start "rule__Package_statement__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4086:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4090:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4091:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__18263);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__18266);
            rule__Package_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__1"


    // $ANTLR start "rule__Package_statement__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4098:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__NameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4102:1: ( ( ( rule__Package_statement__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4103:1: ( ( rule__Package_statement__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4103:1: ( ( rule__Package_statement__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4104:1: ( rule__Package_statement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getNameAssignment_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4105:1: ( rule__Package_statement__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4105:2: rule__Package_statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__NameAssignment_1_in_rule__Package_statement__Group__1__Impl8293);
            rule__Package_statement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__1__Impl"


    // $ANTLR start "rule__Package_statement__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4115:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4119:1: ( rule__Package_statement__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4120:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__28323);
            rule__Package_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__2"


    // $ANTLR start "rule__Package_statement__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4126:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4130:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4131:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4131:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4132:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Package_statement__Group__2__Impl8351); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__2__Impl"


    // $ANTLR start "rule__Package_name__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4151:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4155:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4156:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__08388);
            rule__Package_name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__08391);
            rule__Package_name__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__0"


    // $ANTLR start "rule__Package_name__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4163:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4167:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4168:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4168:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4169:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl8418); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__0__Impl"


    // $ANTLR start "rule__Package_name__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4180:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4184:1: ( rule__Package_name__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4185:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__18447);
            rule__Package_name__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__1"


    // $ANTLR start "rule__Package_name__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4191:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_aux ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4195:1: ( ( rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4196:1: ( rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4196:1: ( rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4197:1: rulePackage_name_aux
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_rulePackage_name_aux_in_rule__Package_name__Group__1__Impl8474);
            rulePackage_name_aux();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__1__Impl"


    // $ANTLR start "rule__Package_name_aux__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4212:1: rule__Package_name_aux__Group__0 : rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1 ;
    public final void rule__Package_name_aux__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4216:1: ( rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4217:2: rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_aux__Group__0__Impl_in_rule__Package_name_aux__Group__08507);
            rule__Package_name_aux__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name_aux__Group__1_in_rule__Package_name_aux__Group__08510);
            rule__Package_name_aux__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__0"


    // $ANTLR start "rule__Package_name_aux__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4224:1: rule__Package_name_aux__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_aux__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4228:1: ( ( '.' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4229:1: ( '.' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4229:1: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4230:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Package_name_aux__Group__0__Impl8538); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__0__Impl"


    // $ANTLR start "rule__Package_name_aux__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4243:1: rule__Package_name_aux__Group__1 : rule__Package_name_aux__Group__1__Impl ;
    public final void rule__Package_name_aux__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4247:1: ( rule__Package_name_aux__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4248:2: rule__Package_name_aux__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_aux__Group__1__Impl_in_rule__Package_name_aux__Group__18569);
            rule__Package_name_aux__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__1"


    // $ANTLR start "rule__Package_name_aux__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4254:1: rule__Package_name_aux__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_aux__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4258:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4259:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4259:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4260:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_aux__Group__1__Impl8596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__1__Impl"


    // $ANTLR start "rule__Import_statement__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4275:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4279:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4280:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__08629);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__08632);
            rule__Import_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__0"


    // $ANTLR start "rule__Import_statement__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4287:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4291:1: ( ( 'import' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4292:1: ( 'import' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4292:1: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4293:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Import_statement__Group__0__Impl8660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__0__Impl"


    // $ANTLR start "rule__Import_statement__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4306:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4310:1: ( rule__Import_statement__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4311:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__18691);
            rule__Import_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__1"


    // $ANTLR start "rule__Import_statement__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4317:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4321:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4322:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4322:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4323:1: ( rule__Import_statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4324:1: ( rule__Import_statement__Alternatives_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4324:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl8718);
            rule__Import_statement__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__1__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_0__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4338:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4342:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4343:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__08752);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__08755);
            rule__Import_statement__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__0"


    // $ANTLR start "rule__Import_statement__Group_1_0__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4350:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4354:1: ( ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4355:1: ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4355:1: ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4356:1: ( rule__Import_statement__ClassnameAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassnameAssignment_1_0_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4357:1: ( rule__Import_statement__ClassnameAssignment_1_0_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4357:2: rule__Import_statement__ClassnameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassnameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl8782);
            rule__Import_statement__ClassnameAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getClassnameAssignment_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__0__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_0__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4367:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4371:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4372:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__18812);
            rule__Import_statement__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__1"


    // $ANTLR start "rule__Import_statement__Group_1_0__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4378:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4382:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4383:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4383:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4384:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Import_statement__Group_1_0__1__Impl8840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__1__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_1__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4401:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4405:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4406:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__08875);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__08878);
            rule__Import_statement__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__0"


    // $ANTLR start "rule__Import_statement__Group_1_1__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4413:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4417:1: ( ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4418:1: ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4418:1: ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4419:1: ( rule__Import_statement__PackagenameAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPackagenameAssignment_1_1_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4420:1: ( rule__Import_statement__PackagenameAssignment_1_1_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4420:2: rule__Import_statement__PackagenameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PackagenameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl8905);
            rule__Import_statement__PackagenameAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getPackagenameAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__0__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_1__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4430:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4434:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4435:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__18935);
            rule__Import_statement__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__1"


    // $ANTLR start "rule__Import_statement__Group_1_1__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4441:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4445:1: ( ( '.*;;' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4446:1: ( '.*;;' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4446:1: ( '.*;;' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4447:1: '.*;;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonSemicolonKeyword_1_1_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Import_statement__Group_1_1__1__Impl8963); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonSemicolonKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__1__Impl"


    // $ANTLR start "rule__Head__ElementsAssignment"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4465:1: rule__Head__ElementsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Head__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4469:1: ( ( ruleCompilation_unit ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4470:1: ( ruleCompilation_unit )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4470:1: ( ruleCompilation_unit )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4471:1: ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Head__ElementsAssignment9003);
            ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__ElementsAssignment"


    // $ANTLR start "rule__Compilation_unit__PackageAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4480:1: rule__Compilation_unit__PackageAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4484:1: ( ( rulePackage_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4485:1: ( rulePackage_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4485:1: ( rulePackage_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4486:1: rulePackage_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__PackageAssignment_09034);
            rulePackage_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__PackageAssignment_0"


    // $ANTLR start "rule__Compilation_unit__ImportsAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4495:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4499:1: ( ( ruleImport_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4500:1: ( ruleImport_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4500:1: ( ruleImport_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4501:1: ruleImport_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_19065);
            ruleImport_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__ImportsAssignment_1"


    // $ANTLR start "rule__Compilation_unit__Type_declarationsAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4510:1: rule__Compilation_unit__Type_declarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__Type_declarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4514:1: ( ( ruleType_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4515:1: ( ruleType_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4515:1: ( ruleType_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4516:1: ruleType_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__Type_declarationsAssignment_29096);
            ruleType_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Type_declarationsAssignment_2"


    // $ANTLR start "rule__Type_declaration__DocAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4525:1: rule__Type_declaration__DocAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4529:1: ( ( RULE_DOC_COMMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4530:1: ( RULE_DOC_COMMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4530:1: ( RULE_DOC_COMMENT )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4531:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__DocAssignment_09127); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__DocAssignment_0"


    // $ANTLR start "rule__Type_declaration__NameAssignment_1_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4540:1: rule__Type_declaration__NameAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4544:1: ( ( ruleClass_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4545:1: ( ruleClass_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4545:1: ( ruleClass_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4546:1: ruleClass_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__NameAssignment_1_09158);
            ruleClass_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__NameAssignment_1_0"


    // $ANTLR start "rule__Type_declaration__NameAssignment_1_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4555:1: rule__Type_declaration__NameAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4559:1: ( ( ruleInterface_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4560:1: ( ruleInterface_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4560:1: ( ruleInterface_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4561:1: ruleInterface_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__NameAssignment_1_19189);
            ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__NameAssignment_1_1"


    // $ANTLR start "rule__Interface_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4570:1: rule__Interface_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4574:1: ( ( ruleModifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4575:1: ( ruleModifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4575:1: ( ruleModifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4576:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_09220);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Interface_declaration__InterfaceNameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4585:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4589:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4590:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4590:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4591:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_29251); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__InterfaceNameAssignment_2"


    // $ANTLR start "rule__Interface_declaration__ExtendAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4600:1: rule__Interface_declaration__ExtendAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__ExtendAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4604:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4605:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4605:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4606:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendAssignment_3_19282);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__ExtendAssignment_3_1"


    // $ANTLR start "rule__Interface_declaration__ExtendsAssignment_3_2_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4615:1: rule__Interface_declaration__ExtendsAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4619:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4620:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4620:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4621:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendsAssignment_3_2_19313);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__ExtendsAssignment_3_2_1"


    // $ANTLR start "rule__Class_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4630:1: rule__Class_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4634:1: ( ( ruleModifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4635:1: ( ruleModifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4635:1: ( ruleModifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4636:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_09344);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Class_declaration__ClassNameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4645:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4649:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4650:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4650:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4651:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_29375); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ClassNameAssignment_2"


    // $ANTLR start "rule__Class_declaration__ExtendAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4660:1: rule__Class_declaration__ExtendAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ExtendAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4664:1: ( ( ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4665:1: ( ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4665:1: ( ruleClass_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4666:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ExtendAssignment_3_19406);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ExtendAssignment_3_1"


    // $ANTLR start "rule__Class_declaration__ImplementAssignment_4_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4675:1: rule__Class_declaration__ImplementAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__ImplementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4679:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4680:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4680:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4681:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementAssignment_4_19437);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ImplementAssignment_4_1"


    // $ANTLR start "rule__Class_declaration__ImplementsAssignment_4_2_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4690:1: rule__Class_declaration__ImplementsAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__ImplementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4694:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4695:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4695:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4696:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementsAssignment_4_2_19468);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ImplementsAssignment_4_2_1"


    // $ANTLR start "rule__Class_declaration__FieldsAssignment_6"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4705:1: rule__Class_declaration__FieldsAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4709:1: ( ( ruleField_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4710:1: ( ruleField_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4710:1: ( ruleField_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4711:1: ruleField_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsAssignment_69499);
            ruleField_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__FieldsAssignment_6"


    // $ANTLR start "rule__Field_declaration__DocAssignment_0_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4720:1: rule__Field_declaration__DocAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__DocAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4724:1: ( ( RULE_DOC_COMMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4725:1: ( RULE_DOC_COMMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4725:1: ( RULE_DOC_COMMENT )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4726:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__DocAssignment_0_09530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__DocAssignment_0_0"


    // $ANTLR start "rule__Field_declaration__NameAssignment_0_1_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4735:1: rule__Field_declaration__NameAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4739:1: ( ( ruleVariable_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4740:1: ( ruleVariable_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4740:1: ( ruleVariable_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4741:1: ruleVariable_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__NameAssignment_0_1_09561);
            ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_0_1_0"


    // $ANTLR start "rule__Field_declaration__NameAssignment_0_1_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4750:1: rule__Field_declaration__NameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4754:1: ( ( ruleConstructor_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4755:1: ( ruleConstructor_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4755:1: ( ruleConstructor_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4756:1: ruleConstructor_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__NameAssignment_0_1_19592);
            ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_0_1_1"


    // $ANTLR start "rule__Field_declaration__NameAssignment_0_1_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4765:1: rule__Field_declaration__NameAssignment_0_1_2 : ( ruleMethod_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4769:1: ( ( ruleMethod_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4770:1: ( ruleMethod_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4770:1: ( ruleMethod_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4771:1: ruleMethod_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__NameAssignment_0_1_29623);
            ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_0_1_2"


    // $ANTLR start "rule__Field_declaration__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4780:1: rule__Field_declaration__NameAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4784:1: ( ( ruleStatic_initializer ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4785:1: ( ruleStatic_initializer )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4785:1: ( ruleStatic_initializer )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4786:1: ruleStatic_initializer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__NameAssignment_19654);
            ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_1"


    // $ANTLR start "rule__Field_declaration__DebugAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4795:1: rule__Field_declaration__DebugAssignment_2 : ( ( ';' ) ) ;
    public final void rule__Field_declaration__DebugAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4799:1: ( ( ( ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4800:1: ( ( ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4800:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4801:1: ( ';' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4802:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4803:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Field_declaration__DebugAssignment_29690); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__DebugAssignment_2"


    // $ANTLR start "rule__Method_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4818:1: rule__Method_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Method_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4822:1: ( ( ruleModifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4823:1: ( ruleModifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4823:1: ( ruleModifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4824:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersAssignment_09729);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Method_declaration__TypeAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4833:1: rule__Method_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Method_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4837:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4838:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4838:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4839:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Method_declaration__TypeAssignment_19760);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__TypeAssignment_1"


    // $ANTLR start "rule__Method_declaration__NameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4848:1: rule__Method_declaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method_declaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4852:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4853:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4853:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4854:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method_declaration__NameAssignment_29791); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__NameAssignment_2"


    // $ANTLR start "rule__Method_declaration__ParameterAssignment_4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4863:1: rule__Method_declaration__ParameterAssignment_4 : ( ruleParameter_list ) ;
    public final void rule__Method_declaration__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4867:1: ( ( ruleParameter_list ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4868:1: ( ruleParameter_list )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4868:1: ( ruleParameter_list )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4869:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterAssignment_49822);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__ParameterAssignment_4"


    // $ANTLR start "rule__Method_declaration__StatementAssignment_7_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4878:1: rule__Method_declaration__StatementAssignment_7_0 : ( ruleStatement_block ) ;
    public final void rule__Method_declaration__StatementAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4882:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4883:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4883:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4884:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementAssignment_7_09853);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__StatementAssignment_7_0"


    // $ANTLR start "rule__Method_declaration__DebugAssignment_7_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4893:1: rule__Method_declaration__DebugAssignment_7_1 : ( ( ';' ) ) ;
    public final void rule__Method_declaration__DebugAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4897:1: ( ( ( ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4898:1: ( ( ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4898:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4899:1: ( ';' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 
            }
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4900:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4901:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Method_declaration__DebugAssignment_7_19889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__DebugAssignment_7_1"


    // $ANTLR start "rule__Constructor_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4916:1: rule__Constructor_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Constructor_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4920:1: ( ( ruleModifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4921:1: ( ruleModifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4921:1: ( ruleModifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4922:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersAssignment_09928);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Constructor_declaration__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4931:1: rule__Constructor_declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4935:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4936:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4936:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4937:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameAssignment_19959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__NameAssignment_1"


    // $ANTLR start "rule__Constructor_declaration__ParametersAssignment_3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4946:1: rule__Constructor_declaration__ParametersAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4950:1: ( ( ruleParameter_list ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4951:1: ( ruleParameter_list )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4951:1: ( ruleParameter_list )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4952:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParametersAssignment_39990);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__ParametersAssignment_3"


    // $ANTLR start "rule__Constructor_declaration__StatementAssignment_5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4961:1: rule__Constructor_declaration__StatementAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4965:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4966:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4966:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4967:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementAssignment_510021);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__StatementAssignment_5"


    // $ANTLR start "rule__Parameter_list__ParameterAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4976:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4980:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4981:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4981:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4982:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_010052);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__ParameterAssignment_0"


    // $ANTLR start "rule__Parameter_list__ParametersAssignment_1_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4991:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4995:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4996:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4996:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4997:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_110083);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5006:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5010:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5011:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5011:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5012:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_010114);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5021:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5025:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5026:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5026:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5027:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_110145); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Variable_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5036:1: rule__Variable_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Variable_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5040:1: ( ( ruleModifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5041:1: ( ruleModifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5041:1: ( ruleModifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5042:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersAssignment_010176);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Variable_declaration__TypeAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5051:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5055:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5056:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5056:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5057:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_110207);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__TypeAssignment_1"


    // $ANTLR start "rule__Variable_declaration__NameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5066:1: rule__Variable_declaration__NameAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5070:1: ( ( ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5071:1: ( ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5071:1: ( ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5072:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameAssignment_210238);
            ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__NameAssignment_2"


    // $ANTLR start "rule__Variable_declaration__NamesAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5081:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5085:1: ( ( ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5086:1: ( ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5086:1: ( ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5087:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_110269);
            ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__NamesAssignment_3_1"


    // $ANTLR start "rule__Variable_declarator__NameAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5096:1: rule__Variable_declarator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5100:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5101:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5101:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5102:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameAssignment_010300); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__NameAssignment_0"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5111:1: rule__Type__NameAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5115:1: ( ( ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5116:1: ( ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5116:1: ( ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5117:1: ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__NameAssignment_010331);
            ruleType_specifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_0"


    // $ANTLR start "rule__Static_initializer__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5126:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5130:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5131:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5131:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5132:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_110362);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__NameAssignment_1"


    // $ANTLR start "rule__Statement_block__StatementsAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5141:1: rule__Statement_block__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5145:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5146:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5146:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5147:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatementsAssignment_210393);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__StatementsAssignment_2"


    // $ANTLR start "rule__Statement__TryAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5156:1: rule__Statement__TryAssignment_1 : ( ruleTry_statement ) ;
    public final void rule__Statement__TryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5160:1: ( ( ruleTry_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5161:1: ( ruleTry_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5161:1: ( ruleTry_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5162:1: ruleTry_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTryTry_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_rule__Statement__TryAssignment_110424);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getTryTry_statementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TryAssignment_1"


    // $ANTLR start "rule__Statement__NameAssignment_2_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5171:1: rule__Statement__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5175:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5176:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5176:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5177:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_2_010455); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_2_0"


    // $ANTLR start "rule__Statement__StatementAssignment_2_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5186:1: rule__Statement__StatementAssignment_2_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5190:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5191:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5191:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5192:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_2_210486);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_2_2"


    // $ANTLR start "rule__Statement__NameAssignment_3_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5201:1: rule__Statement__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5205:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5206:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5206:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5207:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_3_210517); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_3_2"


    // $ANTLR start "rule__Statement__NameAssignment_4_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5216:1: rule__Statement__NameAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5220:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5221:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5221:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5222:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_4_210548); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_4_2"


    // $ANTLR start "rule__Try_statement__TryAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5231:1: rule__Try_statement__TryAssignment_0 : ( RULE_TRY ) ;
    public final void rule__Try_statement__TryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5235:1: ( ( RULE_TRY ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5236:1: ( RULE_TRY )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5236:1: ( RULE_TRY )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5237:1: RULE_TRY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryTRYTerminalRuleCall_0_0()); 
            }
            match(input,RULE_TRY,FOLLOW_RULE_TRY_in_rule__Try_statement__TryAssignment_010579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryTRYTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__TryAssignment_0"


    // $ANTLR start "rule__Try_statement__TryStatementAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5246:1: rule__Try_statement__TryStatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__TryStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5250:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5251:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5251:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5252:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_110610);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__TryStatementAssignment_1"


    // $ANTLR start "rule__Try_statement__CatchsAssignment_2_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5261:1: rule__Try_statement__CatchsAssignment_2_0 : ( RULE_CATCH ) ;
    public final void rule__Try_statement__CatchsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5265:1: ( ( RULE_CATCH ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5266:1: ( RULE_CATCH )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5266:1: ( RULE_CATCH )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5267:1: RULE_CATCH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchsCATCHTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_rule__Try_statement__CatchsAssignment_2_010641); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getCatchsCATCHTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__CatchsAssignment_2_0"


    // $ANTLR start "rule__Try_statement__ParametersAssignment_2_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5276:1: rule__Try_statement__ParametersAssignment_2_2 : ( ruleParameter ) ;
    public final void rule__Try_statement__ParametersAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5280:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5281:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5281:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5282:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_210672);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__ParametersAssignment_2_2"


    // $ANTLR start "rule__Try_statement__CatchStatementsAssignment_2_4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5291:1: rule__Try_statement__CatchStatementsAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Try_statement__CatchStatementsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5295:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5296:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5296:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5297:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__CatchStatementsAssignment_2_410703);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getCatchStatementsStatementParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__CatchStatementsAssignment_2_4"


    // $ANTLR start "rule__Try_statement__FinallyAssignment_3_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5306:1: rule__Try_statement__FinallyAssignment_3_0 : ( RULE_FINALLY ) ;
    public final void rule__Try_statement__FinallyAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5310:1: ( ( RULE_FINALLY ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5311:1: ( RULE_FINALLY )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5311:1: ( RULE_FINALLY )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5312:1: RULE_FINALLY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyFINALLYTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_rule__Try_statement__FinallyAssignment_3_010734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getFinallyFINALLYTerminalRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__FinallyAssignment_3_0"


    // $ANTLR start "rule__Try_statement__FinallyStatementAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5321:1: rule__Try_statement__FinallyStatementAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__FinallyStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5325:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5326:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5326:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5327:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__FinallyStatementAssignment_3_110765);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Try_statement__FinallyStatementAssignment_3_1"


    // $ANTLR start "rule__Package_statement__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5336:1: rule__Package_statement__NameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5340:1: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5341:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5341:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5342:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__NameAssignment_110796);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__NameAssignment_1"


    // $ANTLR start "rule__Import_statement__ClassnameAssignment_1_0_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5351:1: rule__Import_statement__ClassnameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassnameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5355:1: ( ( ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5356:1: ( ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5356:1: ( ruleClass_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5357:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassnameAssignment_1_0_010827);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__ClassnameAssignment_1_0_0"


    // $ANTLR start "rule__Import_statement__PackagenameAssignment_1_1_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5366:1: rule__Import_statement__PackagenameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PackagenameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5370:1: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5371:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5371:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5372:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PackagenameAssignment_1_1_010858);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__PackagenameAssignment_1_1_0"

    // $ANTLR start synpred50_InternalJava
    public final void synpred50_InternalJava_fragment() throws RecognitionException {   
        // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3790:2: ( rule__Try_statement__Group_2__0 )
        // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3790:2: rule__Try_statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_synpred50_InternalJava7672);
        rule__Try_statement__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalJava

    // $ANTLR start synpred51_InternalJava
    public final void synpred51_InternalJava_fragment() throws RecognitionException {   
        // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3818:2: ( rule__Try_statement__Group_3__0 )
        // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3818:2: rule__Try_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_synpred51_InternalJava7730);
        rule__Try_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalJava

    // Delegated rules

    public final boolean synpred50_InternalJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalJava_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA2_eotS =
        "\5\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\3\4\2\uffff";
    static final String DFA2_maxS =
        "\3\35\2\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\22\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\22\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\22\uffff\1\4\4\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "761:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\23\uffff";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\3\4\12\6\1\27\1\uffff\1\6\2\uffff\1\6";
    static final String DFA4_maxS =
        "\3\26\10\41\1\46\2\41\1\uffff\1\6\2\uffff\1\46";
    static final String DFA4_acceptS =
        "\16\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\13\10\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\1\1\2\1\13\10\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\1\1\2\1\13\10\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\32\uffff\1\14",
            "\1\15\30\uffff\1\16\1\uffff\1\14\4\uffff\1\17",
            "\1\15\32\uffff\1\14",
            "\1\21\4\uffff\1\21\2\uffff\1\20\1\uffff\1\21",
            "",
            "\1\22",
            "",
            "",
            "\1\15\32\uffff\1\14\4\uffff\1\17"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "811:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_2 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\1\6\1\27\1\6\2\uffff\1\27";
    static final String DFA9_maxS =
        "\1\6\1\50\1\6\2\uffff\1\50";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\3\16\uffff\1\2\1\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\16\uffff\1\2\1\uffff\1\4"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1009:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__ElementsAssignment_in_ruleHead100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0_in_ruleCompilation_unit160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0_in_ruleType_declaration220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0_in_ruleInterface_declaration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0_in_ruleClass_declaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_in_ruleField_declaration400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0_in_ruleMethod_declaration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__0_in_rulePackage_name_aux1360 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__NameAssignment_1_0_in_rule__Type_declaration__Alternatives_11575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__NameAssignment_1_1_in_rule__Type_declaration__Alternatives_11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_1_in_rule__Field_declaration__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__DebugAssignment_2_in_rule__Field_declaration__Alternatives1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__StatementAssignment_7_0_in_rule__Method_declaration__Alternatives_71764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__DebugAssignment_7_1_in_rule__Method_declaration__Alternatives_71782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type_specifier__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type_specifier__Alternatives1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type_specifier__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type_specifier__Alternatives1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type_specifier__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type_specifier__Alternatives1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type_specifier__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type_specifier__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__TryAssignment_1_in_rule__Statement__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02227 = new BitSet(new long[]{0x00000080210000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__PackageAssignment_0_in_rule__Compilation_unit__Group__0__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12288 = new BitSet(new long[]{0x00000080210000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2318 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Type_declarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2376 = new BitSet(new long[]{0x00000000210000B2L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02413 = new BitSet(new long[]{0x00000000210000B0L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__DocAssignment_0_in_rule__Type_declaration__Group__0__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12474 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type_declaration__Group__2__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02599 = new BitSet(new long[]{0x00000000210000B0L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2629 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22722 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32782 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42843 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Interface_declaration__Group__4__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Interface_declaration__Group__5__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__02979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Interface_declaration__Group_3__0__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13038 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ExtendAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3125 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Interface_declaration__Group_3_2__0__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ExtendsAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03285 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3315 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Class_declaration__Group__1__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23408 = new BitSet(new long[]{0x000000004A000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33468 = new BitSet(new long[]{0x000000004A000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43529 = new BitSet(new long[]{0x000000004A000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53590 = new BitSet(new long[]{0x0000000004FF80F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group__5__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63652 = new BitSet(new long[]{0x0000000004FF80F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsAssignment_6_in_rule__Class_declaration__Group__6__Impl3682 = new BitSet(new long[]{0x0000000000FF80F2L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group__7__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03788 = new BitSet(new long[]{0x00000000007F8070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class_declaration__Group_3__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ExtendAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Class_declaration__Group_4__0__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13973 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ImplementAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4060 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04097 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Class_declaration__Group_4_2__0__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ImplementsAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04220 = new BitSet(new long[]{0x00000000007F80F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__DocAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04342 = new BitSet(new long[]{0x00000000007F80F0L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ModifiersAssignment_0_in_rule__Method_declaration__Group__0__Impl4372 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14403 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__TypeAssignment_1_in_rule__Method_declaration__Group__1__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24463 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__NameAssignment_2_in_rule__Method_declaration__Group__2__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34523 = new BitSet(new long[]{0x00000001007F8070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Method_declaration__Group__3__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44585 = new BitSet(new long[]{0x00000001007F8070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ParameterAssignment_4_in_rule__Method_declaration__Group__4__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__54646 = new BitSet(new long[]{0x0000000202800000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__54649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Method_declaration__Group__5__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__64708 = new BitSet(new long[]{0x0000000202800000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__64711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Method_declaration__Group__6__Impl4740 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__74773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04846 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersAssignment_0_in_rule__Constructor_declaration__Group__0__Impl4876 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__14907 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__14910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameAssignment_1_in_rule__Constructor_declaration__Group__1__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__24967 = new BitSet(new long[]{0x00000001007F8070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__24970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Constructor_declaration__Group__2__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35029 = new BitSet(new long[]{0x00000001007F8070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParametersAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45090 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Constructor_declaration__Group__4__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05221 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5308 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05343 = new BitSet(new long[]{0x00000000007F8070L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Parameter_list__Group_1__0__Impl5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15526 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Parameter__Group__2__Impl5615 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__05654 = new BitSet(new long[]{0x00000000007F8070L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__05657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersAssignment_0_in_rule__Variable_declaration__Group__0__Impl5684 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__15715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__15718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__25775 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__25778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameAssignment_2_in_rule__Variable_declaration__Group__2__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__35835 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__35838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl5865 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__45896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Variable_declaration__Group__4__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__05965 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__05968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Variable_declaration__Group_3__0__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06088 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameAssignment_0_in_rule__Variable_declarator__Group__0__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Variable_declarator__Group__1__Impl6177 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06214 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Group__1__Impl6303 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06340 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Static_initializer__Group__0__Impl6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16521 = new BitSet(new long[]{0x0000001806800140L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Statement_block__Group__1__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26583 = new BitSet(new long[]{0x0000001806800140L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__3_in_rule__Statement_block__Group__26586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatementsAssignment_2_in_rule__Statement_block__Group__2__Impl6613 = new BitSet(new long[]{0x0000001802800142L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__3__Impl_in_rule__Statement_block__Group__36644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Statement_block__Group__3__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__06711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__06714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_2_0_in_rule__Statement__Group_2__0__Impl6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__16771 = new BitSet(new long[]{0x0000001802800140L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__16774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_2__1__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__26833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_2_2_in_rule__Statement__Group_2__2__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__06896 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__06899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__16957 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__16960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_3__1__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__27019 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__3_in_rule__Statement__Group_3__27022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_3_2_in_rule__Statement__Group_3__2__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__3__Impl_in_rule__Statement__Group_3__37080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement__Group_3__3__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__07147 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__07150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__17208 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__17211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_4__1__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__27270 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__27273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_4_2_in_rule__Statement__Group_4__2__Impl7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__37331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement__Group_4__3__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__07398 = new BitSet(new long[]{0x0000001802800140L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__07401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__17459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement__Group_5__1__Impl7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__07522 = new BitSet(new long[]{0x0000001802800140L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__07525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__TryAssignment_0_in_rule__Try_statement__Group__0__Impl7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__17582 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__17585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__27642 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__27645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl7672 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__37703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__07769 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__07772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__CatchsAssignment_2_0_in_rule__Try_statement__Group_2__0__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__17829 = new BitSet(new long[]{0x00000000007F8070L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__17832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Try_statement__Group_2__1__Impl7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__27891 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__27894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__37951 = new BitSet(new long[]{0x0000001802800140L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__37954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Try_statement__Group_2__3__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__48013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__CatchStatementsAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__08080 = new BitSet(new long[]{0x0000001802800140L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__08083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__FinallyAssignment_3_0_in_rule__Try_statement__Group_3__0__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__18140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__FinallyStatementAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__08201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__08204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Package_statement__Group__0__Impl8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__18263 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__18266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__NameAssignment_1_in_rule__Package_statement__Group__1__Impl8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__28323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Package_statement__Group__2__Impl8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__08388 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__08391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__18447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rule__Package_name__Group__1__Impl8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__0__Impl_in_rule__Package_name_aux__Group__08507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__1_in_rule__Package_name_aux__Group__08510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Package_name_aux__Group__0__Impl8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__1__Impl_in_rule__Package_name_aux__Group__18569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_aux__Group__1__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__08629 = new BitSet(new long[]{0x00000000007F8070L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__08632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Import_statement__Group__0__Impl8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__18691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__08752 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__08755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassnameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Import_statement__Group_1_0__1__Impl8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__08875 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__08878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PackagenameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__18935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Import_statement__Group_1_1__1__Impl8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Head__ElementsAssignment9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__PackageAssignment_09034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_19065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__Type_declarationsAssignment_29096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__DocAssignment_09127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__NameAssignment_1_09158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__NameAssignment_1_19189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_09220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_29251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendAssignment_3_19282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendsAssignment_3_2_19313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_09344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_29375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ExtendAssignment_3_19406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementAssignment_4_19437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementsAssignment_4_2_19468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsAssignment_69499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__DocAssignment_0_09530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__NameAssignment_0_1_09561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__NameAssignment_0_1_19592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__NameAssignment_0_1_29623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__NameAssignment_19654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field_declaration__DebugAssignment_29690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersAssignment_09729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method_declaration__TypeAssignment_19760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method_declaration__NameAssignment_29791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterAssignment_49822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementAssignment_7_09853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Method_declaration__DebugAssignment_7_19889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersAssignment_09928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameAssignment_19959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParametersAssignment_39990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementAssignment_510021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_010052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_110083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_010114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_110145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersAssignment_010176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_110207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameAssignment_210238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_110269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameAssignment_010300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__NameAssignment_010331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_110362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatementsAssignment_210393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_rule__Statement__TryAssignment_110424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_2_010455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_2_210486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_3_210517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_4_210548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRY_in_rule__Try_statement__TryAssignment_010579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_110610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_rule__Try_statement__CatchsAssignment_2_010641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_210672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__CatchStatementsAssignment_2_410703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_rule__Try_statement__FinallyAssignment_3_010734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__FinallyStatementAssignment_3_110765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__NameAssignment_110796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassnameAssignment_1_0_010827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PackagenameAssignment_1_1_010858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_synpred50_InternalJava7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_synpred51_InternalJava7730 = new BitSet(new long[]{0x0000000000000002L});

}