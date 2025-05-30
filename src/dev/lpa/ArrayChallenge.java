package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {

        int[] unsortedArray = getRandomnArray(5);
        sortIntegers(unsortedArray);
    }

    public static int[] getRandomnArray(int len) {
        Random random = new Random();
        int[] randomArrray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArrray[i] = random.nextInt(1000);
        }

        return randomArrray;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(sortedArray));
        boolean flag = true;
        int temp;

        int pass = 0;
        while(flag) {
            flag = false;
            for(int i=0; i < sortedArray.length -1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
            System.out.println("--->" + pass++ + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
