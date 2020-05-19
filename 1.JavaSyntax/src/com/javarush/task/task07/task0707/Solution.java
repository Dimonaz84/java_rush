package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111111");
        list.add("222222");
        list.add("333333");
        list.add("444444");
        list.add("555555");

        System.out.println(list.size());

        for (String s : list)
            System.out.println(s);
    }
}
