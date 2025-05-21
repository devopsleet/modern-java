package dev.lpa;


import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayTest {

}
public class ArrayListsPractice {
    public static void main(String[] args) {

        ArrayTest at = new ArrayTest();
        System.out.println(at.getClass());
        System.out.println(at.hashCode());

        int[] numbers = new int[10];
        System.out.println(numbers.getClass().getName());
        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers));

    }
}
