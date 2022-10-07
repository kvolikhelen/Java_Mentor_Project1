package week1;

public class Task3_FinRa {

    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 != 0 && i % 3 != 0) {
                System.out.println(i);
            }

        }
    }
}
