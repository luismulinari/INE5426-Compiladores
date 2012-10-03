// $ANTLR 3.4 C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g 2012-10-03 12:01:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class gramaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHAR", "COMMENT", "ELSE", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "GREATER", "GREATEREQUAL", "HEX_DIGIT", "ID", "IF", "INT", "LCURLY", "LESS", "LESSEQUAL", "LPAREN", "MAIN", "MINUS", "NOT", "NOTEQUAL", "OCTAL_ESC", "OR", "PLUS", "RCURLY", "RPAREN", "SLASH", "STAR", "STRING", "TRUE", "T_CHAR", "T_FLOAT", "T_INT", "T_STRING", "UNICODE_ESC", "WHILE", "','", "';'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public gramaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public gramaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return gramaParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g"; }



    // $ANTLR start "grama"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:115:1: grama : MAIN LCURLY ( bloco )* RCURLY ;
    public final void grama() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:116:2: ( MAIN LCURLY ( bloco )* RCURLY )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:116:4: MAIN LCURLY ( bloco )* RCURLY
            {
            match(input,MAIN,FOLLOW_MAIN_in_grama313); 

            match(input,LCURLY,FOLLOW_LCURLY_in_grama315); 

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:116:16: ( bloco )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= IF)||(LA1_0 >= T_CHAR && LA1_0 <= T_STRING)||LA1_0==WHILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:116:16: bloco
            	    {
            	    pushFollow(FOLLOW_bloco_in_grama317);
            	    bloco();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,RCURLY,FOLLOW_RCURLY_in_grama320); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "grama"



    // $ANTLR start "bloco"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:119:1: bloco : ( definicao_variavel ';' | atribuicaoVariavel ';' | chamadaFuncao ';' | definicao_if | definicao_while );
    public final void bloco() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:120:2: ( definicao_variavel ';' | atribuicaoVariavel ';' | chamadaFuncao ';' | definicao_if | definicao_while )
            int alt2=5;
            switch ( input.LA(1) ) {
            case T_CHAR:
            case T_FLOAT:
            case T_INT:
            case T_STRING:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==43) ) {
                    alt2=2;
                }
                else if ( (LA2_2==LPAREN) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt2=4;
                }
                break;
            case WHILE:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:120:4: definicao_variavel ';'
                    {
                    pushFollow(FOLLOW_definicao_variavel_in_bloco331);
                    definicao_variavel();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_bloco333); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:121:4: atribuicaoVariavel ';'
                    {
                    pushFollow(FOLLOW_atribuicaoVariavel_in_bloco338);
                    atribuicaoVariavel();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_bloco340); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:122:4: chamadaFuncao ';'
                    {
                    pushFollow(FOLLOW_chamadaFuncao_in_bloco345);
                    chamadaFuncao();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_bloco347); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:123:4: definicao_if
                    {
                    pushFollow(FOLLOW_definicao_if_in_bloco352);
                    definicao_if();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:124:4: definicao_while
                    {
                    pushFollow(FOLLOW_definicao_while_in_bloco357);
                    definicao_while();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bloco"



    // $ANTLR start "definicao_while"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:127:1: definicao_while : WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY ;
    public final void definicao_while() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:128:2: ( WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:128:4: WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY
            {
            match(input,WHILE,FOLLOW_WHILE_in_definicao_while368); 

            match(input,LPAREN,FOLLOW_LPAREN_in_definicao_while370); 

            pushFollow(FOLLOW_condicao_in_definicao_while372);
            condicao();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_definicao_while374); 

            match(input,LCURLY,FOLLOW_LCURLY_in_definicao_while376); 

            pushFollow(FOLLOW_bloco_in_definicao_while378);
            bloco();

            state._fsp--;


            match(input,RCURLY,FOLLOW_RCURLY_in_definicao_while380); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "definicao_while"



    // $ANTLR start "definicao_if"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:131:1: definicao_if : IF LPAREN condicao RPAREN LCURLY bloco RCURLY ( ELSE LCURLY bloco RCURLY )? ;
    public final void definicao_if() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:132:3: ( IF LPAREN condicao RPAREN LCURLY bloco RCURLY ( ELSE LCURLY bloco RCURLY )? )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:132:5: IF LPAREN condicao RPAREN LCURLY bloco RCURLY ( ELSE LCURLY bloco RCURLY )?
            {
            match(input,IF,FOLLOW_IF_in_definicao_if392); 

            match(input,LPAREN,FOLLOW_LPAREN_in_definicao_if394); 

            pushFollow(FOLLOW_condicao_in_definicao_if396);
            condicao();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_definicao_if398); 

            match(input,LCURLY,FOLLOW_LCURLY_in_definicao_if400); 

            pushFollow(FOLLOW_bloco_in_definicao_if402);
            bloco();

            state._fsp--;


            match(input,RCURLY,FOLLOW_RCURLY_in_definicao_if404); 

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:132:51: ( ELSE LCURLY bloco RCURLY )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ELSE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:132:52: ELSE LCURLY bloco RCURLY
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_definicao_if407); 

                    match(input,LCURLY,FOLLOW_LCURLY_in_definicao_if409); 

                    pushFollow(FOLLOW_bloco_in_definicao_if411);
                    bloco();

                    state._fsp--;


                    match(input,RCURLY,FOLLOW_RCURLY_in_definicao_if413); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "definicao_if"



    // $ANTLR start "definicao_variavel"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:135:1: definicao_variavel : type ID ;
    public final void definicao_variavel() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:136:2: ( type ID )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:136:4: type ID
            {
            pushFollow(FOLLOW_type_in_definicao_variavel427);
            type();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_definicao_variavel429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "definicao_variavel"



    // $ANTLR start "type"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:139:1: type : ( T_INT | T_CHAR | T_STRING | T_FLOAT );
    public final void type() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:140:4: ( T_INT | T_CHAR | T_STRING | T_FLOAT )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            if ( (input.LA(1) >= T_CHAR && input.LA(1) <= T_STRING) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "funcao"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:146:1: funcao : type declaracaoSimbolo LPAREN declaracaoSimbolo ( ',' declaracaoSimbolo )* RPAREN LCURLY bloco RCURLY ;
    public final void funcao() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:147:2: ( type declaracaoSimbolo LPAREN declaracaoSimbolo ( ',' declaracaoSimbolo )* RPAREN LCURLY bloco RCURLY )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:147:4: type declaracaoSimbolo LPAREN declaracaoSimbolo ( ',' declaracaoSimbolo )* RPAREN LCURLY bloco RCURLY
            {
            pushFollow(FOLLOW_type_in_funcao468);
            type();

            state._fsp--;


            pushFollow(FOLLOW_declaracaoSimbolo_in_funcao470);
            declaracaoSimbolo();

            state._fsp--;


            match(input,LPAREN,FOLLOW_LPAREN_in_funcao472); 

            pushFollow(FOLLOW_declaracaoSimbolo_in_funcao474);
            declaracaoSimbolo();

            state._fsp--;


            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:147:52: ( ',' declaracaoSimbolo )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==41) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:147:53: ',' declaracaoSimbolo
            	    {
            	    match(input,41,FOLLOW_41_in_funcao477); 

            	    pushFollow(FOLLOW_declaracaoSimbolo_in_funcao479);
            	    declaracaoSimbolo();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_funcao483); 

            match(input,LCURLY,FOLLOW_LCURLY_in_funcao485); 

            pushFollow(FOLLOW_bloco_in_funcao487);
            bloco();

            state._fsp--;


            match(input,RCURLY,FOLLOW_RCURLY_in_funcao489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "funcao"



    // $ANTLR start "declaracaoSimbolo"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:150:1: declaracaoSimbolo : ID ;
    public final void declaracaoSimbolo() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:151:2: ( ID )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:151:4: ID
            {
            match(input,ID,FOLLOW_ID_in_declaracaoSimbolo500); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracaoSimbolo"



    // $ANTLR start "condicao"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:154:1: condicao : ( TRUE | FALSE | LPAREN ( argumento ) ( operacaoBooleana ) ( argumento ) RPAREN ( operacaoBooleana condicao )? | ( argumento ) ( operacaoBooleana ) ( argumento ) );
    public final void condicao() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:155:2: ( TRUE | FALSE | LPAREN ( argumento ) ( operacaoBooleana ) ( argumento ) RPAREN ( operacaoBooleana condicao )? | ( argumento ) ( operacaoBooleana ) ( argumento ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt6=1;
                }
                break;
            case FALSE:
                {
                alt6=2;
                }
                break;
            case LPAREN:
                {
                alt6=3;
                }
                break;
            case CHAR:
            case FLOAT:
            case ID:
            case INT:
            case STRING:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:155:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_condicao511); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_condicao516); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:4: LPAREN ( argumento ) ( operacaoBooleana ) ( argumento ) RPAREN ( operacaoBooleana condicao )?
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_condicao521); 

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:11: ( argumento )
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:12: argumento
                    {
                    pushFollow(FOLLOW_argumento_in_condicao524);
                    argumento();

                    state._fsp--;


                    }


                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:23: ( operacaoBooleana )
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:24: operacaoBooleana
                    {
                    pushFollow(FOLLOW_operacaoBooleana_in_condicao528);
                    operacaoBooleana();

                    state._fsp--;


                    }


                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:42: ( argumento )
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:43: argumento
                    {
                    pushFollow(FOLLOW_argumento_in_condicao532);
                    argumento();

                    state._fsp--;


                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_condicao535); 

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:61: ( operacaoBooleana condicao )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND||LA5_0==EQUAL||(LA5_0 >= GREATER && LA5_0 <= GREATEREQUAL)||(LA5_0 >= LESS && LA5_0 <= LESSEQUAL)||(LA5_0 >= NOT && LA5_0 <= NOTEQUAL)||LA5_0==OR) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:62: operacaoBooleana condicao
                            {
                            pushFollow(FOLLOW_operacaoBooleana_in_condicao538);
                            operacaoBooleana();

                            state._fsp--;


                            pushFollow(FOLLOW_condicao_in_condicao540);
                            condicao();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:3: ( argumento ) ( operacaoBooleana ) ( argumento )
                    {
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:3: ( argumento )
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:4: argumento
                    {
                    pushFollow(FOLLOW_argumento_in_condicao547);
                    argumento();

                    state._fsp--;


                    }


                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:15: ( operacaoBooleana )
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:16: operacaoBooleana
                    {
                    pushFollow(FOLLOW_operacaoBooleana_in_condicao551);
                    operacaoBooleana();

                    state._fsp--;


                    }


                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:34: ( argumento )
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:158:35: argumento
                    {
                    pushFollow(FOLLOW_argumento_in_condicao555);
                    argumento();

                    state._fsp--;


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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condicao"



    // $ANTLR start "operacaoBooleana"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:162:1: operacaoBooleana : ( NOTEQUAL | EQUAL | OR | AND | NOT | GREATER | LESS | GREATEREQUAL | LESSEQUAL );
    public final void operacaoBooleana() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:163:2: ( NOTEQUAL | EQUAL | OR | AND | NOT | GREATER | LESS | GREATEREQUAL | LESSEQUAL )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            if ( input.LA(1)==AND||input.LA(1)==EQUAL||(input.LA(1) >= GREATER && input.LA(1) <= GREATEREQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESSEQUAL)||(input.LA(1) >= NOT && input.LA(1) <= NOTEQUAL)||input.LA(1)==OR ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "operacaoBooleana"



    // $ANTLR start "chamadaFuncao"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:1: chamadaFuncao : ID LPAREN ( argumento )? ( ',' ( argumento ) )* RPAREN ;
    public final void chamadaFuncao() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:3: ( ID LPAREN ( argumento )? ( ',' ( argumento ) )* RPAREN )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:5: ID LPAREN ( argumento )? ( ',' ( argumento ) )* RPAREN
            {
            match(input,ID,FOLLOW_ID_in_chamadaFuncao620); 

            match(input,LPAREN,FOLLOW_LPAREN_in_chamadaFuncao622); 

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:15: ( argumento )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CHAR||LA7_0==FLOAT||LA7_0==ID||LA7_0==INT||LA7_0==STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:16: argumento
                    {
                    pushFollow(FOLLOW_argumento_in_chamadaFuncao625);
                    argumento();

                    state._fsp--;


                    }
                    break;

            }


            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:29: ( ',' ( argumento ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:30: ',' ( argumento )
            	    {
            	    match(input,41,FOLLOW_41_in_chamadaFuncao631); 

            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:34: ( argumento )
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:175:35: argumento
            	    {
            	    pushFollow(FOLLOW_argumento_in_chamadaFuncao634);
            	    argumento();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_chamadaFuncao640); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "chamadaFuncao"



    // $ANTLR start "atribuicaoVariavel"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:178:1: atribuicaoVariavel : ID '=' expressao ;
    public final void atribuicaoVariavel() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:179:3: ( ID '=' expressao )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:179:5: ID '=' expressao
            {
            match(input,ID,FOLLOW_ID_in_atribuicaoVariavel653); 

            match(input,43,FOLLOW_43_in_atribuicaoVariavel655); 

            pushFollow(FOLLOW_expressao_in_atribuicaoVariavel657);
            expressao();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atribuicaoVariavel"



    // $ANTLR start "expressao"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:183:1: expressao : (| argumento ( operacaoAritmetica expressao )? | LPAREN expressao RPAREN );
    public final void expressao() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:184:2: (| argumento ( operacaoAritmetica expressao )? | LPAREN expressao RPAREN )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RPAREN:
            case 42:
                {
                alt10=1;
                }
                break;
            case CHAR:
            case FLOAT:
            case ID:
            case INT:
            case STRING:
                {
                alt10=2;
                }
                break;
            case LPAREN:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:185:2: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:185:4: argumento ( operacaoAritmetica expressao )?
                    {
                    pushFollow(FOLLOW_argumento_in_expressao673);
                    argumento();

                    state._fsp--;


                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:185:14: ( operacaoAritmetica expressao )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==MINUS||LA9_0==PLUS||(LA9_0 >= SLASH && LA9_0 <= STAR)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:185:15: operacaoAritmetica expressao
                            {
                            pushFollow(FOLLOW_operacaoAritmetica_in_expressao676);
                            operacaoAritmetica();

                            state._fsp--;


                            pushFollow(FOLLOW_expressao_in_expressao678);
                            expressao();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:186:4: LPAREN expressao RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_expressao685); 

                    pushFollow(FOLLOW_expressao_in_expressao687);
                    expressao();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_expressao689); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressao"



    // $ANTLR start "argumento"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:189:1: argumento : ( ID | INT | FLOAT | CHAR | STRING | chamadaFuncao );
    public final void argumento() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:190:2: ( ID | INT | FLOAT | CHAR | STRING | chamadaFuncao )
            int alt11=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==LPAREN) ) {
                    alt11=6;
                }
                else if ( (LA11_1==AND||LA11_1==EQUAL||(LA11_1 >= GREATER && LA11_1 <= GREATEREQUAL)||(LA11_1 >= LESS && LA11_1 <= LESSEQUAL)||(LA11_1 >= MINUS && LA11_1 <= NOTEQUAL)||(LA11_1 >= OR && LA11_1 <= PLUS)||(LA11_1 >= RPAREN && LA11_1 <= STAR)||(LA11_1 >= 41 && LA11_1 <= 42)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt11=2;
                }
                break;
            case FLOAT:
                {
                alt11=3;
                }
                break;
            case CHAR:
                {
                alt11=4;
                }
                break;
            case STRING:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:190:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_argumento701); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:191:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_argumento706); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:192:4: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_argumento711); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:193:4: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_argumento716); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:194:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_argumento721); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:195:4: chamadaFuncao
                    {
                    pushFollow(FOLLOW_chamadaFuncao_in_argumento726);
                    chamadaFuncao();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argumento"



    // $ANTLR start "operacaoAritmetica"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:198:1: operacaoAritmetica : ( PLUS | MINUS | STAR | SLASH );
    public final void operacaoAritmetica() throws RecognitionException {
        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:199:2: ( PLUS | MINUS | STAR | SLASH )
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            if ( input.LA(1)==MINUS||input.LA(1)==PLUS||(input.LA(1) >= SLASH && input.LA(1) <= STAR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "operacaoAritmetica"

    // Delegated rules


 

    public static final BitSet FOLLOW_MAIN_in_grama313 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_grama315 = new BitSet(new long[]{0x0000017820018000L});
    public static final BitSet FOLLOW_bloco_in_grama317 = new BitSet(new long[]{0x0000017820018000L});
    public static final BitSet FOLLOW_RCURLY_in_grama320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_variavel_in_bloco331 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_bloco333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicaoVariavel_in_bloco338 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_bloco340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_bloco345 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_bloco347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_if_in_bloco352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_while_in_bloco357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_definicao_while368 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_definicao_while370 = new BitSet(new long[]{0x0000000600228C20L});
    public static final BitSet FOLLOW_condicao_in_definicao_while372 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_definicao_while374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_definicao_while376 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_definicao_while378 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_definicao_while380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_definicao_if392 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_definicao_if394 = new BitSet(new long[]{0x0000000600228C20L});
    public static final BitSet FOLLOW_condicao_in_definicao_if396 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_definicao_if398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_definicao_if400 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_definicao_if402 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_definicao_if404 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ELSE_in_definicao_if407 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_definicao_if409 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_definicao_if411 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_definicao_if413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_definicao_variavel427 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_definicao_variavel429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcao468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao470 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_funcao472 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao474 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_41_in_funcao477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao479 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcao483 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_funcao485 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_funcao487 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_funcao489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declaracaoSimbolo500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_condicao511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_condicao516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_condicao521 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_condicao524 = new BitSet(new long[]{0x000000000B183110L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao528 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_condicao532 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_condicao535 = new BitSet(new long[]{0x000000000B183112L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao538 = new BitSet(new long[]{0x0000000600228C20L});
    public static final BitSet FOLLOW_condicao_in_condicao540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_condicao547 = new BitSet(new long[]{0x000000000B183110L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao551 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_condicao555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaFuncao620 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_chamadaFuncao622 = new BitSet(new long[]{0x0000020240028820L});
    public static final BitSet FOLLOW_argumento_in_chamadaFuncao625 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_41_in_chamadaFuncao631 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_chamadaFuncao634 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_RPAREN_in_chamadaFuncao640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicaoVariavel653 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_atribuicaoVariavel655 = new BitSet(new long[]{0x0000000200228820L});
    public static final BitSet FOLLOW_expressao_in_atribuicaoVariavel657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_expressao673 = new BitSet(new long[]{0x0000000190800002L});
    public static final BitSet FOLLOW_operacaoAritmetica_in_expressao676 = new BitSet(new long[]{0x0000000200228820L});
    public static final BitSet FOLLOW_expressao_in_expressao678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expressao685 = new BitSet(new long[]{0x0000000240228820L});
    public static final BitSet FOLLOW_expressao_in_expressao687 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_expressao689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_argumento701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_argumento706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_argumento711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_argumento716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argumento721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_argumento726 = new BitSet(new long[]{0x0000000000000002L});

}