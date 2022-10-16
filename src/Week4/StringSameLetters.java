package Week4;

import java.util.*;

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */
public class StringSameLetters {
    // sameLetter by using Collection framework, Iterator
    public static boolean sameLetter(String str, String str1){

        TreeSet<String> list = new TreeSet<>(Arrays.asList(str.split("")));
        TreeSet<String> list1 = new TreeSet<>(Arrays.asList(str1.split("")));

        if (list.size() != list1.size()){
            return false;
        }else {
            Iterator<String> letters = list.iterator();
            Iterator<String> letters1 = list1.iterator();
            while (!letters.next().equals(letters1.next())){
                return false;
            }
        }

        return true;
    }

    // sameLetter by using String methods and loop
    public static boolean sameLetter1(String str, String str1){

        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!temp.contains("" + str.charAt(i))){
                temp += "" + str.charAt(i);
            }
        }

        String temp1 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (!temp1.contains("" + str1.charAt(i))){
                temp1 += "" + str1.charAt(i);
            }
        }

        if (temp.length() != temp1.length()){
            return false;
        }else{
            for (int i = 0; i < temp.length(); i++) {
                if (!temp.contains("" + temp1.charAt(i)) || !temp1.contains("" + temp.charAt(i))){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameLetter("aaabbbccdd", "abcd"));
        System.out.println(sameLetter("abc", "abb"));

        System.out.println(sameLetter1("aaabbbccdd", "abcd"));
        System.out.println(sameLetter1("abc", "abb"));

    }
}
