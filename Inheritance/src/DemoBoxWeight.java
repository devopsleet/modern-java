class Box {
    double width, height, depth;

    // constructor clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }




}

class BoxWeight extends Box {

    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }


    double volume(){
        
    }

}


class DemoBoxWeight {

    public static void main(String[] args) {

        BoxWeight bw1 = new BoxWeight(10,20,30,40)

    }

}
