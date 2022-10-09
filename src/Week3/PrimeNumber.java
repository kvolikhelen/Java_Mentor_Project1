package Week3;

/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */
public class PrimeNumber {
    public static boolean isPrime(int num){
        if (num < 2){
            if (num < 0){
                System.out.println("Please enter a positive number");
                return false;
            }
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(11));
        System.out.println(isPrime(30));
        System.out.println(isPrime(-1));
    }

}
