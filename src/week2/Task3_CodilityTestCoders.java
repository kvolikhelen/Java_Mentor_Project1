package week2;

import java.util.Scanner;

public class Task3_CodilityTestCoders {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any positive number");
        int number = input.nextInt();

        String result = "";


        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result += "CodilityTestCoders\n";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result += "CodilityTest\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "TestCoders\n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += "CodilityCoders\n";
            } else if (i % 2 == 0) {
                result += "Codility\n";
            } else if (i % 3 == 0) {
                result += "Test\n";
            } else if (i % 5 == 0) {
                result += "Coders\n";
            } else {
                result += i + "\n";
            }
        }
        System.out.println(result);


    }
}
