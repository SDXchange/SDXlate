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

	
	
numLit:
	(PLUS|MINUS)? (INTEGER|FNUM)
	;
		
	
funcRef: 
	builtin LPAREN exprList RPAREN
	| DT
	;

builtin:
	MATHFUNC | STATFUNC | DLYFUNC | TESTFUNC | MISCFUNC
	;
		
macroRef:
	| ID LPAREN exprList RPAREN
	;
	
exprList: expr (COMMA expr) * ;


