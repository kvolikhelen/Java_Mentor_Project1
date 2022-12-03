package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAscending {
    /*ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
  4,6,-8,9,5,h,H,Apple,apple
*/

    public static List<Integer> sortAscending(List<Integer> lists){
        List<Integer> temps = lists;
        for (int i = 0; i < temps.size(); i++) {
            for (int j = temps.size() - 1; j > i; j--) {
                if (temps.get(i) > temps.get(j)) {
                    int tmp = temps.get(i);
                    temps.set(i,temps.get(j)) ;
                    temps.set(j,tmp);
                }
            }
        }
        return temps;
    }

    public static void main(String[] args) {
        System.out.println(sortAscending(Arrays.asList(2, 4, 1, 3, 5, 8, -3)));
    }


}
