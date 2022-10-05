package Week2;

public class SwapNumbers {

    // Swap two variable values without using a third variable

    public static void main(String[] args) {
        swapNums(5,15);
    }



    public static void swapNums(int num1, int num2){
                            // num1 = 5 & num2 = 15
        num1 = num1 + num2; // num1 = 5 + 15 = 20
        num2 = num1 - num2; // num2 = 20 - 15 = 5
        num1 = num1 - num2; // num1 = 20 - 5 = 15

        System.out.println("num1(" + num2 + ") = " + num1);
        System.out.println("num2(" + num1 + ") = " + num2);
    }

}
