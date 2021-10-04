package ex04;

public interface Queue {
    void enQueue(String str);
    String deQueue();
    static void test() {
        System.out.println("test interface");
//        privateMethod();
    }

    public default void test2() {
        privateMethod();
        privateStaticMethod();
    }
    static void test3() {
        privateStaticMethod();
    }

    private static void privateStaticMethod() {
        System.out.println("private static method");
    }
    private void privateMethod() {
        System.out.println("private method");
    }
}
