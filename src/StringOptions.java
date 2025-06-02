public class StringOptions {

    public static void main(String[] args) {
        String helloworld = "Hello " + "World";
        helloworld.concat(" and GoodBye");

        StringBuilder helloworldbuilder = new StringBuilder("Hello " + "World");
        helloworldbuilder.append(" and GoodBye");


        printInformation(helloworld);
        printInformation(helloworldbuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(34));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder helloworldbuilderPlus = new StringBuilder("Hello " + "World");
        helloworldbuilderPlus.append(" and GoodBye");
        System.out.println(helloworldbuilderPlus.indexOf("G"));
        helloworldbuilderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(helloworldbuilderPlus);

        helloworldbuilderPlus.reverse().setLength(3);
        System.out.println(helloworldbuilderPlus);

    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
