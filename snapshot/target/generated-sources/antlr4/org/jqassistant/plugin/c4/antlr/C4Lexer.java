// Generated from org/jqassistant/plugin/c4/antlr/C4.g4 by ANTLR 4.7.2
package org.jqassistant.plugin.c4.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Startuml=1, Enduml=2, AddProperty=3, Component=4, ComponentExt=5, ComponentDb=6, 
		ComponentDbExt=7, ComponentQueue=8, ComponentQueueExt=9, Container=10, 
		ContainerExt=11, ContainerDb=12, ContainerDbExt=13, ContainerQueue=14, 
		ContainerQueueExt=15, ContainerBoundary=16, System=17, SystemExt=18, SystemDb=19, 
		SystemDbExt=20, SystemQueue=21, SystemQueueExt=22, SystemBoundary=23, 
		Enterprise=24, EnterpriseBoundary=25, Person=26, PersonExt=27, Boundary=28, 
		DB=29, Queue=30, Ext=31, Rel=32, BiRel=33, Param=34, KeyValue=35, Preproc=36, 
		Skinparam=37, ShowLegend=38, Ignore=39, STRING=40, CHAR=41, INT=42, CM=43, 
		RCB=44, LCB=45, LB=46, RB=47, US=48, DL=49, WS=50, NL=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Startuml", "Enduml", "AddProperty", "Component", "ComponentExt", "ComponentDb", 
			"ComponentDbExt", "ComponentQueue", "ComponentQueueExt", "Container", 
			"ContainerExt", "ContainerDb", "ContainerDbExt", "ContainerQueue", "ContainerQueueExt", 
			"ContainerBoundary", "System", "SystemExt", "SystemDb", "SystemDbExt", 
			"SystemQueue", "SystemQueueExt", "SystemBoundary", "Enterprise", "EnterpriseBoundary", 
			"Person", "PersonExt", "Boundary", "DB", "Queue", "Ext", "Rel", "BiRel", 
			"Param", "KeyValue", "Preproc", "Skinparam", "ShowLegend", "Ignore", 
			"STRING", "CHAR", "INT", "CM", "RCB", "LCB", "LB", "RB", "US", "DL", 
			"WS", "NL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@startuml'", "'@enduml'", "'AddProperty'", "'Component'", null, 
			null, null, null, null, "'Container'", null, null, null, null, null, 
			null, "'System'", null, null, null, null, null, null, "'Enterprise'", 
			null, "'Person'", null, "'Boundary'", "'Db'", "'Queue'", "'_Ext'", null, 
			null, null, null, null, null, null, null, null, null, null, "','", "'{'", 
			"'}'", "'('", "')'", "'_'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Startuml", "Enduml", "AddProperty", "Component", "ComponentExt", 
			"ComponentDb", "ComponentDbExt", "ComponentQueue", "ComponentQueueExt", 
			"Container", "ContainerExt", "ContainerDb", "ContainerDbExt", "ContainerQueue", 
			"ContainerQueueExt", "ContainerBoundary", "System", "SystemExt", "SystemDb", 
			"SystemDbExt", "SystemQueue", "SystemQueueExt", "SystemBoundary", "Enterprise", 
			"EnterpriseBoundary", "Person", "PersonExt", "Boundary", "DB", "Queue", 
			"Ext", "Rel", "BiRel", "Param", "KeyValue", "Preproc", "Skinparam", "ShowLegend", 
			"Ignore", "STRING", "CHAR", "INT", "CM", "RCB", "LCB", "LB", "RB", "US", 
			"DL", "WS", "NL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public C4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0213\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u013f\n!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\5#\u0148\n#\3$\3$\6$\u014c\n$\r$\16$\u014d\3$\7"+
		"$\u0151\n$\f$\16$\u0154\13$\3$\3$\7$\u0158\n$\f$\16$\u015b\13$\3$\3$\3"+
		"%\3%\7%\u0161\n%\f%\16%\u0164\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&"+
		"\u0171\n&\f&\16&\u0174\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\7\'\u0183\n\'\f\'\16\'\u0186\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01df\n(\3(\7(\u01e2\n(\f(\16(\u01e5\13"+
		"(\3)\3)\7)\u01e9\n)\f)\16)\u01ec\13)\3)\3)\6)\u01f0\n)\r)\16)\u01f1\5"+
		")\u01f4\n)\3*\3*\3+\6+\u01f9\n+\r+\16+\u01fa\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\5\64\u0210\n\64"+
		"\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65\3\2\6\4\2\f\f\17\17\5\2\f\f\17\17$$\n\2\f\f\17\17\"$*+..BB}}\177"+
		"\177\4\2\13\13\"\"\2\u022b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2"+
		"\2\2\5s\3\2\2\2\7{\3\2\2\2\t\u0087\3\2\2\2\13\u0091\3\2\2\2\r\u0094\3"+
		"\2\2\2\17\u0097\3\2\2\2\21\u009a\3\2\2\2\23\u009d\3\2\2\2\25\u00a0\3\2"+
		"\2\2\27\u00aa\3\2\2\2\31\u00ad\3\2\2\2\33\u00b0\3\2\2\2\35\u00b3\3\2\2"+
		"\2\37\u00b6\3\2\2\2!\u00b9\3\2\2\2#\u00bd\3\2\2\2%\u00c4\3\2\2\2\'\u00c7"+
		"\3\2\2\2)\u00ca\3\2\2\2+\u00cd\3\2\2\2-\u00d0\3\2\2\2/\u00d4\3\2\2\2\61"+
		"\u00d8\3\2\2\2\63\u00e3\3\2\2\2\65\u00e7\3\2\2\2\67\u00ee\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00fa\3\2\2\2=\u00fd\3\2\2\2?\u0103\3\2\2\2A\u013e\3\2\2\2C"+
		"\u0140\3\2\2\2E\u0147\3\2\2\2G\u0149\3\2\2\2I\u015e\3\2\2\2K\u0165\3\2"+
		"\2\2M\u0175\3\2\2\2O\u01de\3\2\2\2Q\u01f3\3\2\2\2S\u01f5\3\2\2\2U\u01f8"+
		"\3\2\2\2W\u01fc\3\2\2\2Y\u01fe\3\2\2\2[\u0200\3\2\2\2]\u0202\3\2\2\2_"+
		"\u0204\3\2\2\2a\u0206\3\2\2\2c\u0208\3\2\2\2e\u020a\3\2\2\2g\u020f\3\2"+
		"\2\2ij\7B\2\2jk\7u\2\2kl\7v\2\2lm\7c\2\2mn\7t\2\2no\7v\2\2op\7w\2\2pq"+
		"\7o\2\2qr\7n\2\2r\4\3\2\2\2st\7B\2\2tu\7g\2\2uv\7p\2\2vw\7f\2\2wx\7w\2"+
		"\2xy\7o\2\2yz\7n\2\2z\6\3\2\2\2{|\7C\2\2|}\7f\2\2}~\7f\2\2~\177\7R\2\2"+
		"\177\u0080\7t\2\2\u0080\u0081\7q\2\2\u0081\u0082\7r\2\2\u0082\u0083\7"+
		"g\2\2\u0083\u0084\7t\2\2\u0084\u0085\7v\2\2\u0085\u0086\7{\2\2\u0086\b"+
		"\3\2\2\2\u0087\u0088\7E\2\2\u0088\u0089\7q\2\2\u0089\u008a\7o\2\2\u008a"+
		"\u008b\7r\2\2\u008b\u008c\7q\2\2\u008c\u008d\7p\2\2\u008d\u008e\7g\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\n\3\2\2\2\u0091\u0092\5\t"+
		"\5\2\u0092\u0093\5? \2\u0093\f\3\2\2\2\u0094\u0095\5\t\5\2\u0095\u0096"+
		"\5;\36\2\u0096\16\3\2\2\2\u0097\u0098\5\r\7\2\u0098\u0099\5? \2\u0099"+
		"\20\3\2\2\2\u009a\u009b\5\t\5\2\u009b\u009c\5=\37\2\u009c\22\3\2\2\2\u009d"+
		"\u009e\5\21\t\2\u009e\u009f\5? \2\u009f\24\3\2\2\2\u00a0\u00a1\7E\2\2"+
		"\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\5\25\13\2\u00ab\u00ac\5? \2"+
		"\u00ac\30\3\2\2\2\u00ad\u00ae\5\25\13\2\u00ae\u00af\5;\36\2\u00af\32\3"+
		"\2\2\2\u00b0\u00b1\5\31\r\2\u00b1\u00b2\5? \2\u00b2\34\3\2\2\2\u00b3\u00b4"+
		"\5\25\13\2\u00b4\u00b5\5=\37\2\u00b5\36\3\2\2\2\u00b6\u00b7\5\35\17\2"+
		"\u00b7\u00b8\5? \2\u00b8 \3\2\2\2\u00b9\u00ba\5\25\13\2\u00ba\u00bb\5"+
		"a\61\2\u00bb\u00bc\59\35\2\u00bc\"\3\2\2\2\u00bd\u00be\7U\2\2\u00be\u00bf"+
		"\7{\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7o\2\2\u00c3$\3\2\2\2\u00c4\u00c5\5#\22\2\u00c5\u00c6\5? \2\u00c6"+
		"&\3\2\2\2\u00c7\u00c8\5#\22\2\u00c8\u00c9\5;\36\2\u00c9(\3\2\2\2\u00ca"+
		"\u00cb\5\'\24\2\u00cb\u00cc\5? \2\u00cc*\3\2\2\2\u00cd\u00ce\5#\22\2\u00ce"+
		"\u00cf\5=\37\2\u00cf,\3\2\2\2\u00d0\u00d1\5#\22\2\u00d1\u00d2\5=\37\2"+
		"\u00d2\u00d3\5? \2\u00d3.\3\2\2\2\u00d4\u00d5\5#\22\2\u00d5\u00d6\5a\61"+
		"\2\u00d6\u00d7\59\35\2\u00d7\60\3\2\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7t\2\2\u00dd"+
		"\u00de\7r\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7u\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\5\61\31\2\u00e4\u00e5"+
		"\5a\61\2\u00e5\u00e6\59\35\2\u00e6\64\3\2\2\2\u00e7\u00e8\7R\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7q\2\2"+
		"\u00ec\u00ed\7p\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\5\65\33\2\u00ef\u00f0"+
		"\5? \2\u00f08\3\2\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7w\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7c\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f8\u00f9\7{\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7F\2\2\u00fb"+
		"\u00fc\7d\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7S\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2\u0102>\3\2\2\2\u0103"+
		"\u0104\7a\2\2\u0104\u0105\7G\2\2\u0105\u0106\7z\2\2\u0106\u0107\7v\2\2"+
		"\u0107@\3\2\2\2\u0108\u0109\7T\2\2\u0109\u010a\7g\2\2\u010a\u013f\7n\2"+
		"\2\u010b\u010c\7T\2\2\u010c\u010d\7g\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7a\2\2\u010f\u013f\7W\2\2\u0110\u0111\7T\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7n\2\2\u0113\u0114\7a\2\2\u0114\u0115\7W\2\2\u0115\u013f\7r\2\2"+
		"\u0116\u0117\7T\2\2\u0117\u0118\7g\2\2\u0118\u0119\7n\2\2\u0119\u011a"+
		"\7a\2\2\u011a\u013f\7F\2\2\u011b\u011c\7T\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7n\2\2\u011e\u011f\7a\2\2\u011f\u0120\7F\2\2\u0120\u0121\7q\2\2"+
		"\u0121\u0122\7y\2\2\u0122\u013f\7p\2\2\u0123\u0124\7T\2\2\u0124\u0125"+
		"\7g\2\2\u0125\u0126\7n\2\2\u0126\u0127\7a\2\2\u0127\u013f\7N\2\2\u0128"+
		"\u0129\7T\2\2\u0129\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b\u012c\7a\2\2"+
		"\u012c\u012d\7N\2\2\u012d\u012e\7g\2\2\u012e\u012f\7h\2\2\u012f\u013f"+
		"\7v\2\2\u0130\u0131\7T\2\2\u0131\u0132\7g\2\2\u0132\u0133\7n\2\2\u0133"+
		"\u0134\7a\2\2\u0134\u013f\7T\2\2\u0135\u0136\7T\2\2\u0136\u0137\7g\2\2"+
		"\u0137\u0138\7n\2\2\u0138\u0139\7a\2\2\u0139\u013a\7T\2\2\u013a\u013b"+
		"\7k\2\2\u013b\u013c\7i\2\2\u013c\u013d\7j\2\2\u013d\u013f\7v\2\2\u013e"+
		"\u0108\3\2\2\2\u013e\u010b\3\2\2\2\u013e\u0110\3\2\2\2\u013e\u0116\3\2"+
		"\2\2\u013e\u011b\3\2\2\2\u013e\u0123\3\2\2\2\u013e\u0128\3\2\2\2\u013e"+
		"\u0130\3\2\2\2\u013e\u0135\3\2\2\2\u013fB\3\2\2\2\u0140\u0141\7D\2\2\u0141"+
		"\u0142\7k\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5A!\2\u0144D\3\2\2\2\u0145"+
		"\u0148\5Q)\2\u0146\u0148\5G$\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2"+
		"\u0148F\3\2\2\2\u0149\u014b\5c\62\2\u014a\u014c\5S*\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0152\3\2\2\2\u014f\u0151\5e\63\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0159\7?\2\2\u0156\u0158\5e\63\2\u0157\u0156\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\5Q)\2\u015dH\3\2\2\2\u015e"+
		"\u0162\7#\2\2\u015f\u0161\n\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163J\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\7u\2\2\u0166\u0167\7m\2\2\u0167\u0168\7k\2\2\u0168"+
		"\u0169\7p\2\2\u0169\u016a\7r\2\2\u016a\u016b\7c\2\2\u016b\u016c\7t\2\2"+
		"\u016c\u016d\7c\2\2\u016d\u016e\7o\2\2\u016e\u0172\3\2\2\2\u016f\u0171"+
		"\n\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173L\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7U\2\2\u0176"+
		"\u0177\7J\2\2\u0177\u0178\7Q\2\2\u0178\u0179\7Y\2\2\u0179\u017a\7a\2\2"+
		"\u017a\u017b\7N\2\2\u017b\u017c\7G\2\2\u017c\u017d\7I\2\2\u017d\u017e"+
		"\7G\2\2\u017e\u017f\7P\2\2\u017f\u0180\7F\2\2\u0180\u0184\3\2\2\2\u0181"+
		"\u0183\n\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185N\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188"+
		"\7C\2\2\u0188\u0189\7f\2\2\u0189\u018a\7f\2\2\u018a\u018b\7T\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7n\2\2\u018d\u018e\7V\2\2\u018e\u018f\7c\2\2"+
		"\u018f\u01df\7i\2\2\u0190\u0191\7C\2\2\u0191\u0192\7f\2\2\u0192\u0193"+
		"\7f\2\2\u0193\u0194\7E\2\2\u0194\u0195\7q\2\2\u0195\u0196\7o\2\2\u0196"+
		"\u0197\7r\2\2\u0197\u0198\7q\2\2\u0198\u0199\7p\2\2\u0199\u019a\7g\2\2"+
		"\u019a\u019b\7p\2\2\u019b\u019c\7v\2\2\u019c\u019d\7V\2\2\u019d\u019e"+
		"\7c\2\2\u019e\u01df\7i\2\2\u019f\u01a0\7C\2\2\u01a0\u01a1\7f\2\2\u01a1"+
		"\u01a2\7f\2\2\u01a2\u01a3\7G\2\2\u01a3\u01a4\7z\2\2\u01a4\u01a5\7v\2\2"+
		"\u01a5\u01a6\7g\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9"+
		"\7c\2\2\u01a9\u01aa\7n\2\2\u01aa\u01ab\7E\2\2\u01ab\u01ac\7q\2\2\u01ac"+
		"\u01ad\7o\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7p\2\2"+
		"\u01b0\u01b1\7g\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4"+
		"\7V\2\2\u01b4\u01b5\7c\2\2\u01b5\u01df\7i\2\2\u01b6\u01b7\7W\2\2\u01b7"+
		"\u01b8\7r\2\2\u01b8\u01b9\7f\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7v\2\2"+
		"\u01bb\u01bc\7g\2\2\u01bc\u01bd\7D\2\2\u01bd\u01be\7q\2\2\u01be\u01bf"+
		"\7w\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7f\2\2\u01c1\u01c2\7c\2\2\u01c2"+
		"\u01c3\7t\2\2\u01c3\u01c4\7{\2\2\u01c4\u01c5\7U\2\2\u01c5\u01c6\7v\2\2"+
		"\u01c6\u01c7\7{\2\2\u01c7\u01c8\7n\2\2\u01c8\u01df\7g\2\2\u01c9\u01ca"+
		"\7Y\2\2\u01ca\u01cb\7k\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7j\2\2\u01cd"+
		"\u01ce\7q\2\2\u01ce\u01cf\7w\2\2\u01cf\u01d0\7v\2\2\u01d0\u01d1\7R\2\2"+
		"\u01d1\u01d2\7t\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7r\2\2\u01d4\u01d5"+
		"\7g\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7{\2\2\u01d8"+
		"\u01d9\7J\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7f\2\2"+
		"\u01dc\u01dd\7g\2\2\u01dd\u01df\7t\2\2\u01de\u0187\3\2\2\2\u01de\u0190"+
		"\3\2\2\2\u01de\u019f\3\2\2\2\u01de\u01b6\3\2\2\2\u01de\u01c9\3\2\2\2\u01df"+
		"\u01e3\3\2\2\2\u01e0\u01e2\n\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4P\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01ea\7$\2\2\u01e7\u01e9\n\3\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f4\7$\2\2\u01ee\u01f0\5S*\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01e6\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4R\3\2\2\2"+
		"\u01f5\u01f6\n\4\2\2\u01f6T\3\2\2\2\u01f7\u01f9\4\62;\2\u01f8\u01f7\3"+
		"\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"V\3\2\2\2\u01fc\u01fd\7.\2\2\u01fdX\3\2\2\2\u01fe\u01ff\7}\2\2\u01ffZ"+
		"\3\2\2\2\u0200\u0201\7\177\2\2\u0201\\\3\2\2\2\u0202\u0203\7*\2\2\u0203"+
		"^\3\2\2\2\u0204\u0205\7+\2\2\u0205`\3\2\2\2\u0206\u0207\7a\2\2\u0207b"+
		"\3\2\2\2\u0208\u0209\7&\2\2\u0209d\3\2\2\2\u020a\u020b\t\5\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020d\b\63\2\2\u020df\3\2\2\2\u020e\u0210\7\17\2\2\u020f"+
		"\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\f"+
		"\2\2\u0212h\3\2\2\2\22\2\u013e\u0147\u014d\u0152\u0159\u0162\u0172\u0184"+
		"\u01de\u01e3\u01ea\u01f1\u01f3\u01fa\u020f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}