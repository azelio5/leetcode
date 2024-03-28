package com.anvar.leetcode.Easy;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public void main(String[] args) {
//        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(Arrays.toString(arr));
//
//        removeDuplicates(arr);
//
//        System.out.println(Arrays.toString(arr));


    }

//    public static int removeDuplicates(int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//        int p = 0;
//        int insertIndex = 1;
//        while(insertIndex < nums.length){
//            if(nums[p] != nums[insertIndex]){
//                nums[p + 1] = nums[insertIndex];
//                p++;
//            }
//            insertIndex++;
//        }
//        return p + 1;
//    }

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
