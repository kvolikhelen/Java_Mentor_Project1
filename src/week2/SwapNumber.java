package week2;

public class SwapNumber {
    /*swap two variable without using a third variable*/
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        swap(10,20);
    }
}
