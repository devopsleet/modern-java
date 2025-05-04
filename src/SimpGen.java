class TwoGen<T,V> {
    T ob1;
    V ob2;

    TwoGen(T o, V v) {
        ob1 = o;
        ob2 = v;
    }

    T getObj1() {
        return ob1;
    }

    V getObj2() {
        return ob2;
    }

}
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj= new TwoGen<Integer, String>(88, "test");

        int v = tgObj.getObj1();
        String s = tgObj.getObj2();

        System.out.println(v);
        System.out.println(s);

        System.out.println();
    }
}
