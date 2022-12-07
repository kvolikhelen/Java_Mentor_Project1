package Week6;

public class PasswordValidation {
  /*  Write a return method that can verify if a password is valid or not with theserequirements:
            1. Password MUST be at least have 6 characters and should not contain space
            2. PassWord should at least contain one upper case letter
            3. PassWord should at least contain one lowercase letter
            4. Password should at least contain one special characters
            5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

   */



    public static boolean validPasswordCheck(String password){



        if(password.length() >= 6 && !password.contains(" ")) {

            int upperCase = 0;
            int lowerCase = 0;
            int specialChar = 0;
            int digits = 0;

            for(int i = 0; i < password.length(); i++){

                char eachChar = password.charAt(i);

                if(Character.isUpperCase(eachChar)){
                    upperCase++;
                } else if (Character.isLowerCase(eachChar)) {
                    lowerCase++;

                } else if (Character.isDigit(eachChar)) {
                    digits++;

                } else  {
                    specialChar++;

                }


            }


            return upperCase > 0 && lowerCase > 0 && digits > 0 && specialChar > 0;


        }

       return false;



    }

    public static void main(String[] args) {
        System.out.println(validPasswordCheck("Shivjer0901!"));

        System.out.println(validPasswordCheck("hellojava"));
    }


}
