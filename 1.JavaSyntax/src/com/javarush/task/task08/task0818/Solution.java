package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1" , 200);
        map.put("2" , 300);
        map.put("3" , 400);
        map.put("4" , 500);
        map.put("5" , 600);
        map.put("6" , 700);
        map.put("7" , 800);
        map.put("8" , 900);
        map.put("9" , 1000);
        map.put("0" , 100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}