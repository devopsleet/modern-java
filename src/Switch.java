import java.io.IOException;

public class Switch {
    public static void main(String[] args) {

        int switchValue = 1;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2");
        }
        // More code here

        String month = "Jani";
        System.out.println("Month " + month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            default ->  {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }

}
