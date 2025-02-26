public class SecondClass {
    public static void main(String[] args) {
        System.out.println("hello");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("This statement will execute");
        }

        int topScore = 80;

        if (topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either");
        }

        int newValue = 50;

        if (newValue == 50) {
            System.out.println("Equal");
        }

        boolean iSCar = false;
        if (iSCar = true) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagon";
        boolean iSDomestic = makeOfCar == "Volkswagon" ? false : true;

        if (iSDomestic) {
            System.out.println("This is false");
        }

        String s = (iSDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }

}
