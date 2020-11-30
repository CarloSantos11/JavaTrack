package com.snapIT.c_objectOrientedProgramming.fundamentals.DataStructuresAndSorting.arrays;

public class ArrayOfFruits {
    public static void main(String[] args) {
//        String[] arrayOfFruits = new String [10];
        String[] arrayOfFruits = {"apples", "oranges", "mangoes", "guava"};


        String[] arrayWithNewFruit = new String [arrayOfFruits.length + 1];


        System.out.println(arrayOfFruits[0]);

        for (int i = 0; i < arrayOfFruits.length; i++) {
            System.out.println(arrayOfFruits[i]);
        }


    }

}
