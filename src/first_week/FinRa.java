package first_week;

public class FinRa {
    public static void main(String[] args) {



    finRa();

}

    public static void finRa(){
        int num = 1;
        while (num <=30){
            if(num%3==0 && num%5==0){
                System.out.println(num + ":<FINRA>");
            }else if(num%3==0){
                System.out.println(num + ": <FIN>");
            }else if(num%5==0){
                System.out.println(num + ": <RA>");

            }
            num++;
        }
    }
}
