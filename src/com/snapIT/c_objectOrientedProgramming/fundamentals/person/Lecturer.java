package com.snapIT.c_objectOrientedProgramming.fundamentals.person;

public class Lecturer extends Person {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Prof. James Gossling");
        System.out.println(lecturer.getName());

        lecturer.walk(20);
        lecturer.sleep();    }
}
