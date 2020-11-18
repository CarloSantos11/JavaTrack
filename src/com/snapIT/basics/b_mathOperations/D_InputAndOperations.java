package com.snapIT.basics.b_mathOperations;

import java.util.Scanner;

public class D_InputAndOperations {

    static Scanner scanner = new Scanner(System.in); // This allows us to grab more than one character at a time

    public static void main(String[] args) {
        System.out.println("Enter a number one");
        int numberOne = scanner.nextInt();

        System.out.println("Enter a number two");
        int numberTwo = scanner.nextInt();

        System.out.println("The sum of the two digits entered is " + (numberOne + numberTwo));

//        Scanner sc = new Scanner(System.in);
//        double numOne;
//        double numTwo;
//
//        System.out.println("Please enter an integer");
//        numOne = sc.nextDouble();
//        System.out.println("Please enter another integer");
//        numTwo = sc.nextDouble();
//
//        System.out.println("Your output is : " + numOne + numTwo);
//        System.out.printf("Your output is %.2f%n", numOne + numTwo);
    }
}
