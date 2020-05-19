package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("0", "b");
        map.put("2", "c");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "g");
        map.put("6", "h");
        map.put("7", "c");
        map.put("8", "h");
        map.put("9", "n");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Collection<String> values = map.values();
        int counter = 0;
        for (String value: values) {
            if (value.equals(name))
                counter += 1;
        }
         return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Set<String> keys = map.keySet();
        int counter = 0;
        for (String key: keys) {
            if (key.equals(lastName))
                counter += 1;
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
