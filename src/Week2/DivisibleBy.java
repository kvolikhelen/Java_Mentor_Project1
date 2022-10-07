package Week2;

public class DivisibleBy { public static void main(String[] args) {

    divisibleBy(60);

}



    public static void divisibleBy(int a){

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ){
                System.out.println("Divisible by 15: " + i + " ");
            } else if (i % 3 == 0 && i % 15 != 0) {
                System.out.println("Divisible by 3: " + i + " ");
            } else if (i % 5 == 0 && i % 15 != 0) {
                System.out.println("Divisible by 5: " + i + " ");
            }
        }









    }








}



