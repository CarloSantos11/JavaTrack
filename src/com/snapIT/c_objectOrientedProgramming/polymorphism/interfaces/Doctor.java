package com.snapIT.c_objectOrientedProgramming.polymorphism.interfaces;

public class Doctor implements PersonBehavior, PersonListener {

    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.walk(20);
        myDoctor.sleep();
    }

    @Override
    public void breathe(){

    }

    @Override
    public void sleep() {
        // TODO: Do other operations here
        // then raise event
        this.onPersonSleeping();
    }

    @Override
    public void walk(int speed) {
        // TODO: do other operations here
        // then raise event
        this.onPersonWalking();
    }

    @Override
    public void onPersonWalking() {
        System.out.println("Event: onPersonWalking");
    }

    public void onPersonSleeping() {
        System.out.println("Event: onPersonSleeping");
    }
}
