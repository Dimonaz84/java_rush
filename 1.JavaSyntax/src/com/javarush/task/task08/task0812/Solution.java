package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        ArrayList<Integer> lengths = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < list.size() -1; i++) {
            if (list.get(i).equals(list.get(i + 1)))
                length += 1;
            else {
                lengths.add(length);
                length = 0;
            }
            lengths.add(length);
        }
        System.out.println(Collections.max(lengths) + 1);
    }
}