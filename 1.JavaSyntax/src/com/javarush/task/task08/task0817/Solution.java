package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "one");
        map.put("3", "two");
        map.put("4", "three");
        map.put("5", "four");
        map.put("6", "one");
        map.put("7", "five");
        map.put("8", "six");
        map.put("9", "three");
        map.put("0", "one");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> to_remove = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>(map.values());
        for (int i = 0; i < values.size(); i++){
            for (int j = 0; j < values.size(); j++){
                if(i != j){
                    if (values.get(i).equals(values.get(j))){
                        to_remove.add(values.get(i));
                    }
                }
            }
        }
        for (String s: to_remove)
            removeItemFromMapByValue(map, s);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
