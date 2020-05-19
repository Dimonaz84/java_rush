package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if ((a >= c) && (a >= b)){
            if (b >= c)
                System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        } else if (b >= c){
            if (a > c)
                System.out.println(b + " " + a + " " + c);
            else System.out.println(b + " " + c + " " + a);
        } else if (a > b){
            System.out.println(c + " " + a + " " + b);
        } else System.out.println(c + " " + b + " " + a);
    }
}
