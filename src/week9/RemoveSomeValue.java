package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValue {
    /*ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.*/

    public static List<Integer> removeSomeValue (List<Integer> lists){
        List<Integer> result = new ArrayList<>();
        for (Integer list : lists) {
            if (list > 100) continue;
            result.add(list);
        }
        return result;
    }

    public static List<Integer> remove(List<Integer> list){
      list.removeIf( p -> p > 100 );
      return list;
    }

    public static void main(String[] args) {
        System.out.println(removeSomeValue(new ArrayList<>(Arrays.asList(1, 200, 130, 45, 6, 700))));
        System.out.println(remove(new ArrayList<>(Arrays.asList(1, 200, 130, 45, 6, 700))));
    }

}
