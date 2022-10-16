package week4;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    /*String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

public static Map<Character,Integer> frequencyOfChars(String word){
    Map<Character,Integer> map = new LinkedHashMap<>();
   for (int i =0; i<word.length(); i++){
       if (map.containsKey(word.charAt(i))){
           map.put(word.charAt(i),map.get(word.charAt(i))+1);
       } else {
           map.put(word.charAt(i),1);
       }
   }
   return map;
}

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }

}
