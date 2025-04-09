class NewTest {

    @java.lang.Override
    public String toString() {
        return "Custom override method";
    }
}

public class ToString {
    public static void main(String[] args) {
        NewTest nt = new NewTest();
        System.out.println(nt);
    }

}
