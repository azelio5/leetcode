package com.anvar.leetcode.Middle;

import java.util.Arrays;


public class MultiplyStrings {

    public static void main(String[] args) {
//        String name = "Anvar";
//        String name2 = "0";
//        char ch = '0';
//
//        System.out.println(ch);
//        System.out.println(name2.charAt(1) - '0');

        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        int l1 = num1.length(), l2 = num2.length();
        int[] res = new int[l1 + l2];
        for (int i = l2 - 1; i >= 0; i--) {
            for (int j = l1 - 1; j >= 0; j--) {
                int product = (ch1[j] - '0') * (ch2[i] - '0');
                int current = product + res[i + j + 1];
                res[i + j + 1] = current % 10;
                res[i + j] += current / 10;
            }
        }
        int index = 0;
        while (index < res.length && res[index] == 0) {
            ++index;
        }

        StringBuilder result = new StringBuilder();
        for (; index < res.length; index++) {
            result.append(String.valueOf(res[index]));
        }
        return result.toString();
    }
}

