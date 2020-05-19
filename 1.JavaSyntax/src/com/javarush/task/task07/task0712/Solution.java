package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String shortest = list.get(0);
        for (String s: list){
            if (s.length() < shortest.length())
                shortest = s;
        }

        String longest = list.get(0);
        for (String s: list){
            if (s.length() > longest.length())
                longest = s;
        }

        int shortest_index = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(shortest)) {
                shortest_index = i;
                break;
            }

        int longest_index = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(longest)) {
                longest_index = i;
                break;
            }

        if (shortest_index < longest_index)
            System.out.println(list.get(shortest_index));
        else
            System.out.println(list.get(longest_index));
    }
}
