package com.snapIT.c_objectOrientedProgramming.fundamentals.person;

public class Person {
    // Properties
    int age;      // 0
    int height;   // 0
    String name;  // null

    // Constructor
    public Person(int myAge){
        age = myAge;
    }

    public Person() {
        this(21);
    }

    // Methods
    public void walk(int speed) {
        // Do Walking operations here
        if (speed > 10)
        {
            System.out.println("Walking...");
            System.out.println(age);
        }
    }
    public void sleep() {
        System.out.println("Sleeping ...");
    }
    private void takeShower() {
        System.out.println("Taking a shower ...");
    }

}
