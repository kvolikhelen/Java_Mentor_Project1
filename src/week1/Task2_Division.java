package week1;

public class Task2_Division {
    public static int divideNumbers(int x, int y) {
        if (y == 0) {
            System.out.println("Cannot be divided by Zero");
        }
        if (y > x) {
            System.out.println("X number should be greater than Y number");
        }

        int count = 0;

        while (x >= y) {
            x -= y;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divideNumbers(49,7));

    }
}

