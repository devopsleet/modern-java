public class AutoBox2 {

    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = 1000;

        int i = iOb.byteValue();
        System.out.println(i);
    }
}
