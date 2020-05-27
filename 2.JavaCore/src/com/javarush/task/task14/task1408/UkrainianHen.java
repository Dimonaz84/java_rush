package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
