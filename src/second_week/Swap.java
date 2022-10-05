package second_week;

public class Swap {

    //Swap two variables values without using third variable

    public static String swap(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;
        return "a swap to b: a = " + a +" b = " + b;
    }

    public static void main(String[] args) {
        System.out.println(swap(3, 5));
    }

}
