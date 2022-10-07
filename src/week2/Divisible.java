package week2;

public class Divisible {
    /*
    Write a program that can print the numbers between 1-100 that can be divisible by 3,5,15.
        *If the number can be divisible bye 3,5,15, then it should only be displayed in week2.Divisible Bye 15 section
        * If the number can be divisible by 3 but cannot be divisible bye 15, then it should only be displayed in week2.Divisible by 3 section
        * If the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in week2.Divisible bye 5 section

     */
    public static void main(String[] args) {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for(int i = 1; i <=100; i++){
            if(i%3 == 0 && i%5 == 0 && i%15 ==0){
                divisibleBy15+= i +" ";
            } else if (i%5 == 0) {
               divisibleBy5+= i + " ";
            }else if (i%3 == 0){
                divisibleBy3+= i + " ";
            }
        }

        System.out.println("week2.Divisible by 15 " + divisibleBy15);
        System.out.println("week2.Divisible by 5 " + divisibleBy5);
        System.out.println("week2.Divisible by 3 " + divisibleBy3);


    }
}
