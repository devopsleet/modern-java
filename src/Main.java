import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Account gagansaccount = new Account();
        //Account gagansaccount = new Account("12345", 1000.0, "Gagan", "email@email.com", "9876543210");
        gagansaccount.withdraw(100.0);
        gagansaccount.deposit(200);
        gagansaccount.withdraw(50);

//        Car car  = null;
//        car.setMake("holden");
//        car.setModel("Carrera");
//        car.setDoors(4);
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        System.out.println("Doors = " + car.getDoors());
    }

}
