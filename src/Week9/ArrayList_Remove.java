package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_Remove {
    /*
ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */

    public static void removeFromArrayListByName(ArrayList<String> list, String name){
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next().equals(name)){
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(list);
        removeFromArrayListByName(list, "Ahmed");
        System.out.println(list);

    }



}
