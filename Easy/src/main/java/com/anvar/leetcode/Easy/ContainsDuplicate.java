package com.anvar.leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int val : nums) {
//            if (set.contains(val)) return true;
            set.add(val);
        }
        return false;
    }
}
