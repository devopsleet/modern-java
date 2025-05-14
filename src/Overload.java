class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println(" a and b: a + b");
    }

    void test(double a) {
        System.out.println("Double a : " + a);
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();

        od.test(10);
        od.test(123.5);
        od.test(12);
    }
}
