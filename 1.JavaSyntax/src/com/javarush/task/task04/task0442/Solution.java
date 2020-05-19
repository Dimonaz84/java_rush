package com.javarush.task.task04.task0442;

/* 
Суммирование
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

        int counter = 0;
        while (true){
            int num = Integer.parseInt(bufferedReader.readLine());
            counter += num;
            if (num == -1) {
                System.out.println(counter);
                break;
            }
        }
    }
}
