class Outer {
    int outer_x = 100;

    void test() {
        Inner in = new Inner();
        in.display();
    }

    class Inner {
        int y = 10;


        void display() {
            System.out.println("The value of outer x is " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.test();
    }
}
