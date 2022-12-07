package Week5;

public class ReverseString {
    /*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */


    public static String reverseWord(String word){

        String wordReversed = "";

        for(int i = word.length() -1; i >= 0; i--){

            wordReversed += "" + word.charAt(i);

        }

        return wordReversed;

    }


    public static void main(String[] args) {

        System.out.println(reverseWord("ABCD"));

    }
}
