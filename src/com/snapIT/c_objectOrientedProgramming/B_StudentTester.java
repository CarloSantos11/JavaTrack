package com.snapIT.c_objectOrientedProgramming;

public class B_StudentTester {
    public static void main(String[] args) {
        B_Student newStudent = new B_Student();
        B_Student newStudent_2 = new B_Student();

        newStudent.firstName = "Lester";
        newStudent.lastName = "Beason";
        newStudent.gpa = 5.0;
        newStudent.onProbation = false;
        newStudent.signUp("Comp Sci");
        newStudent.printInfo();

        newStudent_2.firstName = "Carlo";
        newStudent_2.lastName = "Santos";
        newStudent_2.gpa = 2.0;
        newStudent_2.onProbation = true;
        newStudent_2.signUp("Comp Sci");
        newStudent_2.printInfo();
    }
}
