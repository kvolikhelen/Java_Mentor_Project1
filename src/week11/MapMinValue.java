package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMinValue {
    /*Map -- Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)*/
    public static int minOfMap(Map<Integer,String> map){
        Map.Entry<Integer , String> minEntry = null;

        for (Map.Entry<Integer , String > entry : map.entrySet()) {

            if (minEntry == null || minEntry.getKey() > entry.getKey() ){
                minEntry = entry;
            }
        }

     return minEntry.getKey();

    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(Map.of(4,"four",1,"one",2,"two",5,"five"));

        System.out.println(minOfMap(map));
    }
}
