package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.animal;

public class Cat extends Animal {
    public String owner;

    public Cat(int legs, int ears, int eyes, String owner) {
        this.owner = owner;
    }

}
