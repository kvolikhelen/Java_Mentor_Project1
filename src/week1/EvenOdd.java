package week1;

public class EvenOdd {
    /*
   write a methods which can identity give number is even or odd
   identity(5) -> odd
    */
    public static String identity(int number){

        if (number%2 == 0){
            return  "Even";
        } else  {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(identity(5));
        System.out.println(identity(4));
    }
}
