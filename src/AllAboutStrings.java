class AllAboutStrings {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("\t\n  ");
        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("Last index of l = %d %n", helloworld.lastIndexOf('l', 8));

        if(helloworld.equals(helloworld.toLowerCase())) {
            System.out.println("Values matches exactly");
        }


        if(helloworld.equalsIgnoreCase(helloworld.toLowerCase())) {
            System.out.println("Values matches ignoring case");
        }


        if (helloworld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (helloworld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloworld.contains("Hello World")) {
            System.out.println("String contains Hello World");
        }


    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length -1));
    }
}
