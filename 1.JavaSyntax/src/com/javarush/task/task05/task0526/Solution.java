package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("name1", 22, "address1");
        Man man2 = new Man("name2", 35, "address2");

        Woman woman1 = new Woman("wname1", 30, "address3");
        Woman woman2 = new Woman("wname2", 40, "address4");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }


}
