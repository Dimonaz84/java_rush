package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "name";
        Zerg zerg2 = new Zerg();
        zerg2.name = "name1";
        Zerg zerg3 = new Zerg();
        zerg3.name = "name2";
        Zerg zerg4 = new Zerg();
        zerg4.name = "name3";
        Zerg zerg5 = new Zerg();
        zerg5.name = "name4";

        Protoss protoss1 = new Protoss();
        protoss1.name = "name5";
        Protoss protoss2 = new Protoss();
        protoss2.name = "name6";
        Protoss protoss3 = new Protoss();
        protoss3.name = "name7";

        Terran terran = new Terran();
        terran.name = "name8";
        Terran terran2 = new Terran();
        terran2.name = "name9";
        Terran terran3 = new Terran();
        terran3.name = "name10";
        Terran terran4 = new Terran();
        terran4.name = "name11";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
