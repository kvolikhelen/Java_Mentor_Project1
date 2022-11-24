package Week9;

import java.util.Arrays;

public class Array_ConcatTwoArrays {
    /*
Array - Concat two arrays
Write a return method that can concat two arrays
     */

    public static int[] concatArrays(int[] arr, int[] arr1) {
        int arrSize = arr.length + arr1.length;
        int[] arrMerged = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arrMerged[i] = arr[i];
        }
        for (int i = arr.length, j = 0; i < arrSize; i++) {
            arrMerged[i] = arr1[j++];
        }

        return arrMerged;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[]{6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(concatArrays(arr, arr1)));
    }

}
