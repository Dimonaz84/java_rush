package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array_int = new int[10];
        String[] array_str = new String[10];
        for (int i = 0; i < array_str.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            array_str[i] = reader.readLine();
        }

        for (int i = 0; i < array_int.length; i++){
            array_int[i] = array_str[i].length();
            System.out.println(array_int[i]);
        }
    }
}