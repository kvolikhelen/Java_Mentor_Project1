import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    public static String smallestString(String s) {
        int l = s.length();
        String result = "";
        for (int i = 0; i < l-1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                for (int j = 0; j < l; j++) {
                    if (i != j) {
                        result += s.charAt(j);
                    }
                }
                return result;
            }
        }
        result = s.substring(0, l - 1);
        return result;
    }


}
