package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.rectangle;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle r1, r2;

        r1 = new Rectangle(100,200);
        r2 = r1; // here we assign a pointer to the same rectangle

        r1.height = 300;
        r1.width = 400;

        System.out.println("r1: width = " + r1.width + ", height = " + r1.height);
        System.out.println("r2: width = " + r2.width + ", height = " + r2.height);
    }
}
