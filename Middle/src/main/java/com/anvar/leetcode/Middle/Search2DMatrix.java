package com.anvar.leetcode.Middle;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};

        System.out.println(searchMatrixEff(arr, 5));


    }

    //O(n2) O(m*n)
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean isPresent = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    isPresent = true;
                    break;
                }
            }

        }
        return isPresent;
    }

    // O(m+n)
    public static boolean searchMatrixEff(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
