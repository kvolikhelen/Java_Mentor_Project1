package week1;

public class Task1_EvenOrOdd {
    public static int identifyNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("This number is EVEN");
        } else if (number % 2 == 1) {
            System.out.println("This number is ODD");
        }
        return number;
    }


    public static void main(String[] args) {

        System.out.println(identifyNumber(4));

    }
}