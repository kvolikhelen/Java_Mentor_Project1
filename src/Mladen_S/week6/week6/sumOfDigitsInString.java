package Mladen_S.week6.week6;

public class sumOfDigitsInString {
    /*
    3. String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {


        String s = "ja5va6is7the8best9lang10";   // Take a String

        char[] ch = s.toCharArray(); // Convert it into array of characters
        int n = 0;
        for(int i = 0; i < ch.length;i++){   // Apply for loop till length of char array
            if(Character.isDigit(ch[i])){ // Using isDigit() method we can check the digits in String
                                             //If isDigit() returns true then print that index value
                System.out.println("Individual Digits in the String: " + ch[i]);
                System.out.println("--------------------------------------");
                int m = Integer.parseInt(String.valueOf(ch[i])); //That digit is in char form. We will convert it into String then Integer
                n+=m; // Using n variable, we will sum it
            }
        }
        System.out.print("       SumOfDigits ==> " + n);
    }

}
