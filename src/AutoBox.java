public class AutoBox {
    public static void main(String[] args) {

        Integer iOb = Integer.valueOf(100);
        System.out.println(iOb);

        int i = iOb;
        System.out.println(iOb.intValue());
       System.out.println(i + " " + iOb);
   }
}
