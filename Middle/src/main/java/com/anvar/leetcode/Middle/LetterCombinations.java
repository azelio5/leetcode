package com.anvar.leetcode.Middle;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static String ans = "";
    static List<String> result  = new ArrayList<>();
    static String s = "46";

    static void possible(String s, String ans) {

        result.add(ans);
        if (s.length() == 0) {
         //   System.out.println(ans);
            result.add(ans);
            return ;
        }

        String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length(); i++) {
            possible(s.substring(1), ans + key.charAt(i));

        }
     //   result.add(ans);
        System.out.println(result.toString());
    }




//    public static List<String> letterCombinations(String digits, String ans) {
//
//        if (digits.length() == 0) {
//            System.out.println(ans);
//            result.add(ans);
//            return result;
//
//        }
//        String key = keypad[digits.charAt(0) - 48];
//
//        for (int i = 0; i < key.length(); i++) {
//            letterCombinations(digits.substring(1), ans + key.charAt(i));
//        }
//        return result;
//    }

    public static void main(String[] args) {
        possible(s, ans);
    }
}
