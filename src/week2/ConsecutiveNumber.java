package week2;

public class ConsecutiveNumber {
    public static void consecutiveNum(int n){

        for (int i = 1; i < n; i++) {
            if (i%2==0 && i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
            } else if (i%2==0 && i%3==0) {
                System.out.println("CodilityTest");
            } else if (i%2==0) {
                System.out.println("Codility");
            } else if (i%3==0) {
                System.out.println("Test");
            } else if (i%5==0) {
                System.out.println("Coder");
            }  else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        consecutiveNum(24);
    }

}
