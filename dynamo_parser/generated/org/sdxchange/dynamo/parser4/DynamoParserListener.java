// Generated from DynamoParser.g4 by ANTLR 4.4

package org.sdxchange.dynamo.parser4;



import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DynamoParser}.
 */
public interface DynamoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DynamoParser#plotCard}.
	 * @param ctx the parse tree
	 */
	void enterPlotCard(@NotNull DynamoParser.PlotCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#plotCard}.
	 * @param ctx the parse tree
	 */
	void exitPlotCard(@NotNull DynamoParser.PlotCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#printCard}.
	 * @param ctx the parse tree
	 */
	void enterPrintCard(@NotNull DynamoParser.PrintCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#printCard}.
	 * @param ctx the parse tree
	 */
	void exitPrintCard(@NotNull DynamoParser.PrintCardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AUX_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterAUX_EQN(@NotNull DynamoParser.AUX_EQNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AUX_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitAUX_EQN(@NotNull DynamoParser.AUX_EQNContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(@NotNull DynamoParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(@NotNull DynamoParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TBL_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterTBL_EQN(@NotNull DynamoParser.TBL_EQNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TBL_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitTBL_EQN(@NotNull DynamoParser.TBL_EQNContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#stockDef}.
	 * @param ctx the parse tree
	 */
	void enterStockDef(@NotNull DynamoParser.StockDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#stockDef}.
	 * @param ctx the parse tree
	 */
	void exitStockDef(@NotNull DynamoParser.StockDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#plotList}.
	 * @param ctx the parse tree
	 */
	void enterPlotList(@NotNull DynamoParser.PlotListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#plotList}.
	 * @param ctx the parse tree
	 */
	void exitPlotList(@NotNull DynamoParser.PlotListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(@NotNull DynamoParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(@NotNull DynamoParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(@NotNull DynamoParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(@NotNull DynamoParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#implicitMultExpr}.
	 * @param ctx the parse tree
	 */
	void enterImplicitMultExpr(@NotNull DynamoParser.ImplicitMultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#implicitMultExpr}.
	 * @param ctx the parse tree
	 */
	void exitImplicitMultExpr(@NotNull DynamoParser.ImplicitMultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#localList}.
	 * @param ctx the parse tree
	 */
	void enterLocalList(@NotNull DynamoParser.LocalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#localList}.
	 * @param ctx the parse tree
	 */
	void exitLocalList(@NotNull DynamoParser.LocalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#auxDef}.
	 * @param ctx the parse tree
	 */
	void enterAuxDef(@NotNull DynamoParser.AuxDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#auxDef}.
	 * @param ctx the parse tree
	 */
	void exitAuxDef(@NotNull DynamoParser.AuxDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LVL_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterLVL_EQN(@NotNull DynamoParser.LVL_EQNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LVL_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitLVL_EQN(@NotNull DynamoParser.LVL_EQNContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(@NotNull DynamoParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(@NotNull DynamoParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#rateDef}.
	 * @param ctx the parse tree
	 */
	void enterRateDef(@NotNull DynamoParser.RateDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#rateDef}.
	 * @param ctx the parse tree
	 */
	void exitRateDef(@NotNull DynamoParser.RateDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARY_DEC}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterARY_DEC(@NotNull DynamoParser.ARY_DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARY_DEC}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitARY_DEC(@NotNull DynamoParser.ARY_DECContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#rptList}.
	 * @param ctx the parse tree
	 */
	void enterRptList(@NotNull DynamoParser.RptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#rptList}.
	 * @param ctx the parse tree
	 */
	void exitRptList(@NotNull DynamoParser.RptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#macroDef}.
	 * @param ctx the parse tree
	 */
	void enterMacroDef(@NotNull DynamoParser.MacroDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#macroDef}.
	 * @param ctx the parse tree
	 */
	void exitMacroDef(@NotNull DynamoParser.MacroDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#dummyList}.
	 * @param ctx the parse tree
	 */
	void enterDummyList(@NotNull DynamoParser.DummyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#dummyList}.
	 * @param ctx the parse tree
	 */
	void exitDummyList(@NotNull DynamoParser.DummyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#endCard}.
	 * @param ctx the parse tree
	 */
	void enterEndCard(@NotNull DynamoParser.EndCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#endCard}.
	 * @param ctx the parse tree
	 */
	void exitEndCard(@NotNull DynamoParser.EndCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#specId}.
	 * @param ctx the parse tree
	 */
	void enterSpecId(@NotNull DynamoParser.SpecIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#specId}.
	 * @param ctx the parse tree
	 */
	void exitSpecId(@NotNull DynamoParser.SpecIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#timeScript}.
	 * @param ctx the parse tree
	 */
	void enterTimeScript(@NotNull DynamoParser.TimeScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#timeScript}.
	 * @param ctx the parse tree
	 */
	void exitTimeScript(@NotNull DynamoParser.TimeScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#macroRef}.
	 * @param ctx the parse tree
	 */
	void enterMacroRef(@NotNull DynamoParser.MacroRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#macroRef}.
	 * @param ctx the parse tree
	 */
	void exitMacroRef(@NotNull DynamoParser.MacroRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#plotSpec}.
	 * @param ctx the parse tree
	 */
	void enterPlotSpec(@NotNull DynamoParser.PlotSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#plotSpec}.
	 * @param ctx the parse tree
	 */
	void exitPlotSpec(@NotNull DynamoParser.PlotSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RATE_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterRATE_EQN(@NotNull DynamoParser.RATE_EQNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RATE_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitRATE_EQN(@NotNull DynamoParser.RATE_EQNContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#specCard}.
	 * @param ctx the parse tree
	 */
	void enterSpecCard(@NotNull DynamoParser.SpecCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#specCard}.
	 * @param ctx the parse tree
	 */
	void exitSpecCard(@NotNull DynamoParser.SpecCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#powerOp}.
	 * @param ctx the parse tree
	 */
	void enterPowerOp(@NotNull DynamoParser.PowerOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#powerOp}.
	 * @param ctx the parse tree
	 */
	void exitPowerOp(@NotNull DynamoParser.PowerOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#expCard}.
	 * @param ctx the parse tree
	 */
	void enterExpCard(@NotNull DynamoParser.ExpCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#expCard}.
	 * @param ctx the parse tree
	 */
	void exitExpCard(@NotNull DynamoParser.ExpCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(@NotNull DynamoParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(@NotNull DynamoParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(@NotNull DynamoParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(@NotNull DynamoParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void enterFuncRef(@NotNull DynamoParser.FuncRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void exitFuncRef(@NotNull DynamoParser.FuncRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#predefinedVar}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedVar(@NotNull DynamoParser.PredefinedVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#predefinedVar}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedVar(@NotNull DynamoParser.PredefinedVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#bounds}.
	 * @param ctx the parse tree
	 */
	void enterBounds(@NotNull DynamoParser.BoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#bounds}.
	 * @param ctx the parse tree
	 */
	void exitBounds(@NotNull DynamoParser.BoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#eqn}.
	 * @param ctx the parse tree
	 */
	void enterEqn(@NotNull DynamoParser.EqnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#eqn}.
	 * @param ctx the parse tree
	 */
	void exitEqn(@NotNull DynamoParser.EqnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#columnNum}.
	 * @param ctx the parse tree
	 */
	void enterColumnNum(@NotNull DynamoParser.ColumnNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#columnNum}.
	 * @param ctx the parse tree
	 */
	void exitColumnNum(@NotNull DynamoParser.ColumnNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#aryBounds}.
	 * @param ctx the parse tree
	 */
	void enterAryBounds(@NotNull DynamoParser.AryBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#aryBounds}.
	 * @param ctx the parse tree
	 */
	void exitAryBounds(@NotNull DynamoParser.AryBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#plotChar}.
	 * @param ctx the parse tree
	 */
	void enterPlotChar(@NotNull DynamoParser.PlotCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#plotChar}.
	 * @param ctx the parse tree
	 */
	void exitPlotChar(@NotNull DynamoParser.PlotCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#tabRef}.
	 * @param ctx the parse tree
	 */
	void enterTabRef(@NotNull DynamoParser.TabRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#tabRef}.
	 * @param ctx the parse tree
	 */
	void exitTabRef(@NotNull DynamoParser.TabRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#specAssign}.
	 * @param ctx the parse tree
	 */
	void enterSpecAssign(@NotNull DynamoParser.SpecAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#specAssign}.
	 * @param ctx the parse tree
	 */
	void exitSpecAssign(@NotNull DynamoParser.SpecAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INIT_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterINIT_EQN(@NotNull DynamoParser.INIT_EQNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INIT_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitINIT_EQN(@NotNull DynamoParser.INIT_EQNContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#indexDecl}.
	 * @param ctx the parse tree
	 */
	void enterIndexDecl(@NotNull DynamoParser.IndexDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#indexDecl}.
	 * @param ctx the parse tree
	 */
	void exitIndexDecl(@NotNull DynamoParser.IndexDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#indexList}.
	 * @param ctx the parse tree
	 */
	void enterIndexList(@NotNull DynamoParser.IndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#indexList}.
	 * @param ctx the parse tree
	 */
	void exitIndexList(@NotNull DynamoParser.IndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#aliasList}.
	 * @param ctx the parse tree
	 */
	void enterAliasList(@NotNull DynamoParser.AliasListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#aliasList}.
	 * @param ctx the parse tree
	 */
	void exitAliasList(@NotNull DynamoParser.AliasListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#commentCard}.
	 * @param ctx the parse tree
	 */
	void enterCommentCard(@NotNull DynamoParser.CommentCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#commentCard}.
	 * @param ctx the parse tree
	 */
	void exitCommentCard(@NotNull DynamoParser.CommentCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DynamoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DynamoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONST_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterCONST_EQN(@NotNull DynamoParser.CONST_EQNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONST_EQN}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitCONST_EQN(@NotNull DynamoParser.CONST_EQNContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#runCard}.
	 * @param ctx the parse tree
	 */
	void enterRunCard(@NotNull DynamoParser.RunCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#runCard}.
	 * @param ctx the parse tree
	 */
	void exitRunCard(@NotNull DynamoParser.RunCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(@NotNull DynamoParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(@NotNull DynamoParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#starCard}.
	 * @param ctx the parse tree
	 */
	void enterStarCard(@NotNull DynamoParser.StarCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#starCard}.
	 * @param ctx the parse tree
	 */
	void exitStarCard(@NotNull DynamoParser.StarCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#yValues}.
	 * @param ctx the parse tree
	 */
	void enterYValues(@NotNull DynamoParser.YValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#yValues}.
	 * @param ctx the parse tree
	 */
	void exitYValues(@NotNull DynamoParser.YValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#numLit}.
	 * @param ctx the parse tree
	 */
	void enterNumLit(@NotNull DynamoParser.NumLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#numLit}.
	 * @param ctx the parse tree
	 */
	void exitNumLit(@NotNull DynamoParser.NumLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#internDef}.
	 * @param ctx the parse tree
	 */
	void enterInternDef(@NotNull DynamoParser.InternDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#internDef}.
	 * @param ctx the parse tree
	 */
	void exitInternDef(@NotNull DynamoParser.InternDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(@NotNull DynamoParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(@NotNull DynamoParser.TContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDX_DEC}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void enterIDX_DEC(@NotNull DynamoParser.IDX_DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDX_DEC}
	 * labeled alternative in {@link DynamoParser#eqnCard}.
	 * @param ctx the parse tree
	 */
	void exitIDX_DEC(@NotNull DynamoParser.IDX_DECContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#initDef}.
	 * @param ctx the parse tree
	 */
	void enterInitDef(@NotNull DynamoParser.InitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#initDef}.
	 * @param ctx the parse tree
	 */
	void exitInitDef(@NotNull DynamoParser.InitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#tableDef}.
	 * @param ctx the parse tree
	 */
	void enterTableDef(@NotNull DynamoParser.TableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#tableDef}.
	 * @param ctx the parse tree
	 */
	void exitTableDef(@NotNull DynamoParser.TableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull DynamoParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull DynamoParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#modelCard}.
	 * @param ctx the parse tree
	 */
	void enterModelCard(@NotNull DynamoParser.ModelCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#modelCard}.
	 * @param ctx the parse tree
	 */
	void exitModelCard(@NotNull DynamoParser.ModelCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull DynamoParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull DynamoParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoParser#rptSpec}.
	 * @param ctx the parse tree
	 */
	void enterRptSpec(@NotNull DynamoParser.RptSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoParser#rptSpec}.
	 * @param ctx the parse tree
	 */
	void exitRptSpec(@NotNull DynamoParser.RptSpecContext ctx);
}