package com.anvar.leetcode.Easy;

import java.util.Arrays;

public class MergeSortedArray {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        System.out.println(Arrays.toString(nums1));
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));



    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[cnt];
            cnt++;
        }

        Arrays.sort(nums1);
    }
}
