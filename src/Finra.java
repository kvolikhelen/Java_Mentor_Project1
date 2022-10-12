public class Finra {
    public static void main(String[] args) {
       /*
       FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number. */

    int[] numbers = new int[30];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = i+1;
        }

        System.out.println((finra(numbers)));
    }

    public static String finra (int []nums){
        String message = "";
        for(int i = 1; i<=nums.length; i++){
            if((i%3==0)&&(i%5==0)){
                message = message  + "FINRA";
                continue;
            }else if (i % 5==0){
                message = message  + "RA";
                continue;

            } else if (i  %3==0) {
                message = message  + "FIN";
                continue;
            }

            message = message +  ","+ i +"," +  " ";

            }
return message;

        }

}
