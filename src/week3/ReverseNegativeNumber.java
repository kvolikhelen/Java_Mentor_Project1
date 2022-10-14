package week3;

public class ReverseNegativeNumber {
    /*
    3. Number
Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */

    public static int reverse(int num){

        int reversedNum =0;
        if(num<0) {
            reversedNum = -0;
        }

        while(num !=0){
            reversedNum = reversedNum * 10 + num % 10;
            num = num/10;  // to eliminate last digit
        }

        return reversedNum;

    }

    public static void main(String[] args) {
        System.out.println(reverse(-12345));
        System.out.println(reverse(6588));
        System.out.println(reverse(-98765));
    }
}
