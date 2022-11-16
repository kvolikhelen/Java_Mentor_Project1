package week7;

import java.util.Arrays;

public class SortAscending {
    /*Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7 , 6 };
                 6 ,
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
    public static int[] sortAscending(int... nums) {
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(10, 8, 5, 4, 7)));
        System.out.println(Arrays.toString(sortAscending(10, 9, 8, 7, 6)));
        System.out.println(Arrays.toString(sortAscending(10, -8, 5, 4, 7)));
    }

}
