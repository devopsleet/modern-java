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

        return (amount * (interestRate/ 100));


    }
}
