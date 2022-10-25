package Week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
Ex:
Input: "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"

 */
public class String_SortLettersAndNumberFromAlphanumeric {
    public static String sort(String str) {
        String temp = "";

        for (int i = 0; i < str.length() - 1; i++) {
            temp += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                temp += ",";
            }
            if (Character.isDigit(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
                temp += ",";
            }
        }
        temp += str.charAt(str.length() - 1);


        String[] strArr = temp.split(",");
        temp = "";

        for (int i = 0; i < strArr.length; i++) {
            char[] ch = new char[strArr[i].length()];

            for (int j = 0; j < strArr[i].length(); j++) {
                ch[j] = strArr[i].charAt(j);
            }
            Arrays.sort(ch);
            for (int k = 0; k < ch.length; k++) {
                temp += ch[k];
            }
        }

        return temp;


    }

    public static void main(String[] args) {
        System.out.println(sort("DC501GCCCA098911"));
    }
}
