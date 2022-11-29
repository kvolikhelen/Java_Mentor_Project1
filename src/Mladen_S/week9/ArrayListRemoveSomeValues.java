package Mladen_S.week9;

import java.util.List;

public class ArrayListRemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public List<Integer> remove(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;
    }


}
