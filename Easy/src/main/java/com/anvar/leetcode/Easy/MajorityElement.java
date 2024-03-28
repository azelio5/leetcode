package com.anvar.leetcode.Easy;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};

        System.out.println(majorityElement(arr));
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
