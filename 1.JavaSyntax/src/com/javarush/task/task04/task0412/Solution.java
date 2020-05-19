package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
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

        String num = bufferedReader.readLine();
        int int_num = Integer.parseInt(num);
        if (int_num > 0){
            int_num = int_num*2;
            System.out.println(int_num);
        }
        else if (int_num < 0){
            int_num = int_num+1;
            System.out.println(int_num);
        }
        else System.out.println(0);
    }
}
