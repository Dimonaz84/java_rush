package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private String address;
        private int salary;

        public Human(String firstName, String lastName, int age, boolean sex, String address){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String firstName, String lastName, int age, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int age, int salary){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }

        public Human(String firstName, String lastName, boolean sex, String address){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.address = address;
        }

        public Human(int age, boolean sex, String address){
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName){
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String firstName, boolean sex){
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(){}

    }

}
