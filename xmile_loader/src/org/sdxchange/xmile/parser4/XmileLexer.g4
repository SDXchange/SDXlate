lexer grammar XmileLexer;

//We assume that identifiers have been normalized so that all spaces are mapped to underscore. 

@header {
package org.sdxchange.xmile.parser4;
}

// default mode

LCURLY : '{' -> channel(HIDDEN),mode(CMTMODE);

FNUM : (('0'..'9')*'.')?('0'..'9')+('e'|'E')(('+'|'-')?)('0'..'9')+ 
	| (('0'..'9')*'.')('0'..'9')+
	;
 
LBRACKET : '[' ;
RBRACKET : ']' ;
LPAREN : '(' ;
RPAREN : ')' ;
CARET: '^';
NOT: 'NOT';
STAR : '*';
SLASH : '/' ;
MOD: 'MOD';
PLUS : '+';
MINUS : '-' ;
LTE   : '<=';
LT    : '<' ;
GTE   : '>=';
GT    : '>' ;
EQUAL : '=' ;
NOTEQUAL: '<>';
AND : 'AND';
OR: 'OR';
IF: 'IF';
THEN: 'THEN';
ELSE: 'ELSE';

OTHER : '!' | '#' | '%' | ':' ;

DT : 'DT';

 
MATHFUNC : 
	'ABS' | 'ARCCOS'| 'ARCSIN' | 'ARCTAN'| 'COS'| 'EXP'
	|'INF'| 'INT' | 'LN'| 'LOG10'| 'MAX'|'MIN'|'PI'| 'SIN'
	| 'SQRT'| 'TAN'
	;
STATFUNC: 
	'EXPRND'|'LOGNORMAL'|'NORMAL'|'POISSON'|'RANDOM'
	;
DLYFUNC: 
	'DELAY' |'DELAY1' | 'DELAY3' | 'DELAYN' | 'FORCST'
	| 'SMTH1' | 'SMTH3' | 'SMTHN' | 'TREND'
	;
TESTFUNC:
	'PULSE' | 'RAMP' | 'STEP'
	;
TIMEFUNC:
	'DT' | 'STARTTIME' | 'STOPTIME' | 'TIME' | 'SDX_TIME'
	;
MISCFUNC:
	'IF_THEN_ELSE' | 'INIT' | 'PREVIOUS' | 'SELF'
	;
	

//TODO: add unicode character range	
ID:  
	 ('a'..'z'|'A'..'Z'|'$')+
	|  ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*('a'..'z'|'A'..'Z'|'0'..'9'|'$')+
	;
INTEGER  :   ('0'..'9')+;
WS  :   (' '|'\t')+ -> channel(HIDDEN);
DOT : '.';
COMMA: ',';

mode CMTMODE;

RCURLY: '}' -> channel(HIDDEN), mode(DEFAULT_MODE);
COMMENT: ~('}')+ ->channel(HIDDEN) ;

