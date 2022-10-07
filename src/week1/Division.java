package week1;

public class Division {

    static double division(int num1, int num2){

        double counter = 0;

        while(num1>=num2){
                num1-=num2;
                counter++;
            }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(division(8, 4)); // 2
        System.out.println(division(10, 5)); //2
        System.out.println(division(30, 10)); //3

    }

}
