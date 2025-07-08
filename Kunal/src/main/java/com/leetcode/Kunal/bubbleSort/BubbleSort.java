package com.leetcode.Kunal.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;

        //run the steps N-1
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each max item will come at the last
            for (int j = 1; j < arr.length - i; j++) {
                //swap if smaller than prev
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}
