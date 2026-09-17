public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score is less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        }else {
            System.out.println("Got here");
        }

        char c = 'A';
        long x = c;
        System.out.println(x);

        int a = 150;
        byte b = (byte) a;
        System.out.println(b);


    }
}
