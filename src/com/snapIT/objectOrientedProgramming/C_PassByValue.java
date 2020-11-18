package com.snapIT.objectOrientedProgramming;

public class C_PassByValue {
    public static void main(String[] args) {
        int x = 7;

        go(x); // Method Call

        System.out.println("THis is x " + x);
    }

    public static void go(int z) { // Method Definition
        z *= 3;
        System.out.println("This is z " + z);
    }
}
