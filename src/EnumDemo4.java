enum Apple4 {
    Jonathan, GoldenDel, RedDel, Winesap
}

public class EnumDemo4 {

    public static void main(String[] args) {
        Apple4 ap, ap2, ap3;

        System.out.println("Prinitng Ordinal Values");

        for(Apple4 a: Apple4.values()) {
            System.out.println(a.ordinal());
        }

        ap = Apple4.RedDel;
        ap2 = Apple4.GoldenDel;
        ap3 = Apple4.RedDel;

        System.out.println(ap.equals(ap3));
    }
}
