package com.anvar.leetcode.Middle;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2, 13));
    }
    public static double myPow(double a, int n) {
        long b = n;
        double res = 1;
        if (n < 0) {
            b = b * -1;
        }
        while (b > 0) {
            if (b % 2 == 1) {
                b--;
                res = res * a;
            } else {
                a = a * a;
                b /= 2;
            }
        }
        if (n < 0) {
            return 1.0 / res;
        }
        return res;
    }
}
