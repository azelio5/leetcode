package com.leetcode.Kunal.binaryQuestions;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));

    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if not found pivot - array not rotated
        if (pivot == -1) {
            //just BS
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if pivot is found - found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target <= nums[pivot]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

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

    //not for duplicate v
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases
            if (mid < end && nums[mid] > nums[mid + 1]) {  //mid < end in case of AIOUBE
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases
            if (mid < end && nums[mid] > nums[mid + 1]) {  //mid < end in case of AIOUBE
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            //if elements in start and end equal - skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                //skip duplicates
                //note need to check if these el no pivot
                //check start
                if (nums[start] > nums[start + 1]) {
                    return start;// start is pivot
                }
                start++;
                //check end
                if (nums[end] < nums[end - 1]) {
                    return end; //end is pivot
                }
                end--;
            }
            //left side sorted , so pivot should be in right
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

