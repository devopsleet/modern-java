package Inheritance;

class Box {

    protected double width, height, depth;

    Box() {

    }
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }


}


class BoxWeight extends Box {

    protected double weight;

    BoxWeight() {

    }
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;

    }
}

class Shipment extends BoxWeight {
    protected double cost;

    Shipment() {

    }

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    double volume(){
        return width * height * depth;
    }
}


public class DemoShipment {
    public static void main(String[] args) {

        Shipment sh1 = new Shipment();
        sh1.width = 10;
        sh1.height = 20;
        sh1.depth = 30;
        sh1.weight = 15;
        sh1.cost = -1;


        Shipment sh2 = new Shipment(sh1);

        System.out.println("Volume is " + sh2.volume());

    }
}
