package com.anvar.leetcode.Easy;

public class CountOdds {
    public static void main(String[] args) {
        System.out.println(countOdds(1, 10));

    }
    public static int countOdds(int low, int high)
    {
        return (high + 1) / 2 - low / 2;
    }
}

