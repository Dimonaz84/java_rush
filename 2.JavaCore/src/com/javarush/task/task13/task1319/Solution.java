package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // C:\1\1.txt
        String file = reader.readLine();

        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        try {
            String inputLine = null;
            do {
                inputLine=reader.readLine();
                out.write(inputLine);
                out.newLine();
            } while (!inputLine.equalsIgnoreCase("exit"));
        } catch(IOException e1) {
            System.out.println("Error during reading/writing");
        } finally {
            out.close();
            reader.close();
        }
    }
}
