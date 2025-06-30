package com.leetcode.Kunal;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //       System.out.println(searchInArray(arr, 5));

        String name = "Anvar";

        //      System.out.println(search(name, 'A'));

        int[][] arr2D = {
                {23, 4, 1},
                {18, 12, 3 ,9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.println(search2D(arr2D, 122));

    }

    private static int search2D(int[][] arr2D, int target) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] == target) {return arr2D[i][j];}
            }
        }
        return -1;
    }


    static int searchInArray(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    static boolean search(String str, char c) {
        if (str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;

    }

}
