package week1;

public class Division {
    public static void main(String[] args) {
        /*number divide without / operator
        write a method that divide two number without using divided operator
         week1.Division using Repeated Subtraction
        We know that divisions can be solved by repeatedly subtracting the divisor from the dividend until it becomes less than the divisor. The total number of times the repeated subtraction is carried out is equal to the quotient.
         */
        divideWithoutOperator(5, 2);
        divideWithoutOperator(20, 5);
    }

    public static void divideWithoutOperator(int num1, int num2) {
        if (num2==0) System.out.println("Can not divide by 0");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " remainder " + num1);
    }


}
