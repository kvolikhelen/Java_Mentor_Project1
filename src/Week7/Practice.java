package Week7;
/**
 * We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i. We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day. Write a Java function to find the maximum profit.
 * Note that a stock can’t be sold before buying.
 * Example:
 * Input: [8,3,3,1,4,9,12,11]
 * Output: 11
 * Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
 * Not 8-1 = 7, as the selling price needs to be larger than buying price.
 */
public class Practice {

    public static int profit1(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arr[i1] - arr[i] > maxProfit && i<i1){
                    maxProfit = arr[i1] - arr[i];
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(profit1(new int[]{799, 800, 3, 92, 4, 3, 500, 1}));
        System.out.println(profit1(new int[]{799, 800, 3, 92, 4, 3, 800, 1}));
        System.out.println(profit1(new int[]{8,3,3,1,4,9,12,11}));
        System.out.println(profit1(new int[]{20, 200, 3, 92, 4, 81, 1, 700}));
    }
}