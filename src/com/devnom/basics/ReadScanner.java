package com.devnom.basics;
import java.util.Scanner;

public class ReadScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne;
        int numTwo;

        System.out.println("Please enter an integer");
        numOne = sc.nextInt();
        System.out.println("Please enter another integer");
        numTwo = sc.nextInt();

//        System.out.println("Your output is : " + numOne + numTwo);
        System.out.printf("Your output is %f%n", numOne + numTwo);
    }
}
