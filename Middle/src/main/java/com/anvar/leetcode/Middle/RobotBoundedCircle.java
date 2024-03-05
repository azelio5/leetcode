package com.anvar.leetcode.Middle;

public class RobotBoundedCircle {
    static final int UP = 0;
    static final int LEFT = 1;
    static final int DOWN = 2;
    static final int RIGHT = 3;
    static final int ORIGIN_DIRECTION = UP;

    public static void main(String[] args) {
        System.out.println(isRobotBounded("GRGL"));
    }
    public static boolean isRobotBounded(String instructions) {
        int curDirection = ORIGIN_DIRECTION;
        int row = 0, col = 0;
        for(char curChar : instructions.toCharArray()){
            if(curChar == 'G'){
                if(curDirection == UP){
                    row--;
                }else if(curDirection == DOWN){
                    row++;
                }else if(curDirection == LEFT){
                    col--;
                }else if(curDirection == RIGHT){
                    col++;
                }
            }else if(curChar == 'L'){
                curDirection++;
                if(curDirection > RIGHT){
                    curDirection = UP;
                }
            }else if(curChar == 'R') {
                curDirection--;
                if(curDirection < UP){
                    curDirection = RIGHT;
                }
            }
        }

        boolean posChanged = row != 0 || col != 0;
        if(!posChanged) return true;
        if(curDirection != ORIGIN_DIRECTION) return true;
        return false;

    }
}
