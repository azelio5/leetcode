package com.anvar.leetcode.Easy;

import java.util.Stack;

public class Baseball {
    public static int calPoints(String[] ops) {
        int n = 0;
        Stack<Integer> stack = new Stack<>();
        for (String s:ops) {
            switch (s) {
                case "+" -> {
                    //stack.pop () deletes the object at the top of the stack and returns the object
                    int del = stack.pop();
                    //stack.peek () returns the object at the top of the stack
                    int last = del + stack.peek();
                    n += last;
                    stack.push(del);
                    stack.push(last);
                }
                case "D" -> {
                    int twoLast = stack.peek() * 2;
                    n += twoLast;
                    //stack.push(twoLast) save to the stack
                    stack.push(twoLast);
                }
                case "C" -> n -= stack.pop();
                default -> {
                    int save = Integer.parseInt(s);
                    n += save;
                    stack.push(save);
                }
            }
        }
        return n;
    }
}
