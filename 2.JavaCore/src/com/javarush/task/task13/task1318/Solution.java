package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // C:\1\1.txt
        String file = reader.readLine();
        reader.close();

        InputStreamReader inStream = new InputStreamReader(new FileInputStream(file));
        BufferedReader in = new BufferedReader(inStream);

        String line = in.readLine();
        while(line != null)
        {
            System.out.println(line);
            line = in.readLine();
        }
        inStream.close();
    }
}