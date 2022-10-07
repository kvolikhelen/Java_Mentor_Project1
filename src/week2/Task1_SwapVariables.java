package week2;

public class Task1_SwapVariables {
    public static void main(String[] args) {


        int num1 = 5;
        int num2 = 10;

        num1 = num1 + num2; // num1 = 15
        num2 = num1 - num2; // num2 = 5
        num1 = num1 - num2; // num1 = 10

        System.out.println(num1); // 10
        System.out.println(num2); // 5



    }
}
