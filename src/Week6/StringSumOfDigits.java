package Week6;

public class StringSumOfDigits {
    /*
3. String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */


    public static int sumOfDigits(String strDigits){

        int sum = 0;

        for(int i = 0; i < strDigits.length(); i++){

            char eachLetter = strDigits.charAt(i);
            if(Character.isDigit(eachLetter)){

                sum += Integer.parseInt("" + eachLetter);

            }


        }

        return sum;

    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits("Hi7MyName9isShivani27"));
                                                // 7 + 9 + 2 + 7 = 25

    }






}
