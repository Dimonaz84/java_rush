package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            list.add(reader.readLine());

        String shortest = list.get(0);
        for (String s: list){
            if (s.length() < shortest.length())
                shortest = s;
        }

        for (String s: list){
            if (s.length() == shortest.length())
                System.out.println(s);
        }
    }
}
