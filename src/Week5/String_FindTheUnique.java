package Week5;
/*
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
public class String_FindTheUnique {
    public static String uniqueChars(String str){
        String strReturn = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)){
                        count++;
                    }
            }
            if (count == 1){
                strReturn += "" + str.charAt(i);
            }
        }
        return strReturn;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }
}
