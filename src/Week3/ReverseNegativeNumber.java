package Week3;

/*
3. Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */
public class ReverseNegativeNumber {
    // String methods, Arrays
    static int reverse(int num) {
        String str = "";

        if (num > 0) {
            for (int i = String.valueOf(num).length() - 1; i >= 0; i--) {
                str += String.valueOf(num).charAt(i);
            }
            return Integer.parseInt(str);
        } else if (num < 0) {
            for (int i = String.valueOf(num).length() - 1; i > 0; i--) {
                str += String.valueOf(num).charAt(i);
            }
            return Integer.parseInt(str) * -1;
        }

        return 0;
    }
    // while loop
    public static int reverse1(int num){
        int temp = 0;
        int reversed = 0;

        while(num < 0){
            temp = num % 10;
            num = num / 10;
            reversed = reversed * 10 + temp;
        }

        return reversed;
    }


    public static void main(String[] args) {
        System.out.println(reverse(-225));
        System.out.println(reverse(-25));
        System.out.println(reverse(613));
        System.out.println(reverse(0));
        System.out.println(reverse(1));


        System.out.println(reverse1(25));
        System.out.println(reverse1(-125));
    }
}
