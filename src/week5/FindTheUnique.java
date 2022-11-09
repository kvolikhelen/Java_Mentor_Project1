package week5;

public class FindTheUnique {
    /*
    Write a return method that can find the unique characters from the String
    Ex: unique ("AAABBBCCCDEF") ===> "DEF"
     */

    public static String findUnique(String str) {
      String [] arr = str.split("");
      String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(arr[i].equals(arr[j])){
                    count++;

                }

            }

            if(count==1){
                newStr+= arr[i];
            }

        }
        return newStr;


    }

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
    }

}
