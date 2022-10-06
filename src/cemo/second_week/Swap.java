package cemo.second_week;

public class Swap {

    /*
    Swap two variable values without using a third variable
     */

    public static String swap (int a , int b){

        a = a + b;
        b = a - b;
        a = a - b;

        return "After swapping = a =" + a + " b = " +b;


    }


    public static void main(String[] args) {
        System.out.println(swap(20, 17));
    }

}
