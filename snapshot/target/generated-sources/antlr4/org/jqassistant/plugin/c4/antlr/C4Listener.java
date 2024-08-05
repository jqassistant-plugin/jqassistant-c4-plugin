// Generated from org/jqassistant/plugin/c4/antlr/C4.g4 by ANTLR 4.13.2
package org.jqassistant.plugin.c4.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C4Parser}.
 */
public interface C4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C4Parser#c4}.
	 * @param ctx the parse tree
	 */
	void enterC4(C4Parser.C4Context ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#c4}.
	 * @param ctx the parse tree
	 */
	void exitC4(C4Parser.C4Context ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(C4Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(C4Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#addProperty}.
	 * @param ctx the parse tree
	 */
	void enterAddProperty(C4Parser.AddPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#addProperty}.
	 * @param ctx the parse tree
	 */
	void exitAddProperty(C4Parser.AddPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(C4Parser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(C4Parser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#c4Element}.
	 * @param ctx the parse tree
	 */
	void enterC4Element(C4Parser.C4ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#c4Element}.
	 * @param ctx the parse tree
	 */
	void exitC4Element(C4Parser.C4ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#hierarchy}.
	 * @param ctx the parse tree
	 */
	void enterHierarchy(C4Parser.HierarchyContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#hierarchy}.
	 * @param ctx the parse tree
	 */
	void exitHierarchy(C4Parser.HierarchyContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(C4Parser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(C4Parser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(C4Parser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(C4Parser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#system}.
	 * @param ctx the parse tree
	 */
	void enterSystem(C4Parser.SystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#system}.
	 * @param ctx the parse tree
	 */
	void exitSystem(C4Parser.SystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(C4Parser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(C4Parser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#boundary}.
	 * @param ctx the parse tree
	 */
	void enterBoundary(C4Parser.BoundaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#boundary}.
	 * @param ctx the parse tree
	 */
	void exitBoundary(C4Parser.BoundaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(C4Parser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(C4Parser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#systemParamList}.
	 * @param ctx the parse tree
	 */
	void enterSystemParamList(C4Parser.SystemParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#systemParamList}.
	 * @param ctx the parse tree
	 */
	void exitSystemParamList(C4Parser.SystemParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#genericBoundaryParamList}.
	 * @param ctx the parse tree
	 */
	void enterGenericBoundaryParamList(C4Parser.GenericBoundaryParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#genericBoundaryParamList}.
	 * @param ctx the parse tree
	 */
	void exitGenericBoundaryParamList(C4Parser.GenericBoundaryParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#boundaryParamList}.
	 * @param ctx the parse tree
	 */
	void enterBoundaryParamList(C4Parser.BoundaryParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#boundaryParamList}.
	 * @param ctx the parse tree
	 */
	void exitBoundaryParamList(C4Parser.BoundaryParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(C4Parser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(C4Parser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#biRel}.
	 * @param ctx the parse tree
	 */
	void enterBiRel(C4Parser.BiRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#biRel}.
	 * @param ctx the parse tree
	 */
	void exitBiRel(C4Parser.BiRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link C4Parser#relParamList}.
	 * @param ctx the parse tree
	 */
	void enterRelParamList(C4Parser.RelParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C4Parser#relParamList}.
	 * @param ctx the parse tree
	 */
	void exitRelParamList(C4Parser.RelParamListContext ctx);
}