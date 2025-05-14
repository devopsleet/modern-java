package forloops;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(var x : nums) {
            System.out.println(x);
        }

        for(int x : nums) {
            System.out.println(x);
            x = x * 10;
        }



//        int switchValue = 3;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            default:
//                System.out.println("Was not 1 and not 2");
//                break;
//            case 3:
//                System.out.println("3");
//            case 4:
//                System.out.println("3");



        //}


        String month = "APRIL";
        System.out.println(getQuarter(month));
        System.out.println(getQuarter("XYZ"));
        System.out.println(getQuarter("DEC"));
        //getQuarter(month);

        System.out.println("Enter the Character");
        int input = System.in.read();
        char ch = (char) input;

        System.out.println(getNatoWord(ch));
        //getNatoWord(ch);

        printDayOfWeek(1);

    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day){
            case 1 -> "Sunday";
            default -> "Invalid day";
        };
    }

    public static String getNatoWord(char ch) {

        return switch (ch) {
            case 'A' -> "A means able";
            default ->  ch + "default";
        };

//        switch(ch) {
//            case 'A':
//                return  (ch + " means " + "Able");
////            default:
////                return ch + "not found";
//        }


    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY","APRIL" -> { yield "1ST QUARTER";}
            default -> {
                String badResponse = month  + " is bad";
                yield badResponse;
            }
            case "DEC" -> { yield "1ST QUARTER";}
        };

    }


}
