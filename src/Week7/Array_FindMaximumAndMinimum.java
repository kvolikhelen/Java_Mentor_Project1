package Week7;
/*
Question1: Array - Find Maximum and Minimum
Write a method that can find the maximum and minimum number from an int Array
 */
public class Array_FindMaximumAndMinimum {

    public static void minAndMaxOfArray(int ... arr){
        int min = arr[0];
        int max = arr[0];
        for (int each : arr) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static void main(String[] args) {
        minAndMaxOfArray(new int[]{1,2,3,4,5,6,7,8,9});
        minAndMaxOfArray(new int[]{25,2,666,10,-20,123});
    }
}
