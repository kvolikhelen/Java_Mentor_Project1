package week4;

import java.util.Arrays;

public class SameLetters {
    /*
    String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("abc", "abb "); -->false
     */


    public static boolean sameLetters(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));
        System.out.println(sameLetters("ana", "aan"));
        System.out.println(sameLetters("fakjasf", "fafhasifa"));


    }
}
