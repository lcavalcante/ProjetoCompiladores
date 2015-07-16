package org.xtext.java.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaLexer extends Lexer {
    public static final int RULE_EXP_EQUAL=43;
    public static final int RULE_DIFFERENT=39;
    public static final int RULE_ID=7;
    public static final int RULE_ANY_OTHER=83;
    public static final int RULE_HEXA=54;
    public static final int RULE_INSTANCEOF=21;
    public static final int RULE_OR=40;
    public static final int RULE_MODULE=32;
    public static final int RULE_OR_EQUAL=41;
    public static final int EOF=-1;
    public static final int RULE_STATIC=64;
    public static final int T__93=93;
    public static final int RULE_MOD=63;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_PACKAGE=77;
    public static final int T__90=90;
    public static final int RULE_EXCLAMATION=60;
    public static final int RULE_MULTIPLY_EQUAL=29;
    public static final int RULE_EXTENDS=8;
    public static final int RULE_WAT=45;
    public static final int RULE_CHAR=57;
    public static final int RULE_LEFT_PARENTHESIS=13;
    public static final int RULE_RIGHT_PARENTHESIS=12;
    public static final int RULE_R_ABS=14;
    public static final int RULE_AMPERSAND=51;
    public static final int RULE_INTERFACE=6;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_DIVIDE_EQUAL=31;
    public static final int RULE_INCREMENT=22;
    public static final int RULE_SUPER=19;
    public static final int RULE_EXPONENTIAL=79;
    public static final int RULE_BE=36;
    public static final int RULE_COMMA=9;
    public static final int RULE_TRY=74;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=80;
    public static final int RULE_BT=34;
    public static final int RULE_MINUS=26;
    public static final int RULE_STRING=56;
    public static final int RULE_DECIMAL_DIGITS=52;
    public static final int RULE_MULTIPLY=28;
    public static final int RULE_IMPORT=78;
    public static final int RULE_L_ABS=15;
    public static final int RULE_ABS=16;
    public static final int RULE_THIS=20;
    public static final int RULE_SE=37;
    public static final int RULE_IF=71;
    public static final int RULE_EXP=42;
    public static final int RULE_DOC_COMMENT=4;
    public static final int RULE_ST=35;
    public static final int RULE_SWITCH=65;
    public static final int RULE_DO=70;
    public static final int RULE_RETURN=73;
    public static final int RULE_FOR=68;
    public static final int RULE_EOL=5;
    public static final int RULE_MODULE_EQUAL=33;
    public static final int RULE_DIVIDE=30;
    public static final int RULE_NOT=59;
    public static final int RULE_FALSE=62;
    public static final int RULE_WHILE=69;
    public static final int RULE_L_SHIFT=48;
    public static final int RULE_PLUS_EQUAL=25;
    public static final int RULE_DECREMENT=23;
    public static final int RULE_R_SHIFT=49;
    public static final int RULE_FLOAT_TYPE_SUFIX=53;
    public static final int RULE_SUPER_SHIFT=50;
    public static final int RULE_R_CURLY_BRACE=10;
    public static final int RULE_DOUBLE_OR_EQUAL=44;
    public static final int RULE_LONG=55;
    public static final int RULE_PLUS=24;
    public static final int RULE_CASE=66;
    public static final int RULE_CATCH=75;
    public static final int RULE_EQUAL=17;
    public static final int RULE_R_SHIFT_EQUAL=47;
    public static final int RULE_SL_COMMENT=81;
    public static final int RULE_NULL=18;
    public static final int RULE_L_CURLY_BRACE=11;
    public static final int RULE_DEFAULT=67;
    public static final int RULE_TRUE=61;
    public static final int RULE_COLON=46;
    public static final int RULE_NEW=58;
    public static final int RULE_DOUBLE_EQUAL=38;
    public static final int RULE_MINUS_EQUAL=27;
    public static final int RULE_WS=82;
    public static final int RULE_ELSE=72;
    public static final int RULE_FINALLY=76;

    // delegates
    // delegators

    public InternalJavaLexer() {;} 
    public InternalJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g"; }

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:11:7: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:11:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:12:7: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:12:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:13:7: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:14:7: ( 'boolean' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:14:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:15:7: ( 'byte' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:15:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:16:7: ( 'char' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:16:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:17:7: ( 'short' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:17:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:18:7: ( 'int' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:19:7: ( 'float' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:19:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:20:7: ( 'long' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:20:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:21:7: ( 'double' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:21:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:22:7: ( 'void' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:22:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:23:7: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:23:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:24:7: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:24:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "RULE_INTERFACE"
    public final void mRULE_INTERFACE() throws RecognitionException {
        try {
            int _type = RULE_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5449:16: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5449:18: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERFACE"

    // $ANTLR start "RULE_EXTENDS"
    public final void mRULE_EXTENDS() throws RecognitionException {
        try {
            int _type = RULE_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5451:14: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5451:16: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDS"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5453:12: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5453:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_R_CURLY_BRACE"
    public final void mRULE_R_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = RULE_R_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5455:20: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5455:22: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_CURLY_BRACE"

    // $ANTLR start "RULE_L_CURLY_BRACE"
    public final void mRULE_L_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = RULE_L_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5457:20: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5457:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_CURLY_BRACE"

    // $ANTLR start "RULE_ABS"
    public final void mRULE_ABS() throws RecognitionException {
        try {
            int _type = RULE_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5459:10: ( '[]' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5459:12: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABS"

    // $ANTLR start "RULE_R_ABS"
    public final void mRULE_R_ABS() throws RecognitionException {
        try {
            int _type = RULE_R_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5461:12: ( '[' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5461:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_ABS"

    // $ANTLR start "RULE_L_ABS"
    public final void mRULE_L_ABS() throws RecognitionException {
        try {
            int _type = RULE_L_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5463:12: ( ']' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5463:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_ABS"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5465:12: ( '=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5465:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5467:11: ( 'NULL' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5467:13: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_THIS"
    public final void mRULE_THIS() throws RecognitionException {
        try {
            int _type = RULE_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5469:11: ( 'this' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5469:13: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THIS"

    // $ANTLR start "RULE_SUPER"
    public final void mRULE_SUPER() throws RecognitionException {
        try {
            int _type = RULE_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5471:12: ( 'super' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5471:14: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER"

    // $ANTLR start "RULE_INSTANCEOF"
    public final void mRULE_INSTANCEOF() throws RecognitionException {
        try {
            int _type = RULE_INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5473:17: ( 'instanceof' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5473:19: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INSTANCEOF"

    // $ANTLR start "RULE_L_SHIFT"
    public final void mRULE_L_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_L_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5475:14: ( '<<' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5475:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_SHIFT"

    // $ANTLR start "RULE_R_SHIFT"
    public final void mRULE_R_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_R_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5477:14: ( '>>' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5477:16: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_SHIFT"

    // $ANTLR start "RULE_SUPER_SHIFT"
    public final void mRULE_SUPER_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_SUPER_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5479:18: ( '>>>' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5479:20: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER_SHIFT"

    // $ANTLR start "RULE_R_SHIFT_EQUAL"
    public final void mRULE_R_SHIFT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_R_SHIFT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5481:20: ( '>>=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5481:22: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_SHIFT_EQUAL"

    // $ANTLR start "RULE_DOUBLE_OR_EQUAL"
    public final void mRULE_DOUBLE_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5483:22: ( '||=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5483:24: '||='
            {
            match("||="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_OR_EQUAL"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5485:9: ( '|' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5485:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_OR_EQUAL"
    public final void mRULE_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5487:15: ( '|=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5487:17: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_EQUAL"

    // $ANTLR start "RULE_EXP"
    public final void mRULE_EXP() throws RecognitionException {
        try {
            int _type = RULE_EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5489:10: ( '^' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5489:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP"

    // $ANTLR start "RULE_EXP_EQUAL"
    public final void mRULE_EXP_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EXP_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5491:16: ( '^=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5491:18: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP_EQUAL"

    // $ANTLR start "RULE_DOUBLE_EQUAL"
    public final void mRULE_DOUBLE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5493:19: ( '==' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5493:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_EQUAL"

    // $ANTLR start "RULE_DIFFERENT"
    public final void mRULE_DIFFERENT() throws RecognitionException {
        try {
            int _type = RULE_DIFFERENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5495:16: ( '!=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5495:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIFFERENT"

    // $ANTLR start "RULE_BT"
    public final void mRULE_BT() throws RecognitionException {
        try {
            int _type = RULE_BT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5497:9: ( '>' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5497:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BT"

    // $ANTLR start "RULE_ST"
    public final void mRULE_ST() throws RecognitionException {
        try {
            int _type = RULE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5499:9: ( '<' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5499:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ST"

    // $ANTLR start "RULE_BE"
    public final void mRULE_BE() throws RecognitionException {
        try {
            int _type = RULE_BE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5501:9: ( '>=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5501:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BE"

    // $ANTLR start "RULE_SE"
    public final void mRULE_SE() throws RecognitionException {
        try {
            int _type = RULE_SE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5503:9: ( '<=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5503:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SE"

    // $ANTLR start "RULE_DIVIDE"
    public final void mRULE_DIVIDE() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5505:13: ( '/' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5505:15: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVIDE"

    // $ANTLR start "RULE_DIVIDE_EQUAL"
    public final void mRULE_DIVIDE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5507:19: ( '/=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5507:21: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVIDE_EQUAL"

    // $ANTLR start "RULE_MODULE"
    public final void mRULE_MODULE() throws RecognitionException {
        try {
            int _type = RULE_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5509:13: ( '%' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5509:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE"

    // $ANTLR start "RULE_MODULE_EQUAL"
    public final void mRULE_MODULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MODULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5511:19: ( '%=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5511:21: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE_EQUAL"

    // $ANTLR start "RULE_PLUS_EQUAL"
    public final void mRULE_PLUS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_PLUS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5513:17: ( '+=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5513:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS_EQUAL"

    // $ANTLR start "RULE_MINUS_EQUAL"
    public final void mRULE_MINUS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MINUS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5515:18: ( '-=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5515:20: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS_EQUAL"

    // $ANTLR start "RULE_MULTIPLY"
    public final void mRULE_MULTIPLY() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5517:15: ( '*' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5517:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY"

    // $ANTLR start "RULE_MULTIPLY_EQUAL"
    public final void mRULE_MULTIPLY_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5519:21: ( '*=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5519:23: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY_EQUAL"

    // $ANTLR start "RULE_WAT"
    public final void mRULE_WAT() throws RecognitionException {
        try {
            int _type = RULE_WAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5521:10: ( '?' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5521:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WAT"

    // $ANTLR start "RULE_AMPERSAND"
    public final void mRULE_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5523:16: ( 'ampersand' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5523:18: 'ampersand'
            {
            match("ampersand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMPERSAND"

    // $ANTLR start "RULE_EXPONENTIAL"
    public final void mRULE_EXPONENTIAL() throws RecognitionException {
        try {
            int _type = RULE_EXPONENTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5525:18: ( ( 'e' | 'e+' | 'e-' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5525:20: ( 'e' | 'e+' | 'e-' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5525:20: ( 'e' | 'e+' | 'e-' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='e') ) {
                switch ( input.LA(2) ) {
                case '+':
                    {
                    alt1=2;
                    }
                    break;
                case '-':
                    {
                    alt1=3;
                    }
                    break;
                default:
                    alt1=1;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5525:21: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5525:25: 'e+'
                    {
                    match("e+"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5525:30: 'e-'
                    {
                    match("e-"); 


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
    // $ANTLR end "RULE_EXPONENTIAL"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5527:11: ( 'l' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5527:13: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5529:13: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5529:15: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5529:19: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5529:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5531:12: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5531:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NEW"
    public final void mRULE_NEW() throws RecognitionException {
        try {
            int _type = RULE_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5533:10: ( 'new' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5533:12: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5535:10: ( '~' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5535:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_EXCLAMATION"
    public final void mRULE_EXCLAMATION() throws RecognitionException {
        try {
            int _type = RULE_EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5537:18: ( '!' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5537:20: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLAMATION"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5539:12: ( 'false' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5539:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5541:11: ( 'true' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5541:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_DECREMENT"
    public final void mRULE_DECREMENT() throws RecognitionException {
        try {
            int _type = RULE_DECREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5543:16: ( '--' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5543:18: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECREMENT"

    // $ANTLR start "RULE_INCREMENT"
    public final void mRULE_INCREMENT() throws RecognitionException {
        try {
            int _type = RULE_INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5545:16: ( '++' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5545:18: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCREMENT"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5547:13: ( 'static' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5547:15: 'static'
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

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5549:14: ( 'default' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5549:16: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_CASE"
    public final void mRULE_CASE() throws RecognitionException {
        try {
            int _type = RULE_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5551:11: ( 'case' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5551:13: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE"

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5553:13: ( 'switch' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5553:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5555:10: ( 'for' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5555:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5557:13: ( 'return' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5557:15: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_RIGHT_PARENTHESIS"
    public final void mRULE_RIGHT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5559:24: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5559:26: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_PARENTHESIS"

    // $ANTLR start "RULE_LEFT_PARENTHESIS"
    public final void mRULE_LEFT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_LEFT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5561:23: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5561:25: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_PARENTHESIS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5563:10: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5563:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5565:9: ( 'if' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5565:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5567:11: ( 'else' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5567:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5569:9: ( 'do' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5569:11: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5571:12: ( 'while' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5571:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_PACKAGE"
    public final void mRULE_PACKAGE() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5573:14: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5573:16: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PACKAGE"

    // $ANTLR start "RULE_IMPORT"
    public final void mRULE_IMPORT() throws RecognitionException {
        try {
            int _type = RULE_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5575:13: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5575:15: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORT"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5577:11: ( '\\'' . '\\'' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5577:13: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5579:11: ( '+' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5579:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5581:12: ( '-' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5581:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:10: ( ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:13: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:22: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:32: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:44: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:52: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:61: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:76: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:87: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5583:100: 'transient'
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

    // $ANTLR start "RULE_TRY"
    public final void mRULE_TRY() throws RecognitionException {
        try {
            int _type = RULE_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5585:10: ( 'try' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5585:12: 'try'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5587:12: ( 'catch' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5587:14: 'catch'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5589:14: ( 'finally' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5589:16: 'finally'
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

    // $ANTLR start "RULE_FLOAT_TYPE_SUFIX"
    public final void mRULE_FLOAT_TYPE_SUFIX() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_TYPE_SUFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5591:23: ( ( 'f' | 'd' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5591:25: ( 'f' | 'd' )
            {
            if ( input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFIX"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5593:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5593:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5593:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00C0' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:
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
            	    break loop4;
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

    // $ANTLR start "RULE_HEXA"
    public final void mRULE_HEXA() throws RecognitionException {
        try {
            int _type = RULE_HEXA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5595:11: ( '0' 'x' ( '0' .. '9' 'a' .. 'f' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5595:13: '0' 'x' ( '0' .. '9' 'a' .. 'f' )*
            {
            match('0'); 
            match('x'); 
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5595:21: ( '0' .. '9' 'a' .. 'f' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5595:22: '0' .. '9' 'a' .. 'f'
            	    {
            	    matchRange('0','9'); 
            	    matchRange('a','f'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXA"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5597:21: ( ( '0' .. '9' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5597:23: ( '0' .. '9' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5597:23: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5597:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5599:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5599:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5599:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5599:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:41: ( '\\r' )? '\\n'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5601:41: '\\r'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5603:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5603:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5603:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5605:16: ( . )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5605:18: .
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5607:18: ( '/**' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5607:20: '/**'
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
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:8: ( T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_INTERFACE | RULE_EXTENDS | RULE_COMMA | RULE_R_CURLY_BRACE | RULE_L_CURLY_BRACE | RULE_ABS | RULE_R_ABS | RULE_L_ABS | RULE_EQUAL | RULE_NULL | RULE_THIS | RULE_SUPER | RULE_INSTANCEOF | RULE_L_SHIFT | RULE_R_SHIFT | RULE_SUPER_SHIFT | RULE_R_SHIFT_EQUAL | RULE_DOUBLE_OR_EQUAL | RULE_OR | RULE_OR_EQUAL | RULE_EXP | RULE_EXP_EQUAL | RULE_DOUBLE_EQUAL | RULE_DIFFERENT | RULE_BT | RULE_ST | RULE_BE | RULE_SE | RULE_DIVIDE | RULE_DIVIDE_EQUAL | RULE_MODULE | RULE_MODULE_EQUAL | RULE_PLUS_EQUAL | RULE_MINUS_EQUAL | RULE_MULTIPLY | RULE_MULTIPLY_EQUAL | RULE_WAT | RULE_AMPERSAND | RULE_EXPONENTIAL | RULE_LONG | RULE_STRING | RULE_COLON | RULE_NEW | RULE_NOT | RULE_EXCLAMATION | RULE_FALSE | RULE_TRUE | RULE_DECREMENT | RULE_INCREMENT | RULE_STATIC | RULE_DEFAULT | RULE_CASE | RULE_SWITCH | RULE_FOR | RULE_RETURN | RULE_RIGHT_PARENTHESIS | RULE_LEFT_PARENTHESIS | RULE_EOL | RULE_IF | RULE_ELSE | RULE_DO | RULE_WHILE | RULE_PACKAGE | RULE_IMPORT | RULE_CHAR | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_FLOAT_TYPE_SUFIX | RULE_ID | RULE_HEXA | RULE_DECIMAL_DIGITS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_DOC_COMMENT )
        int alt12=94;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:10: T__84
                {
                mT__84(); 

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:16: T__85
                {
                mT__85(); 

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:22: T__86
                {
                mT__86(); 

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:28: T__87
                {
                mT__87(); 

                }
                break;
            case 5 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:34: T__88
                {
                mT__88(); 

                }
                break;
            case 6 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:40: T__89
                {
                mT__89(); 

                }
                break;
            case 7 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:46: T__90
                {
                mT__90(); 

                }
                break;
            case 8 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:52: T__91
                {
                mT__91(); 

                }
                break;
            case 9 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:58: T__92
                {
                mT__92(); 

                }
                break;
            case 10 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:64: T__93
                {
                mT__93(); 

                }
                break;
            case 11 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:70: T__94
                {
                mT__94(); 

                }
                break;
            case 12 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:76: T__95
                {
                mT__95(); 

                }
                break;
            case 13 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:82: T__96
                {
                mT__96(); 

                }
                break;
            case 14 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:88: T__97
                {
                mT__97(); 

                }
                break;
            case 15 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:94: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 16 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:109: RULE_EXTENDS
                {
                mRULE_EXTENDS(); 

                }
                break;
            case 17 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:122: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 18 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:133: RULE_R_CURLY_BRACE
                {
                mRULE_R_CURLY_BRACE(); 

                }
                break;
            case 19 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:152: RULE_L_CURLY_BRACE
                {
                mRULE_L_CURLY_BRACE(); 

                }
                break;
            case 20 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:171: RULE_ABS
                {
                mRULE_ABS(); 

                }
                break;
            case 21 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:180: RULE_R_ABS
                {
                mRULE_R_ABS(); 

                }
                break;
            case 22 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:191: RULE_L_ABS
                {
                mRULE_L_ABS(); 

                }
                break;
            case 23 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:202: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 24 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:213: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 25 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:223: RULE_THIS
                {
                mRULE_THIS(); 

                }
                break;
            case 26 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:233: RULE_SUPER
                {
                mRULE_SUPER(); 

                }
                break;
            case 27 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:244: RULE_INSTANCEOF
                {
                mRULE_INSTANCEOF(); 

                }
                break;
            case 28 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:260: RULE_L_SHIFT
                {
                mRULE_L_SHIFT(); 

                }
                break;
            case 29 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:273: RULE_R_SHIFT
                {
                mRULE_R_SHIFT(); 

                }
                break;
            case 30 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:286: RULE_SUPER_SHIFT
                {
                mRULE_SUPER_SHIFT(); 

                }
                break;
            case 31 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:303: RULE_R_SHIFT_EQUAL
                {
                mRULE_R_SHIFT_EQUAL(); 

                }
                break;
            case 32 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:322: RULE_DOUBLE_OR_EQUAL
                {
                mRULE_DOUBLE_OR_EQUAL(); 

                }
                break;
            case 33 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:343: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 34 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:351: RULE_OR_EQUAL
                {
                mRULE_OR_EQUAL(); 

                }
                break;
            case 35 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:365: RULE_EXP
                {
                mRULE_EXP(); 

                }
                break;
            case 36 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:374: RULE_EXP_EQUAL
                {
                mRULE_EXP_EQUAL(); 

                }
                break;
            case 37 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:389: RULE_DOUBLE_EQUAL
                {
                mRULE_DOUBLE_EQUAL(); 

                }
                break;
            case 38 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:407: RULE_DIFFERENT
                {
                mRULE_DIFFERENT(); 

                }
                break;
            case 39 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:422: RULE_BT
                {
                mRULE_BT(); 

                }
                break;
            case 40 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:430: RULE_ST
                {
                mRULE_ST(); 

                }
                break;
            case 41 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:438: RULE_BE
                {
                mRULE_BE(); 

                }
                break;
            case 42 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:446: RULE_SE
                {
                mRULE_SE(); 

                }
                break;
            case 43 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:454: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 44 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:466: RULE_DIVIDE_EQUAL
                {
                mRULE_DIVIDE_EQUAL(); 

                }
                break;
            case 45 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:484: RULE_MODULE
                {
                mRULE_MODULE(); 

                }
                break;
            case 46 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:496: RULE_MODULE_EQUAL
                {
                mRULE_MODULE_EQUAL(); 

                }
                break;
            case 47 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:514: RULE_PLUS_EQUAL
                {
                mRULE_PLUS_EQUAL(); 

                }
                break;
            case 48 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:530: RULE_MINUS_EQUAL
                {
                mRULE_MINUS_EQUAL(); 

                }
                break;
            case 49 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:547: RULE_MULTIPLY
                {
                mRULE_MULTIPLY(); 

                }
                break;
            case 50 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:561: RULE_MULTIPLY_EQUAL
                {
                mRULE_MULTIPLY_EQUAL(); 

                }
                break;
            case 51 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:581: RULE_WAT
                {
                mRULE_WAT(); 

                }
                break;
            case 52 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:590: RULE_AMPERSAND
                {
                mRULE_AMPERSAND(); 

                }
                break;
            case 53 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:605: RULE_EXPONENTIAL
                {
                mRULE_EXPONENTIAL(); 

                }
                break;
            case 54 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:622: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 55 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:632: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:644: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 57 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:655: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 58 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:664: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 59 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:673: RULE_EXCLAMATION
                {
                mRULE_EXCLAMATION(); 

                }
                break;
            case 60 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:690: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 61 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:701: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 62 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:711: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 63 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:726: RULE_INCREMENT
                {
                mRULE_INCREMENT(); 

                }
                break;
            case 64 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:741: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 65 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:753: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 66 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:766: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 67 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:776: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 68 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:788: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 69 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:797: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 70 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:809: RULE_RIGHT_PARENTHESIS
                {
                mRULE_RIGHT_PARENTHESIS(); 

                }
                break;
            case 71 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:832: RULE_LEFT_PARENTHESIS
                {
                mRULE_LEFT_PARENTHESIS(); 

                }
                break;
            case 72 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:854: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 73 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:863: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 74 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:871: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 75 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:881: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 76 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:889: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 77 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:900: RULE_PACKAGE
                {
                mRULE_PACKAGE(); 

                }
                break;
            case 78 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:913: RULE_IMPORT
                {
                mRULE_IMPORT(); 

                }
                break;
            case 79 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:925: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 80 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:935: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 81 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:945: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 82 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:956: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 83 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:965: RULE_TRY
                {
                mRULE_TRY(); 

                }
                break;
            case 84 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:974: RULE_CATCH
                {
                mRULE_CATCH(); 

                }
                break;
            case 85 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:985: RULE_FINALLY
                {
                mRULE_FINALLY(); 

                }
                break;
            case 86 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:998: RULE_FLOAT_TYPE_SUFIX
                {
                mRULE_FLOAT_TYPE_SUFIX(); 

                }
                break;
            case 87 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1020: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1028: RULE_HEXA
                {
                mRULE_HEXA(); 

                }
                break;
            case 89 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1038: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 90 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1058: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1074: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1090: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1098: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 94 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1113: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\141\1\162\4\uffff\1\150\1\uffff\1\151\4\uffff";
    static final String DFA3_maxS =
        "\1\164\1\165\4\uffff\1\162\1\uffff\1\157\4\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\uffff\1\10\1\11\1\2\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "5583:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\2\63\1\uffff\2\63\1\104\1\106\1\104\1\63\1\113\3\uffff"+
        "\1\121\1\uffff\1\124\2\63\1\132\1\135\1\140\1\142\1\144\1\150\1"+
        "\152\1\155\1\160\1\162\1\uffff\1\63\1\56\1\uffff\1\63\1\uffff\1"+
        "\63\3\uffff\2\63\1\56\1\uffff\1\u0085\3\uffff\4\63\1\uffff\2\63"+
        "\1\u008f\1\uffff\14\63\1\uffff\1\63\1\uffff\1\u009e\3\63\1\uffff"+
        "\1\63\10\uffff\3\63\3\uffff\1\u00ab\30\uffff\2\63\2\uffff\2\63\1"+
        "\uffff\1\63\3\uffff\4\63\4\uffff\6\63\1\u00c0\1\63\1\uffff\12\63"+
        "\1\u00cc\3\63\1\uffff\11\63\1\u00d9\3\uffff\1\u00da\1\uffff\2\63"+
        "\1\u00dd\10\63\1\u00e6\1\63\1\u00e8\4\63\1\uffff\2\63\1\u00ef\10"+
        "\63\1\uffff\1\63\1\u00f9\2\63\1\u00fc\1\63\1\u00fe\1\u00ff\1\u0100"+
        "\1\63\1\u0102\1\63\2\uffff\2\63\1\uffff\7\63\1\u010d\1\uffff\1\63"+
        "\1\uffff\1\u010f\5\63\1\uffff\1\u0115\1\u0116\1\u0117\3\63\1\u011b"+
        "\1\u011c\1\u011e\1\uffff\2\63\1\uffff\1\63\3\uffff\1\63\1\uffff"+
        "\5\63\1\u0128\4\63\1\uffff\1\63\1\uffff\1\63\1\u012f\3\63\3\uffff"+
        "\1\u0133\1\u0134\1\63\2\uffff\1\63\1\uffff\1\u0137\6\63\1\u011e"+
        "\1\u013e\1\uffff\1\63\1\u011e\4\63\1\uffff\2\63\1\u0146\2\uffff"+
        "\1\63\1\u0148\1\uffff\1\u0149\1\u014a\4\63\1\uffff\1\u014f\1\u011e"+
        "\1\63\1\u0151\3\63\1\uffff\1\63\3\uffff\3\63\1\u011e\1\uffff\1\63"+
        "\1\uffff\1\63\1\u015b\3\63\1\u011e\1\u015f\1\u011e\1\u0160\1\uffff"+
        "\1\u0161\1\63\1\u011e\3\uffff\1\63\1\u011e";
    static final String DFA12_eofS =
        "\u0164\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\146\1\uffff\1\157\1\150\3\44\1\157\1\44\3\uffff\1"+
        "\135\1\uffff\1\75\1\125\1\150\1\74\4\75\1\52\1\75\1\53\1\55\1\75"+
        "\1\uffff\1\142\1\0\1\uffff\1\141\1\uffff\1\145\3\uffff\1\150\1\141"+
        "\1\0\1\uffff\1\170\3\uffff\2\141\1\156\1\163\1\uffff\1\160\1\163"+
        "\1\44\1\uffff\1\157\1\164\1\145\1\157\1\160\1\141\1\151\1\156\1"+
        "\157\1\154\1\162\1\156\1\uffff\1\156\1\uffff\1\44\1\146\1\151\1"+
        "\164\1\uffff\1\163\10\uffff\1\114\1\151\1\141\3\uffff\1\75\12\uffff"+
        "\1\0\15\uffff\1\160\1\163\2\uffff\1\167\1\164\1\uffff\1\164\3\uffff"+
        "\1\151\1\143\1\142\1\151\4\uffff\1\163\1\162\1\164\1\145\1\143\1"+
        "\154\1\44\1\164\1\uffff\1\154\1\145\1\141\1\162\1\145\2\164\1\143"+
        "\1\141\1\163\1\44\1\141\1\147\1\142\1\uffff\1\141\1\144\2\145\1"+
        "\114\1\163\2\145\1\156\1\44\3\uffff\1\0\1\uffff\1\145\1\164\1\44"+
        "\1\151\1\165\1\154\1\153\1\154\1\166\1\164\1\163\1\44\1\151\1\44"+
        "\1\150\1\145\2\162\1\uffff\1\141\1\145\1\44\1\153\1\164\1\162\1"+
        "\151\1\143\1\150\1\164\1\145\1\uffff\1\154\1\44\1\154\1\165\1\44"+
        "\1\156\3\44\1\141\1\44\1\163\2\uffff\2\162\1\uffff\1\166\1\162\1"+
        "\145\1\141\1\151\1\141\1\145\1\44\1\uffff\1\156\1\uffff\1\44\1\155"+
        "\1\164\1\146\1\156\1\141\1\uffff\3\44\1\143\1\150\1\162\3\44\1\uffff"+
        "\1\145\1\154\1\uffff\1\144\3\uffff\1\144\1\uffff\1\151\1\163\1\141"+
        "\1\145\1\156\1\44\1\147\1\143\1\164\1\143\1\uffff\1\165\1\uffff"+
        "\1\145\1\44\1\141\1\143\1\156\3\uffff\2\44\1\157\2\uffff\1\171\1"+
        "\uffff\1\44\1\164\2\163\1\145\1\141\1\143\2\44\1\uffff\1\145\1\44"+
        "\1\145\1\164\1\145\1\156\1\uffff\1\143\1\145\1\44\2\uffff\1\156"+
        "\1\44\1\uffff\2\44\1\141\2\156\1\164\1\uffff\2\44\1\145\1\44\1\164"+
        "\1\145\1\157\1\uffff\1\151\3\uffff\1\146\1\164\1\144\1\44\1\uffff"+
        "\1\144\1\uffff\1\163\1\44\1\146\1\172\1\145\4\44\1\uffff\1\44\1"+
        "\145\1\44\3\uffff\1\144\1\44";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\156\1\uffff\2\171\3\uffff\1\157\1\uffff\3\uffff"+
        "\1\135\1\uffff\1\75\1\125\1\162\1\75\1\76\1\174\7\75\1\uffff\1\155"+
        "\1\uffff\1\uffff\1\145\1\uffff\1\145\3\uffff\1\150\1\165\1\uffff"+
        "\1\uffff\1\170\3\uffff\2\141\1\156\1\164\1\uffff\1\160\1\164\1\uffff"+
        "\1\uffff\1\157\1\164\1\145\1\157\1\160\1\141\1\151\1\156\1\157\1"+
        "\154\1\162\1\156\1\uffff\1\156\1\uffff\1\uffff\1\146\1\151\1\164"+
        "\1\uffff\1\163\10\uffff\1\114\1\162\1\171\3\uffff\1\76\12\uffff"+
        "\1\uffff\15\uffff\1\160\1\163\2\uffff\1\167\1\164\1\uffff\1\164"+
        "\3\uffff\1\151\1\143\1\142\1\157\4\uffff\1\163\1\162\1\164\1\145"+
        "\1\143\1\157\1\uffff\1\164\1\uffff\1\154\1\145\1\141\1\162\1\145"+
        "\2\164\1\143\1\141\1\163\1\uffff\1\141\1\147\1\142\1\uffff\1\141"+
        "\1\144\2\145\1\114\1\163\2\145\1\156\1\uffff\3\uffff\1\uffff\1\uffff"+
        "\1\145\1\164\1\uffff\1\151\1\165\1\154\1\153\1\154\1\166\1\164\1"+
        "\163\1\uffff\1\151\1\uffff\1\150\1\145\2\162\1\uffff\1\141\1\145"+
        "\1\uffff\1\153\1\164\1\162\1\151\1\143\1\150\1\164\1\145\1\uffff"+
        "\1\154\1\uffff\1\154\1\165\1\uffff\1\156\3\uffff\1\141\1\uffff\1"+
        "\163\2\uffff\2\162\1\uffff\1\166\1\162\1\145\1\141\1\151\1\141\1"+
        "\145\1\uffff\1\uffff\1\156\1\uffff\1\uffff\1\155\1\164\1\146\1\156"+
        "\1\141\1\uffff\3\uffff\1\143\1\150\1\162\3\uffff\1\uffff\1\145\1"+
        "\154\1\uffff\1\144\3\uffff\1\144\1\uffff\1\151\1\163\1\141\1\145"+
        "\1\156\1\uffff\1\147\1\143\1\164\1\143\1\uffff\1\165\1\uffff\1\145"+
        "\1\uffff\1\141\1\143\1\156\3\uffff\2\uffff\1\157\2\uffff\1\171\1"+
        "\uffff\1\uffff\1\164\2\163\1\145\1\141\1\143\2\uffff\1\uffff\1\145"+
        "\1\uffff\1\145\1\164\1\145\1\156\1\uffff\1\143\1\145\1\uffff\2\uffff"+
        "\1\156\1\uffff\1\uffff\2\uffff\1\141\2\156\1\164\1\uffff\2\uffff"+
        "\1\145\1\uffff\1\164\1\145\1\157\1\uffff\1\151\3\uffff\1\146\1\164"+
        "\1\144\1\uffff\1\uffff\1\144\1\uffff\1\163\1\uffff\1\146\1\172\1"+
        "\145\4\uffff\1\uffff\1\uffff\1\145\1\uffff\3\uffff\1\144\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\7\uffff\1\21\1\22\1\23\1\uffff\1\26\15\uffff\1\63"+
        "\2\uffff\1\70\1\uffff\1\72\1\uffff\1\106\1\107\1\110\3\uffff\1\127"+
        "\1\uffff\1\131\1\134\1\135\4\uffff\1\127\3\uffff\1\3\14\uffff\1"+
        "\126\1\uffff\1\66\4\uffff\1\65\1\uffff\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\45\1\27\3\uffff\1\34\1\52\1\50\1\uffff\1\51\1\47\1\40\1"+
        "\42\1\41\1\44\1\43\1\46\1\73\1\54\1\uffff\1\133\1\53\1\56\1\55\1"+
        "\57\1\77\1\120\1\60\1\76\1\121\1\62\1\61\1\63\2\uffff\1\67\1\70"+
        "\2\uffff\1\72\1\uffff\1\106\1\107\1\110\4\uffff\1\117\1\130\1\131"+
        "\1\134\10\uffff\1\111\16\uffff\1\113\12\uffff\1\36\1\37\1\35\1\uffff"+
        "\1\132\22\uffff\1\10\13\uffff\1\104\14\uffff\1\123\1\136\2\uffff"+
        "\1\71\10\uffff\1\6\1\uffff\1\102\6\uffff\1\5\11\uffff\1\12\2\uffff"+
        "\1\14\1\uffff\1\112\1\30\1\31\1\uffff\1\75\12\uffff\1\1\1\uffff"+
        "\1\124\5\uffff\1\15\1\7\1\32\3\uffff\1\11\1\74\1\uffff\1\122\11"+
        "\uffff\1\114\6\uffff\1\116\3\uffff\1\100\1\103\2\uffff\1\13\6\uffff"+
        "\1\105\7\uffff\1\4\1\uffff\1\125\1\101\1\20\4\uffff\1\115\1\uffff"+
        "\1\16\11\uffff\1\17\3\uffff\1\64\1\2\1\33\2\uffff";
    static final String DFA12_specialS =
        "\1\4\36\uffff\1\1\11\uffff\1\0\74\uffff\1\2\105\uffff\1\3\u00b7"+
        "\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\27\1\37\1\56\1\52\1\31\1"+
            "\56\1\51\1\44\1\45\1\34\1\32\1\13\1\33\1\3\1\30\1\53\11\54\1"+
            "\40\1\46\1\23\1\20\1\24\1\35\1\56\15\52\1\21\14\52\1\16\1\56"+
            "\1\17\1\26\1\52\1\56\1\36\1\4\1\1\1\10\1\12\1\6\2\52\1\2\2\52"+
            "\1\7\1\52\1\41\1\52\1\50\1\52\1\43\1\5\1\22\1\52\1\11\1\47\3"+
            "\52\1\14\1\25\1\15\1\42\uff81\56",
            "\1\62\6\uffff\1\60\3\uffff\1\57\2\uffff\1\61",
            "\1\66\6\uffff\1\64\1\65",
            "",
            "\1\70\2\uffff\1\72\6\uffff\1\71",
            "\1\73\13\uffff\1\75\1\74\1\uffff\1\76\1\uffff\1\77",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1"+
            "\101\7\63\1\103\2\63\1\100\2\63\1\102\13\63\105\uffff\uff40"+
            "\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16"+
            "\63\1\105\13\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4"+
            "\63\1\110\11\63\1\107\13\63\105\uffff\uff40\63",
            "\1\111",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13"+
            "\63\1\114\13\63\1\112\2\63\105\uffff\uff40\63",
            "",
            "",
            "",
            "\1\120",
            "",
            "\1\123",
            "\1\125",
            "\1\126\11\uffff\1\127",
            "\1\130\1\131",
            "\1\134\1\133",
            "\1\137\76\uffff\1\136",
            "\1\141",
            "\1\143",
            "\1\146\4\uffff\1\147\15\uffff\1\145",
            "\1\151",
            "\1\154\21\uffff\1\153",
            "\1\157\17\uffff\1\156",
            "\1\161",
            "",
            "\1\165\12\uffff\1\164",
            "\0\166",
            "",
            "\1\171\3\uffff\1\170",
            "",
            "\1\173",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080\20\uffff\1\u0082\2\uffff\1\u0081",
            "\0\u0083",
            "",
            "\1\u0084",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\1\u008b",
            "",
            "\1\u008c",
            "\1\u008e\1\u008d",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24"+
            "\63\1\u009d\5\63\105\uffff\uff40\63",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4\10\uffff\1\u00a5",
            "\1\u00a7\23\uffff\1\u00a6\3\uffff\1\u00a8",
            "",
            "",
            "",
            "\1\u00aa\1\u00a9",
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
            "\52\u00ad\1\u00ac\uffd5\u00ad",
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
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\5\uffff\1\u00b7",
            "",
            "",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd\2\uffff\1\u00be",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4"+
            "\63\1\u00bf\25\63\105\uffff\uff40\63",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "",
            "",
            "\0\u00ad",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00e7",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00fa",
            "\1\u00fb",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u00fd",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0101",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0103",
            "",
            "",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "\1\u010e",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13"+
            "\63\1\u011d\16\63\105\uffff\uff40\63",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "",
            "",
            "",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0135",
            "",
            "",
            "\1\u0136",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "\1\u013f",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "",
            "\1\u0147",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0150",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "",
            "",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "\1\u0162",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63",
            "",
            "",
            "",
            "\1\u0163",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32"+
            "\63\105\uffff\uff40\63"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_INTERFACE | RULE_EXTENDS | RULE_COMMA | RULE_R_CURLY_BRACE | RULE_L_CURLY_BRACE | RULE_ABS | RULE_R_ABS | RULE_L_ABS | RULE_EQUAL | RULE_NULL | RULE_THIS | RULE_SUPER | RULE_INSTANCEOF | RULE_L_SHIFT | RULE_R_SHIFT | RULE_SUPER_SHIFT | RULE_R_SHIFT_EQUAL | RULE_DOUBLE_OR_EQUAL | RULE_OR | RULE_OR_EQUAL | RULE_EXP | RULE_EXP_EQUAL | RULE_DOUBLE_EQUAL | RULE_DIFFERENT | RULE_BT | RULE_ST | RULE_BE | RULE_SE | RULE_DIVIDE | RULE_DIVIDE_EQUAL | RULE_MODULE | RULE_MODULE_EQUAL | RULE_PLUS_EQUAL | RULE_MINUS_EQUAL | RULE_MULTIPLY | RULE_MULTIPLY_EQUAL | RULE_WAT | RULE_AMPERSAND | RULE_EXPONENTIAL | RULE_LONG | RULE_STRING | RULE_COLON | RULE_NEW | RULE_NOT | RULE_EXCLAMATION | RULE_FALSE | RULE_TRUE | RULE_DECREMENT | RULE_INCREMENT | RULE_STATIC | RULE_DEFAULT | RULE_CASE | RULE_SWITCH | RULE_FOR | RULE_RETURN | RULE_RIGHT_PARENTHESIS | RULE_LEFT_PARENTHESIS | RULE_EOL | RULE_IF | RULE_ELSE | RULE_DO | RULE_WHILE | RULE_PACKAGE | RULE_IMPORT | RULE_CHAR | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_FLOAT_TYPE_SUFIX | RULE_ID | RULE_HEXA | RULE_DECIMAL_DIGITS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_DOC_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( ((LA12_41>='\u0000' && LA12_41<='\uFFFF')) ) {s = 131;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 118;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='*') ) {s = 172;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<=')')||(LA12_102>='+' && LA12_102<='\uFFFF')) ) {s = 173;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_172 = input.LA(1);

                        s = -1;
                        if ( ((LA12_172>='\u0000' && LA12_172<='\uFFFF')) ) {s = 173;}

                        else s = 218;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='.') ) {s = 3;}

                        else if ( (LA12_0=='b') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='v') ) {s = 9;}

                        else if ( (LA12_0=='e') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='{') ) {s = 12;}

                        else if ( (LA12_0=='}') ) {s = 13;}

                        else if ( (LA12_0=='[') ) {s = 14;}

                        else if ( (LA12_0==']') ) {s = 15;}

                        else if ( (LA12_0=='=') ) {s = 16;}

                        else if ( (LA12_0=='N') ) {s = 17;}

                        else if ( (LA12_0=='t') ) {s = 18;}

                        else if ( (LA12_0=='<') ) {s = 19;}

                        else if ( (LA12_0=='>') ) {s = 20;}

                        else if ( (LA12_0=='|') ) {s = 21;}

                        else if ( (LA12_0=='^') ) {s = 22;}

                        else if ( (LA12_0=='!') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( (LA12_0=='%') ) {s = 25;}

                        else if ( (LA12_0=='+') ) {s = 26;}

                        else if ( (LA12_0=='-') ) {s = 27;}

                        else if ( (LA12_0=='*') ) {s = 28;}

                        else if ( (LA12_0=='?') ) {s = 29;}

                        else if ( (LA12_0=='a') ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0==':') ) {s = 32;}

                        else if ( (LA12_0=='n') ) {s = 33;}

                        else if ( (LA12_0=='~') ) {s = 34;}

                        else if ( (LA12_0=='r') ) {s = 35;}

                        else if ( (LA12_0=='(') ) {s = 36;}

                        else if ( (LA12_0==')') ) {s = 37;}

                        else if ( (LA12_0==';') ) {s = 38;}

                        else if ( (LA12_0=='w') ) {s = 39;}

                        else if ( (LA12_0=='p') ) {s = 40;}

                        else if ( (LA12_0=='\'') ) {s = 41;}

                        else if ( (LA12_0=='$'||(LA12_0>='A' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='o'||LA12_0=='q'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 42;}

                        else if ( (LA12_0=='0') ) {s = 43;}

                        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {s = 44;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 45;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='#'||LA12_0=='&'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}