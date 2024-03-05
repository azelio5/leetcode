package com.anvar.leetcode.Easy;


//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits ={1,2,9};

        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        System.out.println(len-1);
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                System.out.println(Arrays.toString(digits));
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] arr = new int[len + 1];
        arr[0] = 1;

        return arr;
    }
}
