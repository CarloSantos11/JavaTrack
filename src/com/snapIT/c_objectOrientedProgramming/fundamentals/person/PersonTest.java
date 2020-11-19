package com.snapIT.c_objectOrientedProgramming.fundamentals.person;

public class PersonTest {
    public static void main(String[] args) {

        Person me = new Person(30);
        Person myNeighbor = new Person(34 );
        Person lecturer = new Person(99);
        Person me2 = new Person();



        me.walk(20);
        me.walk(5);
        me.sleep();

        myNeighbor.walk(20);
        myNeighbor.walk(5);
        myNeighbor.sleep();

        lecturer.walk(20);
        lecturer.walk(5);
        lecturer.sleep();

        me2.walk(20);
        me2.walk(5);
        me2.sleep();
    }

}
