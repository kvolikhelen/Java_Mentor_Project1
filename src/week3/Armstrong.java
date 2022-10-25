package week3;

public class Armstrong {
    /* Numbers -- Armstrong numbers
Write a method that can check if a number is
Armstrong number*/
    public static boolean armstrongNumber(int num){
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return c == b;
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
}
