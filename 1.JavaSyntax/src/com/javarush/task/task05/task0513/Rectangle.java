package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height){
        this.height = height;
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top, int left){
        this.height = 0;
        this.top = top;
        this.left = left;
        this.width = 0;
    }

    public void initialize(int top, int left, int width){
        this.height = width;
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(Rectangle rec){
        this.height = rec.height;
        this.top = rec.top;
        this.left = rec.left;
        this.width = rec.width;
    }

    public static void main(String[] args) {

    }
}
