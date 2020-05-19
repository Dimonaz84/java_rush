package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if ((a == b) && (a == c)) System.out.println(a + " " + b + " " + c);
        else {
            if (a == b) {
                System.out.println(a + " " + b);
            } else {
                if (b == c) {
                    System.out.println(b + " " + c);
                } else if (a == c)
                    System.out.println(a + " " + c);
            }
        }
    }
}