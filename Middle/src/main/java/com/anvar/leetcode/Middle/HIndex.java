package com.anvar.leetcode.Middle;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        int[] arr = {3, 0, 6, 1, 5};

        System.out.println(hIndex(arr));
    }
//BF O(n2)
//    public static int hIndex(int[] citations) {
//        int n = citations.length;
//        for (int hIndex = 1; hIndex <= n; hIndex++) {
//            int count = 0;
//            for (int citation : citations) {
//                if (citation >= hIndex) {
//                    count++;
//                }
//            }
//            if (count < hIndex) {
//                return hIndex - 1;
//            }
//        }
//        return n;
//    }

    //O(N Log N)

//    public static int hIndex(int[] citations) {
//        Arrays.sort(citations);
//        int n = citations.length, hIndex = 1;
//        for (int i = n - 1; i >= 0; i--) {
//            if (citations[i] < hIndex) return hIndex - 1;
//            hIndex++;
//        }
//        return n;
//    }

    //O(n)
    public static int hIndex(int[] citations) {
        int n = citations.length;

        int[] count = new int[n + 1];

        for (int citation : citations) {
            if (citation >= n) count[n]++;
            else count[citation]++;
        }

        int pos = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < count[i]; j++) {
                citations[pos] = i;
                pos++;
            }
        }
        int hIndex = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (citations[i] < hIndex) return hIndex - 1;
            hIndex++;
        }
        return n;
    }
}
