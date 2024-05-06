package com.anvar.leetcode.Middle;

public class JumpGame2 {
    public int jump(int[] nums) {
        int totalJumps = 0;

        int destination = nums.length - 1; //last index

        int coverage = 0, lastJumpIndex = 0;

        if (nums.length == 1) return 0;

        //Greedy stategy - extend coverahe as long ass possible

        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIndex) {
                lastJumpIndex = coverage;
                totalJumps++;

                //check if reached the destination
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}
