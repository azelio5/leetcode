package com.leetcode.Kunal.binaryQuestions;

public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j); // in the end of loop this wil contain the max item from array
            end += j;
        }

        //BS
        while (start < end) {
            //try mid for potential answer
            int mid = start + (end - start) / 2;
            //calculate how many peaces you can divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //you cannot add this in subarray, make new one
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid+1;
            }else {
                end = mid;
            }

        }
        return end; // here start == end

    }
}
