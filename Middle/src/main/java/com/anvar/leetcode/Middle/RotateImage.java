package com.anvar.leetcode.Middle;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 6, 11, 16, 21},
                {2, 7, 12, 17, 22},
                {3, 8, 13, 18, 23},
                {4, 9, 14, 19, 24},
                {5, 10, 15, 20, 25}
        };

        System.out.println(Arrays.deepToString(image));

        rotate(image);

        System.out.println(Arrays.deepToString(image));

    }

    public static void rotate(int[][] matrix) {
        //transpose matrix

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for (int[] el : matrix) {
            int left = 0, right = matrix[0].length - 1;
            while (left < right) {
                swap(left, right, el);
                left++;
                right--;
            }
        }

    }

    private static void swap(int left, int right, int[] matrix) {
        int temp = matrix[left];
        matrix[left] = matrix[right];
        matrix[right] = temp;
    }
}
