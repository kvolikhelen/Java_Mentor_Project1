package Week6;

public class Array_FindMaximum {
    /*
    2-) Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */

    public static int maxNumOfArray(int ... arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }


    public static void main(String[] args) {
        System.out.println(maxNumOfArray(new int[]{1, 2, 3, 50, 5, 6, 7, 8, 9}));
        System.out.println(maxNumOfArray(new int[]{1, 2, 3, 50, 5, 6, 7, 8, 85}));
        System.out.println(maxNumOfArray(new int[]{100, 2, 3, 50, 5, 6, 7, 8, 85}));
    }
}
