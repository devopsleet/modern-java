public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;

        } catch (ArithmeticException e){
            System.out.println("Divided by Zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index " + e);
        }
        System.out.println("After try/catch block");
    }
}
