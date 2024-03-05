package com.anvar.leetcode.Easy;

public class Difference {
    public static void main(String[] args) {
       // findTheDifference("abcd", "abcde");

        int num = 101;

        char mar = (char)101;

        System.out.println(mar);

    }
    public static char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;
        char ch;

        for (int i = 0; i <s.length(); i++) {
            System.out.println(sumS);
            sumS += (int) s.charAt(i);
        }

        System.out.println(sumS);

        for (int j = 0; j < t.length(); j++) {
            System.out.println(sumT);
            sumT += (int) t.charAt(j);
        }

        System.out.println(sumT);


        ch = (char) (sumT - sumS);

        System.out.println(ch);
        return ch;
    }



}
