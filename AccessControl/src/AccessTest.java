class Test {
    int a; // default access
    public int b; // public access

    private int c; // private access

    // methods to access c
    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

        ob.setc(100);
        System.out.println("The value of ob.c is: " + ob.getc());
    }
}
