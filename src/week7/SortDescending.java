package week7;

import java.util.Arrays;

public class SortDescending {
    /*Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static int[] sortDescending(int... nums){
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(10, 8, 5, 4, 7)));
        System.out.println(Arrays.toString(sortDescending(10, 9, 8, 7, 6)));
        System.out.println(Arrays.toString(sortDescending(10, -8, 5, 4, 7)));
    }

}
