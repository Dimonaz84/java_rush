package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
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

        double sum = 0;
        int amount = 0;
        while(true){
            int a = Integer.parseInt(bufferedReader.readLine());
            if (a == -1)
                break;
            sum += a;
            amount ++;
        }
        System.out.println(sum/amount);
    }
}

