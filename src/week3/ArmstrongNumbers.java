package week3;

public class ArmstrongNumbers {
    /*
    2. Numbers
Armstrong numbers
Write a method that can check if a number is
Armstrong number
     */

    public static boolean isArmstrongNumber(int num){

        String [] arr = String.valueOf(num).split("");
        int [] arr2 = new int[arr.length];
        int newSum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0; i<=arr2.length-1; i++){
            newSum+= (arr2[i]*arr2[i]*arr2[i]);
        }
        if(newSum==num){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(50));
        System.out.println(isArmstrongNumber(371));
    }
}
