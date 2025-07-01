package com.leetcode.Kunal.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        //find sorted asc or dsc

        boolean isAsc;
        isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2; //the sam as start + end / 2 but prevent int exceeded in big digits
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            }

        }
        return -1;

    }
}
