package ClassesPart1;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car();
        Car car = null;
        car.setMake("porsche");
        car.setColor("Red");
        car.setModel("Carrera");
        car.describeCar();

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        Car targa = new Car();

    }
}
