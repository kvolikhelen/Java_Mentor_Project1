package Week4;

public class SameLetters { public static void main(String[] args) {

    System.out.println(sameLetters("silent", "listen"));



}



    /*
    Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */

    public static boolean sameLetters(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }


        for (int i = 0; i < word1.length(); i++) {

            for(int j = 0; j < word2.length(); j++){

                if(word1.charAt(i) != word2.charAt(j)){
                    return false;
                }

            }
        }
        return true;
    }
}


