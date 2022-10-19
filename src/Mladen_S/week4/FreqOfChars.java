package Mladen_S.week4;

public class FreqOfChars {

        public static void main(String[] args) {
            System.out.println("frequencyOfChars(\"AAABBCDD\") = " + frequencyOfChars("AAABBCDD"));
        }

        /*
        String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

        public static String frequencyOfChars(String str) {
            String solution = "";
            for (int i = 0; i < str.length(); i++) {
                if (!solution.contains("" + str.charAt(i))) {
                    solution += "" + str.charAt(i);
                }
            }
            String result = "";
            for (int j = 0; j < solution.length(); j++) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == solution.charAt(j)) {
                        count++;
                    }
                }
                result += solution.charAt(j) + "" + count;

            }
            return result;
        }
}
