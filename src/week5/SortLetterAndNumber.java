package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLetterAndNumber {
    /*String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
Ex:
Input: "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/

    public static String sortLetterAndNumber(String str) {
        String result = "";
        String sort = "";
        int temp = 0;

        for (int i = 0; i < str.length(); i++) {
            sort = "";
            for (int j = temp; j < str.length(); j++) {
                if (Character.isAlphabetic(str.charAt(j))) {
                    sort += str.charAt(j);
                    temp++;
                } else if (Character.isDigit(str.charAt(j))) {
                    break;
                }
            }
            List<String> letter = new ArrayList<>(Arrays.asList(sort.split("")));
            Collections.sort(letter);
            for (int j = 0; j < sort.length(); j++) {
                result += letter.get(j);
            }
            sort = "";

            for (int j = temp; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    sort += str.charAt(j);
                    temp++;
                } else if (Character.isAlphabetic(str.charAt(j))) {
                    break;
                }
            }

            List<String> number = new ArrayList<>(Arrays.asList(sort.split("")));
            Collections.sort(number);
            for (int j = 0; j < sort.length(); j++) {
                result += number.get(j);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sortLetterAndNumber("DC501GCCCA098911"));
    }


}
