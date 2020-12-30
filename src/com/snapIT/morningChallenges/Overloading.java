package com.snapIT.morningChallenges;

public class Overloading {


    public static void addNumber(){
        System.out.println(1+1);
    }

    public static void addNumber(int num1) {
        System.out.println(num1 + 2);
    }

    public static void addNumber(String num1) {
        System.out.println(num1 + 2);
    }

    public static void main(String[] args) {
        addNumber();
        addNumber(3);
        addNumber("4");
    }
}
