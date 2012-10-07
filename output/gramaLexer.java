// $ANTLR 3.4 C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g 2012-10-07 20:28:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class gramaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int AND=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int ELSE=7;
    public static final int EQUAL=8;
    public static final int ESC_SEQ=9;
    public static final int FALSE=10;
    public static final int FLOAT=11;
    public static final int GREATER=12;
    public static final int GREATEREQUAL=13;
    public static final int HEX_DIGIT=14;
    public static final int ID=15;
    public static final int IF=16;
    public static final int INT=17;
    public static final int LCURLY=18;
    public static final int LESS=19;
    public static final int LESSEQUAL=20;
    public static final int LPAREN=21;
    public static final int MAIN=22;
    public static final int MINUS=23;
    public static final int NOT=24;
    public static final int NOTEQUAL=25;
    public static final int OCTAL_ESC=26;
    public static final int OR=27;
    public static final int PLUS=28;
    public static final int RCURLY=29;
    public static final int RPAREN=30;
    public static final int SLASH=31;
    public static final int STAR=32;
    public static final int STRING=33;
    public static final int TRUE=34;
    public static final int T_CHAR=35;
    public static final int T_FLOAT=36;
    public static final int T_INT=37;
    public static final int T_STRING=38;
    public static final int UNICODE_ESC=39;
    public static final int WHILE=40;
    public static final int WS=41;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public gramaLexer() {} 
    public gramaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public gramaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g"; }

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:2:7: ( ',' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:2:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:3:7: ( ';' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:3:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:4:7: ( '=' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:4:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:6:2: ( '>' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:6:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:10:2: ( '<=' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:10:4: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:14:2: ( '<' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:14:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:18:2: ( 'while' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:18:4: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:22:2: ( 'if' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:22:4: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:26:2: ( '{' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:26:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:30:2: ( '}' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:30:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:34:2: ( 'else' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:34:4: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:38:2: ( '(' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:38:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:42:2: ( ')' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:42:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:46:2: ( 'main ' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:46:4: 'main '
            {
            match("main "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "T_INT"
    public final void mT_INT() throws RecognitionException {
        try {
            int _type = T_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:50:2: ( 'int' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:50:4: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_INT"

    // $ANTLR start "T_CHAR"
    public final void mT_CHAR() throws RecognitionException {
        try {
            int _type = T_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:54:2: ( 'char' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:54:4: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_CHAR"

    // $ANTLR start "T_STRING"
    public final void mT_STRING() throws RecognitionException {
        try {
            int _type = T_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:58:2: ( 'string' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:58:4: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_STRING"

    // $ANTLR start "T_FLOAT"
    public final void mT_FLOAT() throws RecognitionException {
        try {
            int _type = T_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:62:2: ( 'float' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:62:4: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_FLOAT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:66:2: ( 'true' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:66:4: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:70:2: ( 'false' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:70:4: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:74:2: ( '!=' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:74:4: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:78:2: ( '==' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:78:4: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:82:2: ( '~' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:82:4: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:86:2: ( '||' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:86:4: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:90:2: ( '&&' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:90:4: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:94:2: ( '+' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:94:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:98:2: ( '-' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:98:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:102:2: ( '*' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:102:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:106:2: ( '/' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:106:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:109:2: ( '>=' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:109:4: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:205:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:205:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:205:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:208:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:208:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:208:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:212:3: ( ( INT )+ '.' ( INT )+ )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:212:5: ( INT )+ '.' ( INT )+
            {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:212:5: ( INT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:212:5: INT
            	    {
            	    mINT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:212:14: ( INT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:212:14: INT
            	    {
            	    mINT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:216:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:216:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:216:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:216:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:216:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:217:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:217:14: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:217:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:221:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:221:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:221:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:221:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:221:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:224:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:224:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:224:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                alt10=1;
            }
            else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:224:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:224:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:229:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:233:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt11=1;
                    }
                    break;
                case 'u':
                    {
                    alt11=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:233:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:234:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:235:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:240:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1 >= '0' && LA12_1 <= '3')) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2 >= '0' && LA12_2 <= '7')) ) {
                        int LA12_4 = input.LA(4);

                        if ( ((LA12_4 >= '0' && LA12_4 <= '7')) ) {
                            alt12=1;
                        }
                        else {
                            alt12=2;
                        }
                    }
                    else {
                        alt12=3;
                    }
                }
                else if ( ((LA12_1 >= '4' && LA12_1 <= '7')) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3 >= '0' && LA12_3 <= '7')) ) {
                        alt12=2;
                    }
                    else {
                        alt12=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:240:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:241:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:242:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:247:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:247:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:249:5: ( ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:249:8: ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:249:8: ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||(LA13_0 >= '\f' && LA13_0 <= '\r')||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:8: ( T__42 | T__43 | T__44 | GREATER | LESSEQUAL | LESS | WHILE | IF | LCURLY | RCURLY | ELSE | LPAREN | RPAREN | MAIN | T_INT | T_CHAR | T_STRING | T_FLOAT | TRUE | FALSE | NOTEQUAL | EQUAL | NOT | OR | AND | PLUS | MINUS | STAR | SLASH | GREATEREQUAL | ID | INT | FLOAT | COMMENT | STRING | CHAR | WS )
        int alt14=37;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:10: T__42
                {
                mT__42(); 


                }
                break;
            case 2 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:16: T__43
                {
                mT__43(); 


                }
                break;
            case 3 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:22: T__44
                {
                mT__44(); 


                }
                break;
            case 4 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:28: GREATER
                {
                mGREATER(); 


                }
                break;
            case 5 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:36: LESSEQUAL
                {
                mLESSEQUAL(); 


                }
                break;
            case 6 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:46: LESS
                {
                mLESS(); 


                }
                break;
            case 7 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:51: WHILE
                {
                mWHILE(); 


                }
                break;
            case 8 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:57: IF
                {
                mIF(); 


                }
                break;
            case 9 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:60: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 10 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:67: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 11 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:74: ELSE
                {
                mELSE(); 


                }
                break;
            case 12 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:79: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 13 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:86: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 14 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:93: MAIN
                {
                mMAIN(); 


                }
                break;
            case 15 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:98: T_INT
                {
                mT_INT(); 


                }
                break;
            case 16 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:104: T_CHAR
                {
                mT_CHAR(); 


                }
                break;
            case 17 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:111: T_STRING
                {
                mT_STRING(); 


                }
                break;
            case 18 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:120: T_FLOAT
                {
                mT_FLOAT(); 


                }
                break;
            case 19 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:128: TRUE
                {
                mTRUE(); 


                }
                break;
            case 20 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:133: FALSE
                {
                mFALSE(); 


                }
                break;
            case 21 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:139: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 22 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:148: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 23 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:154: NOT
                {
                mNOT(); 


                }
                break;
            case 24 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:158: OR
                {
                mOR(); 


                }
                break;
            case 25 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:161: AND
                {
                mAND(); 


                }
                break;
            case 26 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:165: PLUS
                {
                mPLUS(); 


                }
                break;
            case 27 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:170: MINUS
                {
                mMINUS(); 


                }
                break;
            case 28 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:176: STAR
                {
                mSTAR(); 


                }
                break;
            case 29 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:181: SLASH
                {
                mSLASH(); 


                }
                break;
            case 30 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:187: GREATEREQUAL
                {
                mGREATEREQUAL(); 


                }
                break;
            case 31 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:200: ID
                {
                mID(); 


                }
                break;
            case 32 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:203: INT
                {
                mINT(); 


                }
                break;
            case 33 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:207: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 34 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:213: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 35 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:221: STRING
                {
                mSTRING(); 


                }
                break;
            case 36 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:228: CHAR
                {
                mCHAR(); 


                }
                break;
            case 37 :
                // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:1:233: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\3\uffff\1\40\1\42\1\44\2\32\2\uffff\1\32\2\uffff\5\32\7\uffff\1"+
        "\60\1\uffff\1\61\11\uffff\1\32\1\64\10\32\4\uffff\1\32\1\uffff\1"+
        "\76\10\32\1\uffff\1\107\1\32\1\111\3\32\1\115\1\116\3\uffff\1\32"+
        "\1\120\1\121\2\uffff\1\122\3\uffff";
    static final String DFA14_eofS =
        "\123\uffff";
    static final String DFA14_minS =
        "\1\11\2\uffff\3\75\1\150\1\146\2\uffff\1\154\2\uffff\1\141\1\150"+
        "\1\164\1\141\1\162\7\uffff\1\52\1\uffff\1\56\11\uffff\1\151\1\60"+
        "\1\164\1\163\1\151\1\141\1\162\1\157\1\154\1\165\4\uffff\1\154\1"+
        "\uffff\1\60\1\145\1\156\1\162\1\151\1\141\1\163\2\145\1\uffff\1"+
        "\60\1\40\1\60\1\156\1\164\1\145\2\60\3\uffff\1\147\2\60\2\uffff"+
        "\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\176\2\uffff\3\75\1\150\1\156\2\uffff\1\154\2\uffff\1\141\1\150"+
        "\1\164\1\154\1\162\7\uffff\1\57\1\uffff\1\71\11\uffff\1\151\1\172"+
        "\1\164\1\163\1\151\1\141\1\162\1\157\1\154\1\165\4\uffff\1\154\1"+
        "\uffff\1\172\1\145\1\156\1\162\1\151\1\141\1\163\2\145\1\uffff\1"+
        "\172\1\40\1\172\1\156\1\164\1\145\2\172\3\uffff\1\147\2\172\2\uffff"+
        "\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\5\uffff\1\11\1\12\1\uffff\1\14\1\15\5\uffff\1\25"+
        "\1\27\1\30\1\31\1\32\1\33\1\34\1\uffff\1\37\1\uffff\1\43\1\44\1"+
        "\45\1\26\1\3\1\36\1\4\1\5\1\6\12\uffff\1\42\1\35\1\40\1\41\1\uffff"+
        "\1\10\11\uffff\1\17\10\uffff\1\13\1\16\1\20\3\uffff\1\23\1\7\1\uffff"+
        "\1\22\1\24\1\21";
    static final String DFA14_specialS =
        "\123\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\36\1\uffff\2\36\22\uffff\1\36\1\22\1\34\3\uffff\1\25\1\35"+
            "\1\13\1\14\1\30\1\26\1\1\1\27\1\uffff\1\31\12\33\1\uffff\1\2"+
            "\1\5\1\3\1\4\2\uffff\32\32\4\uffff\1\32\1\uffff\2\32\1\16\1"+
            "\32\1\12\1\20\2\32\1\7\3\32\1\15\5\32\1\17\1\21\2\32\1\6\3\32"+
            "\1\10\1\24\1\11\1\23",
            "",
            "",
            "\1\37",
            "\1\41",
            "\1\43",
            "\1\45",
            "\1\46\7\uffff\1\47",
            "",
            "",
            "\1\50",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\55\12\uffff\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\4\uffff\1\57",
            "",
            "\1\62\1\uffff\12\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\110",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\1\117",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__42 | T__43 | T__44 | GREATER | LESSEQUAL | LESS | WHILE | IF | LCURLY | RCURLY | ELSE | LPAREN | RPAREN | MAIN | T_INT | T_CHAR | T_STRING | T_FLOAT | TRUE | FALSE | NOTEQUAL | EQUAL | NOT | OR | AND | PLUS | MINUS | STAR | SLASH | GREATEREQUAL | ID | INT | FLOAT | COMMENT | STRING | CHAR | WS );";
        }
    }
 

}