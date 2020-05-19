package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list1.add(Integer.parseInt(reader.readLine()));
        }

        for(Integer num: list1){
            if (num % 3 == 0)
                list2.add(num);
        }

        for(Integer num: list1){
            if (num % 2 == 0)
                list3.add(num);
        }

        for(Integer num: list1){
            if(!(list2.contains(num) | list3.contains(num)))
                list4.add(num);
        }

        printList(list2);
        printList(list3);
        printList(list4);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer num: list)
            System.out.println(num);
    }


}
