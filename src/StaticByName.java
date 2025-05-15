class StaticDemo {
    static int a = 42;
    static int b = 99;

    static {
        int c = 100;
    }

    static String callme() {
        return "I am a static method";
    }
}

public class StaticByName {
    public static void main(String[] args) {

        System.out.println(StaticDemo.a);
        System.out.println(StaticDemo.b);
        System.out.println();
        StaticDemo.callme();
        System.out.println(StaticDemo.callme());
    }
}
