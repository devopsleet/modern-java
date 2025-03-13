import javax.swing.*;

public class StringFormatting {

    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted list:\n" +
                "\t\u2022 first point\n" +
                "\t\t\u2022 sub point";

        System.out.println(bulletIt);
        String textBlock = """
                Print a Bulleted List:
                        \u2022 First point
                            \u2022 Sub point
                """;

        System.out.println(textBlock);

        int age = 35;

        System.out.printf("Your age is %f%n", (float)age);

        // formatting options

        String formmatedString = String.format("Your age is %d", age);
        System.out.println(formmatedString);

        formmatedString = "Your age is %d".formatted(age);
        System.out.println(formmatedString);
    }
}
