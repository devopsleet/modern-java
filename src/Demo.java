
//class Calculator {
//
//    int a;
//
//    public int add(int n1) {
//        System.out.println("addition");
//
//        return 0;
//    }
//
//}

class Computer {

    public void playMusic() {

        System.out.println("Playing Music");
    }

    public String getMeAPen(int cost) {

        return "Pen";
    }
}

public class Demo {

    public static void main(String[] args) {

        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.getMeAPen(10);

        System.out.println();

//        Calculator calc = new Calculator(int num1, int num2);
//
//        int result = calc.add();

        System.out.println();


    }
}

// Object Oriented Programming
// Object - Properties and Behaviours
