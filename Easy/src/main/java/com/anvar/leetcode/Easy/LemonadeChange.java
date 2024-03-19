package com.anvar.leetcode.Easy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0,ten=0,twenty=0;
        for (int bill : bills) {
            if (bill == 5) five++;
            else if (bill == 10) {
                ten++;
                if (five > 0) five--;
                else return false;
            } else {
                twenty++;
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five > 2) five = five - 3;
                else return false;
            }

        }
        return true;
    }

}


