tree grammar DynWalk;


options {
    tokenVocab=Dynbare;
    rewrite=true;
    ASTLabelType=CommonTree;
}

tokens {
   VARDEF;
   }
    
@header {
package examples;
import java.util.HashMap;
}

  
prog: x=defaultModule? namedModule* 
	; 
   
defaultModule
	:	(definition)+ 
	;
	    
namedModule  
    	:	sector (definition)+
    	;

definition 
    :	x=auxDef  -> ^(nil x)
    |   lvlDef 
    |   initDef 
    |	constDef 
    |   rateDef 
    ;

constDef:	'C' WS+ id=ID '=' expr lineComment? NEWLINE ;
	
	
initDef
	:	'N' WS+ ID '=' expr lineComment? NEWLINE
	;

auxDef
	:	'A' WS+ ID timeExt '=' expr lineComment? NEWLINE
	;

rateDef
	:	'R' WS+ ID timeExt '=' expr lineComment? NEWLINE
	;

timeExt :	'\.' JKL   
	;

lvlDef
	:	'L' WS+ ID timeExt '=' expr lineComment? NEWLINE
	;
sector 
 	:	NOTE '*' 'P' WS+ '['  SECTOR '=' ID  ']' lineComment?  NEWLINE
 	;

expr
    :   multExpr 
        (   ('+'|'-') multExpr )*
    ;

multExpr 
    :   atom ( ('*'|'/') atom )*
    ; 

atom 
    :   fpNum
    |   INT 
    |   ID  timeExt?
    |   funcRef
    |   '(' expr ')' 
    ;
    
funcRef 
   	:   ID '(' paramList ')'
    	;
    	
paramList
	:    expr (',' expr )*
	;
	

fpNum 	
	:	mantissa exponent? 
	;

mantissa 
	:	(signedInt)? '\.' INT 
	;

exponent
 	:	('E'|'e') ('+'|'-')? INT 
 	;		

signedInt
 	:	(UNARY)? INT
 	;	

comment
 	:	NOTE lineComment? NEWLINE
    |   NOTE WS+ NEWLINE
 	;

lineComment
	: WS+ commentText;
	
	
commentText
 	:	(~(WS|NEWLINE)(~NEWLINE)*)
  ;
  

	 