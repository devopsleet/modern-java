import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("holden");
        car.setModel("Carrera");
        car.setDoors(4);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("Doors = " + car.getDoors());
    }

}
