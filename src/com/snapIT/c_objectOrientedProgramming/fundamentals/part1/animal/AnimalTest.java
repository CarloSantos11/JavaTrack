package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.animal;

public class AnimalTest {
    public static void main(String[] args) {

        Cat myCat = new Cat(4,2,2, "Tim");
        Cow myCow = new Cow();

        System.out.println(myCat.owner);
        Animal myAnimal = (Animal)myCat;
//        System.out.println(myAnimal.owner);

        Cat downCasting = (Cat)myAnimal;
        System.out.println(downCasting.owner);

        myCow.makeSound();
        Animal myAnimalTwo = (Animal) myCow;
        Cow cowAgain = (Cow)myAnimalTwo;
        cowAgain.makeSound();

//        Animal myAnimal1 = new Animal(1,2,3);
//        Animal myAnimal2 = new Animal();
//        Animal myAnimal3 = new Animal();
//
//        myAnimal1.setName("Jeff");
//        myAnimal1.setFamily("ostrich");
//        myAnimal2.setFamily("cockatoo");
//        myAnimal3.setFamily("dog");
//
//        myAnimal1.printInfo();
//        myAnimal2.printInfo();
//        myAnimal3.printInfo();
    }
}
