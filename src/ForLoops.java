public class ForLoops {
    public static void main(String[] args) {

        //System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for(double rate = 7.5; rate <= 10; rate = rate + 0.25) {
            double interestAmount = calculateInterest(100.0, rate);
            System.out.println("100.0 at " + rate + " % interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        //System.out.println("This would be calculateInterest");
        //System.out.println("calculate the real values and the interest of he ");
        //System.out.println();
        System.out.println("class");
        System.out.println("private");
        System.out.println("class2");
        System.out.println("It's the Java Language");
        System.out.println("To calculate the percentage of the interest rate ");
        System.out.println();
        System.out.println("Consignor SKU");
        System.out.println();
        System.out.println();

        return (amount * (interestRate/ 100));







    }
}
