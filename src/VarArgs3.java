public class VarArgs3 {

    static void vaTest(int ...v) {
        System.out.println("Number of args: " + v.length);

        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
    }
}
