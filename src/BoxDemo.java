class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double volume() {
        //System.out.println("Volume is ");
        return width * height * depth;
    }
        //parameterized constructor
        Box(double width, double height, double depth){
          //  System.out.println("Constructing the box constructor");
    //void setDim(double w, double h, double d) {
            this.width = width;
            this.height = height;
            this.depth = depth;

    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }


}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;

    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(10,20,30);
        Box mybox2 = new Box(12,14,16);

        double vol;
        vol = mybox.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
        System.out.println();

        //mybox.setDim(10,20,15);

//        mybox.width = 10;
//        mybox.height = 20;
//        mybox.depth = 15;

//        vol = mybox.width * mybox.height * mybox.depth;
//        System.out.println("Volume is " + vol);

//        vol = mybox.volume();
//        System.out.println("volume is " + vol);


    }
}
