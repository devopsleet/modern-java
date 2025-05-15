class Test5 {
    int a; // default access
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc(){
        return c;
    }
}

class AccessTest {

    public static void main(String[] args) {
        Test5 t5 = new Test5();
        t5.a = 10;
        t5.b = 20;

        t5.setc(100);
        System.out.println(t5.getc());

    }

}
