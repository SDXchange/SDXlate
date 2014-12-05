// $ANTLR 3.5.2 ./examples/Dynbare.g 2014-11-30 20:30:26
package examples;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DynbareLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DynbareLexer() {} 
	public DynbareLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DynbareLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "./examples/Dynbare.g"; }

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:4:7: ( '(' )
			// ./examples/Dynbare.g:4:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:5:7: ( ')' )
			// ./examples/Dynbare.g:5:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:6:7: ( '*' )
			// ./examples/Dynbare.g:6:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:7:7: ( '+' )
			// ./examples/Dynbare.g:7:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:8:7: ( ',' )
			// ./examples/Dynbare.g:8:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:9:7: ( '-' )
			// ./examples/Dynbare.g:9:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:10:7: ( '/' )
			// ./examples/Dynbare.g:10:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:11:7: ( '=' )
			// ./examples/Dynbare.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:12:7: ( 'A' )
			// ./examples/Dynbare.g:12:9: 'A'
			{
			match('A'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:13:7: ( 'C' )
			// ./examples/Dynbare.g:13:9: 'C'
			{
			match('C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:14:7: ( 'L' )
			// ./examples/Dynbare.g:14:9: 'L'
			{
			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:15:7: ( 'N' )
			// ./examples/Dynbare.g:15:9: 'N'
			{
			match('N'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:16:7: ( 'P' )
			// ./examples/Dynbare.g:16:9: 'P'
			{
			match('P'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:17:7: ( 'R' )
			// ./examples/Dynbare.g:17:9: 'R'
			{
			match('R'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:18:7: ( 'T' )
			// ./examples/Dynbare.g:18:9: 'T'
			{
			match('T'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:19:7: ( 'TABLE' )
			// ./examples/Dynbare.g:19:9: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:20:7: ( 'TABPL' )
			// ./examples/Dynbare.g:20:9: 'TABPL'
			{
			match("TABPL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:21:7: ( 'TABXT' )
			// ./examples/Dynbare.g:21:9: 'TABXT'
			{
			match("TABXT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:22:7: ( '[' )
			// ./examples/Dynbare.g:22:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:23:7: ( '\\.' )
			// ./examples/Dynbare.g:23:9: '\\.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:24:7: ( ']' )
			// ./examples/Dynbare.g:24:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:209:9: ( ( '+' | '-' )? ( ( '0' .. '9' )* '\\.' )? ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
			// ./examples/Dynbare.g:209:13: ( '+' | '-' )? ( ( '0' .. '9' )* '\\.' )? ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
			{
			// ./examples/Dynbare.g:209:13: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// ./examples/Dynbare.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// ./examples/Dynbare.g:209:23: ( ( '0' .. '9' )* '\\.' )?
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// ./examples/Dynbare.g:209:24: ( '0' .. '9' )* '\\.'
					{
					// ./examples/Dynbare.g:209:24: ( '0' .. '9' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// ./examples/Dynbare.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					match('.'); 
					}
					break;

			}

			// ./examples/Dynbare.g:209:41: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./examples/Dynbare.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			// ./examples/Dynbare.g:209:52: ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='E'||LA7_0=='e') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ./examples/Dynbare.g:209:53: ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// ./examples/Dynbare.g:209:62: ( '+' | '-' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='+'||LA5_0=='-') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ./examples/Dynbare.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// ./examples/Dynbare.g:209:72: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// ./examples/Dynbare.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "JKL"
	public final void mJKL() throws RecognitionException {
		try {
			int _type = JKL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:210:6: ( ( 'K' ( 'L' )? ) | ( 'J' ( 'K' )? ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='K') ) {
				alt10=1;
			}
			else if ( (LA10_0=='J') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// ./examples/Dynbare.g:210:8: ( 'K' ( 'L' )? )
					{
					// ./examples/Dynbare.g:210:8: ( 'K' ( 'L' )? )
					// ./examples/Dynbare.g:210:9: 'K' ( 'L' )?
					{
					match('K'); 
					// ./examples/Dynbare.g:210:13: ( 'L' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='L') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// ./examples/Dynbare.g:210:14: 'L'
							{
							match('L'); 
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// ./examples/Dynbare.g:210:23: ( 'J' ( 'K' )? )
					{
					// ./examples/Dynbare.g:210:23: ( 'J' ( 'K' )? )
					// ./examples/Dynbare.g:210:24: 'J' ( 'K' )?
					{
					match('J'); 
					// ./examples/Dynbare.g:210:28: ( 'K' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='K') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// ./examples/Dynbare.g:210:29: 'K'
							{
							match('K'); 
							}
							break;

					}

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JKL"

	// $ANTLR start "NOTE"
	public final void mNOTE() throws RecognitionException {
		try {
			int _type = NOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:211:6: ( 'NOTE' )
			// ./examples/Dynbare.g:211:9: 'NOTE'
			{
			match("NOTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTE"

	// $ANTLR start "PLOT"
	public final void mPLOT() throws RecognitionException {
		try {
			int _type = PLOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:212:9: ( 'PLOT' )
			// ./examples/Dynbare.g:212:12: 'PLOT'
			{
			match("PLOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLOT"

	// $ANTLR start "RUN"
	public final void mRUN() throws RecognitionException {
		try {
			int _type = RUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:213:9: ( 'RUN' )
			// ./examples/Dynbare.g:213:11: 'RUN'
			{
			match("RUN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUN"

	// $ANTLR start "SPEC"
	public final void mSPEC() throws RecognitionException {
		try {
			int _type = SPEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:214:9: ( 'SPEC' )
			// ./examples/Dynbare.g:214:11: 'SPEC'
			{
			match("SPEC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPEC"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:215:9: ( 'PRINT' )
			// ./examples/Dynbare.g:215:11: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "SECTOR"
	public final void mSECTOR() throws RecognitionException {
		try {
			int _type = SECTOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:216:8: ( 'SECTOR' )
			// ./examples/Dynbare.g:216:10: 'SECTOR'
			{
			match("SECTOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SECTOR"

	// $ANTLR start "MACRO"
	public final void mMACRO() throws RecognitionException {
		try {
			int _type = MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:217:9: ( 'MACRO' )
			// ./examples/Dynbare.g:217:11: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MACRO"

	// $ANTLR start "MEND"
	public final void mMEND() throws RecognitionException {
		try {
			int _type = MEND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:218:9: ( 'MEND' )
			// ./examples/Dynbare.g:218:11: 'MEND'
			{
			match("MEND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEND"

	// $ANTLR start "INTRN"
	public final void mINTRN() throws RecognitionException {
		try {
			int _type = INTRN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:219:9: ( 'INTRN' )
			// ./examples/Dynbare.g:219:11: 'INTRN'
			{
			match("INTRN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTRN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:220:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// ./examples/Dynbare.g:220:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ./examples/Dynbare.g:220:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ./examples/Dynbare.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:221:8: ( ( '\\r' )? '\\n' )
			// ./examples/Dynbare.g:221:9: ( '\\r' )? '\\n'
			{
			// ./examples/Dynbare.g:221:9: ( '\\r' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\r') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// ./examples/Dynbare.g:221:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./examples/Dynbare.g:222:5: ( ( ' ' | '\\t' )+ )
			// ./examples/Dynbare.g:222:9: ( ' ' | '\\t' )+
			{
			// ./examples/Dynbare.g:222:9: ( ' ' | '\\t' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\t'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./examples/Dynbare.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// ./examples/Dynbare.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | NUMBER | JKL | NOTE | PLOT | RUN | SPEC | PRINT | SECTOR | MACRO | MEND | INTRN | ID | NEWLINE | WS )
		int alt14=35;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// ./examples/Dynbare.g:1:10: T__37
				{
				mT__37(); 

				}
				break;
			case 2 :
				// ./examples/Dynbare.g:1:16: T__38
				{
				mT__38(); 

				}
				break;
			case 3 :
				// ./examples/Dynbare.g:1:22: T__39
				{
				mT__39(); 

				}
				break;
			case 4 :
				// ./examples/Dynbare.g:1:28: T__40
				{
				mT__40(); 

				}
				break;
			case 5 :
				// ./examples/Dynbare.g:1:34: T__41
				{
				mT__41(); 

				}
				break;
			case 6 :
				// ./examples/Dynbare.g:1:40: T__42
				{
				mT__42(); 

				}
				break;
			case 7 :
				// ./examples/Dynbare.g:1:46: T__43
				{
				mT__43(); 

				}
				break;
			case 8 :
				// ./examples/Dynbare.g:1:52: T__44
				{
				mT__44(); 

				}
				break;
			case 9 :
				// ./examples/Dynbare.g:1:58: T__45
				{
				mT__45(); 

				}
				break;
			case 10 :
				// ./examples/Dynbare.g:1:64: T__46
				{
				mT__46(); 

				}
				break;
			case 11 :
				// ./examples/Dynbare.g:1:70: T__47
				{
				mT__47(); 

				}
				break;
			case 12 :
				// ./examples/Dynbare.g:1:76: T__48
				{
				mT__48(); 

				}
				break;
			case 13 :
				// ./examples/Dynbare.g:1:82: T__49
				{
				mT__49(); 

				}
				break;
			case 14 :
				// ./examples/Dynbare.g:1:88: T__50
				{
				mT__50(); 

				}
				break;
			case 15 :
				// ./examples/Dynbare.g:1:94: T__51
				{
				mT__51(); 

				}
				break;
			case 16 :
				// ./examples/Dynbare.g:1:100: T__52
				{
				mT__52(); 

				}
				break;
			case 17 :
				// ./examples/Dynbare.g:1:106: T__53
				{
				mT__53(); 

				}
				break;
			case 18 :
				// ./examples/Dynbare.g:1:112: T__54
				{
				mT__54(); 

				}
				break;
			case 19 :
				// ./examples/Dynbare.g:1:118: T__55
				{
				mT__55(); 

				}
				break;
			case 20 :
				// ./examples/Dynbare.g:1:124: T__56
				{
				mT__56(); 

				}
				break;
			case 21 :
				// ./examples/Dynbare.g:1:130: T__57
				{
				mT__57(); 

				}
				break;
			case 22 :
				// ./examples/Dynbare.g:1:136: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 23 :
				// ./examples/Dynbare.g:1:143: JKL
				{
				mJKL(); 

				}
				break;
			case 24 :
				// ./examples/Dynbare.g:1:147: NOTE
				{
				mNOTE(); 

				}
				break;
			case 25 :
				// ./examples/Dynbare.g:1:152: PLOT
				{
				mPLOT(); 

				}
				break;
			case 26 :
				// ./examples/Dynbare.g:1:157: RUN
				{
				mRUN(); 

				}
				break;
			case 27 :
				// ./examples/Dynbare.g:1:161: SPEC
				{
				mSPEC(); 

				}
				break;
			case 28 :
				// ./examples/Dynbare.g:1:166: PRINT
				{
				mPRINT(); 

				}
				break;
			case 29 :
				// ./examples/Dynbare.g:1:172: SECTOR
				{
				mSECTOR(); 

				}
				break;
			case 30 :
				// ./examples/Dynbare.g:1:179: MACRO
				{
				mMACRO(); 

				}
				break;
			case 31 :
				// ./examples/Dynbare.g:1:185: MEND
				{
				mMEND(); 

				}
				break;
			case 32 :
				// ./examples/Dynbare.g:1:190: INTRN
				{
				mINTRN(); 

				}
				break;
			case 33 :
				// ./examples/Dynbare.g:1:196: ID
				{
				mID(); 

				}
				break;
			case 34 :
				// ./examples/Dynbare.g:1:199: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 35 :
				// ./examples/Dynbare.g:1:207: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA3_eotS =
		"\1\uffff\1\3\2\uffff";
	static final String DFA3_eofS =
		"\4\uffff";
	static final String DFA3_minS =
		"\2\56\2\uffff";
	static final String DFA3_maxS =
		"\2\71\2\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA3_specialS =
		"\4\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\2\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "209:23: ( ( '0' .. '9' )* '\\.' )?";
		}
	}

	static final String DFA14_eotS =
		"\4\uffff\1\34\1\uffff\1\35\2\uffff\1\36\1\37\1\40\1\42\1\45\1\47\1\51"+
		"\1\uffff\1\52\2\uffff\2\54\3\31\10\uffff\1\31\1\uffff\2\31\1\uffff\1\31"+
		"\1\uffff\1\31\2\uffff\1\54\1\uffff\1\54\10\31\1\100\6\31\1\111\1\112\1"+
		"\31\1\uffff\3\31\1\117\2\31\1\122\1\31\2\uffff\1\124\1\125\1\126\1\127"+
		"\1\uffff\1\31\1\131\1\uffff\1\132\4\uffff\1\133\3\uffff";
	static final String DFA14_eofS =
		"\134\uffff";
	static final String DFA14_minS =
		"\1\11\3\uffff\1\56\1\uffff\1\56\2\uffff\7\60\1\uffff\1\60\2\uffff\2\60"+
		"\1\105\1\101\1\116\10\uffff\1\124\1\uffff\1\117\1\111\1\uffff\1\116\1"+
		"\uffff\1\102\2\uffff\1\60\1\uffff\1\60\1\105\2\103\1\116\1\124\1\105\1"+
		"\124\1\116\1\60\1\114\1\103\1\124\1\122\1\104\1\122\2\60\1\124\1\uffff"+
		"\1\105\1\114\1\124\1\60\2\117\1\60\1\116\2\uffff\4\60\1\uffff\1\122\1"+
		"\60\1\uffff\1\60\4\uffff\1\60\3\uffff";
	static final String DFA14_maxS =
		"\1\172\3\uffff\1\71\1\uffff\1\71\2\uffff\7\172\1\uffff\1\71\2\uffff\2"+
		"\172\1\120\1\105\1\116\10\uffff\1\124\1\uffff\1\117\1\111\1\uffff\1\116"+
		"\1\uffff\1\102\2\uffff\1\172\1\uffff\1\172\1\105\2\103\1\116\1\124\1\105"+
		"\1\124\1\116\1\172\1\130\1\103\1\124\1\122\1\104\1\122\2\172\1\124\1\uffff"+
		"\1\105\1\114\1\124\1\172\2\117\1\172\1\116\2\uffff\4\172\1\uffff\1\122"+
		"\1\172\1\uffff\1\172\4\uffff\1\172\3\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\7\1\10\7\uffff\1\23\1\uffff"+
		"\1\25\1\26\5\uffff\1\41\1\42\1\43\1\4\1\6\1\11\1\12\1\13\1\uffff\1\14"+
		"\2\uffff\1\15\1\uffff\1\16\1\uffff\1\17\1\24\1\uffff\1\27\23\uffff\1\32"+
		"\10\uffff\1\30\1\31\4\uffff\1\33\2\uffff\1\37\1\uffff\1\34\1\20\1\21\1"+
		"\22\1\uffff\1\36\1\40\1\35";
	static final String DFA14_specialS =
		"\134\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\33\1\32\2\uffff\1\32\22\uffff\1\33\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6"+
			"\1\21\1\7\12\23\3\uffff\1\10\3\uffff\1\11\1\31\1\12\5\31\1\30\1\25\1"+
			"\24\1\13\1\27\1\14\1\31\1\15\1\31\1\16\1\26\1\17\6\31\1\20\1\uffff\1"+
			"\22\3\uffff\32\31",
			"",
			"",
			"",
			"\1\23\1\uffff\12\23",
			"",
			"\1\23\1\uffff\12\23",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\16\31\1\41\13\31\6\uffff\32\31",
			"\12\31\7\uffff\13\31\1\43\5\31\1\44\10\31\6\uffff\32\31",
			"\12\31\7\uffff\24\31\1\46\5\31\6\uffff\32\31",
			"\12\31\7\uffff\1\50\31\31\6\uffff\32\31",
			"",
			"\12\23",
			"",
			"",
			"\12\31\7\uffff\13\31\1\53\16\31\6\uffff\32\31",
			"\12\31\7\uffff\12\31\1\55\17\31\6\uffff\32\31",
			"\1\57\12\uffff\1\56",
			"\1\60\3\uffff\1\61",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"",
			"\1\64",
			"\1\65",
			"",
			"\1\66",
			"",
			"\1\67",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\101\3\uffff\1\102\7\uffff\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\113",
			"",
			"\1\114",
			"\1\115",
			"\1\116",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\120",
			"\1\121",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\123",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"\1\130",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | NUMBER | JKL | NOTE | PLOT | RUN | SPEC | PRINT | SECTOR | MACRO | MEND | INTRN | ID | NEWLINE | WS );";
		}
	}

}
