package Week4;

public class RemoveDuplicates { public static void main(String[] args) {

    System.out.println(removeDuplicates("hello"));
}

    public static String removeDuplicates(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {

// if result does not contain the character, add it to the result --- therefore, a character will not be added twice
            if(!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }

}
