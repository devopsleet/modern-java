class WoodenBox {
    double width, height, depth;

    // constructor
    WoodenBox() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {

    public static void main(String[] args) {

        WoodenBox mybox1 = new WoodenBox();

        System.out.println("Volume of Wooden box is " + mybox1.volume());

    }
}
