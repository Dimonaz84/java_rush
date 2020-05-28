package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
http://javarush.ru/alpha/index.html?obj=string&name=Amigo

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();

        String paramsLine = URL.split("\\?")[1];
        String[] params = paramsLine.split("&");
        String names_output = "";
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        for (String param: params){
            String[] param_arr = param.split("=");
            String param_name = param_arr[0];
            if (param_arr.length != 1) {
                if (param_name.equals("obj")){
                    String param_value = param_arr[1];
                    try{
                        doubles.add(Double.parseDouble(param_value));
                    } catch (Exception e){
                        strings.add(param_value);
                    }
                }
            }
            names_output += param_name + " ";
        }

        System.out.println(names_output);

        for (Double d: doubles)
            alert(d);

        for (String s: strings)
            alert(s);

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
