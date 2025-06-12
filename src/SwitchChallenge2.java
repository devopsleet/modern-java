public class SwitchChallenge2 {

    public static void main(String[] args) {

        printDayofWeek(1);

    }

    static void printDayofWeek(int day) {

        String dayOfTheWeek;

        dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid Day";
        };
        System.out.println("Day of the week is " + dayOfTheWeek);
    }


}
