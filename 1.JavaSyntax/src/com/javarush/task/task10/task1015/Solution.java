package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[2];
        ArrayList<String> list = new ArrayList<>();
        list.add("List one String one");
        list.add("List one String two");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("List two String one");
        list2.add("List two String two");
        array[0] = list;
        array[1] = list2;

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}