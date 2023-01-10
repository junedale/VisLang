package core.ast;

import core.antlr4.VisLangParser.BlockContext;
import core.antlr4.VisLangParser.StatementContext;
import core.antlr4.VisLangParser.ExprContext;
import core.interpreter.Evaluator;
import core.interpreter.ScopeResolver;
import core.interpreter.Value;

public class Block {

    private final Evaluator eval;
    private ScopeResolver scope;

    public Block(Evaluator eval, ScopeResolver scope) {
        this.eval = eval;
        this.scope = scope;
    }

    public Value evaluate(BlockContext ctx) {
        eval.setScope(new ScopeResolver(scope, false));
        System.out.println(scope.isGlobal());
        for(StatementContext stat : ctx.statement())
            eval.visit(stat);
        for(ExprContext expr : ctx.expr())
            eval.visit(expr);
        eval.setScope(scope.getAncestor());
        return Value.VOID;
    }

    public void setScope(ScopeResolver scope) {
        this.scope = scope;
    }
}
