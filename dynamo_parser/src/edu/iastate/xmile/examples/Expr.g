grammar Expr;


options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}

@header {
package examples;
}
@lexer::header {package examples;}

prog:  (stat {System.out.println($stat.tree.toStringTree());})+  ;


stat:  mark NEWLINE
    |    expr NEWLINE        -> expr
    |   ID '=' expr NEWLINE -> ^('=' ID expr)
    |   NEWLINE             ->
    ;

expr:   multExpr (('+'^|'-'^) multExpr)*
    ; 

multExpr
    :   atom ('*'^ atom)*
    ; 

atom:   INT 
    |   ID
    |   '('! expr ')'!
    ;
    
mark : C_MARK
	|P_MARK
;
	

P_MARK	:  'P' ;
C_MARK	:  'C' ;
		

ID  :  ('a'..'z'|'A'..'Z')+ ;
    
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;