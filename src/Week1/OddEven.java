package Week1;

public class OddEven {
    /*
Write a method which can identifies given number is even or odd
EX: identify(5) -> "Odd"
    identify(6) -> "Even"
 */

    public static void oddOrEven(int num){
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
    }
}
