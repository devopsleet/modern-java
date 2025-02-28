public class Switch {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value 1");
            case 2 -> System.out.println("Value 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not between 1 and 5");
        }

        String month = "JANUAR";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        natoWords('B');

        printDayOfWeek(0);

//        int day = 0;
//        String dayOfTheWeek = printDayOfWeek(day);

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY" -> {yield "1st";}
            default -> {
                String badResponse = month + " is bad";
                //return badresponse;
                // return cannot be used inside a Enhanced switch
                yield badResponse;
            }
        };
    }

    public static void natoWords(char ch){
        switch (ch) {
            case 'A':
                System.out.println("Char " + ch + ":" + " Able");
                break;
            default:
                System.out.println("Letter not found");
        }
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
          case 0 -> "Sunday";
          case 1 -> "Monday";
          case 2 -> "Tuesday";
          case 3 -> {yield "Wednesday";}
          default -> "Invalid Day";
        };
        System.out.println(day + " of the week is " + dayOfWeek);
    }

}
