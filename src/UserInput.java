public class UserInput {

    public static void main(String[] args) {
        int currentYear = 2022;
        String usersDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String partialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(partialYear);
        System.out.println("The user says he is  " + ageWithPartialYear);
    }

}
