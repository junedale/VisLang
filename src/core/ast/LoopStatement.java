package core.ast;

import core.antlr4.VisLangParser.DoWhileStatContext;
import core.antlr4.VisLangParser.WhileStatContext;
import core.antlr4.VisLangParser.ForStatContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;
import core.interpreter.exception.CLoopException;
import core.interpreter.exception.ELoopException;

public class LoopStatement {

    private final Evaluator eval;

    public LoopStatement(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(DoWhileStatContext ctx) {
        Value condition = eval.visit(ctx.expr());
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
