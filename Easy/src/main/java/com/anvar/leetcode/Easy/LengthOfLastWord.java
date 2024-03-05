package com.anvar.leetcode.Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello My name is Anvar!!!"));
    }
    public static int lengthOfLastWord(String s) {
        String a = s.trim();
        int count = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ') break;
            else count++;
        }
        return count;
    }
}
