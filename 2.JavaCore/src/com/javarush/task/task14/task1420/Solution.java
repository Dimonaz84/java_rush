package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 > 0 && num2 > 0) {

            ArrayList<Integer> num1_list = new ArrayList<>();
            ArrayList<Integer> num2_list = new ArrayList<>();

            for (int i = 1; i <= num1; i++)
                if (num1 % i == 0)
                    num1_list.add(i);

            for (int i = 1; i <= num2; i++)
                if (num2 % i == 0)
                    num2_list.add(i);

            num1_list.retainAll(num2_list);

            System.out.println(Collections.max(num1_list));
        } else throw new NumberFormatException();
    }
}
