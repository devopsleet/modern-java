class MyBox {
    double width, depth, height;

    double volume() {
        return width * depth * height;
    }
}

class MyBoxWeight extends MyBox {
    double weight;

    MyBoxWeight(double w, double d, double h, double m) {
        width = w;
        depth = d;
        height = h;
        weight = m;
    }
}
public class DemoBoxWeight {
    public static void main(String[] args) {
        var b = new MyBox();
        var mbox = new MyBoxWeight(10,20,30, 40);
        b = mbox;
        System.out.println("The volume of the box is " + b.volume());
        System.out.println("the wight of the box is ");
    }
}
