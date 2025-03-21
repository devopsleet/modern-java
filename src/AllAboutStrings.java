import java.awt.desktop.SystemEventListener;

public class AllAboutStrings {
    public static void main(String[] args) {

        printInformation("Hello World");

    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("length = %d", length);

        System.out.printf("first char = %c %n", string.charAt(0));

        System.out.printf("last char = %c %n", string.charAt(length - 1));
    }
}
