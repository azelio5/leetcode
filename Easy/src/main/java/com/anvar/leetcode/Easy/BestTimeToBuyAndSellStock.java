package com.anvar.leetcode.Easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else if (prices[i] - min > max) max = prices[i] - min;
        }
        return max;
    }
}
