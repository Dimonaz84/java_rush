package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Object> list = new ArrayList<>();

        while (true) {
            Object o = reader.readLine();
            if (o.equals("exit"))
                break;
            list.add(o);
        }

        for (Object o : list) {
            if (o.toString().contains(".")) {
                try {
                    Double dbl_o = Double.parseDouble(o.toString());
                    Solution.print(dbl_o);
                } catch (Exception e){
                    Solution.print(o.toString());
                }
            } else{
                try{
                    int int_o = Integer.parseInt(o.toString());
                    if (int_o > 0 && int_o < 128){
                        short shrt_o = Short.parseShort(o.toString());
                        Solution.print(shrt_o);
                    } else
                        Solution.print(int_o);
                }catch (Exception e){
                    Solution.print(o.toString());
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
