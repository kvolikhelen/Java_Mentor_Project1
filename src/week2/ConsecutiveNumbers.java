package week2;

public class ConsecutiveNumbers {
    /*
    Write a function that, given integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3,5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
     */

  static void consecutiveN(int n){
      String numbers = "";

      for (int i = 1; i <=n; i++){
         if(i%2 == 0 && i%3 == 0 && i%5 == 0){
             numbers+= "CodilityTestCoders\n";
          } else if (i%2 == 0 && i%3 == 0) {
             numbers+= "CodilityTest\n";
         } else if (i%2 == 0 && i%5 ==0) {
             numbers+= "CodilityCoders\n";
         } else if (i%3==0 && i%5 ==0) {
             numbers+= "TestCoders\n";
         }else if (i%2 == 0){
             numbers+="Codility\n";
         } else if (i%3 == 0) {
             numbers+="Test\n";
         } else if (i%5 == 0) {
             numbers+="Coders\n";
         }else {
             numbers+= i + "\n";
         }
      }
      System.out.println(numbers);
  }

    public static void main(String[] args) {
        consecutiveN(24);
    }
}
