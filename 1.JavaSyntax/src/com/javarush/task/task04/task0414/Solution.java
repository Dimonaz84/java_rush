package com.javarush.task.task04.task0414;

/* 
Количество дней в году
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

        String year = bufferedReader.readLine();
        int year_int = Integer.parseInt(year);

        if(year_int % 400 == 0)
            System.out.println("количество дней в году: 366");
        else {
            if (year_int % 100 == 0)
            System.out.println("количество дней в году: 365");
            else{
                if (year_int % 4 == 0)
                    System.out.println("количество дней в году: 366");
                else System.out.println("количество дней в году: 365");
            }
        }
    }
}
