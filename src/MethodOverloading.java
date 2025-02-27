public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//
//        calculateScore(75);
//        calculateScore();

        System.out.println("New Score is "+ calculateScore("Tim", 500));
        System.out.println("New Score is "+ calculateScore(10));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        //System.out.println("Unnamed Player " + " scored " + score + " points");
        return calculateScore("Anonymous", 100);
    }

    public static int calculateScore() {
        System.out.println("No player and score");
        return 0;
    }
}
