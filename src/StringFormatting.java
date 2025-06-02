import javax.swing.*;

public class StringFormatting {

    public static void main(String[] args) {
        String bullet = "Print a bulleted list:\n " +
                "\t\u2022 First Point\n" +
                "\t\u2022 Sub Point";

        System.out.println(bullet);

        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %.2f%n",(float)age);

        for(int i = 1; i <= 100000; i *= 10) {
            System.out.println("printing " + i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);


        formattedString = "Your birth year is %d".formatted(1994);
        System.out.println(formattedString);
    }
}
