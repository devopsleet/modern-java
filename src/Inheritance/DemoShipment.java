package Inheritance;

class Box {
    private double width, depth, height;

    Box(Box ob) {
        width = ob.width;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);

    }
}

class Shipment extends BoxWeight {
    Shipment(Shipment ob) {
        super(ob);
    }
}
public class DemoShipment {
    public static void main(String[] args) {

    }
}
