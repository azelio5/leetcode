package com.anvar.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class GetWordsInLongestSubsequence {

    public static List<String> badGetLongestSubsequence(String[] words, int[] groups) {
        int n = groups.length;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (i == 0 || groups[i] != groups[i - 1]) {
                ans.add(words[i]);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,0,1};

        System.out.println(badGetLongestSubsequence(words, groups));

    }
}
