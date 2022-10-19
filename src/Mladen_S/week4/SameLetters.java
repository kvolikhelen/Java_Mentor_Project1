package Mladen_S.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {
      /*
    String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

     */

    public static void main(String[] args) {
        System.out.println("sameLetters(\"abc\",\"cab\") -> " + sameLetters("abc", "cab"));
        System.out.println("sameLetters(\"abc\",\"abb\") -> " + sameLetters("abc", "abb"));
    }

    public static boolean sameLetters(String s1, String s2) {

        List<String> firstList = new ArrayList<>(Arrays.asList(s1.split("")));
        Collections.sort(firstList);
        List<String> secondList = new ArrayList<>(Arrays.asList(s2.split("")));
        Collections.sort(secondList);


        return firstList.equals(secondList);
    }
}
