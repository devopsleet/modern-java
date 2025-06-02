class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
//        System.out.println(o);
//        T x = o;
//        System.out.println(x);

        //System.out.println();
    }

    T getObj() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class GenDemo {



    public static void main(String[] args) {
        // Create a Gen reference for Integers
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getObj();
        System.out.println("value = " + v);

        System.out.println();

        Gen<String> strOB = new Gen<String>("Generic Test");

        strOB.showType();

        String str = strOB.getObj();
        System.out.println("value = " + str);
    }
}
