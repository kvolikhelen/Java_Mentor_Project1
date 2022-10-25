package Week5;
/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */
public class String_Reverse {
    public static String reverse(String str){
        String returnStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            returnStr += "" + str.charAt(i);
        }
        return returnStr;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }
}
