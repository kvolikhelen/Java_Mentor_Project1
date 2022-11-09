package week5;

public class Reverse {

    /*
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ===>DCBA
     */
    public static String reverse(String str){
        String [] arr = str.split("");
        String reversed = "";

        for (int i = arr.length-1; i>=0; i--){
            reversed += arr[i]+"";
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

}
