package miscellaneous;

interface A {
    default void method() {
        System.out.println("from Interface A");
        method3();
    }

    void method2();

    private void method3() {
        System.out.println("from Interface B");
    }
}

interface B {
    default void method() {
        System.out.println("from Interface B");
        method3();
    }

    void method2();

    private void method3() {
        System.out.println("from Interface B");
    }
}

public class MultipleInheritance implements A, B {
    @Override
    public void method() {
        A.super.method();
    }

    @Override
    public void method2() {
        System.out.println("from method2");
    }

    public static void main2(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method();
        obj.method2();
    }

    public static void main(String ... args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method();
        obj.method2();
    }
}
