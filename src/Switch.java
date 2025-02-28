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

}
