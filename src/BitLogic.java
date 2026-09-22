public class BitLogic {

    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011"
        };

        int a = 3;

        byte b = 64, c ;
        int i;

        i = b << 2;
        System.out.println(i);

        System.out.println("a = " + binary[a]);

        byte x = -10, y;

        y = (byte) (x << 2);

        System.out.println(y);
    }
}
