// $ANTLR 3.5.2 ./examples/DynWalk.g 2014-11-29 01:05:40

package examples;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DynWalk extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOTC", "ID", "INT", "INTRN", 
		"JKL", "MACRO", "MEND", "NEWLINE", "NOTE", "PLOT", "PRINT", "RUN", "SECTOR", 
		"SPEC", "UNARY", "WS", "'('", "')'", "'*'", "'+'", "','", "'/'", "'='", 
		"'A'", "'C'", "'E'", "'L'", "'N'", "'P'", "'R'", "'T'", "'['", "'.'", 
		"']'", "'e'", "VARDEF", "'\\.'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int DOTC=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int INTRN=7;
	public static final int JKL=8;
	public static final int MACRO=9;
	public static final int MEND=10;
	public static final int NEWLINE=11;
	public static final int NOTE=12;
	public static final int PLOT=13;
	public static final int PRINT=14;
	public static final int RUN=15;
	public static final int SECTOR=16;
	public static final int SPEC=17;
	public static final int UNARY=18;
	public static final int WS=19;
	public static final int T__40=40;
	public static final int VARDEF=39;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public DynWalk(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public DynWalk(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DynWalk.tokenNames; }
	@Override public String getGrammarFileName() { return "./examples/DynWalk.g"; }



	// $ANTLR start "prog"
	// ./examples/DynWalk.g:20:1: prog : (x= defaultModule )? ( namedModule )* ;
	public final void prog() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:20:5: ( (x= defaultModule )? ( namedModule )* )
			// ./examples/DynWalk.g:20:7: (x= defaultModule )? ( namedModule )*
			{
			// ./examples/DynWalk.g:20:8: (x= defaultModule )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= 27 && LA1_0 <= 28)||(LA1_0 >= 30 && LA1_0 <= 31)||LA1_0==33) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// ./examples/DynWalk.g:20:8: x= defaultModule
					{
					pushFollow(FOLLOW_defaultModule_in_prog73);
					defaultModule();
					state._fsp--;

					}
					break;

			}

			// ./examples/DynWalk.g:20:24: ( namedModule )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==NOTE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ./examples/DynWalk.g:20:24: namedModule
					{
					pushFollow(FOLLOW_namedModule_in_prog76);
					namedModule();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "defaultModule"
	// ./examples/DynWalk.g:23:1: defaultModule : ( definition )+ ;
	public final void defaultModule() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:24:2: ( ( definition )+ )
			// ./examples/DynWalk.g:24:4: ( definition )+
			{
			// ./examples/DynWalk.g:24:4: ( definition )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 27 && LA3_0 <= 28)||(LA3_0 >= 30 && LA3_0 <= 31)||LA3_0==33) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ./examples/DynWalk.g:24:5: definition
					{
					pushFollow(FOLLOW_definition_in_defaultModule94);
					definition();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "defaultModule"



	// $ANTLR start "namedModule"
	// ./examples/DynWalk.g:27:1: namedModule : sector ( definition )+ ;
	public final void namedModule() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:28:6: ( sector ( definition )+ )
			// ./examples/DynWalk.g:28:8: sector ( definition )+
			{
			pushFollow(FOLLOW_sector_in_namedModule119);
			sector();
			state._fsp--;

			// ./examples/DynWalk.g:28:15: ( definition )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 27 && LA4_0 <= 28)||(LA4_0 >= 30 && LA4_0 <= 31)||LA4_0==33) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./examples/DynWalk.g:28:16: definition
					{
					pushFollow(FOLLOW_definition_in_namedModule122);
					definition();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "namedModule"



	// $ANTLR start "definition"
	// ./examples/DynWalk.g:31:1: definition returns [String value] : (x= auxDef | lvlDef | initDef | constDef | rateDef );
	public final String definition() throws RecognitionException {
		String value = null;


		try {
			// ./examples/DynWalk.g:32:5: (x= auxDef | lvlDef | initDef | constDef | rateDef )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt5=1;
				}
				break;
			case 30:
				{
				alt5=2;
				}
				break;
			case 31:
				{
				alt5=3;
				}
				break;
			case 28:
				{
				alt5=4;
				}
				break;
			case 33:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ./examples/DynWalk.g:32:7: x= auxDef
					{
					pushFollow(FOLLOW_auxDef_in_definition148);
					auxDef();
					state._fsp--;

					 value ="aux"; 
					}
					break;
				case 2 :
					// ./examples/DynWalk.g:33:9: lvlDef
					{
					pushFollow(FOLLOW_lvlDef_in_definition161);
					lvlDef();
					state._fsp--;

					 value ="lvl"; 
					}
					break;
				case 3 :
					// ./examples/DynWalk.g:34:9: initDef
					{
					pushFollow(FOLLOW_initDef_in_definition173);
					initDef();
					state._fsp--;

					 value ="init"; 
					}
					break;
				case 4 :
					// ./examples/DynWalk.g:35:7: constDef
					{
					pushFollow(FOLLOW_constDef_in_definition183);
					constDef();
					state._fsp--;

					 value ="const"; 
					}
					break;
				case 5 :
					// ./examples/DynWalk.g:36:9: rateDef
					{
					pushFollow(FOLLOW_rateDef_in_definition195);
					rateDef();
					state._fsp--;

					 value ="rate"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "definition"



	// $ANTLR start "constDef"
	// ./examples/DynWalk.g:39:1: constDef : 'C' ( WS )+ id= ID '=' expr ( lineComment )? NEWLINE ;
	public final void constDef() throws RecognitionException {
		CommonTree id=null;

		try {
			// ./examples/DynWalk.g:39:9: ( 'C' ( WS )+ id= ID '=' expr ( lineComment )? NEWLINE )
			// ./examples/DynWalk.g:39:11: 'C' ( WS )+ id= ID '=' expr ( lineComment )? NEWLINE
			{
			match(input,28,FOLLOW_28_in_constDef209); 
			// ./examples/DynWalk.g:39:15: ( WS )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ./examples/DynWalk.g:39:15: WS
					{
					match(input,WS,FOLLOW_WS_in_constDef211); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			id=(CommonTree)match(input,ID,FOLLOW_ID_in_constDef216); 
			match(input,26,FOLLOW_26_in_constDef218); 
			pushFollow(FOLLOW_expr_in_constDef220);
			expr();
			state._fsp--;

			// ./examples/DynWalk.g:39:34: ( lineComment )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==WS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ./examples/DynWalk.g:39:34: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_constDef222);
					lineComment();
					state._fsp--;

					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_constDef225); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constDef"



	// $ANTLR start "initDef"
	// ./examples/DynWalk.g:42:1: initDef : 'N' ( WS )+ ID '=' expr ( lineComment )? NEWLINE ;
	public final void initDef() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:43:2: ( 'N' ( WS )+ ID '=' expr ( lineComment )? NEWLINE )
			// ./examples/DynWalk.g:43:4: 'N' ( WS )+ ID '=' expr ( lineComment )? NEWLINE
			{
			match(input,31,FOLLOW_31_in_initDef238); 
			// ./examples/DynWalk.g:43:8: ( WS )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==WS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./examples/DynWalk.g:43:8: WS
					{
					match(input,WS,FOLLOW_WS_in_initDef240); 
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input,ID,FOLLOW_ID_in_initDef243); 
			match(input,26,FOLLOW_26_in_initDef245); 
			pushFollow(FOLLOW_expr_in_initDef247);
			expr();
			state._fsp--;

			// ./examples/DynWalk.g:43:24: ( lineComment )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==WS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// ./examples/DynWalk.g:43:24: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_initDef249);
					lineComment();
					state._fsp--;

					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_initDef252); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "initDef"



	// $ANTLR start "auxDef"
	// ./examples/DynWalk.g:46:1: auxDef : 'A' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE ;
	public final void auxDef() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:47:2: ( 'A' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE )
			// ./examples/DynWalk.g:47:4: 'A' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE
			{
			match(input,27,FOLLOW_27_in_auxDef263); 
			// ./examples/DynWalk.g:47:8: ( WS )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ./examples/DynWalk.g:47:8: WS
					{
					match(input,WS,FOLLOW_WS_in_auxDef265); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input,ID,FOLLOW_ID_in_auxDef268); 
			pushFollow(FOLLOW_timeExt_in_auxDef270);
			timeExt();
			state._fsp--;

			match(input,26,FOLLOW_26_in_auxDef272); 
			pushFollow(FOLLOW_expr_in_auxDef274);
			expr();
			state._fsp--;

			// ./examples/DynWalk.g:47:32: ( lineComment )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ./examples/DynWalk.g:47:32: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_auxDef276);
					lineComment();
					state._fsp--;

					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_auxDef279); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "auxDef"



	// $ANTLR start "rateDef"
	// ./examples/DynWalk.g:50:1: rateDef : 'R' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE ;
	public final void rateDef() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:51:2: ( 'R' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE )
			// ./examples/DynWalk.g:51:4: 'R' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE
			{
			match(input,33,FOLLOW_33_in_rateDef290); 
			// ./examples/DynWalk.g:51:8: ( WS )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./examples/DynWalk.g:51:8: WS
					{
					match(input,WS,FOLLOW_WS_in_rateDef292); 
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input,ID,FOLLOW_ID_in_rateDef295); 
			pushFollow(FOLLOW_timeExt_in_rateDef297);
			timeExt();
			state._fsp--;

			match(input,26,FOLLOW_26_in_rateDef299); 
			pushFollow(FOLLOW_expr_in_rateDef301);
			expr();
			state._fsp--;

			// ./examples/DynWalk.g:51:32: ( lineComment )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==WS) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// ./examples/DynWalk.g:51:32: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_rateDef303);
					lineComment();
					state._fsp--;

					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_rateDef306); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rateDef"



	// $ANTLR start "timeExt"
	// ./examples/DynWalk.g:54:1: timeExt : '\\.' JKL ;
	public final void timeExt() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:54:9: ( '\\.' JKL )
			// ./examples/DynWalk.g:54:11: '\\.' JKL
			{
			match(input,40,FOLLOW_40_in_timeExt316); 
			match(input,JKL,FOLLOW_JKL_in_timeExt318); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "timeExt"



	// $ANTLR start "lvlDef"
	// ./examples/DynWalk.g:57:1: lvlDef : 'L' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE ;
	public final void lvlDef() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:58:2: ( 'L' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE )
			// ./examples/DynWalk.g:58:4: 'L' ( WS )+ ID timeExt '=' expr ( lineComment )? NEWLINE
			{
			match(input,30,FOLLOW_30_in_lvlDef332); 
			// ./examples/DynWalk.g:58:8: ( WS )+
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
					// ./examples/DynWalk.g:58:8: WS
					{
					match(input,WS,FOLLOW_WS_in_lvlDef334); 
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input,ID,FOLLOW_ID_in_lvlDef337); 
			pushFollow(FOLLOW_timeExt_in_lvlDef339);
			timeExt();
			state._fsp--;

			match(input,26,FOLLOW_26_in_lvlDef341); 
			pushFollow(FOLLOW_expr_in_lvlDef343);
			expr();
			state._fsp--;

			// ./examples/DynWalk.g:58:32: ( lineComment )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ./examples/DynWalk.g:58:32: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_lvlDef345);
					lineComment();
					state._fsp--;

					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_lvlDef348); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lvlDef"



	// $ANTLR start "sector"
	// ./examples/DynWalk.g:60:1: sector : NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE ;
	public final void sector() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:61:3: ( NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE )
			// ./examples/DynWalk.g:61:5: NOTE '*' 'P' ( WS )+ '[' SECTOR '=' ID ']' ( lineComment )? NEWLINE
			{
			match(input,NOTE,FOLLOW_NOTE_in_sector360); 
			match(input,22,FOLLOW_22_in_sector362); 
			match(input,32,FOLLOW_32_in_sector364); 
			// ./examples/DynWalk.g:61:18: ( WS )+
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
					// ./examples/DynWalk.g:61:18: WS
					{
					match(input,WS,FOLLOW_WS_in_sector366); 
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			match(input,35,FOLLOW_35_in_sector369); 
			match(input,SECTOR,FOLLOW_SECTOR_in_sector372); 
			match(input,26,FOLLOW_26_in_sector374); 
			match(input,ID,FOLLOW_ID_in_sector376); 
			match(input,37,FOLLOW_37_in_sector379); 
			// ./examples/DynWalk.g:61:46: ( lineComment )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==WS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ./examples/DynWalk.g:61:46: lineComment
					{
					pushFollow(FOLLOW_lineComment_in_sector381);
					lineComment();
					state._fsp--;

					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_sector385); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sector"



	// $ANTLR start "expr"
	// ./examples/DynWalk.g:64:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void expr() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:65:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// ./examples/DynWalk.g:65:9: multExpr ( ( '+' | '-' ) multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr402);
			multExpr();
			state._fsp--;

			// ./examples/DynWalk.g:66:9: ( ( '+' | '-' ) multExpr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==UNARY||LA18_0==23) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ./examples/DynWalk.g:66:13: ( '+' | '-' ) multExpr
					{
					if ( input.LA(1)==UNARY||input.LA(1)==23 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr423);
					multExpr();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// ./examples/DynWalk.g:69:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:70:5: ( atom ( ( '*' | '/' ) atom )* )
			// ./examples/DynWalk.g:70:9: atom ( ( '*' | '/' ) atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr446);
			atom();
			state._fsp--;

			// ./examples/DynWalk.g:70:14: ( ( '*' | '/' ) atom )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==22||LA19_0==25) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ./examples/DynWalk.g:70:16: ( '*' | '/' ) atom
					{
					if ( input.LA(1)==22||input.LA(1)==25 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr456);
					atom();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// ./examples/DynWalk.g:73:1: atom : ( fpNum | INT | ID ( timeExt )? | funcRef | '(' expr ')' );
	public final void atom() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:74:5: ( fpNum | INT | ID ( timeExt )? | funcRef | '(' expr ')' )
			int alt21=5;
			switch ( input.LA(1) ) {
			case UNARY:
			case 40:
				{
				alt21=1;
				}
				break;
			case INT:
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2==40) ) {
					alt21=1;
				}
				else if ( (LA21_2==NEWLINE||(LA21_2 >= UNARY && LA21_2 <= WS)||(LA21_2 >= 21 && LA21_2 <= 25)) ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ID:
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3==20) ) {
					alt21=4;
				}
				else if ( (LA21_3==NEWLINE||(LA21_3 >= UNARY && LA21_3 <= WS)||(LA21_3 >= 21 && LA21_3 <= 25)||LA21_3==40) ) {
					alt21=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 20:
				{
				alt21=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// ./examples/DynWalk.g:74:9: fpNum
					{
					pushFollow(FOLLOW_fpNum_in_atom480);
					fpNum();
					state._fsp--;

					}
					break;
				case 2 :
					// ./examples/DynWalk.g:75:9: INT
					{
					match(input,INT,FOLLOW_INT_in_atom490); 
					}
					break;
				case 3 :
					// ./examples/DynWalk.g:76:9: ID ( timeExt )?
					{
					match(input,ID,FOLLOW_ID_in_atom501); 
					// ./examples/DynWalk.g:76:13: ( timeExt )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==40) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// ./examples/DynWalk.g:76:13: timeExt
							{
							pushFollow(FOLLOW_timeExt_in_atom504);
							timeExt();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 4 :
					// ./examples/DynWalk.g:77:9: funcRef
					{
					pushFollow(FOLLOW_funcRef_in_atom515);
					funcRef();
					state._fsp--;

					}
					break;
				case 5 :
					// ./examples/DynWalk.g:78:9: '(' expr ')'
					{
					match(input,20,FOLLOW_20_in_atom525); 
					pushFollow(FOLLOW_expr_in_atom527);
					expr();
					state._fsp--;

					match(input,21,FOLLOW_21_in_atom529); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atom"



	// $ANTLR start "funcRef"
	// ./examples/DynWalk.g:81:1: funcRef : ID '(' paramList ')' ;
	public final void funcRef() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:82:5: ( ID '(' paramList ')' )
			// ./examples/DynWalk.g:82:9: ID '(' paramList ')'
			{
			match(input,ID,FOLLOW_ID_in_funcRef554); 
			match(input,20,FOLLOW_20_in_funcRef556); 
			pushFollow(FOLLOW_paramList_in_funcRef558);
			paramList();
			state._fsp--;

			match(input,21,FOLLOW_21_in_funcRef560); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funcRef"



	// $ANTLR start "paramList"
	// ./examples/DynWalk.g:85:1: paramList : expr ( ',' expr )* ;
	public final void paramList() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:86:2: ( expr ( ',' expr )* )
			// ./examples/DynWalk.g:86:7: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_paramList583);
			expr();
			state._fsp--;

			// ./examples/DynWalk.g:86:12: ( ',' expr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==24) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ./examples/DynWalk.g:86:13: ',' expr
					{
					match(input,24,FOLLOW_24_in_paramList586); 
					pushFollow(FOLLOW_expr_in_paramList588);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramList"



	// $ANTLR start "fpNum"
	// ./examples/DynWalk.g:90:1: fpNum : mantissa ( exponent )? ;
	public final void fpNum() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:91:2: ( mantissa ( exponent )? )
			// ./examples/DynWalk.g:91:4: mantissa ( exponent )?
			{
			pushFollow(FOLLOW_mantissa_in_fpNum606);
			mantissa();
			state._fsp--;

			// ./examples/DynWalk.g:91:13: ( exponent )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==29||LA23_0==38) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// ./examples/DynWalk.g:91:13: exponent
					{
					pushFollow(FOLLOW_exponent_in_fpNum608);
					exponent();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fpNum"



	// $ANTLR start "mantissa"
	// ./examples/DynWalk.g:94:1: mantissa : ( signedInt )? '\\.' INT ;
	public final void mantissa() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:95:2: ( ( signedInt )? '\\.' INT )
			// ./examples/DynWalk.g:95:4: ( signedInt )? '\\.' INT
			{
			// ./examples/DynWalk.g:95:4: ( signedInt )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==INT||LA24_0==UNARY) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ./examples/DynWalk.g:95:5: signedInt
					{
					pushFollow(FOLLOW_signedInt_in_mantissa623);
					signedInt();
					state._fsp--;

					}
					break;

			}

			match(input,40,FOLLOW_40_in_mantissa627); 
			match(input,INT,FOLLOW_INT_in_mantissa629); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mantissa"



	// $ANTLR start "exponent"
	// ./examples/DynWalk.g:98:1: exponent : ( 'E' | 'e' ) ( '+' | '-' )? INT ;
	public final void exponent() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:99:3: ( ( 'E' | 'e' ) ( '+' | '-' )? INT )
			// ./examples/DynWalk.g:99:5: ( 'E' | 'e' ) ( '+' | '-' )? INT
			{
			if ( input.LA(1)==29||input.LA(1)==38 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// ./examples/DynWalk.g:99:15: ( '+' | '-' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==UNARY||LA25_0==23) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// ./examples/DynWalk.g:
					{
					if ( input.LA(1)==UNARY||input.LA(1)==23 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,INT,FOLLOW_INT_in_exponent655); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exponent"



	// $ANTLR start "signedInt"
	// ./examples/DynWalk.g:102:1: signedInt : ( UNARY )? INT ;
	public final void signedInt() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:103:3: ( ( UNARY )? INT )
			// ./examples/DynWalk.g:103:5: ( UNARY )? INT
			{
			// ./examples/DynWalk.g:103:5: ( UNARY )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==UNARY) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ./examples/DynWalk.g:103:6: UNARY
					{
					match(input,UNARY,FOLLOW_UNARY_in_signedInt672); 
					}
					break;

			}

			match(input,INT,FOLLOW_INT_in_signedInt676); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signedInt"



	// $ANTLR start "comment"
	// ./examples/DynWalk.g:106:1: comment : ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE );
	public final void comment() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:107:3: ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE )
			int alt29=2;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// ./examples/DynWalk.g:107:5: NOTE ( lineComment )? NEWLINE
					{
					match(input,NOTE,FOLLOW_NOTE_in_comment690); 
					// ./examples/DynWalk.g:107:10: ( lineComment )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==WS) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// ./examples/DynWalk.g:107:10: lineComment
							{
							pushFollow(FOLLOW_lineComment_in_comment692);
							lineComment();
							state._fsp--;

							}
							break;

					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_comment695); 
					}
					break;
				case 2 :
					// ./examples/DynWalk.g:108:9: NOTE ( WS )+ NEWLINE
					{
					match(input,NOTE,FOLLOW_NOTE_in_comment705); 
					// ./examples/DynWalk.g:108:14: ( WS )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// ./examples/DynWalk.g:108:14: WS
							{
							match(input,WS,FOLLOW_WS_in_comment707); 
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_comment710); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comment"



	// $ANTLR start "lineComment"
	// ./examples/DynWalk.g:111:1: lineComment : ( WS )+ commentText ;
	public final void lineComment() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:112:2: ( ( WS )+ commentText )
			// ./examples/DynWalk.g:112:4: ( WS )+ commentText
			{
			// ./examples/DynWalk.g:112:4: ( WS )+
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
					// ./examples/DynWalk.g:112:4: WS
					{
					match(input,WS,FOLLOW_WS_in_lineComment722); 
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			pushFollow(FOLLOW_commentText_in_lineComment725);
			commentText();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lineComment"



	// $ANTLR start "commentText"
	// ./examples/DynWalk.g:115:1: commentText : (~ ( WS | NEWLINE ) (~ NEWLINE )* ) ;
	public final void commentText() throws RecognitionException {
		try {
			// ./examples/DynWalk.g:116:3: ( (~ ( WS | NEWLINE ) (~ NEWLINE )* ) )
			// ./examples/DynWalk.g:116:5: (~ ( WS | NEWLINE ) (~ NEWLINE )* )
			{
			// ./examples/DynWalk.g:116:5: (~ ( WS | NEWLINE ) (~ NEWLINE )* )
			// ./examples/DynWalk.g:116:6: ~ ( WS | NEWLINE ) (~ NEWLINE )*
			{
			if ( (input.LA(1) >= DOTC && input.LA(1) <= MEND)||(input.LA(1) >= NOTE && input.LA(1) <= UNARY)||(input.LA(1) >= 20 && input.LA(1) <= 40) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// ./examples/DynWalk.g:116:19: (~ NEWLINE )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( ((LA31_0 >= DOTC && LA31_0 <= MEND)||(LA31_0 >= NOTE && LA31_0 <= 40)) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// ./examples/DynWalk.g:
					{
					if ( (input.LA(1) >= DOTC && input.LA(1) <= MEND)||(input.LA(1) >= NOTE && input.LA(1) <= 40) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop31;
				}
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "commentText"

	// Delegated rules


	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA29_eotS =
		"\5\uffff";
	static final String DFA29_eofS =
		"\5\uffff";
	static final String DFA29_minS =
		"\1\14\1\13\1\4\2\uffff";
	static final String DFA29_maxS =
		"\1\14\1\23\1\50\2\uffff";
	static final String DFA29_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA29_specialS =
		"\5\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\1",
			"\1\3\7\uffff\1\2",
			"\7\3\1\4\7\3\1\2\25\3",
			"",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "106:1: comment : ( NOTE ( lineComment )? NEWLINE | NOTE ( WS )+ NEWLINE );";
		}
	}

	public static final BitSet FOLLOW_defaultModule_in_prog73 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_namedModule_in_prog76 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_definition_in_defaultModule94 = new BitSet(new long[]{0x00000002D8000002L});
	public static final BitSet FOLLOW_sector_in_namedModule119 = new BitSet(new long[]{0x00000002D8000000L});
	public static final BitSet FOLLOW_definition_in_namedModule122 = new BitSet(new long[]{0x00000002D8000002L});
	public static final BitSet FOLLOW_auxDef_in_definition148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvlDef_in_definition161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initDef_in_definition173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDef_in_definition183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rateDef_in_definition195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_constDef209 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_constDef211 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_ID_in_constDef216 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_constDef218 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_constDef220 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_constDef222 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_constDef225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_initDef238 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_initDef240 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_ID_in_initDef243 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_initDef245 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_initDef247 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_initDef249 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_initDef252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_auxDef263 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_auxDef265 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_ID_in_auxDef268 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_timeExt_in_auxDef270 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_auxDef272 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_auxDef274 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_auxDef276 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_auxDef279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_rateDef290 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_rateDef292 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_ID_in_rateDef295 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_timeExt_in_rateDef297 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_rateDef299 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_rateDef301 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_rateDef303 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_rateDef306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_timeExt316 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_JKL_in_timeExt318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_lvlDef332 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_lvlDef334 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_ID_in_lvlDef337 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_timeExt_in_lvlDef339 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_lvlDef341 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_lvlDef343 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_lvlDef345 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_lvlDef348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_sector360 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_sector362 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_sector364 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_sector366 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_35_in_sector369 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_SECTOR_in_sector372 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_sector374 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sector376 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_sector379 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_sector381 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_sector385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr402 = new BitSet(new long[]{0x0000000000840002L});
	public static final BitSet FOLLOW_set_in_expr417 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_multExpr_in_expr423 = new BitSet(new long[]{0x0000000000840002L});
	public static final BitSet FOLLOW_atom_in_multExpr446 = new BitSet(new long[]{0x0000000002400002L});
	public static final BitSet FOLLOW_set_in_multExpr450 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_atom_in_multExpr456 = new BitSet(new long[]{0x0000000002400002L});
	public static final BitSet FOLLOW_fpNum_in_atom480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom501 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_timeExt_in_atom504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcRef_in_atom515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_atom525 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_atom527 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_atom529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_funcRef554 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_funcRef556 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_paramList_in_funcRef558 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_funcRef560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_paramList583 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_paramList586 = new BitSet(new long[]{0x0000010000140060L});
	public static final BitSet FOLLOW_expr_in_paramList588 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_mantissa_in_fpNum606 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_exponent_in_fpNum608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signedInt_in_mantissa623 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_mantissa627 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_mantissa629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_exponent642 = new BitSet(new long[]{0x0000000000840040L});
	public static final BitSet FOLLOW_INT_in_exponent655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_in_signedInt672 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_signedInt676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment690 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_lineComment_in_comment692 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NEWLINE_in_comment695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTE_in_comment705 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WS_in_comment707 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_NEWLINE_in_comment710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_lineComment722 = new BitSet(new long[]{0x000001FFFFFFF7F0L});
	public static final BitSet FOLLOW_commentText_in_lineComment725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_commentText739 = new BitSet(new long[]{0x000001FFFFFFF7F2L});
}
