grammar Pred;

options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}

tokens {
  P_MARK;
  C_MARK;
}

@header {
  	package examples;
}

@lexer::header {
	package examples;

}

@lexer::members {
	public int lexField = 0;

	}

prog
   :  (stat {System.out.println($stat.tree.toStringTree());})+  ;

stat:   {input.LT(1).getText().contentEquals("MEMO")}?  mark comment? NEWLINE
	   | mark WS eqn (WS comment)? WS? NEWLINE 
	   ;


eqn : ID '=' expr;

expr:   multExpr (('+'^|'-'^) multExpr)*
    ; 


multExpr
    :   atom ('*'^ atom)*
    ; 

atom:   INT 
    |   ID
    |   '('! expr ')'!
    ;
    
mark : MARK;

comment: 
   COMMENT;
   
MARK : {getCharPositionInLine() == 0}? 'C'
	| {getCharPositionInLine() == 0}? 'P'
	| {getCharPositionInLine() == 0}? 'MEMO' {lexField = 2; }
	;		

ID  :  ('a'..'z'|'A'..'Z')+ ;
    
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' {lexField = 0; };
WS  :   (' '|'\t')+ { lexField +=1 ; } ;
COMMENT: {lexField >= 2}?=> (~'\n')*;
