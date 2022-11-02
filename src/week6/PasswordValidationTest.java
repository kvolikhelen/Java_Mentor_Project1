package week6;

public class PasswordValidationTest {
    /*String -- Password Validation Task
Write a return method that can verify if a password is valid or not with these requirements:
1. Password MUST be at least have 6 characters and should not contain space
2.PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false*/

    public static boolean isValidPassword(String password) {
        int upper = 0, lower = 0, special = 0, digit = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) upper++;
            else if (Character.isLowerCase(password.charAt(i))) lower++;
            else if (Character.isDigit(password.charAt(i))) digit++;
            else { special++; }
            }
        if (password.length() >= 6 && !password.contains(" ")) {
            if (upper >= 1 && lower >= 1 && digit >= 1 && special >= 1) return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Husna%123"));
    }


}
