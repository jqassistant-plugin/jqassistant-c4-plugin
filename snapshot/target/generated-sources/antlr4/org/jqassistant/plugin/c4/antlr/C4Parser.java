// Generated from org/jqassistant/plugin/c4/antlr/C4.g4 by ANTLR 4.13.2
package org.jqassistant.plugin.c4.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class C4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_c4 = 0, RULE_element = 1, RULE_addProperty = 2, RULE_ignore = 3, 
		RULE_c4Element = 4, RULE_hierarchy = 5, RULE_component = 6, RULE_container = 7, 
		RULE_system = 8, RULE_person = 9, RULE_boundary = 10, RULE_paramList = 11, 
		RULE_systemParamList = 12, RULE_genericBoundaryParamList = 13, RULE_boundaryParamList = 14, 
		RULE_rel = 15, RULE_biRel = 16, RULE_relParamList = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"c4", "element", "addProperty", "ignore", "c4Element", "hierarchy", "component", 
			"container", "system", "person", "boundary", "paramList", "systemParamList", 
			"genericBoundaryParamList", "boundaryParamList", "rel", "biRel", "relParamList"
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

	@Override
	public String getGrammarFileName() { return "C4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class C4Context extends ParserRuleContext {
		public Token name;
		public TerminalNode Startuml() { return getToken(C4Parser.Startuml, 0); }
		public TerminalNode Enduml() { return getToken(C4Parser.Enduml, 0); }
		public TerminalNode EOF() { return getToken(C4Parser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(C4Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(C4Parser.NL, i);
		}
		public List<TerminalNode> Preproc() { return getTokens(C4Parser.Preproc); }
		public TerminalNode Preproc(int i) {
			return getToken(C4Parser.Preproc, i);
		}
		public List<TerminalNode> Skinparam() { return getTokens(C4Parser.Skinparam); }
		public TerminalNode Skinparam(int i) {
			return getToken(C4Parser.Skinparam, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode ShowLegend() { return getToken(C4Parser.ShowLegend, 0); }
		public TerminalNode Param() { return getToken(C4Parser.Param, 0); }
		public C4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterC4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitC4(this);
		}
	}

	public final C4Context c4() throws RecognitionException {
		C4Context _localctx = new C4Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_c4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Startuml);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Param) {
				{
				setState(37);
				((C4Context)_localctx).name = match(Param);
				}
			}

			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(NL);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Preproc) {
				{
				{
				setState(45);
				match(Preproc);
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					match(NL);
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Skinparam) {
				{
				{
				setState(56);
				match(Skinparam);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					match(NL);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 563160809464L) != 0)) {
				{
				{
				setState(67);
				element();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ShowLegend) {
				{
				setState(73);
				match(ShowLegend);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(74);
					match(NL);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(82);
			match(Enduml);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(83);
				match(NL);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public BiRelContext biRel() {
			return getRuleContext(BiRelContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(C4Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(C4Parser.NL, i);
		}
		public C4ElementContext c4Element() {
			return getRuleContext(C4ElementContext.class,0);
		}
		public List<AddPropertyContext> addProperty() {
			return getRuleContexts(AddPropertyContext.class);
		}
		public AddPropertyContext addProperty(int i) {
			return getRuleContext(AddPropertyContext.class,i);
		}
		public List<IgnoreContext> ignore() {
			return getRuleContexts(IgnoreContext.class);
		}
		public IgnoreContext ignore(int i) {
			return getRuleContext(IgnoreContext.class,i);
		}
		public HierarchyContext hierarchy() {
			return getRuleContext(HierarchyContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AddProperty || _la==Ignore) {
				{
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AddProperty:
					{
					setState(91);
					addProperty();
					}
					break;
				case Ignore:
					{
					setState(92);
					ignore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					match(NL);
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Component:
			case ComponentExt:
			case ComponentDb:
			case ComponentDbExt:
			case ComponentQueue:
			case ComponentQueueExt:
			case Container:
			case ContainerExt:
			case ContainerDb:
			case ContainerDbExt:
			case ContainerQueue:
			case ContainerQueueExt:
			case ContainerBoundary:
			case System:
			case SystemExt:
			case SystemDb:
			case SystemDbExt:
			case SystemQueue:
			case SystemQueueExt:
			case SystemBoundary:
			case EnterpriseBoundary:
			case Person:
			case PersonExt:
			case Boundary:
				{
				{
				setState(105);
				c4Element();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RCB) {
					{
					setState(106);
					hierarchy();
					}
				}

				}
				}
				break;
			case Rel:
				{
				setState(109);
				rel();
				}
				break;
			case BiRel:
				{
				setState(110);
				biRel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				match(NL);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddPropertyContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public TerminalNode AddProperty() { return getToken(C4Parser.AddProperty, 0); }
		public TerminalNode LB() { return getToken(C4Parser.LB, 0); }
		public TerminalNode CM() { return getToken(C4Parser.CM, 0); }
		public TerminalNode RB() { return getToken(C4Parser.RB, 0); }
		public List<TerminalNode> Param() { return getTokens(C4Parser.Param); }
		public TerminalNode Param(int i) {
			return getToken(C4Parser.Param, i);
		}
		public AddPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterAddProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitAddProperty(this);
		}
	}

	public final AddPropertyContext addProperty() throws RecognitionException {
		AddPropertyContext _localctx = new AddPropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(AddProperty);
			setState(119);
			match(LB);
			setState(120);
			((AddPropertyContext)_localctx).key = match(Param);
			setState(121);
			match(CM);
			setState(122);
			((AddPropertyContext)_localctx).value = match(Param);
			setState(123);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode Ignore() { return getToken(C4Parser.Ignore, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitIgnore(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Ignore);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class C4ElementContext extends ParserRuleContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public BoundaryContext boundary() {
			return getRuleContext(BoundaryContext.class,0);
		}
		public C4ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c4Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterC4Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitC4Element(this);
		}
	}

	public final C4ElementContext c4Element() throws RecognitionException {
		C4ElementContext _localctx = new C4ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c4Element);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Component:
			case ComponentExt:
			case ComponentDb:
			case ComponentDbExt:
			case ComponentQueue:
			case ComponentQueueExt:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				component();
				}
				break;
			case Container:
			case ContainerExt:
			case ContainerDb:
			case ContainerDbExt:
			case ContainerQueue:
			case ContainerQueueExt:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				container();
				}
				break;
			case System:
			case SystemExt:
			case SystemDb:
			case SystemDbExt:
			case SystemQueue:
			case SystemQueueExt:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				system();
				}
				break;
			case Person:
			case PersonExt:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				person();
				}
				break;
			case ContainerBoundary:
			case SystemBoundary:
			case EnterpriseBoundary:
			case Boundary:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				boundary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HierarchyContext extends ParserRuleContext {
		public TerminalNode RCB() { return getToken(C4Parser.RCB, 0); }
		public TerminalNode LCB() { return getToken(C4Parser.LCB, 0); }
		public List<TerminalNode> NL() { return getTokens(C4Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(C4Parser.NL, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HierarchyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterHierarchy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitHierarchy(this);
		}
	}

	public final HierarchyContext hierarchy() throws RecognitionException {
		HierarchyContext _localctx = new HierarchyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hierarchy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			match(RCB);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(135);
				match(NL);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 563160809464L) != 0)) {
				{
				{
				setState(141);
				element();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(LCB);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public org.jqassistant.plugin.c4.data.SecondaryElementType secondaryType;
		public boolean external;
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode Component() { return getToken(C4Parser.Component, 0); }
		public TerminalNode ComponentExt() { return getToken(C4Parser.ComponentExt, 0); }
		public TerminalNode ComponentDb() { return getToken(C4Parser.ComponentDb, 0); }
		public TerminalNode ComponentDbExt() { return getToken(C4Parser.ComponentDbExt, 0); }
		public TerminalNode ComponentQueue() { return getToken(C4Parser.ComponentQueue, 0); }
		public TerminalNode ComponentQueueExt() { return getToken(C4Parser.ComponentQueueExt, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Component:
				{
				setState(149);
				match(Component);
				 ((ComponentContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DEFAULT; 
				}
				break;
			case ComponentExt:
				{
				setState(151);
				match(ComponentExt);
				 ((ComponentContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DEFAULT; ((ComponentContext)_localctx).external =  true; 
				}
				break;
			case ComponentDb:
				{
				setState(153);
				match(ComponentDb);
				 ((ComponentContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DB; 
				}
				break;
			case ComponentDbExt:
				{
				setState(155);
				match(ComponentDbExt);
				 ((ComponentContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DB; ((ComponentContext)_localctx).external =  true; 
				}
				break;
			case ComponentQueue:
				{
				setState(157);
				match(ComponentQueue);
				 ((ComponentContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.QUEUE; 
				}
				break;
			case ComponentQueueExt:
				{
				setState(159);
				match(ComponentQueueExt);
				 ((ComponentContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.QUEUE; ((ComponentContext)_localctx).external =  true; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			paramList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public org.jqassistant.plugin.c4.data.SecondaryElementType secondaryType;
		public boolean external;
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode Container() { return getToken(C4Parser.Container, 0); }
		public TerminalNode ContainerExt() { return getToken(C4Parser.ContainerExt, 0); }
		public TerminalNode ContainerDb() { return getToken(C4Parser.ContainerDb, 0); }
		public TerminalNode ContainerDbExt() { return getToken(C4Parser.ContainerDbExt, 0); }
		public TerminalNode ContainerQueue() { return getToken(C4Parser.ContainerQueue, 0); }
		public TerminalNode ContainerQueueExt() { return getToken(C4Parser.ContainerQueueExt, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitContainer(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Container:
				{
				setState(165);
				match(Container);
				 ((ContainerContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DEFAULT; 
				}
				break;
			case ContainerExt:
				{
				setState(167);
				match(ContainerExt);
				 ((ContainerContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DEFAULT; ((ContainerContext)_localctx).external =  true; 
				}
				break;
			case ContainerDb:
				{
				setState(169);
				match(ContainerDb);
				 ((ContainerContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DB; 
				}
				break;
			case ContainerDbExt:
				{
				setState(171);
				match(ContainerDbExt);
				 ((ContainerContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DB; ((ContainerContext)_localctx).external =  true; 
				}
				break;
			case ContainerQueue:
				{
				setState(173);
				match(ContainerQueue);
				 ((ContainerContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.QUEUE; 
				}
				break;
			case ContainerQueueExt:
				{
				setState(175);
				match(ContainerQueueExt);
				 ((ContainerContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.QUEUE; ((ContainerContext)_localctx).external =  true; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			paramList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SystemContext extends ParserRuleContext {
		public org.jqassistant.plugin.c4.data.SecondaryElementType secondaryType;
		public boolean external;
		public SystemParamListContext systemParamList() {
			return getRuleContext(SystemParamListContext.class,0);
		}
		public TerminalNode System() { return getToken(C4Parser.System, 0); }
		public TerminalNode SystemExt() { return getToken(C4Parser.SystemExt, 0); }
		public TerminalNode SystemDb() { return getToken(C4Parser.SystemDb, 0); }
		public TerminalNode SystemDbExt() { return getToken(C4Parser.SystemDbExt, 0); }
		public TerminalNode SystemQueue() { return getToken(C4Parser.SystemQueue, 0); }
		public TerminalNode SystemQueueExt() { return getToken(C4Parser.SystemQueueExt, 0); }
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitSystem(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case System:
				{
				setState(181);
				match(System);
				 ((SystemContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DEFAULT; 
				}
				break;
			case SystemExt:
				{
				setState(183);
				match(SystemExt);
				 ((SystemContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DEFAULT; ((SystemContext)_localctx).external =  true; 
				}
				break;
			case SystemDb:
				{
				setState(185);
				match(SystemDb);
				 ((SystemContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DB; 
				}
				break;
			case SystemDbExt:
				{
				setState(187);
				match(SystemDbExt);
				 ((SystemContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.DB; ((SystemContext)_localctx).external =  true; 
				}
				break;
			case SystemQueue:
				{
				setState(189);
				match(SystemQueue);
				 ((SystemContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.QUEUE; 
				}
				break;
			case SystemQueueExt:
				{
				setState(191);
				match(SystemQueueExt);
				 ((SystemContext)_localctx).secondaryType =  org.jqassistant.plugin.c4.data.SecondaryElementType.QUEUE; ((SystemContext)_localctx).external =  true; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			systemParamList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonContext extends ParserRuleContext {
		public boolean external;
		public SystemParamListContext systemParamList() {
			return getRuleContext(SystemParamListContext.class,0);
		}
		public TerminalNode Person() { return getToken(C4Parser.Person, 0); }
		public TerminalNode PersonExt() { return getToken(C4Parser.PersonExt, 0); }
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Person:
				{
				setState(197);
				match(Person);
				}
				break;
			case PersonExt:
				{
				setState(198);
				match(PersonExt);
				 ((PersonContext)_localctx).external =  true; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			systemParamList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoundaryContext extends ParserRuleContext {
		public String type;
		public TerminalNode Boundary() { return getToken(C4Parser.Boundary, 0); }
		public GenericBoundaryParamListContext genericBoundaryParamList() {
			return getRuleContext(GenericBoundaryParamListContext.class,0);
		}
		public TerminalNode EnterpriseBoundary() { return getToken(C4Parser.EnterpriseBoundary, 0); }
		public BoundaryParamListContext boundaryParamList() {
			return getRuleContext(BoundaryParamListContext.class,0);
		}
		public TerminalNode SystemBoundary() { return getToken(C4Parser.SystemBoundary, 0); }
		public TerminalNode ContainerBoundary() { return getToken(C4Parser.ContainerBoundary, 0); }
		public BoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterBoundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitBoundary(this);
		}
	}

	public final BoundaryContext boundary() throws RecognitionException {
		BoundaryContext _localctx = new BoundaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boundary);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boundary:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(Boundary);
				setState(205);
				genericBoundaryParamList();
				}
				break;
			case EnterpriseBoundary:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(EnterpriseBoundary);
				setState(207);
				boundaryParamList();
				 ((BoundaryContext)_localctx).type =  "Enterprise"; 
				}
				break;
			case SystemBoundary:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(SystemBoundary);
				setState(211);
				boundaryParamList();
				 ((BoundaryContext)_localctx).type =  "System"; 
				}
				break;
			case ContainerBoundary:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(ContainerBoundary);
				setState(215);
				boundaryParamList();
				 ((BoundaryContext)_localctx).type =  "Container"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public Token p1;
		public Token p2;
		public Token p3;
		public Token p4;
		public Token p5;
		public Token p6;
		public Token p7;
		public TerminalNode LB() { return getToken(C4Parser.LB, 0); }
		public List<TerminalNode> CM() { return getTokens(C4Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(C4Parser.CM, i);
		}
		public TerminalNode RB() { return getToken(C4Parser.RB, 0); }
		public List<TerminalNode> Param() { return getTokens(C4Parser.Param); }
		public TerminalNode Param(int i) {
			return getToken(C4Parser.Param, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(LB);
			setState(221);
			((ParamListContext)_localctx).p1 = match(Param);
			setState(222);
			match(CM);
			setState(223);
			((ParamListContext)_localctx).p2 = match(Param);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(224);
				match(CM);
				setState(225);
				((ParamListContext)_localctx).p3 = match(Param);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CM) {
					{
					setState(226);
					match(CM);
					setState(227);
					((ParamListContext)_localctx).p4 = match(Param);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CM) {
						{
						setState(228);
						match(CM);
						setState(229);
						((ParamListContext)_localctx).p5 = match(Param);
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CM) {
							{
							setState(230);
							match(CM);
							setState(231);
							((ParamListContext)_localctx).p6 = match(Param);
							setState(234);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==CM) {
								{
								setState(232);
								match(CM);
								setState(233);
								((ParamListContext)_localctx).p7 = match(Param);
								}
							}

							}
						}

						}
					}

					}
				}

				}
			}

			setState(244);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SystemParamListContext extends ParserRuleContext {
		public Token p1;
		public Token p2;
		public Token p3;
		public Token p4;
		public Token p5;
		public Token p6;
		public TerminalNode LB() { return getToken(C4Parser.LB, 0); }
		public List<TerminalNode> CM() { return getTokens(C4Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(C4Parser.CM, i);
		}
		public TerminalNode RB() { return getToken(C4Parser.RB, 0); }
		public List<TerminalNode> Param() { return getTokens(C4Parser.Param); }
		public TerminalNode Param(int i) {
			return getToken(C4Parser.Param, i);
		}
		public SystemParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterSystemParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitSystemParamList(this);
		}
	}

	public final SystemParamListContext systemParamList() throws RecognitionException {
		SystemParamListContext _localctx = new SystemParamListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_systemParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(LB);
			setState(247);
			((SystemParamListContext)_localctx).p1 = match(Param);
			setState(248);
			match(CM);
			setState(249);
			((SystemParamListContext)_localctx).p2 = match(Param);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(250);
				match(CM);
				setState(251);
				((SystemParamListContext)_localctx).p3 = match(Param);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CM) {
					{
					setState(252);
					match(CM);
					setState(253);
					((SystemParamListContext)_localctx).p4 = match(Param);
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CM) {
						{
						setState(254);
						match(CM);
						setState(255);
						((SystemParamListContext)_localctx).p5 = match(Param);
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CM) {
							{
							setState(256);
							match(CM);
							setState(257);
							((SystemParamListContext)_localctx).p6 = match(Param);
							}
						}

						}
					}

					}
				}

				}
			}

			setState(266);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericBoundaryParamListContext extends ParserRuleContext {
		public Token p1;
		public Token p2;
		public Token p3;
		public Token p4;
		public Token p5;
		public TerminalNode LB() { return getToken(C4Parser.LB, 0); }
		public List<TerminalNode> CM() { return getTokens(C4Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(C4Parser.CM, i);
		}
		public TerminalNode RB() { return getToken(C4Parser.RB, 0); }
		public List<TerminalNode> Param() { return getTokens(C4Parser.Param); }
		public TerminalNode Param(int i) {
			return getToken(C4Parser.Param, i);
		}
		public GenericBoundaryParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericBoundaryParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterGenericBoundaryParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitGenericBoundaryParamList(this);
		}
	}

	public final GenericBoundaryParamListContext genericBoundaryParamList() throws RecognitionException {
		GenericBoundaryParamListContext _localctx = new GenericBoundaryParamListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_genericBoundaryParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LB);
			setState(269);
			((GenericBoundaryParamListContext)_localctx).p1 = match(Param);
			setState(270);
			match(CM);
			setState(271);
			((GenericBoundaryParamListContext)_localctx).p2 = match(Param);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(272);
				match(CM);
				setState(273);
				((GenericBoundaryParamListContext)_localctx).p3 = match(Param);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CM) {
					{
					setState(274);
					match(CM);
					setState(275);
					((GenericBoundaryParamListContext)_localctx).p4 = match(Param);
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CM) {
						{
						setState(276);
						match(CM);
						setState(277);
						((GenericBoundaryParamListContext)_localctx).p5 = match(Param);
						}
					}

					}
				}

				}
			}

			setState(284);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoundaryParamListContext extends ParserRuleContext {
		public Token p1;
		public Token p2;
		public Token p3;
		public Token p4;
		public TerminalNode LB() { return getToken(C4Parser.LB, 0); }
		public List<TerminalNode> CM() { return getTokens(C4Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(C4Parser.CM, i);
		}
		public TerminalNode RB() { return getToken(C4Parser.RB, 0); }
		public List<TerminalNode> Param() { return getTokens(C4Parser.Param); }
		public TerminalNode Param(int i) {
			return getToken(C4Parser.Param, i);
		}
		public BoundaryParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundaryParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterBoundaryParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitBoundaryParamList(this);
		}
	}

	public final BoundaryParamListContext boundaryParamList() throws RecognitionException {
		BoundaryParamListContext _localctx = new BoundaryParamListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boundaryParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LB);
			setState(287);
			((BoundaryParamListContext)_localctx).p1 = match(Param);
			setState(288);
			match(CM);
			setState(289);
			((BoundaryParamListContext)_localctx).p2 = match(Param);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(290);
				match(CM);
				setState(291);
				((BoundaryParamListContext)_localctx).p3 = match(Param);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CM) {
					{
					setState(292);
					match(CM);
					setState(293);
					((BoundaryParamListContext)_localctx).p4 = match(Param);
					}
				}

				}
			}

			setState(298);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelContext extends ParserRuleContext {
		public TerminalNode Rel() { return getToken(C4Parser.Rel, 0); }
		public RelParamListContext relParamList() {
			return getRuleContext(RelParamListContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(Rel);
			setState(301);
			relParamList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BiRelContext extends ParserRuleContext {
		public TerminalNode BiRel() { return getToken(C4Parser.BiRel, 0); }
		public RelParamListContext relParamList() {
			return getRuleContext(RelParamListContext.class,0);
		}
		public BiRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterBiRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitBiRel(this);
		}
	}

	public final BiRelContext biRel() throws RecognitionException {
		BiRelContext _localctx = new BiRelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_biRel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(BiRel);
			setState(304);
			relParamList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelParamListContext extends ParserRuleContext {
		public Token p1;
		public Token p2;
		public Token p3;
		public Token p4;
		public Token p5;
		public Token p6;
		public Token p7;
		public Token p8;
		public TerminalNode LB() { return getToken(C4Parser.LB, 0); }
		public List<TerminalNode> CM() { return getTokens(C4Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(C4Parser.CM, i);
		}
		public TerminalNode RB() { return getToken(C4Parser.RB, 0); }
		public List<TerminalNode> Param() { return getTokens(C4Parser.Param); }
		public TerminalNode Param(int i) {
			return getToken(C4Parser.Param, i);
		}
		public RelParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).enterRelParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C4Listener ) ((C4Listener)listener).exitRelParamList(this);
		}
	}

	public final RelParamListContext relParamList() throws RecognitionException {
		RelParamListContext _localctx = new RelParamListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(LB);
			setState(307);
			((RelParamListContext)_localctx).p1 = match(Param);
			setState(308);
			match(CM);
			setState(309);
			((RelParamListContext)_localctx).p2 = match(Param);
			setState(310);
			match(CM);
			setState(311);
			((RelParamListContext)_localctx).p3 = match(Param);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(312);
				match(CM);
				setState(313);
				((RelParamListContext)_localctx).p4 = match(Param);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CM) {
					{
					setState(314);
					match(CM);
					setState(315);
					((RelParamListContext)_localctx).p5 = match(Param);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CM) {
						{
						setState(316);
						match(CM);
						setState(317);
						((RelParamListContext)_localctx).p6 = match(Param);
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CM) {
							{
							setState(318);
							match(CM);
							setState(319);
							((RelParamListContext)_localctx).p7 = match(Param);
							setState(322);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==CM) {
								{
								setState(320);
								match(CM);
								setState(321);
								((RelParamListContext)_localctx).p8 = match(Param);
								}
							}

							}
						}

						}
					}

					}
				}

				}
			}

			setState(332);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u014f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\'\b\u0000\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000\f"+
		"\u0000+\u0001\u0000\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000\f\u0000"+
		"1\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000;\b\u0000\u000b\u0000\f\u0000<\u0005\u0000?\b\u0000\n\u0000"+
		"\f\u0000B\t\u0000\u0001\u0000\u0005\u0000E\b\u0000\n\u0000\f\u0000H\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000O\t"+
		"\u0000\u0003\u0000Q\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000"+
		"\n\u0000\f\u0000X\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001^\b\u0001\u0001\u0001\u0004\u0001a\b\u0001\u000b\u0001\f\u0001"+
		"b\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001l\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001p\b\u0001\u0001"+
		"\u0001\u0004\u0001s\b\u0001\u000b\u0001\f\u0001t\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0085\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u0089\b"+
		"\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0005\u0005\u0005\u008f\b\u0005"+
		"\n\u0005\f\u0005\u0092\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a2"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b2\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c2\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00c9\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00db\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00eb\b\u000b\u0003\u000b\u00ed\b\u000b\u0003\u000b\u00ef\b\u000b\u0003"+
		"\u000b\u00f1\b\u000b\u0003\u000b\u00f3\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0103\b\f\u0003\f\u0105\b\f\u0003\f"+
		"\u0107\b\f\u0003\f\u0109\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0117\b\r\u0003"+
		"\r\u0119\b\r\u0003\r\u011b\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0127\b\u000e\u0003\u000e\u0129\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0143"+
		"\b\u0011\u0003\u0011\u0145\b\u0011\u0003\u0011\u0147\b\u0011\u0003\u0011"+
		"\u0149\b\u0011\u0003\u0011\u014b\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0000\u0179\u0000$\u0001"+
		"\u0000\u0000\u0000\u0002f\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000"+
		"\u0000\u0006}\u0001\u0000\u0000\u0000\b\u0084\u0001\u0000\u0000\u0000"+
		"\n\u0086\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000\u0000\u000e"+
		"\u00b1\u0001\u0000\u0000\u0000\u0010\u00c1\u0001\u0000\u0000\u0000\u0012"+
		"\u00c8\u0001\u0000\u0000\u0000\u0014\u00da\u0001\u0000\u0000\u0000\u0016"+
		"\u00dc\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000\u001a"+
		"\u010c\u0001\u0000\u0000\u0000\u001c\u011e\u0001\u0000\u0000\u0000\u001e"+
		"\u012c\u0001\u0000\u0000\u0000 \u012f\u0001\u0000\u0000\u0000\"\u0132"+
		"\u0001\u0000\u0000\u0000$&\u0005\u0001\u0000\u0000%\'\u0005\"\u0000\u0000"+
		"&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000"+
		"\u0000(*\u00053\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,5\u0001\u0000"+
		"\u0000\u0000-/\u0005$\u0000\u0000.0\u00053\u0000\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000024\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6@\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0005%\u0000\u0000"+
		"9;\u00053\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>8\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AF\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GP\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IM\u0005&\u0000"+
		"\u0000JL\u00053\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RV\u0005\u0002\u0000\u0000"+
		"SU\u00053\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0000\u0000\u0001Z\u0001\u0001"+
		"\u0000\u0000\u0000[^\u0003\u0004\u0002\u0000\\^\u0003\u0006\u0003\u0000"+
		"][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_a\u00053\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000d]\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000go\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ik\u0003\b\u0004\u0000jl\u0003\n\u0005\u0000"+
		"kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lp\u0001\u0000\u0000"+
		"\u0000mp\u0003\u001e\u000f\u0000np\u0003 \u0010\u0000oi\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pr\u0001\u0000"+
		"\u0000\u0000qs\u00053\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0003"+
		"\u0001\u0000\u0000\u0000vw\u0005\u0003\u0000\u0000wx\u0005.\u0000\u0000"+
		"xy\u0005\"\u0000\u0000yz\u0005+\u0000\u0000z{\u0005\"\u0000\u0000{|\u0005"+
		"/\u0000\u0000|\u0005\u0001\u0000\u0000\u0000}~\u0005\'\u0000\u0000~\u0007"+
		"\u0001\u0000\u0000\u0000\u007f\u0085\u0003\f\u0006\u0000\u0080\u0085\u0003"+
		"\u000e\u0007\u0000\u0081\u0085\u0003\u0010\b\u0000\u0082\u0085\u0003\u0012"+
		"\t\u0000\u0083\u0085\u0003\u0014\n\u0000\u0084\u007f\u0001\u0000\u0000"+
		"\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\t\u0001\u0000\u0000\u0000\u0086\u008a\u0005,\u0000\u0000"+
		"\u0087\u0089\u00053\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0090\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0002\u0001\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005-\u0000\u0000\u0094\u000b\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0004\u0000\u0000\u0096\u00a2\u0006\u0006\uffff\uffff\u0000\u0097"+
		"\u0098\u0005\u0005\u0000\u0000\u0098\u00a2\u0006\u0006\uffff\uffff\u0000"+
		"\u0099\u009a\u0005\u0006\u0000\u0000\u009a\u00a2\u0006\u0006\uffff\uffff"+
		"\u0000\u009b\u009c\u0005\u0007\u0000\u0000\u009c\u00a2\u0006\u0006\uffff"+
		"\uffff\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u00a2\u0006\u0006\uffff"+
		"\uffff\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a2\u0006\u0006\uffff"+
		"\uffff\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000"+
		"\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000"+
		"\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u0016"+
		"\u000b\u0000\u00a4\r\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\n\u0000"+
		"\u0000\u00a6\u00b2\u0006\u0007\uffff\uffff\u0000\u00a7\u00a8\u0005\u000b"+
		"\u0000\u0000\u00a8\u00b2\u0006\u0007\uffff\uffff\u0000\u00a9\u00aa\u0005"+
		"\f\u0000\u0000\u00aa\u00b2\u0006\u0007\uffff\uffff\u0000\u00ab\u00ac\u0005"+
		"\r\u0000\u0000\u00ac\u00b2\u0006\u0007\uffff\uffff\u0000\u00ad\u00ae\u0005"+
		"\u000e\u0000\u0000\u00ae\u00b2\u0006\u0007\uffff\uffff\u0000\u00af\u00b0"+
		"\u0005\u000f\u0000\u0000\u00b0\u00b2\u0006\u0007\uffff\uffff\u0000\u00b1"+
		"\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u0016\u000b\u0000\u00b4"+
		"\u000f\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6"+
		"\u00c2\u0006\b\uffff\uffff\u0000\u00b7\u00b8\u0005\u0012\u0000\u0000\u00b8"+
		"\u00c2\u0006\b\uffff\uffff\u0000\u00b9\u00ba\u0005\u0013\u0000\u0000\u00ba"+
		"\u00c2\u0006\b\uffff\uffff\u0000\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc"+
		"\u00c2\u0006\b\uffff\uffff\u0000\u00bd\u00be\u0005\u0015\u0000\u0000\u00be"+
		"\u00c2\u0006\b\uffff\uffff\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000\u00c0"+
		"\u00c2\u0006\b\uffff\uffff\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0003\u0018\f\u0000\u00c4\u0011\u0001\u0000\u0000\u0000\u00c5\u00c9"+
		"\u0005\u001a\u0000\u0000\u00c6\u00c7\u0005\u001b\u0000\u0000\u00c7\u00c9"+
		"\u0006\t\uffff\uffff\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0003\u0018\f\u0000\u00cb\u0013\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"\u001c\u0000\u0000\u00cd\u00db\u0003\u001a\r\u0000\u00ce\u00cf\u0005\u0019"+
		"\u0000\u0000\u00cf\u00d0\u0003\u001c\u000e\u0000\u00d0\u00d1\u0006\n\uffff"+
		"\uffff\u0000\u00d1\u00db\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0017"+
		"\u0000\u0000\u00d3\u00d4\u0003\u001c\u000e\u0000\u00d4\u00d5\u0006\n\uffff"+
		"\uffff\u0000\u00d5\u00db\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0010"+
		"\u0000\u0000\u00d7\u00d8\u0003\u001c\u000e\u0000\u00d8\u00d9\u0006\n\uffff"+
		"\uffff\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00cc\u0001\u0000"+
		"\u0000\u0000\u00da\u00ce\u0001\u0000\u0000\u0000\u00da\u00d2\u0001\u0000"+
		"\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00db\u0015\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005.\u0000\u0000\u00dd\u00de\u0005\"\u0000"+
		"\u0000\u00de\u00df\u0005+\u0000\u0000\u00df\u00f2\u0005\"\u0000\u0000"+
		"\u00e0\u00e1\u0005+\u0000\u0000\u00e1\u00f0\u0005\"\u0000\u0000\u00e2"+
		"\u00e3\u0005+\u0000\u0000\u00e3\u00ee\u0005\"\u0000\u0000\u00e4\u00e5"+
		"\u0005+\u0000\u0000\u00e5\u00ec\u0005\"\u0000\u0000\u00e6\u00e7\u0005"+
		"+\u0000\u0000\u00e7\u00ea\u0005\"\u0000\u0000\u00e8\u00e9\u0005+\u0000"+
		"\u0000\u00e9\u00eb\u0005\"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e4\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e2\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005/\u0000\u0000\u00f5\u0017\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005.\u0000\u0000\u00f7\u00f8\u0005\"\u0000\u0000\u00f8\u00f9"+
		"\u0005+\u0000\u0000\u00f9\u0108\u0005\"\u0000\u0000\u00fa\u00fb\u0005"+
		"+\u0000\u0000\u00fb\u0106\u0005\"\u0000\u0000\u00fc\u00fd\u0005+\u0000"+
		"\u0000\u00fd\u0104\u0005\"\u0000\u0000\u00fe\u00ff\u0005+\u0000\u0000"+
		"\u00ff\u0102\u0005\"\u0000\u0000\u0100\u0101\u0005+\u0000\u0000\u0101"+
		"\u0103\u0005\"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00fe"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u00fc\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00fa"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0005/\u0000\u0000\u010b\u0019\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0005.\u0000\u0000\u010d\u010e\u0005\""+
		"\u0000\u0000\u010e\u010f\u0005+\u0000\u0000\u010f\u011a\u0005\"\u0000"+
		"\u0000\u0110\u0111\u0005+\u0000\u0000\u0111\u0118\u0005\"\u0000\u0000"+
		"\u0112\u0113\u0005+\u0000\u0000\u0113\u0116\u0005\"\u0000\u0000\u0114"+
		"\u0115\u0005+\u0000\u0000\u0115\u0117\u0005\"\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u0112\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0110"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005/\u0000\u0000\u011d\u001b\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005.\u0000\u0000\u011f\u0120\u0005\""+
		"\u0000\u0000\u0120\u0121\u0005+\u0000\u0000\u0121\u0128\u0005\"\u0000"+
		"\u0000\u0122\u0123\u0005+\u0000\u0000\u0123\u0126\u0005\"\u0000\u0000"+
		"\u0124\u0125\u0005+\u0000\u0000\u0125\u0127\u0005\"\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0129\u0001\u0000\u0000\u0000\u0128\u0122\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005/\u0000\u0000\u012b\u001d\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0005 \u0000\u0000\u012d\u012e\u0003\"\u0011\u0000\u012e\u001f\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005!\u0000\u0000\u0130\u0131\u0003\""+
		"\u0011\u0000\u0131!\u0001\u0000\u0000\u0000\u0132\u0133\u0005.\u0000\u0000"+
		"\u0133\u0134\u0005\"\u0000\u0000\u0134\u0135\u0005+\u0000\u0000\u0135"+
		"\u0136\u0005\"\u0000\u0000\u0136\u0137\u0005+\u0000\u0000\u0137\u014a"+
		"\u0005\"\u0000\u0000\u0138\u0139\u0005+\u0000\u0000\u0139\u0148\u0005"+
		"\"\u0000\u0000\u013a\u013b\u0005+\u0000\u0000\u013b\u0146\u0005\"\u0000"+
		"\u0000\u013c\u013d\u0005+\u0000\u0000\u013d\u0144\u0005\"\u0000\u0000"+
		"\u013e\u013f\u0005+\u0000\u0000\u013f\u0142\u0005\"\u0000\u0000\u0140"+
		"\u0141\u0005+\u0000\u0000\u0141\u0143\u0005\"\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145"+
		"\u0001\u0000\u0000\u0000\u0144\u013e\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u013c"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149"+
		"\u0001\u0000\u0000\u0000\u0148\u013a\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0138"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0005/\u0000\u0000\u014d#\u0001\u0000"+
		"\u0000\u0000+&+15<@FMPV]bfkot\u0084\u008a\u0090\u00a1\u00b1\u00c1\u00c8"+
		"\u00da\u00ea\u00ec\u00ee\u00f0\u00f2\u0102\u0104\u0106\u0108\u0116\u0118"+
		"\u011a\u0126\u0128\u0142\u0144\u0146\u0148\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}