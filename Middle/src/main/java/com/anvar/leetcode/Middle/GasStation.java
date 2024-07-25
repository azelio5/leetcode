package com.anvar.leetcode.Middle;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startingIndex = 0;
        int currentTank = 0;
        int totalTank = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            if (currentTank < 0) {
                startingIndex = i;
                currentTank = diff;
            } else {
                currentTank += diff;
            }
            totalTank += diff;
        }
        if (totalTank < 0) return -1;
        else {
            return startingIndex;
        }
    }
}

