public class Matix {

    public static void main(String[] args) {
        double[][] m = {
                {0 * 0, 1 * 0},
                {0 * 1, 1 * 1}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();

        }
    }
}
