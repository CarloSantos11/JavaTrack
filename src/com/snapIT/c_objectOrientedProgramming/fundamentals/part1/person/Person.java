package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.person;

public class Person {
    // Properties
    int age;      // 0
    int height;   // 0
    int weight; // 0
    String name;  // null

    // Constructor
    public Person(int myAge, int myHeight, int myWeight) {
        this.age = myAge;
        this.height = myHeight;
        this.weight = myWeight;
    }

    public Person() {
        this(21, 60, 300);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
