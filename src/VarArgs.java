class Upper {

    // constructor with varargs
    Upper(String msg, int... v) {
        System.out.println(msg);
        for( int x:v) {
            System.out.println(x);
        }
    }

    // constructor with varargs
    Upper(String... v) {
        System.out.println("The string elements are : ");
        for(String x:v) {
            System.out.println(x);
        }
    }
}

public class VarArgs {
    public static void main(String[] args) {
        // local variable type inference
        var upper1 = new Upper("The int elements are", 1,2,3);
        var upper2 = new Upper("Gagan", "Singla");
        System.out.println(upper1);
        System.out.println(upper2);
    }
}
