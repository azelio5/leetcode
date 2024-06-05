package com.anvar.leetcode.Easy;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] characters = new int[128];
        for (char c : s.toCharArray()) {
            characters[c]++;
        }
        int result = 0;

        for (int i : characters) {
            result += i / 2 * 2;
        }
        if (result < s.length())
            result += 1;

        return result;
    }
}
