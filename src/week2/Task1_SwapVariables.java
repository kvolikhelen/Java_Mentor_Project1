package week2;

public class Task1_SwapVariables {
    public static void main(String[] args) {

        //Swap two variables' values without using a third variable
        int num1 = 5;
        int num2 = 10;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);



    }
}
