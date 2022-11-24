package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_RemoveValue {
    /*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(101,44,35,244,313,25,1,562));
        System.out.println(list);
        list.removeIf(e -> e > 100);
        System.out.println(list);

        list = new ArrayList<>(Arrays.asList(101,44,35,244,313,25,1,562));
        System.out.println(list);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next() > 100){
                iter.remove();
            }
        }
        System.out.println(list);
    }

}
