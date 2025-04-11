enum Apple1 {
    Jonathan(10), GoldenDel, RedDel(12);

    private int price;

    Apple1(int p) {
        price = p;
    }

    Apple1() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;

        //Display the price of Winesap.
        System.out.println(Apple.GoldenDel.getPrice());

        for(Apple1 a: Apple1.values()) {
            System.out.println(a.getPrice());
        }
    }



}
