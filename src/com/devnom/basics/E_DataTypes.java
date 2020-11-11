package com.devnom.basics;
// Intro to data types
// Primitive Types vs. Reference Types
// ----------------------------------

// Primitive
// ---------
//    byte
//    short
//    int
//    long
//    char
//    float
//    double
//    boolean

// Reference Types
// ---------------
// Objects

public class E_DataTypes {
    public static void main(String[] args) {

        boolean isSunk = false; // booleans are often used for flags. Determine whether to do something or not
        char singleCharacters = 'c'; // characters

        int myInt = 10; // integers are whole numbers
        double myDouble = 2.5;  // doubles are decimal values
        float myFloat =  31.8F; // floats are larger decimal values
        long myLong = 3582;     // longs are larger integers

        double doubleImpliedConversion = myInt; // An example of implicit conversion of an int to a double
        int integerImpliedConversion = (int)myDouble;  // An example of an explicit conversion of a double to an integer

        System.out.print(integerImpliedConversion);
    }
}
