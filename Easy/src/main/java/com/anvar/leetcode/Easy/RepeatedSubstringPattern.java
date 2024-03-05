package com.anvar.leetcode.Easy;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }




    static boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        for (int i = n / 2; i >= 1; --i) {
            if (n % i == 0) {
                int c = n / i;
                StringBuilder t = new StringBuilder();
                t.append(str.substring(0, i).repeat(c));
                if (t.toString().equals(str)) return true;
            }
        }
        return false;
    }
}
