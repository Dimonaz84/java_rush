package com.javarush.task.task04.task0427;

/* 
Описываем числа
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
        int digits = String.valueOf(a).length();

        if ((a > 0) && (a < 1000)) {
            if ((digits == 1) && (a % 2 == 0)) System.out.println("четное однозначное число");
            else if (digits == 1) System.out.println("нечетное однозначное число");
            else if ((digits == 2) && (a % 2 == 0)) System.out.println("четное двузначное число");
            else if (digits == 2) System.out.println("нечетное двузначное число");
            else if ((digits == 3) && (a % 2 == 0)) System.out.println("четное трехзначное число");
            else if (digits == 3) System.out.println("нечетное трехзначное число");
        }
    }
}
