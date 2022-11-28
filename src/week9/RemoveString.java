package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveString {
    /*ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed*/


    public static List<String> removeAhmed(List<String> names){
        List<String > result = new ArrayList<>();
        for (String name : names){
            if (name.equals("Ahmed")) continue;
            result.add( name );
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayList<>(removeAhmed(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"))));
    }

}
