public class Exc0 {
    static void subroutine() {

        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Divison by Zero");
        }
        System.out.println("After catch statement");

    }

    public static void main(String[] args) {

        Exc0.subroutine();

    }
}
