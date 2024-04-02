package com.anvar.leetcode.Middle;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        //base case
        int n = nums.length;
        if (n < 3) return n;

        //pointers and counters
        int L = 0, R = 1, counter = 0;

        //remove dyp
        while (R < n) {
            if (nums[L] != nums[R]) {
                L++;
                nums[L] = nums[R];
                counter = 0;
            } else if (nums[L] == nums[R] && counter < 1) {
                counter = 1;
                nums[++L] = nums[R];
            }
            R++;
        }
        //return length
        return L + 1;
    }
}
