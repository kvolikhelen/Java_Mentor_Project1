package Mladen_S.week5;

public class Reverse {
     /*
    Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String str) {


        String reverse= "";
        for(int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
