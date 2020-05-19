package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
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

        float a = Float.parseFloat(bufferedReader.readLine());

        if (a % 5 < 3) System.out.println("зелёный");
        else if ((a % 5 >= 3) && (a % 5 < 4)) System.out.println("жёлтый");
        else System.out.println("красный");
    }
}