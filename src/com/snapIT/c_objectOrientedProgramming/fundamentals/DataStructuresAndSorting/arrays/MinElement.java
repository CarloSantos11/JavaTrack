package com.snapIT.c_objectOrientedProgramming.fundamentals.DataStructuresAndSorting.arrays;

public class MinElement {
    public static void main(String[] args) {
        double[] collection = { 14, -3, 25, 9.9, -3.8, 39, 100, -93, 100};
        double min = 9000;

        for (double number : collection) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
