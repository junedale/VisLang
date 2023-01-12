package core.interpreter.ast;

import core.interpreter.parser.VisLangParser.IfStatContext;
import core.interpreter.parser.VisLangParser.ElifStatContext;
import core.interpreter.parser.VisLangParser.IfStatementContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

import java.util.List;

public class DecisionStatement {

    private final Evaluator eval;

    public DecisionStatement(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(IfStatementContext ctx) {
        IfStatContext ifStat = ctx.ifStat();
        if(eval.visit(ifStat.expr()).toBool()) {
            return eval.visit(ifStat.block());
        }

        List<ElifStatContext> elif = ctx.elifStat();
        for (ElifStatContext el : elif) {
            if (eval.visit(el).toBool()) {
                return eval.visit(el.block());
            }
        }

        if(ctx.elseStat() != null) {
            return eval.visit(ctx.elseStat().block());
        }

        return Value.VOID;
    }
}
