package com.anvar.leetcode.Easy;

public class NumberStudentsUnableEatLunch {
    public static void main(String[] args) {

    }

    public int countStudents(int[] students, int[] sandwiches) {
        int[] counter = {0, 0};  //{stud zero, stud 1}

        for (int student : students) {
            counter[student]++;
        }
        int i = 0;
        for (; i < sandwiches.length && counter[sandwiches[i]] > 0; i++) {
            counter[sandwiches[i]]--;
        }
        return students.length - i;
    }
}
