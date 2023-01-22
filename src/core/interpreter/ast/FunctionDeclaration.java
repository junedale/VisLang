package core.interpreter.ast;

import core.interpreter.Function;
import core.interpreter.parser.VisLangParser.FunDeclContext;

import core.interpreter.Evaluator;
import core.interpreter.ScopeResolver;
import core.interpreter.Value;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration {

    private final Evaluator eval;
    private final ScopeResolver scope;

    public FunctionDeclaration(Evaluator eval, ScopeResolver scope) {
        this.eval = eval;
        this.scope = scope;
    }

    public Value evaluate(FunDeclContext ctx) {
        List<TerminalNode> parameters = ctx.params() != null ?
                ctx.params().Identifier() : new ArrayList<>();

        ParseTree block = ctx.block();
        String identifier = ctx.Identifier().getText() + parameters.size();
        eval.getFun().put(identifier, new Function(scope, parameters, block));
        return Value.VOID;
    }
}
