package Mladen_S.week9;

public class ArrayConcatTwoArrays {
    /*
    Write a return method that can concate two arrays
     */

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }





}
