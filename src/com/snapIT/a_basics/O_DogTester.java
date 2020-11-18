package com.snapIT.a_basics;

public class O_DogTester {
    public static void main(String[] args) {
        O_Dog myNewDog = new O_Dog();

        myNewDog.breed = "Pit Bull";
        myNewDog.name =  "Kaylah";
        myNewDog.size = 30;

        System.out.println(myNewDog.breed);
        System.out.println(myNewDog.name);
        myNewDog.bark();
    }
}
