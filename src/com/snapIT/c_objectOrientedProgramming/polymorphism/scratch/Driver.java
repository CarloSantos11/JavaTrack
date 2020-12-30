package com.snapIT.c_objectOrientedProgramming.polymorphism.scratch;

/**
 * This is meant to illustrate programming to an interface
 */
public class Driver {
    public static void main(String[] args) {
        Animal míAnimal = new Cat();
//        Animal míAnimal = new Dog();

        míAnimal.makeSound();
    }
}
