package allaboutstrings;

public class StringOptions {
    public static void main(String[] args) {

        String helloworld = "Hello " + "World";
        String newStr = helloworld.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(newStr);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder sb = new StringBuilder();
        sb.append("a".repeat(17));
        printInformation(sb);
        sb.append("b".repeat(34));
        printInformation(sb);


    }

    public static void printInformation(String str) {
        System.out.println("String =  " + str);
        System.out.println("Length = " + str.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String =  " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
