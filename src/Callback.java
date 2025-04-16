public interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Callback with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Class that implement interfaces may also define other methods too");
    }
}


class AnotherClient implements Callback {
    @java.lang.Override
    public void callback(int param) {
        System.out.println("Another version of Callback");
        System.out.println(param * param);
    }
}
