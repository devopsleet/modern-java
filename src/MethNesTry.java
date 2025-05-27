public class MethNesTry {

//    static void nesttry(int a) {
//        try {
//            if (a ==1) {
//                a = a / (a - a);
//            }
//                if(a==2) {
//                    int c[] = {1};
//                    c[42] = 99;
//
//
//                }
//
//        }catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//    }
    public static void main(String[] args) {

        doSomething();


//        try {
//            int a = args.length;
//
//            int b = 42 / a;
//            System.out.println(a);
//            nesttry(a);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }    }
    }

    static void doSomething() {
        try {
            System.out.println("In try block");
            int a = 1 / 0; // causes ArithmeticException
        } finally {
            System.out.println("In finally block");
        }
    }
}
