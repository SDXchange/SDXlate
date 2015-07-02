parser grammar DynamoParser;

options 
{
    language = Java;
    tokenVocab=DynamoLexer; //comment
}

@header {
package org.sdxchange.dynamo.parser4;


}

t:  (starCard endCard)? (macro)* model;

model:
	( (modelCard | expCard) endCard)*
	;
	
modelCard: 
	eqnCard 
	| commentCard  
	;

eqnCard:
	auxDef         # AUX_EQN
	| constDef     # CONST_EQN
	| initDef      # INIT_EQN
	| rateDef      # RATE_EQN
	| stockDef     # LVL_EQN
	| tableDef     # TBL_EQN
	| indexDecl    # IDX_DEC
	| arrayDecl    # ARY_DEC
	;
	
expCard:
	
	specCard
	| runCard
	| printCard
	| plotCard	
	;

arrayDecl:
	FORCARD ID EQUAL  aryBounds ( EQUAL aliasList)? comment?
	;
	
indexDecl:
	INDEXCARD ID EQUAL INTEGER
	;	
	
aryBounds:
	INTEGER COMMA (INTEGER |ID)
	;
	
aliasList:
	ID (COMMA ID)*
	;
		
endCard:
	ENDCARD | ENDCMT
	;
	
starCard:
	STARCARD comment?
	; 
	
commentCard:
	NOTECARD comment?
	;

specCard:
	SPECCARD specAssign ((COMMA|SLASH) specAssign )*
	;
	
specAssign:
	specId EQUAL numLit
	;

specId:
	DT | LENGTH | PLTPER | PRTPER | MAXLEN
	;
	
plotCard:
	PLOTCARD plotList
	;
	
printCard:
	PRINTCARD rptList
	;
rptList:
	rptSpec (separator rptSpec)*		
	;
	
plotList:
	plotSpec (separator plotSpec)*		
	;

rptSpec:
	( columnNum RPAREN)? ID
	;
	
columnNum:
	INTEGER
	;	
	
plotSpec:
	(ID|arrayRef) (EQUAL plotChar bounds?)?
	;
	
plotChar:
	(.|PLUS|MINUS|STAR|SLASH)
	;

bounds:
	LPAREN numLit COMMA numLit RPAREN
	;
		
runCard:
	RUNCARD comment
	;
separator:
	COMMA|SLASH
	;
			
numLit:
	(PLUS|MINUS)? (INTEGER|FNUM)
	;
		
macro:
	MACROCARD ID LPAREN dummyList RPAREN endCard
	macroDef
	MENDCARD endCard
	;

macroDef:
	(internDef endCard)* 
	(modelCard endCard)*
	;	
	
internDef:
	INTRNCARD localList
	;

localList:
	ID ( COMMA ID)*
	;

dummyList:
	ID ( COMMA ID)*
	;
			
auxDef:
	AUXCARD eqn ( ENDEQN comment? )?
	;

constDef:
	CONSTCARD eqn (ENDEQN comment?)? 
	;

initDef:
	INITCARD eqn ( ENDEQN comment? )?
	;

rateDef:
	RATECARD eqn ( ENDEQN comment? )?
	;
	
stockDef:
	LVLCARD eqn ( ENDEQN comment? )?
	;
	
tableDef:
	TBLCARD (ID| arrayRef) EQUAL yValues ( ENDEQN comment? )?
	;

yValues:
	numLit ( separator numLit )*	
	; 
		
comment: COMMENT
	;

eqn: varRef  EQUAL expr; //handle TIME special case pugh p88

varRef: (ID timeScript?) 
	| arrayRef 
	| predefinedVar 
	;

expr: 
	LPAREN expr RPAREN
	|expr powerOp expr
	|expr ( STAR | SLASH ) expr
	|implicitMultExpr
	|expr ( PLUS | MINUS ) expr
	|(PLUS | MINUS) expr
	|expr ( LT | GT ) expr
	|numLit
	|tabRef
	|funcRef 
	|macroRef 
	| arrayRef // timescript and subscript, fails macro semantic predicate
	| predefinedVar
	| ID timeScript?
	;

tabRef: 
	TABFUNC LPAREN exprList RPAREN
	;

arrayRef:
	ID timeScript? LBRACKET indexList RBRACKET
	|ID timeScript? LPAREN indexList RPAREN
	;
	
indexList:
	STAR |
	exprList 	
	;
	
predefinedVar:
	(MAXLEN | LENGTH | PRTPER) timeScript?
	;
implicitMultExpr:
	LPAREN expr RPAREN LPAREN expr RPAREN
	;

powerOp: 
	STAR STAR 
	| CARET
	;
		
timeScript:
	(DOT JKL)
	;
	
funcRef: 
	BUILTIN LPAREN exprList RPAREN
	| DT
	;
	
macroRef:
	| ID LPAREN exprList RPAREN
	;
	
exprList: expr (COMMA expr) * ;


