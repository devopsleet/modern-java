package dev.lpa;
import java.util.Random;
import java.util.Arrays;
public class ArrayChallenge {
    public static void main(String[] args) {
        int[] arr = generateRandomArry(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = generateRandomArry(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(fourthArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5, 0};

        if (Arrays.equals(s1,s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

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
