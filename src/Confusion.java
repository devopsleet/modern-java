
abstract class SuperClass {
    void common() {
        System.out.println("Superclass method");
    }
}

interface Callbacks {
    void common();
}
class SubClass implements Callbacks {
    public void common() {
        System.out.println("Subclass method");
    }
}

public class Confusion {

    public static void main(String[] args) {
        Callbacks c = new SubClass();
        c.common();

    }
}
