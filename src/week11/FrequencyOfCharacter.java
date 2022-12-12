package week11;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    /*Map -- Frequency of Characters
Write a method that prints the frequency of each character from a String
*/
    public static void frequencyOfCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        frequencyOfCharacter("husnaaa");
    }


}
