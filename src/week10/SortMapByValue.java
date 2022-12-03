package week10;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    /*Map -- Sort the map by values
Write a method that can sort the Map by values
*/

    public static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>( map.entrySet() );
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;

    }

    public static void main(String[] args) {
    Map<String ,Integer> nums = new LinkedHashMap<>( Map.of("two",2,"one",1,"five",5,"three",3,"minus one",-1));

       System.out.println(sortMapByValue(nums));



    }



}
