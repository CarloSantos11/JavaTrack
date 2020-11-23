package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.animal;

public class Cat extends Animal {
    public Cat(int legs, int ears, int eyes) {
    }

    public static void main(String[] args) {
        Cat puppy = new Cat(4 , 2, 2);

        puppy.setFamily("Cat");
        puppy.setName("Puppy");
        puppy.printInfo();
    }

}
