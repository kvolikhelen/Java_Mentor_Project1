package Week11;

import java.util.HashMap;
import java.util.Map;

public class Map_MinValue {
    /*
    Map -- Min value
Write a method that can return the minimum value from a map (DO NOT use sort method)
     */

    public static int minValueOfMap(Map<?,Integer> map){
        int min = map.entrySet().iterator().next().getValue();
        for (Map.Entry<?, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min){
                min = entry.getValue();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "apple", 115,
                "banana", 33,
                "orange", 256,
                "lemon", 6,
                "watermelon", 2121,
                "berry", 13
        );

        System.out.println("minValueOfMap(map) = " + minValueOfMap(map));
    }
}
