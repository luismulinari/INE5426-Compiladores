grammar grama;

// TOKENS

GREATER
	:	'>'
	;

LESSEQUAL
	:	'<='
	;

LESS
	:	'<'
	;

WHILE
	:	'while'
	;

IF
	:	'if'
	;

LCURLY
	:	'{'
	;

RCURLY
	:	'}'
	;

ELSE
	:	'else'
	;

LPAREN
	:	'('
	;

RPAREN
	:	')'
	;

MAIN
	:	'main '
	;

T_INT
	:	'int'
	;

T_CHAR
	:	'char'
	;

T_STRING
	:	'string'
	;

T_FLOAT
	:	'float'
	;

TRUE
	:	'true'
	;

FALSE
	:	'false'
	;

NOTEQUAL
	:	'!='
	;

EQUAL
	:	'=='
	;

NOT
	:	'~'
	;

OR
	:	'||'
	;

AND
	:	'&&'
	;

PLUS
	:	'+'
	;

MINUS
	:	'-'
	;

STAR
	:	'*'
	;

SLASH
	:	'/'
	;
GREATEREQUAL
	:	'>='
	;
// FIM TOKENS
	

grama
	: MAIN LCURLY bloco* RCURLY
	;

bloco
	: definicao_variavel ';'
	| atribuicaoVariavel ';'
	| chamadaFuncao ';'
	| definicao_if
	| definicao_while
	;

definicao_while
	: WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY
	;

definicao_if
	 : IF LPAREN condicao RPAREN LCURLY bloco RCURLY (ELSE LCURLY bloco RCURLY)?
	 ;

definicao_variavel
	: type ID
	;

type
  	: T_INT
	| T_CHAR
	| T_STRING
	| T_FLOAT
	;

funcao
	: type declaracaoSimbolo LPAREN declaracaoSimbolo (',' declaracaoSimbolo)* RPAREN LCURLY bloco RCURLY
	;

declaracaoSimbolo
	: ID
	;

condicao
	: TRUE
	| FALSE
	| LPAREN (argumento) (operacaoBooleana) (argumento) RPAREN (operacaoBooleana condicao)?
	|(argumento) (operacaoBooleana) (argumento)
	;


operacaoBooleana
	: NOTEQUAL
	| EQUAL
	| OR
	| AND
	| NOT
	| LESS
	| GREATER
	| LESSEQUAL
	| GREATEREQUAL
	;

chamadaFuncao
	 : ID LPAREN (argumento) ? (',' (argumento) )* RPAREN
	 ;

atribuicaoVariavel
	 : ID '=' expressao
	 ;

// Colocar precedencia de parenteses e verificar prioriodades das operacoes artimeticas
expressao
	:
	| argumento (operacaoAritmetica expressao)?
	| LPAREN expressao RPAREN
	;

argumento 
	: ID
	| INT
	| FLOAT
	| CHAR
	| STRING
	| chamadaFuncao
	;

operacaoAritmetica
	: PLUS
	| MINUS
	| STAR
	| SLASH
	;

ID
	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

INT	: '0'..'9'+
	;

FLOAT
 	: INT+ '.' INT+
 	;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
