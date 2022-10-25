package week5;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindUnique {
    /*String -- Find the unique
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/
    public static String findUnique(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
    }



}
