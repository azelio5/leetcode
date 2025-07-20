package com.leetcode.Kunal.insertionSort;


import com.leetcode.Kunal.bubbleSort.BubbleSort;

import java.util.Arrays;

//Начинаем с второго элемента массива.
//
//Сравниваем его с предыдущими элементами.
//
//Если он меньше, сдвигаем большие элементы вправо и вставляем его в нужное место.
//
//Повторяем шаги для всех остальных элементов.
//
//
//Массив: [5, 3, 4, 1]
//
//Начинаем со второго элемента (3):
//
//Сравниваем с 5 → 3 < 5 → вставляем 3 перед 5 → [3, 5, 4, 1]
//
//Берём 4:
//
//Сравниваем с 5 → 4 < 5
//
//Сравниваем с 3 → 4 > 3 → вставляем между 3 и 5 → [3, 4, 5, 1]
//
//Берём 1:
//
//Сравниваем с 5, 4, 3 → 1 меньше всех → вставляем в начало → [1, 3, 4, 5]
//
//
//В худшем случае (наоборот отсортирован) — O(n²)
//
//В лучшем случае (почти отсортирован) — O(n)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    BubbleSort.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
