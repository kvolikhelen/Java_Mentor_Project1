package Week4;

import java.util.*;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    // frequency method by using nested loop and checking each char and counting.
    public static String frequency(String str){
        String strReturn = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (!strReturn.contains("" + str.charAt(i))){
                strReturn += "" + str.charAt(i) + count;
            }
        }
        return strReturn;
    }

    // frequency method by using Collections methods and Collection framework
    public static String frequency1(String str){
        String strReturn = "";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        LinkedHashSet<String> chars = new LinkedHashSet<>(list);
        for (String each : chars) {
            strReturn += each + Collections.frequency(list, each);
        }
        return strReturn;
    }

    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));
        System.out.println(frequency1("AAABBCDD"));
    }

}
