package com.anvar.leetcode.Easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RemoveDuplicateFromSortedArrayTest {

    private RemoveDuplicateFromSortedArray underTest;

    @BeforeEach
    public void init() {
        underTest = new RemoveDuplicateFromSortedArray();

    }

    @Test
    void removeDuplicates1(){
        int[] input = new int[]{1,1,2};
        int output = 2;

        int result = underTest.removeDuplicates(input);

        Assertions.assertEquals(output, result);
    }
}