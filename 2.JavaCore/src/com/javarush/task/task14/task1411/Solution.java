package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;

        ArrayList<String> keys = new ArrayList<>();
        String input = "";
        while(true){
            input = reader.readLine();
            if (!(input.equals("user")) && !(input.equals("loser")) && !(input.equals("coder")) && !(input.equals("proger")))
                break;
            keys.add(input);
        }

        for (String key: keys){
            switch (key){
                case "user": person = new Person.User();
                    doWork(person);
                    break;
                case "loser": person = new Person.Loser();
                    doWork(person);
                    break;
                case "coder": person = new Person.Coder();
                    doWork(person);
                    break;
                default: person = new Person.Proger();
                    doWork(person);
                    break;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else ((Person.Proger) person).enjoy();
    }
}
