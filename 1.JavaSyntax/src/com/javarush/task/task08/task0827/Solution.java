package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {

        String dateLowerCase = date.toLowerCase();
        String dateCorrect = dateLowerCase.substring(0, 1).toUpperCase() + dateLowerCase.substring(1);
        LocalDate parsedDate = LocalDate.parse(dateCorrect, DateTimeFormatter.ofPattern("MMMM d yyyy").withLocale(Locale.ENGLISH));
        int today = parsedDate.getDayOfYear();

        if (today % 2 != 0)
            return true;

        return false;
    }
}
