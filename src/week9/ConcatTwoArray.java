package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatTwoArray {
    /*
    Array - Concat two arrays
Write a return method that can concate two arrays
     */
    public static int[] concatTwoArray(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int count = 0;
        for (int each : arr1) {
            result[count++] = each;
        }

        for (int each : arr2) {
            result[count++] = each;
        }

        return result;


    }

    public static void main(String[] args) {
        int[] a = {1,2,3} , b = {4,5,6};
        System.out.println(Arrays.toString(concatTwoArray(a, b)));
    }
}
