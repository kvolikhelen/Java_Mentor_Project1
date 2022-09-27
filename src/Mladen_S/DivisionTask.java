package Mladen_S;

import java.util.Scanner;

public class DivisionTask {

    // Write a method that can divide two Integers without using the division operator

    public static void main(String[] args) { //main method


                int div;
                int result=0;     //variable declaration
                Scanner scan=new Scanner(System.in); //create a scanner instance for receives input
// from the user - input from keyboard
                System.out.print("Enter the value to num1: ");
                int num1=scan.nextInt();//Reading the input for num1
                System.out.print("Enter the value to num2: ");
                int num2=scan.nextInt();//Reading the input for num2
                while(num1>=num2) {
                    num1=num1-num2;
                    result++;

                }
                System.out.println("Division is:"+result);
            }
        }
