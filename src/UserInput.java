import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int currentYear = 2022;

//        String usersDateOfBirth = "1999";
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String partialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(partialYear);
//        System.out.println("The user says he is  " + ageWithPartialYear);
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's you Name?");
        System.out.println("Hi " + name + " Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's you Name?");
        System.out.println(" What is your name ?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + " Thanks for taking the course");

        //String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println(" Which year were you born");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >=" + (currentYear - 125) + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());

                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed");

            }

//            String dateOfBirth = scanner.nextLine();
//
//            age = currentYear - Integer.parseInt(dateOfBirth);

        }while(!validDOB);
            return "So you are " + age + " years old";
        }

        public static int checkData( int currentYear, String dateOfBirth){
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;
            if ((dob < minimumYear) || (dob > currentYear)) {
                return -1;
            }
            return (currentYear - dob);
        }

    }
