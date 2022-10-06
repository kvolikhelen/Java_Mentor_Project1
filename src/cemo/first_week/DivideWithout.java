package cemo.first_week;

public class DivideWithout {
    public static long divide(long a, long b){
        int count=0;
        while (a > b){
            a= a-b;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(divide(-20,3));
    }

}
