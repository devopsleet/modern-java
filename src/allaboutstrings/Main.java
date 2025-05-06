package allaboutstrings;

public class Main {
    public static void main(String[] args) {

        printInformation("Hello World");
        String str = "hello world";
        System.out.printf("Index of l = %d %n",str.indexOf('l'));
        System.out.printf("LastIndex of l = %d %n", str.lastIndexOf('l'));
        System.out.printf("Index of l = %d %n",str.indexOf('l',3));
        System.out.printf("LastIndex of l = %d %n", str.lastIndexOf('l',8));

    }

    public static void printInformation(String str) {
        int length = str.length();
        System.out.printf("Length = %d %n", length);
        System.out.println(str.charAt(0));
        System.out.printf("%c %n", str.charAt(0));
        System.out.printf("Last char = %c %n", str.charAt(length - 1));
        if (str.isEmpty()) {

        }
    }
}
