package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfather_name = reader.readLine();
        Cat catGrandfather = new Cat(grandfather_name);

        String grandmother_name = reader.readLine();
        Cat catGrandmother = new Cat(grandmother_name);

        String father_name = reader.readLine();
        Cat catFather = new Cat(father_name, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parent1 != null && parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent1.name + ", no father";
            else if (parent1 == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parent2.name;
            else
                return "The cat's name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
        }
    }

}
