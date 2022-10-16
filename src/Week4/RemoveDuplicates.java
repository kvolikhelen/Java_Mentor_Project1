package Week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class RemoveDuplicates {

    // removeDup method by using Collection framework
    public static String removeDup(String str){
        LinkedHashSet<String> remove = new LinkedHashSet<>(Arrays.asList(str.split("")));
        String strReturn = "";
        for (String each : remove) {
            strReturn += each;
        }
        return strReturn;
    }

    // removeDup1 method by using loop and String methods
    public static String removeDup1(String str){
        String strReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (!strReturn.contains("" + str.charAt(i))){
                strReturn += str.charAt(i);
            }
        }
        return strReturn;

    }


    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

        System.out.println(removeDup1("AAABBBCCC"));

    }
}
