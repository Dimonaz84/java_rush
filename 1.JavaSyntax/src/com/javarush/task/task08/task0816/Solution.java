package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("FEBRUARY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().toString().contains("Jun") |
                    pair.getValue().toString().contains("Jul") |
                    pair.getValue().toString().contains("Aug"))
                iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
