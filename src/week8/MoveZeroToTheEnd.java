package week8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroToTheEnd {
    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveZeroToEnd(int... arr){
        int[] newArr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) newArr[count++] = arr[i]; ;
        }

        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroToEnd(1, 0, 2, 0, 3, 0, 4, 0)));
        System.out.println(Arrays.toString(moveZeroToEnd(0,-5,3,6,0,2,7,-4,0,0)));

    }

}
