package com.snapIT.c_objectOrientedProgramming;

public class A_Student {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean isPaidNextTuition() {
        return paidNextTuition;
    }

    public void setPaidNextTuition(boolean paidNextTuition) {
        this.paidNextTuition = paidNextTuition;
    }

    public boolean isProbation() {
        return probation;
    }

    public void setProbation(boolean probation) {
        this.probation = probation;
    }

    boolean probation;

    public A_Student (String name) {
        this.firstName = name;
    }

    // This method is necessary to copy the old array to a new array
    // or if being used for the first time, initializes the array and adds our course
    // Get the current arrays length
    // Create a new array with one extra space
    // Copy the old array into the new array
    public void addCourse(String courseName)
    {
        // this variables serves to specify the length of
        // our current course array
        int length;

        // This check is needed to see if courses are currently empty
        // If it is empty initialize the length
        // If there are no courses in our array assign a size of zero
        // Without initializing the array first we get an error
        // https://stackoverflow.com/questions/31957064/string-names-string0-is-this-valid/31957234
        if (courses == null){
            length = 0;
        } else {
            length = this.courses.length;
        }

        // create a new array of size n+1
        String[] updatedCourses = new String[length + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till length
        // then insert course at length + 1

        // this gets skipped the first time when length is zero
        for (int i = 0; i < length; i++) {
            updatedCourses[i] = courses[i];
        }

        // initialize or update `this` objects array of courses
        updatedCourses[length] = courseName;
        this.courses = updatedCourses;
    }

    private String firstName;
    private String lastName;
    private String [] courses;  // This would be better if we used an ArrayList. Ex in CompSciStudent
    private float gpa;
    private boolean paidNextTuition;

}
