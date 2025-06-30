package com.leetcode.Kunal;


//lc 1295
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        //  System.out.println(even(7896));
      //  System.out.println(findNumbers(nums));

        int number = 5566;

        System.out.println(numberOfDigits(number));

    }

    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) count++;
        }
        return count;

    }

    static int numberOfDigits(int num) {
        return (int) (Math.log10(num) + 1);
    }

    private static boolean even(int num) {
        //count number of digits
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        if (count % 2 == 0) return true;
        return false;
    }
}
