package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < 5){
            list.add(Integer.parseInt(reader.readLine()));
            i++;
        }
        Collections.sort(list);
        for (Integer num: list)
            System.out.println(num);
    }
}
