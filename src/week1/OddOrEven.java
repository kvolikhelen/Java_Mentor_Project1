package week1;

public class OddOrEven {

    public static String evenOrOdd(int num){
        if(num%2==0){
            return num + ": Even";
        }else{
            return num + ": Odd";
        }

    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(8));
    }

}
