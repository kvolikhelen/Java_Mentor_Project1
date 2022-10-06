package Mladen_S.week3;

public class ReverseNegativeNum {
    public static void main(String[] args) {

        int before = 6789;
        int after = reverseNumber(6789);
        System.out.println("Before: " + before + " After: " + after);
    }

    public static int reverseNumber(int number){
        boolean isNegative = number <0 ? true : false;
        if(isNegative){
            number=number*-1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while(number >=1){
            lastDigit = number%10; // gives us last digit
            reverse = reverse*10 + lastDigit;
            number=number /10; // get rid of last digit
        }
        return  isNegative ==true ? reverse*-1 : reverse;
    }
}
