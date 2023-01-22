package core.interpreter;

public class ReturnValue extends RuntimeException{
    private Value val;

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
