// An enumeration of apple varities

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple

    Apple(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumDemo {


    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.Winesap;

        // Compare two enum values
        if (ap == Apple.Winesap) {
            System.out.println("ap contains GoldenDel \n");
        }

        switch(ap) {
            case Jonathan:
                System.out.println("Hey Jonathan");
                break;
            case Winesap:
                System.out.println("Hey Winesap");
                break;
        }

        System.out.println("Here are all apple constants");

        Apple[] allapples = Apple.values();
        for(Apple a: Apple.values())
            System.out.println(a);

        System.out.println();

        // Display the prices
        System.out.println(Apple.Winesap.getPrice());

        System.out.println("All Apple Prices");
        for(Apple a : Apple.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents.");
        }

    }
}
