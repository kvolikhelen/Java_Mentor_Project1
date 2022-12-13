package week11;

import java.util.*;

public class UniqueCharacter {
    /*Map -- Unique character from String
Find Unique Characters of a string and put them in a map with the number of occurrences as 1
For example:
“aabccddeffft”
{b=1,e=1,t=1}*/
    public static Map<Character,Integer> uniqueCharacter(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray())
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        map.values().removeIf( value -> value>1 );
        return map;
    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacter("aabccddeffft"));

    }
}
