class NBox {
    private double width, height, depth;

    NBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    NBox(NBox ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxW extends NBox{
    double weight;

    BoxW(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    BoxW(BoxW obj){
        super(obj);
        weight = obj.weight;
    }
}

public class PracticeInheritance {
    public static void main(String[] args) {

        BoxW mybox1 = new BoxW(2,10,5,7);
        BoxW myclone = new BoxW(mybox1);

        double vol;
        vol = myclone.volume();
        System.out.println(vol);
    }
}
