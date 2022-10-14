package week3;

public class PrimeNumbers {
    /*
    Numbers Prime Number
Write a method that can check if a number is
prime or not
     */

    public static String isPrime(int num){
        int count = 0;
        if(num > 1){
            for(int i = 2; i<=num; i++){
                if(num%i== 0){
                    count++;
                }
            }
            if(count == 1){
                return num + " is Prime";
            }else {
                return num + " is not Prime";
            }
        }else {
            return num + " is not Prime";
        }

    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(1));
        System.out.println(isPrime(-8));
        System.out.println(isPrime(53));

    }
}


