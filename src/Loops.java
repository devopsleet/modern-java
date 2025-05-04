public class Loops {
    public static void main(String[] args) {

        //var x = 2.5;
       // System.out.println(InstanceO(x));

        int sum = 0;
        int nums[][] = new int[3][5];

        for(int i = 0; i <3; i++) {
            for(int j = 0; j < 5; j++) {
                nums[i][j] = (i+1) * (j + 1);
            }
        }

        // enhanced fro loop

        for(int x[]: nums) {
            for(int y: x) {
                System.out.println("The value of y is " + y);
                sum = sum + y;
            }
        }

        System.out.println("Total sum = " + sum);
//        int nums[] = {1,2,3,4,5,6,7,8,9,10};
//        int sum = 0;
//        for(int x: nums) {
//            sum = sum + x;
//
//        }
//        System.out.println(sum);
    }

}
