package com.anvar.leetcode.Middle;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

    }
    public static void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;

        //set markers int row and column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) firstRow = true;
                    if (j == 0) firstCol = true;
                }
                //replace inner matrix
                for (int i = 1; i < matrix.length; i++) {
                    for (int j = 1; j < matrix[0].length; j++) {
                        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }
            }
        }
        //last remaining
        if(firstRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(firstCol){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}

