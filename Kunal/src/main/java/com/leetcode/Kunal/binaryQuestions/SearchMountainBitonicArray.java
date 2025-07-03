package com.leetcode.Kunal.binaryQuestions;

public class SearchMountainBitonicArray {
    public static void main(String[] args) {

    }

    int search(int[] nums, int target) {
        int peak = peakIndexInMountainArray(nums);
        int findFirst = binarySearch(nums, target, 0, peak);
        if (findFirst != -1) {
            return findFirst;
        }else {
        return orderAgnosticBS(nums, target, peak + 1, nums.length - 1);
        }
    }

    public static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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

    static int binarySearch(int[] arr, int target, int start, int end) {
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

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //in decrease p of array
                //may be ans , but look left
                //this why end !=mid-1
                end = mid;
            } else {
                //in increase p of array
                start = mid + 1; // coz mid+1 > mid
            }
            // finally start == end, points to largest number after up 2 checks

        }
        return start; // or end , they both are equal

    }
}
