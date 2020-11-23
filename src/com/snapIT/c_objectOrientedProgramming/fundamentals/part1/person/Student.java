package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.person;

public class Student extends Person {

    @Override
    public void walk(int speed) {
        // Walk to class
        System.out.println("Walking to class ...");
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("James Gossling");
        System.out.println(student.getName());

        student.walk(20);
        student.sleep();
    }

}
