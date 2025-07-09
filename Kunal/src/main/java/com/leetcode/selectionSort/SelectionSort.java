package com.leetcode.selectionSort;

import com.leetcode.Kunal.bubbleSort.BubbleSort; // Импорт класса для обмена элементов

import java.util.Arrays;

//Сложность: O(n²) — не очень эффективен для больших массивов, но прост для понимания.

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Находим индекс максимального элемента в неотсортированной части
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            BubbleSort.swap(arr, maxIndex, last); // Меняем местами найденный максимум и последний элемент неотсортированной части
        }
    }

    private static int getMaxIndex(int[] arr, int startElement, int end) {
        int max = startElement;
        for (int i = startElement; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}