package week1;

public class FINRA {

    public static void main(String[] args) {

        for (int i = 0; i <=30 ; i++) {
            if(i%3 == 0 && i%5 ==0){
                System.out.println(i + " week1.FINRA");
            } else if (i%3 ==0) {
                System.out.println(i + " FIN");
            }else if (i%5 ==0){
                System.out.println(i + " RA");
            }

        }
    }

    }


