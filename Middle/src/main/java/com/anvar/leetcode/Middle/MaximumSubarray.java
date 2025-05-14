package com.anvar.leetcode.Middle;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            }else sum = nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
