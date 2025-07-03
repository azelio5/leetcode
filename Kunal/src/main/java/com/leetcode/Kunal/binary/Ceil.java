package com.leetcode.Kunal.binary;

public class Ceil {
    public static void main(String[] args) {
        int[] arr = {19, 23, 56, 61, 72, 88, 92};
        System.out.println(ceil(arr, 63));
        System.out.println(floor(arr, 63));

    }

    static int ceil(int[] arr, int target) {
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
        if (target > arr[end]) {
            return -1;
        }
        return arr[start];

    }

    static int floor(int[] arr, int target) {
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
        return arr[end];

    }
}
