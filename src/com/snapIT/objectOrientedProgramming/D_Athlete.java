package com.snapIT.objectOrientedProgramming;

// This example was used along with the Tester
// Class to illustrate the purpose of getters and
// Setters

// FirstName            :String
// LastName             :String
// AcademicProbation    :boolean
// Year                 :String
// Sport                :String
// Classes              :Array

public class D_Athlete {
    private String firstName;
    private String lastName;
    private boolean academicProbation;
    private String sport;
    private String[] classes = new String [10];
    private int classCounter = 0;

    public int getClassCounter() {
        return classCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == ""){
            System.out.println("not valid");
        } else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAcademicProbation() {
        return academicProbation;
    }

    public void setAcademicProbation(boolean academicProbation) {
        this.academicProbation = academicProbation;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes[classCounter] = classes;
        classCounter++;
    }

    public void printInfo() {
        System.out.println(
                "Student: " + firstName + " " + lastName + "\n" +
                "Sport: " + sport + "\n" +
                "Academic Probation: " + academicProbation + "\n" +
                "Courses: "
                );
        formatCourses();
    }

    public void formatCourses() {
        for(int i = 0; i < classCounter; i++) {
            System.out.println("\t" + classes[i]);
        }
    }
}
