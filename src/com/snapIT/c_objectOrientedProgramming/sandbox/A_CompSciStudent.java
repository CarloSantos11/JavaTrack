package com.snapIT.c_objectOrientedProgramming.sandbox;

// An ArrayList is a more effective way to create dynamic lists
import java.util.ArrayList;

public class A_CompSciStudent extends A_Student {
    ArrayList<String> languages;

    public A_CompSciStudent (String name) {
        super(name);
        this.languages = new ArrayList<>();
    }
}


