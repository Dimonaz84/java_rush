package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int counter = 0;
            while (counter < n) {
                list.add(Integer.parseInt(reader.readLine()));
                counter++;
            }

            int maximum = Collections.max(list);
            System.out.println(maximum);
        }
    }
}
