public class ByteShift {
    public static void main(String[] args) {
//        byte a = 64, b;
//        int i;
//
//        i = a << 2;
//        b = (byte)  (a << 2);
//        System.out.println("original value = "  + a);
//        System.out.println("Int value = " + i);
//        System.out.println("Byte value = " + b);
        int i;
        int num = 0XFFFFFFE;
        System.out.println(num);
        for (i=0; i <4; i++) {
            num = num << 1;
            System.out.println(num);
        }

        int e = 10;
        int c = 0;
        if (c == 1  & e++ < 10) {
            System.out.println("yes");
        }

        if(5 == 5) {
            System.out.println("True");
        }

        int month = 4;

        if (month ==4) {
            System.out.println("month 4 is spring");
        }
    }
}


//class MultbyTwo {
//    public static void main(String[] args) {
//        System.out.println("Test");
//    }
//}
