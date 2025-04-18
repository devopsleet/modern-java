enum Apple1 {
    Jonathan(10), RedDel(12);

    private int price;

    Apple1(int p) {

        System.out.println(p);
        price = p;
    }

}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;

        for(Apple1 apples: Apple1.values()) {

        }

    }



}
