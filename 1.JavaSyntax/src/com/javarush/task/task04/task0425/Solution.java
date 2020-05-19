package com.javarush.task.task04.task0425;

/* 
Цель установлена!
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

        if ((a > 0) && (b > 0)) System.out.println(1);
        else if ((a < 0) && (b > 0)) System.out.println(2);
        else if ((a < 0) && (b < 0)) System.out.println(3);
        else if ((a > 0) && (b < 0)) System.out.println(4);
    }
}