package Week5;

import java.util.Arrays;

public class SortLettersAndNumbers {
    /*
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
Ex:
Input: "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"

 */


    public static String sortLettersNumbers(String input){

        String output = "";



        for (int i = 0; i < input.length() - 1; i++) {
            output += "" + input.charAt(i);
            if (Character.isAlphabetic(input.charAt(i)) && Character.isDigit(input.charAt(i + 1))) {
                output += ",";
            }
            if (Character.isDigit(input.charAt(i)) && Character.isAlphabetic(input.charAt(i + 1))) {
                output += ",";
            }
        }
        output += input.charAt(input.length() - 1);


        String[] strArr = output.split(",");
        output = "";

        for (int i = 0; i < strArr.length; i++) {
            char[] ch = new char[strArr[i].length()];

            for (int j = 0; j < strArr[i].length(); j++) {
                ch[j] = strArr[i].charAt(j);
            }
            Arrays.sort(ch);
            for (int k = 0; k < ch.length; k++) {
                output += ch[k];
            }
        }

        return output;


    }

    public static void main(String[] args) {

        System.out.println(sortLettersNumbers("DC501GCCCA098911"));
    }





}




