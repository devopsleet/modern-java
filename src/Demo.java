public class Demo {
    public static void main(String[] args) {
        int nums[] = {3,4,5,7};
        System.out.println(nums[1]);

        int nums1[] = new int[4];
        System.out.println(nums[3]);

        int nums2d[][] = new int[3][];

        // enhanced for-loop
        for(int x[]: nums2d) {
            for (int val: x) {
                System.out.println(val);
            }
        }

        // local type inference
        for(var rows: nums2d) {
            for(var cols: rows) {
                System.out.println(cols);
            }
        }

        int random = (int) (Math.random() * 100);
        System.out.println("Random value is " + random);

    }
}
