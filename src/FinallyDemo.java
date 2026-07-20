public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }

    static void procC() {
        try{
            System.out.println("inside procC");
        } finally {
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch(Exception e) {
            System.out.println("Exception caught");
        }

        procB();
        procC();
        System.out.println("Consignor");
        System.out.println("SKU");
        System.out.println("Description");
        System.out.println("Items in Stock");
        System.out.println("Qty Sold");
        System.out.println("Sold Date");
        System.out.println("Invoice #");
        System.out.println("Hammer Price");
        //procD();
        //procE();
        //procF();

    }
}
