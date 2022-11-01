package Mladen_S.week6.week6;

import java.util.Arrays;

public class findMaxInArray {
    /*
   2. Array -- Find Maximum
Write a method that can find the maximum number from an int Array

     */


    public static void main(String[] args) {

        int [] arr = {9,7,5,3};   // creating an int arr
        Arrays.sort(arr);      // sorting in ascending order
        System.out.println(Arrays.toString(arr));  // printing them entire arr
        int max = arr[arr.length-1]; // finding the last int in arr

        System.out.println(max); // printing the last int of the array
    }

}
