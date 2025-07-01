package com.leetcode.Kunal.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-5,0, 1,4,7,12};
        System.out.println(binarySearch(arr, 7));

    }

    //return index
    //-1 if !exist
    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //the sam as start + end / 2 but prevent int exeed in big digits
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
