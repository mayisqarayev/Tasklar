public class Counter {

    private static Integer objectCount = 0;

    public Counter() {
        objectCount++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.objectCount);
    }
}
