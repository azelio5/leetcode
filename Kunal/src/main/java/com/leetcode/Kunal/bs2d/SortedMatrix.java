package com.leetcode.Kunal.bs2d;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr2DSorted = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(searchMatrix(arr2DSorted, 6)));

    }

    //search in row provided between the con provided
    static int[] binarySearch(int[][] matrix, int stroka, int strokaStart, int strokaEnd, int target) {
        while (strokaStart <= strokaEnd) {
            int mid = strokaStart + (strokaEnd - strokaStart) / 2;
            if (matrix[stroka][mid] == target) {
                return new int[]{stroka, mid};
            }

            if (matrix[stroka][strokaStart] < target) {
                strokaStart = mid + 1;
            } else {
                strokaEnd = mid - 1;
            }

        }
        return new int[]{-1, -1};

    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int stroki = matrix.length;
        int stolbci = matrix[0].length;
        if (stroki == 1) {
            return binarySearch(matrix, 0, 0, stolbci - 1, target);
        }
        int strokaStart = 0;
        int strokaEnd = stroki - 1;
        int midStolbec = stroki / 2;

        // run loop till 2 rows are remaining
        while (strokaStart < (strokaEnd -1)) { //while true it will have more than 2 rows
            int mid = strokaStart + (strokaEnd - strokaStart) / 2;
            if (matrix[mid][midStolbec] == target) {
                return new int[]{mid, midStolbec};
            }
            if (matrix[mid][midStolbec] < target) {
                strokaStart = mid;
            }
            else {
                strokaEnd = mid;
            }
        }
        //no we have 2 rows
        //check whether the target is in column of 2 rows
        if ((matrix[strokaStart][midStolbec] == target)) {
            return new int[]{strokaStart, midStolbec};
        }
        if ((matrix[strokaStart + 1][midStolbec] == target)) {
            return new int[]{strokaStart + 1, midStolbec};
        }
        //search in  1st half
        if ( target <= matrix[strokaStart][midStolbec- 1]) {
            return binarySearch(matrix, strokaStart, 0, strokaEnd-1, target);
        }
        //search in  2nd half
        if ( target >= matrix[strokaStart][midStolbec+ 1] && target <= matrix[strokaStart][stolbci-1]) {
            return binarySearch(matrix, strokaStart, midStolbec +1, stolbci-1, target);
        }
        //search in  3rd half
        if ( target <= matrix[strokaStart + 1][midStolbec- 1]) {
            return binarySearch(matrix, strokaStart +1, 0, midStolbec-1, target);
        }
        //search in  4th half
        else {
            return binarySearch(matrix, strokaStart +1, midStolbec + 1, stolbci-1, target);
        }
    }
}
