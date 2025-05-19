class HashTest {

}

public class TestHashCode {

    public static void main(String[] args) {
        Object ob = new HashTest();
        HashTest h = new HashTest();

        System.out.println(ob.hashCode());
        System.out.println(h.hashCode());

        HashTest h1 = new HashTest();
        System.out.println(h1.hashCode());

    }
}
