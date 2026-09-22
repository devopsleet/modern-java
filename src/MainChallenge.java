public class MainChallenge {
    public static void main(String[] args) {





//        boolean gameOver = true;
//        int score = 10000;
        int levelCompleted = 5;
        int bonus = 200;

        long x = 1000;
        int y = (int) x;
//
//        int finalScore = score;
//
//        if (gameOver)
//        {
//            finalScore += levelCompleted * bonus;
//            System.out.println("your final score was " + finalScore);
//        }

        calculateScore(true, 800,5, 100 );
        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;

        int finalScore = score;

//        long maxVal = 2_147_483_648;
//        System.out.println(maxVal);

        if (gameOver)
        {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);
        }

        return finalScore;

    }
}
