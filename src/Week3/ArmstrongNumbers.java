package Week3;
/*
2. Numbers -- Armstrong numbers
Write a method that can check if a number is
Armstrong number
 */
public class ArmstrongNumbers {
    public static boolean isArmstrongNum(int num){
        String[] nums = String.valueOf(num).split("");
        int digit = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.pow(Integer.parseInt(nums[i]),digit);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNum(54748));
        System.out.println(isArmstrongNum(153));
        System.out.println(isArmstrongNum(20));
    }
}
