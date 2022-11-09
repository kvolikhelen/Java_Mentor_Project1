package week6;

public class PasswordValidation {
    /*
    Write a return method that can verify if a password is valid or not with these requirements:
    1. Password MUST be at least 6 characters and should not contain space
    2. Password should at least contain one upper case letter
    3. Password should at least contain one lowercase letter
    4. Password should contain at least one special characters
    5. Password should contain a digit
     */

    public static boolean validatePassword(String password) {

        int upper = 0, lower = 0, special = 0, num = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)) {
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;
            } else if (Character.isDigit(each)) {
                num++;
            } else {
                special++;
            }
        }
        if (!password.contains(" ") && password.length() >= 6 && upper > 0 && lower > 0 && num > 0 && special > 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(validatePassword("Helloworld98099%%"));
        System.out.println(validatePassword("Javajava89**/ java java"));
    }

}
