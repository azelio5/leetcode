package com.leetcode.Kunal;

public class Count5s {
    public static void main(String[] args) {
        int n = 45375;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
