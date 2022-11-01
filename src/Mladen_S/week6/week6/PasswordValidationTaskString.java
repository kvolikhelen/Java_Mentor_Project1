package Mladen_S.week6.week6;

public class PasswordValidationTaskString {
    /*
    1. String -- Password Validation Task
Write a return method that can verify if a password is valid or not with these requirements:
1. Password MUST be at least have 6 characters and should not contain space 2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */




    public static boolean passwordValidationTaskString(String password) {

        boolean hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                hasDigits = password.matches("(.*[0-9].*)"),
                hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

        if(password.length() >= 6 && !password.contains(" ")) {
            if (hasLowerCaseChar && hasUpperCaseChar && hasDigits && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(passwordValidationTaskString("kravajcE2/"));
        System.out.println(passwordValidationTaskString("kravajce"));
        System.out.println(passwordValidationTaskString("KRAVAJCE2/"));
        System.out.println(passwordValidationTaskString("kravajce2/"));
        System.out.println(passwordValidationTaskString("kravajcE2"));
    }

}
