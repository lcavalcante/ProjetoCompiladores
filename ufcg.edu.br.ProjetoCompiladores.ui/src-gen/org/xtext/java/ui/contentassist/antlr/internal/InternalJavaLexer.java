package org.xtext.java.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaLexer extends Lexer {
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

    public InternalJavaLexer() {;} 
    public InternalJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:11:7: ( 'boolean' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:11:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12:7: ( 'byte' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:13:7: ( 'char' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:13:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:14:7: ( 'short' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:14:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:15:7: ( 'int' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:15:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:16:7: ( 'float' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:16:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:17:7: ( 'long' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:17:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:18:7: ( 'double' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:18:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:19:7: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:20:7: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:20:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:21:7: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:22:7: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:23:7: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:23:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:24:7: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:25:7: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:25:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:26:7: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:26:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:27:7: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:28:7: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:29:7: ( '[]' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:29:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:30:7: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:30:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:31:7: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:31:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:32:7: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:32:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:33:7: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:33:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:34:7: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:35:7: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:35:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:36:7: ( '.*;;' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:36:9: '.*;;'
            {
            match(".*;;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:10: ( ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:13: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:22: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:32: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:44: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:52: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:61: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:76: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:87: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5382:100: 'transient'
                    {
                    match("transient"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5384:13: ( 'static' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5384:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_TRY"
    public final void mRULE_TRY() throws RecognitionException {
        try {
            int _type = RULE_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5386:10: ( 'try' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5386:12: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRY"

    // $ANTLR start "RULE_CATCH"
    public final void mRULE_CATCH() throws RecognitionException {
        try {
            int _type = RULE_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5388:12: ( 'catch' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5388:14: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CATCH"

    // $ANTLR start "RULE_FINALLY"
    public final void mRULE_FINALLY() throws RecognitionException {
        try {
            int _type = RULE_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5390:14: ( 'finally' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5390:16: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FINALLY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5392:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5392:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5392:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5394:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5394:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5394:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5394:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:41: ( '\\r' )? '\\n'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5396:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5398:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5398:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5398:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5400:16: ( . )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5400:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5402:18: ( '/**' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:5402:20: '/**'
            {
            match("/**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_MOD | RULE_STATIC | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_DOC_COMMENT )
        int alt8=37;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:166: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 28 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:175: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 29 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:187: RULE_TRY
                {
                mRULE_TRY(); 

                }
                break;
            case 30 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:196: RULE_CATCH
                {
                mRULE_CATCH(); 

                }
                break;
            case 31 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:207: RULE_FINALLY
                {
                mRULE_FINALLY(); 

                }
                break;
            case 32 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:220: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:228: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:244: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:260: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:268: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 37 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:283: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\141\1\162\4\uffff\1\150\1\uffff\1\151\4\uffff";
    static final String DFA1_maxS =
        "\1\164\1\165\4\uffff\1\162\1\uffff\1\157\4\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\uffff\1\10\1\11\1\2\1\3";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\4\uffff\1\2\7\uffff\1\3\1\uffff\1\1\2\uffff\1\4\1\6",
            "\1\10\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11\11\uffff\1\12",
            "",
            "\1\13\5\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "5382:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA8_eotS =
        "\1\uffff\7\35\3\uffff\1\35\3\uffff\1\31\1\uffff\1\35\1\70\3\35\1\uffff\1\31\2\uffff\3\35\1\uffff\15\35\3\uffff\1\35\5\uffff\3\35\2\uffff\4\35\3\uffff\12\35\1\147\16\35\1\167\1\170\1\uffff\1\35\1\172\1\35\1\174\7\35\1\uffff\4\35\1\u0088\12\35\2\uffff\1\35\1\uffff\1\u0094\1\uffff\1\u0095\1\35\1\u0097\1\u0098\5\35\1\u009e\1\u00a0\1\uffff\13\35\2\uffff\1\35\2\uffff\1\35\1\u00ae\2\35\1\u00b1\1\uffff\1\35\1\uffff\1\u00b3\2\35\1\u00a0\2\35\1\u00a0\3\35\1\u00bb\2\35\1\uffff\2\35\1\uffff\1\u00c0\1\uffff\1\u00c1\1\u00c2\1\u00a0\4\35\1\uffff\1\u00c7\3\35\3\uffff\1\35\1\u00a0\2\35\1\uffff\1\35\1\u00cf\1\35\1\u00a0\1\35\1\u00a0\1\35\1\uffff\1\u00d3\1\u00a0\1\35\1\uffff\1\u00a0";
    static final String DFA8_eofS =
        "\u00d5\uffff";
    static final String DFA8_minS =
        "\1\0\1\157\1\141\1\150\1\155\1\151\2\157\3\uffff\1\170\3\uffff\1\135\1\uffff\1\141\1\52\1\141\1\142\1\150\1\uffff\1\52\2\uffff\1\157\1\164\1\145\1\uffff\2\141\1\156\1\164\1\157\1\156\1\141\1\164\1\160\1\157\2\156\1\165\3\uffff\1\164\5\uffff\1\143\1\142\1\151\2\uffff\1\164\1\163\1\162\1\141\1\0\2\uffff\1\154\1\145\1\141\1\162\1\163\1\164\1\143\1\162\1\143\1\164\1\44\1\154\2\141\1\147\1\142\1\145\1\153\1\154\1\166\1\164\1\151\1\164\1\145\1\156\1\44\1\0\1\uffff\1\145\1\44\1\153\1\44\1\163\1\151\1\150\1\164\1\150\1\151\1\162\1\uffff\1\145\1\162\1\164\1\154\1\44\1\154\1\156\1\141\1\151\1\141\1\145\1\166\1\162\1\141\1\163\2\uffff\1\141\1\uffff\1\44\1\uffff\1\44\1\156\2\44\1\162\1\143\1\146\1\155\1\164\2\44\1\uffff\1\145\1\144\1\147\1\143\1\164\1\143\1\145\1\141\1\144\1\151\1\156\2\uffff\1\165\2\uffff\1\157\1\44\1\141\1\145\1\44\1\uffff\1\171\1\uffff\1\44\1\163\1\145\1\44\1\145\1\164\1\44\1\143\1\163\1\145\1\44\1\145\1\156\1\uffff\1\143\1\156\1\uffff\1\44\1\uffff\3\44\1\145\1\164\1\141\1\156\1\uffff\1\44\1\151\1\145\1\164\3\uffff\1\144\1\44\1\146\1\164\1\uffff\1\172\1\44\1\163\1\44\1\145\1\44\1\145\1\uffff\2\44\1\144\1\uffff\1\44";
    static final String DFA8_maxS =
        "\1\uffff\1\171\1\157\1\171\1\156\1\154\2\157\3\uffff\1\170\3\uffff\1\135\1\uffff\1\165\1\52\1\141\1\142\1\162\1\uffff\1\57\2\uffff\1\157\1\164\1\145\1\uffff\2\141\1\156\1\164\1\157\1\156\1\141\1\164\1\160\1\157\2\156\1\165\3\uffff\1\164\5\uffff\1\143\1\142\1\157\2\uffff\1\164\1\163\1\162\1\171\1\uffff\2\uffff\1\154\1\145\1\141\1\162\1\163\1\164\1\143\1\162\1\143\1\164\1\uffff\1\157\2\141\1\147\1\142\1\145\1\153\1\154\1\166\1\164\1\151\1\164\1\145\1\156\2\uffff\1\uffff\1\145\1\uffff\1\153\1\uffff\1\163\1\151\1\150\1\164\1\150\1\151\1\162\1\uffff\1\145\1\162\1\164\1\154\1\uffff\1\154\1\156\1\141\1\151\1\141\1\145\1\166\1\162\1\141\1\163\2\uffff\1\141\1\uffff\1\uffff\1\uffff\1\uffff\1\156\2\uffff\1\162\1\143\1\146\1\155\1\164\2\uffff\1\uffff\1\145\1\144\1\147\1\143\1\164\1\143\1\145\1\141\1\144\1\151\1\156\2\uffff\1\165\2\uffff\1\157\1\uffff\1\141\1\145\1\uffff\1\uffff\1\171\1\uffff\1\uffff\1\163\1\145\1\uffff\1\145\1\164\1\uffff\1\143\1\163\1\145\1\uffff\1\145\1\156\1\uffff\1\143\1\156\1\uffff\1\uffff\1\uffff\3\uffff\1\145\1\164\1\141\1\156\1\uffff\1\uffff\1\151\1\145\1\164\3\uffff\1\144\1\uffff\1\146\1\164\1\uffff\1\172\1\uffff\1\163\1\uffff\1\145\1\uffff\1\145\1\uffff\2\uffff\1\144\1\uffff\1\uffff";
    static final String DFA8_acceptS =
        "\10\uffff\1\11\1\13\1\14\1\uffff\1\16\1\21\1\22\1\uffff\1\24\5\uffff\1\40\1\uffff\1\43\1\44\3\uffff\1\40\15\uffff\1\11\1\13\1\14\1\uffff\1\16\1\21\1\22\1\23\1\24\3\uffff\1\32\1\30\5\uffff\1\42\1\43\33\uffff\1\41\13\uffff\1\5\17\uffff\1\35\1\45\1\uffff\1\2\1\uffff\1\3\13\uffff\1\7\13\uffff\1\25\1\17\1\uffff\1\36\1\4\5\uffff\1\6\1\uffff\1\33\15\uffff\1\34\2\uffff\1\31\1\uffff\1\10\7\uffff\1\1\4\uffff\1\37\1\15\1\27\4\uffff\1\26\7\uffff\1\12\3\uffff\1\20\1\uffff";
    static final String DFA8_specialS =
        "\1\0\74\uffff\1\2\34\uffff\1\1\172\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\3\31\1\26\3\31\1\15\1\16\2\31\1\14\1\31\1\22\1\27\12\31\1\20\1\10\5\31\32\26\1\17\3\31\1\26\1\31\1\24\1\1\1\2\1\7\1\13\1\5\2\26\1\4\2\26\1\6\1\26\1\23\1\26\1\21\2\26\1\3\1\25\6\26\1\11\1\31\1\12\uff82\31",
            "\1\32\2\uffff\1\34\6\uffff\1\33",
            "\1\41\6\uffff\1\36\3\uffff\1\37\2\uffff\1\40",
            "\1\42\13\uffff\1\44\4\uffff\1\43",
            "\1\46\1\45",
            "\1\50\2\uffff\1\47",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "\1\56",
            "",
            "",
            "",
            "\1\62",
            "",
            "\1\64\20\uffff\1\66\2\uffff\1\65",
            "\1\67",
            "\1\71",
            "\1\72",
            "\1\73\11\uffff\1\74",
            "",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123\5\uffff\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130\27\uffff\1\131",
            "\52\133\1\132\uffd5\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\146\25\35\105\uffff\uff40\35",
            "\1\150\2\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\0\133",
            "",
            "\1\171",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\173",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u0096",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\u009f\16\35\105\uffff\uff40\35",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00af",
            "\1\u00b0",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "",
            "\1\u00b2",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00b4",
            "\1\u00b5",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00b6",
            "\1\u00b7",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "\1\u00cb",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00d0",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00d1",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00d2",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35",
            "\1\u00d4",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35\105\uffff\uff40\35"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_MOD | RULE_STATIC | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_DOC_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='b') ) {s = 1;}

                        else if ( (LA8_0=='c') ) {s = 2;}

                        else if ( (LA8_0=='s') ) {s = 3;}

                        else if ( (LA8_0=='i') ) {s = 4;}

                        else if ( (LA8_0=='f') ) {s = 5;}

                        else if ( (LA8_0=='l') ) {s = 6;}

                        else if ( (LA8_0=='d') ) {s = 7;}

                        else if ( (LA8_0==';') ) {s = 8;}

                        else if ( (LA8_0=='{') ) {s = 9;}

                        else if ( (LA8_0=='}') ) {s = 10;}

                        else if ( (LA8_0=='e') ) {s = 11;}

                        else if ( (LA8_0==',') ) {s = 12;}

                        else if ( (LA8_0=='(') ) {s = 13;}

                        else if ( (LA8_0==')') ) {s = 14;}

                        else if ( (LA8_0=='[') ) {s = 15;}

                        else if ( (LA8_0==':') ) {s = 16;}

                        else if ( (LA8_0=='p') ) {s = 17;}

                        else if ( (LA8_0=='.') ) {s = 18;}

                        else if ( (LA8_0=='n') ) {s = 19;}

                        else if ( (LA8_0=='a') ) {s = 20;}

                        else if ( (LA8_0=='t') ) {s = 21;}

                        else if ( (LA8_0=='$'||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='g' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='k')||LA8_0=='m'||LA8_0=='o'||(LA8_0>='q' && LA8_0<='r')||(LA8_0>='u' && LA8_0<='z')) ) {s = 22;}

                        else if ( (LA8_0=='/') ) {s = 23;}

                        else if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {s = 24;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||(LA8_0>='!' && LA8_0<='#')||(LA8_0>='%' && LA8_0<='\'')||(LA8_0>='*' && LA8_0<='+')||LA8_0=='-'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='<' && LA8_0<='@')||(LA8_0>='\\' && LA8_0<='^')||LA8_0=='`'||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_90 = input.LA(1);

                        s = -1;
                        if ( ((LA8_90>='\u0000' && LA8_90<='\uFFFF')) ) {s = 91;}

                        else s = 120;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_61 = input.LA(1);

                        s = -1;
                        if ( (LA8_61=='*') ) {s = 90;}

                        else if ( ((LA8_61>='\u0000' && LA8_61<=')')||(LA8_61>='+' && LA8_61<='\uFFFF')) ) {s = 91;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}