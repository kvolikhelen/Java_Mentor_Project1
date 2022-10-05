package Week1;

public class DivideWithoutOperator {
    /*
Write a method that can divide two numbers without using division operator
 */

    public static int divider(int dividend, int divisor) {
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divider(20, 5));
    }
}
