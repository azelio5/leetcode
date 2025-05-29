package com.anvar.leetcode.Middle;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {40, 41, 42, 43, 44, 45, 46, 47, 48}
        };

        int[][] matrix2 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //first let to right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            //second right to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom && left <= right) {
                //third right to left
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
                //fourth left to top
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;

    }
}
