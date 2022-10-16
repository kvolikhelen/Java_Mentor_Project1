package Week4;

import java.util.Arrays;

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */
public class StringSameLetters {
    // sameLetter by using Array and Array methods
    public static boolean sameLetter(String str, String str1){
        if (str.length() == str1.length()){
            String[] arr = str.split("");
            String[] arr1 = str1.split("");
            Arrays.sort(arr);
            Arrays.sort(arr1);
            return Arrays.equals(arr,arr1);
        }
        return false;
    }

    // sameLetter by using String methods and loop
    public static boolean sameLetter1(String str, String str1){
        if (str.length() != str1.length()){
            return false;
        }
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (!str.contains("" + str1.charAt(i)) || !str1.contains("" + str.charAt(i))){
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "cab"));
        System.out.println(sameLetter("abc", "abb"));

        System.out.println(sameLetter1("abc", "cab"));
        System.out.println(sameLetter1("abc", "abb"));

    }
}
