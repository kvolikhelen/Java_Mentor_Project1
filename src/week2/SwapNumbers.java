package week2;

public class SwapNumbers {


    public static void main(String[] args) {

        /*
        Swap two variable values without using a third variable
         */

        int x = 20, y =10;

        System.out.println("Before x=" + x + " y=" + y);
        x+=y;            // x + y = 20 + 10 = 30
        y = x - y;      // y = 20
        x-=y;           // x = 10

        System.out.println("After x=" + x + " y=" + y);


    }
}
