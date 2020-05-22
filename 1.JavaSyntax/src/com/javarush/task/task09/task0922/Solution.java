package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Locale.ENGLISH;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); //2013-08-18
        Date date = simpleDateFormat.parse(input);

        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy", ENGLISH); //AUG 18, 2013
        System.out.println(outputDateFormat.format(date).toUpperCase());
    }
}
