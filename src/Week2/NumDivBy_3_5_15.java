package Week2;

/*
Write a program that can print the numbers between 1-100 that can be divisible by 3,5 and 15.
if the number can be divisible by 3,5 and 15 then it should only be displayed in DivisibleBy15 section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5 section
 */
public class NumDivBy_3_5_15 {

    public static void main(String[] args) {
        print();
    }


    public static void print(){
        String divisibleBy15 = "Divisible By 15";
        String divisibleBy5 = "Divisible By 5";
        String divisibleBy3 = "Divisible By 3";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                divisibleBy15 += " " + i;
            }else if (i % 3 == 0){
                divisibleBy3 += " " + i;
            }else if (i % 5 == 0){
                divisibleBy5 += " " + i;
            }
        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}
