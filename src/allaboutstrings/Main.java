package allaboutstrings;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        printInformation("Hello World");
        String str = "hello World";
        System.out.printf("Index of l = %d %n",str.indexOf('l'));
        System.out.printf("LastIndex of l = %d %n", str.lastIndexOf('l'));
        System.out.printf("Index of l = %d %n",str.indexOf('l',3));
        System.out.printf("LastIndex of l = %d %n", str.lastIndexOf('l',8));
        String helloWorldLower = str.toLowerCase();
        if (str.equals(helloWorldLower)) {
            System.out.println("Values matches exactly");
        }
        if(str.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("values mach ignoring cases");
        }

        if(str.startsWith("hello")) {
            System.out.println(str + " startes with hello");
        }
        if(str.endsWith("World")) {
            System.out.println(str + " ends with World");
        }
        if(str.contains(" ")) {
            System.out.println(str + " contains space");
        }


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
