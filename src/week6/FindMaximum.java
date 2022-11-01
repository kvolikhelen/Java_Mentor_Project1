package week6;

public class FindMaximum {
    /* Array -- Find Maximum
Write a method that can find the maximum number from an int Array*/

    public static int findMaximum (int... nums){
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println( findMaximum(1,200,3,5,7,100));
    }


}
