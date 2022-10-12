import java.util.Scanner;

public class OddEvan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println(num + " : is even");

        }
        if(num%3 ==0){

            System.out.println(num + " :  is odd");
        }

    }


}
