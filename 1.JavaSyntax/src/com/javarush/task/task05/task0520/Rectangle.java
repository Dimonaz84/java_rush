package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int top, int left, int width, int height){
        this.height = height;
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int top, int left){
        this.height = 0;
        this.top = top;
        this.left = left;
        this.width = 0;
    }

    public Rectangle(int top, int left, int width){
        this.height = width;
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(Rectangle rec){
        this.height = rec.height;
        this.top = rec.top;
        this.left = rec.left;
        this.width = rec.width;
    }

    public static void main(String[] args) {

    }
}
