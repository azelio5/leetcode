package com.anvar.leetcode.Easy;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};

        System.out.println(majorityElement(arr));

    }

    public static int badMajorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else count--;
        }
        return candidate;
    }
}
