package Mladen_S.week3;

public class ArmstrongNum {
    public static void main(String[] args) {
             /*
    Write a method that can check if a number is Armstrong number
     */
        int sum = 0;
        int digit;
        int temp;
        int number = 55;
        temp = number;

        while(temp >0){
            digit = temp %10;
            sum = sum + (digit*digit*digit);
            temp = temp /10;
        }
        if(number==sum)
            System.out.println(number + " is an Armstrong number");
        else{
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
