class A2 {
    int i,j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j are " + i + " and " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a,b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("the value of k is " + k);
    }
}


public class ABCOverride {
    public static void main(String[] args) {
        B2 b2 = new B2(1,2,3);
        b2.show();
    }
}
