package dev.lpa;
import java.util.Random;
import java.util.Arrays;
public class ArrayChallenge {
    public static void main(String[] args) {
        int[] arr = generateRandomArry(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] generateRandomArry(int len) {
        Random r = new Random();
        int[] newArray = new int[len];

        for(int i = 0; i < 10; i++) {
            newArray[i] = r.nextInt(100);

        }

        return newArray;
    }
}
