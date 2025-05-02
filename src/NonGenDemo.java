class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);
        NonGen strOb = new NonGen("abc");

        iOb = strOb;
        int v = (Integer) iOb.getob();

    }
//    NonGen iOb = new NonGen(88);
//    NonGen strOb = new NonGen("abc");
//
//    iOb = strOb;




}
