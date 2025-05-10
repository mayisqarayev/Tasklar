public class MathOperations {

    private Object value;

    public MathOperations(Object value) {
        if(value instanceof Integer) {
            this.value = value;
        } else if(value instanceof Double) {
            this.value = value;
        }
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MathOperations{" +
                "value=" + value +
                '}';
    }

    public void add(double addedValue) {
        if(this.value instanceof Double) {
            Double _double = (double)this.value;
            _double += addedValue;
            this.value = _double;
        }
    }

    public void add(int addedValue) {
        if(this.value instanceof Integer) {
            Integer _int = (int)this.value;
            _int += addedValue;
            this.value = _int;
        }
    }

    public static void main(String[] args) {
        MathOperations o1 = new MathOperations(2.2);
        o1.add(2.2);
        System.out.println(o1);
        MathOperations o2 = new MathOperations(2);
        o2.add(4);
        System.out.println(o2);
    }
}
