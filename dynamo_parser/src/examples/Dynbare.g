grammar Dynbare;

options {
    output=AST;
} 

tokens {
  DOCUMENT;
  CONTROL;
  PARAMS;
  FORMAL_PARAMS;
  LOCALS;
  MODEL;
  MACRODEF;
  MODULE;
  VARIABLES;
  CONST;
  RATE; 
  AUX;
  TAUX;
  XCOORDS;
  YCOORDS;
  PTS;
  LEVEL;
  IVALUE;
  EQN;
  PLOTVLIST;
  PLOTVAR;
  SCALE;
  VIEW;
  }
  
@header {
package examples;
import java.util.HashMap;

}

@lexer::header {package examples;}

prog
	: macroDef* defaultModule? namedModule* (controlSector (controlStat | comment )+ viewSpec*)? NEWLINE* -> ^(DOCUMENT ^(CONTROL controlStat*) ^(MODEL (defaultModule ^(VIEW viewSpec*)?)? namedModule*)  macroDef* ) 
	;
 	
controlModule
 	:	controlSector (controlStat | comment )+ viewSpec*-> ^(CONTROL  controlStat+) ^(VIEW viewSpec*)
 	;
 	   	 	             
controlStat   
    :	simSpec 
    |   runSpec ->
    ;
        
defaultModule
	:	(definition | comment)+ -> ^(MODULE ID["default"] ^(VARIABLES definition+) )
	;
	    
namedModule  
    	:	sector (definition | comment)+ -> ^(MODULE sector ^(VARIABLES definition+) )
    	;
    	    
definition
    :	auxDef
    |   lvlDef
    |   initDef
    |	constDef 
    |   rateDef 
    |   tblDef  
    ;
	
sector 
 	:	NOTE '*' 'P' WS+ '['  SECTOR '=' ID  ']' lineComment?  NEWLINE -> ID
 	;

controlSector 
 	:	NOTE '*' 'C' WS+ '['  SECTOR '=' ID ']' lineComment?  NEWLINE -> ID
 	;
 	
 		 	    
viewSpec
  	:	PLOT WS+ plotVarList (('/') plotVarList)* NEWLINE -> ^(PLOT plotVarList+)
    |   	PRINT WS+ varList NEWLINE ->
    ;    

plotVarList
 	:   scaleSpec (',' scaleSpec )* -> ^(PLOTVLIST scaleSpec+)
    ;
    
scaleSpec 
	: ( plotVar (scaleRange)?) -> ^(PLOTVAR plotVar scaleRange?)
	;
    
plotVar : ID '=' plotChar -> ID
	;

plotChar:   ID|NUMBER|'+'|'*'|'-' ->
	;
    
scaleRange : '(' min ',' max ')'  -> ^(SCALE min max)
	 ;  		 	    

min: NUMBER;
max: NUMBER;
    
runSpec	
    	:	RUN lineComment? NEWLINE
    	;
    
simSpec 
    	:	SPEC WS paramAssignment ((','|'/') paramAssignment)* NEWLINE -> ^(PARAMS paramAssignment+)
    	;
    
macroDef 
 	:	macroStart intrnlStmt* (definition | comment)+  macroEnd -> ^(MACRO macroStart intrnlStmt ^(VARIABLES definition+))
 	;
 	
macroStart
 	:	MACRO WS+ ID ('(' formalParams')' )? WS* NEWLINE -> ID formalParams
 	; 	
intrnlStmt
 	:	INTRN WS+ ID (',' ID)* NEWLINE	-> ^(LOCALS ID*)
 	;
 	
macroEnd
 	:	MEND  WS* NEWLINE ->
 	;	
formalParams
	:     	ID (',' ID)* -> ^(FORMAL_PARAMS ID*)
	;

paramAssignment
    	:	ID '=' expr -> ^('=' ID expr)
    	;        
varList
 	:	colspec? ID ((','|'/') ID )*
 	;
drawInterval
 	:	'(' intervalStart ',' intervalStop ')'
 	;
drawChar
 	:	'+'|'*'
 	; 	
 	
intervalStart
 	:	NUMBER
 	;
 	
intervalStop
 	:	NUMBER
 	; 	 	
colspec
 	:	NUMBER ')'
 	;
 	
constDef 
	:	'C' WS+ id=ID '=' eqn lineComment? NEWLINE -> ^(AUX ID eqn) 
	;
initDef
	:	'N' WS+ ID '=' eqn lineComment? NEWLINE -> ^(IVALUE ID eqn)
	;

auxDef
	: 'A' WS+ ID timeExt '=' tableFunction lineComment? NEWLINE  -> ^(TAUX ID tableFunction )
	| 'A' WS+ ID timeExt '=' eqn lineComment? NEWLINE  -> ^(AUX ID eqn)	 
	;

tableFunction
 	: expol=('TABLE'| 'TABXT' | 'TABPL'| 'TABHL' ) '(' tName=ID ',' eqId=ID timeExt? ',' xMin=NUMBER ',' xMax=NUMBER ',' step=NUMBER ')'-> ^(EQN $eqId) ID[$tName.text] ^(XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
 	;


rateDef
	:	'R' WS+ ID  timeExt '=' eqn lineComment? NEWLINE -> ^(RATE ID  eqn )
	;

lvlDef
	:	'L' WS+ ID timeExt '=' eqn lineComment? NEWLINE -> ^(LEVEL ID eqn )
	;
tblDef
	:	'T' WS+ ID '=' rangeList lineComment? NEWLINE -> ^(YCOORDS ID ^(PTS rangeList))
	;

comment
 	:	NOTE lineComment? NEWLINE
    |   NOTE WS+ NEWLINE
 	;

rangeList 
	:	 NUMBER ((','|'/') NUMBER)* -> NUMBER+ 
	;

eqn
	: expr	-> ^(EQN expr)
	;
expr
    :   multExpr 
        (   ('+'|'-') multExpr )* 
    ;

multExpr 
    :   atom ( ('*'|'/') atom )*
    ; 

atom 
    :   NUMBER 
    |   ID  timeExt? -> ID
    |   funcRef
    |   '(' expr ')' 
    ;
    
funcRef 
   	:   ID '(' paramList ')'
    	;
    	
paramList
	:    expr (',' expr )*
	;
	
timeExt :	'\.' JKL 
	;
	
lineComment
	: WS+ commentText;
	
	
commentText
 	:	(~(WS|NEWLINE)(~NEWLINE)*)
  ;

NUMBER  :   ('+'|'-')?(('0'..'9')*'\.')?('0'..'9')+(('E'|'e')('+'|'-')?('0'..'9')+)?  ;
JKL 	:	('K' ('L')?) | ('J' ('K')?) ;
NOTE	: 	'NOTE' ;
PLOT    : 	'PLOT' ;
RUN     :	'RUN' ;
SPEC    :	'SPEC';
PRINT   :	'PRINT' ;
SECTOR	:	'SECTOR';
MACRO   :	'MACRO';
MEND    :	'MEND';
INTRN   :	'INTRN';
ID    	:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+  ;

