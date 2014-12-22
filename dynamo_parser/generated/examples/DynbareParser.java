// $ANTLR 3.5.2 ./examples/Dynbare.g 2014-12-16 23:20:11

package examples;
import java.util.HashMap;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DynbareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUX", "CONST", "CONTROL", "DOCUMENT", 
		"EQN", "FORMAL_PARAMS", "ID", "INTRN", "IVALUE", "JKL", "LEVEL", "LOCALS", 
		"MACRO", "MACRODEF", "MEND", "MODEL", "MODULE", "NEWLINE", "NOTE", "NUMBER", 
		"PARAMS", "PLOT", "PLOTVAR", "PLOTVLIST", "PRINT", "PTS", "RATE", "RUN", 
		"SCALE", "SECTOR", "SPEC", "TAUX", "VARIABLES", "VIEW", "WS", "XCOORDS", 
		"YCOORDS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'A'", 
		"'C'", "'L'", "'N'", "'P'", "'R'", "'T'", "'TABHL'", "'TABLE'", "'TABPL'", 
		"'TABXT'", "'['", "'\\.'", "']'"
	};
	public static final int EOF=-1;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int AUX=4;
	public static final int CONST=5;
	public static final int CONTROL=6;
	public static final int DOCUMENT=7;
	public static final int EQN=8;
	public static final int FORMAL_PARAMS=9;
	public static final int ID=10;
	public static final int INTRN=11;
	public static final int IVALUE=12;
	public static final int JKL=13;
	public static final int LEVEL=14;
	public static final int LOCALS=15;
	public static final int MACRO=16;
	public static final int MACRODEF=17;
	public static final int MEND=18;
	public static final int MODEL=19;
	public static final int MODULE=20;
	public static final int NEWLINE=21;
	public static final int NOTE=22;
	public static final int NUMBER=23;
	public static final int PARAMS=24;
	public static final int PLOT=25;
	public static final int PLOTVAR=26;
	public static final int PLOTVLIST=27;
	public static final int PRINT=28;
	public static final int PTS=29;
	public static final int RATE=30;
	public static final int RUN=31;
	public static final int SCALE=32;
	public static final int SECTOR=33;
	public static final int SPEC=34;
	public static final int TAUX=35;
	public static final int VARIABLES=36;
	public static final int VIEW=37;
	public static final int WS=38;
	public static final int XCOORDS=39;
	public static final int YCOORDS=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DynbareParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DynbareParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DynbareParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./examples/Dynbare.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// ./examples/Dynbare.g:41:1: prog : ( macroDef )* ( defaultModule )? ( namedModule )* ( controlSector ( controlStat | comment )+ ( viewSpec )* )? ( NEWLINE )* -> ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* ) ;
	public final DynbareParser.prog_return prog() throws RecognitionException {
		DynbareParser.prog_return retval = new DynbareParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE8=null;
		ParserRuleReturnScope macroDef1 =null;
		ParserRuleReturnScope defaultModule2 =null;
		ParserRuleReturnScope namedModule3 =null;
		ParserRuleReturnScope controlSector4 =null;
		ParserRuleReturnScope controlStat5 =null;
		ParserRuleReturnScope comment6 =null;
		ParserRuleReturnScope viewSpec7 =null;

		Object NEWLINE8_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleSubtreeStream stream_controlSector=new RewriteRuleSubtreeStream(adaptor,"rule controlSector");
		RewriteRuleSubtreeStream stream_viewSpec=new RewriteRuleSubtreeStream(adaptor,"rule viewSpec");
		RewriteRuleSubtreeStream stream_controlStat=new RewriteRuleSubtreeStream(adaptor,"rule controlStat");
		RewriteRuleSubtreeStream stream_macroDef=new RewriteRuleSubtreeStream(adaptor,"rule macroDef");
		RewriteRuleSubtreeStream stream_defaultModule=new RewriteRuleSubtreeStream(adaptor,"rule defaultModule");
		RewriteRuleSubtreeStream stream_namedModule=new RewriteRuleSubtreeStream(adaptor,"rule namedModule");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:42:2: ( ( macroDef )* ( defaultModule )? ( namedModule )* ( controlSector ( controlStat | comment )+ ( viewSpec )* )? ( NEWLINE )* -> ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* ) )
			// ./examples/Dynbare.g:42:4: ( macroDef )* ( defaultModule )? ( namedModule )* ( controlSector ( controlStat | comment )+ ( viewSpec )* )? ( NEWLINE )*
			{
			// ./examples/Dynbare.g:42:4: ( macroDef )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MACRO) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./examples/Dynbare.g:42:4: macroDef
					{
					pushFollow(FOLLOW_macroDef_in_prog166);
					macroDef1=macroDef();
					state._fsp--;

					stream_macroDef.add(macroDef1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// ./examples/Dynbare.g:42:14: ( defaultModule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= 49 && LA2_0 <= 52)||(LA2_0 >= 54 && LA2_0 <= 55)) ) {
				alt2=1;
			}
			else if ( (LA2_0==NOTE) ) {
				int LA2_2 = input.LA(2);
				if ( (LA2_2==NEWLINE||LA2_2==WS) ) {
					alt2=1;
				}
			}
			switch (alt2) {
				case 1 :
					// ./examples/Dynbare.g:42:14: defaultModule
					{
					pushFollow(FOLLOW_defaultModule_in_prog169);
					defaultModule2=defaultModule();
					state._fsp--;

					stream_defaultModule.add(defaultModule2.getTree());
					}
					break;

			}

			// ./examples/Dynbare.g:42:29: ( namedModule )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==NOTE) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==43) ) {
						int LA3_3 = input.LA(3);
						if ( (LA3_3==53) ) {
							alt3=1;
						}

					}

				}

				switch (alt3) {
				case 1 :
					// ./examples/Dynbare.g:42:29: namedModule
					{
					pushFollow(FOLLOW_namedModule_in_prog172);
					namedModule3=namedModule();
					state._fsp--;

					stream_namedModule.add(namedModule3.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// ./examples/Dynbare.g:42:42: ( controlSector ( controlStat | comment )+ ( viewSpec )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==NOTE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ./examples/Dynbare.g:42:43: controlSector ( controlStat | comment )+ ( viewSpec )*
					{
					pushFollow(FOLLOW_controlSector_in_prog176);
					controlSector4=controlSector();
					state._fsp--;

					stream_controlSector.add(controlSector4.getTree());
					// ./examples/Dynbare.g:42:57: ( controlStat | comment )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=3;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==RUN||LA4_0==SPEC) ) {
							alt4=1;
						}
						else if ( (LA4_0==NOTE) ) {
							alt4=2;
						}

						switch (alt4) {
						case 1 :
							// ./examples/Dynbare.g:42:58: controlStat
							{
							pushFollow(FOLLOW_controlStat_in_prog179);
							controlStat5=controlStat();
							state._fsp--;

							stream_controlStat.add(controlStat5.getTree());
							}
							break;
						case 2 :
							// ./examples/Dynbare.g:42:72: comment
							{
							pushFollow(FOLLOW_comment_in_prog183);
							comment6=comment();
							state._fsp--;

							stream_comment.add(comment6.getTree());
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// ./examples/Dynbare.g:42:83: ( viewSpec )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==PLOT||LA5_0==PRINT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// ./examples/Dynbare.g:42:83: viewSpec
							{
							pushFollow(FOLLOW_viewSpec_in_prog188);
							viewSpec7=viewSpec();
							state._fsp--;

							stream_viewSpec.add(viewSpec7.getTree());
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			// ./examples/Dynbare.g:42:95: ( NEWLINE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==NEWLINE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ./examples/Dynbare.g:42:95: NEWLINE
					{
					NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog193);  
					stream_NEWLINE.add(NEWLINE8);

					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: macroDef, viewSpec, controlStat, namedModule, defaultModule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 42:104: -> ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* )
			{
				// ./examples/Dynbare.g:42:107: ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOCUMENT, "DOCUMENT"), root_1);
				// ./examples/Dynbare.g:42:118: ^( CONTROL ( controlStat )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_2);
				// ./examples/Dynbare.g:42:128: ( controlStat )*
				while ( stream_controlStat.hasNext() ) {
					adaptor.addChild(root_2, stream_controlStat.nextTree());
				}
				stream_controlStat.reset();

				adaptor.addChild(root_1, root_2);
				}

				// ./examples/Dynbare.g:42:142: ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODEL, "MODEL"), root_2);
				// ./examples/Dynbare.g:42:150: ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )?
				if ( stream_defaultModule.hasNext() ) {
					adaptor.addChild(root_2, stream_defaultModule.nextTree());
					// ./examples/Dynbare.g:42:165: ( ^( VIEW ( viewSpec )* ) )?
					if ( stream_viewSpec.hasNext() ) {
						// ./examples/Dynbare.g:42:165: ^( VIEW ( viewSpec )* )
						{
						Object root_3 = (Object)adaptor.nil();
						root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(VIEW, "VIEW"), root_3);
						// ./examples/Dynbare.g:42:172: ( viewSpec )*
						while ( stream_viewSpec.hasNext() ) {
							adaptor.addChild(root_3, stream_viewSpec.nextTree());
						}
						stream_viewSpec.reset();

						adaptor.addChild(root_2, root_3);
						}

					}
					stream_viewSpec.reset();

				}
				stream_defaultModule.reset();

				// ./examples/Dynbare.g:42:186: ( namedModule )*
				while ( stream_namedModule.hasNext() ) {
					adaptor.addChild(root_2, stream_namedModule.nextTree());
				}
				stream_namedModule.reset();

				adaptor.addChild(root_1, root_2);
				}

				// ./examples/Dynbare.g:42:201: ( macroDef )*
				while ( stream_macroDef.hasNext() ) {
					adaptor.addChild(root_1, stream_macroDef.nextTree());
				}
				stream_macroDef.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class controlModule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "controlModule"
	// ./examples/Dynbare.g:45:1: controlModule : controlSector ( controlStat | comment )+ ( viewSpec )* -> ^( CONTROL ( controlStat )+ ) ^( VIEW ( viewSpec )* ) ;
	public final DynbareParser.controlModule_return controlModule() throws RecognitionException {
		DynbareParser.controlModule_return retval = new DynbareParser.controlModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope controlSector9 =null;
		ParserRuleReturnScope controlStat10 =null;
		ParserRuleReturnScope comment11 =null;
		ParserRuleReturnScope viewSpec12 =null;

		RewriteRuleSubtreeStream stream_controlSector=new RewriteRuleSubtreeStream(adaptor,"rule controlSector");
		RewriteRuleSubtreeStream stream_viewSpec=new RewriteRuleSubtreeStream(adaptor,"rule viewSpec");
		RewriteRuleSubtreeStream stream_controlStat=new RewriteRuleSubtreeStream(adaptor,"rule controlStat");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:46:3: ( controlSector ( controlStat | comment )+ ( viewSpec )* -> ^( CONTROL ( controlStat )+ ) ^( VIEW ( viewSpec )* ) )
			// ./examples/Dynbare.g:46:5: controlSector ( controlStat | comment )+ ( viewSpec )*
			{
			pushFollow(FOLLOW_controlSector_in_controlModule247);
			controlSector9=controlSector();
			state._fsp--;

			stream_controlSector.add(controlSector9.getTree());
			// ./examples/Dynbare.g:46:19: ( controlStat | comment )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RUN||LA8_0==SPEC) ) {
					alt8=1;
				}
				else if ( (LA8_0==NOTE) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// ./examples/Dynbare.g:46:20: controlStat
					{
					pushFollow(FOLLOW_controlStat_in_controlModule250);
					controlStat10=controlStat();
					state._fsp--;

					stream_controlStat.add(controlStat10.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:46:34: comment
					{
					pushFollow(FOLLOW_comment_in_controlModule254);
					comment11=comment();
					state._fsp--;

					stream_comment.add(comment11.getTree());
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			// ./examples/Dynbare.g:46:45: ( viewSpec )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==PLOT||LA9_0==PRINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./examples/Dynbare.g:46:45: viewSpec
					{
					pushFollow(FOLLOW_viewSpec_in_controlModule259);
					viewSpec12=viewSpec();
					state._fsp--;

					stream_viewSpec.add(viewSpec12.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// AST REWRITE
			// elements: viewSpec, controlStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:54: -> ^( CONTROL ( controlStat )+ ) ^( VIEW ( viewSpec )* )
			{
				// ./examples/Dynbare.g:46:57: ^( CONTROL ( controlStat )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_1);
				if ( !(stream_controlStat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_controlStat.hasNext() ) {
					adaptor.addChild(root_1, stream_controlStat.nextTree());
				}
				stream_controlStat.reset();

				adaptor.addChild(root_0, root_1);
				}

				// ./examples/Dynbare.g:46:82: ^( VIEW ( viewSpec )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VIEW, "VIEW"), root_1);
				// ./examples/Dynbare.g:46:89: ( viewSpec )*
				while ( stream_viewSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_viewSpec.nextTree());
				}
				stream_viewSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "controlModule"


	public static class controlStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "controlStat"
	// ./examples/Dynbare.g:49:1: controlStat : ( simSpec | runSpec ->);
	public final DynbareParser.controlStat_return controlStat() throws RecognitionException {
		DynbareParser.controlStat_return retval = new DynbareParser.controlStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simSpec13 =null;
		ParserRuleReturnScope runSpec14 =null;

		RewriteRuleSubtreeStream stream_runSpec=new RewriteRuleSubtreeStream(adaptor,"rule runSpec");

		try {
			// ./examples/Dynbare.g:50:5: ( simSpec | runSpec ->)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==SPEC) ) {
				alt10=1;
			}
			else if ( (LA10_0==RUN) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// ./examples/Dynbare.g:50:7: simSpec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simSpec_in_controlStat315);
					simSpec13=simSpec();
					state._fsp--;

					adaptor.addChild(root_0, simSpec13.getTree());

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:51:9: runSpec
					{
					pushFollow(FOLLOW_runSpec_in_controlStat326);
					runSpec14=runSpec();
					state._fsp--;

					stream_runSpec.add(runSpec14.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 51:17: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "controlStat"


	public static class defaultModule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultModule"
	// ./examples/Dynbare.g:54:1: defaultModule : ( definition | comment )+ -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) ) ;
	public final DynbareParser.defaultModule_return defaultModule() throws RecognitionException {
		DynbareParser.defaultModule_return retval = new DynbareParser.defaultModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition15 =null;
		ParserRuleReturnScope comment16 =null;

		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:55:2: ( ( definition | comment )+ -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) ) )
			// ./examples/Dynbare.g:55:4: ( definition | comment )+
			{
			// ./examples/Dynbare.g:55:4: ( definition | comment )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==NOTE) ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1==NEWLINE||LA11_1==WS) ) {
						alt11=2;
					}

				}
				else if ( ((LA11_0 >= 49 && LA11_0 <= 52)||(LA11_0 >= 54 && LA11_0 <= 55)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ./examples/Dynbare.g:55:5: definition
					{
					pushFollow(FOLLOW_definition_in_defaultModule351);
					definition15=definition();
					state._fsp--;

					stream_definition.add(definition15.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:55:18: comment
					{
					pushFollow(FOLLOW_comment_in_defaultModule355);
					comment16=comment();
					state._fsp--;

					stream_comment.add(comment16.getTree());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			// AST REWRITE
			// elements: definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:28: -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) )
			{
				// ./examples/Dynbare.g:55:31: ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);
				adaptor.addChild(root_1, (Object)adaptor.create(ID, "default"));
				// ./examples/Dynbare.g:55:54: ^( VARIABLES ( definition )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_2);
				if ( !(stream_definition.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_2, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "defaultModule"


	public static class namedModule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namedModule"
	// ./examples/Dynbare.g:58:1: namedModule : sector ( definition | comment )+ -> ^( MODULE sector ^( VARIABLES ( definition )+ ) ) ;
	public final DynbareParser.namedModule_return namedModule() throws RecognitionException {
		DynbareParser.namedModule_return retval = new DynbareParser.namedModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sector17 =null;
		ParserRuleReturnScope definition18 =null;
		ParserRuleReturnScope comment19 =null;

		RewriteRuleSubtreeStream stream_sector=new RewriteRuleSubtreeStream(adaptor,"rule sector");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:59:6: ( sector ( definition | comment )+ -> ^( MODULE sector ^( VARIABLES ( definition )+ ) ) )
			// ./examples/Dynbare.g:59:8: sector ( definition | comment )+
			{
			pushFollow(FOLLOW_sector_in_namedModule396);
			sector17=sector();
			state._fsp--;

			stream_sector.add(sector17.getTree());
			// ./examples/Dynbare.g:59:15: ( definition | comment )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==NOTE) ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1==NEWLINE||LA12_1==WS) ) {
						alt12=2;
					}

				}
				else if ( ((LA12_0 >= 49 && LA12_0 <= 52)||(LA12_0 >= 54 && LA12_0 <= 55)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./examples/Dynbare.g:59:16: definition
					{
					pushFollow(FOLLOW_definition_in_namedModule399);
					definition18=definition();
					state._fsp--;

					stream_definition.add(definition18.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:59:29: comment
					{
					pushFollow(FOLLOW_comment_in_namedModule403);
					comment19=comment();
					state._fsp--;

					stream_comment.add(comment19.getTree());
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			// AST REWRITE
			// elements: sector, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:39: -> ^( MODULE sector ^( VARIABLES ( definition )+ ) )
			{
				// ./examples/Dynbare.g:59:42: ^( MODULE sector ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);
				adaptor.addChild(root_1, stream_sector.nextTree());
				// ./examples/Dynbare.g:59:58: ^( VARIABLES ( definition )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_2);
				if ( !(stream_definition.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_2, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedModule"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// ./examples/Dynbare.g:62:1: definition : ( auxDef | lvlDef | initDef | constDef | rateDef | tblDef );
	public final DynbareParser.definition_return definition() throws RecognitionException {
		DynbareParser.definition_return retval = new DynbareParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope auxDef20 =null;
		ParserRuleReturnScope lvlDef21 =null;
		ParserRuleReturnScope initDef22 =null;
		ParserRuleReturnScope constDef23 =null;
		ParserRuleReturnScope rateDef24 =null;
		ParserRuleReturnScope tblDef25 =null;


		try {
			// ./examples/Dynbare.g:63:5: ( auxDef | lvlDef | initDef | constDef | rateDef | tblDef )
			int alt13=6;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt13=1;
				}
				break;
			case 51:
				{
				alt13=2;
				}
				break;
			case 52:
				{
				alt13=3;
				}
				break;
			case 50:
				{
				alt13=4;
				}
				break;
			case 54:
				{
				alt13=5;
				}
				break;
			case 55:
				{
				alt13=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// ./examples/Dynbare.g:63:7: auxDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_auxDef_in_definition448);
					auxDef20=auxDef();
					state._fsp--;

					adaptor.addChild(root_0, auxDef20.getTree());

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:64:9: lvlDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvlDef_in_definition458);
					lvlDef21=lvlDef();
					state._fsp--;

					adaptor.addChild(root_0, lvlDef21.getTree());

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:65:9: initDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_initDef_in_definition468);
					initDef22=initDef();
					state._fsp--;

					adaptor.addChild(root_0, initDef22.getTree());

					}
					break;
				case 4 :
					// ./examples/Dynbare.g:66:7: constDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDef_in_definition476);
					constDef23=constDef();
					state._fsp--;

					adaptor.addChild(root_0, constDef23.getTree());

					}
					break;
				case 5 :
					// ./examples/Dynbare.g:67:9: rateDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_rateDef_in_definition487);
					rateDef24=rateDef();
					state._fsp--;

					adaptor.addChild(root_0, rateDef24.getTree());

					}
					break;
				case 6 :
					// ./examples/Dynbare.g:68:9: tblDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tblDef_in_definition498);
					tblDef25=tblDef();
					state._fsp--;

					adaptor.addChild(root_0, tblDef25.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class sector_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sector"
	// ./examples/Dynbare.g:71:1: sector : NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID ;
	public final DynbareParser.sector_return sector() throws RecognitionException {
		DynbareParser.sector_return retval = new DynbareParser.sector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE26=null;
		Token char_literal27=null;
		Token char_literal28=null;
		Token WS29=null;
		Token char_literal30=null;
		Token SECTOR31=null;
		Token char_literal32=null;
		Token ID33=null;
		Token char_literal34=null;
		Token NEWLINE36=null;
		ParserRuleReturnScope lineComment35 =null;

		Object NOTE26_tree=null;
		Object char_literal27_tree=null;
		Object char_literal28_tree=null;
		Object WS29_tree=null;
		Object char_literal30_tree=null;
		Object SECTOR31_tree=null;
		Object char_literal32_tree=null;
		Object ID33_tree=null;
		Object char_literal34_tree=null;
		Object NEWLINE36_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_SECTOR=new RewriteRuleTokenStream(adaptor,"token SECTOR");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_NOTE=new RewriteRuleTokenStream(adaptor,"token NOTE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// ./examples/Dynbare.g:72:3: ( NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID )
			// ./examples/Dynbare.g:72:5: NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE
			{
			NOTE26=(Token)match(input,NOTE,FOLLOW_NOTE_in_sector517);  
			stream_NOTE.add(NOTE26);

			char_literal27=(Token)match(input,43,FOLLOW_43_in_sector519);  
			stream_43.add(char_literal27);

			char_literal28=(Token)match(input,53,FOLLOW_53_in_sector521);  
			stream_53.add(char_literal28);

			// ./examples/Dynbare.g:72:18: ( WS )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==WS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ./examples/Dynbare.g:72:18: WS
					{
					WS29=(Token)match(input,WS,FOLLOW_WS_in_sector523);  
					stream_WS.add(WS29);

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			char_literal30=(Token)match(input,60,FOLLOW_60_in_sector526);  
			stream_60.add(char_literal30);

			SECTOR31=(Token)match(input,SECTOR,FOLLOW_SECTOR_in_sector529);  
			stream_SECTOR.add(SECTOR31);

			char_literal32=(Token)match(input,48,FOLLOW_48_in_sector531);  
			stream_48.add(char_literal32);

			ID33=(Token)match(input,ID,FOLLOW_ID_in_sector533);  
			stream_ID.add(ID33);

			char_literal34=(Token)match(input,62,FOLLOW_62_in_sector536);  
			stream_62.add(char_literal34);

			// ./examples/Dynbare.g:72:46: ( lineComment )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ./examples/Dynbare.g:72:46: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_sector538);
					lineComment35=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment35.getTree());
					}
					break;

			}

			NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_sector542);  
			stream_NEWLINE.add(NEWLINE36);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:68: -> ID
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sector"


	public static class controlSector_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "controlSector"
	// ./examples/Dynbare.g:75:1: controlSector : NOTE '*' 'C' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID ;
	public final DynbareParser.controlSector_return controlSector() throws RecognitionException {
		DynbareParser.controlSector_return retval = new DynbareParser.controlSector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE37=null;
		Token char_literal38=null;
		Token char_literal39=null;
		Token WS40=null;
		Token char_literal41=null;
		Token SECTOR42=null;
		Token char_literal43=null;
		Token ID44=null;
		Token char_literal45=null;
		Token NEWLINE47=null;
		ParserRuleReturnScope lineComment46 =null;

		Object NOTE37_tree=null;
		Object char_literal38_tree=null;
		Object char_literal39_tree=null;
		Object WS40_tree=null;
		Object char_literal41_tree=null;
		Object SECTOR42_tree=null;
		Object char_literal43_tree=null;
		Object ID44_tree=null;
		Object char_literal45_tree=null;
		Object NEWLINE47_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_SECTOR=new RewriteRuleTokenStream(adaptor,"token SECTOR");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_NOTE=new RewriteRuleTokenStream(adaptor,"token NOTE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// ./examples/Dynbare.g:76:3: ( NOTE '*' 'C' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID )
			// ./examples/Dynbare.g:76:5: NOTE '*' 'C' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE
			{
			NOTE37=(Token)match(input,NOTE,FOLLOW_NOTE_in_controlSector560);  
			stream_NOTE.add(NOTE37);

			char_literal38=(Token)match(input,43,FOLLOW_43_in_controlSector562);  
			stream_43.add(char_literal38);

			char_literal39=(Token)match(input,50,FOLLOW_50_in_controlSector564);  
			stream_50.add(char_literal39);

			// ./examples/Dynbare.g:76:18: ( WS )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ./examples/Dynbare.g:76:18: WS
					{
					WS40=(Token)match(input,WS,FOLLOW_WS_in_controlSector566);  
					stream_WS.add(WS40);

					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			char_literal41=(Token)match(input,60,FOLLOW_60_in_controlSector569);  
			stream_60.add(char_literal41);

			SECTOR42=(Token)match(input,SECTOR,FOLLOW_SECTOR_in_controlSector572);  
			stream_SECTOR.add(SECTOR42);

			char_literal43=(Token)match(input,48,FOLLOW_48_in_controlSector574);  
			stream_48.add(char_literal43);

			ID44=(Token)match(input,ID,FOLLOW_ID_in_controlSector576);  
			stream_ID.add(ID44);

			char_literal45=(Token)match(input,62,FOLLOW_62_in_controlSector578);  
			stream_62.add(char_literal45);

			// ./examples/Dynbare.g:76:45: ( lineComment )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==WS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ./examples/Dynbare.g:76:45: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_controlSector580);
					lineComment46=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment46.getTree());
					}
					break;

			}

			NEWLINE47=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_controlSector584);  
			stream_NEWLINE.add(NEWLINE47);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:67: -> ID
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "controlSector"


	public static class viewSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "viewSpec"
	// ./examples/Dynbare.g:80:1: viewSpec : ( PLOT ( WS )+ plotVarList ( ( '/' ) plotVarList )* NEWLINE -> ^( PLOT ( plotVarList )+ ) | PRINT ( WS )+ varList NEWLINE ->);
	public final DynbareParser.viewSpec_return viewSpec() throws RecognitionException {
		DynbareParser.viewSpec_return retval = new DynbareParser.viewSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLOT48=null;
		Token WS49=null;
		Token char_literal51=null;
		Token NEWLINE53=null;
		Token PRINT54=null;
		Token WS55=null;
		Token NEWLINE57=null;
		ParserRuleReturnScope plotVarList50 =null;
		ParserRuleReturnScope plotVarList52 =null;
		ParserRuleReturnScope varList56 =null;

		Object PLOT48_tree=null;
		Object WS49_tree=null;
		Object char_literal51_tree=null;
		Object NEWLINE53_tree=null;
		Object PRINT54_tree=null;
		Object WS55_tree=null;
		Object NEWLINE57_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
		RewriteRuleTokenStream stream_PLOT=new RewriteRuleTokenStream(adaptor,"token PLOT");
		RewriteRuleSubtreeStream stream_plotVarList=new RewriteRuleSubtreeStream(adaptor,"rule plotVarList");
		RewriteRuleSubtreeStream stream_varList=new RewriteRuleSubtreeStream(adaptor,"rule varList");

		try {
			// ./examples/Dynbare.g:81:4: ( PLOT ( WS )+ plotVarList ( ( '/' ) plotVarList )* NEWLINE -> ^( PLOT ( plotVarList )+ ) | PRINT ( WS )+ varList NEWLINE ->)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==PLOT) ) {
				alt21=1;
			}
			else if ( (LA21_0==PRINT) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// ./examples/Dynbare.g:81:6: PLOT ( WS )+ plotVarList ( ( '/' ) plotVarList )* NEWLINE
					{
					PLOT48=(Token)match(input,PLOT,FOLLOW_PLOT_in_viewSpec614);  
					stream_PLOT.add(PLOT48);

					// ./examples/Dynbare.g:81:11: ( WS )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==WS) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// ./examples/Dynbare.g:81:11: WS
							{
							WS49=(Token)match(input,WS,FOLLOW_WS_in_viewSpec616);  
							stream_WS.add(WS49);

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					pushFollow(FOLLOW_plotVarList_in_viewSpec619);
					plotVarList50=plotVarList();
					state._fsp--;

					stream_plotVarList.add(plotVarList50.getTree());
					// ./examples/Dynbare.g:81:27: ( ( '/' ) plotVarList )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==47) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// ./examples/Dynbare.g:81:28: ( '/' ) plotVarList
							{
							// ./examples/Dynbare.g:81:28: ( '/' )
							// ./examples/Dynbare.g:81:29: '/'
							{
							char_literal51=(Token)match(input,47,FOLLOW_47_in_viewSpec623);  
							stream_47.add(char_literal51);

							}

							pushFollow(FOLLOW_plotVarList_in_viewSpec626);
							plotVarList52=plotVarList();
							state._fsp--;

							stream_plotVarList.add(plotVarList52.getTree());
							}
							break;

						default :
							break loop19;
						}
					}

					NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_viewSpec630);  
					stream_NEWLINE.add(NEWLINE53);

					// AST REWRITE
					// elements: plotVarList, PLOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 81:56: -> ^( PLOT ( plotVarList )+ )
					{
						// ./examples/Dynbare.g:81:59: ^( PLOT ( plotVarList )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_PLOT.nextNode(), root_1);
						if ( !(stream_plotVarList.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_plotVarList.hasNext() ) {
							adaptor.addChild(root_1, stream_plotVarList.nextTree());
						}
						stream_plotVarList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:82:10: PRINT ( WS )+ varList NEWLINE
					{
					PRINT54=(Token)match(input,PRINT,FOLLOW_PRINT_in_viewSpec650);  
					stream_PRINT.add(PRINT54);

					// ./examples/Dynbare.g:82:16: ( WS )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==WS) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// ./examples/Dynbare.g:82:16: WS
							{
							WS55=(Token)match(input,WS,FOLLOW_WS_in_viewSpec652);  
							stream_WS.add(WS55);

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					pushFollow(FOLLOW_varList_in_viewSpec655);
					varList56=varList();
					state._fsp--;

					stream_varList.add(varList56.getTree());
					NEWLINE57=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_viewSpec657);  
					stream_NEWLINE.add(NEWLINE57);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:36: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "viewSpec"


	public static class plotVarList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plotVarList"
	// ./examples/Dynbare.g:85:1: plotVarList : scaleSpec ( ',' scaleSpec )* -> ^( PLOTVLIST ( scaleSpec )+ ) ;
	public final DynbareParser.plotVarList_return plotVarList() throws RecognitionException {
		DynbareParser.plotVarList_return retval = new DynbareParser.plotVarList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal59=null;
		ParserRuleReturnScope scaleSpec58 =null;
		ParserRuleReturnScope scaleSpec60 =null;

		Object char_literal59_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_scaleSpec=new RewriteRuleSubtreeStream(adaptor,"rule scaleSpec");

		try {
			// ./examples/Dynbare.g:86:3: ( scaleSpec ( ',' scaleSpec )* -> ^( PLOTVLIST ( scaleSpec )+ ) )
			// ./examples/Dynbare.g:86:7: scaleSpec ( ',' scaleSpec )*
			{
			pushFollow(FOLLOW_scaleSpec_in_plotVarList680);
			scaleSpec58=scaleSpec();
			state._fsp--;

			stream_scaleSpec.add(scaleSpec58.getTree());
			// ./examples/Dynbare.g:86:17: ( ',' scaleSpec )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==45) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ./examples/Dynbare.g:86:18: ',' scaleSpec
					{
					char_literal59=(Token)match(input,45,FOLLOW_45_in_plotVarList683);  
					stream_45.add(char_literal59);

					pushFollow(FOLLOW_scaleSpec_in_plotVarList685);
					scaleSpec60=scaleSpec();
					state._fsp--;

					stream_scaleSpec.add(scaleSpec60.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			// AST REWRITE
			// elements: scaleSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:35: -> ^( PLOTVLIST ( scaleSpec )+ )
			{
				// ./examples/Dynbare.g:86:38: ^( PLOTVLIST ( scaleSpec )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLOTVLIST, "PLOTVLIST"), root_1);
				if ( !(stream_scaleSpec.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_scaleSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_scaleSpec.nextTree());
				}
				stream_scaleSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plotVarList"


	public static class scaleSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scaleSpec"
	// ./examples/Dynbare.g:89:1: scaleSpec : ( plotVar ( scaleRange )? ) -> ^( PLOTVAR plotVar ( scaleRange )? ) ;
	public final DynbareParser.scaleSpec_return scaleSpec() throws RecognitionException {
		DynbareParser.scaleSpec_return retval = new DynbareParser.scaleSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope plotVar61 =null;
		ParserRuleReturnScope scaleRange62 =null;

		RewriteRuleSubtreeStream stream_plotVar=new RewriteRuleSubtreeStream(adaptor,"rule plotVar");
		RewriteRuleSubtreeStream stream_scaleRange=new RewriteRuleSubtreeStream(adaptor,"rule scaleRange");

		try {
			// ./examples/Dynbare.g:90:2: ( ( plotVar ( scaleRange )? ) -> ^( PLOTVAR plotVar ( scaleRange )? ) )
			// ./examples/Dynbare.g:90:4: ( plotVar ( scaleRange )? )
			{
			// ./examples/Dynbare.g:90:4: ( plotVar ( scaleRange )? )
			// ./examples/Dynbare.g:90:6: plotVar ( scaleRange )?
			{
			pushFollow(FOLLOW_plotVar_in_scaleSpec718);
			plotVar61=plotVar();
			state._fsp--;

			stream_plotVar.add(plotVar61.getTree());
			// ./examples/Dynbare.g:90:14: ( scaleRange )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==41) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// ./examples/Dynbare.g:90:15: scaleRange
					{
					pushFollow(FOLLOW_scaleRange_in_scaleSpec721);
					scaleRange62=scaleRange();
					state._fsp--;

					stream_scaleRange.add(scaleRange62.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: plotVar, scaleRange
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:29: -> ^( PLOTVAR plotVar ( scaleRange )? )
			{
				// ./examples/Dynbare.g:90:32: ^( PLOTVAR plotVar ( scaleRange )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLOTVAR, "PLOTVAR"), root_1);
				adaptor.addChild(root_1, stream_plotVar.nextTree());
				// ./examples/Dynbare.g:90:50: ( scaleRange )?
				if ( stream_scaleRange.hasNext() ) {
					adaptor.addChild(root_1, stream_scaleRange.nextTree());
				}
				stream_scaleRange.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scaleSpec"


	public static class plotVar_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plotVar"
	// ./examples/Dynbare.g:93:1: plotVar : ID '=' plotChar -> ID ;
	public final DynbareParser.plotVar_return plotVar() throws RecognitionException {
		DynbareParser.plotVar_return retval = new DynbareParser.plotVar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID63=null;
		Token char_literal64=null;
		ParserRuleReturnScope plotChar65 =null;

		Object ID63_tree=null;
		Object char_literal64_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_plotChar=new RewriteRuleSubtreeStream(adaptor,"rule plotChar");

		try {
			// ./examples/Dynbare.g:93:9: ( ID '=' plotChar -> ID )
			// ./examples/Dynbare.g:93:11: ID '=' plotChar
			{
			ID63=(Token)match(input,ID,FOLLOW_ID_in_plotVar749);  
			stream_ID.add(ID63);

			char_literal64=(Token)match(input,48,FOLLOW_48_in_plotVar751);  
			stream_48.add(char_literal64);

			pushFollow(FOLLOW_plotChar_in_plotVar753);
			plotChar65=plotChar();
			state._fsp--;

			stream_plotChar.add(plotChar65.getTree());
			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 93:27: -> ID
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plotVar"


	public static class plotChar_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plotChar"
	// ./examples/Dynbare.g:96:1: plotChar : ( ID | NUMBER | '+' | '*' | '-' ->);
	public final DynbareParser.plotChar_return plotChar() throws RecognitionException {
		DynbareParser.plotChar_return retval = new DynbareParser.plotChar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID66=null;
		Token NUMBER67=null;
		Token char_literal68=null;
		Token char_literal69=null;
		Token char_literal70=null;

		Object ID66_tree=null;
		Object NUMBER67_tree=null;
		Object char_literal68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal70_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");

		try {
			// ./examples/Dynbare.g:96:9: ( ID | NUMBER | '+' | '*' | '-' ->)
			int alt24=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt24=1;
				}
				break;
			case NUMBER:
				{
				alt24=2;
				}
				break;
			case 44:
				{
				alt24=3;
				}
				break;
			case 43:
				{
				alt24=4;
				}
				break;
			case 46:
				{
				alt24=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// ./examples/Dynbare.g:96:13: ID
					{
					root_0 = (Object)adaptor.nil();


					ID66=(Token)match(input,ID,FOLLOW_ID_in_plotChar768); 
					ID66_tree = (Object)adaptor.create(ID66);
					adaptor.addChild(root_0, ID66_tree);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:96:16: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER67=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_plotChar770); 
					NUMBER67_tree = (Object)adaptor.create(NUMBER67);
					adaptor.addChild(root_0, NUMBER67_tree);

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:96:23: '+'
					{
					root_0 = (Object)adaptor.nil();


					char_literal68=(Token)match(input,44,FOLLOW_44_in_plotChar772); 
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);

					}
					break;
				case 4 :
					// ./examples/Dynbare.g:96:27: '*'
					{
					root_0 = (Object)adaptor.nil();


					char_literal69=(Token)match(input,43,FOLLOW_43_in_plotChar774); 
					char_literal69_tree = (Object)adaptor.create(char_literal69);
					adaptor.addChild(root_0, char_literal69_tree);

					}
					break;
				case 5 :
					// ./examples/Dynbare.g:96:31: '-'
					{
					char_literal70=(Token)match(input,46,FOLLOW_46_in_plotChar776);  
					stream_46.add(char_literal70);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 96:35: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plotChar"


	public static class scaleRange_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scaleRange"
	// ./examples/Dynbare.g:99:1: scaleRange : '(' min ',' max ')' -> ^( SCALE min max ) ;
	public final DynbareParser.scaleRange_return scaleRange() throws RecognitionException {
		DynbareParser.scaleRange_return retval = new DynbareParser.scaleRange_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal71=null;
		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope min72 =null;
		ParserRuleReturnScope max74 =null;

		Object char_literal71_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min");
		RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max");

		try {
			// ./examples/Dynbare.g:99:12: ( '(' min ',' max ')' -> ^( SCALE min max ) )
			// ./examples/Dynbare.g:99:14: '(' min ',' max ')'
			{
			char_literal71=(Token)match(input,41,FOLLOW_41_in_scaleRange792);  
			stream_41.add(char_literal71);

			pushFollow(FOLLOW_min_in_scaleRange794);
			min72=min();
			state._fsp--;

			stream_min.add(min72.getTree());
			char_literal73=(Token)match(input,45,FOLLOW_45_in_scaleRange796);  
			stream_45.add(char_literal73);

			pushFollow(FOLLOW_max_in_scaleRange798);
			max74=max();
			state._fsp--;

			stream_max.add(max74.getTree());
			char_literal75=(Token)match(input,42,FOLLOW_42_in_scaleRange800);  
			stream_42.add(char_literal75);

			// AST REWRITE
			// elements: max, min
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:35: -> ^( SCALE min max )
			{
				// ./examples/Dynbare.g:99:38: ^( SCALE min max )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SCALE, "SCALE"), root_1);
				adaptor.addChild(root_1, stream_min.nextTree());
				adaptor.addChild(root_1, stream_max.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scaleRange"


	public static class min_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "min"
	// ./examples/Dynbare.g:102:1: min : NUMBER ;
	public final DynbareParser.min_return min() throws RecognitionException {
		DynbareParser.min_return retval = new DynbareParser.min_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER76=null;

		Object NUMBER76_tree=null;

		try {
			// ./examples/Dynbare.g:102:4: ( NUMBER )
			// ./examples/Dynbare.g:102:6: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER76=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_min831); 
			NUMBER76_tree = (Object)adaptor.create(NUMBER76);
			adaptor.addChild(root_0, NUMBER76_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "min"


	public static class max_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "max"
	// ./examples/Dynbare.g:103:1: max : NUMBER ;
	public final DynbareParser.max_return max() throws RecognitionException {
		DynbareParser.max_return retval = new DynbareParser.max_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER77=null;

		Object NUMBER77_tree=null;

		try {
			// ./examples/Dynbare.g:103:4: ( NUMBER )
			// ./examples/Dynbare.g:103:6: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER77=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_max837); 
			NUMBER77_tree = (Object)adaptor.create(NUMBER77);
			adaptor.addChild(root_0, NUMBER77_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "max"


	public static class runSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "runSpec"
	// ./examples/Dynbare.g:105:1: runSpec : RUN ( lineComment )? NEWLINE ;
	public final DynbareParser.runSpec_return runSpec() throws RecognitionException {
		DynbareParser.runSpec_return retval = new DynbareParser.runSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RUN78=null;
		Token NEWLINE80=null;
		ParserRuleReturnScope lineComment79 =null;

		Object RUN78_tree=null;
		Object NEWLINE80_tree=null;

		try {
			// ./examples/Dynbare.g:106:6: ( RUN ( lineComment )? NEWLINE )
			// ./examples/Dynbare.g:106:8: RUN ( lineComment )? NEWLINE
			{
			root_0 = (Object)adaptor.nil();


			RUN78=(Token)match(input,RUN,FOLLOW_RUN_in_runSpec855); 
			RUN78_tree = (Object)adaptor.create(RUN78);
			adaptor.addChild(root_0, RUN78_tree);

			// ./examples/Dynbare.g:106:12: ( lineComment )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==WS) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// ./examples/Dynbare.g:106:12: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_runSpec857);
					lineComment79=lineComment();
					state._fsp--;

					adaptor.addChild(root_0, lineComment79.getTree());

					}
					break;

			}

			NEWLINE80=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_runSpec860); 
			NEWLINE80_tree = (Object)adaptor.create(NEWLINE80);
			adaptor.addChild(root_0, NEWLINE80_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "runSpec"


	public static class simSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simSpec"
	// ./examples/Dynbare.g:109:1: simSpec : SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE -> ^( PARAMS ( paramAssignment )+ ) ;
	public final DynbareParser.simSpec_return simSpec() throws RecognitionException {
		DynbareParser.simSpec_return retval = new DynbareParser.simSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SPEC81=null;
		Token WS82=null;
		Token char_literal84=null;
		Token char_literal85=null;
		Token NEWLINE87=null;
		ParserRuleReturnScope paramAssignment83 =null;
		ParserRuleReturnScope paramAssignment86 =null;

		Object SPEC81_tree=null;
		Object WS82_tree=null;
		Object char_literal84_tree=null;
		Object char_literal85_tree=null;
		Object NEWLINE87_tree=null;
		RewriteRuleTokenStream stream_SPEC=new RewriteRuleTokenStream(adaptor,"token SPEC");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_paramAssignment=new RewriteRuleSubtreeStream(adaptor,"rule paramAssignment");

		try {
			// ./examples/Dynbare.g:110:6: ( SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE -> ^( PARAMS ( paramAssignment )+ ) )
			// ./examples/Dynbare.g:110:8: SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE
			{
			SPEC81=(Token)match(input,SPEC,FOLLOW_SPEC_in_simSpec884);  
			stream_SPEC.add(SPEC81);

			WS82=(Token)match(input,WS,FOLLOW_WS_in_simSpec886);  
			stream_WS.add(WS82);

			pushFollow(FOLLOW_paramAssignment_in_simSpec888);
			paramAssignment83=paramAssignment();
			state._fsp--;

			stream_paramAssignment.add(paramAssignment83.getTree());
			// ./examples/Dynbare.g:110:32: ( ( ',' | '/' ) paramAssignment )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==45||LA27_0==47) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// ./examples/Dynbare.g:110:33: ( ',' | '/' ) paramAssignment
					{
					// ./examples/Dynbare.g:110:33: ( ',' | '/' )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==45) ) {
						alt26=1;
					}
					else if ( (LA26_0==47) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// ./examples/Dynbare.g:110:34: ','
							{
							char_literal84=(Token)match(input,45,FOLLOW_45_in_simSpec892);  
							stream_45.add(char_literal84);

							}
							break;
						case 2 :
							// ./examples/Dynbare.g:110:38: '/'
							{
							char_literal85=(Token)match(input,47,FOLLOW_47_in_simSpec894);  
							stream_47.add(char_literal85);

							}
							break;

					}

					pushFollow(FOLLOW_paramAssignment_in_simSpec897);
					paramAssignment86=paramAssignment();
					state._fsp--;

					stream_paramAssignment.add(paramAssignment86.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			NEWLINE87=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_simSpec901);  
			stream_NEWLINE.add(NEWLINE87);

			// AST REWRITE
			// elements: paramAssignment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 110:69: -> ^( PARAMS ( paramAssignment )+ )
			{
				// ./examples/Dynbare.g:110:72: ^( PARAMS ( paramAssignment )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				if ( !(stream_paramAssignment.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_paramAssignment.hasNext() ) {
					adaptor.addChild(root_1, stream_paramAssignment.nextTree());
				}
				stream_paramAssignment.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simSpec"


	public static class macroDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroDef"
	// ./examples/Dynbare.g:113:1: macroDef : macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) ) ;
	public final DynbareParser.macroDef_return macroDef() throws RecognitionException {
		DynbareParser.macroDef_return retval = new DynbareParser.macroDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope macroStart88 =null;
		ParserRuleReturnScope intrnlStmt89 =null;
		ParserRuleReturnScope definition90 =null;
		ParserRuleReturnScope comment91 =null;
		ParserRuleReturnScope macroEnd92 =null;

		RewriteRuleSubtreeStream stream_intrnlStmt=new RewriteRuleSubtreeStream(adaptor,"rule intrnlStmt");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_macroStart=new RewriteRuleSubtreeStream(adaptor,"rule macroStart");
		RewriteRuleSubtreeStream stream_macroEnd=new RewriteRuleSubtreeStream(adaptor,"rule macroEnd");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:114:3: ( macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) ) )
			// ./examples/Dynbare.g:114:5: macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd
			{
			pushFollow(FOLLOW_macroStart_in_macroDef931);
			macroStart88=macroStart();
			state._fsp--;

			stream_macroStart.add(macroStart88.getTree());
			// ./examples/Dynbare.g:114:16: ( intrnlStmt )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==INTRN) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// ./examples/Dynbare.g:114:16: intrnlStmt
					{
					pushFollow(FOLLOW_intrnlStmt_in_macroDef933);
					intrnlStmt89=intrnlStmt();
					state._fsp--;

					stream_intrnlStmt.add(intrnlStmt89.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			// ./examples/Dynbare.g:114:28: ( definition | comment )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= 49 && LA29_0 <= 52)||(LA29_0 >= 54 && LA29_0 <= 55)) ) {
					alt29=1;
				}
				else if ( (LA29_0==NOTE) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// ./examples/Dynbare.g:114:29: definition
					{
					pushFollow(FOLLOW_definition_in_macroDef937);
					definition90=definition();
					state._fsp--;

					stream_definition.add(definition90.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:114:42: comment
					{
					pushFollow(FOLLOW_comment_in_macroDef941);
					comment91=comment();
					state._fsp--;

					stream_comment.add(comment91.getTree());
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			pushFollow(FOLLOW_macroEnd_in_macroDef946);
			macroEnd92=macroEnd();
			state._fsp--;

			stream_macroEnd.add(macroEnd92.getTree());
			// AST REWRITE
			// elements: intrnlStmt, definition, macroStart
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:62: -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) )
			{
				// ./examples/Dynbare.g:114:65: ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MACRO, "MACRO"), root_1);
				adaptor.addChild(root_1, stream_macroStart.nextTree());
				adaptor.addChild(root_1, stream_intrnlStmt.nextTree());
				// ./examples/Dynbare.g:114:95: ^( VARIABLES ( definition )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_2);
				if ( !(stream_definition.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_2, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "macroDef"


	public static class macroStart_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroStart"
	// ./examples/Dynbare.g:117:1: macroStart : MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE -> ID formalParams ;
	public final DynbareParser.macroStart_return macroStart() throws RecognitionException {
		DynbareParser.macroStart_return retval = new DynbareParser.macroStart_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MACRO93=null;
		Token WS94=null;
		Token ID95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token WS99=null;
		Token NEWLINE100=null;
		ParserRuleReturnScope formalParams97 =null;

		Object MACRO93_tree=null;
		Object WS94_tree=null;
		Object ID95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object WS99_tree=null;
		Object NEWLINE100_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_MACRO=new RewriteRuleTokenStream(adaptor,"token MACRO");
		RewriteRuleSubtreeStream stream_formalParams=new RewriteRuleSubtreeStream(adaptor,"rule formalParams");

		try {
			// ./examples/Dynbare.g:118:3: ( MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE -> ID formalParams )
			// ./examples/Dynbare.g:118:5: MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE
			{
			MACRO93=(Token)match(input,MACRO,FOLLOW_MACRO_in_macroStart978);  
			stream_MACRO.add(MACRO93);

			// ./examples/Dynbare.g:118:11: ( WS )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// ./examples/Dynbare.g:118:11: WS
					{
					WS94=(Token)match(input,WS,FOLLOW_WS_in_macroStart980);  
					stream_WS.add(WS94);

					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			ID95=(Token)match(input,ID,FOLLOW_ID_in_macroStart983);  
			stream_ID.add(ID95);

			// ./examples/Dynbare.g:118:18: ( '(' formalParams ')' )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==41) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// ./examples/Dynbare.g:118:19: '(' formalParams ')'
					{
					char_literal96=(Token)match(input,41,FOLLOW_41_in_macroStart986);  
					stream_41.add(char_literal96);

					pushFollow(FOLLOW_formalParams_in_macroStart988);
					formalParams97=formalParams();
					state._fsp--;

					stream_formalParams.add(formalParams97.getTree());
					char_literal98=(Token)match(input,42,FOLLOW_42_in_macroStart989);  
					stream_42.add(char_literal98);

					}
					break;

			}

			// ./examples/Dynbare.g:118:42: ( WS )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==WS) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// ./examples/Dynbare.g:118:42: WS
					{
					WS99=(Token)match(input,WS,FOLLOW_WS_in_macroStart994);  
					stream_WS.add(WS99);

					}
					break;

				default :
					break loop32;
				}
			}

			NEWLINE100=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_macroStart997);  
			stream_NEWLINE.add(NEWLINE100);

			// AST REWRITE
			// elements: ID, formalParams
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 118:54: -> ID formalParams
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				adaptor.addChild(root_0, stream_formalParams.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "macroStart"


	public static class intrnlStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "intrnlStmt"
	// ./examples/Dynbare.g:120:1: intrnlStmt : INTRN ( WS )+ ID ( ',' ID )* NEWLINE -> ^( LOCALS ( ID )* ) ;
	public final DynbareParser.intrnlStmt_return intrnlStmt() throws RecognitionException {
		DynbareParser.intrnlStmt_return retval = new DynbareParser.intrnlStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRN101=null;
		Token WS102=null;
		Token ID103=null;
		Token char_literal104=null;
		Token ID105=null;
		Token NEWLINE106=null;

		Object INTRN101_tree=null;
		Object WS102_tree=null;
		Object ID103_tree=null;
		Object char_literal104_tree=null;
		Object ID105_tree=null;
		Object NEWLINE106_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INTRN=new RewriteRuleTokenStream(adaptor,"token INTRN");

		try {
			// ./examples/Dynbare.g:121:3: ( INTRN ( WS )+ ID ( ',' ID )* NEWLINE -> ^( LOCALS ( ID )* ) )
			// ./examples/Dynbare.g:121:5: INTRN ( WS )+ ID ( ',' ID )* NEWLINE
			{
			INTRN101=(Token)match(input,INTRN,FOLLOW_INTRN_in_intrnlStmt1017);  
			stream_INTRN.add(INTRN101);

			// ./examples/Dynbare.g:121:11: ( WS )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==WS) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// ./examples/Dynbare.g:121:11: WS
					{
					WS102=(Token)match(input,WS,FOLLOW_WS_in_intrnlStmt1019);  
					stream_WS.add(WS102);

					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			ID103=(Token)match(input,ID,FOLLOW_ID_in_intrnlStmt1022);  
			stream_ID.add(ID103);

			// ./examples/Dynbare.g:121:18: ( ',' ID )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==45) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// ./examples/Dynbare.g:121:19: ',' ID
					{
					char_literal104=(Token)match(input,45,FOLLOW_45_in_intrnlStmt1025);  
					stream_45.add(char_literal104);

					ID105=(Token)match(input,ID,FOLLOW_ID_in_intrnlStmt1027);  
					stream_ID.add(ID105);

					}
					break;

				default :
					break loop34;
				}
			}

			NEWLINE106=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_intrnlStmt1031);  
			stream_NEWLINE.add(NEWLINE106);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:36: -> ^( LOCALS ( ID )* )
			{
				// ./examples/Dynbare.g:121:39: ^( LOCALS ( ID )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALS, "LOCALS"), root_1);
				// ./examples/Dynbare.g:121:48: ( ID )*
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_1, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intrnlStmt"


	public static class macroEnd_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroEnd"
	// ./examples/Dynbare.g:124:1: macroEnd : MEND ( WS )* NEWLINE ->;
	public final DynbareParser.macroEnd_return macroEnd() throws RecognitionException {
		DynbareParser.macroEnd_return retval = new DynbareParser.macroEnd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MEND107=null;
		Token WS108=null;
		Token NEWLINE109=null;

		Object MEND107_tree=null;
		Object WS108_tree=null;
		Object NEWLINE109_tree=null;
		RewriteRuleTokenStream stream_MEND=new RewriteRuleTokenStream(adaptor,"token MEND");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");

		try {
			// ./examples/Dynbare.g:125:3: ( MEND ( WS )* NEWLINE ->)
			// ./examples/Dynbare.g:125:5: MEND ( WS )* NEWLINE
			{
			MEND107=(Token)match(input,MEND,FOLLOW_MEND_in_macroEnd1055);  
			stream_MEND.add(MEND107);

			// ./examples/Dynbare.g:125:11: ( WS )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// ./examples/Dynbare.g:125:11: WS
					{
					WS108=(Token)match(input,WS,FOLLOW_WS_in_macroEnd1058);  
					stream_WS.add(WS108);

					}
					break;

				default :
					break loop35;
				}
			}

			NEWLINE109=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_macroEnd1061);  
			stream_NEWLINE.add(NEWLINE109);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:23: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "macroEnd"


	public static class formalParams_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParams"
	// ./examples/Dynbare.g:127:1: formalParams : ID ( ',' ID )* -> ^( FORMAL_PARAMS ( ID )* ) ;
	public final DynbareParser.formalParams_return formalParams() throws RecognitionException {
		DynbareParser.formalParams_return retval = new DynbareParser.formalParams_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID110=null;
		Token char_literal111=null;
		Token ID112=null;

		Object ID110_tree=null;
		Object char_literal111_tree=null;
		Object ID112_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// ./examples/Dynbare.g:128:2: ( ID ( ',' ID )* -> ^( FORMAL_PARAMS ( ID )* ) )
			// ./examples/Dynbare.g:128:9: ID ( ',' ID )*
			{
			ID110=(Token)match(input,ID,FOLLOW_ID_in_formalParams1080);  
			stream_ID.add(ID110);

			// ./examples/Dynbare.g:128:12: ( ',' ID )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==45) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// ./examples/Dynbare.g:128:13: ',' ID
					{
					char_literal111=(Token)match(input,45,FOLLOW_45_in_formalParams1083);  
					stream_45.add(char_literal111);

					ID112=(Token)match(input,ID,FOLLOW_ID_in_formalParams1085);  
					stream_ID.add(ID112);

					}
					break;

				default :
					break loop36;
				}
			}

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:22: -> ^( FORMAL_PARAMS ( ID )* )
			{
				// ./examples/Dynbare.g:128:25: ^( FORMAL_PARAMS ( ID )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMAL_PARAMS, "FORMAL_PARAMS"), root_1);
				// ./examples/Dynbare.g:128:41: ( ID )*
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_1, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParams"


	public static class paramAssignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramAssignment"
	// ./examples/Dynbare.g:131:1: paramAssignment : ID '=' expr -> ^( '=' ID expr ) ;
	public final DynbareParser.paramAssignment_return paramAssignment() throws RecognitionException {
		DynbareParser.paramAssignment_return retval = new DynbareParser.paramAssignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID113=null;
		Token char_literal114=null;
		ParserRuleReturnScope expr115 =null;

		Object ID113_tree=null;
		Object char_literal114_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// ./examples/Dynbare.g:132:6: ( ID '=' expr -> ^( '=' ID expr ) )
			// ./examples/Dynbare.g:132:8: ID '=' expr
			{
			ID113=(Token)match(input,ID,FOLLOW_ID_in_paramAssignment1111);  
			stream_ID.add(ID113);

			char_literal114=(Token)match(input,48,FOLLOW_48_in_paramAssignment1113);  
			stream_48.add(char_literal114);

			pushFollow(FOLLOW_expr_in_paramAssignment1115);
			expr115=expr();
			state._fsp--;

			stream_expr.add(expr115.getTree());
			// AST REWRITE
			// elements: expr, ID, 48
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 132:20: -> ^( '=' ID expr )
			{
				// ./examples/Dynbare.g:132:23: ^( '=' ID expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_48.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramAssignment"


	public static class varList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varList"
	// ./examples/Dynbare.g:134:1: varList : ( colspec )? ID ( ( ',' | '/' ) ID )* ;
	public final DynbareParser.varList_return varList() throws RecognitionException {
		DynbareParser.varList_return retval = new DynbareParser.varList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID117=null;
		Token set118=null;
		Token ID119=null;
		ParserRuleReturnScope colspec116 =null;

		Object ID117_tree=null;
		Object set118_tree=null;
		Object ID119_tree=null;

		try {
			// ./examples/Dynbare.g:135:3: ( ( colspec )? ID ( ( ',' | '/' ) ID )* )
			// ./examples/Dynbare.g:135:5: ( colspec )? ID ( ( ',' | '/' ) ID )*
			{
			root_0 = (Object)adaptor.nil();


			// ./examples/Dynbare.g:135:5: ( colspec )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==NUMBER) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// ./examples/Dynbare.g:135:5: colspec
					{
					pushFollow(FOLLOW_colspec_in_varList1148);
					colspec116=colspec();
					state._fsp--;

					adaptor.addChild(root_0, colspec116.getTree());

					}
					break;

			}

			ID117=(Token)match(input,ID,FOLLOW_ID_in_varList1151); 
			ID117_tree = (Object)adaptor.create(ID117);
			adaptor.addChild(root_0, ID117_tree);

			// ./examples/Dynbare.g:135:17: ( ( ',' | '/' ) ID )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==45||LA38_0==47) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// ./examples/Dynbare.g:135:18: ( ',' | '/' ) ID
					{
					set118=input.LT(1);
					if ( input.LA(1)==45||input.LA(1)==47 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set118));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ID119=(Token)match(input,ID,FOLLOW_ID_in_varList1160); 
					ID119_tree = (Object)adaptor.create(ID119);
					adaptor.addChild(root_0, ID119_tree);

					}
					break;

				default :
					break loop38;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varList"


	public static class drawInterval_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "drawInterval"
	// ./examples/Dynbare.g:137:1: drawInterval : '(' intervalStart ',' intervalStop ')' ;
	public final DynbareParser.drawInterval_return drawInterval() throws RecognitionException {
		DynbareParser.drawInterval_return retval = new DynbareParser.drawInterval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		Token char_literal122=null;
		Token char_literal124=null;
		ParserRuleReturnScope intervalStart121 =null;
		ParserRuleReturnScope intervalStop123 =null;

		Object char_literal120_tree=null;
		Object char_literal122_tree=null;
		Object char_literal124_tree=null;

		try {
			// ./examples/Dynbare.g:138:3: ( '(' intervalStart ',' intervalStop ')' )
			// ./examples/Dynbare.g:138:5: '(' intervalStart ',' intervalStop ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal120=(Token)match(input,41,FOLLOW_41_in_drawInterval1175); 
			char_literal120_tree = (Object)adaptor.create(char_literal120);
			adaptor.addChild(root_0, char_literal120_tree);

			pushFollow(FOLLOW_intervalStart_in_drawInterval1177);
			intervalStart121=intervalStart();
			state._fsp--;

			adaptor.addChild(root_0, intervalStart121.getTree());

			char_literal122=(Token)match(input,45,FOLLOW_45_in_drawInterval1179); 
			char_literal122_tree = (Object)adaptor.create(char_literal122);
			adaptor.addChild(root_0, char_literal122_tree);

			pushFollow(FOLLOW_intervalStop_in_drawInterval1181);
			intervalStop123=intervalStop();
			state._fsp--;

			adaptor.addChild(root_0, intervalStop123.getTree());

			char_literal124=(Token)match(input,42,FOLLOW_42_in_drawInterval1183); 
			char_literal124_tree = (Object)adaptor.create(char_literal124);
			adaptor.addChild(root_0, char_literal124_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drawInterval"


	public static class drawChar_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "drawChar"
	// ./examples/Dynbare.g:140:1: drawChar : ( '+' | '*' );
	public final DynbareParser.drawChar_return drawChar() throws RecognitionException {
		DynbareParser.drawChar_return retval = new DynbareParser.drawChar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set125=null;

		Object set125_tree=null;

		try {
			// ./examples/Dynbare.g:141:3: ( '+' | '*' )
			// ./examples/Dynbare.g:
			{
			root_0 = (Object)adaptor.nil();


			set125=input.LT(1);
			if ( (input.LA(1) >= 43 && input.LA(1) <= 44) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set125));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drawChar"


	public static class intervalStart_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "intervalStart"
	// ./examples/Dynbare.g:144:1: intervalStart : NUMBER ;
	public final DynbareParser.intervalStart_return intervalStart() throws RecognitionException {
		DynbareParser.intervalStart_return retval = new DynbareParser.intervalStart_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER126=null;

		Object NUMBER126_tree=null;

		try {
			// ./examples/Dynbare.g:145:3: ( NUMBER )
			// ./examples/Dynbare.g:145:5: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER126=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_intervalStart1214); 
			NUMBER126_tree = (Object)adaptor.create(NUMBER126);
			adaptor.addChild(root_0, NUMBER126_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intervalStart"


	public static class intervalStop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "intervalStop"
	// ./examples/Dynbare.g:148:1: intervalStop : NUMBER ;
	public final DynbareParser.intervalStop_return intervalStop() throws RecognitionException {
		DynbareParser.intervalStop_return retval = new DynbareParser.intervalStop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER127=null;

		Object NUMBER127_tree=null;

		try {
			// ./examples/Dynbare.g:149:3: ( NUMBER )
			// ./examples/Dynbare.g:149:5: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER127=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_intervalStop1229); 
			NUMBER127_tree = (Object)adaptor.create(NUMBER127);
			adaptor.addChild(root_0, NUMBER127_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intervalStop"


	public static class colspec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "colspec"
	// ./examples/Dynbare.g:151:1: colspec : NUMBER ')' ;
	public final DynbareParser.colspec_return colspec() throws RecognitionException {
		DynbareParser.colspec_return retval = new DynbareParser.colspec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER128=null;
		Token char_literal129=null;

		Object NUMBER128_tree=null;
		Object char_literal129_tree=null;

		try {
			// ./examples/Dynbare.g:152:3: ( NUMBER ')' )
			// ./examples/Dynbare.g:152:5: NUMBER ')'
			{
			root_0 = (Object)adaptor.nil();


			NUMBER128=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_colspec1245); 
			NUMBER128_tree = (Object)adaptor.create(NUMBER128);
			adaptor.addChild(root_0, NUMBER128_tree);

			char_literal129=(Token)match(input,42,FOLLOW_42_in_colspec1247); 
			char_literal129_tree = (Object)adaptor.create(char_literal129);
			adaptor.addChild(root_0, char_literal129_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "colspec"


	public static class constDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constDef"
	// ./examples/Dynbare.g:155:1: constDef : 'C' ( WS )+ id= ID '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) ;
	public final DynbareParser.constDef_return constDef() throws RecognitionException {
		DynbareParser.constDef_return retval = new DynbareParser.constDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;
		Token char_literal130=null;
		Token WS131=null;
		Token char_literal132=null;
		Token NEWLINE135=null;
		ParserRuleReturnScope eqn133 =null;
		ParserRuleReturnScope lineComment134 =null;

		Object id_tree=null;
		Object char_literal130_tree=null;
		Object WS131_tree=null;
		Object char_literal132_tree=null;
		Object NEWLINE135_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:156:2: ( 'C' ( WS )+ id= ID '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) )
			// ./examples/Dynbare.g:156:4: 'C' ( WS )+ id= ID '=' eqn ( lineComment )? NEWLINE
			{
			char_literal130=(Token)match(input,50,FOLLOW_50_in_constDef1262);  
			stream_50.add(char_literal130);

			// ./examples/Dynbare.g:156:8: ( WS )+
			int cnt39=0;
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// ./examples/Dynbare.g:156:8: WS
					{
					WS131=(Token)match(input,WS,FOLLOW_WS_in_constDef1264);  
					stream_WS.add(WS131);

					}
					break;

				default :
					if ( cnt39 >= 1 ) break loop39;
					EarlyExitException eee = new EarlyExitException(39, input);
					throw eee;
				}
				cnt39++;
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_constDef1269);  
			stream_ID.add(id);

			char_literal132=(Token)match(input,48,FOLLOW_48_in_constDef1271);  
			stream_48.add(char_literal132);

			pushFollow(FOLLOW_eqn_in_constDef1273);
			eqn133=eqn();
			state._fsp--;

			stream_eqn.add(eqn133.getTree());
			// ./examples/Dynbare.g:156:26: ( lineComment )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==WS) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// ./examples/Dynbare.g:156:26: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_constDef1275);
					lineComment134=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment134.getTree());
					}
					break;

			}

			NEWLINE135=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constDef1278);  
			stream_NEWLINE.add(NEWLINE135);

			// AST REWRITE
			// elements: eqn, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 156:47: -> ^( AUX ID eqn )
			{
				// ./examples/Dynbare.g:156:50: ^( AUX ID eqn )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AUX, "AUX"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_eqn.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constDef"


	public static class initDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "initDef"
	// ./examples/Dynbare.g:158:1: initDef : 'N' ( WS )+ ID '=' eqn ( lineComment )? NEWLINE -> ^( IVALUE ID eqn ) ;
	public final DynbareParser.initDef_return initDef() throws RecognitionException {
		DynbareParser.initDef_return retval = new DynbareParser.initDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		Token WS137=null;
		Token ID138=null;
		Token char_literal139=null;
		Token NEWLINE142=null;
		ParserRuleReturnScope eqn140 =null;
		ParserRuleReturnScope lineComment141 =null;

		Object char_literal136_tree=null;
		Object WS137_tree=null;
		Object ID138_tree=null;
		Object char_literal139_tree=null;
		Object NEWLINE142_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:159:2: ( 'N' ( WS )+ ID '=' eqn ( lineComment )? NEWLINE -> ^( IVALUE ID eqn ) )
			// ./examples/Dynbare.g:159:4: 'N' ( WS )+ ID '=' eqn ( lineComment )? NEWLINE
			{
			char_literal136=(Token)match(input,52,FOLLOW_52_in_initDef1299);  
			stream_52.add(char_literal136);

			// ./examples/Dynbare.g:159:8: ( WS )+
			int cnt41=0;
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// ./examples/Dynbare.g:159:8: WS
					{
					WS137=(Token)match(input,WS,FOLLOW_WS_in_initDef1301);  
					stream_WS.add(WS137);

					}
					break;

				default :
					if ( cnt41 >= 1 ) break loop41;
					EarlyExitException eee = new EarlyExitException(41, input);
					throw eee;
				}
				cnt41++;
			}

			ID138=(Token)match(input,ID,FOLLOW_ID_in_initDef1304);  
			stream_ID.add(ID138);

			char_literal139=(Token)match(input,48,FOLLOW_48_in_initDef1306);  
			stream_48.add(char_literal139);

			pushFollow(FOLLOW_eqn_in_initDef1308);
			eqn140=eqn();
			state._fsp--;

			stream_eqn.add(eqn140.getTree());
			// ./examples/Dynbare.g:159:23: ( lineComment )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==WS) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// ./examples/Dynbare.g:159:23: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_initDef1310);
					lineComment141=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment141.getTree());
					}
					break;

			}

			NEWLINE142=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_initDef1313);  
			stream_NEWLINE.add(NEWLINE142);

			// AST REWRITE
			// elements: ID, eqn
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 159:44: -> ^( IVALUE ID eqn )
			{
				// ./examples/Dynbare.g:159:47: ^( IVALUE ID eqn )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IVALUE, "IVALUE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_eqn.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initDef"


	public static class auxDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "auxDef"
	// ./examples/Dynbare.g:162:1: auxDef : ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) );
	public final DynbareParser.auxDef_return auxDef() throws RecognitionException {
		DynbareParser.auxDef_return retval = new DynbareParser.auxDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal143=null;
		Token WS144=null;
		Token ID145=null;
		Token char_literal147=null;
		Token NEWLINE150=null;
		Token char_literal151=null;
		Token WS152=null;
		Token ID153=null;
		Token char_literal155=null;
		Token NEWLINE158=null;
		ParserRuleReturnScope timeExt146 =null;
		ParserRuleReturnScope tableFunction148 =null;
		ParserRuleReturnScope lineComment149 =null;
		ParserRuleReturnScope timeExt154 =null;
		ParserRuleReturnScope eqn156 =null;
		ParserRuleReturnScope lineComment157 =null;

		Object char_literal143_tree=null;
		Object WS144_tree=null;
		Object ID145_tree=null;
		Object char_literal147_tree=null;
		Object NEWLINE150_tree=null;
		Object char_literal151_tree=null;
		Object WS152_tree=null;
		Object ID153_tree=null;
		Object char_literal155_tree=null;
		Object NEWLINE158_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_tableFunction=new RewriteRuleSubtreeStream(adaptor,"rule tableFunction");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:163:2: ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) )
			int alt47=2;
			alt47 = dfa47.predict(input);
			switch (alt47) {
				case 1 :
					// ./examples/Dynbare.g:163:4: 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE
					{
					char_literal143=(Token)match(input,49,FOLLOW_49_in_auxDef1334);  
					stream_49.add(char_literal143);

					// ./examples/Dynbare.g:163:8: ( WS )+
					int cnt43=0;
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==WS) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// ./examples/Dynbare.g:163:8: WS
							{
							WS144=(Token)match(input,WS,FOLLOW_WS_in_auxDef1336);  
							stream_WS.add(WS144);

							}
							break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							EarlyExitException eee = new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					}

					ID145=(Token)match(input,ID,FOLLOW_ID_in_auxDef1339);  
					stream_ID.add(ID145);

					pushFollow(FOLLOW_timeExt_in_auxDef1341);
					timeExt146=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt146.getTree());
					char_literal147=(Token)match(input,48,FOLLOW_48_in_auxDef1343);  
					stream_48.add(char_literal147);

					pushFollow(FOLLOW_tableFunction_in_auxDef1345);
					tableFunction148=tableFunction();
					state._fsp--;

					stream_tableFunction.add(tableFunction148.getTree());
					// ./examples/Dynbare.g:163:41: ( lineComment )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==WS) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// ./examples/Dynbare.g:163:41: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_auxDef1347);
							lineComment149=lineComment();
							state._fsp--;

							stream_lineComment.add(lineComment149.getTree());
							}
							break;

					}

					NEWLINE150=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef1350);  
					stream_NEWLINE.add(NEWLINE150);

					// AST REWRITE
					// elements: ID, tableFunction
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 163:63: -> ^( TAUX ID tableFunction )
					{
						// ./examples/Dynbare.g:163:66: ^( TAUX ID tableFunction )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAUX, "TAUX"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_tableFunction.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:164:4: 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE
					{
					char_literal151=(Token)match(input,49,FOLLOW_49_in_auxDef1367);  
					stream_49.add(char_literal151);

					// ./examples/Dynbare.g:164:8: ( WS )+
					int cnt45=0;
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==WS) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// ./examples/Dynbare.g:164:8: WS
							{
							WS152=(Token)match(input,WS,FOLLOW_WS_in_auxDef1369);  
							stream_WS.add(WS152);

							}
							break;

						default :
							if ( cnt45 >= 1 ) break loop45;
							EarlyExitException eee = new EarlyExitException(45, input);
							throw eee;
						}
						cnt45++;
					}

					ID153=(Token)match(input,ID,FOLLOW_ID_in_auxDef1372);  
					stream_ID.add(ID153);

					pushFollow(FOLLOW_timeExt_in_auxDef1374);
					timeExt154=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt154.getTree());
					char_literal155=(Token)match(input,48,FOLLOW_48_in_auxDef1376);  
					stream_48.add(char_literal155);

					pushFollow(FOLLOW_eqn_in_auxDef1378);
					eqn156=eqn();
					state._fsp--;

					stream_eqn.add(eqn156.getTree());
					// ./examples/Dynbare.g:164:31: ( lineComment )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==WS) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// ./examples/Dynbare.g:164:31: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_auxDef1380);
							lineComment157=lineComment();
							state._fsp--;

							stream_lineComment.add(lineComment157.getTree());
							}
							break;

					}

					NEWLINE158=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef1383);  
					stream_NEWLINE.add(NEWLINE158);

					// AST REWRITE
					// elements: ID, eqn
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 164:53: -> ^( AUX ID eqn )
					{
						// ./examples/Dynbare.g:164:56: ^( AUX ID eqn )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AUX, "AUX"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_eqn.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "auxDef"


	public static class tableFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tableFunction"
	// ./examples/Dynbare.g:167:1: tableFunction : expol= ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')' -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step) ;
	public final DynbareParser.tableFunction_return tableFunction() throws RecognitionException {
		DynbareParser.tableFunction_return retval = new DynbareParser.tableFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token expol=null;
		Token tName=null;
		Token eqId=null;
		Token xMin=null;
		Token xMax=null;
		Token step=null;
		Token char_literal159=null;
		Token char_literal160=null;
		Token char_literal162=null;
		Token char_literal163=null;
		Token char_literal164=null;
		Token char_literal165=null;
		ParserRuleReturnScope timeExt161 =null;

		Object expol_tree=null;
		Object tName_tree=null;
		Object eqId_tree=null;
		Object xMin_tree=null;
		Object xMax_tree=null;
		Object step_tree=null;
		Object char_literal159_tree=null;
		Object char_literal160_tree=null;
		Object char_literal162_tree=null;
		Object char_literal163_tree=null;
		Object char_literal164_tree=null;
		Object char_literal165_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");

		try {
			// ./examples/Dynbare.g:168:3: (expol= ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')' -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step) )
			// ./examples/Dynbare.g:168:5: expol= ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')'
			{
			// ./examples/Dynbare.g:168:11: ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' )
			int alt48=4;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt48=1;
				}
				break;
			case 59:
				{
				alt48=2;
				}
				break;
			case 58:
				{
				alt48=3;
				}
				break;
			case 56:
				{
				alt48=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// ./examples/Dynbare.g:168:12: 'TABLE'
					{
					expol=(Token)match(input,57,FOLLOW_57_in_tableFunction1411);  
					stream_57.add(expol);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:168:21: 'TABXT'
					{
					expol=(Token)match(input,59,FOLLOW_59_in_tableFunction1414);  
					stream_59.add(expol);

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:168:31: 'TABPL'
					{
					expol=(Token)match(input,58,FOLLOW_58_in_tableFunction1418);  
					stream_58.add(expol);

					}
					break;
				case 4 :
					// ./examples/Dynbare.g:168:40: 'TABHL'
					{
					expol=(Token)match(input,56,FOLLOW_56_in_tableFunction1421);  
					stream_56.add(expol);

					}
					break;

			}

			char_literal159=(Token)match(input,41,FOLLOW_41_in_tableFunction1425);  
			stream_41.add(char_literal159);

			tName=(Token)match(input,ID,FOLLOW_ID_in_tableFunction1429);  
			stream_ID.add(tName);

			char_literal160=(Token)match(input,45,FOLLOW_45_in_tableFunction1431);  
			stream_45.add(char_literal160);

			eqId=(Token)match(input,ID,FOLLOW_ID_in_tableFunction1435);  
			stream_ID.add(eqId);

			// ./examples/Dynbare.g:168:75: ( timeExt )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==61) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// ./examples/Dynbare.g:168:75: timeExt
					{
					pushFollow(FOLLOW_timeExt_in_tableFunction1437);
					timeExt161=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt161.getTree());
					}
					break;

			}

			char_literal162=(Token)match(input,45,FOLLOW_45_in_tableFunction1440);  
			stream_45.add(char_literal162);

			xMin=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1444);  
			stream_NUMBER.add(xMin);

			char_literal163=(Token)match(input,45,FOLLOW_45_in_tableFunction1446);  
			stream_45.add(char_literal163);

			xMax=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1450);  
			stream_NUMBER.add(xMax);

			char_literal164=(Token)match(input,45,FOLLOW_45_in_tableFunction1452);  
			stream_45.add(char_literal164);

			step=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1456);  
			stream_NUMBER.add(step);

			char_literal165=(Token)match(input,42,FOLLOW_42_in_tableFunction1458);  
			stream_42.add(char_literal165);

			// AST REWRITE
			// elements: expol, ID, step, xMax, eqId, xMin, ID
			// token labels: expol, xMax, xMin, eqId, step
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_expol=new RewriteRuleTokenStream(adaptor,"token expol",expol);
			RewriteRuleTokenStream stream_xMax=new RewriteRuleTokenStream(adaptor,"token xMax",xMax);
			RewriteRuleTokenStream stream_xMin=new RewriteRuleTokenStream(adaptor,"token xMin",xMin);
			RewriteRuleTokenStream stream_eqId=new RewriteRuleTokenStream(adaptor,"token eqId",eqId);
			RewriteRuleTokenStream stream_step=new RewriteRuleTokenStream(adaptor,"token step",step);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 168:135: -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
			{
				// ./examples/Dynbare.g:168:138: ^( EQN $eqId)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQN, "EQN"), root_1);
				adaptor.addChild(root_1, stream_eqId.nextNode());
				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, (Object)adaptor.create(ID, (tName!=null?tName.getText():null)));
				// ./examples/Dynbare.g:168:167: ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XCOORDS, "XCOORDS"), root_1);
				adaptor.addChild(root_1, (Object)adaptor.create(ID, (tName!=null?tName.getText():null)));
				adaptor.addChild(root_1, stream_expol.nextNode());
				adaptor.addChild(root_1, stream_xMin.nextNode());
				adaptor.addChild(root_1, stream_xMax.nextNode());
				adaptor.addChild(root_1, stream_step.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableFunction"


	public static class rateDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rateDef"
	// ./examples/Dynbare.g:172:1: rateDef : 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( RATE ID eqn ) ;
	public final DynbareParser.rateDef_return rateDef() throws RecognitionException {
		DynbareParser.rateDef_return retval = new DynbareParser.rateDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal166=null;
		Token WS167=null;
		Token ID168=null;
		Token char_literal170=null;
		Token NEWLINE173=null;
		ParserRuleReturnScope timeExt169 =null;
		ParserRuleReturnScope eqn171 =null;
		ParserRuleReturnScope lineComment172 =null;

		Object char_literal166_tree=null;
		Object WS167_tree=null;
		Object ID168_tree=null;
		Object char_literal170_tree=null;
		Object NEWLINE173_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:173:2: ( 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( RATE ID eqn ) )
			// ./examples/Dynbare.g:173:4: 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE
			{
			char_literal166=(Token)match(input,54,FOLLOW_54_in_rateDef1501);  
			stream_54.add(char_literal166);

			// ./examples/Dynbare.g:173:8: ( WS )+
			int cnt50=0;
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// ./examples/Dynbare.g:173:8: WS
					{
					WS167=(Token)match(input,WS,FOLLOW_WS_in_rateDef1503);  
					stream_WS.add(WS167);

					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
			}

			ID168=(Token)match(input,ID,FOLLOW_ID_in_rateDef1506);  
			stream_ID.add(ID168);

			pushFollow(FOLLOW_timeExt_in_rateDef1509);
			timeExt169=timeExt();
			state._fsp--;

			stream_timeExt.add(timeExt169.getTree());
			char_literal170=(Token)match(input,48,FOLLOW_48_in_rateDef1511);  
			stream_48.add(char_literal170);

			pushFollow(FOLLOW_eqn_in_rateDef1513);
			eqn171=eqn();
			state._fsp--;

			stream_eqn.add(eqn171.getTree());
			// ./examples/Dynbare.g:173:32: ( lineComment )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==WS) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// ./examples/Dynbare.g:173:32: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_rateDef1515);
					lineComment172=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment172.getTree());
					}
					break;

			}

			NEWLINE173=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rateDef1518);  
			stream_NEWLINE.add(NEWLINE173);

			// AST REWRITE
			// elements: ID, eqn
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 173:53: -> ^( RATE ID eqn )
			{
				// ./examples/Dynbare.g:173:56: ^( RATE ID eqn )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RATE, "RATE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_eqn.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rateDef"


	public static class lvlDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvlDef"
	// ./examples/Dynbare.g:176:1: lvlDef : 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( LEVEL ID eqn ) ;
	public final DynbareParser.lvlDef_return lvlDef() throws RecognitionException {
		DynbareParser.lvlDef_return retval = new DynbareParser.lvlDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal174=null;
		Token WS175=null;
		Token ID176=null;
		Token char_literal178=null;
		Token NEWLINE181=null;
		ParserRuleReturnScope timeExt177 =null;
		ParserRuleReturnScope eqn179 =null;
		ParserRuleReturnScope lineComment180 =null;

		Object char_literal174_tree=null;
		Object WS175_tree=null;
		Object ID176_tree=null;
		Object char_literal178_tree=null;
		Object NEWLINE181_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:177:2: ( 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( LEVEL ID eqn ) )
			// ./examples/Dynbare.g:177:4: 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE
			{
			char_literal174=(Token)match(input,51,FOLLOW_51_in_lvlDef1541);  
			stream_51.add(char_literal174);

			// ./examples/Dynbare.g:177:8: ( WS )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==WS) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// ./examples/Dynbare.g:177:8: WS
					{
					WS175=(Token)match(input,WS,FOLLOW_WS_in_lvlDef1543);  
					stream_WS.add(WS175);

					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
			}

			ID176=(Token)match(input,ID,FOLLOW_ID_in_lvlDef1546);  
			stream_ID.add(ID176);

			pushFollow(FOLLOW_timeExt_in_lvlDef1548);
			timeExt177=timeExt();
			state._fsp--;

			stream_timeExt.add(timeExt177.getTree());
			char_literal178=(Token)match(input,48,FOLLOW_48_in_lvlDef1550);  
			stream_48.add(char_literal178);

			pushFollow(FOLLOW_eqn_in_lvlDef1552);
			eqn179=eqn();
			state._fsp--;

			stream_eqn.add(eqn179.getTree());
			// ./examples/Dynbare.g:177:31: ( lineComment )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==WS) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// ./examples/Dynbare.g:177:31: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_lvlDef1554);
					lineComment180=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment180.getTree());
					}
					break;

			}

			NEWLINE181=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_lvlDef1557);  
			stream_NEWLINE.add(NEWLINE181);

			// AST REWRITE
			// elements: eqn, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 177:52: -> ^( LEVEL ID eqn )
			{
				// ./examples/Dynbare.g:177:55: ^( LEVEL ID eqn )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEVEL, "LEVEL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_eqn.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lvlDef"


	public static class tblDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tblDef"
	// ./examples/Dynbare.g:179:1: tblDef : 'T' ( WS )+ ID '=' rangeList ( lineComment )? NEWLINE -> ^( YCOORDS ID ^( PTS rangeList ) ) ;
	public final DynbareParser.tblDef_return tblDef() throws RecognitionException {
		DynbareParser.tblDef_return retval = new DynbareParser.tblDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal182=null;
		Token WS183=null;
		Token ID184=null;
		Token char_literal185=null;
		Token NEWLINE188=null;
		ParserRuleReturnScope rangeList186 =null;
		ParserRuleReturnScope lineComment187 =null;

		Object char_literal182_tree=null;
		Object WS183_tree=null;
		Object ID184_tree=null;
		Object char_literal185_tree=null;
		Object NEWLINE188_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_rangeList=new RewriteRuleSubtreeStream(adaptor,"rule rangeList");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// ./examples/Dynbare.g:180:2: ( 'T' ( WS )+ ID '=' rangeList ( lineComment )? NEWLINE -> ^( YCOORDS ID ^( PTS rangeList ) ) )
			// ./examples/Dynbare.g:180:4: 'T' ( WS )+ ID '=' rangeList ( lineComment )? NEWLINE
			{
			char_literal182=(Token)match(input,55,FOLLOW_55_in_tblDef1578);  
			stream_55.add(char_literal182);

			// ./examples/Dynbare.g:180:8: ( WS )+
			int cnt54=0;
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==WS) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// ./examples/Dynbare.g:180:8: WS
					{
					WS183=(Token)match(input,WS,FOLLOW_WS_in_tblDef1580);  
					stream_WS.add(WS183);

					}
					break;

				default :
					if ( cnt54 >= 1 ) break loop54;
					EarlyExitException eee = new EarlyExitException(54, input);
					throw eee;
				}
				cnt54++;
			}

			ID184=(Token)match(input,ID,FOLLOW_ID_in_tblDef1583);  
			stream_ID.add(ID184);

			char_literal185=(Token)match(input,48,FOLLOW_48_in_tblDef1585);  
			stream_48.add(char_literal185);

			pushFollow(FOLLOW_rangeList_in_tblDef1587);
			rangeList186=rangeList();
			state._fsp--;

			stream_rangeList.add(rangeList186.getTree());
			// ./examples/Dynbare.g:180:29: ( lineComment )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==WS) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// ./examples/Dynbare.g:180:29: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_tblDef1589);
					lineComment187=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment187.getTree());
					}
					break;

			}

			NEWLINE188=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_tblDef1592);  
			stream_NEWLINE.add(NEWLINE188);

			// AST REWRITE
			// elements: ID, rangeList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 180:50: -> ^( YCOORDS ID ^( PTS rangeList ) )
			{
				// ./examples/Dynbare.g:180:53: ^( YCOORDS ID ^( PTS rangeList ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YCOORDS, "YCOORDS"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// ./examples/Dynbare.g:180:66: ^( PTS rangeList )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PTS, "PTS"), root_2);
				adaptor.addChild(root_2, stream_rangeList.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tblDef"


	public static class comment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comment"
	// ./examples/Dynbare.g:183:1: comment : ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE );
	public final DynbareParser.comment_return comment() throws RecognitionException {
		DynbareParser.comment_return retval = new DynbareParser.comment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE189=null;
		Token NEWLINE191=null;
		Token NOTE192=null;
		Token WS193=null;
		Token NEWLINE194=null;
		ParserRuleReturnScope lineComment190 =null;

		Object NOTE189_tree=null;
		Object NEWLINE191_tree=null;
		Object NOTE192_tree=null;
		Object WS193_tree=null;
		Object NEWLINE194_tree=null;

		try {
			// ./examples/Dynbare.g:184:3: ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE )
			int alt58=2;
			alt58 = dfa58.predict(input);
			switch (alt58) {
				case 1 :
					// ./examples/Dynbare.g:184:5: NOTE ( lineComment )? NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					NOTE189=(Token)match(input,NOTE,FOLLOW_NOTE_in_comment1618); 
					NOTE189_tree = (Object)adaptor.create(NOTE189);
					adaptor.addChild(root_0, NOTE189_tree);

					// ./examples/Dynbare.g:184:10: ( lineComment )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==WS) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// ./examples/Dynbare.g:184:10: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_comment1620);
							lineComment190=lineComment();
							state._fsp--;

							adaptor.addChild(root_0, lineComment190.getTree());

							}
							break;

					}

					NEWLINE191=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment1623); 
					NEWLINE191_tree = (Object)adaptor.create(NEWLINE191);
					adaptor.addChild(root_0, NEWLINE191_tree);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:185:9: NOTE ( WS )+ NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					NOTE192=(Token)match(input,NOTE,FOLLOW_NOTE_in_comment1633); 
					NOTE192_tree = (Object)adaptor.create(NOTE192);
					adaptor.addChild(root_0, NOTE192_tree);

					// ./examples/Dynbare.g:185:14: ( WS )+
					int cnt57=0;
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==WS) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// ./examples/Dynbare.g:185:14: WS
							{
							WS193=(Token)match(input,WS,FOLLOW_WS_in_comment1635); 
							WS193_tree = (Object)adaptor.create(WS193);
							adaptor.addChild(root_0, WS193_tree);

							}
							break;

						default :
							if ( cnt57 >= 1 ) break loop57;
							EarlyExitException eee = new EarlyExitException(57, input);
							throw eee;
						}
						cnt57++;
					}

					NEWLINE194=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment1638); 
					NEWLINE194_tree = (Object)adaptor.create(NEWLINE194);
					adaptor.addChild(root_0, NEWLINE194_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comment"


	public static class rangeList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rangeList"
	// ./examples/Dynbare.g:188:1: rangeList : NUMBER ( ( ',' | '/' ) NUMBER )* -> ( NUMBER )+ ;
	public final DynbareParser.rangeList_return rangeList() throws RecognitionException {
		DynbareParser.rangeList_return retval = new DynbareParser.rangeList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER195=null;
		Token char_literal196=null;
		Token char_literal197=null;
		Token NUMBER198=null;

		Object NUMBER195_tree=null;
		Object char_literal196_tree=null;
		Object char_literal197_tree=null;
		Object NUMBER198_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// ./examples/Dynbare.g:189:2: ( NUMBER ( ( ',' | '/' ) NUMBER )* -> ( NUMBER )+ )
			// ./examples/Dynbare.g:189:5: NUMBER ( ( ',' | '/' ) NUMBER )*
			{
			NUMBER195=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rangeList1652);  
			stream_NUMBER.add(NUMBER195);

			// ./examples/Dynbare.g:189:12: ( ( ',' | '/' ) NUMBER )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==45||LA60_0==47) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// ./examples/Dynbare.g:189:13: ( ',' | '/' ) NUMBER
					{
					// ./examples/Dynbare.g:189:13: ( ',' | '/' )
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==45) ) {
						alt59=1;
					}
					else if ( (LA59_0==47) ) {
						alt59=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// ./examples/Dynbare.g:189:14: ','
							{
							char_literal196=(Token)match(input,45,FOLLOW_45_in_rangeList1656);  
							stream_45.add(char_literal196);

							}
							break;
						case 2 :
							// ./examples/Dynbare.g:189:18: '/'
							{
							char_literal197=(Token)match(input,47,FOLLOW_47_in_rangeList1658);  
							stream_47.add(char_literal197);

							}
							break;

					}

					NUMBER198=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rangeList1661);  
					stream_NUMBER.add(NUMBER198);

					}
					break;

				default :
					break loop60;
				}
			}

			// AST REWRITE
			// elements: NUMBER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 189:32: -> ( NUMBER )+
			{
				if ( !(stream_NUMBER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_NUMBER.hasNext() ) {
					adaptor.addChild(root_0, stream_NUMBER.nextNode());
				}
				stream_NUMBER.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rangeList"


	public static class eqn_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "eqn"
	// ./examples/Dynbare.g:192:1: eqn : expr -> ^( EQN expr ) ;
	public final DynbareParser.eqn_return eqn() throws RecognitionException {
		DynbareParser.eqn_return retval = new DynbareParser.eqn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr199 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// ./examples/Dynbare.g:193:2: ( expr -> ^( EQN expr ) )
			// ./examples/Dynbare.g:193:4: expr
			{
			pushFollow(FOLLOW_expr_in_eqn1680);
			expr199=expr();
			state._fsp--;

			stream_expr.add(expr199.getTree());
			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:9: -> ^( EQN expr )
			{
				// ./examples/Dynbare.g:193:12: ^( EQN expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQN, "EQN"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "eqn"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ./examples/Dynbare.g:195:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final DynbareParser.expr_return expr() throws RecognitionException {
		DynbareParser.expr_return retval = new DynbareParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set201=null;
		ParserRuleReturnScope multExpr200 =null;
		ParserRuleReturnScope multExpr202 =null;

		Object set201_tree=null;

		try {
			// ./examples/Dynbare.g:196:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// ./examples/Dynbare.g:196:9: multExpr ( ( '+' | '-' ) multExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr1703);
			multExpr200=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr200.getTree());

			// ./examples/Dynbare.g:197:9: ( ( '+' | '-' ) multExpr )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==44||LA61_0==46) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// ./examples/Dynbare.g:197:13: ( '+' | '-' ) multExpr
					{
					set201=input.LT(1);
					if ( input.LA(1)==44||input.LA(1)==46 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set201));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr1724);
					multExpr202=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr202.getTree());

					}
					break;

				default :
					break loop61;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// ./examples/Dynbare.g:200:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
	public final DynbareParser.multExpr_return multExpr() throws RecognitionException {
		DynbareParser.multExpr_return retval = new DynbareParser.multExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set204=null;
		ParserRuleReturnScope atom203 =null;
		ParserRuleReturnScope atom205 =null;

		Object set204_tree=null;

		try {
			// ./examples/Dynbare.g:201:5: ( atom ( ( '*' | '/' ) atom )* )
			// ./examples/Dynbare.g:201:9: atom ( ( '*' | '/' ) atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpr1748);
			atom203=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom203.getTree());

			// ./examples/Dynbare.g:201:14: ( ( '*' | '/' ) atom )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==47) ) {
					int LA62_2 = input.LA(2);
					if ( (LA62_2==ID) ) {
						int LA62_4 = input.LA(3);
						if ( (LA62_4==NEWLINE||LA62_4==WS||(LA62_4 >= 41 && LA62_4 <= 47)||LA62_4==61) ) {
							alt62=1;
						}

					}
					else if ( (LA62_2==NUMBER||LA62_2==41) ) {
						alt62=1;
					}

				}
				else if ( (LA62_0==43) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// ./examples/Dynbare.g:201:16: ( '*' | '/' ) atom
					{
					set204=input.LT(1);
					if ( input.LA(1)==43||input.LA(1)==47 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set204));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr1758);
					atom205=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom205.getTree());

					}
					break;

				default :
					break loop62;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// ./examples/Dynbare.g:204:1: atom : ( NUMBER | ID ( timeExt )? -> ID | funcRef | '(' expr ')' );
	public final DynbareParser.atom_return atom() throws RecognitionException {
		DynbareParser.atom_return retval = new DynbareParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER206=null;
		Token ID207=null;
		Token char_literal210=null;
		Token char_literal212=null;
		ParserRuleReturnScope timeExt208 =null;
		ParserRuleReturnScope funcRef209 =null;
		ParserRuleReturnScope expr211 =null;

		Object NUMBER206_tree=null;
		Object ID207_tree=null;
		Object char_literal210_tree=null;
		Object char_literal212_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");

		try {
			// ./examples/Dynbare.g:205:5: ( NUMBER | ID ( timeExt )? -> ID | funcRef | '(' expr ')' )
			int alt64=4;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt64=1;
				}
				break;
			case ID:
				{
				int LA64_2 = input.LA(2);
				if ( (LA64_2==41) ) {
					alt64=3;
				}
				else if ( (LA64_2==NEWLINE||LA64_2==WS||(LA64_2 >= 42 && LA64_2 <= 47)||LA64_2==61) ) {
					alt64=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 41:
				{
				alt64=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// ./examples/Dynbare.g:205:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER206=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1782); 
					NUMBER206_tree = (Object)adaptor.create(NUMBER206);
					adaptor.addChild(root_0, NUMBER206_tree);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:206:9: ID ( timeExt )?
					{
					ID207=(Token)match(input,ID,FOLLOW_ID_in_atom1793);  
					stream_ID.add(ID207);

					// ./examples/Dynbare.g:206:13: ( timeExt )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==61) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// ./examples/Dynbare.g:206:13: timeExt
							{
							pushFollow(FOLLOW_timeExt_in_atom1796);
							timeExt208=timeExt();
							state._fsp--;

							stream_timeExt.add(timeExt208.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 206:22: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:207:9: funcRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funcRef_in_atom1811);
					funcRef209=funcRef();
					state._fsp--;

					adaptor.addChild(root_0, funcRef209.getTree());

					}
					break;
				case 4 :
					// ./examples/Dynbare.g:208:9: '(' expr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal210=(Token)match(input,41,FOLLOW_41_in_atom1821); 
					char_literal210_tree = (Object)adaptor.create(char_literal210);
					adaptor.addChild(root_0, char_literal210_tree);

					pushFollow(FOLLOW_expr_in_atom1823);
					expr211=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr211.getTree());

					char_literal212=(Token)match(input,42,FOLLOW_42_in_atom1825); 
					char_literal212_tree = (Object)adaptor.create(char_literal212);
					adaptor.addChild(root_0, char_literal212_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class funcRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funcRef"
	// ./examples/Dynbare.g:211:1: funcRef : ID '(' paramList ')' ;
	public final DynbareParser.funcRef_return funcRef() throws RecognitionException {
		DynbareParser.funcRef_return retval = new DynbareParser.funcRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID213=null;
		Token char_literal214=null;
		Token char_literal216=null;
		ParserRuleReturnScope paramList215 =null;

		Object ID213_tree=null;
		Object char_literal214_tree=null;
		Object char_literal216_tree=null;

		try {
			// ./examples/Dynbare.g:212:5: ( ID '(' paramList ')' )
			// ./examples/Dynbare.g:212:9: ID '(' paramList ')'
			{
			root_0 = (Object)adaptor.nil();


			ID213=(Token)match(input,ID,FOLLOW_ID_in_funcRef1850); 
			ID213_tree = (Object)adaptor.create(ID213);
			adaptor.addChild(root_0, ID213_tree);

			char_literal214=(Token)match(input,41,FOLLOW_41_in_funcRef1852); 
			char_literal214_tree = (Object)adaptor.create(char_literal214);
			adaptor.addChild(root_0, char_literal214_tree);

			pushFollow(FOLLOW_paramList_in_funcRef1854);
			paramList215=paramList();
			state._fsp--;

			adaptor.addChild(root_0, paramList215.getTree());

			char_literal216=(Token)match(input,42,FOLLOW_42_in_funcRef1856); 
			char_literal216_tree = (Object)adaptor.create(char_literal216);
			adaptor.addChild(root_0, char_literal216_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funcRef"


	public static class paramList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// ./examples/Dynbare.g:215:1: paramList : expr ( ',' expr )* ;
	public final DynbareParser.paramList_return paramList() throws RecognitionException {
		DynbareParser.paramList_return retval = new DynbareParser.paramList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal218=null;
		ParserRuleReturnScope expr217 =null;
		ParserRuleReturnScope expr219 =null;

		Object char_literal218_tree=null;

		try {
			// ./examples/Dynbare.g:216:2: ( expr ( ',' expr )* )
			// ./examples/Dynbare.g:216:7: expr ( ',' expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_paramList1879);
			expr217=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr217.getTree());

			// ./examples/Dynbare.g:216:12: ( ',' expr )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==45) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// ./examples/Dynbare.g:216:13: ',' expr
					{
					char_literal218=(Token)match(input,45,FOLLOW_45_in_paramList1882); 
					char_literal218_tree = (Object)adaptor.create(char_literal218);
					adaptor.addChild(root_0, char_literal218_tree);

					pushFollow(FOLLOW_expr_in_paramList1884);
					expr219=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr219.getTree());

					}
					break;

				default :
					break loop65;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class timeExt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timeExt"
	// ./examples/Dynbare.g:219:1: timeExt : '\\.' JKL ;
	public final DynbareParser.timeExt_return timeExt() throws RecognitionException {
		DynbareParser.timeExt_return retval = new DynbareParser.timeExt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal220=null;
		Token JKL221=null;

		Object char_literal220_tree=null;
		Object JKL221_tree=null;

		try {
			// ./examples/Dynbare.g:219:9: ( '\\.' JKL )
			// ./examples/Dynbare.g:219:11: '\\.' JKL
			{
			root_0 = (Object)adaptor.nil();


			char_literal220=(Token)match(input,61,FOLLOW_61_in_timeExt1898); 
			char_literal220_tree = (Object)adaptor.create(char_literal220);
			adaptor.addChild(root_0, char_literal220_tree);

			JKL221=(Token)match(input,JKL,FOLLOW_JKL_in_timeExt1900); 
			JKL221_tree = (Object)adaptor.create(JKL221);
			adaptor.addChild(root_0, JKL221_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeExt"


	public static class lineComment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lineComment"
	// ./examples/Dynbare.g:222:1: lineComment : ( WS )+ commentText ;
	public final DynbareParser.lineComment_return lineComment() throws RecognitionException {
		DynbareParser.lineComment_return retval = new DynbareParser.lineComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS222=null;
		ParserRuleReturnScope commentText223 =null;

		Object WS222_tree=null;

		try {
			// ./examples/Dynbare.g:223:2: ( ( WS )+ commentText )
			// ./examples/Dynbare.g:223:4: ( WS )+ commentText
			{
			root_0 = (Object)adaptor.nil();


			// ./examples/Dynbare.g:223:4: ( WS )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==WS) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// ./examples/Dynbare.g:223:4: WS
					{
					WS222=(Token)match(input,WS,FOLLOW_WS_in_lineComment1913); 
					WS222_tree = (Object)adaptor.create(WS222);
					adaptor.addChild(root_0, WS222_tree);

					}
					break;

				default :
					if ( cnt66 >= 1 ) break loop66;
					EarlyExitException eee = new EarlyExitException(66, input);
					throw eee;
				}
				cnt66++;
			}

			pushFollow(FOLLOW_commentText_in_lineComment1916);
			commentText223=commentText();
			state._fsp--;

			adaptor.addChild(root_0, commentText223.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lineComment"


	public static class commentText_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commentText"
	// ./examples/Dynbare.g:226:1: commentText : (~ ( WS | NEWLINE ) (~ NEWLINE )* ) ;
	public final DynbareParser.commentText_return commentText() throws RecognitionException {
		DynbareParser.commentText_return retval = new DynbareParser.commentText_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set224=null;
		Token set225=null;

		Object set224_tree=null;
		Object set225_tree=null;

		try {
			// ./examples/Dynbare.g:227:3: ( (~ ( WS | NEWLINE ) (~ NEWLINE )* ) )
			// ./examples/Dynbare.g:227:5: (~ ( WS | NEWLINE ) (~ NEWLINE )* )
			{
			root_0 = (Object)adaptor.nil();


			// ./examples/Dynbare.g:227:5: (~ ( WS | NEWLINE ) (~ NEWLINE )* )
			// ./examples/Dynbare.g:227:6: ~ ( WS | NEWLINE ) (~ NEWLINE )*
			{
			set224=input.LT(1);
			if ( (input.LA(1) >= AUX && input.LA(1) <= MODULE)||(input.LA(1) >= NOTE && input.LA(1) <= VIEW)||(input.LA(1) >= XCOORDS && input.LA(1) <= 62) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set224));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// ./examples/Dynbare.g:227:19: (~ NEWLINE )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= AUX && LA67_0 <= MODULE)||(LA67_0 >= NOTE && LA67_0 <= 62)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// ./examples/Dynbare.g:
					{
					set225=input.LT(1);
					if ( (input.LA(1) >= AUX && input.LA(1) <= MODULE)||(input.LA(1) >= NOTE && input.LA(1) <= 62) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set225));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop67;
				}
			}

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commentText"

	// Delegated rules


	protected DFA47 dfa47 = new DFA47(this);
	protected DFA58 dfa58 = new DFA58(this);
	static final String DFA47_eotS =
		"\11\uffff";
	static final String DFA47_eofS =
		"\11\uffff";
	static final String DFA47_minS =
		"\1\61\1\46\1\12\1\75\1\15\1\60\1\12\2\uffff";
	static final String DFA47_maxS =
		"\1\61\2\46\1\75\1\15\1\60\1\73\2\uffff";
	static final String DFA47_acceptS =
		"\7\uffff\1\1\1\2";
	static final String DFA47_specialS =
		"\11\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\33\uffff\1\2",
			"\1\4",
			"\1\5",
			"\1\6",
			"\1\10\14\uffff\1\10\21\uffff\1\10\16\uffff\4\7",
			"",
			""
	};

	static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
	static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
	static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
	static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
	static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
	static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
	static final short[][] DFA47_transition;

	static {
		int numStates = DFA47_transitionS.length;
		DFA47_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
		}
	}

	protected class DFA47 extends DFA {

		public DFA47(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 47;
			this.eot = DFA47_eot;
			this.eof = DFA47_eof;
			this.min = DFA47_min;
			this.max = DFA47_max;
			this.accept = DFA47_accept;
			this.special = DFA47_special;
			this.transition = DFA47_transition;
		}
		@Override
		public String getDescription() {
			return "162:1: auxDef : ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) );";
		}
	}

	static final String DFA58_eotS =
		"\5\uffff";
	static final String DFA58_eofS =
		"\5\uffff";
	static final String DFA58_minS =
		"\1\26\1\25\1\4\2\uffff";
	static final String DFA58_maxS =
		"\1\26\1\46\1\76\2\uffff";
	static final String DFA58_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA58_specialS =
		"\5\uffff}>";
	static final String[] DFA58_transitionS = {
			"\1\1",
			"\1\3\20\uffff\1\2",
			"\21\3\1\4\20\3\1\2\30\3",
			"",
			""
	};

	static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
	static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
	static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
	static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
	static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
	static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
	static final short[][] DFA58_transition;

	static {
		int numStates = DFA58_transitionS.length;
		DFA58_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
		}
	}

	protected class DFA58 extends DFA {

		public DFA58(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 58;
			this.eot = DFA58_eot;
			this.eof = DFA58_eof;
			this.min = DFA58_min;
			this.max = DFA58_max;
			this.accept = DFA58_accept;
			this.special = DFA58_special;
			this.transition = DFA58_transition;
		}
		@Override
		public String getDescription() {
			return "183:1: comment : ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE );";
		}
	}

	public static final BitSet FOLLOW_macroDef_in_prog166 = new BitSet(new long[]{0x00DE000000610002L});
	public static final BitSet FOLLOW_defaultModule_in_prog169 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_namedModule_in_prog172 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_controlSector_in_prog176 = new BitSet(new long[]{0x0000000480400000L});
	public static final BitSet FOLLOW_controlStat_in_prog179 = new BitSet(new long[]{0x0000000492600002L});
	public static final BitSet FOLLOW_comment_in_prog183 = new BitSet(new long[]{0x0000000492600002L});
	public static final BitSet FOLLOW_viewSpec_in_prog188 = new BitSet(new long[]{0x0000000012200002L});
	public static final BitSet FOLLOW_NEWLINE_in_prog193 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_controlSector_in_controlModule247 = new BitSet(new long[]{0x0000000480400000L});
	public static final BitSet FOLLOW_controlStat_in_controlModule250 = new BitSet(new long[]{0x0000000492400002L});
	public static final BitSet FOLLOW_comment_in_controlModule254 = new BitSet(new long[]{0x0000000492400002L});
	public static final BitSet FOLLOW_viewSpec_in_controlModule259 = new BitSet(new long[]{0x0000000012000002L});
	public static final BitSet FOLLOW_simSpec_in_controlStat315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_runSpec_in_controlStat326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_defaultModule351 = new BitSet(new long[]{0x00DE000000400002L});
	public static final BitSet FOLLOW_comment_in_defaultModule355 = new BitSet(new long[]{0x00DE000000400002L});
	public static final BitSet FOLLOW_sector_in_namedModule396 = new BitSet(new long[]{0x00DE000000400000L});
	public static final BitSet FOLLOW_definition_in_namedModule399 = new BitSet(new long[]{0x00DE000000400002L});
	public static final BitSet FOLLOW_comment_in_namedModule403 = new BitSet(new long[]{0x00DE000000400002L});
	public static final BitSet FOLLOW_auxDef_in_definition448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvlDef_in_definition458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initDef_in_definition468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDef_in_definition476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rateDef_in_definition487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tblDef_in_definition498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_sector517 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_sector519 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_sector521 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_sector523 = new BitSet(new long[]{0x1000004000000000L});
	public static final BitSet FOLLOW_60_in_sector526 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SECTOR_in_sector529 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_sector531 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_sector533 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_sector536 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_sector538 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_sector542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_controlSector560 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_controlSector562 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_controlSector564 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_controlSector566 = new BitSet(new long[]{0x1000004000000000L});
	public static final BitSet FOLLOW_60_in_controlSector569 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SECTOR_in_controlSector572 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_controlSector574 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_controlSector576 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_controlSector578 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_controlSector580 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_controlSector584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLOT_in_viewSpec614 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_viewSpec616 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_plotVarList_in_viewSpec619 = new BitSet(new long[]{0x0000800000200000L});
	public static final BitSet FOLLOW_47_in_viewSpec623 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_plotVarList_in_viewSpec626 = new BitSet(new long[]{0x0000800000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_viewSpec630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_viewSpec650 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_viewSpec652 = new BitSet(new long[]{0x0000004000800400L});
	public static final BitSet FOLLOW_varList_in_viewSpec655 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_viewSpec657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scaleSpec_in_plotVarList680 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_plotVarList683 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_scaleSpec_in_plotVarList685 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_plotVar_in_scaleSpec718 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_scaleRange_in_scaleSpec721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_plotVar749 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_plotVar751 = new BitSet(new long[]{0x0000580000800400L});
	public static final BitSet FOLLOW_plotChar_in_plotVar753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_plotChar768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_plotChar770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_plotChar772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_plotChar774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_plotChar776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_scaleRange792 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_min_in_scaleRange794 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_scaleRange796 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_max_in_scaleRange798 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_scaleRange800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_min831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_max837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUN_in_runSpec855 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_runSpec857 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_runSpec860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_in_simSpec884 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_simSpec886 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_paramAssignment_in_simSpec888 = new BitSet(new long[]{0x0000A00000200000L});
	public static final BitSet FOLLOW_45_in_simSpec892 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_47_in_simSpec894 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_paramAssignment_in_simSpec897 = new BitSet(new long[]{0x0000A00000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_simSpec901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroStart_in_macroDef931 = new BitSet(new long[]{0x00DE000000400800L});
	public static final BitSet FOLLOW_intrnlStmt_in_macroDef933 = new BitSet(new long[]{0x00DE000000400800L});
	public static final BitSet FOLLOW_definition_in_macroDef937 = new BitSet(new long[]{0x00DE000000440000L});
	public static final BitSet FOLLOW_comment_in_macroDef941 = new BitSet(new long[]{0x00DE000000440000L});
	public static final BitSet FOLLOW_macroEnd_in_macroDef946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MACRO_in_macroStart978 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_macroStart980 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_macroStart983 = new BitSet(new long[]{0x0000024000200000L});
	public static final BitSet FOLLOW_41_in_macroStart986 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_formalParams_in_macroStart988 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_macroStart989 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_WS_in_macroStart994 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_macroStart997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTRN_in_intrnlStmt1017 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_intrnlStmt1019 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_intrnlStmt1022 = new BitSet(new long[]{0x0000200000200000L});
	public static final BitSet FOLLOW_45_in_intrnlStmt1025 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_intrnlStmt1027 = new BitSet(new long[]{0x0000200000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_intrnlStmt1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEND_in_macroEnd1055 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_WS_in_macroEnd1058 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_macroEnd1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_formalParams1080 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_formalParams1083 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_formalParams1085 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ID_in_paramAssignment1111 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_paramAssignment1113 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_expr_in_paramAssignment1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_colspec_in_varList1148 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_varList1151 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_set_in_varList1154 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_varList1160 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_41_in_drawInterval1175 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_intervalStart_in_drawInterval1177 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_drawInterval1179 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_intervalStop_in_drawInterval1181 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_drawInterval1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_intervalStart1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_intervalStop1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_colspec1245 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_colspec1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_constDef1262 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_constDef1264 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_constDef1269 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_constDef1271 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_eqn_in_constDef1273 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_constDef1275 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_constDef1278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_initDef1299 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_initDef1301 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_initDef1304 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_initDef1306 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_eqn_in_initDef1308 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_initDef1310 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_initDef1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_auxDef1334 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_auxDef1336 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_auxDef1339 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_timeExt_in_auxDef1341 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_auxDef1343 = new BitSet(new long[]{0x0F00000000000000L});
	public static final BitSet FOLLOW_tableFunction_in_auxDef1345 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_auxDef1347 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_auxDef1367 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_auxDef1369 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_auxDef1372 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_timeExt_in_auxDef1374 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_auxDef1376 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_eqn_in_auxDef1378 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_auxDef1380 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_tableFunction1411 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_59_in_tableFunction1414 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_58_in_tableFunction1418 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_56_in_tableFunction1421 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_tableFunction1425 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_tableFunction1429 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_tableFunction1431 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_tableFunction1435 = new BitSet(new long[]{0x2000200000000000L});
	public static final BitSet FOLLOW_timeExt_in_tableFunction1437 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_tableFunction1440 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1444 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_tableFunction1446 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1450 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_tableFunction1452 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1456 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_tableFunction1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_rateDef1501 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_rateDef1503 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_rateDef1506 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_timeExt_in_rateDef1509 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_rateDef1511 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_eqn_in_rateDef1513 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_rateDef1515 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_rateDef1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_lvlDef1541 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_lvlDef1543 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_lvlDef1546 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_timeExt_in_lvlDef1548 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_lvlDef1550 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_eqn_in_lvlDef1552 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_lvlDef1554 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_lvlDef1557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_tblDef1578 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_tblDef1580 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_ID_in_tblDef1583 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_tblDef1585 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rangeList_in_tblDef1587 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_tblDef1589 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_tblDef1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment1618 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_lineComment_in_comment1620 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_comment1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment1633 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_WS_in_comment1635 = new BitSet(new long[]{0x0000004000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_comment1638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_rangeList1652 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_45_in_rangeList1656 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_47_in_rangeList1658 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_rangeList1661 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_expr_in_eqn1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr1703 = new BitSet(new long[]{0x0000500000000002L});
	public static final BitSet FOLLOW_set_in_expr1718 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_multExpr_in_expr1724 = new BitSet(new long[]{0x0000500000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr1748 = new BitSet(new long[]{0x0000880000000002L});
	public static final BitSet FOLLOW_set_in_multExpr1752 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_atom_in_multExpr1758 = new BitSet(new long[]{0x0000880000000002L});
	public static final BitSet FOLLOW_NUMBER_in_atom1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1793 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_timeExt_in_atom1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcRef_in_atom1811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_atom1821 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_expr_in_atom1823 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_atom1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_funcRef1850 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_funcRef1852 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_paramList_in_funcRef1854 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_funcRef1856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_paramList1879 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_paramList1882 = new BitSet(new long[]{0x0000020000800400L});
	public static final BitSet FOLLOW_expr_in_paramList1884 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_61_in_timeExt1898 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JKL_in_timeExt1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_lineComment1913 = new BitSet(new long[]{0x7FFFFFFFFFDFFFF0L});
	public static final BitSet FOLLOW_commentText_in_lineComment1916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_commentText1930 = new BitSet(new long[]{0x7FFFFFFFFFDFFFF2L});
}
