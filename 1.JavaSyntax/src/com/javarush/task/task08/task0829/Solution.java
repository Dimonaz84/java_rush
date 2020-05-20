package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            list.add(city);

            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(family);
        }

        // Read the city
        String city = reader.readLine();

        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(city))
                System.out.println(list.get(i + 1));
    }
}

