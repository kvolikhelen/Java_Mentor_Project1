public class Div_3_5_15_Numbers {

    public static void main(String[] args) {
        System.out.println("Numbers that are divisible by :3 ,5,15");
        for (int i = 1; i <= 100; i++) {



            if((i%3==0) && (i%5==0) &&  (i%15==0) ){

                System.out.println(i + "   Divisible by 3,5,15");
            }



        }

        for (int i = 1; i <= 100; i++) {



            if(i%3==0 && i % 15!=0){

                System.out.println(i + "  Divisible by 3 but not divisible   by 15");
            }



        }

        for (int i = 1; i <= 100; i++) {



            if(i%5==0&& i%15!=0 ){

                System.out.println(i + "  Divisible by 5 but not divisible by 15");
            }



        }





    }



}
