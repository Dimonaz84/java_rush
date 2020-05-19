package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String num = bufferedReader.readLine();
        int inum = Integer.parseInt(num);
        if(inum == 1) System.out.println("понедельник");
        else if(inum==2) System.out.println("вторник");
        else if(inum==3) System.out.println("среда");
        else if(inum==4) System.out.println("четверг");
        else if(inum==5) System.out.println("пятница");
        else if(inum==6) System.out.println("суббота");
        else if(inum==7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");
    }
}
