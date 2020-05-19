package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/


public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ScoreThisCat = 0;
        int ScoreAnotherCat = 0;
        if(this.age>anotherCat.age)
            ScoreThisCat++;
        else if (this.age<anotherCat.age)
            ScoreAnotherCat++;
        if(this.weight>anotherCat.weight)
            ScoreThisCat++;
        else if (this.weight<anotherCat.weight)
            ScoreAnotherCat++;
        if(this.strength>anotherCat.strength)
            ScoreThisCat++;
        else if (this.strength<anotherCat.strength)
            ScoreAnotherCat++;
        return ScoreThisCat > ScoreAnotherCat;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.weight = 1;
        cat1.strength = 1;

        Cat cat3 = new Cat();
        cat3.age = 1;
        cat3.weight = 1;
        cat3.strength = 1;

        System.out.println(cat1.fight(cat3));
    }
}
