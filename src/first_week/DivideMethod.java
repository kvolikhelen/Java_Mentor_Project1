package first_week;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {

        divideMethod();

    }

    public static void divideMethod(){
        int a,b,c;
        int result=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = input.nextInt();
        System.out.println("Enter 2nd number");
        b = input.nextInt();
        c = a + b;

        while (c>=b){
            c=c-b;
            result++;
        }

        System.out.println("result = " + result);
    }
}
