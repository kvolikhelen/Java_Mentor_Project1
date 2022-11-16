package week7;

import java.util.Arrays;

public class FindMaxMinArray {
    /*
    Question1: Array - Find Maximum and Minimum
Write a metho3d that can find the maximum and minimum number from an int Array
     */
    public static void findMaxMin(int... nums){
        int highest = nums[0];
        int lowest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest)  highest = nums[i];
            if (nums[i] < lowest) lowest = nums[i];
        }
        System.out.println("Minimum : " + lowest);
        System.out.println("Maximum : " + highest);
    }

    public static void main(String[] args) {
        findMaxMin(1,2,3,4,5,6,7,8,-9);
        findMaxMin(10,-3,5,6,-5,2,5);

    }


}
