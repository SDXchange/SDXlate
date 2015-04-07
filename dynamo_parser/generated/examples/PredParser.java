// $ANTLR 3.5.2 ./Pred.g 2015-01-24 15:50:31

  	package examples;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PredParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "C_MARK", "ID", "INT", 
		"MARK", "NEWLINE", "P_MARK", "WS", "'('", "')'", "'*'", "'+'", "'-'", 
		"'='"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int COMMENT=4;
	public static final int C_MARK=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int MARK=8;
	public static final int NEWLINE=9;
	public static final int P_MARK=10;
	public static final int WS=11;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PredParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PredParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PredParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./Pred.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// ./Pred.g:27:1: prog : ( stat )+ ;
	public final PredParser.prog_return prog() throws RecognitionException {
		PredParser.prog_return retval = new PredParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try {
			// ./Pred.g:28:4: ( ( stat )+ )
			// ./Pred.g:28:7: ( stat )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// ./Pred.g:28:7: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MARK) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./Pred.g:28:8: stat
					{
					pushFollow(FOLLOW_stat_in_prog78);
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
	// ./Pred.g:30:1: stat : ({...}? mark ( comment )? NEWLINE | mark WS eqn ( WS comment )? ( WS )? NEWLINE );
	public final PredParser.stat_return stat() throws RecognitionException {
		PredParser.stat_return retval = new PredParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NEWLINE4=null;
		Token WS6=null;
		Token WS8=null;
		Token WS10=null;
		Token NEWLINE11=null;
		ParserRuleReturnScope mark2 =null;
		ParserRuleReturnScope comment3 =null;
		ParserRuleReturnScope mark5 =null;
		ParserRuleReturnScope eqn7 =null;
		ParserRuleReturnScope comment9 =null;

		CommonTree NEWLINE4_tree=null;
		CommonTree WS6_tree=null;
		CommonTree WS8_tree=null;
		CommonTree WS10_tree=null;
		CommonTree NEWLINE11_tree=null;

		try {
			// ./Pred.g:30:5: ({...}? mark ( comment )? NEWLINE | mark WS eqn ( WS comment )? ( WS )? NEWLINE )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==MARK) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==COMMENT||LA5_1==NEWLINE) ) {
					alt5=1;
				}
				else if ( (LA5_1==WS) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ./Pred.g:30:9: {...}? mark ( comment )? NEWLINE
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( !((input.LT(1).getText().contentEquals("MEMO"))) ) {
						throw new FailedPredicateException(input, "stat", "input.LT(1).getText().contentEquals(\"MEMO\")");
					}
					pushFollow(FOLLOW_mark_in_stat96);
					mark2=mark();
					state._fsp--;

					adaptor.addChild(root_0, mark2.getTree());

					// ./Pred.g:30:62: ( comment )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==COMMENT) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// ./Pred.g:30:62: comment
							{
							pushFollow(FOLLOW_comment_in_stat98);
							comment3=comment();
							state._fsp--;

							adaptor.addChild(root_0, comment3.getTree());

							}
							break;

					}

					NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat101); 
					NEWLINE4_tree = (CommonTree)adaptor.create(NEWLINE4);
					adaptor.addChild(root_0, NEWLINE4_tree);

					}
					break;
				case 2 :
					// ./Pred.g:31:7: mark WS eqn ( WS comment )? ( WS )? NEWLINE
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_mark_in_stat109);
					mark5=mark();
					state._fsp--;

					adaptor.addChild(root_0, mark5.getTree());

					WS6=(Token)match(input,WS,FOLLOW_WS_in_stat111); 
					WS6_tree = (CommonTree)adaptor.create(WS6);
					adaptor.addChild(root_0, WS6_tree);

					pushFollow(FOLLOW_eqn_in_stat113);
					eqn7=eqn();
					state._fsp--;

					adaptor.addChild(root_0, eqn7.getTree());

					// ./Pred.g:31:19: ( WS comment )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==WS) ) {
						int LA3_1 = input.LA(2);
						if ( (LA3_1==COMMENT) ) {
							alt3=1;
						}
					}
					switch (alt3) {
						case 1 :
							// ./Pred.g:31:20: WS comment
							{
							WS8=(Token)match(input,WS,FOLLOW_WS_in_stat116); 
							WS8_tree = (CommonTree)adaptor.create(WS8);
							adaptor.addChild(root_0, WS8_tree);

							pushFollow(FOLLOW_comment_in_stat118);
							comment9=comment();
							state._fsp--;

							adaptor.addChild(root_0, comment9.getTree());

							}
							break;

					}

					// ./Pred.g:31:33: ( WS )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==WS) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// ./Pred.g:31:33: WS
							{
							WS10=(Token)match(input,WS,FOLLOW_WS_in_stat122); 
							WS10_tree = (CommonTree)adaptor.create(WS10);
							adaptor.addChild(root_0, WS10_tree);

							}
							break;

					}

					NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat125); 
					NEWLINE11_tree = (CommonTree)adaptor.create(NEWLINE11);
					adaptor.addChild(root_0, NEWLINE11_tree);

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


	public static class eqn_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "eqn"
	// ./Pred.g:35:1: eqn : ID '=' expr ;
	public final PredParser.eqn_return eqn() throws RecognitionException {
		PredParser.eqn_return retval = new PredParser.eqn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID12=null;
		Token char_literal13=null;
		ParserRuleReturnScope expr14 =null;

		CommonTree ID12_tree=null;
		CommonTree char_literal13_tree=null;

		try {
			// ./Pred.g:35:5: ( ID '=' expr )
			// ./Pred.g:35:7: ID '=' expr
			{
			root_0 = (CommonTree)adaptor.nil();


			ID12=(Token)match(input,ID,FOLLOW_ID_in_eqn140); 
			ID12_tree = (CommonTree)adaptor.create(ID12);
			adaptor.addChild(root_0, ID12_tree);

			char_literal13=(Token)match(input,17,FOLLOW_17_in_eqn142); 
			char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
			adaptor.addChild(root_0, char_literal13_tree);

			pushFollow(FOLLOW_expr_in_eqn144);
			expr14=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr14.getTree());

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
	// $ANTLR end "eqn"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ./Pred.g:37:1: expr : multExpr ( ( '+' ^| '-' ^) multExpr )* ;
	public final PredParser.expr_return expr() throws RecognitionException {
		PredParser.expr_return retval = new PredParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal16=null;
		Token char_literal17=null;
		ParserRuleReturnScope multExpr15 =null;
		ParserRuleReturnScope multExpr18 =null;

		CommonTree char_literal16_tree=null;
		CommonTree char_literal17_tree=null;

		try {
			// ./Pred.g:37:5: ( multExpr ( ( '+' ^| '-' ^) multExpr )* )
			// ./Pred.g:37:9: multExpr ( ( '+' ^| '-' ^) multExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr153);
			multExpr15=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr15.getTree());

			// ./Pred.g:37:18: ( ( '+' ^| '-' ^) multExpr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 15 && LA7_0 <= 16)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ./Pred.g:37:19: ( '+' ^| '-' ^) multExpr
					{
					// ./Pred.g:37:19: ( '+' ^| '-' ^)
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==15) ) {
						alt6=1;
					}
					else if ( (LA6_0==16) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// ./Pred.g:37:20: '+' ^
							{
							char_literal16=(Token)match(input,15,FOLLOW_15_in_expr157); 
							char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal16_tree, root_0);

							}
							break;
						case 2 :
							// ./Pred.g:37:25: '-' ^
							{
							char_literal17=(Token)match(input,16,FOLLOW_16_in_expr160); 
							char_literal17_tree = (CommonTree)adaptor.create(char_literal17);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal17_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExpr_in_expr164);
					multExpr18=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr18.getTree());

					}
					break;

				default :
					break loop7;
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
	// ./Pred.g:41:1: multExpr : atom ( '*' ^ atom )* ;
	public final PredParser.multExpr_return multExpr() throws RecognitionException {
		PredParser.multExpr_return retval = new PredParser.multExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal20=null;
		ParserRuleReturnScope atom19 =null;
		ParserRuleReturnScope atom21 =null;

		CommonTree char_literal20_tree=null;

		try {
			// ./Pred.g:42:5: ( atom ( '*' ^ atom )* )
			// ./Pred.g:42:9: atom ( '*' ^ atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpr187);
			atom19=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom19.getTree());

			// ./Pred.g:42:14: ( '*' ^ atom )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==14) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./Pred.g:42:15: '*' ^ atom
					{
					char_literal20=(Token)match(input,14,FOLLOW_14_in_multExpr190); 
					char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal20_tree, root_0);

					pushFollow(FOLLOW_atom_in_multExpr193);
					atom21=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom21.getTree());

					}
					break;

				default :
					break loop8;
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
	// ./Pred.g:45:1: atom : ( INT | ID | '(' ! expr ')' !);
	public final PredParser.atom_return atom() throws RecognitionException {
		PredParser.atom_return retval = new PredParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT22=null;
		Token ID23=null;
		Token char_literal24=null;
		Token char_literal26=null;
		ParserRuleReturnScope expr25 =null;

		CommonTree INT22_tree=null;
		CommonTree ID23_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree char_literal26_tree=null;

		try {
			// ./Pred.g:45:5: ( INT | ID | '(' ! expr ')' !)
			int alt9=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt9=1;
				}
				break;
			case ID:
				{
				alt9=2;
				}
				break;
			case 12:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// ./Pred.g:45:9: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT22=(Token)match(input,INT,FOLLOW_INT_in_atom210); 
					INT22_tree = (CommonTree)adaptor.create(INT22);
					adaptor.addChild(root_0, INT22_tree);

					}
					break;
				case 2 :
					// ./Pred.g:46:9: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID23=(Token)match(input,ID,FOLLOW_ID_in_atom221); 
					ID23_tree = (CommonTree)adaptor.create(ID23);
					adaptor.addChild(root_0, ID23_tree);

					}
					break;
				case 3 :
					// ./Pred.g:47:9: '(' ! expr ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal24=(Token)match(input,12,FOLLOW_12_in_atom231); 
					pushFollow(FOLLOW_expr_in_atom234);
					expr25=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr25.getTree());

					char_literal26=(Token)match(input,13,FOLLOW_13_in_atom236); 
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
	// ./Pred.g:50:1: mark : MARK ;
	public final PredParser.mark_return mark() throws RecognitionException {
		PredParser.mark_return retval = new PredParser.mark_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MARK27=null;

		CommonTree MARK27_tree=null;

		try {
			// ./Pred.g:50:6: ( MARK )
			// ./Pred.g:50:8: MARK
			{
			root_0 = (CommonTree)adaptor.nil();


			MARK27=(Token)match(input,MARK,FOLLOW_MARK_in_mark254); 
			MARK27_tree = (CommonTree)adaptor.create(MARK27);
			adaptor.addChild(root_0, MARK27_tree);

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


	public static class comment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comment"
	// ./Pred.g:52:1: comment : COMMENT ;
	public final PredParser.comment_return comment() throws RecognitionException {
		PredParser.comment_return retval = new PredParser.comment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMENT28=null;

		CommonTree COMMENT28_tree=null;

		try {
			// ./Pred.g:52:8: ( COMMENT )
			// ./Pred.g:53:4: COMMENT
			{
			root_0 = (CommonTree)adaptor.nil();


			COMMENT28=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment265); 
			COMMENT28_tree = (CommonTree)adaptor.create(COMMENT28);
			adaptor.addChild(root_0, COMMENT28_tree);

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
	// $ANTLR end "comment"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog78 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_mark_in_stat96 = new BitSet(new long[]{0x0000000000000210L});
	public static final BitSet FOLLOW_comment_in_stat98 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_stat101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mark_in_stat109 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_WS_in_stat111 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_eqn_in_stat113 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_WS_in_stat116 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_comment_in_stat118 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_WS_in_stat122 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_stat125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_eqn140 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_eqn142 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expr_in_eqn144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr153 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_15_in_expr157 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_16_in_expr160 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_multExpr_in_expr164 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_atom_in_multExpr187 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_multExpr190 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_atom_in_multExpr193 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_INT_in_atom210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom231 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expr_in_atom234 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_atom236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MARK_in_mark254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment265 = new BitSet(new long[]{0x0000000000000002L});
}
