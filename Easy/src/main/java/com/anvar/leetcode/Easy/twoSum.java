package com.anvar.leetcode.Easy;

import java.util.HashMap;

public class twoSum {
//    public int[] twoSum(int[] nums, int target) {
//        int l = 0, r = nums.length -1;
//        while(l < r){
//            int sum = nums[l] + nums[r];
//            if(sum == target) return new int[]{nums[l],nums[r]};
//            if(sum < target)l++;
//            else r--;
//        }
//        return new int[0];
//    }

    int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[] {map.get(t), i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }
}

