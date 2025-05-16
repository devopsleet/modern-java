class MyNewBox {
    private double width, height, depth;

    MyNewBox(MyNewBox o){
        width = o.width;
        height = o.height;
        depth = o.height;

    }
}

class BoxWeight extends MyNewBox {

    private double weight;
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight bx = new BoxWeight()
    }
}
