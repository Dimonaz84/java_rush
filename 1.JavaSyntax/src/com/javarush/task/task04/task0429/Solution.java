package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int pos_counter = 0;
        int neg_counter = 0;

        if (a > 0) pos_counter += 1;
        else if (a < 0) neg_counter += 1;

        if (b > 0) pos_counter += 1;
        else if (b < 0) neg_counter += 1;

        if (c > 0) pos_counter += 1;
        else if (c < 0) neg_counter += 1;

        System.out.println("количество отрицательных чисел: " + neg_counter);
        System.out.println("количество положительных чисел: " + pos_counter);

    }
}
