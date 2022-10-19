package Week3;

public class ReverseNumbers {
    public static void main(String[] args) {

// write a return method that can reverse negative number & return it as an int

    System.out.println(reverse(-88));
    System.out.println(reverse(5678));

}

    public static int reverse(int num) {

        boolean isNegative = num < 0 ? true : false;

        if (isNegative) {
            num = num * -1;

        }

        int reverse = 0;
        int lastDigit = 0;

        while(num >= 1){
            lastDigit = num % 10;    // gives you last digit
            reverse = reverse * 10 + lastDigit;
            num = num / 10;          // get rid of last digit


        }
// if it is negative, reverse * -1 (to make positive) : if not negative, return reverse
        return isNegative == true ? reverse * -1 : reverse;
    }
}



