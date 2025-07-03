package com.leetcode.Kunal.binaryQuestions;

public class MountainBitonicArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                //in decrease p of array
                //may be ans , but look left
                //this why end !=mid-1
                end = mid;
            }else {
                //in increase p of array
                start = mid + 1; // coz mid+1 > mid
            }
            // finally start == end, points to largest number after up 2 checks

        }
        return start; // or end , they both are equal

    }
}
