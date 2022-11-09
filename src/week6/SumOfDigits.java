package week6;

public class SumOfDigits {

    /*
    Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits(String str){

        int sum = 0;
        for(int i =0; i<str.length(); i++){
            sum +=Integer.parseInt(""+str.charAt(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("45678"));
    }
}
