package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.arrays;

public class MinElement {
    public static void main(String[] args) {
        double[] collection = { 14, -3, 25, 9.9, -3.8, 39, 100, -93, 100};
        double min = collection[0];

        for (double number : collection) {
            if (min > number) { // checks to see if the current minimum is smaller than our next number
                min = number;   // if it is larger than the next number it means it is not the minimum
            }                   // the next number represents the new minimum so we reassign
        }
        System.out.println(min);
    }
}
