package com.anvar.leetcode.Easy;

class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(getLucky("iiii",1 ));

    }
    public static int getLucky(String s, int k) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            while (num > 0) {
                total += num % 10;
                num /= 10;
            }
            k--;
            while (k > 0) {
                int newTotal = 0;
                while (total > 0) {
                    newTotal += total % 10;
                    total /= 10;
                }
                total = newTotal;
                k--;
            }

        }
        return total;

    }
}
