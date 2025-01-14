

public class Main {
    public static void main(String[] args) {


        double variable1 = 20.00;
        double variable2 = 80.00;

        double result = variable1 + variable2 * 100.00;
        System.out.println("Total is " + result);
        double remainder = result % 40.00;

        boolean var = (remainder == 0.00) ? true : false;

        System.out.println("Output is " + var);
    }

}
