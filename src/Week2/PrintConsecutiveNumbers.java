package Week2;
/*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all
    three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
        For example, here is the output for N = 24:
                                    1
                                    Codility
                                    Test
                                    Codility
                                    Coders
                                    CodilityTest
                                    7
                                    Codility
                                    Test
                                    Codi1ityCoders
                                    11
                                    CodilityTest
                                    13
                                    Codility
                                    TestCoders
                                    Codility
                                    17
                                    ....
     */
public class PrintConsecutiveNumbers {

    public static void consecutiveNums(int num) {
        for (int i = 0; i < num; i++) {
            String str = "" + i;
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                str = "CodilityTestCoders";
            } else if (i % 2 == 0 && i % 3 == 0) {
                str = "CodilityTest";
            } else if(i % 2 == 0 && i % 5 == 0) {
                str = "CodilityCoders";
            }else if (i % 2 == 0) {
                str = "Codility";
            } else if (i % 3 == 0) {
                str = "Test";
            }else if (i % 5 == 0){
                str = "Coders";
            }
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        consecutiveNums(41);
    }



}
