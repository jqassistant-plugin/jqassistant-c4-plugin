// Generated from org/jqassistant/plugin/c4/antlr/C4.g4 by ANTLR 4.7.2
package org.jqassistant.plugin.c4.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C4Parser extends Parser {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AddProperty) | (1L << Component) | (1L << ComponentExt) | (1L << ComponentDb) | (1L << ComponentDbExt) | (1L << ComponentQueue) | (1L << ComponentQueueExt) | (1L << Container) | (1L << ContainerExt) | (1L << ContainerDb) | (1L << ContainerDbExt) | (1L << ContainerQueue) | (1L << ContainerQueueExt) | (1L << ContainerBoundary) | (1L << System) | (1L << SystemExt) | (1L << SystemDb) | (1L << SystemDbExt) | (1L << SystemQueue) | (1L << SystemQueueExt) | (1L << SystemBoundary) | (1L << EnterpriseBoundary) | (1L << Person) | (1L << PersonExt) | (1L << Boundary) | (1L << Rel) | (1L << BiRel) | (1L << Ignore))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AddProperty) | (1L << Component) | (1L << ComponentExt) | (1L << ComponentDb) | (1L << ComponentDbExt) | (1L << ComponentQueue) | (1L << ComponentQueueExt) | (1L << Container) | (1L << ContainerExt) | (1L << ContainerDb) | (1L << ContainerDbExt) | (1L << ContainerQueue) | (1L << ContainerQueueExt) | (1L << ContainerBoundary) | (1L << System) | (1L << SystemExt) | (1L << SystemDb) | (1L << SystemDbExt) | (1L << SystemQueue) | (1L << SystemQueueExt) | (1L << SystemBoundary) | (1L << EnterpriseBoundary) | (1L << Person) | (1L << PersonExt) | (1L << Boundary) | (1L << Rel) | (1L << BiRel) | (1L << Ignore))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0151\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\6\2\62\n\2"+
		"\r\2\16\2\63\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\6\2=\n\2\r\2\16\2>\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\7\2N\n\2\f\2"+
		"\16\2Q\13\2\5\2S\n\2\3\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\3\3\3\5"+
		"\3`\n\3\3\3\6\3c\n\3\r\3\16\3d\7\3g\n\3\f\3\16\3j\13\3\3\3\3\3\5\3n\n"+
		"\3\3\3\3\3\5\3r\n\3\3\3\6\3u\n\3\r\3\16\3v\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u0087\n\6\3\7\3\7\7\7\u008b\n\7\f\7\16"+
		"\7\u008e\13\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u00cb\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00dd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00ed\n\r\5\r\u00ef\n\r\5\r\u00f1\n\r\5\r\u00f3"+
		"\n\r\5\r\u00f5\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0105\n\16\5\16\u0107\n\16\5\16\u0109\n\16\5\16\u010b"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0119\n\17\5\17\u011b\n\17\5\17\u011d\n\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0129\n\20\5\20\u012b\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0145\n\23\5\23\u0147\n\23\5"+
		"\23\u0149\n\23\5\23\u014b\n\23\5\23\u014d\n\23\3\23\3\23\3\23\2\2\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u017b\2&\3\2\2\2\4h\3"+
		"\2\2\2\6x\3\2\2\2\b\177\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3\2\2\2\16\u00a3"+
		"\3\2\2\2\20\u00b3\3\2\2\2\22\u00c3\3\2\2\2\24\u00ca\3\2\2\2\26\u00dc\3"+
		"\2\2\2\30\u00de\3\2\2\2\32\u00f8\3\2\2\2\34\u010e\3\2\2\2\36\u0120\3\2"+
		"\2\2 \u012e\3\2\2\2\"\u0131\3\2\2\2$\u0134\3\2\2\2&(\7\3\2\2\')\7$\2\2"+
		"(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\7\65\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\67\3\2\2\2/\61\7&\2\2\60\62\7\65\2\2\61\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65/\3\2\2\2\669\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28B\3\2\2\29\67\3\2\2\2:<\7\'\2\2;=\7\65"+
		"\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@:\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\5\4\3\2FE\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IR\3\2\2\2JH\3\2\2\2KO\7(\2\2LN\7\65\2\2ML\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RK\3\2\2\2RS\3\2"+
		"\2\2ST\3\2\2\2TX\7\4\2\2UW\7\65\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\2\2\3\\\3\3\2\2\2]`\5\6\4\2^`\5\b\5\2"+
		"_]\3\2\2\2_^\3\2\2\2`b\3\2\2\2ac\7\65\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2eg\3\2\2\2f_\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2iq\3\2\2"+
		"\2jh\3\2\2\2km\5\n\6\2ln\5\f\7\2ml\3\2\2\2mn\3\2\2\2nr\3\2\2\2or\5 \21"+
		"\2pr\5\"\22\2qk\3\2\2\2qo\3\2\2\2qp\3\2\2\2rt\3\2\2\2su\7\65\2\2ts\3\2"+
		"\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\5\3\2\2\2xy\7\5\2\2yz\7\60\2\2z{\7"+
		"$\2\2{|\7-\2\2|}\7$\2\2}~\7\61\2\2~\7\3\2\2\2\177\u0080\7)\2\2\u0080\t"+
		"\3\2\2\2\u0081\u0087\5\16\b\2\u0082\u0087\5\20\t\2\u0083\u0087\5\22\n"+
		"\2\u0084\u0087\5\24\13\2\u0085\u0087\5\26\f\2\u0086\u0081\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2"+
		"\2\2\u0087\13\3\2\2\2\u0088\u008c\7.\2\2\u0089\u008b\7\65\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0092\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\4\3\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7/\2\2\u0096\r\3\2\2\2"+
		"\u0097\u0098\7\6\2\2\u0098\u00a4\b\b\1\2\u0099\u009a\7\7\2\2\u009a\u00a4"+
		"\b\b\1\2\u009b\u009c\7\b\2\2\u009c\u00a4\b\b\1\2\u009d\u009e\7\t\2\2\u009e"+
		"\u00a4\b\b\1\2\u009f\u00a0\7\n\2\2\u00a0\u00a4\b\b\1\2\u00a1\u00a2\7\13"+
		"\2\2\u00a2\u00a4\b\b\1\2\u00a3\u0097\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009b\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\30\r\2\u00a6\17\3\2\2\2\u00a7\u00a8"+
		"\7\f\2\2\u00a8\u00b4\b\t\1\2\u00a9\u00aa\7\r\2\2\u00aa\u00b4\b\t\1\2\u00ab"+
		"\u00ac\7\16\2\2\u00ac\u00b4\b\t\1\2\u00ad\u00ae\7\17\2\2\u00ae\u00b4\b"+
		"\t\1\2\u00af\u00b0\7\20\2\2\u00b0\u00b4\b\t\1\2\u00b1\u00b2\7\21\2\2\u00b2"+
		"\u00b4\b\t\1\2\u00b3\u00a7\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ab\3\2"+
		"\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\5\30\r\2\u00b6\21\3\2\2\2\u00b7\u00b8\7\23"+
		"\2\2\u00b8\u00c4\b\n\1\2\u00b9\u00ba\7\24\2\2\u00ba\u00c4\b\n\1\2\u00bb"+
		"\u00bc\7\25\2\2\u00bc\u00c4\b\n\1\2\u00bd\u00be\7\26\2\2\u00be\u00c4\b"+
		"\n\1\2\u00bf\u00c0\7\27\2\2\u00c0\u00c4\b\n\1\2\u00c1\u00c2\7\30\2\2\u00c2"+
		"\u00c4\b\n\1\2\u00c3\u00b7\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00bb\3\2"+
		"\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\5\32\16\2\u00c6\23\3\2\2\2\u00c7\u00cb\7\34"+
		"\2\2\u00c8\u00c9\7\35\2\2\u00c9\u00cb\b\13\1\2\u00ca\u00c7\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\32\16\2\u00cd\25\3\2"+
		"\2\2\u00ce\u00cf\7\36\2\2\u00cf\u00dd\5\34\17\2\u00d0\u00d1\7\33\2\2\u00d1"+
		"\u00d2\5\36\20\2\u00d2\u00d3\b\f\1\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\7"+
		"\31\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\b\f\1\2\u00d7\u00dd\3\2\2\2"+
		"\u00d8\u00d9\7\22\2\2\u00d9\u00da\5\36\20\2\u00da\u00db\b\f\1\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00ce\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d4\3\2"+
		"\2\2\u00dc\u00d8\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00df\7\60\2\2\u00df\u00e0"+
		"\7$\2\2\u00e0\u00e1\7-\2\2\u00e1\u00f4\7$\2\2\u00e2\u00e3\7-\2\2\u00e3"+
		"\u00f2\7$\2\2\u00e4\u00e5\7-\2\2\u00e5\u00f0\7$\2\2\u00e6\u00e7\7-\2\2"+
		"\u00e7\u00ee\7$\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ec\7$\2\2\u00ea\u00eb"+
		"\7-\2\2\u00eb\u00ed\7$\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2"+
		"\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00e4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00e2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7"+
		"\31\3\2\2\2\u00f8\u00f9\7\60\2\2\u00f9\u00fa\7$\2\2\u00fa\u00fb\7-\2\2"+
		"\u00fb\u010a\7$\2\2\u00fc\u00fd\7-\2\2\u00fd\u0108\7$\2\2\u00fe\u00ff"+
		"\7-\2\2\u00ff\u0106\7$\2\2\u0100\u0101\7-\2\2\u0101\u0104\7$\2\2\u0102"+
		"\u0103\7-\2\2\u0103\u0105\7$\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2"+
		"\2\u0105\u0107\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u00fc\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\61"+
		"\2\2\u010d\33\3\2\2\2\u010e\u010f\7\60\2\2\u010f\u0110\7$\2\2\u0110\u0111"+
		"\7-\2\2\u0111\u011c\7$\2\2\u0112\u0113\7-\2\2\u0113\u011a\7$\2\2\u0114"+
		"\u0115\7-\2\2\u0115\u0118\7$\2\2\u0116\u0117\7-\2\2\u0117\u0119\7$\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0114"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0112\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\61\2\2\u011f\35\3\2\2"+
		"\2\u0120\u0121\7\60\2\2\u0121\u0122\7$\2\2\u0122\u0123\7-\2\2\u0123\u012a"+
		"\7$\2\2\u0124\u0125\7-\2\2\u0125\u0128\7$\2\2\u0126\u0127\7-\2\2\u0127"+
		"\u0129\7$\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0124\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7\61\2\2\u012d\37\3\2\2\2\u012e\u012f\7\"\2\2\u012f\u0130\5$\23"+
		"\2\u0130!\3\2\2\2\u0131\u0132\7#\2\2\u0132\u0133\5$\23\2\u0133#\3\2\2"+
		"\2\u0134\u0135\7\60\2\2\u0135\u0136\7$\2\2\u0136\u0137\7-\2\2\u0137\u0138"+
		"\7$\2\2\u0138\u0139\7-\2\2\u0139\u014c\7$\2\2\u013a\u013b\7-\2\2\u013b"+
		"\u014a\7$\2\2\u013c\u013d\7-\2\2\u013d\u0148\7$\2\2\u013e\u013f\7-\2\2"+
		"\u013f\u0146\7$\2\2\u0140\u0141\7-\2\2\u0141\u0144\7$\2\2\u0142\u0143"+
		"\7-\2\2\u0143\u0145\7$\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u013e\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u013c\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u013a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\61\2\2\u014f"+
		"%\3\2\2\2-(-\63\67>BHORX_dhmqv\u0086\u008c\u0092\u00a3\u00b3\u00c3\u00ca"+
		"\u00dc\u00ec\u00ee\u00f0\u00f2\u00f4\u0104\u0106\u0108\u010a\u0118\u011a"+
		"\u011c\u0128\u012a\u0144\u0146\u0148\u014a\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}