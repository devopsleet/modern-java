class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByten() {
        Test temp= new Test(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        Test ob = new Test(2);

        Test ob2 = ob.incrByten();

        System.out.println(ob2.a);

    }
}
