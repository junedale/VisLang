package core.interpreter;

import java.util.HashMap;
import java.util.Map;

public class ScopeResolver {
    private final ScopeResolver ancestor;
    private final Map<String, Value> varList;
    public boolean isFun;

    public ScopeResolver() {
        this(null, false);
    }

    public ScopeResolver(ScopeResolver ancestor, boolean function) {
        this.ancestor = ancestor;
        this.varList = new HashMap<>();
        this.isFun = function;
    }

    public void assign(String identifier, Value val) {
        if(resolve(identifier) != Value.NULL) {
            reAssign(identifier, val);
        } else {
            varList.put(identifier, val);
        }
    }

    public void reAssign(String identifier, Value val) {
        if(varList.containsKey(identifier)) {
            varList.put(identifier, val);
        } else if(ancestor != null) {
            ancestor.reAssign(identifier, val);
        }
    }

    public Value resolve(String identifier) {
        Value val = varList.get(identifier);

        if(val != null) {
            return val;
        } else if(!isGlobal()) {
            return ancestor.resolve(identifier);
        } else {
            return Value.NULL;
        }
    }

    public boolean isGlobal() {
        return ancestor == null;
    }

    @Override
    public String toString() {
        return isGlobal()? "global" : "block";
    }
}
