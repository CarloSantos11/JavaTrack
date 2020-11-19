package com.snapIT.b_methods;

public class C_PassByValue {
    public static void main(String[] args) {
        int x = 7; // we initialize an integer called x with the value of 7

        go(x); // Method Call To Go
               // x is passed by value into the Go method
        System.out.println("This is x " + x);
    }

                  // In this example x which has a value of 7
                  // is passed into this method

    public static void go(int z) { // The Is The Method Definition

        z *= 3;   // Even though we multiply the argument by 3
                  // and reassign it to itself.
                  // This does not change the original x value
        System.out.println("This is z " + z);
    }
}
