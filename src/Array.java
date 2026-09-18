public class Array {

    public static void main(String[] args) {
        int[] month_days;
        month_days = new int[2];
        month_days[0] = 31;
        month_days[1] = 30;
        System.out.println("Jan has " + month_days[0] + " days");

        // Array Initializer
        int[] week_days = {7,14};
        System.out.println("A Week has " + week_days[0] + " days");
    }
}
