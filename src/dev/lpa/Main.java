package dev.lpa;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("found");
        }
        
    }

//        int[] myIntArray  = new int[10];
////        myIntArray[0] = 45.0;
//
//        myIntArray[5] = 50;
//
//        double [] myDoubleArray = new double[10];
//        myDoubleArray[2] = 3.5;
//
//        System.out.println(myDoubleArray[2]);
//        int[] firsTen = {1,2,3,4,5,6,7,8,9,10};
//
//        System.out.println("first = " + firsTen[0]);
//        int arrayLength = firsTen.length;
//        System.out.println("length of array " + arrayLength);
//
//        System.out.println("last = " + firsTen[arrayLength - 1]);
//
//        int[] newArray = new int[5];
//        //newArray = new int[] {1,2,3,4,5};
//
//        for(int element: newArray) {
//            System.out.println(element + " ");
//        }
//
//        System.out.println();
//        System.out.println(Arrays.toString(newArray));
//
//        Object objectVariable = newArray;
//        if(objectVariable instanceof int[]) {
//            System.out.println("ObjectVariable is really an int array");
//        }
//
//        String[] names = {"Gagan"};
//        System.out.println(names);




    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }
//        for(int x: newInt) {
//            x = random.nextInt(100);
//        }

        return newInt;
    }
}

//class Solution {
//    public int[] sortArrayByParity(int[] A) {
//        int[] ans = new int[A.length];
//        int t = 0;
//
//        for (int i = 0; i < A.length; ++i)
//            if (A[i] % 2 == 0)
//                ans[t++] = A[i];
//
//        for (int i = 0; i < A.length; ++i)
//            if (A[i] % 2 == 1)
//                ans[t++] = A[i];
//
//        return ans;
//    }
//}
