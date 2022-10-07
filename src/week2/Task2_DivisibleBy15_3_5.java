package week2;

public class Task2_DivisibleBy15_3_5 {
    public static void main(String[] args) {

        int number = 0;
        //  int[] arr = new int[];

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            } else if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";
            } else if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }
        }

        System.out.println("Divisible By 15 " + divisibleBy15);
        System.out.println("Divisible By 3 " + divisibleBy3);
        System.out.println("Divisible By 5 " + divisibleBy5);

    }
}
