public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
        System.out.println();
    }

    public Dog(String type, double weight) {
        this(type, weight, "early", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small": (weight < 35 ? "medium" : "large") , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;


    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf"){
            System.out.print("Woooooooo");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dog walk and run");
        if (speed == "slow"){
            walk();
            wagTail();

        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("woof");
    }

    private void run() {
        System.out.print("Dog Running");
    }

    private void walk() {
        System.out.print("Dog Walking");
    }

    private void wagTail() {
        System.out.println(" Tail Wagging");
    }
}
