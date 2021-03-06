package com.snapIT.a_basics.d_controlFlow;

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
//        for (int i = 1; i <= 15; i += 2){
//            for (int k = 0; k < (7 - i / 2); k++) {
//                System.out.print( " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// *********************************************************

//        String [] arr = { "Lester", "Carmella", "Doris", "Christina", "Marisha", "Jobe" };
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        // for-each Loops
//        // These are an advanced version of for loops
//        // The above is a simple for Loop
//
//      // The code below is a shorter for each loop:
//      // for (type item: array_or_collection) {
//            // Code to execute for each item in the array or collection
//      // }
//        int [] arrTwo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        for (int item : arrTwo) {
//            System.out.println(item);
//        }

//      // The Code below Squares each element in the array.
//        int [] anArrayToSquare = { 3, 1, 3, 9, 5, 81, 7, 8, 9, 10 };
//        for (int element : anArrayToSquare) {
//            int square = element * element;
//            System.out.println(square);
//        }
// *********************************************************

        // Exercise 10: Fibonacci Series
//        int i = 1, x = 0, y = 1, sum = 0;
//        while(i <= 10) {
//            System.out.print( x + " ");
//            sum = x + y;
//            x = y;
//            y = sum;
//            i++;
//        }
// *********************************************************
        // Activity 9
        // Pseudo Code
        // Create a numberOfBoxesShipped
        // Create a while loop that continues as we have at least 20 peaches.
        // In the loop remove 20 peaches from numberOfPeaches and increment numberOfBoxesShipped by 1
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of peaches picked: ");
        int numberOfPeaches = input.nextInt();
        input.nextLine();

        int numberOfBoxesShipped = 0;
        while (numberOfPeaches > 20) {
            numberOfPeaches -= 20; // numberOfPeaches = numberOfPeaches - 20;
            numberOfBoxesShipped++;
            System.out.println(numberOfBoxesShipped + " boxes shipped, " + numberOfPeaches + " remaining");

            System.out.println("Do you have anymore peaches. Enter 'Y' or 'N'");
            String answer = input.nextLine();

            if (answer.equals("Y")) {
                System.out.println("How many peaches are you adding");
                numberOfPeaches += input.nextInt();
                input.nextLine();
            } else
                continue;
        }



// *********************************************************
    }
}





