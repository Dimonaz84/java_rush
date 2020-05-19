package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Grandfather1", true, 65);
        Human grandmother1 = new Human("Grandmother1", false, 65);
        Human grandfather2 = new Human("Grandfather2", true, 67);
        Human grandmother2 = new Human("Grandmother2", false, 67);
        Human father = new Human("Father", true, 35, grandfather1, grandmother1);
        Human mother = new Human("Mother", false, 32, grandfather2, grandmother2);
        Human son1 = new Human("Son1", true, 12, father, mother);
        Human son2 = new Human("Son2", true, 10, father, mother);
        Human daughter = new Human("Daughter", false, 8, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}