package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.animal;

public class Cow extends Animal implements AnimalBehavior, AnimalListener {
    String soundType;
    String moveType;

    @Override
    public void move() {
        moveType = "Walking";
        this.onAnimalMoved();
    }

    @Override
    public void makeSound() {
        soundType = "Moo";
        this.onAnimalSound();
    }

    @Override
    public void onAnimalMoved() {
        System.out.println("Moved");
    }

    @Override
    public void onAnimalSound() {
        System.out.println("Made sound");
    }

    public static void main(String[] args) {
        Cow myCow = new Cow();

        myCow.makeSound();
        myCow.move();
    }
}
