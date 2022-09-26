package Mladen_S;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class OddEvenNums {
    /*
    write a method which can identify given number even or odd
    EX:
    identify(5) -> "Odd"
    identify(6) -> "Even"
     */
    public static void main(String[] args) {

        int num;

        System.out.println("Enter number please: ");

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }

    }
}
