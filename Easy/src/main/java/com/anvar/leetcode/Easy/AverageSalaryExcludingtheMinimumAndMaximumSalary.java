package com.anvar.leetcode.Easy;

public class AverageSalaryExcludingtheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] salary = {1000, 2000, 3000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : salary) {
            min = Math.min(min, j);
            max = Math.max(max, j);
            sum += j;
        }
        double newSum = sum - min - max;
        double newLength = salary.length - 2;
        return newSum / newLength;
    }
}
