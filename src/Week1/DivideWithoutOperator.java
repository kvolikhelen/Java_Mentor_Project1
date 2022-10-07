package Week1;

public class DivideWithoutOperator {public static void main(String[] args){


    System.out.println(divide(12, 2));



}

    public static int divide(int a, int b){


        if(a == 0){
            System.out.println("Divisible by zero");
        }

        int result = 1;
        if(a * b < 0){
            result = -1;
        }

        int quotient = 0;

        while(a >= b){
            a = a -b;
            quotient++;
        }

        return result * quotient;




    }




}


