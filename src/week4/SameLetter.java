package week4;

import java.util.*;
import java.util.stream.Collectors;

public class SameLetter {
    /*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/
    public static boolean sameLetter(String str1, String str2){
        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        Collections.sort(list1);
        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list2);
return list1.equals(list2);
    }

    public static void main(String[] args) {
       System.out.println(sameLetter("abc", "cba"));
        System.out.println(sameLetter("abcd", "cba"));
        System.out.println(sameLetter("add", "cba"));

    }


}
