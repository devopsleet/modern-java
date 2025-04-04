class NewBox {
    double width;
    double height;
    double depth;

    // Constructor
    NewBox(NewBox ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // parameterized constructor
    NewBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    NewBox() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor when ci=ube is created
    NewBox(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class NewBoxWeight extends NewBox {
    double weight;

    NewBoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;

    }



}

public class NewBoxDemo {
    public static void main(String[] args) {
        NewBoxWeight mybox1 = new NewBoxWeight(10,20,15,34.3);
        NewBoxWeight mybox2 = new NewBoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("The weight of mybox1 is " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("The weight of mybox1 is " + mybox2.weight);

    }

}
