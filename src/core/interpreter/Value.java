package core.interpreter;

public class Value {
    public static final Value NULL = null;
    public static final Value VOID = new Value();

    private final Object value;

    private Value() {
        value = new Object();
    }

    public Value(String val) {
        value = val;
    }

    public Value(Integer val) {
        value = val;
    }

    public Value(Double val) {
        value = val;
    }

    public Value(Boolean val) {
        value = val;

    }

    public Integer toInt() {
        return (Integer) value;
    }

    public Double toDouble() {
        return Double.valueOf(value.toString());
    }

    public String toStr() {
        return String.valueOf(value);
    }

    public Boolean toBool() {
        return (Boolean) value;
    }

    public Boolean isString() {
        return value instanceof String;
    }

    public Boolean isInteger() {
        return value instanceof Integer;
    }

    public Boolean isDouble() {
        return value instanceof Double;
    }

    public Boolean isBoolean() {
        return value instanceof Boolean;
    }

    public Boolean isVoid() {
        return value == VOID;
    }

    public Boolean isNull() {
        return value == NULL;
    }

    @Override
    public boolean equals(Object obj) {
        if(value == obj)
            return true;

        if(!(obj instanceof Value))
            return false;

        return value.equals(obj);
    }

    public String getType() {
        if(this.isInteger()) {
            return "Integer";
        } else if(this.isDouble()) {
            return "Double";
        } else if(this.isString()) {
            return "String";
        } else if(this.isBoolean()) {
            return "Boolean";
        } else {
            return "Null";
        }
    }

    @Override
    public String toString() {
        return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
    }
}
