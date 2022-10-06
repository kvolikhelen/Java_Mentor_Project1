package cemo.second_week;

import java.util.Scanner;

public class ConsecutiveNumbers {
    /*
    Numbers
print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number
divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. lf a number is divisible by more than
one of the numbers: 2,3 or 5. it should be replaced by a concatenation of the respective words Codility, Test and Coders in this
given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
For example, here is the output for N- 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N = input.nextInt();
        String divisibleBy_2 = "Codility";
        String divisibleBy_3 = "Test";
        String divisibleBy_5 = "Coders";

        for (int i = 1; i <=N ; i++) {

            if (i % 30 == 0){
                System.out.println(divisibleBy_2 + divisibleBy_3 + divisibleBy_5);
            } else if (i % 15 == 0) {
                System.out.println(divisibleBy_3 + divisibleBy_5);
            } else if (i % 10 == 0) {
                System.out.println(divisibleBy_2 + divisibleBy_5);
            } else if (i % 6 == 0) {
                System.out.println(divisibleBy_2 + divisibleBy_3);
            } else if (i % 5 == 0 ) {
                System.out.println(divisibleBy_5);
            } else if (i % 3 == 0) {
                System.out.println(divisibleBy_3);
            } else if (i % 2 == 0) {
                System.out.println(divisibleBy_2);
            }else {
                System.out.println(i);
            }
        }



    }

}
