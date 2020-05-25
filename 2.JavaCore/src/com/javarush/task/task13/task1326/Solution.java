package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // C:\1\1.txt
        String file = reader.readLine();
        reader.close();

        InputStreamReader inStream = new InputStreamReader(new FileInputStream(file));
        BufferedReader in = new BufferedReader(inStream);

        ArrayList<Integer> list = new ArrayList<>();

        while(in.ready())
            list.add(Integer.parseInt(in.readLine()));

        inStream.close();

        Collections.sort(list);

        for (Integer num: list)
            if (num % 2 == 0)
                System.out.println(num);
    }
}