package cemo.third_week;

public class Prime {
    /*
    1.
Numbers Prime Number
Write a method that can check if a number is
prime or not
     */

    public static String primeNumber(int x){

        if (x<2){
            return x + " is not prime number";
        }
        for (int i = 2; i <x; i++) {
            if(x%i==0){
                return x + " is not prime number";
            }

        }
        return x + " is prime number";
    }

}





