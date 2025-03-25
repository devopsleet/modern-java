//import java.sql.SQLOutput;

public class Main  extends Object{
    public static void main(String[] args) {

        // Local variable type inference
        var avg = 0.0;
        System.out.println("Value of avg is " + avg);

        int var = 1;

        var k = 10 - var;
        System.out.println("Value of k is " + k);

//        double m[][] = {
//                {0*0, 1*0},
//                {0*1, 1*1}
//        };
//
//        int i,j;
//
//        for(i=0; i<2; i++) {
//            for (j = 0; j < 2; j++)
//                System.out.print(m[i][j] + " ");
//            System.out.println();
        }

//        int twoD [] []  = new int[4][5];
//        int i,j, k = 0;
//
//        for (i = 0; i <4; i++)
//            for(j = 0; j <5; j++) {
//                twoD[i][j] = k;
//                k++;
//            }
//
//        for(i=0; i <4; i++) {
//            for(j=0; j<5; j++)
//                System.out.print(twoD[i][j]  + " ");
//            System.out.println();
//            //System.out.println();
//            //}
//        }



//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = .1234;
//
//        double result = (f * b) + (i /c) - ( d * s);
//        System.out.println("result = " + result);
//
//        // AutoArray
//        int month_days[] = {31, 30,28};
//
//        System.out.println("January has " + month_days[0] + " days");
//
//        // Average an arry of values
//        double nums[] = {10.1, 11.2, 12.3, 13.4};
//        double res = 0;
//
//        int j;
//        for (j = 0; j < 4; j++) {
//            res = res + nums[j];
//            System.out.println("Average is " + res/5);
//        }


        

//        int x;
//
//        byte b = 50;
//        b = (byte) (b *2);
//
////        if ( x == 10){
////            int y = 20;
////
////            x = y *2;
////        }
//
//        System.out.println(b);
//        float pi, r,a;
//
//        r = 10.8f;
//
//        pi = 3.14f;
//
//        a = pi * r * r;
//
//        System.out.println("Are of circle is " + a);
//
//        char ch1;
//
//        ch1 = 'X';
//
//        System.out.println("ch1 contains " + ch1);
//
//        ch1++; // increment ch1
//        System.out.println("ch1 is now " + ch1);

//        int lightspeed;
//        long days;
//        long seconds;
//        long distance;
//
//        lightspeed = 186000;
//
//        days = 1000;
//
//        seconds = days * 24 * 60 * 60;
//
//        distance = lightspeed   * seconds;
//
//        System.out.print("In " + days);
//        System.out.print(" days light wil travel about ");
//        System.out.println(distance + " miles");
// li
//        int x; // known to all code within main
//
//        x = 10;
//
//        if (x == 10) {
//            int y = 20;
//
//            x = y * 2;


        //y = 100;

        //System.out.println(x);
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
    //}

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
