package com.anvar.leetcode.Easy;


//There is a function signFunc(x) that returns:
//
//        1 if x is positive.
//        -1 if x is negative.
//        0 if x is equal to 0.
//        You are given an integer array nums. Let product be the product of all values in the array nums.
//
//        Return signFunc(product).

public class SignoftheProductofanArray {
    public static void main(String[] args) {
        int[] nums = {41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};

        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int productSign = 1;
        for (int v : nums) {
            if (v == 0) return 0;
            if (v < 0) productSign *= -1;
        }
        return productSign;
    }
}
