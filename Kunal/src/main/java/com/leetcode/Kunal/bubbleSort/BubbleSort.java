package com.leetcode.Kunal.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];        // Сохраняем значение первого элемента во временную переменную
        arr[first] = arr[second];     // Присваиваем первому элементу значение второго
        arr[second] = temp;           // Второму элементу присваиваем сохранённое значение первого
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;

        // Внешний цикл выполняется столько раз, сколько элементов в массиве (N раз).
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // Внутренний цикл проходит по неотсортированной части массива.
            // С каждым проходом "самый большой" элемент всплывает в конец, поэтому каждый раз внутренний цикл на один элемент короче.
            for (int j = 1; j < arr.length - i; j++) {
                // Если текущий элемент меньше предыдущего — меняем их местами.
                if (arr[j] < arr[j - 1]) {
                    // Свап — обмен значениями двух элементов
                    swap(arr, j, j - 1);
                    swapped = true; // Фиксируем, что был обмен элементов
                }
            }
            // Если за внутренний цикл ни одного обмена не произошло — массив уже отсортирован, выходим досрочно.
            if (!swapped) {
                break;
            }
        }
    }
}
