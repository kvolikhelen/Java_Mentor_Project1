package week3;

public class ReverseNegativeNumber {
    /*Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int*/
    public static int reverseNegativeNumber(int number){
        if(number < 10 && number >= 0)  return number;

        int result = 0;
        while (number !=0 ) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-123));
    }
}
