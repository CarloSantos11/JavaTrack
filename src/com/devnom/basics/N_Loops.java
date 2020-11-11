package com.devnom.basics;

import java.util.Scanner;

public class N_Loops {
    public static void main(String[] args) {
// *****************************************************
//        // basic for loop counting to 10
//        for (int i = 1; i <= 10; i++ ) {
//            System.out.println(i);
//        }
//
//        // basic for loop counting down from 10
//        for (int i = 10; i >= 0; i-- ) {
//            System.out.println(i);
//        }
// *****************************************************
        // Activity 8
        // John the Peach grower. Java Fundamentals pg. 49
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("How many peaches did you pick??");
//        int peachesPicked = userInput.nextInt();
//        int peachesShipped = 0;
//
//            // counter; // condition; // increment value;
//        for(int i = 0; i < peachesPicked; i += 20) {
//            System.out.println("Shipped " + peachesShipped + " peaches so far.");
//            peachesShipped += 20;
//        }

// *********************************************************
        // Break statement
        // A way to break out of a loop
//        for (int i =0; i <= 9; i++){
//            if ( i == 5)
//                break;
//            System.out.println(i);
//        }

// *********************************************************
        // Continue statement
        // A way to skip an iteration of a loop
//        for (int i =0; i <= 9; i++){
//            if ( i == 5)
//                continue;
//            System.out.println(i);
//        }
// *********************************************************
        // Nested Loops Example
//        for (int i = 1; i <= 3; i++){
//           for (int j = 1; j <= 3; j++) {
//               System.out.print( i + "" + j);
//               System.out.print("\t");
//           }
//            System.out.println();
//        }
// *********************************************************
        // Making a box with a nested for loop
//        for (int i = 1; i <=6; i++){
//           for (int j = 1; j <= 6; j++) {
//               System.out.print( " * ");
//               System.out.print("\t");
//           }
//            System.out.println();
//        }
// *********************************************************
        // Making a triangle with a nested for loop
        for (int i = 1; i <= 15; i += 2){
            for (int k = 0; k < (7 - i / 2); k++) {
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// *********************************************************
    }
}




