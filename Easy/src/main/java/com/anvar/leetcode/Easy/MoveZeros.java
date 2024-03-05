package com.anvar.leetcode.Easy;


import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
public class MoveZeros {
    public static void main(String[] args) {
        int nums[] ={0,1,0,3,12};

        System.out.println(Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] array) {

        int lastNonZeroIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[lastNonZeroIndex++] = array[i];
            }
        }

        for (int i = lastNonZeroIndex; i < array.length; i++) {
            array[i] = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
