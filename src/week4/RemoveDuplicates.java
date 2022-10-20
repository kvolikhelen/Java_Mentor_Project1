package week4;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
    Write a return method that can remove the duplicated values from String
    EX: removeDup("AAABBBCCC") ===> ABC
     */

    public static String removeDup(String str){

        String newStr = "";

       for(int i = 0; i<str.length(); i++){
           if(!newStr.contains(String.valueOf(str.charAt(i)))){
               newStr+=String.valueOf(str.charAt(i));
           }
       }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup("zwxyywpzw"));
    }




}
