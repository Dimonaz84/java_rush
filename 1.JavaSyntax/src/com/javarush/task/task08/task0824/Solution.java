package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human son1 = new Human("Son1", true, 15, new ArrayList<>());
        Human son2 = new Human("Son2", true, 10, new ArrayList<>());
        Human son3 = new Human("Son3", true, 5, new ArrayList<>());

        ArrayList<Human> younger_kids = new ArrayList<>();
        younger_kids.add(son1);
        younger_kids.add(son2);
        younger_kids.add(son3);

        Human mother = new Human("Mother", false, 35, younger_kids);
        Human father = new Human("Father", true, 38, younger_kids);

        Human grandmother1 = new Human("Grandmother1", false, 70, new ArrayList<>(Arrays.asList(father)));
        Human grandfather = new Human("Grandfather1", true, 72, new ArrayList<>(Arrays.asList(father)));
        Human grandmother2 = new Human("Grandmother2", false, 70, new ArrayList<>(Arrays.asList(mother)));
        Human grandfather2 = new Human("Grandfather2", true, 73, new ArrayList<>(Arrays.asList(mother)));
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
            System.out.println(this.toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
