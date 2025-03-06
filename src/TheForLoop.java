public class TheForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <=5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 7.5; rate <= 10.0; rate = rate + .25) {
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }

        System.out.println("0 is " + (isPrime(0) ? "": "NOT") + " a prime number");
    }

    public static double calculateInterest( double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime ( int wholeNumber) {

        if (wholeNumber <= 2){
            return (wholeNumber == 2);




        }return true;
    }
}
