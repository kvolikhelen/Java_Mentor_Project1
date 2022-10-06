package Mladen_S.week3;

public class PrimeNum {
    public static void main(String[] args) {
        // Write a method that can check if a number is prime or not -- A prime number is a number that is only divisible by 1 and itself.
        int n =11;
        boolean isPrime = true;
        for (int i = 2; i <n; i++) {
            if(n%1==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime ? "Prime number" : "Not a Prime Number");
    }
}
