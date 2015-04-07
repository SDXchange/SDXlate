// $ANTLR 3.5.2 ./Expr.g 2015-01-24 12:45:34

package examples;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "C_MARK", "ID", "INT", "NEWLINE", 
		"P_MARK", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int C_MARK=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int NEWLINE=7;
	public static final int P_MARK=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./Expr.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// ./Expr.g:14:1: prog : ( stat )+ ;
	public final ExprParser.prog_return prog() throws RecognitionException {
		ExprParser.prog_return retval = new ExprParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try {
			// ./Expr.g:14:5: ( ( stat )+ )
			// ./Expr.g:14:8: ( stat )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// ./Expr.g:14:8: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= C_MARK && LA1_0 <= P_MARK)||LA1_0==10) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./Expr.g:14:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog50);
					stat1=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat1.getTree());

					System.out.println((stat1!=null?((CommonTree)stat1.getTree()):null).toStringTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// ./Expr.g:17:1: stat : ( mark NEWLINE | expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->);
	public final ExprParser.stat_return stat() throws RecognitionException {
		ExprParser.stat_return retval = new ExprParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NEWLINE3=null;
		Token NEWLINE5=null;
		Token ID6=null;
		Token char_literal7=null;
		Token NEWLINE9=null;
		Token NEWLINE10=null;
		ParserRuleReturnScope mark2 =null;
		ParserRuleReturnScope expr4 =null;
		ParserRuleReturnScope expr8 =null;

		CommonTree NEWLINE3_tree=null;
		CommonTree NEWLINE5_tree=null;
		CommonTree ID6_tree=null;
		CommonTree char_literal7_tree=null;
		CommonTree NEWLINE9_tree=null;
		CommonTree NEWLINE10_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// ./Expr.g:17:5: ( mark NEWLINE | expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->)
			int alt2=4;
			switch ( input.LA(1) ) {
			case C_MARK:
			case P_MARK:
				{
				alt2=1;
				}
				break;
			case INT:
			case 10:
				{
				alt2=2;
				}
				break;
			case ID:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==15) ) {
					alt2=3;
				}
				else if ( (LA2_3==NEWLINE||(LA2_3 >= 12 && LA2_3 <= 14)) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// ./Expr.g:17:8: mark NEWLINE
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_mark_in_stat65);
					mark2=mark();
					state._fsp--;

					adaptor.addChild(root_0, mark2.getTree());

					NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat67); 
					NEWLINE3_tree = (CommonTree)adaptor.create(NEWLINE3);
					adaptor.addChild(root_0, NEWLINE3_tree);

					}
					break;
				case 2 :
					// ./Expr.g:18:10: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_stat78);
					expr4=expr();
					state._fsp--;

					stream_expr.add(expr4.getTree());
					NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat80);  
					stream_NEWLINE.add(NEWLINE5);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 18:30: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// ./Expr.g:19:9: ID '=' expr NEWLINE
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_stat101);  
					stream_ID.add(ID6);

					char_literal7=(Token)match(input,15,FOLLOW_15_in_stat103);  
					stream_15.add(char_literal7);

					pushFollow(FOLLOW_expr_in_stat105);
					expr8=expr();
					state._fsp--;

					stream_expr.add(expr8.getTree());
					NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat107);  
					stream_NEWLINE.add(NEWLINE9);

					// AST REWRITE
					// elements: ID, 15, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 19:29: -> ^( '=' ID expr )
					{
						// ./Expr.g:19:32: ^( '=' ID expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_15.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// ./Expr.g:20:9: NEWLINE
					{
					NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat127);  
					stream_NEWLINE.add(NEWLINE10);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 20:29: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ./Expr.g:23:1: expr : multExpr ( ( '+' ^| '-' ^) multExpr )* ;
	public final ExprParser.expr_return expr() throws RecognitionException {
		ExprParser.expr_return retval = new ExprParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		Token char_literal13=null;
		ParserRuleReturnScope multExpr11 =null;
		ParserRuleReturnScope multExpr14 =null;

		CommonTree char_literal12_tree=null;
		CommonTree char_literal13_tree=null;

		try {
			// ./Expr.g:23:5: ( multExpr ( ( '+' ^| '-' ^) multExpr )* )
			// ./Expr.g:23:9: multExpr ( ( '+' ^| '-' ^) multExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr155);
			multExpr11=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr11.getTree());

			// ./Expr.g:23:18: ( ( '+' ^| '-' ^) multExpr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 13 && LA4_0 <= 14)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./Expr.g:23:19: ( '+' ^| '-' ^) multExpr
					{
					// ./Expr.g:23:19: ( '+' ^| '-' ^)
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==13) ) {
						alt3=1;
					}
					else if ( (LA3_0==14) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// ./Expr.g:23:20: '+' ^
							{
							char_literal12=(Token)match(input,13,FOLLOW_13_in_expr159); 
							char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);

							}
							break;
						case 2 :
							// ./Expr.g:23:25: '-' ^
							{
							char_literal13=(Token)match(input,14,FOLLOW_14_in_expr162); 
							char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExpr_in_expr166);
					multExpr14=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr14.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// ./Expr.g:26:1: multExpr : atom ( '*' ^ atom )* ;
	public final ExprParser.multExpr_return multExpr() throws RecognitionException {
		ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal16=null;
		ParserRuleReturnScope atom15 =null;
		ParserRuleReturnScope atom17 =null;

		CommonTree char_literal16_tree=null;

		try {
			// ./Expr.g:27:5: ( atom ( '*' ^ atom )* )
			// ./Expr.g:27:9: atom ( '*' ^ atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpr188);
			atom15=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom15.getTree());

			// ./Expr.g:27:14: ( '*' ^ atom )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==12) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./Expr.g:27:15: '*' ^ atom
					{
					char_literal16=(Token)match(input,12,FOLLOW_12_in_multExpr191); 
					char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal16_tree, root_0);

					pushFollow(FOLLOW_atom_in_multExpr194);
					atom17=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom17.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// ./Expr.g:30:1: atom : ( INT | ID | '(' ! expr ')' !);
	public final ExprParser.atom_return atom() throws RecognitionException {
		ExprParser.atom_return retval = new ExprParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT18=null;
		Token ID19=null;
		Token char_literal20=null;
		Token char_literal22=null;
		ParserRuleReturnScope expr21 =null;

		CommonTree INT18_tree=null;
		CommonTree ID19_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal22_tree=null;

		try {
			// ./Expr.g:30:5: ( INT | ID | '(' ! expr ')' !)
			int alt6=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case 10:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// ./Expr.g:30:9: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT18=(Token)match(input,INT,FOLLOW_INT_in_atom211); 
					INT18_tree = (CommonTree)adaptor.create(INT18);
					adaptor.addChild(root_0, INT18_tree);

					}
					break;
				case 2 :
					// ./Expr.g:31:9: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID19=(Token)match(input,ID,FOLLOW_ID_in_atom222); 
					ID19_tree = (CommonTree)adaptor.create(ID19);
					adaptor.addChild(root_0, ID19_tree);

					}
					break;
				case 3 :
					// ./Expr.g:32:9: '(' ! expr ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal20=(Token)match(input,10,FOLLOW_10_in_atom232); 
					pushFollow(FOLLOW_expr_in_atom235);
					expr21=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr21.getTree());

					char_literal22=(Token)match(input,11,FOLLOW_11_in_atom237); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class mark_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mark"
	// ./Expr.g:35:1: mark : ( C_MARK | P_MARK );
	public final ExprParser.mark_return mark() throws RecognitionException {
		ExprParser.mark_return retval = new ExprParser.mark_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set23=null;

		CommonTree set23_tree=null;

		try {
			// ./Expr.g:35:6: ( C_MARK | P_MARK )
			// ./Expr.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set23=input.LT(1);
			if ( input.LA(1)==C_MARK||input.LA(1)==P_MARK ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set23));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mark"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog50 = new BitSet(new long[]{0x00000000000005F2L});
	public static final BitSet FOLLOW_mark_in_stat65 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat78 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat101 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stat103 = new BitSet(new long[]{0x0000000000000460L});
	public static final BitSet FOLLOW_expr_in_stat105 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr155 = new BitSet(new long[]{0x0000000000006002L});
	public static final BitSet FOLLOW_13_in_expr159 = new BitSet(new long[]{0x0000000000000460L});
	public static final BitSet FOLLOW_14_in_expr162 = new BitSet(new long[]{0x0000000000000460L});
	public static final BitSet FOLLOW_multExpr_in_expr166 = new BitSet(new long[]{0x0000000000006002L});
	public static final BitSet FOLLOW_atom_in_multExpr188 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_multExpr191 = new BitSet(new long[]{0x0000000000000460L});
	public static final BitSet FOLLOW_atom_in_multExpr194 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_INT_in_atom211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_atom232 = new BitSet(new long[]{0x0000000000000460L});
	public static final BitSet FOLLOW_expr_in_atom235 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom237 = new BitSet(new long[]{0x0000000000000002L});
}
