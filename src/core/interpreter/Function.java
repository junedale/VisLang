package core.interpreter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;

public class Function {

    private final ScopeResolver parent;
    private final List<TerminalNode> paramList;
    private final ParseTree block;
    private final int arity;

    public Function(ScopeResolver scope, List<TerminalNode> paramList, ParseTree block) {
        this.parent = scope;
        this.paramList = paramList;
        this.block = block;
        this.arity = paramList.size();
    }

    public Value invoke(List<Value> argList, Map<String, Function> functions) {
        if(argList.size() != arity) {
            throw new RuntimeException("Illegal function call");
        }

        ScopeResolver functionScope = new ScopeResolver(parent, true);

        for(int i = 0; i < arity; i++) {
            Value val = argList.get(i);
            String identifier = paramList.get(i).getText();
            functionScope.assignParam(identifier, val);
        }

        Evaluator eval = new Evaluator(functionScope, functions);

        Value rValue = Value.VOID;

        try {
            eval.visit(block);
        } catch (ReturnValue e) {
            rValue = e.getVal();
        }

        return rValue;
    }

}
