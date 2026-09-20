public class VarDemo {

    public static void main(String[] args) {

        // Use type inference
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);
        // user-defined variable name
        int var = 1;
        System.out.println("Value of var is " + var);

        // var is used as both the type and as a variable name
        var k = -var;
        System.out.println("Value of k is " + k);

        int num1 = 7;
        int a = ++num1;
        System.out.println(a);
        System.out.println(num1);



    }
}
