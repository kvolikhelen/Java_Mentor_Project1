package week2;

public class NumberDivisibleBy3_5_15 {
    /**/

    public static void divisibleNumber(){
        String by15 = "";
        String by5 ="";
        String by3 ="";
        for (int i=1; i<= 100; i++){
            if (i%3==0 && i%5==0 && i%15==0  ){
                by15 += i + " ";
            }
            if (i%5==0 && !(i%15==0)) {
                by5 += i + " ";
            }
            if (i%3==0  && !(i%15==0)) {
                by3 += i + " ";
            }
        }
        System.out.println("Divisible by 15 "+by15);
        System.out.println("Divisible by 5 "+by5);
        System.out.println("Divisible by 3 "+by3);

    }

    public static void main(String[] args) {
        divisibleNumber();
    }

}
