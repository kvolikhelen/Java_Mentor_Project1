package Mladen_S.week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDups {


    /*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
     */

        public static void main(String[] args) {
            System.out.println("removeDups(\"AAABBBCCC\") ==> " + removeDups("AAABBBCCC"));
        }

        public static String removeDups(String word){

            Set<String> zeroDups = new HashSet<>(Arrays.asList(word.split("")));
            String result ="";
            for(String each : zeroDups){
                result+=each;
            }
            return result;
        }
    }

