package core.interpreter.ast;

import core.interpreter.parser.VisLangParser.BlockContext;
import core.interpreter.parser.VisLangParser.StatementContext;
import core.interpreter.parser.VisLangParser.ExprContext;
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
        for(StatementContext stat : ctx.statement())
            eval.visit(stat);
        for(ExprContext expr : ctx.expr())
            eval.visit(expr);

        if(ctx.returnStatement() != null) {
            Evaluator.rValue.setVal(eval.visit(ctx.returnStatement().expr()));
            eval.setScope(scope.getAncestor());
            throw Evaluator.rValue;
        }

        eval.setScope(scope.getAncestor());
        return Value.VOID;
    }

    public void setScope(ScopeResolver scope) {
        this.scope = scope;
    }
}
