class A {
    int i;
    int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    int total;

    void showk() {
        System.out.println("print k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i+j+k));
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        superOb.showij();
        System.out.println();

        subOb.i = 7;

        subOb.j = 8;
        subOb.k = 9;

        subOb.showij();
        subOb.showk();
        subOb.sum();

    }

}
