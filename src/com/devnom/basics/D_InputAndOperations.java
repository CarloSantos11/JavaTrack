package com.devnom.basics;

import java.io.IOException;
import java.util.Scanner;

public class D_InputAndOperations {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number one");
        int numberOne = scanner.nextInt();

        System.out.println("Enter a number two");
        int numberTwo = scanner.nextInt();

        System.out.println("The sum of the two digits entered is " + (numberOne + numberTwo));
    }
}
