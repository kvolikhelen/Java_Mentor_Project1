package week10;

import java.util.Arrays;
import java.util.List;

public class SortingDescending {
    /*ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method*/

    public static List<Integer> sortDescending(List<Integer> lists){
        List<Integer> temp = lists;
        for (int i = 0; i < temp.size(); i++) {
            for (int j = temp.size() - 1; j > i; j--) {
                if (temp.get(i) < temp.get(j)) {
                    int tmp = temp.get(i);
                    temp.set(i,temp.get(j)) ;
                    temp.set(j,tmp);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(sortDescending(Arrays.asList(2, 4, 1, 3, 5, 8, -3)));
    }


}
