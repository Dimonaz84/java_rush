package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {

        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int length = stack.length;
        System.out.println(length);
        return length;
    }
}

