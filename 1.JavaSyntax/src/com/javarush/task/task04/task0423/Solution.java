package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
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

        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age > 20) System.out.println("И 18-ти достаточно");
    }
}