package core.interpreter.ast;

import core.antlr4.VisLangParser.IdentifierContext;
import core.antlr4.VisLangParser.AssignmentContext;
import core.interpreter.Evaluator;
import core.interpreter.ScopeResolver;
import core.interpreter.Value;

public class AssignmentStatement {

    private final Evaluator eval;
    private ScopeResolver scope;

    public AssignmentStatement(Evaluator eval, ScopeResolver scope) {
        this.eval = eval;
        this.scope = scope;
    }

    public Value evaluate(IdentifierContext ctx) {
        return scope.resolve(ctx.Identifier().getText());
    }

    public Value evaluate(AssignmentContext ctx) {
        String identifier = ctx.Identifier().getText();
        scope.assign(identifier, eval.visit(ctx.expr()));
        return Value.VOID;
    }


    public void setScope(ScopeResolver scope) {
        this.scope = scope;
    }

}
