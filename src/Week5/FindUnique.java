package Week5;

public class FindUnique {

    /*
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

    public static String uniqueChar(String word){
        String returnWord = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                returnWord += "" + word.charAt(i);
            }
        }
        return returnWord;
    }


    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }
}
