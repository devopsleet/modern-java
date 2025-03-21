//import java.sql.SQLOutput;

public class Main  extends Object{
    public static void main(String[] args) {

        int x; // known to all code within main

        x = 10;

        if (x == 10) {
            int y = 20;

            x = y * 2;
        }

        //y = 100;

        System.out.println(x);
//        NewStudent max = new NewStudent("max", 21);
//        System.out.println(max);
//
//        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("jimmy", 8, "Gaga");
//        System.out.println(jimmy);
////        Account gagansaccount = new Account();
//        //Account gagansaccount = new Account("12345", 1000.0, "Gagan", "email@email.com", "9876543210");
//        gagansaccount.withdraw(100.0);
//        gagansaccount.deposit(200);
//        gagansaccount.withdraw(50);

//        Car car  = null;
//        car.setMake("holden");
//        car.setModel("Carrera");
//        car.setDoors(4);
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        System.out.println("Doors = " + car.getDoors());
    }

}

class NewStudent {
    private String name;
    private int age;

    NewStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is" + age;
    }
//        return "NewStudent{" +
//                "naam='" + naam + '\'' +
//                ", age=" + age +
//                '}';
//    }
}


class PrimarySchoolStudent extends NewStudent {

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName +  "s kids " +  super.toString();
    }
}
