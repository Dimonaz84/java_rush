package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                if (j == i - 1)
                    System.out.println("8");
                else
                    System.out.print("8");
            }
        }
    }
}
