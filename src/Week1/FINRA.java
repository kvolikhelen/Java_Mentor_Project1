package Week1;

public class FINRA {public static void main(String[] args) {
    System.out.println(phrase(10));


}


    public static String phrase(int number) {

        String phrase = "";

        while(number >= 1 && number <= 30){
            System.out.println(number);
            number++;

            if(number % 3 == 0){
                phrase = "FIN";
            } else if (number % 5 == 0) {
                phrase = "RA";
            } else if (number % 3 == 0 && number % 5 == 0) {
                phrase = "FINRA";
            }


        }
        return phrase;

    }}

