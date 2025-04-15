package com.anvar.leetcode.Middle;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int[] arr = {-1,-100,3,99};

        System.out.println(Arrays.toString(arr));
        rotate(arr, -3);
        System.out.println(Arrays.toString(arr));


    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // then k is positive
        if (k < 0) {
            k = k + nums.length; // then k is negative
        }
//        System.out.println(k);
        reverse(nums, 0, k - 1);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

