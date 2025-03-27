class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

//        vol = mybox.width * mybox.height * mybox.depth;
//        System.out.println("Volume is " + vol);

        mybox.volume();


    }
}
