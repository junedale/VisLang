// Generated from java-escape by ANTLR 4.11.1
package core.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VisLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VisLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VisLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VisLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(VisLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(VisLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#funDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(VisLangParser.FunDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(VisLangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VisLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(VisLangParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#simpleIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIf(VisLangParser.SimpleIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#complexIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexIf(VisLangParser.ComplexIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#doWhileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStat(VisLangParser.DoWhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(VisLangParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(VisLangParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#callStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStat(VisLangParser.CallStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link VisLangParser#printCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(VisLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code println}
	 * labeled alternative in {@link VisLangParser#printCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(VisLangParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(VisLangParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(VisLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VisLangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryMul}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMul(VisLangParser.BinaryMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(VisLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(VisLangParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(VisLangParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignAction}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAction(VisLangParser.AssignActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(VisLangParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(VisLangParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupings}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupings(VisLangParser.GroupingsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMin}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMin(VisLangParser.UnaryMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(VisLangParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(VisLangParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(VisLangParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(VisLangParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(VisLangParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryNot}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNot(VisLangParser.UnaryNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryAdd}
	 * labeled alternative in {@link VisLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAdd(VisLangParser.BinaryAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(VisLangParser.AssignmentContext ctx);
}