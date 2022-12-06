package Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/*
 ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */

public class ArrayList_SortingInAscending {

    public static ArrayList<Integer> sortArrayListAsc(ArrayList<Integer> arrList){
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i; j < arrList.size(); j++) {
                if (arrList.get(i) > arrList.get(j)){
                    int temp = arrList.get(i);
                    arrList.set(i, arrList.get(j));
                    arrList.set(j,temp);
                }
            }
        }
        return arrList;
    }

    public static void main(String[] args) {
        System.out.println(sortArrayListAsc(new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0))));
        System.out.println(sortArrayListAsc(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))));
    }

}
