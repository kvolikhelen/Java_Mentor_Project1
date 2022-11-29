package Mladen_S.week9;

import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveString {



    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
    public static List<String> remove(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }
}