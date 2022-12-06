package Week10;
/*
Map -- Sort the map by values
Write a method that can sort the Map by values
 */

import java.util.*;

public class Map_SortTheMapByValues {

    public static Map<String, Integer> sortByValue(Map<String,Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello",1);
        map.put("Java",5);
        map.put("Love",4);
        map.put("World",2);
        map.put("I",3);

        System.out.println(sortByValue(map));

    }
}
