package Week6;

public class FindMaxInArray {


    /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */


    public static int maxNum(int ... arr){

        int max = arr[0];   // set default max as first element of array

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];     // don't do += or it will add number to the max rather than set the max
            }


        }

        return max;




    }


    public static void main(String[] args) {
        System.out.println(maxNum(new int[]{4, 3, 10, 11, 12, 42, 32, 23}));
    }


}
