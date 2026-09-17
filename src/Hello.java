public class Hello {

    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == true);
        {
            System.out.println("It's not an alien");
        }

        int topScore = 80;
        if (topScore <=  100) {
            System.out.println("The value of topscore is less than 100");
            System.out.println("You got the high score");
            System.out.println("The topScore is ");


        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {

            System.out.println("Greater than second top Score");

        }

        if ((topScore > 90) || (secondTopScore <= 90) ) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to run");
        }

        String makeOfCar = "Vollkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println(isDomestic);

        double d = 20.00;
        double d2 = 80.00;
        double result = (d  + d2) * 100.00;
        result = result % 40.00;
        boolean flag = (result == 0.00)? true : false;
        System.out.println(flag);



    }
}
