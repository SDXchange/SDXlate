// $ANTLR 3.5.2 ./examples/Dynbare.g 2014-11-30 20:30:26

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
		"PARAMS", "PLOT", "PRINT", "PTS", "RATE", "RUN", "SECTOR", "SPEC", "TAUX", 
		"VARIABLES", "WS", "XCOORDS", "YCOORDS", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'/'", "'='", "'A'", "'C'", "'L'", "'N'", "'P'", "'R'", "'T'", 
		"'TABLE'", "'TABPL'", "'TABXT'", "'['", "'\\.'", "']'"
	};
	public static final int EOF=-1;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
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
	public static final int PRINT=26;
	public static final int PTS=27;
	public static final int RATE=28;
	public static final int RUN=29;
	public static final int SECTOR=30;
	public static final int SPEC=31;
	public static final int TAUX=32;
	public static final int VARIABLES=33;
	public static final int WS=34;
	public static final int XCOORDS=35;
	public static final int YCOORDS=36;

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
	// ./examples/Dynbare.g:37:1: prog : ( macroDef )* ( defaultModule )? ( namedModule )* ( controlModule )? ( NEWLINE )* -> ^( DOCUMENT ( controlModule )? ^( MODEL ( defaultModule )? ( namedModule )* ) ( macroDef )* ) ;
	public final DynbareParser.prog_return prog() throws RecognitionException {
		DynbareParser.prog_return retval = new DynbareParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE5=null;
		ParserRuleReturnScope macroDef1 =null;
		ParserRuleReturnScope defaultModule2 =null;
		ParserRuleReturnScope namedModule3 =null;
		ParserRuleReturnScope controlModule4 =null;

		Object NEWLINE5_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleSubtreeStream stream_macroDef=new RewriteRuleSubtreeStream(adaptor,"rule macroDef");
		RewriteRuleSubtreeStream stream_defaultModule=new RewriteRuleSubtreeStream(adaptor,"rule defaultModule");
		RewriteRuleSubtreeStream stream_namedModule=new RewriteRuleSubtreeStream(adaptor,"rule namedModule");
		RewriteRuleSubtreeStream stream_controlModule=new RewriteRuleSubtreeStream(adaptor,"rule controlModule");

		try {
			// ./examples/Dynbare.g:38:2: ( ( macroDef )* ( defaultModule )? ( namedModule )* ( controlModule )? ( NEWLINE )* -> ^( DOCUMENT ( controlModule )? ^( MODEL ( defaultModule )? ( namedModule )* ) ( macroDef )* ) )
			// ./examples/Dynbare.g:38:4: ( macroDef )* ( defaultModule )? ( namedModule )* ( controlModule )? ( NEWLINE )*
			{
			// ./examples/Dynbare.g:38:4: ( macroDef )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MACRO) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./examples/Dynbare.g:38:4: macroDef
					{
					pushFollow(FOLLOW_macroDef_in_prog146);
					macroDef1=macroDef();
					state._fsp--;

					stream_macroDef.add(macroDef1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// ./examples/Dynbare.g:38:14: ( defaultModule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= 45 && LA2_0 <= 48)||(LA2_0 >= 50 && LA2_0 <= 51)) ) {
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
					// ./examples/Dynbare.g:38:14: defaultModule
					{
					pushFollow(FOLLOW_defaultModule_in_prog149);
					defaultModule2=defaultModule();
					state._fsp--;

					stream_defaultModule.add(defaultModule2.getTree());
					}
					break;

			}

			// ./examples/Dynbare.g:38:29: ( namedModule )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==NOTE) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==39) ) {
						int LA3_3 = input.LA(3);
						if ( (LA3_3==49) ) {
							alt3=1;
						}

					}

				}

				switch (alt3) {
				case 1 :
					// ./examples/Dynbare.g:38:29: namedModule
					{
					pushFollow(FOLLOW_namedModule_in_prog152);
					namedModule3=namedModule();
					state._fsp--;

					stream_namedModule.add(namedModule3.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// ./examples/Dynbare.g:38:42: ( controlModule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==NOTE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ./examples/Dynbare.g:38:42: controlModule
					{
					pushFollow(FOLLOW_controlModule_in_prog155);
					controlModule4=controlModule();
					state._fsp--;

					stream_controlModule.add(controlModule4.getTree());
					}
					break;

			}

			// ./examples/Dynbare.g:38:57: ( NEWLINE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==NEWLINE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./examples/Dynbare.g:38:57: NEWLINE
					{
					NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog158);  
					stream_NEWLINE.add(NEWLINE5);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: controlModule, namedModule, defaultModule, macroDef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 38:66: -> ^( DOCUMENT ( controlModule )? ^( MODEL ( defaultModule )? ( namedModule )* ) ( macroDef )* )
			{
				// ./examples/Dynbare.g:38:69: ^( DOCUMENT ( controlModule )? ^( MODEL ( defaultModule )? ( namedModule )* ) ( macroDef )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOCUMENT, "DOCUMENT"), root_1);
				// ./examples/Dynbare.g:38:80: ( controlModule )?
				if ( stream_controlModule.hasNext() ) {
					adaptor.addChild(root_1, stream_controlModule.nextTree());
				}
				stream_controlModule.reset();

				// ./examples/Dynbare.g:38:95: ^( MODEL ( defaultModule )? ( namedModule )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODEL, "MODEL"), root_2);
				// ./examples/Dynbare.g:38:103: ( defaultModule )?
				if ( stream_defaultModule.hasNext() ) {
					adaptor.addChild(root_2, stream_defaultModule.nextTree());
				}
				stream_defaultModule.reset();

				// ./examples/Dynbare.g:38:118: ( namedModule )*
				while ( stream_namedModule.hasNext() ) {
					adaptor.addChild(root_2, stream_namedModule.nextTree());
				}
				stream_namedModule.reset();

				adaptor.addChild(root_1, root_2);
				}

				// ./examples/Dynbare.g:38:133: ( macroDef )*
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
	// ./examples/Dynbare.g:41:1: controlModule : controlSector ( controlStat | comment )+ -> ^( CONTROL ( controlStat )+ ) ;
	public final DynbareParser.controlModule_return controlModule() throws RecognitionException {
		DynbareParser.controlModule_return retval = new DynbareParser.controlModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope controlSector6 =null;
		ParserRuleReturnScope controlStat7 =null;
		ParserRuleReturnScope comment8 =null;

		RewriteRuleSubtreeStream stream_controlSector=new RewriteRuleSubtreeStream(adaptor,"rule controlSector");
		RewriteRuleSubtreeStream stream_controlStat=new RewriteRuleSubtreeStream(adaptor,"rule controlStat");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:42:3: ( controlSector ( controlStat | comment )+ -> ^( CONTROL ( controlStat )+ ) )
			// ./examples/Dynbare.g:42:5: controlSector ( controlStat | comment )+
			{
			pushFollow(FOLLOW_controlSector_in_controlModule198);
			controlSector6=controlSector();
			state._fsp--;

			stream_controlSector.add(controlSector6.getTree());
			// ./examples/Dynbare.g:42:19: ( controlStat | comment )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= PLOT && LA6_0 <= PRINT)||LA6_0==RUN||LA6_0==SPEC) ) {
					alt6=1;
				}
				else if ( (LA6_0==NOTE) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// ./examples/Dynbare.g:42:20: controlStat
					{
					pushFollow(FOLLOW_controlStat_in_controlModule201);
					controlStat7=controlStat();
					state._fsp--;

					stream_controlStat.add(controlStat7.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:42:34: comment
					{
					pushFollow(FOLLOW_comment_in_controlModule205);
					comment8=comment();
					state._fsp--;

					stream_comment.add(comment8.getTree());
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// AST REWRITE
			// elements: controlStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 42:45: -> ^( CONTROL ( controlStat )+ )
			{
				// ./examples/Dynbare.g:42:48: ^( CONTROL ( controlStat )+ )
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
	// ./examples/Dynbare.g:45:1: controlStat : ( simSpec | runSpec ->| viewSpec ->);
	public final DynbareParser.controlStat_return controlStat() throws RecognitionException {
		DynbareParser.controlStat_return retval = new DynbareParser.controlStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simSpec9 =null;
		ParserRuleReturnScope runSpec10 =null;
		ParserRuleReturnScope viewSpec11 =null;

		RewriteRuleSubtreeStream stream_viewSpec=new RewriteRuleSubtreeStream(adaptor,"rule viewSpec");
		RewriteRuleSubtreeStream stream_runSpec=new RewriteRuleSubtreeStream(adaptor,"rule runSpec");

		try {
			// ./examples/Dynbare.g:46:5: ( simSpec | runSpec ->| viewSpec ->)
			int alt7=3;
			switch ( input.LA(1) ) {
			case SPEC:
				{
				alt7=1;
				}
				break;
			case RUN:
				{
				alt7=2;
				}
				break;
			case PLOT:
			case PRINT:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ./examples/Dynbare.g:46:7: simSpec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simSpec_in_controlStat257);
					simSpec9=simSpec();
					state._fsp--;

					adaptor.addChild(root_0, simSpec9.getTree());

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:47:9: runSpec
					{
					pushFollow(FOLLOW_runSpec_in_controlStat268);
					runSpec10=runSpec();
					state._fsp--;

					stream_runSpec.add(runSpec10.getTree());
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
					// 47:17: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:48:9: viewSpec
					{
					pushFollow(FOLLOW_viewSpec_in_controlStat280);
					viewSpec11=viewSpec();
					state._fsp--;

					stream_viewSpec.add(viewSpec11.getTree());
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
					// 48:18: ->
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
	// ./examples/Dynbare.g:51:1: defaultModule : ( definition | comment )+ -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) ) ;
	public final DynbareParser.defaultModule_return defaultModule() throws RecognitionException {
		DynbareParser.defaultModule_return retval = new DynbareParser.defaultModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition12 =null;
		ParserRuleReturnScope comment13 =null;

		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:52:2: ( ( definition | comment )+ -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) ) )
			// ./examples/Dynbare.g:52:4: ( definition | comment )+
			{
			// ./examples/Dynbare.g:52:4: ( definition | comment )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==NOTE) ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1==NEWLINE||LA8_1==WS) ) {
						alt8=2;
					}

				}
				else if ( ((LA8_0 >= 45 && LA8_0 <= 48)||(LA8_0 >= 50 && LA8_0 <= 51)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./examples/Dynbare.g:52:5: definition
					{
					pushFollow(FOLLOW_definition_in_defaultModule301);
					definition12=definition();
					state._fsp--;

					stream_definition.add(definition12.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:52:18: comment
					{
					pushFollow(FOLLOW_comment_in_defaultModule305);
					comment13=comment();
					state._fsp--;

					stream_comment.add(comment13.getTree());
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
			// 52:28: -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) )
			{
				// ./examples/Dynbare.g:52:31: ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);
				adaptor.addChild(root_1, (Object)adaptor.create(ID, "default"));
				// ./examples/Dynbare.g:52:54: ^( VARIABLES ( definition )+ )
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
	// ./examples/Dynbare.g:55:1: namedModule : sector ( definition | comment )+ -> ^( MODULE sector ^( VARIABLES ( definition )+ ) ) ;
	public final DynbareParser.namedModule_return namedModule() throws RecognitionException {
		DynbareParser.namedModule_return retval = new DynbareParser.namedModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sector14 =null;
		ParserRuleReturnScope definition15 =null;
		ParserRuleReturnScope comment16 =null;

		RewriteRuleSubtreeStream stream_sector=new RewriteRuleSubtreeStream(adaptor,"rule sector");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:56:6: ( sector ( definition | comment )+ -> ^( MODULE sector ^( VARIABLES ( definition )+ ) ) )
			// ./examples/Dynbare.g:56:8: sector ( definition | comment )+
			{
			pushFollow(FOLLOW_sector_in_namedModule345);
			sector14=sector();
			state._fsp--;

			stream_sector.add(sector14.getTree());
			// ./examples/Dynbare.g:56:15: ( definition | comment )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==NOTE) ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1==NEWLINE||LA9_1==WS) ) {
						alt9=2;
					}

				}
				else if ( ((LA9_0 >= 45 && LA9_0 <= 48)||(LA9_0 >= 50 && LA9_0 <= 51)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./examples/Dynbare.g:56:16: definition
					{
					pushFollow(FOLLOW_definition_in_namedModule348);
					definition15=definition();
					state._fsp--;

					stream_definition.add(definition15.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:56:29: comment
					{
					pushFollow(FOLLOW_comment_in_namedModule352);
					comment16=comment();
					state._fsp--;

					stream_comment.add(comment16.getTree());
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			// AST REWRITE
			// elements: definition, sector
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:39: -> ^( MODULE sector ^( VARIABLES ( definition )+ ) )
			{
				// ./examples/Dynbare.g:56:42: ^( MODULE sector ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);
				adaptor.addChild(root_1, stream_sector.nextTree());
				// ./examples/Dynbare.g:56:58: ^( VARIABLES ( definition )+ )
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
	// ./examples/Dynbare.g:59:1: definition : ( auxDef | lvlDef | initDef | constDef | rateDef | tblDef );
	public final DynbareParser.definition_return definition() throws RecognitionException {
		DynbareParser.definition_return retval = new DynbareParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope auxDef17 =null;
		ParserRuleReturnScope lvlDef18 =null;
		ParserRuleReturnScope initDef19 =null;
		ParserRuleReturnScope constDef20 =null;
		ParserRuleReturnScope rateDef21 =null;
		ParserRuleReturnScope tblDef22 =null;


		try {
			// ./examples/Dynbare.g:60:5: ( auxDef | lvlDef | initDef | constDef | rateDef | tblDef )
			int alt10=6;
			switch ( input.LA(1) ) {
			case 45:
				{
				alt10=1;
				}
				break;
			case 47:
				{
				alt10=2;
				}
				break;
			case 48:
				{
				alt10=3;
				}
				break;
			case 46:
				{
				alt10=4;
				}
				break;
			case 50:
				{
				alt10=5;
				}
				break;
			case 51:
				{
				alt10=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// ./examples/Dynbare.g:60:7: auxDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_auxDef_in_definition396);
					auxDef17=auxDef();
					state._fsp--;

					adaptor.addChild(root_0, auxDef17.getTree());

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:61:9: lvlDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvlDef_in_definition406);
					lvlDef18=lvlDef();
					state._fsp--;

					adaptor.addChild(root_0, lvlDef18.getTree());

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:62:9: initDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_initDef_in_definition416);
					initDef19=initDef();
					state._fsp--;

					adaptor.addChild(root_0, initDef19.getTree());

					}
					break;
				case 4 :
					// ./examples/Dynbare.g:63:7: constDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDef_in_definition424);
					constDef20=constDef();
					state._fsp--;

					adaptor.addChild(root_0, constDef20.getTree());

					}
					break;
				case 5 :
					// ./examples/Dynbare.g:64:9: rateDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_rateDef_in_definition435);
					rateDef21=rateDef();
					state._fsp--;

					adaptor.addChild(root_0, rateDef21.getTree());

					}
					break;
				case 6 :
					// ./examples/Dynbare.g:65:9: tblDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tblDef_in_definition446);
					tblDef22=tblDef();
					state._fsp--;

					adaptor.addChild(root_0, tblDef22.getTree());

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
	// ./examples/Dynbare.g:68:1: sector : NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID ;
	public final DynbareParser.sector_return sector() throws RecognitionException {
		DynbareParser.sector_return retval = new DynbareParser.sector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE23=null;
		Token char_literal24=null;
		Token char_literal25=null;
		Token WS26=null;
		Token char_literal27=null;
		Token SECTOR28=null;
		Token char_literal29=null;
		Token ID30=null;
		Token char_literal31=null;
		Token NEWLINE33=null;
		ParserRuleReturnScope lineComment32 =null;

		Object NOTE23_tree=null;
		Object char_literal24_tree=null;
		Object char_literal25_tree=null;
		Object WS26_tree=null;
		Object char_literal27_tree=null;
		Object SECTOR28_tree=null;
		Object char_literal29_tree=null;
		Object ID30_tree=null;
		Object char_literal31_tree=null;
		Object NEWLINE33_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_SECTOR=new RewriteRuleTokenStream(adaptor,"token SECTOR");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_NOTE=new RewriteRuleTokenStream(adaptor,"token NOTE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// ./examples/Dynbare.g:69:3: ( NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID )
			// ./examples/Dynbare.g:69:5: NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE
			{
			NOTE23=(Token)match(input,NOTE,FOLLOW_NOTE_in_sector465);  
			stream_NOTE.add(NOTE23);

			char_literal24=(Token)match(input,39,FOLLOW_39_in_sector467);  
			stream_39.add(char_literal24);

			char_literal25=(Token)match(input,49,FOLLOW_49_in_sector469);  
			stream_49.add(char_literal25);

			// ./examples/Dynbare.g:69:18: ( WS )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ./examples/Dynbare.g:69:18: WS
					{
					WS26=(Token)match(input,WS,FOLLOW_WS_in_sector471);  
					stream_WS.add(WS26);

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			char_literal27=(Token)match(input,55,FOLLOW_55_in_sector474);  
			stream_55.add(char_literal27);

			SECTOR28=(Token)match(input,SECTOR,FOLLOW_SECTOR_in_sector477);  
			stream_SECTOR.add(SECTOR28);

			char_literal29=(Token)match(input,44,FOLLOW_44_in_sector479);  
			stream_44.add(char_literal29);

			ID30=(Token)match(input,ID,FOLLOW_ID_in_sector481);  
			stream_ID.add(ID30);

			char_literal31=(Token)match(input,57,FOLLOW_57_in_sector484);  
			stream_57.add(char_literal31);

			// ./examples/Dynbare.g:69:46: ( lineComment )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// ./examples/Dynbare.g:69:46: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_sector486);
					lineComment32=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment32.getTree());
					}
					break;

			}

			NEWLINE33=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_sector490);  
			stream_NEWLINE.add(NEWLINE33);

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
			// 69:68: -> ID
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
	// ./examples/Dynbare.g:72:1: controlSector : NOTE '*' 'C' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID ;
	public final DynbareParser.controlSector_return controlSector() throws RecognitionException {
		DynbareParser.controlSector_return retval = new DynbareParser.controlSector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE34=null;
		Token char_literal35=null;
		Token char_literal36=null;
		Token WS37=null;
		Token char_literal38=null;
		Token SECTOR39=null;
		Token char_literal40=null;
		Token ID41=null;
		Token char_literal42=null;
		Token NEWLINE44=null;
		ParserRuleReturnScope lineComment43 =null;

		Object NOTE34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal36_tree=null;
		Object WS37_tree=null;
		Object char_literal38_tree=null;
		Object SECTOR39_tree=null;
		Object char_literal40_tree=null;
		Object ID41_tree=null;
		Object char_literal42_tree=null;
		Object NEWLINE44_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_SECTOR=new RewriteRuleTokenStream(adaptor,"token SECTOR");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_NOTE=new RewriteRuleTokenStream(adaptor,"token NOTE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// ./examples/Dynbare.g:73:3: ( NOTE '*' 'C' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE -> ID )
			// ./examples/Dynbare.g:73:5: NOTE '*' 'C' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE
			{
			NOTE34=(Token)match(input,NOTE,FOLLOW_NOTE_in_controlSector508);  
			stream_NOTE.add(NOTE34);

			char_literal35=(Token)match(input,39,FOLLOW_39_in_controlSector510);  
			stream_39.add(char_literal35);

			char_literal36=(Token)match(input,46,FOLLOW_46_in_controlSector512);  
			stream_46.add(char_literal36);

			// ./examples/Dynbare.g:73:18: ( WS )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==WS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./examples/Dynbare.g:73:18: WS
					{
					WS37=(Token)match(input,WS,FOLLOW_WS_in_controlSector514);  
					stream_WS.add(WS37);

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			char_literal38=(Token)match(input,55,FOLLOW_55_in_controlSector517);  
			stream_55.add(char_literal38);

			SECTOR39=(Token)match(input,SECTOR,FOLLOW_SECTOR_in_controlSector520);  
			stream_SECTOR.add(SECTOR39);

			char_literal40=(Token)match(input,44,FOLLOW_44_in_controlSector522);  
			stream_44.add(char_literal40);

			ID41=(Token)match(input,ID,FOLLOW_ID_in_controlSector524);  
			stream_ID.add(ID41);

			char_literal42=(Token)match(input,57,FOLLOW_57_in_controlSector526);  
			stream_57.add(char_literal42);

			// ./examples/Dynbare.g:73:45: ( lineComment )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==WS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ./examples/Dynbare.g:73:45: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_controlSector528);
					lineComment43=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment43.getTree());
					}
					break;

			}

			NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_controlSector532);  
			stream_NEWLINE.add(NEWLINE44);

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
			// 73:67: -> ID
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
	// ./examples/Dynbare.g:77:1: viewSpec : ( PLOT ( WS )+ graphAssign ( ( ',' | '/' ) graphAssign )* NEWLINE | PRINT ( WS )+ varList NEWLINE );
	public final DynbareParser.viewSpec_return viewSpec() throws RecognitionException {
		DynbareParser.viewSpec_return retval = new DynbareParser.viewSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLOT45=null;
		Token WS46=null;
		Token set48=null;
		Token NEWLINE50=null;
		Token PRINT51=null;
		Token WS52=null;
		Token NEWLINE54=null;
		ParserRuleReturnScope graphAssign47 =null;
		ParserRuleReturnScope graphAssign49 =null;
		ParserRuleReturnScope varList53 =null;

		Object PLOT45_tree=null;
		Object WS46_tree=null;
		Object set48_tree=null;
		Object NEWLINE50_tree=null;
		Object PRINT51_tree=null;
		Object WS52_tree=null;
		Object NEWLINE54_tree=null;

		try {
			// ./examples/Dynbare.g:78:4: ( PLOT ( WS )+ graphAssign ( ( ',' | '/' ) graphAssign )* NEWLINE | PRINT ( WS )+ varList NEWLINE )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==PLOT) ) {
				alt18=1;
			}
			else if ( (LA18_0==PRINT) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// ./examples/Dynbare.g:78:6: PLOT ( WS )+ graphAssign ( ( ',' | '/' ) graphAssign )* NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					PLOT45=(Token)match(input,PLOT,FOLLOW_PLOT_in_viewSpec562); 
					PLOT45_tree = (Object)adaptor.create(PLOT45);
					adaptor.addChild(root_0, PLOT45_tree);

					// ./examples/Dynbare.g:78:11: ( WS )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==WS) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// ./examples/Dynbare.g:78:11: WS
							{
							WS46=(Token)match(input,WS,FOLLOW_WS_in_viewSpec564); 
							WS46_tree = (Object)adaptor.create(WS46);
							adaptor.addChild(root_0, WS46_tree);

							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					pushFollow(FOLLOW_graphAssign_in_viewSpec567);
					graphAssign47=graphAssign();
					state._fsp--;

					adaptor.addChild(root_0, graphAssign47.getTree());

					// ./examples/Dynbare.g:78:27: ( ( ',' | '/' ) graphAssign )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==41||LA16_0==43) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// ./examples/Dynbare.g:78:28: ( ',' | '/' ) graphAssign
							{
							set48=input.LT(1);
							if ( input.LA(1)==41||input.LA(1)==43 ) {
								input.consume();
								adaptor.addChild(root_0, (Object)adaptor.create(set48));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_graphAssign_in_viewSpec576);
							graphAssign49=graphAssign();
							state._fsp--;

							adaptor.addChild(root_0, graphAssign49.getTree());

							}
							break;

						default :
							break loop16;
						}
					}

					NEWLINE50=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_viewSpec580); 
					NEWLINE50_tree = (Object)adaptor.create(NEWLINE50);
					adaptor.addChild(root_0, NEWLINE50_tree);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:79:11: PRINT ( WS )+ varList NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					PRINT51=(Token)match(input,PRINT,FOLLOW_PRINT_in_viewSpec592); 
					PRINT51_tree = (Object)adaptor.create(PRINT51);
					adaptor.addChild(root_0, PRINT51_tree);

					// ./examples/Dynbare.g:79:17: ( WS )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==WS) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// ./examples/Dynbare.g:79:17: WS
							{
							WS52=(Token)match(input,WS,FOLLOW_WS_in_viewSpec594); 
							WS52_tree = (Object)adaptor.create(WS52);
							adaptor.addChild(root_0, WS52_tree);

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					pushFollow(FOLLOW_varList_in_viewSpec597);
					varList53=varList();
					state._fsp--;

					adaptor.addChild(root_0, varList53.getTree());

					NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_viewSpec599); 
					NEWLINE54_tree = (Object)adaptor.create(NEWLINE54);
					adaptor.addChild(root_0, NEWLINE54_tree);

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


	public static class runSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "runSpec"
	// ./examples/Dynbare.g:82:1: runSpec : RUN ( lineComment )? NEWLINE ;
	public final DynbareParser.runSpec_return runSpec() throws RecognitionException {
		DynbareParser.runSpec_return retval = new DynbareParser.runSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RUN55=null;
		Token NEWLINE57=null;
		ParserRuleReturnScope lineComment56 =null;

		Object RUN55_tree=null;
		Object NEWLINE57_tree=null;

		try {
			// ./examples/Dynbare.g:83:6: ( RUN ( lineComment )? NEWLINE )
			// ./examples/Dynbare.g:83:8: RUN ( lineComment )? NEWLINE
			{
			root_0 = (Object)adaptor.nil();


			RUN55=(Token)match(input,RUN,FOLLOW_RUN_in_runSpec627); 
			RUN55_tree = (Object)adaptor.create(RUN55);
			adaptor.addChild(root_0, RUN55_tree);

			// ./examples/Dynbare.g:83:12: ( lineComment )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==WS) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// ./examples/Dynbare.g:83:12: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_runSpec629);
					lineComment56=lineComment();
					state._fsp--;

					adaptor.addChild(root_0, lineComment56.getTree());

					}
					break;

			}

			NEWLINE57=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_runSpec632); 
			NEWLINE57_tree = (Object)adaptor.create(NEWLINE57);
			adaptor.addChild(root_0, NEWLINE57_tree);

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
	// ./examples/Dynbare.g:86:1: simSpec : SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE -> ^( PARAMS ( paramAssignment )+ ) ;
	public final DynbareParser.simSpec_return simSpec() throws RecognitionException {
		DynbareParser.simSpec_return retval = new DynbareParser.simSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SPEC58=null;
		Token WS59=null;
		Token char_literal61=null;
		Token char_literal62=null;
		Token NEWLINE64=null;
		ParserRuleReturnScope paramAssignment60 =null;
		ParserRuleReturnScope paramAssignment63 =null;

		Object SPEC58_tree=null;
		Object WS59_tree=null;
		Object char_literal61_tree=null;
		Object char_literal62_tree=null;
		Object NEWLINE64_tree=null;
		RewriteRuleTokenStream stream_SPEC=new RewriteRuleTokenStream(adaptor,"token SPEC");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleSubtreeStream stream_paramAssignment=new RewriteRuleSubtreeStream(adaptor,"rule paramAssignment");

		try {
			// ./examples/Dynbare.g:87:6: ( SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE -> ^( PARAMS ( paramAssignment )+ ) )
			// ./examples/Dynbare.g:87:8: SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE
			{
			SPEC58=(Token)match(input,SPEC,FOLLOW_SPEC_in_simSpec656);  
			stream_SPEC.add(SPEC58);

			WS59=(Token)match(input,WS,FOLLOW_WS_in_simSpec658);  
			stream_WS.add(WS59);

			pushFollow(FOLLOW_paramAssignment_in_simSpec660);
			paramAssignment60=paramAssignment();
			state._fsp--;

			stream_paramAssignment.add(paramAssignment60.getTree());
			// ./examples/Dynbare.g:87:32: ( ( ',' | '/' ) paramAssignment )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==41||LA21_0==43) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ./examples/Dynbare.g:87:33: ( ',' | '/' ) paramAssignment
					{
					// ./examples/Dynbare.g:87:33: ( ',' | '/' )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==41) ) {
						alt20=1;
					}
					else if ( (LA20_0==43) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// ./examples/Dynbare.g:87:34: ','
							{
							char_literal61=(Token)match(input,41,FOLLOW_41_in_simSpec664);  
							stream_41.add(char_literal61);

							}
							break;
						case 2 :
							// ./examples/Dynbare.g:87:38: '/'
							{
							char_literal62=(Token)match(input,43,FOLLOW_43_in_simSpec666);  
							stream_43.add(char_literal62);

							}
							break;

					}

					pushFollow(FOLLOW_paramAssignment_in_simSpec669);
					paramAssignment63=paramAssignment();
					state._fsp--;

					stream_paramAssignment.add(paramAssignment63.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			NEWLINE64=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_simSpec673);  
			stream_NEWLINE.add(NEWLINE64);

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
			// 87:69: -> ^( PARAMS ( paramAssignment )+ )
			{
				// ./examples/Dynbare.g:87:72: ^( PARAMS ( paramAssignment )+ )
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
	// ./examples/Dynbare.g:90:1: macroDef : macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) ) ;
	public final DynbareParser.macroDef_return macroDef() throws RecognitionException {
		DynbareParser.macroDef_return retval = new DynbareParser.macroDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope macroStart65 =null;
		ParserRuleReturnScope intrnlStmt66 =null;
		ParserRuleReturnScope definition67 =null;
		ParserRuleReturnScope comment68 =null;
		ParserRuleReturnScope macroEnd69 =null;

		RewriteRuleSubtreeStream stream_intrnlStmt=new RewriteRuleSubtreeStream(adaptor,"rule intrnlStmt");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_macroStart=new RewriteRuleSubtreeStream(adaptor,"rule macroStart");
		RewriteRuleSubtreeStream stream_macroEnd=new RewriteRuleSubtreeStream(adaptor,"rule macroEnd");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// ./examples/Dynbare.g:91:3: ( macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) ) )
			// ./examples/Dynbare.g:91:5: macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd
			{
			pushFollow(FOLLOW_macroStart_in_macroDef703);
			macroStart65=macroStart();
			state._fsp--;

			stream_macroStart.add(macroStart65.getTree());
			// ./examples/Dynbare.g:91:16: ( intrnlStmt )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==INTRN) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ./examples/Dynbare.g:91:16: intrnlStmt
					{
					pushFollow(FOLLOW_intrnlStmt_in_macroDef705);
					intrnlStmt66=intrnlStmt();
					state._fsp--;

					stream_intrnlStmt.add(intrnlStmt66.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			// ./examples/Dynbare.g:91:28: ( definition | comment )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= 45 && LA23_0 <= 48)||(LA23_0 >= 50 && LA23_0 <= 51)) ) {
					alt23=1;
				}
				else if ( (LA23_0==NOTE) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// ./examples/Dynbare.g:91:29: definition
					{
					pushFollow(FOLLOW_definition_in_macroDef709);
					definition67=definition();
					state._fsp--;

					stream_definition.add(definition67.getTree());
					}
					break;
				case 2 :
					// ./examples/Dynbare.g:91:42: comment
					{
					pushFollow(FOLLOW_comment_in_macroDef713);
					comment68=comment();
					state._fsp--;

					stream_comment.add(comment68.getTree());
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			pushFollow(FOLLOW_macroEnd_in_macroDef718);
			macroEnd69=macroEnd();
			state._fsp--;

			stream_macroEnd.add(macroEnd69.getTree());
			// AST REWRITE
			// elements: macroStart, definition, intrnlStmt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 91:62: -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) )
			{
				// ./examples/Dynbare.g:91:65: ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MACRO, "MACRO"), root_1);
				adaptor.addChild(root_1, stream_macroStart.nextTree());
				adaptor.addChild(root_1, stream_intrnlStmt.nextTree());
				// ./examples/Dynbare.g:91:95: ^( VARIABLES ( definition )+ )
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
	// ./examples/Dynbare.g:94:1: macroStart : MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE -> ID formalParams ;
	public final DynbareParser.macroStart_return macroStart() throws RecognitionException {
		DynbareParser.macroStart_return retval = new DynbareParser.macroStart_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MACRO70=null;
		Token WS71=null;
		Token ID72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token WS76=null;
		Token NEWLINE77=null;
		ParserRuleReturnScope formalParams74 =null;

		Object MACRO70_tree=null;
		Object WS71_tree=null;
		Object ID72_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object WS76_tree=null;
		Object NEWLINE77_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_MACRO=new RewriteRuleTokenStream(adaptor,"token MACRO");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_formalParams=new RewriteRuleSubtreeStream(adaptor,"rule formalParams");

		try {
			// ./examples/Dynbare.g:95:3: ( MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE -> ID formalParams )
			// ./examples/Dynbare.g:95:5: MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE
			{
			MACRO70=(Token)match(input,MACRO,FOLLOW_MACRO_in_macroStart750);  
			stream_MACRO.add(MACRO70);

			// ./examples/Dynbare.g:95:11: ( WS )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// ./examples/Dynbare.g:95:11: WS
					{
					WS71=(Token)match(input,WS,FOLLOW_WS_in_macroStart752);  
					stream_WS.add(WS71);

					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			ID72=(Token)match(input,ID,FOLLOW_ID_in_macroStart755);  
			stream_ID.add(ID72);

			// ./examples/Dynbare.g:95:18: ( '(' formalParams ')' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==37) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// ./examples/Dynbare.g:95:19: '(' formalParams ')'
					{
					char_literal73=(Token)match(input,37,FOLLOW_37_in_macroStart758);  
					stream_37.add(char_literal73);

					pushFollow(FOLLOW_formalParams_in_macroStart760);
					formalParams74=formalParams();
					state._fsp--;

					stream_formalParams.add(formalParams74.getTree());
					char_literal75=(Token)match(input,38,FOLLOW_38_in_macroStart761);  
					stream_38.add(char_literal75);

					}
					break;

			}

			// ./examples/Dynbare.g:95:42: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// ./examples/Dynbare.g:95:42: WS
					{
					WS76=(Token)match(input,WS,FOLLOW_WS_in_macroStart766);  
					stream_WS.add(WS76);

					}
					break;

				default :
					break loop26;
				}
			}

			NEWLINE77=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_macroStart769);  
			stream_NEWLINE.add(NEWLINE77);

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
			// 95:54: -> ID formalParams
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
	// ./examples/Dynbare.g:97:1: intrnlStmt : INTRN ( WS )+ ID ( ',' ID )* NEWLINE -> ^( LOCALS ( ID )* ) ;
	public final DynbareParser.intrnlStmt_return intrnlStmt() throws RecognitionException {
		DynbareParser.intrnlStmt_return retval = new DynbareParser.intrnlStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRN78=null;
		Token WS79=null;
		Token ID80=null;
		Token char_literal81=null;
		Token ID82=null;
		Token NEWLINE83=null;

		Object INTRN78_tree=null;
		Object WS79_tree=null;
		Object ID80_tree=null;
		Object char_literal81_tree=null;
		Object ID82_tree=null;
		Object NEWLINE83_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INTRN=new RewriteRuleTokenStream(adaptor,"token INTRN");

		try {
			// ./examples/Dynbare.g:98:3: ( INTRN ( WS )+ ID ( ',' ID )* NEWLINE -> ^( LOCALS ( ID )* ) )
			// ./examples/Dynbare.g:98:5: INTRN ( WS )+ ID ( ',' ID )* NEWLINE
			{
			INTRN78=(Token)match(input,INTRN,FOLLOW_INTRN_in_intrnlStmt789);  
			stream_INTRN.add(INTRN78);

			// ./examples/Dynbare.g:98:11: ( WS )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// ./examples/Dynbare.g:98:11: WS
					{
					WS79=(Token)match(input,WS,FOLLOW_WS_in_intrnlStmt791);  
					stream_WS.add(WS79);

					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			ID80=(Token)match(input,ID,FOLLOW_ID_in_intrnlStmt794);  
			stream_ID.add(ID80);

			// ./examples/Dynbare.g:98:18: ( ',' ID )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==41) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// ./examples/Dynbare.g:98:19: ',' ID
					{
					char_literal81=(Token)match(input,41,FOLLOW_41_in_intrnlStmt797);  
					stream_41.add(char_literal81);

					ID82=(Token)match(input,ID,FOLLOW_ID_in_intrnlStmt799);  
					stream_ID.add(ID82);

					}
					break;

				default :
					break loop28;
				}
			}

			NEWLINE83=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_intrnlStmt803);  
			stream_NEWLINE.add(NEWLINE83);

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
			// 98:36: -> ^( LOCALS ( ID )* )
			{
				// ./examples/Dynbare.g:98:39: ^( LOCALS ( ID )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALS, "LOCALS"), root_1);
				// ./examples/Dynbare.g:98:48: ( ID )*
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
	// ./examples/Dynbare.g:101:1: macroEnd : MEND ( WS )* NEWLINE ->;
	public final DynbareParser.macroEnd_return macroEnd() throws RecognitionException {
		DynbareParser.macroEnd_return retval = new DynbareParser.macroEnd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MEND84=null;
		Token WS85=null;
		Token NEWLINE86=null;

		Object MEND84_tree=null;
		Object WS85_tree=null;
		Object NEWLINE86_tree=null;
		RewriteRuleTokenStream stream_MEND=new RewriteRuleTokenStream(adaptor,"token MEND");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");

		try {
			// ./examples/Dynbare.g:102:3: ( MEND ( WS )* NEWLINE ->)
			// ./examples/Dynbare.g:102:5: MEND ( WS )* NEWLINE
			{
			MEND84=(Token)match(input,MEND,FOLLOW_MEND_in_macroEnd827);  
			stream_MEND.add(MEND84);

			// ./examples/Dynbare.g:102:11: ( WS )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// ./examples/Dynbare.g:102:11: WS
					{
					WS85=(Token)match(input,WS,FOLLOW_WS_in_macroEnd830);  
					stream_WS.add(WS85);

					}
					break;

				default :
					break loop29;
				}
			}

			NEWLINE86=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_macroEnd833);  
			stream_NEWLINE.add(NEWLINE86);

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
			// 102:23: ->
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
	// ./examples/Dynbare.g:104:1: formalParams : ID ( ',' ID )* -> ^( FORMAL_PARAMS ( ID )* ) ;
	public final DynbareParser.formalParams_return formalParams() throws RecognitionException {
		DynbareParser.formalParams_return retval = new DynbareParser.formalParams_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID87=null;
		Token char_literal88=null;
		Token ID89=null;

		Object ID87_tree=null;
		Object char_literal88_tree=null;
		Object ID89_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// ./examples/Dynbare.g:105:2: ( ID ( ',' ID )* -> ^( FORMAL_PARAMS ( ID )* ) )
			// ./examples/Dynbare.g:105:9: ID ( ',' ID )*
			{
			ID87=(Token)match(input,ID,FOLLOW_ID_in_formalParams852);  
			stream_ID.add(ID87);

			// ./examples/Dynbare.g:105:12: ( ',' ID )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==41) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// ./examples/Dynbare.g:105:13: ',' ID
					{
					char_literal88=(Token)match(input,41,FOLLOW_41_in_formalParams855);  
					stream_41.add(char_literal88);

					ID89=(Token)match(input,ID,FOLLOW_ID_in_formalParams857);  
					stream_ID.add(ID89);

					}
					break;

				default :
					break loop30;
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
			// 105:22: -> ^( FORMAL_PARAMS ( ID )* )
			{
				// ./examples/Dynbare.g:105:25: ^( FORMAL_PARAMS ( ID )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMAL_PARAMS, "FORMAL_PARAMS"), root_1);
				// ./examples/Dynbare.g:105:41: ( ID )*
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


	public static class graphAssign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "graphAssign"
	// ./examples/Dynbare.g:107:1: graphAssign : ID ( '=' drawChar ( drawInterval )? )? ;
	public final DynbareParser.graphAssign_return graphAssign() throws RecognitionException {
		DynbareParser.graphAssign_return retval = new DynbareParser.graphAssign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID90=null;
		Token char_literal91=null;
		ParserRuleReturnScope drawChar92 =null;
		ParserRuleReturnScope drawInterval93 =null;

		Object ID90_tree=null;
		Object char_literal91_tree=null;

		try {
			// ./examples/Dynbare.g:108:4: ( ID ( '=' drawChar ( drawInterval )? )? )
			// ./examples/Dynbare.g:108:6: ID ( '=' drawChar ( drawInterval )? )?
			{
			root_0 = (Object)adaptor.nil();


			ID90=(Token)match(input,ID,FOLLOW_ID_in_graphAssign880); 
			ID90_tree = (Object)adaptor.create(ID90);
			adaptor.addChild(root_0, ID90_tree);

			// ./examples/Dynbare.g:108:9: ( '=' drawChar ( drawInterval )? )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==44) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// ./examples/Dynbare.g:108:10: '=' drawChar ( drawInterval )?
					{
					char_literal91=(Token)match(input,44,FOLLOW_44_in_graphAssign883); 
					char_literal91_tree = (Object)adaptor.create(char_literal91);
					adaptor.addChild(root_0, char_literal91_tree);

					pushFollow(FOLLOW_drawChar_in_graphAssign885);
					drawChar92=drawChar();
					state._fsp--;

					adaptor.addChild(root_0, drawChar92.getTree());

					// ./examples/Dynbare.g:108:23: ( drawInterval )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==37) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// ./examples/Dynbare.g:108:23: drawInterval
							{
							pushFollow(FOLLOW_drawInterval_in_graphAssign887);
							drawInterval93=drawInterval();
							state._fsp--;

							adaptor.addChild(root_0, drawInterval93.getTree());

							}
							break;

					}

					}
					break;

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
	// $ANTLR end "graphAssign"


	public static class paramAssignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramAssignment"
	// ./examples/Dynbare.g:110:1: paramAssignment : ID '=' expr -> ^( '=' ID expr ) ;
	public final DynbareParser.paramAssignment_return paramAssignment() throws RecognitionException {
		DynbareParser.paramAssignment_return retval = new DynbareParser.paramAssignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID94=null;
		Token char_literal95=null;
		ParserRuleReturnScope expr96 =null;

		Object ID94_tree=null;
		Object char_literal95_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// ./examples/Dynbare.g:111:6: ( ID '=' expr -> ^( '=' ID expr ) )
			// ./examples/Dynbare.g:111:8: ID '=' expr
			{
			ID94=(Token)match(input,ID,FOLLOW_ID_in_paramAssignment908);  
			stream_ID.add(ID94);

			char_literal95=(Token)match(input,44,FOLLOW_44_in_paramAssignment910);  
			stream_44.add(char_literal95);

			pushFollow(FOLLOW_expr_in_paramAssignment912);
			expr96=expr();
			state._fsp--;

			stream_expr.add(expr96.getTree());
			// AST REWRITE
			// elements: expr, ID, 44
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 111:20: -> ^( '=' ID expr )
			{
				// ./examples/Dynbare.g:111:23: ^( '=' ID expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_44.nextNode(), root_1);
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
	// ./examples/Dynbare.g:113:1: varList : ( colspec )? ID ( ( ',' | '/' ) ID )* ;
	public final DynbareParser.varList_return varList() throws RecognitionException {
		DynbareParser.varList_return retval = new DynbareParser.varList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID98=null;
		Token set99=null;
		Token ID100=null;
		ParserRuleReturnScope colspec97 =null;

		Object ID98_tree=null;
		Object set99_tree=null;
		Object ID100_tree=null;

		try {
			// ./examples/Dynbare.g:114:3: ( ( colspec )? ID ( ( ',' | '/' ) ID )* )
			// ./examples/Dynbare.g:114:5: ( colspec )? ID ( ( ',' | '/' ) ID )*
			{
			root_0 = (Object)adaptor.nil();


			// ./examples/Dynbare.g:114:5: ( colspec )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==NUMBER) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// ./examples/Dynbare.g:114:5: colspec
					{
					pushFollow(FOLLOW_colspec_in_varList945);
					colspec97=colspec();
					state._fsp--;

					adaptor.addChild(root_0, colspec97.getTree());

					}
					break;

			}

			ID98=(Token)match(input,ID,FOLLOW_ID_in_varList948); 
			ID98_tree = (Object)adaptor.create(ID98);
			adaptor.addChild(root_0, ID98_tree);

			// ./examples/Dynbare.g:114:17: ( ( ',' | '/' ) ID )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==41||LA34_0==43) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// ./examples/Dynbare.g:114:18: ( ',' | '/' ) ID
					{
					set99=input.LT(1);
					if ( input.LA(1)==41||input.LA(1)==43 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set99));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ID100=(Token)match(input,ID,FOLLOW_ID_in_varList957); 
					ID100_tree = (Object)adaptor.create(ID100);
					adaptor.addChild(root_0, ID100_tree);

					}
					break;

				default :
					break loop34;
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
	// ./examples/Dynbare.g:116:1: drawInterval : '(' intervalStart ',' intervalStop ')' ;
	public final DynbareParser.drawInterval_return drawInterval() throws RecognitionException {
		DynbareParser.drawInterval_return retval = new DynbareParser.drawInterval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		Token char_literal103=null;
		Token char_literal105=null;
		ParserRuleReturnScope intervalStart102 =null;
		ParserRuleReturnScope intervalStop104 =null;

		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		Object char_literal105_tree=null;

		try {
			// ./examples/Dynbare.g:117:3: ( '(' intervalStart ',' intervalStop ')' )
			// ./examples/Dynbare.g:117:5: '(' intervalStart ',' intervalStop ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal101=(Token)match(input,37,FOLLOW_37_in_drawInterval972); 
			char_literal101_tree = (Object)adaptor.create(char_literal101);
			adaptor.addChild(root_0, char_literal101_tree);

			pushFollow(FOLLOW_intervalStart_in_drawInterval974);
			intervalStart102=intervalStart();
			state._fsp--;

			adaptor.addChild(root_0, intervalStart102.getTree());

			char_literal103=(Token)match(input,41,FOLLOW_41_in_drawInterval976); 
			char_literal103_tree = (Object)adaptor.create(char_literal103);
			adaptor.addChild(root_0, char_literal103_tree);

			pushFollow(FOLLOW_intervalStop_in_drawInterval978);
			intervalStop104=intervalStop();
			state._fsp--;

			adaptor.addChild(root_0, intervalStop104.getTree());

			char_literal105=(Token)match(input,38,FOLLOW_38_in_drawInterval980); 
			char_literal105_tree = (Object)adaptor.create(char_literal105);
			adaptor.addChild(root_0, char_literal105_tree);

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
	// ./examples/Dynbare.g:119:1: drawChar : ( '+' | '*' );
	public final DynbareParser.drawChar_return drawChar() throws RecognitionException {
		DynbareParser.drawChar_return retval = new DynbareParser.drawChar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set106=null;

		Object set106_tree=null;

		try {
			// ./examples/Dynbare.g:120:3: ( '+' | '*' )
			// ./examples/Dynbare.g:
			{
			root_0 = (Object)adaptor.nil();


			set106=input.LT(1);
			if ( (input.LA(1) >= 39 && input.LA(1) <= 40) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set106));
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
	// ./examples/Dynbare.g:123:1: intervalStart : NUMBER ;
	public final DynbareParser.intervalStart_return intervalStart() throws RecognitionException {
		DynbareParser.intervalStart_return retval = new DynbareParser.intervalStart_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER107=null;

		Object NUMBER107_tree=null;

		try {
			// ./examples/Dynbare.g:124:3: ( NUMBER )
			// ./examples/Dynbare.g:124:5: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER107=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_intervalStart1011); 
			NUMBER107_tree = (Object)adaptor.create(NUMBER107);
			adaptor.addChild(root_0, NUMBER107_tree);

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
	// ./examples/Dynbare.g:127:1: intervalStop : NUMBER ;
	public final DynbareParser.intervalStop_return intervalStop() throws RecognitionException {
		DynbareParser.intervalStop_return retval = new DynbareParser.intervalStop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER108=null;

		Object NUMBER108_tree=null;

		try {
			// ./examples/Dynbare.g:128:3: ( NUMBER )
			// ./examples/Dynbare.g:128:5: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER108=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_intervalStop1026); 
			NUMBER108_tree = (Object)adaptor.create(NUMBER108);
			adaptor.addChild(root_0, NUMBER108_tree);

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
	// ./examples/Dynbare.g:130:1: colspec : NUMBER ')' ;
	public final DynbareParser.colspec_return colspec() throws RecognitionException {
		DynbareParser.colspec_return retval = new DynbareParser.colspec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER109=null;
		Token char_literal110=null;

		Object NUMBER109_tree=null;
		Object char_literal110_tree=null;

		try {
			// ./examples/Dynbare.g:131:3: ( NUMBER ')' )
			// ./examples/Dynbare.g:131:5: NUMBER ')'
			{
			root_0 = (Object)adaptor.nil();


			NUMBER109=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_colspec1042); 
			NUMBER109_tree = (Object)adaptor.create(NUMBER109);
			adaptor.addChild(root_0, NUMBER109_tree);

			char_literal110=(Token)match(input,38,FOLLOW_38_in_colspec1044); 
			char_literal110_tree = (Object)adaptor.create(char_literal110);
			adaptor.addChild(root_0, char_literal110_tree);

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
	// ./examples/Dynbare.g:134:1: constDef : 'C' ( WS )+ id= ID '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) ;
	public final DynbareParser.constDef_return constDef() throws RecognitionException {
		DynbareParser.constDef_return retval = new DynbareParser.constDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;
		Token char_literal111=null;
		Token WS112=null;
		Token char_literal113=null;
		Token NEWLINE116=null;
		ParserRuleReturnScope eqn114 =null;
		ParserRuleReturnScope lineComment115 =null;

		Object id_tree=null;
		Object char_literal111_tree=null;
		Object WS112_tree=null;
		Object char_literal113_tree=null;
		Object NEWLINE116_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:135:2: ( 'C' ( WS )+ id= ID '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) )
			// ./examples/Dynbare.g:135:4: 'C' ( WS )+ id= ID '=' eqn ( lineComment )? NEWLINE
			{
			char_literal111=(Token)match(input,46,FOLLOW_46_in_constDef1059);  
			stream_46.add(char_literal111);

			// ./examples/Dynbare.g:135:8: ( WS )+
			int cnt35=0;
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// ./examples/Dynbare.g:135:8: WS
					{
					WS112=(Token)match(input,WS,FOLLOW_WS_in_constDef1061);  
					stream_WS.add(WS112);

					}
					break;

				default :
					if ( cnt35 >= 1 ) break loop35;
					EarlyExitException eee = new EarlyExitException(35, input);
					throw eee;
				}
				cnt35++;
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_constDef1066);  
			stream_ID.add(id);

			char_literal113=(Token)match(input,44,FOLLOW_44_in_constDef1068);  
			stream_44.add(char_literal113);

			pushFollow(FOLLOW_eqn_in_constDef1070);
			eqn114=eqn();
			state._fsp--;

			stream_eqn.add(eqn114.getTree());
			// ./examples/Dynbare.g:135:26: ( lineComment )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==WS) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// ./examples/Dynbare.g:135:26: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_constDef1072);
					lineComment115=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment115.getTree());
					}
					break;

			}

			NEWLINE116=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constDef1075);  
			stream_NEWLINE.add(NEWLINE116);

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
			// 135:47: -> ^( AUX ID eqn )
			{
				// ./examples/Dynbare.g:135:50: ^( AUX ID eqn )
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
	// ./examples/Dynbare.g:137:1: initDef : 'N' ( WS )+ ID '=' eqn ( lineComment )? NEWLINE -> ^( IVALUE ID eqn ) ;
	public final DynbareParser.initDef_return initDef() throws RecognitionException {
		DynbareParser.initDef_return retval = new DynbareParser.initDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal117=null;
		Token WS118=null;
		Token ID119=null;
		Token char_literal120=null;
		Token NEWLINE123=null;
		ParserRuleReturnScope eqn121 =null;
		ParserRuleReturnScope lineComment122 =null;

		Object char_literal117_tree=null;
		Object WS118_tree=null;
		Object ID119_tree=null;
		Object char_literal120_tree=null;
		Object NEWLINE123_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:138:2: ( 'N' ( WS )+ ID '=' eqn ( lineComment )? NEWLINE -> ^( IVALUE ID eqn ) )
			// ./examples/Dynbare.g:138:4: 'N' ( WS )+ ID '=' eqn ( lineComment )? NEWLINE
			{
			char_literal117=(Token)match(input,48,FOLLOW_48_in_initDef1096);  
			stream_48.add(char_literal117);

			// ./examples/Dynbare.g:138:8: ( WS )+
			int cnt37=0;
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==WS) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// ./examples/Dynbare.g:138:8: WS
					{
					WS118=(Token)match(input,WS,FOLLOW_WS_in_initDef1098);  
					stream_WS.add(WS118);

					}
					break;

				default :
					if ( cnt37 >= 1 ) break loop37;
					EarlyExitException eee = new EarlyExitException(37, input);
					throw eee;
				}
				cnt37++;
			}

			ID119=(Token)match(input,ID,FOLLOW_ID_in_initDef1101);  
			stream_ID.add(ID119);

			char_literal120=(Token)match(input,44,FOLLOW_44_in_initDef1103);  
			stream_44.add(char_literal120);

			pushFollow(FOLLOW_eqn_in_initDef1105);
			eqn121=eqn();
			state._fsp--;

			stream_eqn.add(eqn121.getTree());
			// ./examples/Dynbare.g:138:23: ( lineComment )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==WS) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// ./examples/Dynbare.g:138:23: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_initDef1107);
					lineComment122=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment122.getTree());
					}
					break;

			}

			NEWLINE123=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_initDef1110);  
			stream_NEWLINE.add(NEWLINE123);

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
			// 138:44: -> ^( IVALUE ID eqn )
			{
				// ./examples/Dynbare.g:138:47: ^( IVALUE ID eqn )
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
	// ./examples/Dynbare.g:141:1: auxDef : ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) );
	public final DynbareParser.auxDef_return auxDef() throws RecognitionException {
		DynbareParser.auxDef_return retval = new DynbareParser.auxDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal124=null;
		Token WS125=null;
		Token ID126=null;
		Token char_literal128=null;
		Token NEWLINE131=null;
		Token char_literal132=null;
		Token WS133=null;
		Token ID134=null;
		Token char_literal136=null;
		Token NEWLINE139=null;
		ParserRuleReturnScope timeExt127 =null;
		ParserRuleReturnScope tableFunction129 =null;
		ParserRuleReturnScope lineComment130 =null;
		ParserRuleReturnScope timeExt135 =null;
		ParserRuleReturnScope eqn137 =null;
		ParserRuleReturnScope lineComment138 =null;

		Object char_literal124_tree=null;
		Object WS125_tree=null;
		Object ID126_tree=null;
		Object char_literal128_tree=null;
		Object NEWLINE131_tree=null;
		Object char_literal132_tree=null;
		Object WS133_tree=null;
		Object ID134_tree=null;
		Object char_literal136_tree=null;
		Object NEWLINE139_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_tableFunction=new RewriteRuleSubtreeStream(adaptor,"rule tableFunction");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:142:2: ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) )
			int alt43=2;
			alt43 = dfa43.predict(input);
			switch (alt43) {
				case 1 :
					// ./examples/Dynbare.g:142:4: 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE
					{
					char_literal124=(Token)match(input,45,FOLLOW_45_in_auxDef1131);  
					stream_45.add(char_literal124);

					// ./examples/Dynbare.g:142:8: ( WS )+
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
							// ./examples/Dynbare.g:142:8: WS
							{
							WS125=(Token)match(input,WS,FOLLOW_WS_in_auxDef1133);  
							stream_WS.add(WS125);

							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					ID126=(Token)match(input,ID,FOLLOW_ID_in_auxDef1136);  
					stream_ID.add(ID126);

					pushFollow(FOLLOW_timeExt_in_auxDef1138);
					timeExt127=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt127.getTree());
					char_literal128=(Token)match(input,44,FOLLOW_44_in_auxDef1140);  
					stream_44.add(char_literal128);

					pushFollow(FOLLOW_tableFunction_in_auxDef1142);
					tableFunction129=tableFunction();
					state._fsp--;

					stream_tableFunction.add(tableFunction129.getTree());
					// ./examples/Dynbare.g:142:41: ( lineComment )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==WS) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// ./examples/Dynbare.g:142:41: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_auxDef1144);
							lineComment130=lineComment();
							state._fsp--;

							stream_lineComment.add(lineComment130.getTree());
							}
							break;

					}

					NEWLINE131=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef1147);  
					stream_NEWLINE.add(NEWLINE131);

					// AST REWRITE
					// elements: tableFunction, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:63: -> ^( TAUX ID tableFunction )
					{
						// ./examples/Dynbare.g:142:66: ^( TAUX ID tableFunction )
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
					// ./examples/Dynbare.g:143:4: 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE
					{
					char_literal132=(Token)match(input,45,FOLLOW_45_in_auxDef1164);  
					stream_45.add(char_literal132);

					// ./examples/Dynbare.g:143:8: ( WS )+
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
							// ./examples/Dynbare.g:143:8: WS
							{
							WS133=(Token)match(input,WS,FOLLOW_WS_in_auxDef1166);  
							stream_WS.add(WS133);

							}
							break;

						default :
							if ( cnt41 >= 1 ) break loop41;
							EarlyExitException eee = new EarlyExitException(41, input);
							throw eee;
						}
						cnt41++;
					}

					ID134=(Token)match(input,ID,FOLLOW_ID_in_auxDef1169);  
					stream_ID.add(ID134);

					pushFollow(FOLLOW_timeExt_in_auxDef1171);
					timeExt135=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt135.getTree());
					char_literal136=(Token)match(input,44,FOLLOW_44_in_auxDef1173);  
					stream_44.add(char_literal136);

					pushFollow(FOLLOW_eqn_in_auxDef1175);
					eqn137=eqn();
					state._fsp--;

					stream_eqn.add(eqn137.getTree());
					// ./examples/Dynbare.g:143:31: ( lineComment )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==WS) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// ./examples/Dynbare.g:143:31: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_auxDef1177);
							lineComment138=lineComment();
							state._fsp--;

							stream_lineComment.add(lineComment138.getTree());
							}
							break;

					}

					NEWLINE139=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef1180);  
					stream_NEWLINE.add(NEWLINE139);

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
					// 143:53: -> ^( AUX ID eqn )
					{
						// ./examples/Dynbare.g:143:56: ^( AUX ID eqn )
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
	// ./examples/Dynbare.g:146:1: tableFunction : expol= ( 'TABLE' | 'TABXT' | 'TABPL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')' -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step) ;
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
		Token char_literal140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token char_literal144=null;
		Token char_literal145=null;
		Token char_literal146=null;
		ParserRuleReturnScope timeExt142 =null;

		Object expol_tree=null;
		Object tName_tree=null;
		Object eqId_tree=null;
		Object xMin_tree=null;
		Object xMax_tree=null;
		Object step_tree=null;
		Object char_literal140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object char_literal144_tree=null;
		Object char_literal145_tree=null;
		Object char_literal146_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");

		try {
			// ./examples/Dynbare.g:147:3: (expol= ( 'TABLE' | 'TABXT' | 'TABPL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')' -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step) )
			// ./examples/Dynbare.g:147:5: expol= ( 'TABLE' | 'TABXT' | 'TABPL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')'
			{
			// ./examples/Dynbare.g:147:11: ( 'TABLE' | 'TABXT' | 'TABPL' )
			int alt44=3;
			switch ( input.LA(1) ) {
			case 52:
				{
				alt44=1;
				}
				break;
			case 54:
				{
				alt44=2;
				}
				break;
			case 53:
				{
				alt44=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// ./examples/Dynbare.g:147:12: 'TABLE'
					{
					expol=(Token)match(input,52,FOLLOW_52_in_tableFunction1208);  
					stream_52.add(expol);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:147:21: 'TABXT'
					{
					expol=(Token)match(input,54,FOLLOW_54_in_tableFunction1211);  
					stream_54.add(expol);

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:147:31: 'TABPL'
					{
					expol=(Token)match(input,53,FOLLOW_53_in_tableFunction1215);  
					stream_53.add(expol);

					}
					break;

			}

			char_literal140=(Token)match(input,37,FOLLOW_37_in_tableFunction1219);  
			stream_37.add(char_literal140);

			tName=(Token)match(input,ID,FOLLOW_ID_in_tableFunction1223);  
			stream_ID.add(tName);

			char_literal141=(Token)match(input,41,FOLLOW_41_in_tableFunction1225);  
			stream_41.add(char_literal141);

			eqId=(Token)match(input,ID,FOLLOW_ID_in_tableFunction1229);  
			stream_ID.add(eqId);

			// ./examples/Dynbare.g:147:66: ( timeExt )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==56) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// ./examples/Dynbare.g:147:66: timeExt
					{
					pushFollow(FOLLOW_timeExt_in_tableFunction1231);
					timeExt142=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt142.getTree());
					}
					break;

			}

			char_literal143=(Token)match(input,41,FOLLOW_41_in_tableFunction1234);  
			stream_41.add(char_literal143);

			xMin=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1238);  
			stream_NUMBER.add(xMin);

			char_literal144=(Token)match(input,41,FOLLOW_41_in_tableFunction1240);  
			stream_41.add(char_literal144);

			xMax=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1244);  
			stream_NUMBER.add(xMax);

			char_literal145=(Token)match(input,41,FOLLOW_41_in_tableFunction1246);  
			stream_41.add(char_literal145);

			step=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1250);  
			stream_NUMBER.add(step);

			char_literal146=(Token)match(input,38,FOLLOW_38_in_tableFunction1252);  
			stream_38.add(char_literal146);

			// AST REWRITE
			// elements: xMin, ID, xMax, expol, step, eqId, ID
			// token labels: expol, xMax, eqId, xMin, step
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_expol=new RewriteRuleTokenStream(adaptor,"token expol",expol);
			RewriteRuleTokenStream stream_xMax=new RewriteRuleTokenStream(adaptor,"token xMax",xMax);
			RewriteRuleTokenStream stream_eqId=new RewriteRuleTokenStream(adaptor,"token eqId",eqId);
			RewriteRuleTokenStream stream_xMin=new RewriteRuleTokenStream(adaptor,"token xMin",xMin);
			RewriteRuleTokenStream stream_step=new RewriteRuleTokenStream(adaptor,"token step",step);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 147:126: -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
			{
				// ./examples/Dynbare.g:147:129: ^( EQN $eqId)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQN, "EQN"), root_1);
				adaptor.addChild(root_1, stream_eqId.nextNode());
				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, (Object)adaptor.create(ID, (tName!=null?tName.getText():null)));
				// ./examples/Dynbare.g:147:158: ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
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
	// ./examples/Dynbare.g:151:1: rateDef : 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( RATE ID eqn ) ;
	public final DynbareParser.rateDef_return rateDef() throws RecognitionException {
		DynbareParser.rateDef_return retval = new DynbareParser.rateDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal147=null;
		Token WS148=null;
		Token ID149=null;
		Token char_literal151=null;
		Token NEWLINE154=null;
		ParserRuleReturnScope timeExt150 =null;
		ParserRuleReturnScope eqn152 =null;
		ParserRuleReturnScope lineComment153 =null;

		Object char_literal147_tree=null;
		Object WS148_tree=null;
		Object ID149_tree=null;
		Object char_literal151_tree=null;
		Object NEWLINE154_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:152:2: ( 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( RATE ID eqn ) )
			// ./examples/Dynbare.g:152:4: 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE
			{
			char_literal147=(Token)match(input,50,FOLLOW_50_in_rateDef1295);  
			stream_50.add(char_literal147);

			// ./examples/Dynbare.g:152:8: ( WS )+
			int cnt46=0;
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// ./examples/Dynbare.g:152:8: WS
					{
					WS148=(Token)match(input,WS,FOLLOW_WS_in_rateDef1297);  
					stream_WS.add(WS148);

					}
					break;

				default :
					if ( cnt46 >= 1 ) break loop46;
					EarlyExitException eee = new EarlyExitException(46, input);
					throw eee;
				}
				cnt46++;
			}

			ID149=(Token)match(input,ID,FOLLOW_ID_in_rateDef1300);  
			stream_ID.add(ID149);

			pushFollow(FOLLOW_timeExt_in_rateDef1303);
			timeExt150=timeExt();
			state._fsp--;

			stream_timeExt.add(timeExt150.getTree());
			char_literal151=(Token)match(input,44,FOLLOW_44_in_rateDef1305);  
			stream_44.add(char_literal151);

			pushFollow(FOLLOW_eqn_in_rateDef1307);
			eqn152=eqn();
			state._fsp--;

			stream_eqn.add(eqn152.getTree());
			// ./examples/Dynbare.g:152:32: ( lineComment )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==WS) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// ./examples/Dynbare.g:152:32: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_rateDef1309);
					lineComment153=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment153.getTree());
					}
					break;

			}

			NEWLINE154=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rateDef1312);  
			stream_NEWLINE.add(NEWLINE154);

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
			// 152:53: -> ^( RATE ID eqn )
			{
				// ./examples/Dynbare.g:152:56: ^( RATE ID eqn )
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
	// ./examples/Dynbare.g:155:1: lvlDef : 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( LEVEL ID eqn ) ;
	public final DynbareParser.lvlDef_return lvlDef() throws RecognitionException {
		DynbareParser.lvlDef_return retval = new DynbareParser.lvlDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal155=null;
		Token WS156=null;
		Token ID157=null;
		Token char_literal159=null;
		Token NEWLINE162=null;
		ParserRuleReturnScope timeExt158 =null;
		ParserRuleReturnScope eqn160 =null;
		ParserRuleReturnScope lineComment161 =null;

		Object char_literal155_tree=null;
		Object WS156_tree=null;
		Object ID157_tree=null;
		Object char_literal159_tree=null;
		Object NEWLINE162_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");

		try {
			// ./examples/Dynbare.g:156:2: ( 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( LEVEL ID eqn ) )
			// ./examples/Dynbare.g:156:4: 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE
			{
			char_literal155=(Token)match(input,47,FOLLOW_47_in_lvlDef1335);  
			stream_47.add(char_literal155);

			// ./examples/Dynbare.g:156:8: ( WS )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// ./examples/Dynbare.g:156:8: WS
					{
					WS156=(Token)match(input,WS,FOLLOW_WS_in_lvlDef1337);  
					stream_WS.add(WS156);

					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
			}

			ID157=(Token)match(input,ID,FOLLOW_ID_in_lvlDef1340);  
			stream_ID.add(ID157);

			pushFollow(FOLLOW_timeExt_in_lvlDef1342);
			timeExt158=timeExt();
			state._fsp--;

			stream_timeExt.add(timeExt158.getTree());
			char_literal159=(Token)match(input,44,FOLLOW_44_in_lvlDef1344);  
			stream_44.add(char_literal159);

			pushFollow(FOLLOW_eqn_in_lvlDef1346);
			eqn160=eqn();
			state._fsp--;

			stream_eqn.add(eqn160.getTree());
			// ./examples/Dynbare.g:156:31: ( lineComment )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==WS) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// ./examples/Dynbare.g:156:31: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_lvlDef1348);
					lineComment161=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment161.getTree());
					}
					break;

			}

			NEWLINE162=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_lvlDef1351);  
			stream_NEWLINE.add(NEWLINE162);

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
			// 156:52: -> ^( LEVEL ID eqn )
			{
				// ./examples/Dynbare.g:156:55: ^( LEVEL ID eqn )
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
	// ./examples/Dynbare.g:158:1: tblDef : 'T' ( WS )+ ID '=' rangeList ( lineComment )? NEWLINE -> ^( YCOORDS ID ^( PTS rangeList ) ) ;
	public final DynbareParser.tblDef_return tblDef() throws RecognitionException {
		DynbareParser.tblDef_return retval = new DynbareParser.tblDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal163=null;
		Token WS164=null;
		Token ID165=null;
		Token char_literal166=null;
		Token NEWLINE169=null;
		ParserRuleReturnScope rangeList167 =null;
		ParserRuleReturnScope lineComment168 =null;

		Object char_literal163_tree=null;
		Object WS164_tree=null;
		Object ID165_tree=null;
		Object char_literal166_tree=null;
		Object NEWLINE169_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_rangeList=new RewriteRuleSubtreeStream(adaptor,"rule rangeList");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// ./examples/Dynbare.g:159:2: ( 'T' ( WS )+ ID '=' rangeList ( lineComment )? NEWLINE -> ^( YCOORDS ID ^( PTS rangeList ) ) )
			// ./examples/Dynbare.g:159:4: 'T' ( WS )+ ID '=' rangeList ( lineComment )? NEWLINE
			{
			char_literal163=(Token)match(input,51,FOLLOW_51_in_tblDef1372);  
			stream_51.add(char_literal163);

			// ./examples/Dynbare.g:159:8: ( WS )+
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
					// ./examples/Dynbare.g:159:8: WS
					{
					WS164=(Token)match(input,WS,FOLLOW_WS_in_tblDef1374);  
					stream_WS.add(WS164);

					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
			}

			ID165=(Token)match(input,ID,FOLLOW_ID_in_tblDef1377);  
			stream_ID.add(ID165);

			char_literal166=(Token)match(input,44,FOLLOW_44_in_tblDef1379);  
			stream_44.add(char_literal166);

			pushFollow(FOLLOW_rangeList_in_tblDef1381);
			rangeList167=rangeList();
			state._fsp--;

			stream_rangeList.add(rangeList167.getTree());
			// ./examples/Dynbare.g:159:29: ( lineComment )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==WS) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// ./examples/Dynbare.g:159:29: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_tblDef1383);
					lineComment168=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment168.getTree());
					}
					break;

			}

			NEWLINE169=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_tblDef1386);  
			stream_NEWLINE.add(NEWLINE169);

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
			// 159:50: -> ^( YCOORDS ID ^( PTS rangeList ) )
			{
				// ./examples/Dynbare.g:159:53: ^( YCOORDS ID ^( PTS rangeList ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YCOORDS, "YCOORDS"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// ./examples/Dynbare.g:159:66: ^( PTS rangeList )
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
	// ./examples/Dynbare.g:162:1: comment : ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE );
	public final DynbareParser.comment_return comment() throws RecognitionException {
		DynbareParser.comment_return retval = new DynbareParser.comment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE170=null;
		Token NEWLINE172=null;
		Token NOTE173=null;
		Token WS174=null;
		Token NEWLINE175=null;
		ParserRuleReturnScope lineComment171 =null;

		Object NOTE170_tree=null;
		Object NEWLINE172_tree=null;
		Object NOTE173_tree=null;
		Object WS174_tree=null;
		Object NEWLINE175_tree=null;

		try {
			// ./examples/Dynbare.g:163:3: ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE )
			int alt54=2;
			alt54 = dfa54.predict(input);
			switch (alt54) {
				case 1 :
					// ./examples/Dynbare.g:163:5: NOTE ( lineComment )? NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					NOTE170=(Token)match(input,NOTE,FOLLOW_NOTE_in_comment1412); 
					NOTE170_tree = (Object)adaptor.create(NOTE170);
					adaptor.addChild(root_0, NOTE170_tree);

					// ./examples/Dynbare.g:163:10: ( lineComment )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WS) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// ./examples/Dynbare.g:163:10: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_comment1414);
							lineComment171=lineComment();
							state._fsp--;

							adaptor.addChild(root_0, lineComment171.getTree());

							}
							break;

					}

					NEWLINE172=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment1417); 
					NEWLINE172_tree = (Object)adaptor.create(NEWLINE172);
					adaptor.addChild(root_0, NEWLINE172_tree);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:164:9: NOTE ( WS )+ NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					NOTE173=(Token)match(input,NOTE,FOLLOW_NOTE_in_comment1427); 
					NOTE173_tree = (Object)adaptor.create(NOTE173);
					adaptor.addChild(root_0, NOTE173_tree);

					// ./examples/Dynbare.g:164:14: ( WS )+
					int cnt53=0;
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==WS) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// ./examples/Dynbare.g:164:14: WS
							{
							WS174=(Token)match(input,WS,FOLLOW_WS_in_comment1429); 
							WS174_tree = (Object)adaptor.create(WS174);
							adaptor.addChild(root_0, WS174_tree);

							}
							break;

						default :
							if ( cnt53 >= 1 ) break loop53;
							EarlyExitException eee = new EarlyExitException(53, input);
							throw eee;
						}
						cnt53++;
					}

					NEWLINE175=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment1432); 
					NEWLINE175_tree = (Object)adaptor.create(NEWLINE175);
					adaptor.addChild(root_0, NEWLINE175_tree);

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
	// ./examples/Dynbare.g:167:1: rangeList : NUMBER ( ( ',' | '/' ) NUMBER )* ;
	public final DynbareParser.rangeList_return rangeList() throws RecognitionException {
		DynbareParser.rangeList_return retval = new DynbareParser.rangeList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER176=null;
		Token set177=null;
		Token NUMBER178=null;

		Object NUMBER176_tree=null;
		Object set177_tree=null;
		Object NUMBER178_tree=null;

		try {
			// ./examples/Dynbare.g:168:2: ( NUMBER ( ( ',' | '/' ) NUMBER )* )
			// ./examples/Dynbare.g:168:5: NUMBER ( ( ',' | '/' ) NUMBER )*
			{
			root_0 = (Object)adaptor.nil();


			NUMBER176=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rangeList1446); 
			NUMBER176_tree = (Object)adaptor.create(NUMBER176);
			adaptor.addChild(root_0, NUMBER176_tree);

			// ./examples/Dynbare.g:168:12: ( ( ',' | '/' ) NUMBER )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==41||LA55_0==43) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// ./examples/Dynbare.g:168:13: ( ',' | '/' ) NUMBER
					{
					set177=input.LT(1);
					if ( input.LA(1)==41||input.LA(1)==43 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set177));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					NUMBER178=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rangeList1455); 
					NUMBER178_tree = (Object)adaptor.create(NUMBER178);
					adaptor.addChild(root_0, NUMBER178_tree);

					}
					break;

				default :
					break loop55;
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
	// $ANTLR end "rangeList"


	public static class eqn_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "eqn"
	// ./examples/Dynbare.g:171:1: eqn : expr -> ^( EQN expr ) ;
	public final DynbareParser.eqn_return eqn() throws RecognitionException {
		DynbareParser.eqn_return retval = new DynbareParser.eqn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr179 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// ./examples/Dynbare.g:172:2: ( expr -> ^( EQN expr ) )
			// ./examples/Dynbare.g:172:4: expr
			{
			pushFollow(FOLLOW_expr_in_eqn1468);
			expr179=expr();
			state._fsp--;

			stream_expr.add(expr179.getTree());
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
			// 172:9: -> ^( EQN expr )
			{
				// ./examples/Dynbare.g:172:12: ^( EQN expr )
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
	// ./examples/Dynbare.g:174:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final DynbareParser.expr_return expr() throws RecognitionException {
		DynbareParser.expr_return retval = new DynbareParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set181=null;
		ParserRuleReturnScope multExpr180 =null;
		ParserRuleReturnScope multExpr182 =null;

		Object set181_tree=null;

		try {
			// ./examples/Dynbare.g:175:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// ./examples/Dynbare.g:175:9: multExpr ( ( '+' | '-' ) multExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr1491);
			multExpr180=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr180.getTree());

			// ./examples/Dynbare.g:176:9: ( ( '+' | '-' ) multExpr )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==40||LA56_0==42) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// ./examples/Dynbare.g:176:13: ( '+' | '-' ) multExpr
					{
					set181=input.LT(1);
					if ( input.LA(1)==40||input.LA(1)==42 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set181));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr1512);
					multExpr182=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr182.getTree());

					}
					break;

				default :
					break loop56;
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
	// ./examples/Dynbare.g:179:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
	public final DynbareParser.multExpr_return multExpr() throws RecognitionException {
		DynbareParser.multExpr_return retval = new DynbareParser.multExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set184=null;
		ParserRuleReturnScope atom183 =null;
		ParserRuleReturnScope atom185 =null;

		Object set184_tree=null;

		try {
			// ./examples/Dynbare.g:180:5: ( atom ( ( '*' | '/' ) atom )* )
			// ./examples/Dynbare.g:180:9: atom ( ( '*' | '/' ) atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpr1536);
			atom183=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom183.getTree());

			// ./examples/Dynbare.g:180:14: ( ( '*' | '/' ) atom )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==43) ) {
					int LA57_2 = input.LA(2);
					if ( (LA57_2==ID) ) {
						int LA57_4 = input.LA(3);
						if ( (LA57_4==NEWLINE||LA57_4==WS||(LA57_4 >= 37 && LA57_4 <= 43)||LA57_4==56) ) {
							alt57=1;
						}

					}
					else if ( (LA57_2==NUMBER||LA57_2==37) ) {
						alt57=1;
					}

				}
				else if ( (LA57_0==39) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// ./examples/Dynbare.g:180:16: ( '*' | '/' ) atom
					{
					set184=input.LT(1);
					if ( input.LA(1)==39||input.LA(1)==43 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set184));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr1546);
					atom185=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom185.getTree());

					}
					break;

				default :
					break loop57;
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
	// ./examples/Dynbare.g:183:1: atom : ( NUMBER | ID ( timeExt )? -> ID | funcRef | '(' expr ')' );
	public final DynbareParser.atom_return atom() throws RecognitionException {
		DynbareParser.atom_return retval = new DynbareParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER186=null;
		Token ID187=null;
		Token char_literal190=null;
		Token char_literal192=null;
		ParserRuleReturnScope timeExt188 =null;
		ParserRuleReturnScope funcRef189 =null;
		ParserRuleReturnScope expr191 =null;

		Object NUMBER186_tree=null;
		Object ID187_tree=null;
		Object char_literal190_tree=null;
		Object char_literal192_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");

		try {
			// ./examples/Dynbare.g:184:5: ( NUMBER | ID ( timeExt )? -> ID | funcRef | '(' expr ')' )
			int alt59=4;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt59=1;
				}
				break;
			case ID:
				{
				int LA59_2 = input.LA(2);
				if ( (LA59_2==37) ) {
					alt59=3;
				}
				else if ( (LA59_2==NEWLINE||LA59_2==WS||(LA59_2 >= 38 && LA59_2 <= 43)||LA59_2==56) ) {
					alt59=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 37:
				{
				alt59=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// ./examples/Dynbare.g:184:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER186=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1570); 
					NUMBER186_tree = (Object)adaptor.create(NUMBER186);
					adaptor.addChild(root_0, NUMBER186_tree);

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:185:9: ID ( timeExt )?
					{
					ID187=(Token)match(input,ID,FOLLOW_ID_in_atom1581);  
					stream_ID.add(ID187);

					// ./examples/Dynbare.g:185:13: ( timeExt )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==56) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// ./examples/Dynbare.g:185:13: timeExt
							{
							pushFollow(FOLLOW_timeExt_in_atom1584);
							timeExt188=timeExt();
							state._fsp--;

							stream_timeExt.add(timeExt188.getTree());
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
					// 185:22: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// ./examples/Dynbare.g:186:9: funcRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funcRef_in_atom1599);
					funcRef189=funcRef();
					state._fsp--;

					adaptor.addChild(root_0, funcRef189.getTree());

					}
					break;
				case 4 :
					// ./examples/Dynbare.g:187:9: '(' expr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal190=(Token)match(input,37,FOLLOW_37_in_atom1609); 
					char_literal190_tree = (Object)adaptor.create(char_literal190);
					adaptor.addChild(root_0, char_literal190_tree);

					pushFollow(FOLLOW_expr_in_atom1611);
					expr191=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr191.getTree());

					char_literal192=(Token)match(input,38,FOLLOW_38_in_atom1613); 
					char_literal192_tree = (Object)adaptor.create(char_literal192);
					adaptor.addChild(root_0, char_literal192_tree);

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
	// ./examples/Dynbare.g:190:1: funcRef : ID '(' paramList ')' ;
	public final DynbareParser.funcRef_return funcRef() throws RecognitionException {
		DynbareParser.funcRef_return retval = new DynbareParser.funcRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID193=null;
		Token char_literal194=null;
		Token char_literal196=null;
		ParserRuleReturnScope paramList195 =null;

		Object ID193_tree=null;
		Object char_literal194_tree=null;
		Object char_literal196_tree=null;

		try {
			// ./examples/Dynbare.g:191:5: ( ID '(' paramList ')' )
			// ./examples/Dynbare.g:191:9: ID '(' paramList ')'
			{
			root_0 = (Object)adaptor.nil();


			ID193=(Token)match(input,ID,FOLLOW_ID_in_funcRef1638); 
			ID193_tree = (Object)adaptor.create(ID193);
			adaptor.addChild(root_0, ID193_tree);

			char_literal194=(Token)match(input,37,FOLLOW_37_in_funcRef1640); 
			char_literal194_tree = (Object)adaptor.create(char_literal194);
			adaptor.addChild(root_0, char_literal194_tree);

			pushFollow(FOLLOW_paramList_in_funcRef1642);
			paramList195=paramList();
			state._fsp--;

			adaptor.addChild(root_0, paramList195.getTree());

			char_literal196=(Token)match(input,38,FOLLOW_38_in_funcRef1644); 
			char_literal196_tree = (Object)adaptor.create(char_literal196);
			adaptor.addChild(root_0, char_literal196_tree);

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
	// ./examples/Dynbare.g:194:1: paramList : expr ( ',' expr )* ;
	public final DynbareParser.paramList_return paramList() throws RecognitionException {
		DynbareParser.paramList_return retval = new DynbareParser.paramList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal198=null;
		ParserRuleReturnScope expr197 =null;
		ParserRuleReturnScope expr199 =null;

		Object char_literal198_tree=null;

		try {
			// ./examples/Dynbare.g:195:2: ( expr ( ',' expr )* )
			// ./examples/Dynbare.g:195:7: expr ( ',' expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_paramList1667);
			expr197=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr197.getTree());

			// ./examples/Dynbare.g:195:12: ( ',' expr )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==41) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// ./examples/Dynbare.g:195:13: ',' expr
					{
					char_literal198=(Token)match(input,41,FOLLOW_41_in_paramList1670); 
					char_literal198_tree = (Object)adaptor.create(char_literal198);
					adaptor.addChild(root_0, char_literal198_tree);

					pushFollow(FOLLOW_expr_in_paramList1672);
					expr199=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr199.getTree());

					}
					break;

				default :
					break loop60;
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
	// ./examples/Dynbare.g:198:1: timeExt : '\\.' JKL ;
	public final DynbareParser.timeExt_return timeExt() throws RecognitionException {
		DynbareParser.timeExt_return retval = new DynbareParser.timeExt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal200=null;
		Token JKL201=null;

		Object char_literal200_tree=null;
		Object JKL201_tree=null;

		try {
			// ./examples/Dynbare.g:198:9: ( '\\.' JKL )
			// ./examples/Dynbare.g:198:11: '\\.' JKL
			{
			root_0 = (Object)adaptor.nil();


			char_literal200=(Token)match(input,56,FOLLOW_56_in_timeExt1686); 
			char_literal200_tree = (Object)adaptor.create(char_literal200);
			adaptor.addChild(root_0, char_literal200_tree);

			JKL201=(Token)match(input,JKL,FOLLOW_JKL_in_timeExt1688); 
			JKL201_tree = (Object)adaptor.create(JKL201);
			adaptor.addChild(root_0, JKL201_tree);

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
	// ./examples/Dynbare.g:201:1: lineComment : ( WS )+ commentText ;
	public final DynbareParser.lineComment_return lineComment() throws RecognitionException {
		DynbareParser.lineComment_return retval = new DynbareParser.lineComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS202=null;
		ParserRuleReturnScope commentText203 =null;

		Object WS202_tree=null;

		try {
			// ./examples/Dynbare.g:202:2: ( ( WS )+ commentText )
			// ./examples/Dynbare.g:202:4: ( WS )+ commentText
			{
			root_0 = (Object)adaptor.nil();


			// ./examples/Dynbare.g:202:4: ( WS )+
			int cnt61=0;
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==WS) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// ./examples/Dynbare.g:202:4: WS
					{
					WS202=(Token)match(input,WS,FOLLOW_WS_in_lineComment1701); 
					WS202_tree = (Object)adaptor.create(WS202);
					adaptor.addChild(root_0, WS202_tree);

					}
					break;

				default :
					if ( cnt61 >= 1 ) break loop61;
					EarlyExitException eee = new EarlyExitException(61, input);
					throw eee;
				}
				cnt61++;
			}

			pushFollow(FOLLOW_commentText_in_lineComment1704);
			commentText203=commentText();
			state._fsp--;

			adaptor.addChild(root_0, commentText203.getTree());

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
	// ./examples/Dynbare.g:205:1: commentText : (~ ( WS | NEWLINE ) (~ NEWLINE )* ) ;
	public final DynbareParser.commentText_return commentText() throws RecognitionException {
		DynbareParser.commentText_return retval = new DynbareParser.commentText_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set204=null;
		Token set205=null;

		Object set204_tree=null;
		Object set205_tree=null;

		try {
			// ./examples/Dynbare.g:206:3: ( (~ ( WS | NEWLINE ) (~ NEWLINE )* ) )
			// ./examples/Dynbare.g:206:5: (~ ( WS | NEWLINE ) (~ NEWLINE )* )
			{
			root_0 = (Object)adaptor.nil();


			// ./examples/Dynbare.g:206:5: (~ ( WS | NEWLINE ) (~ NEWLINE )* )
			// ./examples/Dynbare.g:206:6: ~ ( WS | NEWLINE ) (~ NEWLINE )*
			{
			set204=input.LT(1);
			if ( (input.LA(1) >= AUX && input.LA(1) <= MODULE)||(input.LA(1) >= NOTE && input.LA(1) <= VARIABLES)||(input.LA(1) >= XCOORDS && input.LA(1) <= 57) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set204));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// ./examples/Dynbare.g:206:19: (~ NEWLINE )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( ((LA62_0 >= AUX && LA62_0 <= MODULE)||(LA62_0 >= NOTE && LA62_0 <= 57)) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// ./examples/Dynbare.g:
					{
					set205=input.LT(1);
					if ( (input.LA(1) >= AUX && input.LA(1) <= MODULE)||(input.LA(1) >= NOTE && input.LA(1) <= 57) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set205));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop62;
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


	protected DFA43 dfa43 = new DFA43(this);
	protected DFA54 dfa54 = new DFA54(this);
	static final String DFA43_eotS =
		"\11\uffff";
	static final String DFA43_eofS =
		"\11\uffff";
	static final String DFA43_minS =
		"\1\55\1\42\1\12\1\70\1\15\1\54\1\12\2\uffff";
	static final String DFA43_maxS =
		"\1\55\2\42\1\70\1\15\1\54\1\66\2\uffff";
	static final String DFA43_acceptS =
		"\7\uffff\1\1\1\2";
	static final String DFA43_specialS =
		"\11\uffff}>";
	static final String[] DFA43_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\27\uffff\1\2",
			"\1\4",
			"\1\5",
			"\1\6",
			"\1\10\14\uffff\1\10\15\uffff\1\10\16\uffff\3\7",
			"",
			""
	};

	static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
	static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
	static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
	static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
	static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
	static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
	static final short[][] DFA43_transition;

	static {
		int numStates = DFA43_transitionS.length;
		DFA43_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
		}
	}

	protected class DFA43 extends DFA {

		public DFA43(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 43;
			this.eot = DFA43_eot;
			this.eof = DFA43_eof;
			this.min = DFA43_min;
			this.max = DFA43_max;
			this.accept = DFA43_accept;
			this.special = DFA43_special;
			this.transition = DFA43_transition;
		}
		@Override
		public String getDescription() {
			return "141:1: auxDef : ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? NEWLINE -> ^( AUX ID eqn ) );";
		}
	}

	static final String DFA54_eotS =
		"\5\uffff";
	static final String DFA54_eofS =
		"\5\uffff";
	static final String DFA54_minS =
		"\1\26\1\25\1\4\2\uffff";
	static final String DFA54_maxS =
		"\1\26\1\42\1\71\2\uffff";
	static final String DFA54_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA54_specialS =
		"\5\uffff}>";
	static final String[] DFA54_transitionS = {
			"\1\1",
			"\1\3\14\uffff\1\2",
			"\21\3\1\4\14\3\1\2\27\3",
			"",
			""
	};

	static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
	static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
	static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
	static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
	static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
	static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
	static final short[][] DFA54_transition;

	static {
		int numStates = DFA54_transitionS.length;
		DFA54_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
		}
	}

	protected class DFA54 extends DFA {

		public DFA54(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 54;
			this.eot = DFA54_eot;
			this.eof = DFA54_eof;
			this.min = DFA54_min;
			this.max = DFA54_max;
			this.accept = DFA54_accept;
			this.special = DFA54_special;
			this.transition = DFA54_transition;
		}
		@Override
		public String getDescription() {
			return "162:1: comment : ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE );";
		}
	}

	public static final BitSet FOLLOW_macroDef_in_prog146 = new BitSet(new long[]{0x000DE00000610002L});
	public static final BitSet FOLLOW_defaultModule_in_prog149 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_namedModule_in_prog152 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_controlModule_in_prog155 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NEWLINE_in_prog158 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_controlSector_in_controlModule198 = new BitSet(new long[]{0x00000000A6400000L});
	public static final BitSet FOLLOW_controlStat_in_controlModule201 = new BitSet(new long[]{0x00000000A6400002L});
	public static final BitSet FOLLOW_comment_in_controlModule205 = new BitSet(new long[]{0x00000000A6400002L});
	public static final BitSet FOLLOW_simSpec_in_controlStat257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_runSpec_in_controlStat268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_viewSpec_in_controlStat280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_defaultModule301 = new BitSet(new long[]{0x000DE00000400002L});
	public static final BitSet FOLLOW_comment_in_defaultModule305 = new BitSet(new long[]{0x000DE00000400002L});
	public static final BitSet FOLLOW_sector_in_namedModule345 = new BitSet(new long[]{0x000DE00000400000L});
	public static final BitSet FOLLOW_definition_in_namedModule348 = new BitSet(new long[]{0x000DE00000400002L});
	public static final BitSet FOLLOW_comment_in_namedModule352 = new BitSet(new long[]{0x000DE00000400002L});
	public static final BitSet FOLLOW_auxDef_in_definition396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvlDef_in_definition406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initDef_in_definition416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDef_in_definition424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rateDef_in_definition435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tblDef_in_definition446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_sector465 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_sector467 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_sector469 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_sector471 = new BitSet(new long[]{0x0080000400000000L});
	public static final BitSet FOLLOW_55_in_sector474 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_SECTOR_in_sector477 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_sector479 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_sector481 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_sector484 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_sector486 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_sector490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_controlSector508 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_controlSector510 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_controlSector512 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_controlSector514 = new BitSet(new long[]{0x0080000400000000L});
	public static final BitSet FOLLOW_55_in_controlSector517 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_SECTOR_in_controlSector520 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_controlSector522 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_controlSector524 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_controlSector526 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_controlSector528 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_controlSector532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLOT_in_viewSpec562 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_viewSpec564 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_graphAssign_in_viewSpec567 = new BitSet(new long[]{0x00000A0000200000L});
	public static final BitSet FOLLOW_set_in_viewSpec570 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_graphAssign_in_viewSpec576 = new BitSet(new long[]{0x00000A0000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_viewSpec580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_viewSpec592 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_viewSpec594 = new BitSet(new long[]{0x0000000400800400L});
	public static final BitSet FOLLOW_varList_in_viewSpec597 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_viewSpec599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUN_in_runSpec627 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_runSpec629 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_runSpec632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_in_simSpec656 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_simSpec658 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_paramAssignment_in_simSpec660 = new BitSet(new long[]{0x00000A0000200000L});
	public static final BitSet FOLLOW_41_in_simSpec664 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_43_in_simSpec666 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_paramAssignment_in_simSpec669 = new BitSet(new long[]{0x00000A0000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_simSpec673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroStart_in_macroDef703 = new BitSet(new long[]{0x000DE00000400800L});
	public static final BitSet FOLLOW_intrnlStmt_in_macroDef705 = new BitSet(new long[]{0x000DE00000400800L});
	public static final BitSet FOLLOW_definition_in_macroDef709 = new BitSet(new long[]{0x000DE00000440000L});
	public static final BitSet FOLLOW_comment_in_macroDef713 = new BitSet(new long[]{0x000DE00000440000L});
	public static final BitSet FOLLOW_macroEnd_in_macroDef718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MACRO_in_macroStart750 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_macroStart752 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_macroStart755 = new BitSet(new long[]{0x0000002400200000L});
	public static final BitSet FOLLOW_37_in_macroStart758 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_formalParams_in_macroStart760 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_macroStart761 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_WS_in_macroStart766 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_NEWLINE_in_macroStart769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTRN_in_intrnlStmt789 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_intrnlStmt791 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_intrnlStmt794 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_41_in_intrnlStmt797 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_intrnlStmt799 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_intrnlStmt803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEND_in_macroEnd827 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_WS_in_macroEnd830 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_NEWLINE_in_macroEnd833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_formalParams852 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_formalParams855 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_formalParams857 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ID_in_graphAssign880 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_graphAssign883 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_drawChar_in_graphAssign885 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_drawInterval_in_graphAssign887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramAssignment908 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_paramAssignment910 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_expr_in_paramAssignment912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_colspec_in_varList945 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_varList948 = new BitSet(new long[]{0x00000A0000000002L});
	public static final BitSet FOLLOW_set_in_varList951 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_varList957 = new BitSet(new long[]{0x00000A0000000002L});
	public static final BitSet FOLLOW_37_in_drawInterval972 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_intervalStart_in_drawInterval974 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_drawInterval976 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_intervalStop_in_drawInterval978 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_drawInterval980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_intervalStart1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_intervalStop1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_colspec1042 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_colspec1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_constDef1059 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_constDef1061 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_constDef1066 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_constDef1068 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_eqn_in_constDef1070 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_constDef1072 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_constDef1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_initDef1096 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_initDef1098 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_initDef1101 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_initDef1103 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_eqn_in_initDef1105 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_initDef1107 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_initDef1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_auxDef1131 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_auxDef1133 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_auxDef1136 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_timeExt_in_auxDef1138 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_auxDef1140 = new BitSet(new long[]{0x0070000000000000L});
	public static final BitSet FOLLOW_tableFunction_in_auxDef1142 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_auxDef1144 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_auxDef1164 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_auxDef1166 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_auxDef1169 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_timeExt_in_auxDef1171 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_auxDef1173 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_eqn_in_auxDef1175 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_auxDef1177 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_tableFunction1208 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_54_in_tableFunction1211 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_53_in_tableFunction1215 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_tableFunction1219 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_tableFunction1223 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_tableFunction1225 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_tableFunction1229 = new BitSet(new long[]{0x0100020000000000L});
	public static final BitSet FOLLOW_timeExt_in_tableFunction1231 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_tableFunction1234 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1238 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_tableFunction1240 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1244 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_tableFunction1246 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1250 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_tableFunction1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_rateDef1295 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_rateDef1297 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_rateDef1300 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_timeExt_in_rateDef1303 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_rateDef1305 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_eqn_in_rateDef1307 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_rateDef1309 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_rateDef1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_lvlDef1335 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_lvlDef1337 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_lvlDef1340 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_timeExt_in_lvlDef1342 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_lvlDef1344 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_eqn_in_lvlDef1346 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_lvlDef1348 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_lvlDef1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_tblDef1372 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_tblDef1374 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_ID_in_tblDef1377 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_tblDef1379 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rangeList_in_tblDef1381 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_tblDef1383 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_tblDef1386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment1412 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_lineComment_in_comment1414 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWLINE_in_comment1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment1427 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_WS_in_comment1429 = new BitSet(new long[]{0x0000000400200000L});
	public static final BitSet FOLLOW_NEWLINE_in_comment1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_rangeList1446 = new BitSet(new long[]{0x00000A0000000002L});
	public static final BitSet FOLLOW_set_in_rangeList1449 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMBER_in_rangeList1455 = new BitSet(new long[]{0x00000A0000000002L});
	public static final BitSet FOLLOW_expr_in_eqn1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr1491 = new BitSet(new long[]{0x0000050000000002L});
	public static final BitSet FOLLOW_set_in_expr1506 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_multExpr_in_expr1512 = new BitSet(new long[]{0x0000050000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr1536 = new BitSet(new long[]{0x0000088000000002L});
	public static final BitSet FOLLOW_set_in_multExpr1540 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_atom_in_multExpr1546 = new BitSet(new long[]{0x0000088000000002L});
	public static final BitSet FOLLOW_NUMBER_in_atom1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1581 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_timeExt_in_atom1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcRef_in_atom1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_atom1609 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_expr_in_atom1611 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_atom1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_funcRef1638 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_funcRef1640 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_paramList_in_funcRef1642 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_funcRef1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_paramList1667 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_paramList1670 = new BitSet(new long[]{0x0000002000800400L});
	public static final BitSet FOLLOW_expr_in_paramList1672 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_56_in_timeExt1686 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JKL_in_timeExt1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_lineComment1701 = new BitSet(new long[]{0x03FFFFFFFFDFFFF0L});
	public static final BitSet FOLLOW_commentText_in_lineComment1704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_commentText1718 = new BitSet(new long[]{0x03FFFFFFFFDFFFF2L});
}
