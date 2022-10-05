package first_week;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        evenOddNum();


    }

    public static void evenOddNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }


    }
}
