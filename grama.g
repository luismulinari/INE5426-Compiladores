grammar grama;

grama
	: 'main ' '{' bloco* '}'
	;

bloco
	: definicao_variavel ';'
	| atribuicaoVariavel ';'
	| chamadaFuncao ';'
	| definicao_if
	| definicao_while
	;

definicao_while
	: 'while' '(' condicao ')' '{' bloco '}'
	;

definicao_if
	 : 'if' '(' condicao ')' '{' bloco '}' ('else' '{' bloco '}')?
	 ;

definicao_variavel
	: type ID
	;

type
  	: 'int'
	| 'char'
	| 'string'
	| 'float'
	;

funcao
	: type declaracaoSimbolo '(' declaracaoSimbolo (',' declaracaoSimbolo)* ')' '{' bloco '}'
	;

declaracaoSimbolo
	: ID
	;

condicao
	: 'true'
	| 'false'
	| '(' (argumento) (operacaoBooleana) (argumento) ')' (operacaoBooleana condicao)?
	|(argumento) (operacaoBooleana) (argumento)
	;


operacaoBooleana
	: '!='
	| '=='
	| '||'
	| '&&'
	| '~'
	| '>'
	| '<'
	| '>='
	| '<='
	;

chamadaFuncao
	 : ID '(' (argumento) ? (',' (argumento) )* ')'
	 ;

atribuicaoVariavel
	 : ID '=' expressao
	 ;

// Colocar precedencia de parenteses e verificar prioriodades das operacoes artimeticas
expressao
	:
	| argumento (operacaoAritmetica expressao)?
	| '(' expressao ')'
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
	: '+'
	| '-'
	| '*'
	| '/'
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
