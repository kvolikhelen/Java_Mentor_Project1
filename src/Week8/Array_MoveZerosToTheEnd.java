package Week8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveZerosToTheEnd(int ... arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr1[j++] = arr[i];
            }
            if (i == arr.length-1){
                int numOfZeros = i-j;
                for (int k = 0; k < numOfZeros; k++) {
                    arr1[j++] = 0;
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToTheEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
    }
}
