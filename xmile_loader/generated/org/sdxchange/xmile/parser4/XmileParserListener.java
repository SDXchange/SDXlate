// Generated from XmileParser.g4 by ANTLR 4.4

package org.sdxchange.xmile.parser4;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XmileParser}.
 */
public interface XmileParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XmileParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void enterFuncRef(@NotNull XmileParser.FuncRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void exitFuncRef(@NotNull XmileParser.FuncRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmileParser#macroRef}.
	 * @param ctx the parse tree
	 */
	void enterMacroRef(@NotNull XmileParser.MacroRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#macroRef}.
	 * @param ctx the parse tree
	 */
	void exitMacroRef(@NotNull XmileParser.MacroRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmileParser#builtin}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin(@NotNull XmileParser.BuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#builtin}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin(@NotNull XmileParser.BuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmileParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull XmileParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull XmileParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmileParser#numLit}.
	 * @param ctx the parse tree
	 */
	void enterNumLit(@NotNull XmileParser.NumLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#numLit}.
	 * @param ctx the parse tree
	 */
	void exitNumLit(@NotNull XmileParser.NumLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull XmileParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull XmileParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmileParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(@NotNull XmileParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmileParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(@NotNull XmileParser.ArrayRefContext ctx);
}