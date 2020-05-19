package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++){
            if (i < 10)
                array1[i] = array[i];
            else {
                array2[i - 10] = array[i];
                System.out.println(array2[i - 10]);
            }
        }
    }
}