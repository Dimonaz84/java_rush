package com.javarush.task.task03.task0318;

/* 
План по захвату мира
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

        String years = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int years_int = Integer.parseInt(years);

        System.out.println(name + " захватит мир через " + years_int + " лет. Му-ха-ха!");

    }
}
