public class DivideWithoutOperators {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;


        System.out.println(DivideWithoutOperators(num1, num2));

    }

    public static int DivideWithoutOperators(int num1, int num2) {

        int result   = 0;
        while(num1 >= num2){

            num1 = num1-num2;
            result++;

}
return  result;


}}
