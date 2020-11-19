package com.snapIT.c_objectOrientedProgramming.fundamentals.animal;

public class Animal {
    int legs;
    int ears;
    int eyes;
    String family;
    String name;

    public Animal(int legs,int ears, int eyes) {
        this.legs = legs;
        this.ears = ears;
        this.eyes = eyes;
    }

    public Animal() {
        this(4,2,2);
//        this.legs = 4;
//        this.ears = 2;
//        this.eyes = 2;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.print(
                "This is " + name + ". " + name + " is a " + family + "\n" +
                "Legs: " + legs + "\n" +
                "Ears: " + ears + "\n" +
                "Eyes: " + eyes + "\n"
        );
    }

}
