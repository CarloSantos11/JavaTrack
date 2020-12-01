package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.arrays;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        int[] sample = { 2,4,7, 98, 12, 13, 9, 1};
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to find: ");
        int request = sc.nextInt();

        for (int num :
             sample) {
            if (num == request) {
                System.out.println("Match found");
                found = true;
                break;
            }
        }

        if ( !found) {
            System.out.println("No Match");
        }
    }
}
