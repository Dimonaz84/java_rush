package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] arr = string.toCharArray();
        ArrayList<Character> vowels_list = new ArrayList<>();
        ArrayList<Character> other_list = new ArrayList<>();

        for (char c: arr){
            if (isVowel(c))
                vowels_list.add(c);
            else if (!Character.toString(c).equals(" "))
                other_list.add(c);
        }

        for (int i = 0; i < vowels_list.size(); i++){
            if (i + 1 == vowels_list.size())
                System.out.println(vowels_list.get(i) + " ");
            else
                System.out.print(vowels_list.get(i) + " ");
        }


        for (Character c: other_list)
            System.out.print(c + " ");

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}