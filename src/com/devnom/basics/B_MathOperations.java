package com.devnom.basics;


public class B_MathOperations {
    public static void main(String[] args) {
        // This program illustrates that you can perform Math Operations
        System.out.println(4 + 5);
        System.out.println(4 * 5);
        System.out.println(4 / 5);
        System.out.println(9 / 2);
        System.out.println(9 / 2.0);

        // Math with variables
        // The following program that takes two integers and adds them together
        int a = 5;
        int b = 10;

        System.out.println("Your variables a: " + a + "\nYour variable b " + b + "\n" +
                "The Sum of your two variables is: " + (a + b));

        // Order of Operations
        // PEMDAS - (), **, *, /, +, -
        System.out.println("3 * 3 - 5 /2 = " + (3 * 3 - 5 /2));
        System.out.println("3 * (3 - 5) /2 = " + (3 * (3 - 5) /2));
    }
}
