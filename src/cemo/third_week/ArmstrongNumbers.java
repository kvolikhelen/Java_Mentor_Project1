package cemo.third_week;

public class ArmstrongNumbers {
    /*
    2. Numbers Armstrong numbers
Write a method that can check if a number is
Armstrong number
     */

    public static String ArmstrongNumber(int x) {
        int temp = x;
        int y;
        int sum = 0;

        while (x > 0) {
            y = x % 10;
            x = x / 10;
            sum += y * y * y;
        }

        if (sum == temp) {
            return temp + " is an Armstrong number";
        } else {
            return temp + " is not an Armstrong number";
        }

    }

}
