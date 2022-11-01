package Week6;

public class String_SumOfDigitsInString {
    /*
3. String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigitsInString(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsInString("Hello5World10I8Love9Java3")); // 5 + 1 + 0 + 8 + 9 + 3 = 26
        System.out.println(sumOfDigitsInString("I5Can5Solve5Java5Tasks5")); // 5 + 5 + 5 + 5 + 5 = 25
    }
}
