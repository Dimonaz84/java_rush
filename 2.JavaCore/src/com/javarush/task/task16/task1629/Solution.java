package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t2.start();
        t2.join();
        t1.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {

        String str1 = "";
        String str2 = "";
        String str3 = "";

        public void run(){
            try {
                str1 = reader.readLine();
                str2 = reader.readLine();
                str3 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult(){
            System.out.println(str1 + " " + str2 + " " + str3);
        }

    }
}
