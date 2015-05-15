// $ANTLR 3.5.2 C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g 2015-05-11 17:45:16

package org.sdxchange.dynamo.parser;
import java.util.HashMap;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DynamoParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUX", "COMMENT", "CONST", "CONTROL", 
		"CSECTOR", "DOCUMENT", "EQN", "FORMAL_PARAMS", "ID", "INTRN", "IVALUE", 
		"JKL", "LEVEL", "LOCALS", "MACRO", "MACRODEF", "MEND", "MODEL", "MODULE", 
		"NEWLINE", "NOTE", "NUMBER", "PARAMS", "PAUX", "PLOT", "PLOTVAR", "PLOTVLIST", 
		"PRINT", "PSECTOR", "PTS", "RATE", "RUN", "SCALE", "SECTOR", "SPEC", "TAUX", 
		"UNARYMINUS", "UNARYPLUS", "VARIABLES", "VIEW", "WS", "XCOORDS", "YCOORDS", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'A'", "'C'", 
		"'L'", "'N'", "'R'", "'T'", "'TABHL'", "'TABLE'", "'TABPL'", "'TABXT'", 
		"'['", "'\\.'", "']'"
	};
	public static final int EOF=-1;
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
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int AUX=4;
	public static final int COMMENT=5;
	public static final int CONST=6;
	public static final int CONTROL=7;
	public static final int CSECTOR=8;
	public static final int DOCUMENT=9;
	public static final int EQN=10;
	public static final int FORMAL_PARAMS=11;
	public static final int ID=12;
	public static final int INTRN=13;
	public static final int IVALUE=14;
	public static final int JKL=15;
	public static final int LEVEL=16;
	public static final int LOCALS=17;
	public static final int MACRO=18;
	public static final int MACRODEF=19;
	public static final int MEND=20;
	public static final int MODEL=21;
	public static final int MODULE=22;
	public static final int NEWLINE=23;
	public static final int NOTE=24;
	public static final int NUMBER=25;
	public static final int PARAMS=26;
	public static final int PAUX=27;
	public static final int PLOT=28;
	public static final int PLOTVAR=29;
	public static final int PLOTVLIST=30;
	public static final int PRINT=31;
	public static final int PSECTOR=32;
	public static final int PTS=33;
	public static final int RATE=34;
	public static final int RUN=35;
	public static final int SCALE=36;
	public static final int SECTOR=37;
	public static final int SPEC=38;
	public static final int TAUX=39;
	public static final int UNARYMINUS=40;
	public static final int UNARYPLUS=41;
	public static final int VARIABLES=42;
	public static final int VIEW=43;
	public static final int WS=44;
	public static final int XCOORDS=45;
	public static final int YCOORDS=46;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DynamoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DynamoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DynamoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:49:1: prog : ( macroDef )* ( defaultModule )? ( namedModule )* ( controlSector ( controlStat | comment )+ ( viewSpec )* )? ( NEWLINE )* -> ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* ) ;
	public final DynamoParser.prog_return prog() throws RecognitionException {
		DynamoParser.prog_return retval = new DynamoParser.prog_return();
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
		RewriteRuleSubtreeStream stream_controlStat=new RewriteRuleSubtreeStream(adaptor,"rule controlStat");
		RewriteRuleSubtreeStream stream_viewSpec=new RewriteRuleSubtreeStream(adaptor,"rule viewSpec");
		RewriteRuleSubtreeStream stream_namedModule=new RewriteRuleSubtreeStream(adaptor,"rule namedModule");
		RewriteRuleSubtreeStream stream_controlSector=new RewriteRuleSubtreeStream(adaptor,"rule controlSector");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
		RewriteRuleSubtreeStream stream_defaultModule=new RewriteRuleSubtreeStream(adaptor,"rule defaultModule");
		RewriteRuleSubtreeStream stream_macroDef=new RewriteRuleSubtreeStream(adaptor,"rule macroDef");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:2: ( ( macroDef )* ( defaultModule )? ( namedModule )* ( controlSector ( controlStat | comment )+ ( viewSpec )* )? ( NEWLINE )* -> ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:4: ( macroDef )* ( defaultModule )? ( namedModule )* ( controlSector ( controlStat | comment )+ ( viewSpec )* )? ( NEWLINE )*
			{
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:4: ( macroDef )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MACRO) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:4: macroDef
					{
					pushFollow(FOLLOW_macroDef_in_prog190);
					macroDef1=macroDef();
					state._fsp--;

					stream_macroDef.add(macroDef1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:14: ( defaultModule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NOTE||(LA2_0 >= 55 && LA2_0 <= 60)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:14: defaultModule
					{
					pushFollow(FOLLOW_defaultModule_in_prog193);
					defaultModule2=defaultModule();
					state._fsp--;

					stream_defaultModule.add(defaultModule2.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:29: ( namedModule )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==PSECTOR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:29: namedModule
					{
					pushFollow(FOLLOW_namedModule_in_prog196);
					namedModule3=namedModule();
					state._fsp--;

					stream_namedModule.add(namedModule3.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:42: ( controlSector ( controlStat | comment )+ ( viewSpec )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==CSECTOR) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:43: controlSector ( controlStat | comment )+ ( viewSpec )*
					{
					pushFollow(FOLLOW_controlSector_in_prog200);
					controlSector4=controlSector();
					state._fsp--;

					stream_controlSector.add(controlSector4.getTree());
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:57: ( controlStat | comment )+
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
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:58: controlStat
							{
							pushFollow(FOLLOW_controlStat_in_prog203);
							controlStat5=controlStat();
							state._fsp--;

							stream_controlStat.add(controlStat5.getTree());
							}
							break;
						case 2 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:72: comment
							{
							pushFollow(FOLLOW_comment_in_prog207);
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

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:83: ( viewSpec )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==PLOT||LA5_0==PRINT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:83: viewSpec
							{
							pushFollow(FOLLOW_viewSpec_in_prog212);
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

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:95: ( NEWLINE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==NEWLINE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:95: NEWLINE
					{
					NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog217);  
					stream_NEWLINE.add(NEWLINE8);

					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: controlStat, namedModule, viewSpec, macroDef, defaultModule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 50:104: -> ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:107: ^( DOCUMENT ^( CONTROL ( controlStat )* ) ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* ) ( macroDef )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOCUMENT, "DOCUMENT"), root_1);
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:118: ^( CONTROL ( controlStat )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_2);
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:128: ( controlStat )*
				while ( stream_controlStat.hasNext() ) {
					adaptor.addChild(root_2, stream_controlStat.nextTree());
				}
				stream_controlStat.reset();

				adaptor.addChild(root_1, root_2);
				}

				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:142: ^( MODEL ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )? ( namedModule )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODEL, "MODEL"), root_2);
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:150: ( defaultModule ( ^( VIEW ( viewSpec )* ) )? )?
				if ( stream_defaultModule.hasNext() ) {
					adaptor.addChild(root_2, stream_defaultModule.nextTree());
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:165: ( ^( VIEW ( viewSpec )* ) )?
					if ( stream_viewSpec.hasNext() ) {
						// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:165: ^( VIEW ( viewSpec )* )
						{
						Object root_3 = (Object)adaptor.nil();
						root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(VIEW, "VIEW"), root_3);
						// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:172: ( viewSpec )*
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

				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:186: ( namedModule )*
				while ( stream_namedModule.hasNext() ) {
					adaptor.addChild(root_2, stream_namedModule.nextTree());
				}
				stream_namedModule.reset();

				adaptor.addChild(root_1, root_2);
				}

				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:50:201: ( macroDef )*
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:53:1: controlModule : controlSector ( controlStat | comment )+ ( viewSpec )* -> ^( CONTROL ( controlStat )+ ) ^( VIEW ( viewSpec )* ) ;
	public final DynamoParser.controlModule_return controlModule() throws RecognitionException {
		DynamoParser.controlModule_return retval = new DynamoParser.controlModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope controlSector9 =null;
		ParserRuleReturnScope controlStat10 =null;
		ParserRuleReturnScope comment11 =null;
		ParserRuleReturnScope viewSpec12 =null;

		RewriteRuleSubtreeStream stream_controlStat=new RewriteRuleSubtreeStream(adaptor,"rule controlStat");
		RewriteRuleSubtreeStream stream_viewSpec=new RewriteRuleSubtreeStream(adaptor,"rule viewSpec");
		RewriteRuleSubtreeStream stream_controlSector=new RewriteRuleSubtreeStream(adaptor,"rule controlSector");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:3: ( controlSector ( controlStat | comment )+ ( viewSpec )* -> ^( CONTROL ( controlStat )+ ) ^( VIEW ( viewSpec )* ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:5: controlSector ( controlStat | comment )+ ( viewSpec )*
			{
			pushFollow(FOLLOW_controlSector_in_controlModule271);
			controlSector9=controlSector();
			state._fsp--;

			stream_controlSector.add(controlSector9.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:19: ( controlStat | comment )+
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:20: controlStat
					{
					pushFollow(FOLLOW_controlStat_in_controlModule274);
					controlStat10=controlStat();
					state._fsp--;

					stream_controlStat.add(controlStat10.getTree());
					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:34: comment
					{
					pushFollow(FOLLOW_comment_in_controlModule278);
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

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:45: ( viewSpec )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==PLOT||LA9_0==PRINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:45: viewSpec
					{
					pushFollow(FOLLOW_viewSpec_in_controlModule283);
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
			// elements: controlStat, viewSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 54:54: -> ^( CONTROL ( controlStat )+ ) ^( VIEW ( viewSpec )* )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:57: ^( CONTROL ( controlStat )+ )
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

				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:82: ^( VIEW ( viewSpec )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VIEW, "VIEW"), root_1);
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:54:89: ( viewSpec )*
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:57:1: controlStat : ( simSpec | runSpec ->);
	public final DynamoParser.controlStat_return controlStat() throws RecognitionException {
		DynamoParser.controlStat_return retval = new DynamoParser.controlStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simSpec13 =null;
		ParserRuleReturnScope runSpec14 =null;

		RewriteRuleSubtreeStream stream_runSpec=new RewriteRuleSubtreeStream(adaptor,"rule runSpec");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:58:5: ( simSpec | runSpec ->)
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:58:7: simSpec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simSpec_in_controlStat339);
					simSpec13=simSpec();
					state._fsp--;

					adaptor.addChild(root_0, simSpec13.getTree());

					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:59:9: runSpec
					{
					pushFollow(FOLLOW_runSpec_in_controlStat350);
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
					// 59:17: ->
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:62:1: defaultModule : ( definition | comment )+ -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) ) ;
	public final DynamoParser.defaultModule_return defaultModule() throws RecognitionException {
		DynamoParser.defaultModule_return retval = new DynamoParser.defaultModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition15 =null;
		ParserRuleReturnScope comment16 =null;

		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:2: ( ( definition | comment )+ -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:4: ( definition | comment )+
			{
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:4: ( definition | comment )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 55 && LA11_0 <= 60)) ) {
					alt11=1;
				}
				else if ( (LA11_0==NOTE) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:5: definition
					{
					pushFollow(FOLLOW_definition_in_defaultModule375);
					definition15=definition();
					state._fsp--;

					stream_definition.add(definition15.getTree());
					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:18: comment
					{
					pushFollow(FOLLOW_comment_in_defaultModule379);
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
			// 63:28: -> ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:31: ^( MODULE ID[\"default\"] ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);
				adaptor.addChild(root_1, (Object)adaptor.create(ID, "default"));
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:63:54: ^( VARIABLES ( definition )+ )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:66:1: namedModule : sector ( definition | comment )+ -> ^( MODULE sector ^( VARIABLES ( definition )+ ) ) ;
	public final DynamoParser.namedModule_return namedModule() throws RecognitionException {
		DynamoParser.namedModule_return retval = new DynamoParser.namedModule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sector17 =null;
		ParserRuleReturnScope definition18 =null;
		ParserRuleReturnScope comment19 =null;

		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
		RewriteRuleSubtreeStream stream_sector=new RewriteRuleSubtreeStream(adaptor,"rule sector");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:6: ( sector ( definition | comment )+ -> ^( MODULE sector ^( VARIABLES ( definition )+ ) ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:8: sector ( definition | comment )+
			{
			pushFollow(FOLLOW_sector_in_namedModule420);
			sector17=sector();
			state._fsp--;

			stream_sector.add(sector17.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:15: ( definition | comment )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 55 && LA12_0 <= 60)) ) {
					alt12=1;
				}
				else if ( (LA12_0==NOTE) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:16: definition
					{
					pushFollow(FOLLOW_definition_in_namedModule423);
					definition18=definition();
					state._fsp--;

					stream_definition.add(definition18.getTree());
					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:29: comment
					{
					pushFollow(FOLLOW_comment_in_namedModule427);
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
			// elements: definition, sector
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:39: -> ^( MODULE sector ^( VARIABLES ( definition )+ ) )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:42: ^( MODULE sector ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);
				adaptor.addChild(root_1, stream_sector.nextTree());
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:67:58: ^( VARIABLES ( definition )+ )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:70:1: definition : ( auxDef | lvlDef | initDef | constDef | rateDef | tblDef );
	public final DynamoParser.definition_return definition() throws RecognitionException {
		DynamoParser.definition_return retval = new DynamoParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope auxDef20 =null;
		ParserRuleReturnScope lvlDef21 =null;
		ParserRuleReturnScope initDef22 =null;
		ParserRuleReturnScope constDef23 =null;
		ParserRuleReturnScope rateDef24 =null;
		ParserRuleReturnScope tblDef25 =null;


		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:71:5: ( auxDef | lvlDef | initDef | constDef | rateDef | tblDef )
			int alt13=6;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt13=1;
				}
				break;
			case 57:
				{
				alt13=2;
				}
				break;
			case 58:
				{
				alt13=3;
				}
				break;
			case 56:
				{
				alt13=4;
				}
				break;
			case 59:
				{
				alt13=5;
				}
				break;
			case 60:
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:71:7: auxDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_auxDef_in_definition472);
					auxDef20=auxDef();
					state._fsp--;

					adaptor.addChild(root_0, auxDef20.getTree());

					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:72:9: lvlDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvlDef_in_definition482);
					lvlDef21=lvlDef();
					state._fsp--;

					adaptor.addChild(root_0, lvlDef21.getTree());

					}
					break;
				case 3 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:73:9: initDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_initDef_in_definition492);
					initDef22=initDef();
					state._fsp--;

					adaptor.addChild(root_0, initDef22.getTree());

					}
					break;
				case 4 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:74:7: constDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDef_in_definition500);
					constDef23=constDef();
					state._fsp--;

					adaptor.addChild(root_0, constDef23.getTree());

					}
					break;
				case 5 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:75:9: rateDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_rateDef_in_definition511);
					rateDef24=rateDef();
					state._fsp--;

					adaptor.addChild(root_0, rateDef24.getTree());

					}
					break;
				case 6 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:76:9: tblDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tblDef_in_definition522);
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


	public static class comment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comment"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:79:1: comment :{...}? NOTE ( COMMENT )? NEWLINE ->;
	public final DynamoParser.comment_return comment() throws RecognitionException {
		DynamoParser.comment_return retval = new DynamoParser.comment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTE26=null;
		Token COMMENT27=null;
		Token NEWLINE28=null;

		Object NOTE26_tree=null;
		Object COMMENT27_tree=null;
		Object NEWLINE28_tree=null;
		RewriteRuleTokenStream stream_NOTE=new RewriteRuleTokenStream(adaptor,"token NOTE");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_COMMENT=new RewriteRuleTokenStream(adaptor,"token COMMENT");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:80:5: ({...}? NOTE ( COMMENT )? NEWLINE ->)
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:80:8: {...}? NOTE ( COMMENT )? NEWLINE
			{
			if ( !((input.LT(1).getText().contentEquals("NOTE"))) ) {
				throw new FailedPredicateException(input, "comment", "input.LT(1).getText().contentEquals(\"NOTE\")");
			}
			NOTE26=(Token)match(input,NOTE,FOLLOW_NOTE_in_comment544);  
			stream_NOTE.add(NOTE26);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:80:60: ( COMMENT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==COMMENT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:80:60: COMMENT
					{
					COMMENT27=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment546);  
					stream_COMMENT.add(COMMENT27);

					}
					break;

			}

			NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment549);  
			stream_NEWLINE.add(NEWLINE28);

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
			// 80:78: ->
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
	// $ANTLR end "comment"


	public static class sector_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sector"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:83:1: sector : PSECTOR ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? ( WS )? NEWLINE -> ID ;
	public final DynamoParser.sector_return sector() throws RecognitionException {
		DynamoParser.sector_return retval = new DynamoParser.sector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PSECTOR29=null;
		Token WS30=null;
		Token char_literal31=null;
		Token SECTOR32=null;
		Token char_literal33=null;
		Token ID34=null;
		Token char_literal35=null;
		Token WS37=null;
		Token NEWLINE38=null;
		ParserRuleReturnScope lineComment36 =null;

		Object PSECTOR29_tree=null;
		Object WS30_tree=null;
		Object char_literal31_tree=null;
		Object SECTOR32_tree=null;
		Object char_literal33_tree=null;
		Object ID34_tree=null;
		Object char_literal35_tree=null;
		Object WS37_tree=null;
		Object NEWLINE38_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_PSECTOR=new RewriteRuleTokenStream(adaptor,"token PSECTOR");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_SECTOR=new RewriteRuleTokenStream(adaptor,"token SECTOR");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:3: ( PSECTOR ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? ( WS )? NEWLINE -> ID )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:5: PSECTOR ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? ( WS )? NEWLINE
			{
			PSECTOR29=(Token)match(input,PSECTOR,FOLLOW_PSECTOR_in_sector573);  
			stream_PSECTOR.add(PSECTOR29);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:13: ( WS )+
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:13: WS
					{
					WS30=(Token)match(input,WS,FOLLOW_WS_in_sector575);  
					stream_WS.add(WS30);

					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			char_literal31=(Token)match(input,65,FOLLOW_65_in_sector578);  
			stream_65.add(char_literal31);

			SECTOR32=(Token)match(input,SECTOR,FOLLOW_SECTOR_in_sector581);  
			stream_SECTOR.add(SECTOR32);

			char_literal33=(Token)match(input,54,FOLLOW_54_in_sector583);  
			stream_54.add(char_literal33);

			ID34=(Token)match(input,ID,FOLLOW_ID_in_sector585);  
			stream_ID.add(ID34);

			char_literal35=(Token)match(input,67,FOLLOW_67_in_sector588);  
			stream_67.add(char_literal35);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:41: ( lineComment )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==COMMENT) ) {
					alt16=1;
				}
			}
			switch (alt16) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:41: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_sector590);
					lineComment36=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment36.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:54: ( WS )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==WS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:84:54: WS
					{
					WS37=(Token)match(input,WS,FOLLOW_WS_in_sector593);  
					stream_WS.add(WS37);

					}
					break;

			}

			NEWLINE38=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_sector596);  
			stream_NEWLINE.add(NEWLINE38);

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
			// 84:66: -> ID
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:87:1: controlSector : CSECTOR ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? ( WS )? NEWLINE -> ID ;
	public final DynamoParser.controlSector_return controlSector() throws RecognitionException {
		DynamoParser.controlSector_return retval = new DynamoParser.controlSector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CSECTOR39=null;
		Token WS40=null;
		Token char_literal41=null;
		Token SECTOR42=null;
		Token char_literal43=null;
		Token ID44=null;
		Token char_literal45=null;
		Token WS47=null;
		Token NEWLINE48=null;
		ParserRuleReturnScope lineComment46 =null;

		Object CSECTOR39_tree=null;
		Object WS40_tree=null;
		Object char_literal41_tree=null;
		Object SECTOR42_tree=null;
		Object char_literal43_tree=null;
		Object ID44_tree=null;
		Object char_literal45_tree=null;
		Object WS47_tree=null;
		Object NEWLINE48_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_CSECTOR=new RewriteRuleTokenStream(adaptor,"token CSECTOR");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_SECTOR=new RewriteRuleTokenStream(adaptor,"token SECTOR");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:3: ( CSECTOR ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? ( WS )? NEWLINE -> ID )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:5: CSECTOR ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? ( WS )? NEWLINE
			{
			CSECTOR39=(Token)match(input,CSECTOR,FOLLOW_CSECTOR_in_controlSector614);  
			stream_CSECTOR.add(CSECTOR39);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:13: ( WS )+
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:13: WS
					{
					WS40=(Token)match(input,WS,FOLLOW_WS_in_controlSector616);  
					stream_WS.add(WS40);

					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			char_literal41=(Token)match(input,65,FOLLOW_65_in_controlSector619);  
			stream_65.add(char_literal41);

			SECTOR42=(Token)match(input,SECTOR,FOLLOW_SECTOR_in_controlSector622);  
			stream_SECTOR.add(SECTOR42);

			char_literal43=(Token)match(input,54,FOLLOW_54_in_controlSector624);  
			stream_54.add(char_literal43);

			ID44=(Token)match(input,ID,FOLLOW_ID_in_controlSector626);  
			stream_ID.add(ID44);

			char_literal45=(Token)match(input,67,FOLLOW_67_in_controlSector628);  
			stream_67.add(char_literal45);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:40: ( lineComment )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==WS) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==COMMENT) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:40: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_controlSector630);
					lineComment46=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment46.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:53: ( WS )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==WS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:88:53: WS
					{
					WS47=(Token)match(input,WS,FOLLOW_WS_in_controlSector633);  
					stream_WS.add(WS47);

					}
					break;

			}

			NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_controlSector636);  
			stream_NEWLINE.add(NEWLINE48);

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
			// 88:65: -> ID
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:92:1: viewSpec : ( PLOT ( WS )+ plotVarList ( ( '/' ) plotVarList )* NEWLINE -> ^( PLOT ( plotVarList )+ ) | PRINT ( WS )+ varList NEWLINE ->);
	public final DynamoParser.viewSpec_return viewSpec() throws RecognitionException {
		DynamoParser.viewSpec_return retval = new DynamoParser.viewSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLOT49=null;
		Token WS50=null;
		Token char_literal52=null;
		Token NEWLINE54=null;
		Token PRINT55=null;
		Token WS56=null;
		Token NEWLINE58=null;
		ParserRuleReturnScope plotVarList51 =null;
		ParserRuleReturnScope plotVarList53 =null;
		ParserRuleReturnScope varList57 =null;

		Object PLOT49_tree=null;
		Object WS50_tree=null;
		Object char_literal52_tree=null;
		Object NEWLINE54_tree=null;
		Object PRINT55_tree=null;
		Object WS56_tree=null;
		Object NEWLINE58_tree=null;
		RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
		RewriteRuleTokenStream stream_PLOT=new RewriteRuleTokenStream(adaptor,"token PLOT");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_plotVarList=new RewriteRuleSubtreeStream(adaptor,"rule plotVarList");
		RewriteRuleSubtreeStream stream_varList=new RewriteRuleSubtreeStream(adaptor,"rule varList");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:4: ( PLOT ( WS )+ plotVarList ( ( '/' ) plotVarList )* NEWLINE -> ^( PLOT ( plotVarList )+ ) | PRINT ( WS )+ varList NEWLINE ->)
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==PLOT) ) {
				alt24=1;
			}
			else if ( (LA24_0==PRINT) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:6: PLOT ( WS )+ plotVarList ( ( '/' ) plotVarList )* NEWLINE
					{
					PLOT49=(Token)match(input,PLOT,FOLLOW_PLOT_in_viewSpec666);  
					stream_PLOT.add(PLOT49);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:11: ( WS )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==WS) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:11: WS
							{
							WS50=(Token)match(input,WS,FOLLOW_WS_in_viewSpec668);  
							stream_WS.add(WS50);

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					pushFollow(FOLLOW_plotVarList_in_viewSpec671);
					plotVarList51=plotVarList();
					state._fsp--;

					stream_plotVarList.add(plotVarList51.getTree());
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:27: ( ( '/' ) plotVarList )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==53) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:28: ( '/' ) plotVarList
							{
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:28: ( '/' )
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:29: '/'
							{
							char_literal52=(Token)match(input,53,FOLLOW_53_in_viewSpec675);  
							stream_53.add(char_literal52);

							}

							pushFollow(FOLLOW_plotVarList_in_viewSpec678);
							plotVarList53=plotVarList();
							state._fsp--;

							stream_plotVarList.add(plotVarList53.getTree());
							}
							break;

						default :
							break loop22;
						}
					}

					NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_viewSpec682);  
					stream_NEWLINE.add(NEWLINE54);

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
					// 93:56: -> ^( PLOT ( plotVarList )+ )
					{
						// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:93:59: ^( PLOT ( plotVarList )+ )
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:94:10: PRINT ( WS )+ varList NEWLINE
					{
					PRINT55=(Token)match(input,PRINT,FOLLOW_PRINT_in_viewSpec702);  
					stream_PRINT.add(PRINT55);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:94:16: ( WS )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==WS) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:94:16: WS
							{
							WS56=(Token)match(input,WS,FOLLOW_WS_in_viewSpec704);  
							stream_WS.add(WS56);

							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					pushFollow(FOLLOW_varList_in_viewSpec707);
					varList57=varList();
					state._fsp--;

					stream_varList.add(varList57.getTree());
					NEWLINE58=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_viewSpec709);  
					stream_NEWLINE.add(NEWLINE58);

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
					// 94:36: ->
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:97:1: plotVarList : scaleSpec ( ',' scaleSpec )* -> ^( PLOTVLIST ( scaleSpec )+ ) ;
	public final DynamoParser.plotVarList_return plotVarList() throws RecognitionException {
		DynamoParser.plotVarList_return retval = new DynamoParser.plotVarList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal60=null;
		ParserRuleReturnScope scaleSpec59 =null;
		ParserRuleReturnScope scaleSpec61 =null;

		Object char_literal60_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_scaleSpec=new RewriteRuleSubtreeStream(adaptor,"rule scaleSpec");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:98:3: ( scaleSpec ( ',' scaleSpec )* -> ^( PLOTVLIST ( scaleSpec )+ ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:98:7: scaleSpec ( ',' scaleSpec )*
			{
			pushFollow(FOLLOW_scaleSpec_in_plotVarList732);
			scaleSpec59=scaleSpec();
			state._fsp--;

			stream_scaleSpec.add(scaleSpec59.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:98:17: ( ',' scaleSpec )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==51) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:98:18: ',' scaleSpec
					{
					char_literal60=(Token)match(input,51,FOLLOW_51_in_plotVarList735);  
					stream_51.add(char_literal60);

					pushFollow(FOLLOW_scaleSpec_in_plotVarList737);
					scaleSpec61=scaleSpec();
					state._fsp--;

					stream_scaleSpec.add(scaleSpec61.getTree());
					}
					break;

				default :
					break loop25;
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
			// 98:35: -> ^( PLOTVLIST ( scaleSpec )+ )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:98:38: ^( PLOTVLIST ( scaleSpec )+ )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:101:1: scaleSpec : ( plotVar ( scaleRange )? ) -> ^( PLOTVAR plotVar ( scaleRange )? ) ;
	public final DynamoParser.scaleSpec_return scaleSpec() throws RecognitionException {
		DynamoParser.scaleSpec_return retval = new DynamoParser.scaleSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope plotVar62 =null;
		ParserRuleReturnScope scaleRange63 =null;

		RewriteRuleSubtreeStream stream_plotVar=new RewriteRuleSubtreeStream(adaptor,"rule plotVar");
		RewriteRuleSubtreeStream stream_scaleRange=new RewriteRuleSubtreeStream(adaptor,"rule scaleRange");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:2: ( ( plotVar ( scaleRange )? ) -> ^( PLOTVAR plotVar ( scaleRange )? ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:4: ( plotVar ( scaleRange )? )
			{
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:4: ( plotVar ( scaleRange )? )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:6: plotVar ( scaleRange )?
			{
			pushFollow(FOLLOW_plotVar_in_scaleSpec770);
			plotVar62=plotVar();
			state._fsp--;

			stream_plotVar.add(plotVar62.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:14: ( scaleRange )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==47) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:15: scaleRange
					{
					pushFollow(FOLLOW_scaleRange_in_scaleSpec773);
					scaleRange63=scaleRange();
					state._fsp--;

					stream_scaleRange.add(scaleRange63.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: scaleRange, plotVar
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 102:29: -> ^( PLOTVAR plotVar ( scaleRange )? )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:32: ^( PLOTVAR plotVar ( scaleRange )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLOTVAR, "PLOTVAR"), root_1);
				adaptor.addChild(root_1, stream_plotVar.nextTree());
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:102:50: ( scaleRange )?
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:105:1: plotVar : ID '=' plotChar -> ID ;
	public final DynamoParser.plotVar_return plotVar() throws RecognitionException {
		DynamoParser.plotVar_return retval = new DynamoParser.plotVar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID64=null;
		Token char_literal65=null;
		ParserRuleReturnScope plotChar66 =null;

		Object ID64_tree=null;
		Object char_literal65_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_plotChar=new RewriteRuleSubtreeStream(adaptor,"rule plotChar");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:105:9: ( ID '=' plotChar -> ID )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:105:11: ID '=' plotChar
			{
			ID64=(Token)match(input,ID,FOLLOW_ID_in_plotVar801);  
			stream_ID.add(ID64);

			char_literal65=(Token)match(input,54,FOLLOW_54_in_plotVar803);  
			stream_54.add(char_literal65);

			pushFollow(FOLLOW_plotChar_in_plotVar805);
			plotChar66=plotChar();
			state._fsp--;

			stream_plotChar.add(plotChar66.getTree());
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
			// 105:27: -> ID
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:1: plotChar : ( ID | NUMBER | '+' | '*' | '-' ->);
	public final DynamoParser.plotChar_return plotChar() throws RecognitionException {
		DynamoParser.plotChar_return retval = new DynamoParser.plotChar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID67=null;
		Token NUMBER68=null;
		Token char_literal69=null;
		Token char_literal70=null;
		Token char_literal71=null;

		Object ID67_tree=null;
		Object NUMBER68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal70_tree=null;
		Object char_literal71_tree=null;
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:9: ( ID | NUMBER | '+' | '*' | '-' ->)
			int alt27=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt27=1;
				}
				break;
			case NUMBER:
				{
				alt27=2;
				}
				break;
			case 50:
				{
				alt27=3;
				}
				break;
			case 49:
				{
				alt27=4;
				}
				break;
			case 52:
				{
				alt27=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:13: ID
					{
					root_0 = (Object)adaptor.nil();


					ID67=(Token)match(input,ID,FOLLOW_ID_in_plotChar820); 
					ID67_tree = (Object)adaptor.create(ID67);
					adaptor.addChild(root_0, ID67_tree);

					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:16: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER68=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_plotChar822); 
					NUMBER68_tree = (Object)adaptor.create(NUMBER68);
					adaptor.addChild(root_0, NUMBER68_tree);

					}
					break;
				case 3 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:23: '+'
					{
					root_0 = (Object)adaptor.nil();


					char_literal69=(Token)match(input,50,FOLLOW_50_in_plotChar824); 
					char_literal69_tree = (Object)adaptor.create(char_literal69);
					adaptor.addChild(root_0, char_literal69_tree);

					}
					break;
				case 4 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:27: '*'
					{
					root_0 = (Object)adaptor.nil();


					char_literal70=(Token)match(input,49,FOLLOW_49_in_plotChar826); 
					char_literal70_tree = (Object)adaptor.create(char_literal70);
					adaptor.addChild(root_0, char_literal70_tree);

					}
					break;
				case 5 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:108:31: '-'
					{
					char_literal71=(Token)match(input,52,FOLLOW_52_in_plotChar828);  
					stream_52.add(char_literal71);

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
					// 108:35: ->
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:111:1: scaleRange : '(' min ',' max ')' -> ^( SCALE min max ) ;
	public final DynamoParser.scaleRange_return scaleRange() throws RecognitionException {
		DynamoParser.scaleRange_return retval = new DynamoParser.scaleRange_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal72=null;
		Token char_literal74=null;
		Token char_literal76=null;
		ParserRuleReturnScope min73 =null;
		ParserRuleReturnScope max75 =null;

		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		Object char_literal76_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min");
		RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:111:12: ( '(' min ',' max ')' -> ^( SCALE min max ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:111:14: '(' min ',' max ')'
			{
			char_literal72=(Token)match(input,47,FOLLOW_47_in_scaleRange844);  
			stream_47.add(char_literal72);

			pushFollow(FOLLOW_min_in_scaleRange846);
			min73=min();
			state._fsp--;

			stream_min.add(min73.getTree());
			char_literal74=(Token)match(input,51,FOLLOW_51_in_scaleRange848);  
			stream_51.add(char_literal74);

			pushFollow(FOLLOW_max_in_scaleRange850);
			max75=max();
			state._fsp--;

			stream_max.add(max75.getTree());
			char_literal76=(Token)match(input,48,FOLLOW_48_in_scaleRange852);  
			stream_48.add(char_literal76);

			// AST REWRITE
			// elements: min, max
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 111:35: -> ^( SCALE min max )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:111:38: ^( SCALE min max )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:114:1: min : NUMBER ;
	public final DynamoParser.min_return min() throws RecognitionException {
		DynamoParser.min_return retval = new DynamoParser.min_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER77=null;

		Object NUMBER77_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:114:4: ( NUMBER )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:114:6: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER77=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_min883); 
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
	// $ANTLR end "min"


	public static class max_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "max"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:115:1: max : NUMBER ;
	public final DynamoParser.max_return max() throws RecognitionException {
		DynamoParser.max_return retval = new DynamoParser.max_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER78=null;

		Object NUMBER78_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:115:4: ( NUMBER )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:115:6: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER78=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_max889); 
			NUMBER78_tree = (Object)adaptor.create(NUMBER78);
			adaptor.addChild(root_0, NUMBER78_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:117:1: runSpec :{...}? RUN ( COMMENT )? NEWLINE ;
	public final DynamoParser.runSpec_return runSpec() throws RecognitionException {
		DynamoParser.runSpec_return retval = new DynamoParser.runSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RUN79=null;
		Token COMMENT80=null;
		Token NEWLINE81=null;

		Object RUN79_tree=null;
		Object COMMENT80_tree=null;
		Object NEWLINE81_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:118:6: ({...}? RUN ( COMMENT )? NEWLINE )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:118:8: {...}? RUN ( COMMENT )? NEWLINE
			{
			root_0 = (Object)adaptor.nil();


			if ( !((input.LT(1).getText().contentEquals("RUN"))) ) {
				throw new FailedPredicateException(input, "runSpec", "input.LT(1).getText().contentEquals(\"RUN\")");
			}
			RUN79=(Token)match(input,RUN,FOLLOW_RUN_in_runSpec909); 
			RUN79_tree = (Object)adaptor.create(RUN79);
			adaptor.addChild(root_0, RUN79_tree);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:118:58: ( COMMENT )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COMMENT) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:118:58: COMMENT
					{
					COMMENT80=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_runSpec911); 
					COMMENT80_tree = (Object)adaptor.create(COMMENT80);
					adaptor.addChild(root_0, COMMENT80_tree);

					}
					break;

			}

			NEWLINE81=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_runSpec914); 
			NEWLINE81_tree = (Object)adaptor.create(NEWLINE81);
			adaptor.addChild(root_0, NEWLINE81_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:121:1: simSpec : SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE -> ^( PARAMS ( paramAssignment )+ ) ;
	public final DynamoParser.simSpec_return simSpec() throws RecognitionException {
		DynamoParser.simSpec_return retval = new DynamoParser.simSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SPEC82=null;
		Token WS83=null;
		Token char_literal85=null;
		Token char_literal86=null;
		Token NEWLINE88=null;
		ParserRuleReturnScope paramAssignment84 =null;
		ParserRuleReturnScope paramAssignment87 =null;

		Object SPEC82_tree=null;
		Object WS83_tree=null;
		Object char_literal85_tree=null;
		Object char_literal86_tree=null;
		Object NEWLINE88_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_SPEC=new RewriteRuleTokenStream(adaptor,"token SPEC");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_paramAssignment=new RewriteRuleSubtreeStream(adaptor,"rule paramAssignment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:6: ( SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE -> ^( PARAMS ( paramAssignment )+ ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:8: SPEC WS paramAssignment ( ( ',' | '/' ) paramAssignment )* NEWLINE
			{
			SPEC82=(Token)match(input,SPEC,FOLLOW_SPEC_in_simSpec938);  
			stream_SPEC.add(SPEC82);

			WS83=(Token)match(input,WS,FOLLOW_WS_in_simSpec940);  
			stream_WS.add(WS83);

			pushFollow(FOLLOW_paramAssignment_in_simSpec942);
			paramAssignment84=paramAssignment();
			state._fsp--;

			stream_paramAssignment.add(paramAssignment84.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:32: ( ( ',' | '/' ) paramAssignment )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==51||LA30_0==53) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:33: ( ',' | '/' ) paramAssignment
					{
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:33: ( ',' | '/' )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==51) ) {
						alt29=1;
					}
					else if ( (LA29_0==53) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:34: ','
							{
							char_literal85=(Token)match(input,51,FOLLOW_51_in_simSpec946);  
							stream_51.add(char_literal85);

							}
							break;
						case 2 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:38: '/'
							{
							char_literal86=(Token)match(input,53,FOLLOW_53_in_simSpec948);  
							stream_53.add(char_literal86);

							}
							break;

					}

					pushFollow(FOLLOW_paramAssignment_in_simSpec951);
					paramAssignment87=paramAssignment();
					state._fsp--;

					stream_paramAssignment.add(paramAssignment87.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			NEWLINE88=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_simSpec955);  
			stream_NEWLINE.add(NEWLINE88);

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
			// 122:69: -> ^( PARAMS ( paramAssignment )+ )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:122:72: ^( PARAMS ( paramAssignment )+ )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:125:1: macroDef : macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) ) ;
	public final DynamoParser.macroDef_return macroDef() throws RecognitionException {
		DynamoParser.macroDef_return retval = new DynamoParser.macroDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope macroStart89 =null;
		ParserRuleReturnScope intrnlStmt90 =null;
		ParserRuleReturnScope definition91 =null;
		ParserRuleReturnScope comment92 =null;
		ParserRuleReturnScope macroEnd93 =null;

		RewriteRuleSubtreeStream stream_macroStart=new RewriteRuleSubtreeStream(adaptor,"rule macroStart");
		RewriteRuleSubtreeStream stream_macroEnd=new RewriteRuleSubtreeStream(adaptor,"rule macroEnd");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
		RewriteRuleSubtreeStream stream_intrnlStmt=new RewriteRuleSubtreeStream(adaptor,"rule intrnlStmt");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:3: ( macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:5: macroStart ( intrnlStmt )* ( definition | comment )+ macroEnd
			{
			pushFollow(FOLLOW_macroStart_in_macroDef985);
			macroStart89=macroStart();
			state._fsp--;

			stream_macroStart.add(macroStart89.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:16: ( intrnlStmt )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==INTRN) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:16: intrnlStmt
					{
					pushFollow(FOLLOW_intrnlStmt_in_macroDef987);
					intrnlStmt90=intrnlStmt();
					state._fsp--;

					stream_intrnlStmt.add(intrnlStmt90.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:28: ( definition | comment )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=3;
				int LA32_0 = input.LA(1);
				if ( ((LA32_0 >= 55 && LA32_0 <= 60)) ) {
					alt32=1;
				}
				else if ( (LA32_0==NOTE) ) {
					alt32=2;
				}

				switch (alt32) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:29: definition
					{
					pushFollow(FOLLOW_definition_in_macroDef991);
					definition91=definition();
					state._fsp--;

					stream_definition.add(definition91.getTree());
					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:42: comment
					{
					pushFollow(FOLLOW_comment_in_macroDef995);
					comment92=comment();
					state._fsp--;

					stream_comment.add(comment92.getTree());
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			pushFollow(FOLLOW_macroEnd_in_macroDef1000);
			macroEnd93=macroEnd();
			state._fsp--;

			stream_macroEnd.add(macroEnd93.getTree());
			// AST REWRITE
			// elements: definition, intrnlStmt, macroStart
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:62: -> ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:65: ^( MACRO macroStart intrnlStmt ^( VARIABLES ( definition )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MACRO, "MACRO"), root_1);
				adaptor.addChild(root_1, stream_macroStart.nextTree());
				adaptor.addChild(root_1, stream_intrnlStmt.nextTree());
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:126:95: ^( VARIABLES ( definition )+ )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:129:1: macroStart : MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE -> ID formalParams ;
	public final DynamoParser.macroStart_return macroStart() throws RecognitionException {
		DynamoParser.macroStart_return retval = new DynamoParser.macroStart_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MACRO94=null;
		Token WS95=null;
		Token ID96=null;
		Token char_literal97=null;
		Token char_literal99=null;
		Token WS100=null;
		Token NEWLINE101=null;
		ParserRuleReturnScope formalParams98 =null;

		Object MACRO94_tree=null;
		Object WS95_tree=null;
		Object ID96_tree=null;
		Object char_literal97_tree=null;
		Object char_literal99_tree=null;
		Object WS100_tree=null;
		Object NEWLINE101_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_MACRO=new RewriteRuleTokenStream(adaptor,"token MACRO");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_formalParams=new RewriteRuleSubtreeStream(adaptor,"rule formalParams");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:3: ( MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE -> ID formalParams )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:5: MACRO ( WS )+ ID ( '(' formalParams ')' )? ( WS )* NEWLINE
			{
			MACRO94=(Token)match(input,MACRO,FOLLOW_MACRO_in_macroStart1032);  
			stream_MACRO.add(MACRO94);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:11: ( WS )+
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:11: WS
					{
					WS95=(Token)match(input,WS,FOLLOW_WS_in_macroStart1034);  
					stream_WS.add(WS95);

					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			ID96=(Token)match(input,ID,FOLLOW_ID_in_macroStart1037);  
			stream_ID.add(ID96);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:18: ( '(' formalParams ')' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==47) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:19: '(' formalParams ')'
					{
					char_literal97=(Token)match(input,47,FOLLOW_47_in_macroStart1040);  
					stream_47.add(char_literal97);

					pushFollow(FOLLOW_formalParams_in_macroStart1042);
					formalParams98=formalParams();
					state._fsp--;

					stream_formalParams.add(formalParams98.getTree());
					char_literal99=(Token)match(input,48,FOLLOW_48_in_macroStart1043);  
					stream_48.add(char_literal99);

					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:42: ( WS )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:130:42: WS
					{
					WS100=(Token)match(input,WS,FOLLOW_WS_in_macroStart1048);  
					stream_WS.add(WS100);

					}
					break;

				default :
					break loop35;
				}
			}

			NEWLINE101=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_macroStart1051);  
			stream_NEWLINE.add(NEWLINE101);

			// AST REWRITE
			// elements: formalParams, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:54: -> ID formalParams
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:132:1: intrnlStmt : INTRN ( WS )+ ID ( ',' ID )* NEWLINE -> ^( LOCALS ( ID )* ) ;
	public final DynamoParser.intrnlStmt_return intrnlStmt() throws RecognitionException {
		DynamoParser.intrnlStmt_return retval = new DynamoParser.intrnlStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRN102=null;
		Token WS103=null;
		Token ID104=null;
		Token char_literal105=null;
		Token ID106=null;
		Token NEWLINE107=null;

		Object INTRN102_tree=null;
		Object WS103_tree=null;
		Object ID104_tree=null;
		Object char_literal105_tree=null;
		Object ID106_tree=null;
		Object NEWLINE107_tree=null;
		RewriteRuleTokenStream stream_INTRN=new RewriteRuleTokenStream(adaptor,"token INTRN");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:3: ( INTRN ( WS )+ ID ( ',' ID )* NEWLINE -> ^( LOCALS ( ID )* ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:5: INTRN ( WS )+ ID ( ',' ID )* NEWLINE
			{
			INTRN102=(Token)match(input,INTRN,FOLLOW_INTRN_in_intrnlStmt1071);  
			stream_INTRN.add(INTRN102);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:11: ( WS )+
			int cnt36=0;
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:11: WS
					{
					WS103=(Token)match(input,WS,FOLLOW_WS_in_intrnlStmt1073);  
					stream_WS.add(WS103);

					}
					break;

				default :
					if ( cnt36 >= 1 ) break loop36;
					EarlyExitException eee = new EarlyExitException(36, input);
					throw eee;
				}
				cnt36++;
			}

			ID104=(Token)match(input,ID,FOLLOW_ID_in_intrnlStmt1076);  
			stream_ID.add(ID104);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:18: ( ',' ID )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==51) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:19: ',' ID
					{
					char_literal105=(Token)match(input,51,FOLLOW_51_in_intrnlStmt1079);  
					stream_51.add(char_literal105);

					ID106=(Token)match(input,ID,FOLLOW_ID_in_intrnlStmt1081);  
					stream_ID.add(ID106);

					}
					break;

				default :
					break loop37;
				}
			}

			NEWLINE107=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_intrnlStmt1085);  
			stream_NEWLINE.add(NEWLINE107);

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
			// 133:36: -> ^( LOCALS ( ID )* )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:39: ^( LOCALS ( ID )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALS, "LOCALS"), root_1);
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:133:48: ( ID )*
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:136:1: macroEnd : MEND ( WS )* NEWLINE ->;
	public final DynamoParser.macroEnd_return macroEnd() throws RecognitionException {
		DynamoParser.macroEnd_return retval = new DynamoParser.macroEnd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MEND108=null;
		Token WS109=null;
		Token NEWLINE110=null;

		Object MEND108_tree=null;
		Object WS109_tree=null;
		Object NEWLINE110_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_MEND=new RewriteRuleTokenStream(adaptor,"token MEND");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:137:3: ( MEND ( WS )* NEWLINE ->)
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:137:5: MEND ( WS )* NEWLINE
			{
			MEND108=(Token)match(input,MEND,FOLLOW_MEND_in_macroEnd1109);  
			stream_MEND.add(MEND108);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:137:11: ( WS )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==WS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:137:11: WS
					{
					WS109=(Token)match(input,WS,FOLLOW_WS_in_macroEnd1112);  
					stream_WS.add(WS109);

					}
					break;

				default :
					break loop38;
				}
			}

			NEWLINE110=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_macroEnd1115);  
			stream_NEWLINE.add(NEWLINE110);

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
			// 137:23: ->
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:139:1: formalParams : ID ( ',' ID )* -> ^( FORMAL_PARAMS ( ID )* ) ;
	public final DynamoParser.formalParams_return formalParams() throws RecognitionException {
		DynamoParser.formalParams_return retval = new DynamoParser.formalParams_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID111=null;
		Token char_literal112=null;
		Token ID113=null;

		Object ID111_tree=null;
		Object char_literal112_tree=null;
		Object ID113_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:140:2: ( ID ( ',' ID )* -> ^( FORMAL_PARAMS ( ID )* ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:140:9: ID ( ',' ID )*
			{
			ID111=(Token)match(input,ID,FOLLOW_ID_in_formalParams1134);  
			stream_ID.add(ID111);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:140:12: ( ',' ID )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==51) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:140:13: ',' ID
					{
					char_literal112=(Token)match(input,51,FOLLOW_51_in_formalParams1137);  
					stream_51.add(char_literal112);

					ID113=(Token)match(input,ID,FOLLOW_ID_in_formalParams1139);  
					stream_ID.add(ID113);

					}
					break;

				default :
					break loop39;
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
			// 140:22: -> ^( FORMAL_PARAMS ( ID )* )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:140:25: ^( FORMAL_PARAMS ( ID )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMAL_PARAMS, "FORMAL_PARAMS"), root_1);
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:140:41: ( ID )*
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:143:1: paramAssignment : ID '=' expr -> ^( PAUX ID expr ) ;
	public final DynamoParser.paramAssignment_return paramAssignment() throws RecognitionException {
		DynamoParser.paramAssignment_return retval = new DynamoParser.paramAssignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID114=null;
		Token char_literal115=null;
		ParserRuleReturnScope expr116 =null;

		Object ID114_tree=null;
		Object char_literal115_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:144:6: ( ID '=' expr -> ^( PAUX ID expr ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:144:8: ID '=' expr
			{
			ID114=(Token)match(input,ID,FOLLOW_ID_in_paramAssignment1165);  
			stream_ID.add(ID114);

			char_literal115=(Token)match(input,54,FOLLOW_54_in_paramAssignment1167);  
			stream_54.add(char_literal115);

			pushFollow(FOLLOW_expr_in_paramAssignment1169);
			expr116=expr();
			state._fsp--;

			stream_expr.add(expr116.getTree());
			// AST REWRITE
			// elements: expr, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 144:20: -> ^( PAUX ID expr )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:144:23: ^( PAUX ID expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAUX, "PAUX"), root_1);
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:146:1: varList : ( colspec )? ID ( ( ',' | '/' ) ID )* ;
	public final DynamoParser.varList_return varList() throws RecognitionException {
		DynamoParser.varList_return retval = new DynamoParser.varList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID118=null;
		Token set119=null;
		Token ID120=null;
		ParserRuleReturnScope colspec117 =null;

		Object ID118_tree=null;
		Object set119_tree=null;
		Object ID120_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:147:3: ( ( colspec )? ID ( ( ',' | '/' ) ID )* )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:147:5: ( colspec )? ID ( ( ',' | '/' ) ID )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:147:5: ( colspec )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==NUMBER) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:147:5: colspec
					{
					pushFollow(FOLLOW_colspec_in_varList1203);
					colspec117=colspec();
					state._fsp--;

					adaptor.addChild(root_0, colspec117.getTree());

					}
					break;

			}

			ID118=(Token)match(input,ID,FOLLOW_ID_in_varList1206); 
			ID118_tree = (Object)adaptor.create(ID118);
			adaptor.addChild(root_0, ID118_tree);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:147:17: ( ( ',' | '/' ) ID )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==51||LA41_0==53) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:147:18: ( ',' | '/' ) ID
					{
					set119=input.LT(1);
					if ( input.LA(1)==51||input.LA(1)==53 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set119));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ID120=(Token)match(input,ID,FOLLOW_ID_in_varList1215); 
					ID120_tree = (Object)adaptor.create(ID120);
					adaptor.addChild(root_0, ID120_tree);

					}
					break;

				default :
					break loop41;
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:149:1: drawInterval : '(' intervalStart ',' intervalStop ')' ;
	public final DynamoParser.drawInterval_return drawInterval() throws RecognitionException {
		DynamoParser.drawInterval_return retval = new DynamoParser.drawInterval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal121=null;
		Token char_literal123=null;
		Token char_literal125=null;
		ParserRuleReturnScope intervalStart122 =null;
		ParserRuleReturnScope intervalStop124 =null;

		Object char_literal121_tree=null;
		Object char_literal123_tree=null;
		Object char_literal125_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:150:3: ( '(' intervalStart ',' intervalStop ')' )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:150:5: '(' intervalStart ',' intervalStop ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal121=(Token)match(input,47,FOLLOW_47_in_drawInterval1230); 
			char_literal121_tree = (Object)adaptor.create(char_literal121);
			adaptor.addChild(root_0, char_literal121_tree);

			pushFollow(FOLLOW_intervalStart_in_drawInterval1232);
			intervalStart122=intervalStart();
			state._fsp--;

			adaptor.addChild(root_0, intervalStart122.getTree());

			char_literal123=(Token)match(input,51,FOLLOW_51_in_drawInterval1234); 
			char_literal123_tree = (Object)adaptor.create(char_literal123);
			adaptor.addChild(root_0, char_literal123_tree);

			pushFollow(FOLLOW_intervalStop_in_drawInterval1236);
			intervalStop124=intervalStop();
			state._fsp--;

			adaptor.addChild(root_0, intervalStop124.getTree());

			char_literal125=(Token)match(input,48,FOLLOW_48_in_drawInterval1238); 
			char_literal125_tree = (Object)adaptor.create(char_literal125);
			adaptor.addChild(root_0, char_literal125_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:152:1: drawChar : ( '+' | '*' );
	public final DynamoParser.drawChar_return drawChar() throws RecognitionException {
		DynamoParser.drawChar_return retval = new DynamoParser.drawChar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set126=null;

		Object set126_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:153:3: ( '+' | '*' )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:
			{
			root_0 = (Object)adaptor.nil();


			set126=input.LT(1);
			if ( (input.LA(1) >= 49 && input.LA(1) <= 50) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set126));
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:156:1: intervalStart : NUMBER ;
	public final DynamoParser.intervalStart_return intervalStart() throws RecognitionException {
		DynamoParser.intervalStart_return retval = new DynamoParser.intervalStart_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER127=null;

		Object NUMBER127_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:157:3: ( NUMBER )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:157:5: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER127=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_intervalStart1269); 
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
	// $ANTLR end "intervalStart"


	public static class intervalStop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "intervalStop"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:160:1: intervalStop : NUMBER ;
	public final DynamoParser.intervalStop_return intervalStop() throws RecognitionException {
		DynamoParser.intervalStop_return retval = new DynamoParser.intervalStop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER128=null;

		Object NUMBER128_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:161:3: ( NUMBER )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:161:5: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER128=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_intervalStop1284); 
			NUMBER128_tree = (Object)adaptor.create(NUMBER128);
			adaptor.addChild(root_0, NUMBER128_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:163:1: colspec : NUMBER ')' ;
	public final DynamoParser.colspec_return colspec() throws RecognitionException {
		DynamoParser.colspec_return retval = new DynamoParser.colspec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER129=null;
		Token char_literal130=null;

		Object NUMBER129_tree=null;
		Object char_literal130_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:164:3: ( NUMBER ')' )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:164:5: NUMBER ')'
			{
			root_0 = (Object)adaptor.nil();


			NUMBER129=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_colspec1300); 
			NUMBER129_tree = (Object)adaptor.create(NUMBER129);
			adaptor.addChild(root_0, NUMBER129_tree);

			char_literal130=(Token)match(input,48,FOLLOW_48_in_colspec1302); 
			char_literal130_tree = (Object)adaptor.create(char_literal130);
			adaptor.addChild(root_0, char_literal130_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:167:1: constDef : 'C' ( WS )+ id= ID '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( AUX ID eqn ) ;
	public final DynamoParser.constDef_return constDef() throws RecognitionException {
		DynamoParser.constDef_return retval = new DynamoParser.constDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;
		Token char_literal131=null;
		Token WS132=null;
		Token char_literal133=null;
		Token WS136=null;
		Token NEWLINE137=null;
		ParserRuleReturnScope eqn134 =null;
		ParserRuleReturnScope lineComment135 =null;

		Object id_tree=null;
		Object char_literal131_tree=null;
		Object WS132_tree=null;
		Object char_literal133_tree=null;
		Object WS136_tree=null;
		Object NEWLINE137_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:2: ( 'C' ( WS )+ id= ID '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( AUX ID eqn ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:4: 'C' ( WS )+ id= ID '=' eqn ( lineComment )? ( WS )? NEWLINE
			{
			char_literal131=(Token)match(input,56,FOLLOW_56_in_constDef1317);  
			stream_56.add(char_literal131);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:8: ( WS )+
			int cnt42=0;
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:8: WS
					{
					WS132=(Token)match(input,WS,FOLLOW_WS_in_constDef1319);  
					stream_WS.add(WS132);

					}
					break;

				default :
					if ( cnt42 >= 1 ) break loop42;
					EarlyExitException eee = new EarlyExitException(42, input);
					throw eee;
				}
				cnt42++;
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_constDef1324);  
			stream_ID.add(id);

			char_literal133=(Token)match(input,54,FOLLOW_54_in_constDef1326);  
			stream_54.add(char_literal133);

			pushFollow(FOLLOW_eqn_in_constDef1328);
			eqn134=eqn();
			state._fsp--;

			stream_eqn.add(eqn134.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:26: ( lineComment )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==WS) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==COMMENT) ) {
					alt43=1;
				}
			}
			switch (alt43) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:26: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_constDef1330);
					lineComment135=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment135.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:39: ( WS )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==WS) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:39: WS
					{
					WS136=(Token)match(input,WS,FOLLOW_WS_in_constDef1333);  
					stream_WS.add(WS136);

					}
					break;

			}

			NEWLINE137=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_constDef1336);  
			stream_NEWLINE.add(NEWLINE137);

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
			// 168:51: -> ^( AUX ID eqn )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:168:54: ^( AUX ID eqn )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:170:1: initDef : 'N' ( WS )+ ID '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( IVALUE ID eqn ) ;
	public final DynamoParser.initDef_return initDef() throws RecognitionException {
		DynamoParser.initDef_return retval = new DynamoParser.initDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal138=null;
		Token WS139=null;
		Token ID140=null;
		Token char_literal141=null;
		Token WS144=null;
		Token NEWLINE145=null;
		ParserRuleReturnScope eqn142 =null;
		ParserRuleReturnScope lineComment143 =null;

		Object char_literal138_tree=null;
		Object WS139_tree=null;
		Object ID140_tree=null;
		Object char_literal141_tree=null;
		Object WS144_tree=null;
		Object NEWLINE145_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:2: ( 'N' ( WS )+ ID '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( IVALUE ID eqn ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:4: 'N' ( WS )+ ID '=' eqn ( lineComment )? ( WS )? NEWLINE
			{
			char_literal138=(Token)match(input,58,FOLLOW_58_in_initDef1357);  
			stream_58.add(char_literal138);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:8: ( WS )+
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:8: WS
					{
					WS139=(Token)match(input,WS,FOLLOW_WS_in_initDef1359);  
					stream_WS.add(WS139);

					}
					break;

				default :
					if ( cnt45 >= 1 ) break loop45;
					EarlyExitException eee = new EarlyExitException(45, input);
					throw eee;
				}
				cnt45++;
			}

			ID140=(Token)match(input,ID,FOLLOW_ID_in_initDef1362);  
			stream_ID.add(ID140);

			char_literal141=(Token)match(input,54,FOLLOW_54_in_initDef1364);  
			stream_54.add(char_literal141);

			pushFollow(FOLLOW_eqn_in_initDef1366);
			eqn142=eqn();
			state._fsp--;

			stream_eqn.add(eqn142.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:23: ( lineComment )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==WS) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==COMMENT) ) {
					alt46=1;
				}
			}
			switch (alt46) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:23: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_initDef1368);
					lineComment143=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment143.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:36: ( WS )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==WS) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:36: WS
					{
					WS144=(Token)match(input,WS,FOLLOW_WS_in_initDef1371);  
					stream_WS.add(WS144);

					}
					break;

			}

			NEWLINE145=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_initDef1374);  
			stream_NEWLINE.add(NEWLINE145);

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
			// 171:48: -> ^( IVALUE ID eqn )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:171:51: ^( IVALUE ID eqn )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:174:1: auxDef : ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? ( WS )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( AUX ID eqn ) );
	public final DynamoParser.auxDef_return auxDef() throws RecognitionException {
		DynamoParser.auxDef_return retval = new DynamoParser.auxDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal146=null;
		Token WS147=null;
		Token ID148=null;
		Token char_literal150=null;
		Token WS153=null;
		Token NEWLINE154=null;
		Token char_literal155=null;
		Token WS156=null;
		Token ID157=null;
		Token char_literal159=null;
		Token WS162=null;
		Token NEWLINE163=null;
		ParserRuleReturnScope timeExt149 =null;
		ParserRuleReturnScope tableFunction151 =null;
		ParserRuleReturnScope lineComment152 =null;
		ParserRuleReturnScope timeExt158 =null;
		ParserRuleReturnScope eqn160 =null;
		ParserRuleReturnScope lineComment161 =null;

		Object char_literal146_tree=null;
		Object WS147_tree=null;
		Object ID148_tree=null;
		Object char_literal150_tree=null;
		Object WS153_tree=null;
		Object NEWLINE154_tree=null;
		Object char_literal155_tree=null;
		Object WS156_tree=null;
		Object ID157_tree=null;
		Object char_literal159_tree=null;
		Object WS162_tree=null;
		Object NEWLINE163_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");
		RewriteRuleSubtreeStream stream_tableFunction=new RewriteRuleSubtreeStream(adaptor,"rule tableFunction");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:2: ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? ( WS )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( AUX ID eqn ) )
			int alt54=2;
			alt54 = dfa54.predict(input);
			switch (alt54) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:4: 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? ( WS )? NEWLINE
					{
					char_literal146=(Token)match(input,55,FOLLOW_55_in_auxDef1395);  
					stream_55.add(char_literal146);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:8: ( WS )+
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
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:8: WS
							{
							WS147=(Token)match(input,WS,FOLLOW_WS_in_auxDef1397);  
							stream_WS.add(WS147);

							}
							break;

						default :
							if ( cnt48 >= 1 ) break loop48;
							EarlyExitException eee = new EarlyExitException(48, input);
							throw eee;
						}
						cnt48++;
					}

					ID148=(Token)match(input,ID,FOLLOW_ID_in_auxDef1400);  
					stream_ID.add(ID148);

					pushFollow(FOLLOW_timeExt_in_auxDef1402);
					timeExt149=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt149.getTree());
					char_literal150=(Token)match(input,54,FOLLOW_54_in_auxDef1404);  
					stream_54.add(char_literal150);

					pushFollow(FOLLOW_tableFunction_in_auxDef1406);
					tableFunction151=tableFunction();
					state._fsp--;

					stream_tableFunction.add(tableFunction151.getTree());
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:41: ( lineComment )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==WS) ) {
						int LA49_1 = input.LA(2);
						if ( (LA49_1==COMMENT) ) {
							alt49=1;
						}
					}
					switch (alt49) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:41: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_auxDef1408);
							lineComment152=lineComment();
							state._fsp--;

							stream_lineComment.add(lineComment152.getTree());
							}
							break;

					}

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:54: ( WS )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==WS) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:54: WS
							{
							WS153=(Token)match(input,WS,FOLLOW_WS_in_auxDef1411);  
							stream_WS.add(WS153);

							}
							break;

					}

					NEWLINE154=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef1414);  
					stream_NEWLINE.add(NEWLINE154);

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
					// 175:67: -> ^( TAUX ID tableFunction )
					{
						// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:175:70: ^( TAUX ID tableFunction )
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:4: 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE
					{
					char_literal155=(Token)match(input,55,FOLLOW_55_in_auxDef1431);  
					stream_55.add(char_literal155);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:8: ( WS )+
					int cnt51=0;
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==WS) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:8: WS
							{
							WS156=(Token)match(input,WS,FOLLOW_WS_in_auxDef1433);  
							stream_WS.add(WS156);

							}
							break;

						default :
							if ( cnt51 >= 1 ) break loop51;
							EarlyExitException eee = new EarlyExitException(51, input);
							throw eee;
						}
						cnt51++;
					}

					ID157=(Token)match(input,ID,FOLLOW_ID_in_auxDef1436);  
					stream_ID.add(ID157);

					pushFollow(FOLLOW_timeExt_in_auxDef1438);
					timeExt158=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt158.getTree());
					char_literal159=(Token)match(input,54,FOLLOW_54_in_auxDef1440);  
					stream_54.add(char_literal159);

					pushFollow(FOLLOW_eqn_in_auxDef1442);
					eqn160=eqn();
					state._fsp--;

					stream_eqn.add(eqn160.getTree());
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:31: ( lineComment )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WS) ) {
						int LA52_1 = input.LA(2);
						if ( (LA52_1==COMMENT) ) {
							alt52=1;
						}
					}
					switch (alt52) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:31: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_auxDef1444);
							lineComment161=lineComment();
							state._fsp--;

							stream_lineComment.add(lineComment161.getTree());
							}
							break;

					}

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:44: ( WS )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==WS) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:44: WS
							{
							WS162=(Token)match(input,WS,FOLLOW_WS_in_auxDef1447);  
							stream_WS.add(WS162);

							}
							break;

					}

					NEWLINE163=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef1451);  
					stream_NEWLINE.add(NEWLINE163);

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
					// 176:58: -> ^( AUX ID eqn )
					{
						// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:176:61: ^( AUX ID eqn )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:179:1: tableFunction : expol= ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')' -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step) ;
	public final DynamoParser.tableFunction_return tableFunction() throws RecognitionException {
		DynamoParser.tableFunction_return retval = new DynamoParser.tableFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token expol=null;
		Token tName=null;
		Token eqId=null;
		Token xMin=null;
		Token xMax=null;
		Token step=null;
		Token char_literal164=null;
		Token char_literal165=null;
		Token char_literal167=null;
		Token char_literal168=null;
		Token char_literal169=null;
		Token char_literal170=null;
		ParserRuleReturnScope timeExt166 =null;

		Object expol_tree=null;
		Object tName_tree=null;
		Object eqId_tree=null;
		Object xMin_tree=null;
		Object xMax_tree=null;
		Object step_tree=null;
		Object char_literal164_tree=null;
		Object char_literal165_tree=null;
		Object char_literal167_tree=null;
		Object char_literal168_tree=null;
		Object char_literal169_tree=null;
		Object char_literal170_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:3: (expol= ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')' -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:5: expol= ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' ) '(' tName= ID ',' eqId= ID ( timeExt )? ',' xMin= NUMBER ',' xMax= NUMBER ',' step= NUMBER ')'
			{
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:11: ( 'TABLE' | 'TABXT' | 'TABPL' | 'TABHL' )
			int alt55=4;
			switch ( input.LA(1) ) {
			case 62:
				{
				alt55=1;
				}
				break;
			case 64:
				{
				alt55=2;
				}
				break;
			case 63:
				{
				alt55=3;
				}
				break;
			case 61:
				{
				alt55=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:12: 'TABLE'
					{
					expol=(Token)match(input,62,FOLLOW_62_in_tableFunction1479);  
					stream_62.add(expol);

					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:21: 'TABXT'
					{
					expol=(Token)match(input,64,FOLLOW_64_in_tableFunction1482);  
					stream_64.add(expol);

					}
					break;
				case 3 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:31: 'TABPL'
					{
					expol=(Token)match(input,63,FOLLOW_63_in_tableFunction1486);  
					stream_63.add(expol);

					}
					break;
				case 4 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:40: 'TABHL'
					{
					expol=(Token)match(input,61,FOLLOW_61_in_tableFunction1489);  
					stream_61.add(expol);

					}
					break;

			}

			char_literal164=(Token)match(input,47,FOLLOW_47_in_tableFunction1493);  
			stream_47.add(char_literal164);

			tName=(Token)match(input,ID,FOLLOW_ID_in_tableFunction1497);  
			stream_ID.add(tName);

			char_literal165=(Token)match(input,51,FOLLOW_51_in_tableFunction1499);  
			stream_51.add(char_literal165);

			eqId=(Token)match(input,ID,FOLLOW_ID_in_tableFunction1503);  
			stream_ID.add(eqId);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:75: ( timeExt )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==66) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:75: timeExt
					{
					pushFollow(FOLLOW_timeExt_in_tableFunction1505);
					timeExt166=timeExt();
					state._fsp--;

					stream_timeExt.add(timeExt166.getTree());
					}
					break;

			}

			char_literal167=(Token)match(input,51,FOLLOW_51_in_tableFunction1508);  
			stream_51.add(char_literal167);

			xMin=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1512);  
			stream_NUMBER.add(xMin);

			char_literal168=(Token)match(input,51,FOLLOW_51_in_tableFunction1514);  
			stream_51.add(char_literal168);

			xMax=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1518);  
			stream_NUMBER.add(xMax);

			char_literal169=(Token)match(input,51,FOLLOW_51_in_tableFunction1520);  
			stream_51.add(char_literal169);

			step=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tableFunction1524);  
			stream_NUMBER.add(step);

			char_literal170=(Token)match(input,48,FOLLOW_48_in_tableFunction1526);  
			stream_48.add(char_literal170);

			// AST REWRITE
			// elements: xMax, step, xMin, expol, ID, ID, eqId
			// token labels: eqId, step, xMax, xMin, expol
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_eqId=new RewriteRuleTokenStream(adaptor,"token eqId",eqId);
			RewriteRuleTokenStream stream_step=new RewriteRuleTokenStream(adaptor,"token step",step);
			RewriteRuleTokenStream stream_xMax=new RewriteRuleTokenStream(adaptor,"token xMax",xMax);
			RewriteRuleTokenStream stream_xMin=new RewriteRuleTokenStream(adaptor,"token xMin",xMin);
			RewriteRuleTokenStream stream_expol=new RewriteRuleTokenStream(adaptor,"token expol",expol);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 180:135: -> ^( EQN $eqId) ID[$tName.text] ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:138: ^( EQN $eqId)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQN, "EQN"), root_1);
				adaptor.addChild(root_1, stream_eqId.nextNode());
				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, (Object)adaptor.create(ID, (tName!=null?tName.getText():null)));
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:180:167: ^( XCOORDS ID[$tName.text] $expol $xMin $xMax $step)
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:184:1: rateDef : 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( RATE ID eqn ) ;
	public final DynamoParser.rateDef_return rateDef() throws RecognitionException {
		DynamoParser.rateDef_return retval = new DynamoParser.rateDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		Token WS172=null;
		Token ID173=null;
		Token char_literal175=null;
		Token WS178=null;
		Token NEWLINE179=null;
		ParserRuleReturnScope timeExt174 =null;
		ParserRuleReturnScope eqn176 =null;
		ParserRuleReturnScope lineComment177 =null;

		Object char_literal171_tree=null;
		Object WS172_tree=null;
		Object ID173_tree=null;
		Object char_literal175_tree=null;
		Object WS178_tree=null;
		Object NEWLINE179_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:2: ( 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( RATE ID eqn ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:4: 'R' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE
			{
			char_literal171=(Token)match(input,59,FOLLOW_59_in_rateDef1569);  
			stream_59.add(char_literal171);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:8: ( WS )+
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
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:8: WS
					{
					WS172=(Token)match(input,WS,FOLLOW_WS_in_rateDef1571);  
					stream_WS.add(WS172);

					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					EarlyExitException eee = new EarlyExitException(57, input);
					throw eee;
				}
				cnt57++;
			}

			ID173=(Token)match(input,ID,FOLLOW_ID_in_rateDef1574);  
			stream_ID.add(ID173);

			pushFollow(FOLLOW_timeExt_in_rateDef1577);
			timeExt174=timeExt();
			state._fsp--;

			stream_timeExt.add(timeExt174.getTree());
			char_literal175=(Token)match(input,54,FOLLOW_54_in_rateDef1579);  
			stream_54.add(char_literal175);

			pushFollow(FOLLOW_eqn_in_rateDef1581);
			eqn176=eqn();
			state._fsp--;

			stream_eqn.add(eqn176.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:32: ( lineComment )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==WS) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==COMMENT) ) {
					alt58=1;
				}
			}
			switch (alt58) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:32: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_rateDef1583);
					lineComment177=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment177.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:45: ( WS )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==WS) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:45: WS
					{
					WS178=(Token)match(input,WS,FOLLOW_WS_in_rateDef1586);  
					stream_WS.add(WS178);

					}
					break;

			}

			NEWLINE179=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rateDef1589);  
			stream_NEWLINE.add(NEWLINE179);

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
			// 185:57: -> ^( RATE ID eqn )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:185:60: ^( RATE ID eqn )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:188:1: lvlDef : 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( LEVEL ID eqn ) ;
	public final DynamoParser.lvlDef_return lvlDef() throws RecognitionException {
		DynamoParser.lvlDef_return retval = new DynamoParser.lvlDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal180=null;
		Token WS181=null;
		Token ID182=null;
		Token char_literal184=null;
		Token WS187=null;
		Token NEWLINE188=null;
		ParserRuleReturnScope timeExt183 =null;
		ParserRuleReturnScope eqn185 =null;
		ParserRuleReturnScope lineComment186 =null;

		Object char_literal180_tree=null;
		Object WS181_tree=null;
		Object ID182_tree=null;
		Object char_literal184_tree=null;
		Object WS187_tree=null;
		Object NEWLINE188_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_eqn=new RewriteRuleSubtreeStream(adaptor,"rule eqn");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:2: ( 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( LEVEL ID eqn ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:4: 'L' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE
			{
			char_literal180=(Token)match(input,57,FOLLOW_57_in_lvlDef1612);  
			stream_57.add(char_literal180);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:8: ( WS )+
			int cnt60=0;
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==WS) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:8: WS
					{
					WS181=(Token)match(input,WS,FOLLOW_WS_in_lvlDef1614);  
					stream_WS.add(WS181);

					}
					break;

				default :
					if ( cnt60 >= 1 ) break loop60;
					EarlyExitException eee = new EarlyExitException(60, input);
					throw eee;
				}
				cnt60++;
			}

			ID182=(Token)match(input,ID,FOLLOW_ID_in_lvlDef1617);  
			stream_ID.add(ID182);

			pushFollow(FOLLOW_timeExt_in_lvlDef1619);
			timeExt183=timeExt();
			state._fsp--;

			stream_timeExt.add(timeExt183.getTree());
			char_literal184=(Token)match(input,54,FOLLOW_54_in_lvlDef1621);  
			stream_54.add(char_literal184);

			pushFollow(FOLLOW_eqn_in_lvlDef1623);
			eqn185=eqn();
			state._fsp--;

			stream_eqn.add(eqn185.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:31: ( lineComment )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WS) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==COMMENT) ) {
					alt61=1;
				}
			}
			switch (alt61) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:31: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_lvlDef1625);
					lineComment186=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment186.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:44: ( WS )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==WS) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:44: WS
					{
					WS187=(Token)match(input,WS,FOLLOW_WS_in_lvlDef1628);  
					stream_WS.add(WS187);

					}
					break;

			}

			NEWLINE188=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_lvlDef1632);  
			stream_NEWLINE.add(NEWLINE188);

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
			// 189:57: -> ^( LEVEL ID eqn )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:189:60: ^( LEVEL ID eqn )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:191:1: tblDef : 'T' ( WS )+ ID '=' rangeList ( lineComment )? ( WS )? NEWLINE -> ^( YCOORDS ID ^( PTS rangeList ) ) ;
	public final DynamoParser.tblDef_return tblDef() throws RecognitionException {
		DynamoParser.tblDef_return retval = new DynamoParser.tblDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal189=null;
		Token WS190=null;
		Token ID191=null;
		Token char_literal192=null;
		Token WS195=null;
		Token NEWLINE196=null;
		ParserRuleReturnScope rangeList193 =null;
		ParserRuleReturnScope lineComment194 =null;

		Object char_literal189_tree=null;
		Object WS190_tree=null;
		Object ID191_tree=null;
		Object char_literal192_tree=null;
		Object WS195_tree=null;
		Object NEWLINE196_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_rangeList=new RewriteRuleSubtreeStream(adaptor,"rule rangeList");
		RewriteRuleSubtreeStream stream_lineComment=new RewriteRuleSubtreeStream(adaptor,"rule lineComment");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:2: ( 'T' ( WS )+ ID '=' rangeList ( lineComment )? ( WS )? NEWLINE -> ^( YCOORDS ID ^( PTS rangeList ) ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:4: 'T' ( WS )+ ID '=' rangeList ( lineComment )? ( WS )? NEWLINE
			{
			char_literal189=(Token)match(input,60,FOLLOW_60_in_tblDef1653);  
			stream_60.add(char_literal189);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:8: ( WS )+
			int cnt63=0;
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==WS) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:8: WS
					{
					WS190=(Token)match(input,WS,FOLLOW_WS_in_tblDef1655);  
					stream_WS.add(WS190);

					}
					break;

				default :
					if ( cnt63 >= 1 ) break loop63;
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
			}

			ID191=(Token)match(input,ID,FOLLOW_ID_in_tblDef1658);  
			stream_ID.add(ID191);

			char_literal192=(Token)match(input,54,FOLLOW_54_in_tblDef1660);  
			stream_54.add(char_literal192);

			pushFollow(FOLLOW_rangeList_in_tblDef1662);
			rangeList193=rangeList();
			state._fsp--;

			stream_rangeList.add(rangeList193.getTree());
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:29: ( lineComment )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==WS) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==COMMENT) ) {
					alt64=1;
				}
			}
			switch (alt64) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:29: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_tblDef1664);
					lineComment194=lineComment();
					state._fsp--;

					stream_lineComment.add(lineComment194.getTree());
					}
					break;

			}

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:42: ( WS )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==WS) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:42: WS
					{
					WS195=(Token)match(input,WS,FOLLOW_WS_in_tblDef1667);  
					stream_WS.add(WS195);

					}
					break;

			}

			NEWLINE196=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_tblDef1671);  
			stream_NEWLINE.add(NEWLINE196);

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
			// 192:55: -> ^( YCOORDS ID ^( PTS rangeList ) )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:58: ^( YCOORDS ID ^( PTS rangeList ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YCOORDS, "YCOORDS"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:192:71: ^( PTS rangeList )
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


	public static class lineComment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lineComment"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:195:1: lineComment : WS COMMENT ;
	public final DynamoParser.lineComment_return lineComment() throws RecognitionException {
		DynamoParser.lineComment_return retval = new DynamoParser.lineComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS197=null;
		Token COMMENT198=null;

		Object WS197_tree=null;
		Object COMMENT198_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:195:12: ( WS COMMENT )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:195:14: WS COMMENT
			{
			root_0 = (Object)adaptor.nil();


			WS197=(Token)match(input,WS,FOLLOW_WS_in_lineComment1694); 
			WS197_tree = (Object)adaptor.create(WS197);
			adaptor.addChild(root_0, WS197_tree);

			COMMENT198=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_lineComment1696); 
			COMMENT198_tree = (Object)adaptor.create(COMMENT198);
			adaptor.addChild(root_0, COMMENT198_tree);

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


	public static class rangeList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rangeList"
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:197:1: rangeList : NUMBER ( ( ',' | '/' ) NUMBER )* -> ( NUMBER )+ ;
	public final DynamoParser.rangeList_return rangeList() throws RecognitionException {
		DynamoParser.rangeList_return retval = new DynamoParser.rangeList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER199=null;
		Token char_literal200=null;
		Token char_literal201=null;
		Token NUMBER202=null;

		Object NUMBER199_tree=null;
		Object char_literal200_tree=null;
		Object char_literal201_tree=null;
		Object NUMBER202_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:2: ( NUMBER ( ( ',' | '/' ) NUMBER )* -> ( NUMBER )+ )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:5: NUMBER ( ( ',' | '/' ) NUMBER )*
			{
			NUMBER199=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rangeList1707);  
			stream_NUMBER.add(NUMBER199);

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:12: ( ( ',' | '/' ) NUMBER )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==51||LA67_0==53) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:13: ( ',' | '/' ) NUMBER
					{
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:13: ( ',' | '/' )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==51) ) {
						alt66=1;
					}
					else if ( (LA66_0==53) ) {
						alt66=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:14: ','
							{
							char_literal200=(Token)match(input,51,FOLLOW_51_in_rangeList1711);  
							stream_51.add(char_literal200);

							}
							break;
						case 2 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:198:18: '/'
							{
							char_literal201=(Token)match(input,53,FOLLOW_53_in_rangeList1713);  
							stream_53.add(char_literal201);

							}
							break;

					}

					NUMBER202=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rangeList1716);  
					stream_NUMBER.add(NUMBER202);

					}
					break;

				default :
					break loop67;
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
			// 198:32: -> ( NUMBER )+
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:201:1: eqn : expr -> ^( EQN expr ) ;
	public final DynamoParser.eqn_return eqn() throws RecognitionException {
		DynamoParser.eqn_return retval = new DynamoParser.eqn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr203 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:202:2: ( expr -> ^( EQN expr ) )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:202:4: expr
			{
			pushFollow(FOLLOW_expr_in_eqn1735);
			expr203=expr();
			state._fsp--;

			stream_expr.add(expr203.getTree());
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
			// 202:9: -> ^( EQN expr )
			{
				// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:202:12: ^( EQN expr )
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:204:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final DynamoParser.expr_return expr() throws RecognitionException {
		DynamoParser.expr_return retval = new DynamoParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set205=null;
		ParserRuleReturnScope multExpr204 =null;
		ParserRuleReturnScope multExpr206 =null;

		Object set205_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:205:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:205:9: multExpr ( ( '+' | '-' ) multExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr1758);
			multExpr204=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr204.getTree());

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:206:9: ( ( '+' | '-' ) multExpr )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==50||LA68_0==52) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:206:13: ( '+' | '-' ) multExpr
					{
					set205=input.LT(1);
					if ( input.LA(1)==50||input.LA(1)==52 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set205));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr1779);
					multExpr206=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr206.getTree());

					}
					break;

				default :
					break loop68;
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:209:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
	public final DynamoParser.multExpr_return multExpr() throws RecognitionException {
		DynamoParser.multExpr_return retval = new DynamoParser.multExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set208=null;
		ParserRuleReturnScope atom207 =null;
		ParserRuleReturnScope atom209 =null;

		Object set208_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:210:5: ( atom ( ( '*' | '/' ) atom )* )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:210:9: atom ( ( '*' | '/' ) atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpr1803);
			atom207=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom207.getTree());

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:210:14: ( ( '*' | '/' ) atom )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==53) ) {
					int LA69_2 = input.LA(2);
					if ( (LA69_2==ID) ) {
						int LA69_4 = input.LA(3);
						if ( (LA69_4==NEWLINE||LA69_4==WS||(LA69_4 >= 47 && LA69_4 <= 53)||LA69_4==66) ) {
							alt69=1;
						}

					}
					else if ( (LA69_2==NUMBER||LA69_2==47||LA69_2==50||LA69_2==52) ) {
						alt69=1;
					}

				}
				else if ( (LA69_0==49) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:210:16: ( '*' | '/' ) atom
					{
					set208=input.LT(1);
					if ( input.LA(1)==49||input.LA(1)==53 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set208));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr1813);
					atom209=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom209.getTree());

					}
					break;

				default :
					break loop69;
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:213:1: atom : ( NUMBER |cc= '-' ID ( timeExt )? -> UNARYMINUS[$cc,\"-\"] ID | '+' ID ( timeExt )? -> ID | ID ( timeExt )? -> ID | funcRef | '(' expr ')' );
	public final DynamoParser.atom_return atom() throws RecognitionException {
		DynamoParser.atom_return retval = new DynamoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token cc=null;
		Token NUMBER210=null;
		Token ID211=null;
		Token char_literal213=null;
		Token ID214=null;
		Token ID216=null;
		Token char_literal219=null;
		Token char_literal221=null;
		ParserRuleReturnScope timeExt212 =null;
		ParserRuleReturnScope timeExt215 =null;
		ParserRuleReturnScope timeExt217 =null;
		ParserRuleReturnScope funcRef218 =null;
		ParserRuleReturnScope expr220 =null;

		Object cc_tree=null;
		Object NUMBER210_tree=null;
		Object ID211_tree=null;
		Object char_literal213_tree=null;
		Object ID214_tree=null;
		Object ID216_tree=null;
		Object char_literal219_tree=null;
		Object char_literal221_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_timeExt=new RewriteRuleSubtreeStream(adaptor,"rule timeExt");

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:214:5: ( NUMBER |cc= '-' ID ( timeExt )? -> UNARYMINUS[$cc,\"-\"] ID | '+' ID ( timeExt )? -> ID | ID ( timeExt )? -> ID | funcRef | '(' expr ')' )
			int alt73=6;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt73=1;
				}
				break;
			case 52:
				{
				alt73=2;
				}
				break;
			case 50:
				{
				alt73=3;
				}
				break;
			case ID:
				{
				int LA73_4 = input.LA(2);
				if ( (LA73_4==47) ) {
					alt73=5;
				}
				else if ( (LA73_4==NEWLINE||LA73_4==WS||(LA73_4 >= 48 && LA73_4 <= 53)||LA73_4==66) ) {
					alt73=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 47:
				{
				alt73=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:214:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER210=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1838); 
					NUMBER210_tree = (Object)adaptor.create(NUMBER210);
					adaptor.addChild(root_0, NUMBER210_tree);

					 String temp = (NUMBER210!=null?NUMBER210.getText():null); 
					    	  NUMBER210.setText(temp.replace("E", "e"));
					    	
					}
					break;
				case 2 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:219:9: cc= '-' ID ( timeExt )?
					{
					cc=(Token)match(input,52,FOLLOW_52_in_atom1863);  
					stream_52.add(cc);

					ID211=(Token)match(input,ID,FOLLOW_ID_in_atom1865);  
					stream_ID.add(ID211);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:219:20: ( timeExt )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==66) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:219:20: timeExt
							{
							pushFollow(FOLLOW_timeExt_in_atom1868);
							timeExt212=timeExt();
							state._fsp--;

							stream_timeExt.add(timeExt212.getTree());
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
					// 219:29: -> UNARYMINUS[$cc,\"-\"] ID
					{
						adaptor.addChild(root_0, (Object)adaptor.create(UNARYMINUS, cc, "-"));
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:220:9: '+' ID ( timeExt )?
					{
					char_literal213=(Token)match(input,50,FOLLOW_50_in_atom1886);  
					stream_50.add(char_literal213);

					ID214=(Token)match(input,ID,FOLLOW_ID_in_atom1888);  
					stream_ID.add(ID214);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:220:17: ( timeExt )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==66) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:220:17: timeExt
							{
							pushFollow(FOLLOW_timeExt_in_atom1891);
							timeExt215=timeExt();
							state._fsp--;

							stream_timeExt.add(timeExt215.getTree());
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
					// 220:26: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:221:9: ID ( timeExt )?
					{
					ID216=(Token)match(input,ID,FOLLOW_ID_in_atom1906);  
					stream_ID.add(ID216);

					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:221:13: ( timeExt )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==66) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:221:13: timeExt
							{
							pushFollow(FOLLOW_timeExt_in_atom1909);
							timeExt217=timeExt();
							state._fsp--;

							stream_timeExt.add(timeExt217.getTree());
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
					// 221:22: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:222:9: funcRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funcRef_in_atom1924);
					funcRef218=funcRef();
					state._fsp--;

					adaptor.addChild(root_0, funcRef218.getTree());

					}
					break;
				case 6 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:223:9: '(' expr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal219=(Token)match(input,47,FOLLOW_47_in_atom1934); 
					char_literal219_tree = (Object)adaptor.create(char_literal219);
					adaptor.addChild(root_0, char_literal219_tree);

					pushFollow(FOLLOW_expr_in_atom1936);
					expr220=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr220.getTree());

					char_literal221=(Token)match(input,48,FOLLOW_48_in_atom1938); 
					char_literal221_tree = (Object)adaptor.create(char_literal221);
					adaptor.addChild(root_0, char_literal221_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:226:1: funcRef : ID '(' paramList ')' ;
	public final DynamoParser.funcRef_return funcRef() throws RecognitionException {
		DynamoParser.funcRef_return retval = new DynamoParser.funcRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID222=null;
		Token char_literal223=null;
		Token char_literal225=null;
		ParserRuleReturnScope paramList224 =null;

		Object ID222_tree=null;
		Object char_literal223_tree=null;
		Object char_literal225_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:227:5: ( ID '(' paramList ')' )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:227:9: ID '(' paramList ')'
			{
			root_0 = (Object)adaptor.nil();


			ID222=(Token)match(input,ID,FOLLOW_ID_in_funcRef1963); 
			ID222_tree = (Object)adaptor.create(ID222);
			adaptor.addChild(root_0, ID222_tree);

			char_literal223=(Token)match(input,47,FOLLOW_47_in_funcRef1965); 
			char_literal223_tree = (Object)adaptor.create(char_literal223);
			adaptor.addChild(root_0, char_literal223_tree);

			pushFollow(FOLLOW_paramList_in_funcRef1967);
			paramList224=paramList();
			state._fsp--;

			adaptor.addChild(root_0, paramList224.getTree());

			char_literal225=(Token)match(input,48,FOLLOW_48_in_funcRef1969); 
			char_literal225_tree = (Object)adaptor.create(char_literal225);
			adaptor.addChild(root_0, char_literal225_tree);

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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:230:1: paramList : expr ( ',' expr )* ;
	public final DynamoParser.paramList_return paramList() throws RecognitionException {
		DynamoParser.paramList_return retval = new DynamoParser.paramList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal227=null;
		ParserRuleReturnScope expr226 =null;
		ParserRuleReturnScope expr228 =null;

		Object char_literal227_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:231:2: ( expr ( ',' expr )* )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:231:7: expr ( ',' expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_paramList1992);
			expr226=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr226.getTree());

			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:231:12: ( ',' expr )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==51) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:231:13: ',' expr
					{
					char_literal227=(Token)match(input,51,FOLLOW_51_in_paramList1995); 
					char_literal227_tree = (Object)adaptor.create(char_literal227);
					adaptor.addChild(root_0, char_literal227_tree);

					pushFollow(FOLLOW_expr_in_paramList1997);
					expr228=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr228.getTree());

					}
					break;

				default :
					break loop74;
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
	// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:234:1: timeExt : '\\.' JKL ;
	public final DynamoParser.timeExt_return timeExt() throws RecognitionException {
		DynamoParser.timeExt_return retval = new DynamoParser.timeExt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal229=null;
		Token JKL230=null;

		Object char_literal229_tree=null;
		Object JKL230_tree=null;

		try {
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:234:9: ( '\\.' JKL )
			// C:\\git3\\SDXlate\\dynamo_parser/src/org/sdxchange/grammars/dynamo/Dynamo.g:234:11: '\\.' JKL
			{
			root_0 = (Object)adaptor.nil();


			char_literal229=(Token)match(input,66,FOLLOW_66_in_timeExt2011); 
			char_literal229_tree = (Object)adaptor.create(char_literal229);
			adaptor.addChild(root_0, char_literal229_tree);

			JKL230=(Token)match(input,JKL,FOLLOW_JKL_in_timeExt2013); 
			JKL230_tree = (Object)adaptor.create(JKL230);
			adaptor.addChild(root_0, JKL230_tree);

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

	// Delegated rules


	protected DFA54 dfa54 = new DFA54(this);
	static final String DFA54_eotS =
		"\11\uffff";
	static final String DFA54_eofS =
		"\11\uffff";
	static final String DFA54_minS =
		"\1\67\1\54\1\14\1\102\1\17\1\66\1\14\2\uffff";
	static final String DFA54_maxS =
		"\1\67\2\54\1\102\1\17\1\66\1\100\2\uffff";
	static final String DFA54_acceptS =
		"\7\uffff\1\1\1\2";
	static final String DFA54_specialS =
		"\11\uffff}>";
	static final String[] DFA54_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\37\uffff\1\2",
			"\1\4",
			"\1\5",
			"\1\6",
			"\1\10\14\uffff\1\10\25\uffff\1\10\2\uffff\1\10\1\uffff\1\10\10\uffff"+
			"\4\7",
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
			return "174:1: auxDef : ( 'A' ( WS )+ ID timeExt '=' tableFunction ( lineComment )? ( WS )? NEWLINE -> ^( TAUX ID tableFunction ) | 'A' ( WS )+ ID timeExt '=' eqn ( lineComment )? ( WS )? NEWLINE -> ^( AUX ID eqn ) );";
		}
	}

	public static final BitSet FOLLOW_macroDef_in_prog190 = new BitSet(new long[]{0x1F80000101840102L});
	public static final BitSet FOLLOW_defaultModule_in_prog193 = new BitSet(new long[]{0x0000000100800102L});
	public static final BitSet FOLLOW_namedModule_in_prog196 = new BitSet(new long[]{0x0000000100800102L});
	public static final BitSet FOLLOW_controlSector_in_prog200 = new BitSet(new long[]{0x0000004801000000L});
	public static final BitSet FOLLOW_controlStat_in_prog203 = new BitSet(new long[]{0x0000004891800002L});
	public static final BitSet FOLLOW_comment_in_prog207 = new BitSet(new long[]{0x0000004891800002L});
	public static final BitSet FOLLOW_viewSpec_in_prog212 = new BitSet(new long[]{0x0000000090800002L});
	public static final BitSet FOLLOW_NEWLINE_in_prog217 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_controlSector_in_controlModule271 = new BitSet(new long[]{0x0000004801000000L});
	public static final BitSet FOLLOW_controlStat_in_controlModule274 = new BitSet(new long[]{0x0000004891000002L});
	public static final BitSet FOLLOW_comment_in_controlModule278 = new BitSet(new long[]{0x0000004891000002L});
	public static final BitSet FOLLOW_viewSpec_in_controlModule283 = new BitSet(new long[]{0x0000000090000002L});
	public static final BitSet FOLLOW_simSpec_in_controlStat339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_runSpec_in_controlStat350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_defaultModule375 = new BitSet(new long[]{0x1F80000001000002L});
	public static final BitSet FOLLOW_comment_in_defaultModule379 = new BitSet(new long[]{0x1F80000001000002L});
	public static final BitSet FOLLOW_sector_in_namedModule420 = new BitSet(new long[]{0x1F80000001000000L});
	public static final BitSet FOLLOW_definition_in_namedModule423 = new BitSet(new long[]{0x1F80000001000002L});
	public static final BitSet FOLLOW_comment_in_namedModule427 = new BitSet(new long[]{0x1F80000001000002L});
	public static final BitSet FOLLOW_auxDef_in_definition472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvlDef_in_definition482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initDef_in_definition492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDef_in_definition500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rateDef_in_definition511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tblDef_in_definition522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment544 = new BitSet(new long[]{0x0000000000800020L});
	public static final BitSet FOLLOW_COMMENT_in_comment546 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_comment549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PSECTOR_in_sector573 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_sector575 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_sector578 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SECTOR_in_sector581 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_sector583 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_sector585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_sector588 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_sector590 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_sector593 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_sector596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSECTOR_in_controlSector614 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_controlSector616 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_controlSector619 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SECTOR_in_controlSector622 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_controlSector624 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_controlSector626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_controlSector628 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_controlSector630 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_controlSector633 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_controlSector636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLOT_in_viewSpec666 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_viewSpec668 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_plotVarList_in_viewSpec671 = new BitSet(new long[]{0x0020000000800000L});
	public static final BitSet FOLLOW_53_in_viewSpec675 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_plotVarList_in_viewSpec678 = new BitSet(new long[]{0x0020000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_viewSpec682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_viewSpec702 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_viewSpec704 = new BitSet(new long[]{0x0000100002001000L});
	public static final BitSet FOLLOW_varList_in_viewSpec707 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_viewSpec709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scaleSpec_in_plotVarList732 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_51_in_plotVarList735 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_scaleSpec_in_plotVarList737 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_plotVar_in_scaleSpec770 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_scaleRange_in_scaleSpec773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_plotVar801 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_plotVar803 = new BitSet(new long[]{0x0016000002001000L});
	public static final BitSet FOLLOW_plotChar_in_plotVar805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_plotChar820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_plotChar822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_plotChar824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_plotChar826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_plotChar828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_scaleRange844 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_min_in_scaleRange846 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_scaleRange848 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_max_in_scaleRange850 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_scaleRange852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_min883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_max889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUN_in_runSpec909 = new BitSet(new long[]{0x0000000000800020L});
	public static final BitSet FOLLOW_COMMENT_in_runSpec911 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_runSpec914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_in_simSpec938 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_simSpec940 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_paramAssignment_in_simSpec942 = new BitSet(new long[]{0x0028000000800000L});
	public static final BitSet FOLLOW_51_in_simSpec946 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_53_in_simSpec948 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_paramAssignment_in_simSpec951 = new BitSet(new long[]{0x0028000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_simSpec955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroStart_in_macroDef985 = new BitSet(new long[]{0x1F80000001002000L});
	public static final BitSet FOLLOW_intrnlStmt_in_macroDef987 = new BitSet(new long[]{0x1F80000001002000L});
	public static final BitSet FOLLOW_definition_in_macroDef991 = new BitSet(new long[]{0x1F80000001100000L});
	public static final BitSet FOLLOW_comment_in_macroDef995 = new BitSet(new long[]{0x1F80000001100000L});
	public static final BitSet FOLLOW_macroEnd_in_macroDef1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MACRO_in_macroStart1032 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_macroStart1034 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_macroStart1037 = new BitSet(new long[]{0x0000900000800000L});
	public static final BitSet FOLLOW_47_in_macroStart1040 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_formalParams_in_macroStart1042 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_macroStart1043 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_macroStart1048 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_macroStart1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTRN_in_intrnlStmt1071 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_intrnlStmt1073 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_intrnlStmt1076 = new BitSet(new long[]{0x0008000000800000L});
	public static final BitSet FOLLOW_51_in_intrnlStmt1079 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_intrnlStmt1081 = new BitSet(new long[]{0x0008000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_intrnlStmt1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEND_in_macroEnd1109 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_macroEnd1112 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_macroEnd1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_formalParams1134 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_51_in_formalParams1137 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_formalParams1139 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_ID_in_paramAssignment1165 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_paramAssignment1167 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_expr_in_paramAssignment1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_colspec_in_varList1203 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_varList1206 = new BitSet(new long[]{0x0028000000000002L});
	public static final BitSet FOLLOW_set_in_varList1209 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_varList1215 = new BitSet(new long[]{0x0028000000000002L});
	public static final BitSet FOLLOW_47_in_drawInterval1230 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_intervalStart_in_drawInterval1232 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_drawInterval1234 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_intervalStop_in_drawInterval1236 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_drawInterval1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_intervalStart1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_intervalStop1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_colspec1300 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_colspec1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_constDef1317 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_constDef1319 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_constDef1324 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_constDef1326 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_eqn_in_constDef1328 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_constDef1330 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_constDef1333 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_constDef1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_initDef1357 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_initDef1359 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_initDef1362 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_initDef1364 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_eqn_in_initDef1366 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_initDef1368 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_initDef1371 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_initDef1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_auxDef1395 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_auxDef1397 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_auxDef1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_auxDef1402 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_auxDef1404 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_tableFunction_in_auxDef1406 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_auxDef1408 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_auxDef1411 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_auxDef1431 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_auxDef1433 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_auxDef1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_auxDef1438 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_auxDef1440 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_eqn_in_auxDef1442 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_auxDef1444 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_auxDef1447 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_tableFunction1479 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_64_in_tableFunction1482 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_63_in_tableFunction1486 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_61_in_tableFunction1489 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_tableFunction1493 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_tableFunction1497 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_tableFunction1499 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_tableFunction1503 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_tableFunction1505 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_tableFunction1508 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1512 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_tableFunction1514 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1518 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_tableFunction1520 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_NUMBER_in_tableFunction1524 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_tableFunction1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_rateDef1569 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_rateDef1571 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_rateDef1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_rateDef1577 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_rateDef1579 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_eqn_in_rateDef1581 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_rateDef1583 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_rateDef1586 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_rateDef1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_lvlDef1612 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_lvlDef1614 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_lvlDef1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_lvlDef1619 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_lvlDef1621 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_eqn_in_lvlDef1623 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_lvlDef1625 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_lvlDef1628 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_lvlDef1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_tblDef1653 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_tblDef1655 = new BitSet(new long[]{0x0000100000001000L});
	public static final BitSet FOLLOW_ID_in_tblDef1658 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_tblDef1660 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_rangeList_in_tblDef1662 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_lineComment_in_tblDef1664 = new BitSet(new long[]{0x0000100000800000L});
	public static final BitSet FOLLOW_WS_in_tblDef1667 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NEWLINE_in_tblDef1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_lineComment1694 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMENT_in_lineComment1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_rangeList1707 = new BitSet(new long[]{0x0028000000000002L});
	public static final BitSet FOLLOW_51_in_rangeList1711 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_53_in_rangeList1713 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_NUMBER_in_rangeList1716 = new BitSet(new long[]{0x0028000000000002L});
	public static final BitSet FOLLOW_expr_in_eqn1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr1758 = new BitSet(new long[]{0x0014000000000002L});
	public static final BitSet FOLLOW_set_in_expr1773 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_multExpr_in_expr1779 = new BitSet(new long[]{0x0014000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr1803 = new BitSet(new long[]{0x0022000000000002L});
	public static final BitSet FOLLOW_set_in_multExpr1807 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_atom_in_multExpr1813 = new BitSet(new long[]{0x0022000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_atom1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_atom1863 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_atom1865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_atom1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_atom1886 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_atom1888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_atom1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_timeExt_in_atom1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcRef_in_atom1924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_atom1934 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_expr_in_atom1936 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_atom1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_funcRef1963 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_funcRef1965 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_paramList_in_funcRef1967 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_funcRef1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_paramList1992 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_51_in_paramList1995 = new BitSet(new long[]{0x0014800002001000L});
	public static final BitSet FOLLOW_expr_in_paramList1997 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_66_in_timeExt2011 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JKL_in_timeExt2013 = new BitSet(new long[]{0x0000000000000002L});
}
