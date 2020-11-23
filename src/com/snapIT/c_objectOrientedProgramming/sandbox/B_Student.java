package com.snapIT.c_objectOrientedProgramming.sandbox;

public class B_Student {
    // Classes
    // polymorphism
    // inheritance
    // encapsulation
    // Reference type vs primitive type
    // methods

    // firstName
    // lastName
    // gpa
    // onProbation
    String firstName;
    String lastName;
    double gpa;
    String course;
    boolean onProbation;

    // signUpForCourse
    // Method Definition
    void signUp(String course) {
        if (onProbation == true)
        {
            System.out.println("Sorry you are not authorized to enroll yourself");
        } else {
            this.course = course;
        }
    }

    void printInfo() {
        System.out.println(
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Gpa: " + gpa + "\n" +
                "Course: " + course + "\n"
        );
    }
}
