package cemo.third_week;

public class ReverseNegativeNumber {
    /*
    3. Number
Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */

    public static String reverseInt (int x){
        int temp;
        if (x < 0){
          temp = -x;
        }else {
            temp = x;
        }
        int y;
        String z = "";

        while(temp > 0){
          y  = temp % 10;
          temp = temp / 10;
          z += "" + y;

        }

        return "-"+z;

    }

    public static void main(String[] args) {
        System.out.println("reverseInt ="  + reverseInt(-567));
    }
}
