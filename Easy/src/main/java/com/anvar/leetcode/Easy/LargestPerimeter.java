package com.anvar.leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;

// a + b > c
// a + c > b
// b + c > a

public class LargestPerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = n - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return 0;
    }
}
