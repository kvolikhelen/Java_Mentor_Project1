package Week11;

import java.util.Map;
import java.util.TreeMap;

/*
Map -- Frequency of Characters
Write a method that prints the frequency of each character from a String
 */

public class Map_FrequencyOfCharacters {

    public static Map<String, Integer> frequency(String str){
        Map<String, Integer> map = new TreeMap<>();
        String each = "";
        for (int i = 0; i < str.length(); i++) {
            each = "" + str.charAt(i);
            if (!map.containsKey(each)){
                map.put(each,1);
            }else {
                map.put(each,map.get(each)+1);
            }
        }
        return map;

    }

    public static void main(String[] args) {
        String str = "hhhEEEddddSSS";
        System.out.println(frequency(str));
    }
}
