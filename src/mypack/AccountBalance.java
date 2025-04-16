package mypack;

//public class Balance {
//    String name;
//    double bal;
//
//    public Balance(String n, double b) {
//        name = n;
//        bal = b;
//    }
//
//    public void show() {
//        if(bal < 0) {
//            System.out.println("--->");
//        }
//        System.out.println(name + ": $ " + bal);
//        System.out.println();
//    }
//}
public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K.J", 123.23);
        current[1] = new Balance("Will Tell", 157.02);
        current[2] = new Balance("Tom", -12.33);

        for(Balance c : current) {
            c.show();
        }
    }


}
