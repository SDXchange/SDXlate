lexer grammar DynamoLexer;

@header {
package org.sdxchange.dynamo.parser4;
}

// default mode

NEWLINE: ('\r'? '\n')+ ;
CONTINUATION : WS? NEWLINE 'X' WS ->skip;
AUXCARD:   'A' WS+ -> mode(EQNMODE);
CONSTCARD: 'C' WS+ -> mode(EQNMODE);
LVLCARD:   'L' WS+ -> mode(EQNMODE);
RATECARD:  'R' WS+ -> mode(EQNMODE);
INITCARD:  'N' WS+ -> mode(EQNMODE);
TBLCARD:   'T' WS+ -> mode(EQNMODE);
INDEXCARD: 'I' WS+ -> mode(EQNMODE);
FORCARD:   'FOR'   WS+ -> mode(EQNMODE);
SPECCARD:  'SPEC'  WS+ -> mode(EQNMODE);
NOTECARD:  'NOTE'  WS? -> mode(CMTMODE);
RUNCARD:   'RUN'   WS? -> mode(CMTMODE);
PLOTCARD:  'PLOT'  WS+ -> mode(EQNMODE);
PRINTCARD: 'PRINT' WS+ -> mode(EQNMODE);
MACROCARD: 'MACRO' WS+ -> mode(EQNMODE);
MENDCARD:  'MEND'  WS? -> mode(CMTMODE); 
INTRNCARD: 'INTRN' WS+ -> mode(EQNMODE);
STARCARD:  '*'     WS? -> mode(CMTMODE);

mode EQNMODE;

CONTINUATION2 : WS? NEWLINE 'X' WS ->skip;
ENDCARD: WS? NEWLINE -> mode(DEFAULT_MODE);
ENDEQN: WS -> mode(CMTMODE);

FNUM : (('0'..'9')*'.')?('0'..'9')+('e'|'E')(('+'|'-')?)('0'..'9')+ 
	| (('0'..'9')*'.')('0'..'9')+
	;
 

LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
STAR : '*';
CARET: '^';
PLUS : '+';
MINUS : '-' ;
SLASH : '/' ;
EQUAL : '=' ;
LT    : '<' ;
GT    : '>' ;

OTHER : '!' | '#' | '%' | ':' ;

DT : 'DT';

LENGTH: 'LENGTH';
PLTPER: 'PLTPER';
PRTPER: 'PRTPER';
MAXLEN: 'MAXLEN';

 
BUILTIN : 'SQRT' | 'DELAY1' | 'DELAY3' | 'SIN' | 'COS' 
        | 'EXP' | 'MAX' | 'MIN' | 'STEP' | 'RAMP' | 'PULSE'
        | 'SMOOTH'| 'LOGN' | 'CLIP' | 'SWITCH' | 'NOISE'
        | 'DELAYP' | 'DLINF3' | 'IF_THEN_ELSE' | 'SUM'; 
        
TABFUNC:  'TABLE' | 'TABHL' | 'TABXT' | 'TABPL' ;
        
JKL 	:	( ('K' ('L')?) | ('J' ('K')?));
ID    	:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
INTEGER  :   ('0'..'9')+;
WS  :   (' '|'\t')+ ;
DOT : '.';
COMMA: ',';

mode CMTMODE;

COMMENT: ~('\r'|'\n')+ ;
ENDCMT: WS? NEWLINE -> mode(DEFAULT_MODE);

