grammar Dynamo;

options {
    output=AST;
} 

tokens {
  DOCUMENT;
  CONTROL;
  PARAMS;
  FORMAL_PARAMS;
  FREF;
  LOCALS;
  MODEL;
  MACRODEF;
  MODULE;
  VARIABLES;
  CONST;
  RATE; 
  AUX;
  TAUX;
  PAUX;
  XCOORDS;
  YCOORDS;
  PTS;
  LEVEL;
  IVALUE;
  EQN;
  PLOTVLIST;
  PLOTVAR;
  SCALE;
  UNARYMINUS;
  UNARYPLUS;
  VIEW;
  }
  
@header {
package org.sdxchange.dynamo.parser;
import java.util.HashMap;
}

@lexer::header {package org.sdxchange.dynamo.parser;}

@lexer::members {
	public int lexField = 0;

	}

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

comment
    :  {input.LT(1).getText().contentEquals("NOTE")}? NOTE COMMENT? NEWLINE  ->
    ;
    	
sector 
 	:	PSECTOR WS+ '['  SECTOR '=' ID  ']' lineComment? WS? NEWLINE -> ID
 	;

controlSector 
 	:	CSECTOR WS+ '['  SECTOR '=' ID ']' lineComment? WS? NEWLINE -> ID
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
    	:	{input.LT(1).getText().contentEquals("RUN")}? RUN COMMENT? NEWLINE
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
    	:	ID '=' expr -> ^(PAUX ID expr) 
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
	:	'C' WS+ id=ID '=' eqn lineComment? WS? NEWLINE -> ^(AUX ID eqn) 
	;
initDef
	:	'N' WS+ ID '=' eqn lineComment? WS? NEWLINE -> ^(IVALUE ID eqn)
	;

auxDef
	: 'A' WS+ ID timeExt '=' tableFunction lineComment? WS? NEWLINE  -> ^(TAUX ID tableFunction )
	| 'A' WS+ ID timeExt '=' eqn lineComment? WS?  NEWLINE  -> ^(AUX ID eqn)	 
	;

tableFunction
 	: expol=('TABLE'| 'TABXT' | 'TABPL'| 'TABHL' ) '(' tName=ID ',' eqId=ID timeExt? ',' xMin=NUMBER ',' xMax=NUMBER ',' step=NUMBER ')'-> ^(EQN $eqId) ID[$tName.text] ^(XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
 	;


rateDef
	:	'R' WS+ ID  timeExt '=' eqn lineComment? WS? NEWLINE -> ^(RATE ID  eqn )
	;

lvlDef
	:	'L' WS+ ID timeExt '=' eqn lineComment? WS?  NEWLINE -> ^(LEVEL ID eqn )
	;
tblDef
	:	'T' WS+ ID '=' rangeList lineComment? WS?  NEWLINE -> ^(YCOORDS ID ^(PTS rangeList))
	;

lineComment: WS COMMENT;

rangeList 
	:	 NUMBER ((','|'/') NUMBER)* -> NUMBER+ 
	;

eqn
	: expr 	-> ^(EQN expr)
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
    	{ String temp = $NUMBER.text; 
    	  $NUMBER.setText(temp.replace("E", "e"));
    	}
   	
    |   cc='-' ID  timeExt? -> UNARYMINUS[$cc,"-"] ID
    |   '+' ID  timeExt? -> ID
    |   ID  timeExt? -> ID
    |   funcRef 
    |   '(' expr ')' 
    ;
    
funcRef 
   	:   ID '(' paramList ')' -> ^( FREF ID paramList ) 
    	;
    	
paramList
	:    expr (',' expr )*
	;
	
timeExt :	'\.' JKL 
	;
		
NUMBER  :   ('+'|'-')?(('0'..'9')*'\.')?('0'..'9')+(('E'|'e')('+'|'-')?('0'..'9')+)?  ;
JKL 	:	('K' ('L')?) | ('J' ('K')?) ;
CSECTOR :   {lexField==0}? 'NOTE*C' ;
PSECTOR :   {lexField==0}? 'NOTE*P' ;
NOTE	: 	'NOTE' {lexField = 2; };
PLOT    : 	'PLOT' ;
RUN     :	'RUN' {lexField = 2; };
SPEC    :	'SPEC';
PRINT   :	'PRINT' ;
SECTOR	:	'SECTOR';
MACRO   :	'MACRO';
MEND    :	'MEND';
INTRN   :	'INTRN';
ID    	:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
NEWLINE: ('\r'? '\n')+ {lexField = 0; };
WS  :   (' '|'\t')+  { lexField += 1 ;  };
COMMENT:  {lexField >= 2}?=> (~'\n')*;

