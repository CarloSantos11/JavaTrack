package com.snapIT.c_objectOrientedProgramming;

import java.util.Scanner;

public class A_AdminDashboard {
    // create a new student
    // sign the student up for a new class
    // check all students

    static Scanner selection = new Scanner(System.in);

    static void menu() {
        System.out.println("Please Select From The Menu");
        System.out.println("1.Create a new Student.");
        System.out.println("2. Find a student.");
        // some other options

        int userSelection = selection.nextInt();
    }

    static void selection(int selectionNumber ) {
        // if 1 create student and add to a database
        // if 2 search for student in the databse
    }
}
