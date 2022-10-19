package Week4;

public class FrequencyOfChar {public static void main(String[] args) {

    System.out.println(frequencyOfLetters("aabbbccee", 'c'));


}


    public static int frequencyOfLetters( String str, char letter) {
        int count = 0;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}



