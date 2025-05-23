interface MyIF {
    default String getString() {
        return "Deafult String";
    }

    int getNumber();
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
}
public class MyIFImp2 {

    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getString());
    }
}
