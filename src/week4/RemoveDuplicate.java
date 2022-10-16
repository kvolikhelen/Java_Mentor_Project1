package week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    /*String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC*/
public static String removeDuplicate(String word){

    Set<String> noDup = new HashSet<>(Arrays.asList(word.split("")));
    String result = "";
    for (String each : noDup){
        result += each ;
    }
    return result;
}


    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
    }

}
