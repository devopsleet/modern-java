package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray  = new int[10];
//        myIntArray[0] = 45.0;

        myIntArray[5] = 50;

        double [] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);
        int[] firsTen = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("first = " + firsTen[0]);
        int arrayLength = firsTen.length;
        System.out.println("length of array " + arrayLength);

        System.out.println("last = " + firsTen[arrayLength - 1]);

        int[] newArray = new int[5];
        //newArray = new int[] {1,2,3,4,5};

        for(int element: newArray) {
            System.out.println(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]) {
            System.out.println("ObjectVariable is really an int array");
        }

        Object[] objectArray =

    }
}
