package Week6;

public class String_PasswordValidation {
    /*
1. String -- Password Validation Task
Write a return method that can verify if a password is valid or not with these
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise return false.
     */

    public static boolean passwordIsValid(String password) {
        if (password.length() >= 6 && !password.contains(" ")) {
            int upperCase = 0, lowerCase = 0, special = 0, digit = 0;

            for (int i = 0; i < password.length(); i++) {
                char each = password.charAt(i);
                if (Character.isUpperCase(each)) {
                    upperCase++;
                } else if (Character.isLowerCase(each)) {
                    lowerCase++;
                } else if (Character.isDigit(each)) {
                    digit++;
                } else {
                    special++;
                }
            }
            return upperCase > 0 && lowerCase > 0 && special > 0 && digit > 0;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordIsValid("123456789abcABC!@#")); // true
        System.out.println(passwordIsValid("123456789abcABC"));    // false
        System.out.println(passwordIsValid("123456789abc!@#"));    // false
        System.out.println(passwordIsValid("1234567   AAA"));      // false
        System.out.println(passwordIsValid("Ab1!"));               // false
    }
}
