package com.leetcode.Kunal.bs2d;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        //c wise r wise

        int[][] arr2d = {
                {10, 20, 30},
                {12, 18, 29},
                {18, 24, 55}
        };

        System.out.println(Arrays.toString(search2D(arr2d, 15)));

    }

    static int[] search2D(int[][] matrix, int target) {
        int stroka = 0;
        int stolbec = matrix[0].length - 1;

        while (stroka < matrix.length && stolbec >= 0) {
            if (matrix[stroka][stolbec] == target) {
                return new int[]{stroka, stolbec};
            }
            if (matrix[stroka][stolbec] < target) {
                stroka++;
            } else {
                stolbec--;
            }
        }
        return new int[]{-1, -1};
    }
}
