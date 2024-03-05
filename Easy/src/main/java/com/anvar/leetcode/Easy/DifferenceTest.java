package com.anvar.leetcode.Easy;

public class DifferenceTest {
    public static void main(String[] args) {
       findTheDifference("abcd", "abcde");

//        int num = 101;
//
//        char mar = (char)101;
//
//        System.out.println(mar);

    }
    public static char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        for (int i = 0; i <s.length(); i++) {
            sumS += (int) s.charAt(i);
            sumT += (int) t.charAt(i);
        }

        return (char) (sumT - sumS);
    }



}
