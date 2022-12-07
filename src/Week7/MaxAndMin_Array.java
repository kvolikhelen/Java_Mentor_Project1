package Week7;

public class MaxAndMin_Array {

    /*
Array - Find Maximum and Minimum
Write a method that can find the maximum and minimum number from an int Array

     */


    public static void maxAndMinNum(int... arr) {

        int min = arr[0];
        int max = arr[0];


        for (int eachNum : arr) {   // using for each loop to narrow down each number  --- cleaner


            if (eachNum < min) {
                min = eachNum;    // have to do min = eachNum   rather than the other way around, or it will not transfer
            }

            if (eachNum > max) {
                max = eachNum;
            }

        }

        // using print statements since return type is void
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


    }


    public static void main(String[] args) {
        maxAndMinNum(new int[] {2, 4, 5, 0, 10, 23, 3});


}
}
