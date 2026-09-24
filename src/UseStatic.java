class UseStatic {
    // static variables
    static int a = 3;
    static int b = a * 4;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block Initialized");
    }

    public static void main(String[] args) {
        meth(42);
    }


}
