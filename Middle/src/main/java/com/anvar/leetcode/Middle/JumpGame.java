package com.anvar.leetcode.Middle;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 5, 2, 1, 0, 0, 1, 3};

        System.out.println(arr[9]);
        canJump(arr);

    }

    public static boolean canJump(int[] nums) {
        //final position is the last index

        int finalPosition = nums.length - 1;

        //start with second last index

        for (int idx = nums.length - 2; idx >= 0; idx--) {
            //if you can reach the final with this index - updater flag
            if (idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }
        //if we reach the first index thne jaum is possible
        return finalPosition == 0;
    }
}
