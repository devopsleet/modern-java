public class StringDemo {
    public static void main(String[] args) {
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1;

        System.out.println("the length of the strOb1: " + strOb1.length());

        System.out.println("Char at index 3 in strOb1 is " + strOb1.charAt(3));

        if(strOb1.equals(strOb3)) System.out.println("Both the objects are equal");
    }
}
