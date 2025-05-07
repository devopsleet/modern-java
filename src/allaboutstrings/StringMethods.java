package allaboutstrings;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "07/01/1994";
        int startingIndex = birthDate.indexOf("1994");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth Year = " + birthDate.substring(startingIndex));
        



    }
}
