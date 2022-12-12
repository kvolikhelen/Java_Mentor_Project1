package Week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_UniqueCharacterFromString {
/*
 Map -- Unique character from String
Find Unique Characters of a string and put them in a map with the number of occurrences as 1
For example:
“aabccddeffft”
{b=1,e=1,t=1}
 */
    public static Map<Character, Integer> uniqueChars(String str){
        String removeDup = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1 && !removeDup.contains("" + str.charAt(i))){
                removeDup += "" + str.charAt(i);
            }
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < removeDup.length(); i++) {
            map.put(removeDup.charAt(i),1);
        }
        return map;
    }


    public static void main(String[] args) {
        System.out.println("uniqueChars(\"aabccddeffft\") = " + uniqueChars("aabccddeffft"));
    }
}
