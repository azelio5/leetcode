package com.anvar.leetcode.Middle;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) // raznica pozitivna
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }
}
