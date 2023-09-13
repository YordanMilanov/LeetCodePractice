package org.example;

public class BestTimeToBuyAndSellStock {
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
        int globalProfit = 0;
        // minBuyPrice is set to Infinity because we can guarantee the first element will be set to the buy price
        int minBuyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (minBuyPrice > prices[i]) {
                minBuyPrice = prices[i];
            }

    int currentProfit = prices[i] - minBuyPrice;

            if (currentProfit > globalProfit) {
                globalProfit = currentProfit;
            }
        }

        return globalProfit;
    }
}
