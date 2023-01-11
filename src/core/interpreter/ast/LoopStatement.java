package core.interpreter.ast;

import core.interpreter.parser.VisLangParser.DoWhileStatContext;
import core.interpreter.parser.VisLangParser.WhileStatContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;
import core.interpreter.exception.ELoopException;

public class LoopStatement {

    private final Evaluator eval;

    public LoopStatement(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(DoWhileStatContext ctx) {
        Value condition;
        do {
            try {
                eval.visit(ctx.block());
            } catch (ELoopException e) {
                break;
            } finally {
                condition = eval.visit(ctx.expr());
            }
        } while (condition.toBool());
        return Value.VOID;
    }

    public Value evaluate(WhileStatContext ctx) {
        Value condition = eval.visit(ctx.expr());
        while(condition.toBool()) {
            try {
                eval.visit(ctx.block());
            } catch (ELoopException e) {
                break;
            } finally {
                condition = eval.visit(ctx.expr());
            }
        }

        return Value.VOID;
    }
}
