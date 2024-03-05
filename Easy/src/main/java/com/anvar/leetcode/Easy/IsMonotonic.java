package com.anvar.leetcode.Easy;

public class IsMonotonic {
    public boolean isMonotonic(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isDecreasing = false;
            }

            if (array[i] > array[i - 1]) {
                isIncreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }
}
