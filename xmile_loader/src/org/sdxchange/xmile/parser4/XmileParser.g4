parser grammar XmileParser;

options 
{
    language = Java;
    tokenVocab=XmileLexer; //comment
}

@header {
package org.sdxchange.xmile.parser4;

}
	
expr: 
	arrayRef 
	|ifExpr
	|funcRef 
	|macroRef 
	|LPAREN expr RPAREN
	|expr CARET expr
	|(PLUS | MINUS | NOT) expr
	|expr ( STAR | SLASH | MOD ) expr
	|expr ( PLUS | MINUS ) expr
	|expr ( LT | GT | LTE | GTE) expr
	|expr ( EQUAL | NOTEQUAL )
	|expr AND expr
	|expr OR expr
	|numLit
	|ID 
	;


arrayRef:
	ID  LBRACKET exprList RBRACKET
	|ID  LPAREN exprList RPAREN
	;

ifExpr:
	| IF expr THEN expr ELSE expr
	;
	
numLit:
	(PLUS|MINUS)? (INTEGER|FNUM)
	;
		
	
funcRef: 
	TIMEFUNC LPAREN RPAREN
	| TIMEFUNC (LPAREN exprList RPAREN)
	| TIMEFUNC
	| builtin LPAREN exprList RPAREN
	;

builtin:
	MATHFUNC | STATFUNC | DLYFUNC | TESTFUNC | MISCFUNC 
	;
		
macroRef:
	| ID LPAREN exprList RPAREN
	;
	
exprList: expr (COMMA expr) * ;


