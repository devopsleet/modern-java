class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
        System.out.println(o);
        T x = o;
        System.out.println(x);

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
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);


    }
}
