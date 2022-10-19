package Week3;

public class PrimeNumbers  {
    public static void main(String[] args) {

// write a method that can check if a number is prime or not

        System.out.println(primeNumber(13));







    }

    public static boolean primeNumber(int num){

        if(num < 2){
            return false;
        }


        for(int i = 2; i < num ; i++){

            if(num % i == 0){
                return false;
            }



        }

        return true;

    }






}


