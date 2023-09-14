package org.example;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {

        int[] test = new int[6];
        test[0] = 7;
        test[1] = 1;
        test[2] = 5;
        test[3] = 3;
        test[4] = 6;
        test[5] = 4;
        System.out.println(maxProfit(test));

        int[] test2 = new int[3];
        test2[0] = 2;
        test2[1] = 4;
        test2[2] = 1;
        System.out.println(maxProfit(test2));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int difference = prices[i + 1] - prices[i];
            if(difference > 0) {
                profit += difference;
            }
        }
        return profit;
    }
}
