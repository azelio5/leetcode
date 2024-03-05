package com.anvar.leetcode.Easy;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}, {3, 3, 0}};

        System.out.println(maximumWealth(arr));
    }

//    public static int maximumWealth(int[][] accounts) {
//        int sumArr1 = 0;
//        int sumArr2;
//
//        for (int i = 0; i < accounts.length; i++) {
//            for (int j = 0; j < accounts[i].length; j++) {
//         //       System.out.println(accounts[i][j]);
//
//                sumArr1+=accounts[i][j];
////                System.out.println(sumArr1);
//            }
//        }
//       // System.out.println(sumArr1);
//        return sumArr1;
//    }

    public static int maximumWealth(int[][] accounts) {
        // Initialize the variable that will hold the maximum wealth found
        int maxWealth = 0;

        // Loop through each customer's account
        for (int[] customerAccounts : accounts) {
            // Sum the wealth of the current customer
            int customerWealth = 0;
            for (int accountBalance : customerAccounts) {
                customerWealth += accountBalance;
            }

            // Update maxWealth if the current customer's wealth is greater
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        // Return the maximum wealth across all customers
        return maxWealth;
    }
}


