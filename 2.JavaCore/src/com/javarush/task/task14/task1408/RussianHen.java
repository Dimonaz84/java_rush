package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 0;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - Russia. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
